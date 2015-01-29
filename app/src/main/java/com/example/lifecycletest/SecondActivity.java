package com.example.lifecycletest;

import android.os.Bundle;

public class SecondActivity extends LifeCycleActivity {

    /**
     * This activity creates a fragment from XML.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTag(getClass().getSimpleName(), this);

        getActionBar().setTitle("SecondActivity");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }
}
