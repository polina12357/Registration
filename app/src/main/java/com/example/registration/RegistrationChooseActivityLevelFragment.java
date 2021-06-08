package com.example.registration;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.preference.PreferenceManager;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.jetbrains.annotations.NotNull;

public class RegistrationChooseActivityLevelFragment extends Fragment {

    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;
    private Button saveButton;
    private FragmentActivity context;
    private String username;
    private boolean isMale;
    private short height;
    private short weight;
    private TextInputEditText usernameInput;
    private TextInputEditText heightInput;
    private TextInputEditText weightInput;
    private TextInputEditText birthdayInput;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registration_choose_activity_level, container, false);
    }

    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /*sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sharedPref.edit();
        setupInputs(view);
        isMale = sharedPref.getBoolean(getString(R.string.genderKey), true);

        saveButton = view.findViewById(R.id.results_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putBoolean(getString(R.string.genderKey), true).
                        putString(getString(R.string.usernameKey), usernameInput.getText().toString())
                        .putInt(getString(R.string.heightKey), Integer.parseInt(heightInput.getText().toString()))
                        .putInt(getString(R.string.weightKey), Integer.parseInt(weightInput.getText().toString()))
                        .putString(getString(R.string.birthdayKey), birthdayInput.getText().toString())
                        .apply();
                Toast.makeText(context, getString(R.string.settings_changed), Toast.LENGTH_SHORT).show();
            }
        });*/

    }

    private void setupInputs(View view) {
        /*username = sharedPref.getString(getString(R.string.usernameKey), "");
        height = (short) sharedPref.getInt(getString(R.string.heightKey), 0);
        weight = (short) sharedPref.getInt(getString(R.string.weightKey), 0);
        //Filling in the fields
        usernameInput = (TextInputEditText) view.findViewById(R.id.input_name_layout);
        heightInput = (TextInputEditText) view.findViewById(R.id.registration_input_height);
        weightInput = (TextInputEditText) view.findViewById(R.id.registration_input_weight);
        if (username.length() > 0)
            usernameInput.setText(username);
        if (height > 0)
            heightInput.setText(String.valueOf(height));
        if (weight > 0)
            weightInput.setText(String.valueOf(weight));

        //Birthday input setup
        birthdayInput = (TextInputEditText) view.findViewById(R.id.registration_input_age);
        birthdayInput.setInputType(InputType.TYPE_NULL);
*/
    }

}