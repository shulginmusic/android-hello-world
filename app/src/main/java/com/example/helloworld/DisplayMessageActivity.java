package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * This activity is accessed by the Intent object in MainActivity (see sendMessage() in that class)
 */
public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }
}