package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * This activity is accessed by the Intent object in MainActivity (see sendMessage() in that class)
 */
public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //Get the intent that led to (started) this activity and get the string (message) from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Get the text view and set the message
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

    }
}