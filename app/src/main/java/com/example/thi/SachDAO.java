package com.example.thi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class SachDAO {
    private SQLiteDatabase sqLiteDB;
    private DatabaseHelper dbHelper;
    private Context context;
    public SachDAO(Context context){
        this.context = context;
        dbHelper = new DatabaseHelper(context);
        sqLiteDB = dbHelper.getWritableDatabase();
    }
    public  boolean insertSach(Sach objsach){
        try {
            ContentValues values = new ContentValues();
            values.put("SKU", objsach.getSKU());
            values.put("tacGia", objsach.getTacGia());
            values.put("ngayXuatBan", objsach.getNgayXuatBan());
            values.put("soTrang", objsach.getSoTrang());
            values.put("gia", objsach.getGia());
            values.put("gioiThieu",objsach.getGioiThieuSach());
            long numInsert = sqLiteDB.insert("Sach", null, values);
            if (numInsert<= 0)
                return false;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
        return true;

    }
    public List<Sach> getAllSach() {
        List<Sach> danhSachSach = new ArrayList<>();
        String sqlSelect = "select SKU, tacGia, ngayXuatBan, soTrang, gia, gioiThieu from LoaiChi";
        Cursor cursor = sqLiteDB.rawQuery(sqlSelect, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String SKU = cursor.getString(0);
            String tacGia = cursor.getString(1);
            String ngayXuatBan = cursor.getString(2);
            String soTrang = cursor.getString(3);
            String gia = cursor.getString(4);
            String gioiThieuSach = cursor.getString(5);
            Sach objSach = new Sach(SKU, tacGia, ngayXuatBan, soTrang, gia, gioiThieuSach);
            danhSachSach.add(objSach);
            cursor.moveToNext();
        }
        return danhSachSach;
    }
}
