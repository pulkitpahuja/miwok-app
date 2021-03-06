package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "तुम कहाँ जा रहे हो?"));
        words.add(new Word("What is your name?", "आपका नाम क्या है?"));
        words.add(new Word("My name is...", "मेरा नाम____है"));
        words.add(new Word("How are you feeling?", "आप कैसा महसूस कर रहे हैं?"));
        words.add(new Word("I’m feeling good.", "मैं अच्छा महसूस कर रहा हूँ।"));
        words.add(new Word("Are you coming?", "क्या तुम आ रहे हो?"));
        words.add(new Word("Yes, I’m coming.", "हाँ, आ रहा हूं।"));
        words.add(new Word("I’m coming.", "मैं आ रहा हूँ।"));
        words.add(new Word("Let’s go.", "चलिए चलते हैं।"));
        words.add(new Word("Come here.", "यहाँ आओ।"));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
