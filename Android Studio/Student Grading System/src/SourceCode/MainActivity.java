package com.example.assessment7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredUsername = username.getText().toString();
                String enteredPassword = password.getText().toString();

                try {
                    if (TextUtils.isEmpty(enteredUsername) || TextUtils.isEmpty(enteredPassword)) {
                        throw new IllegalArgumentException("Username or password cannot be empty. Please enter valid credentials.");
                    }

                    if (enteredUsername.equals("user") && enteredPassword.equals("1234")) {
                        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    } else {
                        throw new IllegalArgumentException("Invalid username or password. Please try again.");
                    }
                } catch (IllegalArgumentException e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
