package com.example.androidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        TextView jokeText = findViewById(R.id.tv_joke);
        Intent intent = getIntent();
        jokeText.setText(intent.getStringExtra("JOKE"));

    }
}
