package com.gaohonglin.day45_git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("tmd", "onCreate: "+"添加的第一个log");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("tmd", "onStart: "+"添加了一个方法");
    }
}
