package com.jaredlam.bubbleview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;

/**
 * Created by Jared Luo on 15/10/25.
 */
public class MainActivity extends Activity {

    private static String[] labels = {"Hello Bubble", "This is bubble view", "Android", "Github", "Jared", "Bubble with different size", "Yo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BubbleLayout layout = (BubbleLayout) findViewById(R.id.bubble_layout);
        for (String label : labels) {
            BubbleView bubbleView = new BubbleView(this);
            bubbleView.setText(label);
            bubbleView.setGravity(Gravity.CENTER);
            bubbleView.setPadding(10, 10, 10, 10);
            bubbleView.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
            layout.addViewSortByWidth(bubbleView);
        }

    }
}