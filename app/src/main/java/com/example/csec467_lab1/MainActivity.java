package com.example.csec467_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.LaunchSecond);
        button.setOnClickListener(view -> secondLaunchClick());
    }

    public void secondLaunchClick() {
        Intent intent = new Intent(this, DisplayMessageActivity.class); // Make the intent for new activity, Activity is DeisplayMessageActivity Class
        EditText editText = (EditText) findViewById(R.id.textInput);    // Get the text from the edittext
        String message = editText.getText().toString(); // Convert the edit text text field to a string
        intent.putExtra("MESSAGE", message);    // Attach the string from textInput to the new activity
        startActivity(intent);  // Create the actual activity based off the intent
    }
}