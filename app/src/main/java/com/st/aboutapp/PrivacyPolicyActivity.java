package com.st.aboutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;

import android.widget.TextView;

public class PrivacyPolicyActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About");
        }

        TextView aboutText = findViewById(R.id.aboutText);
        aboutText.setText(R.string.privacy_policy);
    }

}
