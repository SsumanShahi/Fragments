package com.suman.fragments.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.suman.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private Button btnarea;
    private EditText txnum;
    private TextView tvarea;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        btnarea = view.findViewById(R.id.btnarea);
        txnum = view.findViewById(R.id.txnum);
        tvarea = view.findViewById(R.id.tvarea);


        btnarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(txnum.getText().toString());
                int area = (22/7) * num * num;

                tvarea.setText("Area of circle is: " + Integer.toString(area));

                Toast.makeText(getActivity(), "Area is:" + area, Toast.LENGTH_LONG).show();

            }
        });

        return view;
    }

}
