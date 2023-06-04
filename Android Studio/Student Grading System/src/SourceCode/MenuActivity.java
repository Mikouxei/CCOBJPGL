package com.example.assessment7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    Button encodeInfoButton;
    Button encodeGradeButton;
    Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Menu Activity");

        encodeInfoButton = findViewById(R.id.encodeInfoButton);
        encodeGradeButton = findViewById(R.id.encodeGradeButton);
        logoutButton = findViewById(R.id.logoutButton);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Logout Successful", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Clear all previous activities
                startActivity(intent);
                finish();
            }
        });

        encodeInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, EncodeInfoActivity.class);
                startActivity(intent);
            }
        });

        encodeGradeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, EncodeGradeActivity.class);
                startActivity(intent);
            }
        });
    }
}