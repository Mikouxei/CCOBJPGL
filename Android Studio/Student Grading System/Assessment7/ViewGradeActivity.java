package com.example.assessment7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewGradeActivity extends AppCompatActivity {

    private TextView lastNameTextView;
    private TextView firstNameTextView;
    private TextView attendanceTextView;
    private TextView quiz1TextView;
    private TextView quiz2TextView;
    private TextView quiz3TextView;
    private TextView quiz4TextView;
    private TextView examTextView;
    private TextView averageTextView;
    private TextView statusTextView;
    private TextView remarksTextView;
    private Button menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewgrade);
        setTitle("Grade View");

        lastNameTextView = findViewById(R.id.lastNameTxtView);
        firstNameTextView = findViewById(R.id.firstNameTxtView);
        attendanceTextView = findViewById(R.id.attendanceTxtView);
        quiz1TextView = findViewById(R.id.quiz1TxtView);
        quiz2TextView = findViewById(R.id.quiz2TxtView);
        quiz3TextView = findViewById(R.id.quiz3TxtView);
        quiz4TextView = findViewById(R.id.quiz4TxtView);
        examTextView = findViewById(R.id.examTxtView);
        averageTextView = findViewById(R.id.averageTxtView);
        statusTextView = findViewById(R.id.statusTxtView);
        remarksTextView = findViewById(R.id.remarksTxtView);
        menuButton = findViewById(R.id.menuButton);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String lastName = extras.getString("lastName");
            String firstName = extras.getString("firstName");
            int attendance = extras.getInt("attendance");
            int quiz1 = extras.getInt("quiz1");
            int quiz2 = extras.getInt("quiz2");
            int quiz3 = extras.getInt("quiz3");
            int quiz4 = extras.getInt("quiz4");
            int exam = extras.getInt("exam");
            double average = extras.getDouble("average");
            String status = extras.getString("status");
            String remarks = extras.getString("remarks");

            lastNameTextView.setText("   Last Name: " + lastName);
            firstNameTextView.setText("   First Name: " + firstName);
            attendanceTextView.setText(String.valueOf("   Attendance: " + attendance));
            quiz1TextView.setText(String.valueOf("   Quiz #1: " + quiz1));
            quiz2TextView.setText(String.valueOf("   Quiz #2: " + quiz2));
            quiz3TextView.setText(String.valueOf("   Quiz #3: " + quiz3));
            quiz4TextView.setText(String.valueOf("   Quiz #4: " + quiz4));
            examTextView.setText(String.valueOf("   Exam: " + exam));
            averageTextView.setText(String.format("   Average: " + "%.2f", average));
            statusTextView.setText("   Status: " + status);
            remarksTextView.setText("   Remarks: " + remarks);
        }
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewGradeActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}