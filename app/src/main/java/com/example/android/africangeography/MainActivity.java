package com.example.android.africangeography;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * This is a Quiz app called African Geography.
 * You answer a series of questions and the result is displayed as a toast when you click the submit button
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method takes the user to the QuizActivity to begin quiz
     */
    public void begin_quiz(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    /**
     * This method closes the current Activity, thereby closing the App
     */
    public void quit_quiz(View view) {
        finish();
    }
}
