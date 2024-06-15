package com.example.flashcard;// MainActivity.java

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flashcard.CreateFlashcardActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createFlashcardsButton = findViewById(R.id.createFlashcardsButton);
        Button myFlashcardsButton = findViewById(R.id.myFlashcardsButton);

        createFlashcardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateFlashcardActivity.class);
                startActivity(intent);
            }
        });

        myFlashcardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyFlashcardsActivity.class);
                startActivity(intent);
            }
        });
    }
}
