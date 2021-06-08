package com.example.registration;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class RegistrationPhysiqueFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_registration_physique, container, false);
        // Inflate the layout for this fragment
        EditText age = (EditText) v.findViewById(R.id.registration_input_age);
        age.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "110")});

        EditText height = (EditText) v.findViewById(R.id.registration_input_height);
        height.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "230")});


        EditText weight = (EditText) v.findViewById(R.id.registration_input_weight);
        weight.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "200")});

        return v;
    }
}