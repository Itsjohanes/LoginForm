package com.mobileprogramming.loginformtest.Activity;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.mobileprogramming.loginformtest.R;
import com.mobileprogramming.loginformtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    private Button btnLogin, btnSignUp;

    private static SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);

        preferences = getSharedPreferences("LOGIN_DETAILS", MODE_PRIVATE);


        if(preferences.contains("username") && preferences.contains("username") ){

            Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
            intent.putExtra("username", preferences.getString("username","" ));
            startActivity(intent);

        }


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }

    public static void saveStudentPreferences(String username, String password){

        SharedPreferences.Editor editor = preferences.edit();

        editor.putString("username", username);
        editor.putString("username", password);

        editor.commit();

    }

    public static void clearStudentPref(){

        preferences.edit().remove("username").commit();
        preferences.edit().remove("username").commit();

    }
}