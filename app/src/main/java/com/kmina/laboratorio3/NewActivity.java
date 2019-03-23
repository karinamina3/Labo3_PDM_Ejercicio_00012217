package com.kmina.laboratorio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import com.kmina.laboratorio3.utils.AppConstants;

public class NewActivity extends AppCompatActivity {
    private TextView mText;
    private ImageButton buttonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mText = findViewById(R.id.tv_message);
        buttonShare = findViewById(R.id.btn_share);

        Intent mIntent = this.getIntent();
        if (mIntent != null) {
            mText.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        }

        buttonShare.setOnClickListener(v -> {
            Intent mIntentShare = new Intent();
            mIntentShare.setAction(Intent.ACTION_SEND);
            mIntentShare.setType("text/plain");
            mIntentShare.putExtra(Intent.EXTRA_TEXT, mText.getText());
            startActivity(mIntentShare);
        });
    }
}