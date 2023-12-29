package com.st.aboutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class AboutActivity extends AppCompatActivity {

    LinearLayout llHelp, llprivacyPolicy;

    Button privacypolicyBtutton, desclaimerButton,githubButton;
//    btn = (Button)findViewById(R.id.firstButton);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        privacypolicyBtutton = findViewById(R.id.privacypolicyBtutton);

        desclaimerButton = findViewById(R.id.desclaimerButton);

        githubButton = findViewById(R.id.githubButton);


        privacypolicyBtutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                privacypolicy();
            }
        });

        desclaimerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desclaimer();
            }

        });

        githubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                githubOpen();
            }

        });


    }

    public void privacypolicy() {
        Intent intent = new Intent(this, PrivacyPolicyActivity.class);
        startActivity(intent);
    }

    public void desclaimer() {
        Intent intent = new Intent(this, DisclaimerActivity.class);
        startActivity(intent);
    }

    public void githubOpen() {
        Intent intent = new Intent(this, GithubActivity.class);
        startActivity(intent);
    }


}