package com.example.topquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private TextView mGameText;
    private Button mAnswer1;
    private Button mAnswer2;
    private Button mAnswer3;
    private Button mAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
                mGameText= findViewById(R.id.activity_game_question_text);
                mAnswer1= findViewById(R.id.activity_game_answer1_btn);
                mAnswer2= findViewById(R.id.activity_game_answer2_btn);
                mAnswer3= findViewById(R.id.activity_game_answer3_btn);
                mAnswer4= findViewById(R.id.activity_game_answer4_btn);

                mAnswer1.setEnabled(false);
                mAnswer2.setEnabled(false);
                mAnswer3.setEnabled(false);
                mAnswer4.setEnabled(false);


    }


}
