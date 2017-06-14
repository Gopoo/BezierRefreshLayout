package com.group.bezierdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.flyingstudio.BezierScrollLayout;
import com.flyingstudio.OnScrollListener;

public class MainActivity extends AppCompatActivity {
    private BezierScrollLayout bezier;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bezier = (BezierScrollLayout) findViewById(R.id.bezier);

        //if users want to load something.
        bezier.setScrollListener(new OnScrollListener() {
            @Override
            public void onScroll() {
                //download something by Okhttp,Volley and so on.
            }
        });
        //if u download successfully or unsuccessfully.
        bezier.setRefreshing(false);
    }
}
