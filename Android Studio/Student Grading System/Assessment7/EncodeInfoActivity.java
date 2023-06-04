package com.example.assessment7;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;

public class EncodeInfoActivity extends AppCompatActivity {

    private EditText lastNameEditText, firstNameEditText, courseEditText, yearEditText, emailAddressEditText,
            contactNumberEditText, birthYearEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encodeinfo);
        setTitle("Student Information");

        lastNameEditText = findViewById(R.id.lastname);
        firstNameEditText = findViewById(R.id.firstname);
        courseEditText = findViewById(R.id.course);
        yearEditText = findViewById(R.id.year);
        emailAddressEditText = findViewById(R.id.emailaddress);
        contactNumberEditText = findViewById(R.id.contactnumber);
        birthYearEditText = findViewById(R.id.birthyear);

        Button submitButton = findViewById(R.id.submitButton);
        Button menuButton = findViewById(R.id.menuButton);

        submitButton.setOnClickListener(view -> {
            String lastName = lastNameEditText.getText().toString();
            String firstName = firstNameEditText.getText().toString();
            String course = courseEditText.getText().toString();
            String year = yearEditText.getText().toString();
            String emailAddress = emailAddressEditText.getText().toString();
            String contactNumber = contactNumberEditText.getText().toString();
            String birthYear = birthYearEditText.getText().toString();

            if (TextUtils.isEmpty(lastName) || TextUtils.isEmpty(firstName) || TextUtils.isEmpty(course) ||
                    TextUtils.isEmpty(year) || TextUtils.isEmpty(emailAddress) ||
                    TextUtils.isEmpty(contactNumber) || TextUtils.isEmpty(birthYear)) {
                Toast.makeText(getApplicationContext(), "\"Please fill in all the required details to proceed.\"", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches()) {
                Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
                return;
            }

            String encodedInfo = encodeStudentInfo(lastName, firstName, course, year, emailAddress, contactNumber, birthYear);
            if (encodedInfo != null) {
                Intent intent = new Intent(EncodeInfoActivity.this, ViewInfoActivity.class);
                intent.putExtra("encodedInfo", encodedInfo);
                intent.putExtra("lastName", lastName);
                intent.putExtra("firstName", firstName);
                intent.putExtra("course", course);
                intent.putExtra("year", Integer.parseInt(year));
                intent.putExtra("emailAddress", emailAddress);
                intent.putExtra("contactNumber", contactNumber);
                intent.putExtra("birthYear", Integer.parseInt(birthYear));
                startActivity(intent);
            }
        });

        menuButton.setOnClickListener(view -> {
            Intent intent = new Intent(EncodeInfoActivity.this, MenuActivity.class);
            startActivity(intent);
        });
    }

    private String encodeStudentInfo(String lastName, String firstName, String course, String year,
                                     String emailAddress, String contactNumber, String birthYear) {
        String studentInfo = lastName + firstName + course + year + emailAddress + contactNumber + birthYear;
        return Base64.encodeToString(studentInfo.getBytes(), Base64.DEFAULT);
    }
}