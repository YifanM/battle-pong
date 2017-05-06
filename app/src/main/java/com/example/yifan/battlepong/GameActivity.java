package com.example.yifan.battlepong;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import objects.GameObject;

public class GameActivity extends AppCompatActivity {
    private float p1X = 0; // todo, initialize x to centre
    private float p1Y = 0;
    private View paddle1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent intent = getIntent();
        String mode = intent.getStringExtra(MainActivity.intentExtraName);
        if (mode.equals("one")) {
            RelativeLayout player1 = (RelativeLayout)findViewById(R.id.player1Touch);
            paddle1 = findViewById(R.id.paddle1);
            player1.setOnTouchListener(new View.OnTouchListener() {
                @Override // todo dont allow x to reassign of touch event moved outside of player1's area
                public boolean onTouch(View v, MotionEvent event) {
                    p1X = event.getX() - 25; // 25 is hardcoded half of paddle width, make sure paddle is centred
                    p1Y = event.getY();
                    return false;
                }
            });
            GameObject temp = new GameObject("player", "black", "rect", 0, 0, 50, 20);
            new Timer().scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    gameLoopOne();
                }
            }, 0, (1000/60));
        } else if (mode.equals("two")) {

        }
    }

    private void gameLoopOne() {
        //will want to switch to an ImageView later for the game objects?
        paddle1.setX(p1X);
    }

    private void gameLoopTwo() {

    }

}
