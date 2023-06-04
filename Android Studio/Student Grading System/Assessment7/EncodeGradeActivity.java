package com.example.assessment7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EncodeGradeActivity extends AppCompatActivity {

    private EditText lastNameEditText;
    private EditText firstNameEditText;
    private EditText attendanceEditText;
    private EditText quiz1EditText;
    private EditText quiz2EditText;
    private EditText quiz3EditText;
    private EditText quiz4EditText;
    private EditText examEditText;
    private Button submitButton;
    private Button menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encodegrade);
        setTitle("Grade Encoding");

        lastNameEditText = findViewById(R.id.lastNameEditTxt);
        firstNameEditText = findViewById(R.id.firstNameEditTxt);
        attendanceEditText = findViewById(R.id.attendanceEditTxt);
        quiz1EditText = findViewById(R.id.quiz1EditTxt);
        quiz2EditText = findViewById(R.id.quiz2EditTxt);
        quiz3EditText = findViewById(R.id.quiz3EditTxt);
        quiz4EditText = findViewById(R.id.quiz4EditTxt);
        examEditText = findViewById(R.id.examEditTxt);
        submitButton = findViewById(R.id.submitButton);
        menuButton = findViewById(R.id.menuButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                encodeGrade();
            }
        });

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMenu();
            }
        });
    }

    private void encodeGrade() {
        String lastName = lastNameEditText.getText().toString().trim();
        String firstName = firstNameEditText.getText().toString().trim();
        String attendanceStr = attendanceEditText.getText().toString().trim();
        String quiz1Str = quiz1EditText.getText().toString().trim();
        String quiz2Str = quiz2EditText.getText().toString().trim();
        String quiz3Str = quiz3EditText.getText().toString().trim();
        String quiz4Str = quiz4EditText.getText().toString().trim();
        String examStr = examEditText.getText().toString().trim();

        if (lastName.isEmpty() || firstName.isEmpty() || attendanceStr.isEmpty() ||
                quiz1Str.isEmpty() || quiz2Str.isEmpty() || quiz3Str.isEmpty() ||
                quiz4Str.isEmpty() || examStr.isEmpty()) {
            Toast.makeText(this, "Please fill in all the required details to proceed.", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            int attendance = Integer.parseInt(attendanceStr);
            int quiz1 = Integer.parseInt(quiz1Str);
            int quiz2 = Integer.parseInt(quiz2Str);
            int quiz3 = Integer.parseInt(quiz3Str);
            int quiz4 = Integer.parseInt(quiz4Str);
            int exam = Integer.parseInt(examStr);

            if (attendance < 1 || attendance > 100 || quiz1 < 1 || quiz1 > 100 ||
                    quiz2 < 1 || quiz2 > 100 || quiz3 < 1 || quiz3 > 100 ||
                    quiz4 < 1 || quiz4 > 100 || exam < 1 || exam > 100) {
                Toast.makeText(this, " Invalid input. Please enter values between 1 and 100 for Attendance, Quizzes, and Examination.", Toast.LENGTH_SHORT).show();
                return;
            }

            // Calculate average, status, and remarks
            double average = (attendance * 0.2) + ((quiz1 + quiz2 + quiz3 + quiz4) * 0.3 / 4) + (exam * 0.5);
            String status = (average >= 60) ? "Passed" : "Failed";
            String remarks;
            if (average >= 96) {
                remarks = "4.00";
            } else if (average >= 90) {
                remarks = "3.50";
            } else if (average >= 84) {
                remarks = "3.00";
            } else if (average >= 78) {
                remarks = "2.50";
            } else if (average >= 72) {
                remarks = "2.00";
            } else if (average >= 66) {
                remarks = "1.50";
            } else if (average >= 60) {
                remarks = "1.00";
            } else {
                remarks = "INC";
            }

            // Start Grade_ViewActivity and pass the data using Intent extras
            Intent intent = new Intent(this, ViewGradeActivity.class);
            intent.putExtra("lastName", lastName);
            intent.putExtra("firstName", firstName);
            intent.putExtra("attendance", attendance);
            intent.putExtra("quiz1", quiz1);
            intent.putExtra("quiz2", quiz2);
            intent.putExtra("quiz3", quiz3);
            intent.putExtra("quiz4", quiz4);
            intent.putExtra("exam", exam);
            intent.putExtra("average", average);
            intent.putExtra("status", status);
            intent.putExtra("remarks", remarks);
            startActivity(intent);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Please enter valid integer values.", Toast.LENGTH_SHORT).show();
        }
    }

    private void goToMenu() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}