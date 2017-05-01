package com.example.yifan.battlepong;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String intentExtraName = "mode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface ralewayThin = Typeface.createFromAsset(getAssets(), "fonts/Raleway-Thin.ttf");
        Typeface raleway = Typeface.createFromAsset(getAssets(), "fonts/Raleway-Regular.ttf");
        TextView titleTextView = (TextView)findViewById(R.id.title);
        TextView[] menuOptions = {(TextView)findViewById(R.id.singlePlayer), (TextView)findViewById(R.id.twoPlayer), (TextView)findViewById(R.id.about)};
        titleTextView.setTypeface(ralewayThin);
        for (TextView textItem : menuOptions) {
            textItem.setTypeface(raleway);
        }
    }

    public void startOnePlayer(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra(intentExtraName, "one");
        startActivity(intent);
    }

    public void startTwoPlayer(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra(intentExtraName, "two");
        startActivity(intent);
    }

}
