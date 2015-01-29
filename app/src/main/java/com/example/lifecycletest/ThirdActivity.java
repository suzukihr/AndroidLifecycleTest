package com.example.lifecycletest;

import android.os.Bundle;

public class ThirdActivity extends LifeCycleActivity {

    /**
     * This activity creates a fragment from XML.
     * When rotating, 'onConfigurationChanged' method is called.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTag(getClass().getSimpleName(), this);

        getActionBar().setTitle("ThirdActivity");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }
}
