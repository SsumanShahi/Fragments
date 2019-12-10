package com.suman.fragments.fragment;


import android.content.Intent;
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
public class FirstFragment extends Fragment implements View.OnClickListener {

    private Button btncal;
    private EditText txfirst,txsecond;
    private TextView tvsum;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        txfirst = view.findViewById(R.id.txfirst);
        txsecond = view.findViewById(R.id.txsecond);
        tvsum = view.findViewById(R.id.tvsum);
        btncal = view.findViewById(R.id.btncal);

        btncal.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int first = Integer.parseInt(txfirst.getText().toString());
        int second = Integer.parseInt(txsecond.getText().toString());
        int result = first + second;

        tvsum.setText("Sum is :" + Integer.toString(result));

        Toast.makeText(getActivity(), "Sum is: "+ result, Toast.LENGTH_LONG).show();

    }
}
