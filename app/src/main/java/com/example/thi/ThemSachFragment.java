package com.example.thi;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThemSachFragment extends Fragment {
private SachDAO sachDAO;

    public ThemSachFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        sachDAO = new SachDAO(getActivity());
View view = inflater.inflate(R.layout.them_sach_fragment, container, false);
        Button btnAdd = view.findViewById(R.id.btnAdd);
        final EditText txtSKU = view.findViewById(R.id.txtSKU);
        final EditText txtTacGia = view.findViewById(R.id.txtTacGia);
        final EditText txtNgayXuatBan = view.findViewById(R.id.txtNgayXuatBan);
        final EditText txtSoTrang = view.findViewById(R.id.txtSoTrang);
        final EditText txtGia = view.findViewById(R.id.txtGia);
        final EditText txtGioiThieu = view.findViewById(R.id.txtGioiThieu);

        Sach objSach = new Sach();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String SKU =txtSKU.getText().toString();
                String tacGia =txtTacGia.getText().toString();

                String ngayXuatBan =txtNgayXuatBan.getText().toString();

                String soTrang =txtSoTrang.getText().toString();

                String gia =txtGia.getText().toString();

                String gioiThieu =txtGioiThieu.getText().toString();
               Sach objSach =  new Sach(SKU, tacGia, ngayXuatBan, soTrang, gia, gioiThieu);
               boolean isSuccess = sachDAO.insertSach(objSach);
               if (isSuccess){
                   Toast.makeText(getActivity(), "Thêm thành công", Toast.LENGTH_SHORT).show();

               }
               else {
                   Toast.makeText(getActivity(), "Thêm thất bại", Toast.LENGTH_SHORT).show();

               }
            }
        });




        return view;
    }

}
