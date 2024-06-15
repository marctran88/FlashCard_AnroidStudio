package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.flashcard.MainActivity;

public class CreateFlashcardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_flashcard);

        // Initialize EditText fields
        EditText titleEditText = findViewById(R.id.titleEditText);
        EditText subjectEditText = findViewById(R.id.subjectEditText);
        EditText descriptionEditText = findViewById(R.id.descriptionEditText);
        EditText languagesEditText = findViewById(R.id.languagesEditText);
        EditText frontEditText = findViewById(R.id.frontEditText);
        EditText backEditText = findViewById(R.id.backEditText);
        EditText hintEditText = findViewById(R.id.hintEditText);

        // Handle the Save button click to save the flashcard data
        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve user input from EditText fields
                String title = titleEditText.getText().toString();
                String subject = subjectEditText.getText().toString();
                String description = descriptionEditText.getText().toString();
                String languages = languagesEditText.getText().toString();
                String front = frontEditText.getText().toString();
                String back = backEditText.getText().toString();
                String hint = hintEditText.getText().toString();

                // TODO: Save the flashcard data to data storage

                // Return to MainActivity
                Intent intent = new Intent(CreateFlashcardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
