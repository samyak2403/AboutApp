package com.st.aboutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button about_Button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view by id
        about_Button = findViewById(R.id.about_Button);

        about_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aboutActivity();
            }
        });



    }

    public void aboutActivity() {
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
    }
}