package com.kmina.laboratorio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.kmina.laboratorio3.utils.AppConstants;

public class MainActivity extends AppCompatActivity {
    private Button buttonSend;
    private EditText userET, passET, emailET, genderET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSend = findViewById(R.id.btn_send);
        userET = findViewById(R.id.et_username);
        passET = findViewById(R.id.et_password);
        emailET = findViewById(R.id.et_email);
        genderET = findViewById(R.id.et_gender);

        buttonSend.setOnClickListener(v -> {
            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, "Username: " + userET.getText() + "\n"
                                                        + "Password: " + passET.getText() + "\n"
                                                        + "Email: " + emailET.getText() + "\n"
                                                        + "Gender: " + genderET.getText());
            startActivity(mIntent);
        });
    }
}