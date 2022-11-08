package com.mobileprogramming.loginformtest.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.mobileprogramming.loginformtest.Model.Account;
import com.mobileprogramming.loginformtest.Model.GetAccount;
import com.mobileprogramming.loginformtest.R;
import com.mobileprogramming.loginformtest.Rest.ApiClient;
import com.mobileprogramming.loginformtest.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUser, edtPassword;
    private Button btnLogin;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUser = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtUserPassword);
        btnLogin = findViewById(R.id.btnUserLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifyStudent();
            }
        });
    }
    private void verifyStudent() {

        String username  = edtUser.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();
        //Server Call
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<GetAccount> HerosCall = mApiInterface.getakun("login_pasien",username,password);
        final String finalPassword = password;

        HerosCall.enqueue(new Callback<GetAccount>() {
            @Override
            public void onResponse(Call<GetAccount> call, Response<GetAccount>
                    response) {
                List<Account> notesList = response.body().getListDataNotes();

                if(notesList.size() > 0){
                    String username = notesList.get(0).getUsername();
                    Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                }

            }
            //ketika login gagal
            @Override
            public void onFailure(Call<GetAccount> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });

    }

    public void onBackPressed(){

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);

    }
}