package com.example.yifan.battlepong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent intent = getIntent();
        String mode = intent.getStringExtra(MainActivity.intentExtraName);
        if (mode.equals("one")) {
            startGameLoopOne();
        } else if (mode.equals("two")) {
            startGameLoopTwo();
        }
        // temp
        TextView textView = (TextView)findViewById(R.id.modeTextView);
        textView.setText(mode);
    }

    private void startGameLoopOne() {

    }

    private void startGameLoopTwo() {

    }

}
