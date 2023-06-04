package com.example.assessment7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class ViewInfoActivity extends AppCompatActivity {

    private TextView lastNameTextView;
    private TextView firstNameTextView;
    private TextView courseTextView;
    private TextView yearTextView;
    private TextView emailAddressTextView;
    private TextView contactNumberTextView;
    private TextView birthYearTextView;
    private TextView ageTextView;
    private Button menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewinfo);
        setTitle("Information View");

        lastNameTextView = findViewById(R.id.lastnametxtview);
        firstNameTextView = findViewById(R.id.firstnametxtview);
        courseTextView = findViewById(R.id.coursetxtview);
        yearTextView = findViewById(R.id.yeartxtview);
        emailAddressTextView = findViewById(R.id.emailaddresstxtview);
        contactNumberTextView = findViewById(R.id.contactnumbertxtview);
        birthYearTextView = findViewById(R.id.birthyeartxtview);
        ageTextView = findViewById(R.id.agetxtview);
        menuButton = findViewById(R.id.menuButton);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String lastName = extras.getString("lastName");
            String firstName = extras.getString("firstName");
            String course = extras.getString("course");
            int year = extras.getInt("year");
            String emailAddress = extras.getString("emailAddress");
            String contactNumber = extras.getString("contactNumber");
            int birthYear = extras.getInt("birthYear");

            lastNameTextView.setText("   Last Name: " + lastName);
            firstNameTextView.setText("   First Name: " + firstName);
            courseTextView.setText("   Course: " + course);
            yearTextView.setText("   Year: " + year);
            emailAddressTextView.setText("   Email: " + emailAddress);
            contactNumberTextView.setText("   Contact Number: " + contactNumber);
            birthYearTextView.setText("   Birth Year: " + birthYear);

            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int age = currentYear - birthYear;
            ageTextView.setText("   Age: " + age);
        }

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewInfoActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}