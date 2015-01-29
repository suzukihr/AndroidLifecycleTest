package com.example.lifecycletest;

import android.os.Bundle;

public class MainActivity extends LifeCycleActivity {

    /**
     * This activity creates a fragment by FragmentManager.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTag(getClass().getSimpleName(), this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActionBar().setTitle("MainActivity");

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new MainFragment())
                    .commit();
        }
    }
}
