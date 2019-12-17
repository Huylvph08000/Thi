package com.example.thi;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DanhSachFragment extends Fragment {

private ListView lvSach;
private SachDAO sachDAO;
private List<Sach> dsSach;

    public DanhSachFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        sachDAO = new SachDAO(getActivity());
        dsSach = sachDAO.getAllSach();
        ArrayAdapter adapter = new ArrayAdapter(
                getActivity(),
                android.R.layout.simple_list_item_1,
                dsSach);View view = inflater.inflate(R.layout.danh_sach_fragment, container, false);
       lvSach = view.findViewById(R.id.lvSach);
       lvSach.setAdapter(adapter);

        return view;
    }

}
