package com.mobileprogramming.loginformtest.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mobileprogramming.loginformtest.R;

public class WelcomeActivity extends AppCompatActivity {

    private TextView txtUserName;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String username = getIntent().getExtras().getString("username");

        txtUserName = findViewById(R.id.txtUserName);
        btnLogout = findViewById(R.id.btnLogout);

        txtUserName.setText("Welcome " + username);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //preferences romevo

                MainActivity.clearStudentPref();

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}