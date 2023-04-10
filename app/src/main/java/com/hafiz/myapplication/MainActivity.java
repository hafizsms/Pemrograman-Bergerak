package com.hafiz.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView createAccount;
    Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        login();
    }
    public void signUp(){
        setContentView(R.layout.activity_register_relative);
        signUp = findViewById(R.id.btnSignUp);
        signUp.setOnClickListener(v-> login());
    }
    public void login(){
        setContentView(R.layout.activity_login);
        createAccount = findViewById(R.id.tvCreateAccount);
        createAccount.setOnClickListener(v-> signUp());
    }
}