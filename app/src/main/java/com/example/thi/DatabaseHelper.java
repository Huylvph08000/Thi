package com.example.thi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(@Nullable Context context) {
        super(context, "dbSach", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    String createTableSach = "create table Sach(SKU text primary key, tacGia text, ngayXuatBan text, soTrang text, gia text, gioiThieu text)";
    db.execSQL(createTableSach);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL("drop table if exists Sach");
onCreate(db);
    }
}
