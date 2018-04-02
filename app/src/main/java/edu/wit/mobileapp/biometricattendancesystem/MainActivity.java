package edu.wit.mobileapp.biometricattendancesystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button addStudent, captureAttendance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addStudent = findViewById(R.id.addStudent);//get id of button 1
        captureAttendance = findViewById(R.id.captureAttendance);//get id of button 2

        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Add Student", Toast.LENGTH_LONG).show();//display the text of button1
            }
        });
        captureAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Capture Attendance", Toast.LENGTH_LONG).show();//display the text of button2
            }
        });
    }
}
