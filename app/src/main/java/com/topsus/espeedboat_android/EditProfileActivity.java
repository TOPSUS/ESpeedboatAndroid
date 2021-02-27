package com.topsus.espeedboat_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class EditProfileActivity extends AppCompatActivity {
    private Spinner spJenisKelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        /*
         * BUAT SPINNER
         */
        spJenisKelamin = findViewById(R.id.spEditProfileJenisKelamin);
        String[] items = new String[]{"Laki - Laki", "Perempuan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_layout, items);
        spJenisKelamin.setAdapter(adapter);
    }
}