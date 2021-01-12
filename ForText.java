package com.example.proba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ForText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_for_text);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        TextView messageText = (TextView) findViewById(R.id.messageText);
        messageText.setText(message);

    }
}