package com.example.loginapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail, editTextPassword;
    private Button buttonLogin;

    // For demonstration purposes, let's use hardcoded credentials
    private static final String VALID_EMAIL = "user@example.com";
    private static final String VALID_PASSWORD = "password";

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.idEmail);
        editTextPassword = findViewById(R.id.idPass);
        buttonLogin = findViewById(R.id.btnId);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        // Check if email and password match the hardcoded credentials
        if (email.equals(VALID_EMAIL) && password.equals(VALID_PASSWORD)) {
            // Successful login
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            // You can navigate to another activity or perform desired actions here
        } else {
            // Failed login
            Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show();
        }
    }
}
