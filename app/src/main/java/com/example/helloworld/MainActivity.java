package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Extra message constant
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when user presses button
     * (See onClick attribute in activity_main: button view attributes)
     * @param view the view object argument
     */
    public void sendMessage(View view) {
        //Intent object that binds the two components during runtime. See args in constructor on the next line,
        //this is binded with DisplayMessageActivity.class
        Intent intent = new Intent(this, DisplayMessageActivity.class); //the class is the activity to start
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);//this is the text view
        String message = editText.getText().toString(); //get text as string
        intent.putExtra(EXTRA_MESSAGE, message); //Extra is a key-value pair
        startActivity(intent); //starts instance o f
    }


}