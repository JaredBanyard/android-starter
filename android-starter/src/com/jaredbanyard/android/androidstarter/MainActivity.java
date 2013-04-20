package com.jaredbanyard.android.androidstarter;

import android.os.Bundle;

import com.jaredbanyard.android.androidstarter.Base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   
}
