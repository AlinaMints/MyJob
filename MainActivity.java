package com.example.proba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String message2 = intent.getStringExtra("message1");
        TextView messageText = (TextView) findViewById(R.id.TextForToast);
        messageText.setText(message2);

    }

    public void BToast (View view) {
        EditText et = (EditText) findViewById(R.id.editTextNumber2);
        if (et.getText().length()==0){
            Intent intent = new Intent(this, MainActivity.class);
            String m = "Empty input";
            intent.putExtra("message1", m);
            startActivity(intent);
        }
        else{
        Intent intent = new Intent(this, MainActivity.class);
        String message1 = et.getText().toString();
        Long a,c;
        a = Long.parseLong(message1);
        c = a*2;
        message1 =Long.toString(c) ;
        intent.putExtra("message1", message1);
        startActivity(intent);}
    }

    public void BScreen (View view) {
        EditText et = (EditText) findViewById(R.id.editTextNumber2);
        if (et.getText().length()==0){
            Intent intent = new Intent(this, ForText.class);
            String m = "Empty input";
            intent.putExtra("message", m);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, ForText.class);
            String message = et.getText().toString();
            intent.putExtra("message", message);
            startActivity(intent);
        }
    }
}