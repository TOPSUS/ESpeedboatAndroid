package com.topsus.espeedboat_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    Button registerButton;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getWindow().setBackgroundDrawableResource(R.drawable.login_bk);

        mContext = this;
        registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MainMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}