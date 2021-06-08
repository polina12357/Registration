package com.example.registration;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

import org.jetbrains.annotations.NotNull;

public class RegistrationChooseGenderFragment extends Fragment {
    RadioButton femaleButton, maleButton;
    Boolean isMale;
    private FragmentActivity context;
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registration_choose_gender, container, false);
    }


    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sharedPref.edit();
*/
        isMale =true;
        femaleButton = view.findViewById(R.id.female_button);
        maleButton = view.findViewById(R.id.male_button);
        setupGenderButtons();

    }

    private void setupGenderButtons(){
        //Setting gender button
        RadioButton buttonToActivate;
        if(isMale)
            buttonToActivate = maleButton;
        else
            buttonToActivate = femaleButton;
        buttonToActivate.setChecked(true);
        buttonToActivate.setTextColor(Color.WHITE);

        maleButton.setOnClickListener(v -> {
            //editor.putBoolean(getString(R.string.genderKey), true).commit();
            maleButton.setTextColor(Color.WHITE);
            femaleButton.setTextColor(Color.BLACK);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                maleButton.setElevation(10);
                femaleButton.setElevation(0);
            }
        });
        femaleButton.setOnClickListener(v -> {
           // editor.putBoolean(getString(R.string.genderKey), false).commit();
            femaleButton.setTextColor(Color.WHITE);
            maleButton.setTextColor(Color.BLACK);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                femaleButton.setElevation(10);
                maleButton.setElevation(0);
            }
        });
    }
}