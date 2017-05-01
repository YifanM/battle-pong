package com.example.yifan.battlepong;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
