package com.mobileproto.lab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by evan on 9/15/13.
 */
public class NoteDetailActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);
        DatabaseHandler db = new DatabaseHandler(getApplicationContext());
        Intent intent = getIntent();

        String noteName = intent.getStringExtra("note");

        TextView title = (TextView) findViewById(R.id.noteTitle);
        TextView noteText = (TextView) findViewById(R.id.noteText);

        title.setText(noteName);
        String text = db.getNoteText(noteName);

        noteText.setText(text); //db.getNote(noteName).getNoteText()

    }
}
