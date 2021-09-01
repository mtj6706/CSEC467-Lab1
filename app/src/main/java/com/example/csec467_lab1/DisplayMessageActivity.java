package com.example.csec467_lab1;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();    // Get the intent that sparked the creation of this activity
        String message = intent.getStringExtra("MESSAGE");

        final Button view_text = findViewById(R.id.view_input);
        view_text.setOnClickListener(view -> displayToast(message));
    }

    public void displayToast(String message){
        makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}