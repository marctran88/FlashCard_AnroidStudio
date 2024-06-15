package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FlashcardDetailsActivity extends AppCompatActivity {

    private TextView flashcardTextView;
    private String flashcardTitle;
    private int displayState = 0; // 0: Front, 1: Hint, 2: Back

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard_details);

        flashcardTextView = findViewById(R.id.flashcardTextView);

        // Get the flashcard title from the intent
        flashcardTitle = getIntent().getStringExtra("flashcardTitle");

        // Initially, display the front of the card
        displayFront();

        // Set a click listener to toggle between front, hint, and back when tapped
        flashcardTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayState = (displayState + 1) % 3; // Cycle between 0, 1, and 2
                updateDisplay();
            }
        });
    }

    private void displayFront() {
        flashcardTextView.setText("Front of " + flashcardTitle);
    }

    private void displayHint() {
        flashcardTextView.setText("Hint of " + flashcardTitle);
    }

    private void displayBack() {
        flashcardTextView.setText("Back of " + flashcardTitle);
    }

    private void updateDisplay() {
        switch (displayState) {
            case 0:
                displayFront();
                break;
            case 1:
                displayHint();
                break;
            case 2:
                displayBack();
                break;
        }
    }
}
