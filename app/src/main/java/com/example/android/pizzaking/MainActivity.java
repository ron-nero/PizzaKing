package com.example.android.pizzaking;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "doridrobot.ttf");
        TextView myTextview = (TextView) findViewById(R.id.slogan);
        myTextview.setTypeface(myTypeface);
    }
}
