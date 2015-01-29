package com.example.lifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by suzukihr on 2015/01/29.
 */
public class SampleFragment extends LifeCycleFragment {

    public SampleFragment() {
    }

    @Override
    public void onAttach(Activity activity) {
        setTag(getClass().getSimpleName(), this);
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_sample, container, false);
        return rootView;
    }
}