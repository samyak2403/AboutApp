package com.st.aboutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisclaimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Disclaimer");
        }

        TextView disclaimerText = findViewById(R.id.disclaimerText);
        disclaimerText.setText(R.string.flashlight_disclaimer);
    }

}
