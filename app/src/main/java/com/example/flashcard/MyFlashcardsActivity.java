package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.flashcard.FlashcardDetailsActivity;

public class MyFlashcardsActivity extends AppCompatActivity {

    private ListView flashcardsListView;
    private String[] flashcardTitles; // Replace this with actual flashcard data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_flashcards);

        // Replace this with logic to retrieve flashcard data
        flashcardTitles = new String[]{"Flashcard 1", "Flashcard 2", "Flashcard 3"};

        flashcardsListView = findViewById(R.id.flashcardsListView);

        // Create an ArrayAdapter to display flashcard titles in the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, flashcardTitles);
        flashcardsListView.setAdapter(adapter);

        // Handle flashcard item click to view details
        flashcardsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedTitle = flashcardTitles[position];
                // Pass the selected flashcard title to the details activity
                Intent intent = new Intent(MyFlashcardsActivity.this, FlashcardDetailsActivity.class);
                intent.putExtra("flashcardTitle", selectedTitle);
                startActivity(intent);
            }
        });
    }
}
