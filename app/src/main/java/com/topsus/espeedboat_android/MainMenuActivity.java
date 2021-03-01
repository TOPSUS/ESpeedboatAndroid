package com.topsus.espeedboat_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    }

    public void speedboatList(View view) {
        Intent intent = new Intent(this, SpeedboatListActivity.class);
        startActivity(intent);
    }
}