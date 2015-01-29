package com.example.lifecycletest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by suzukihr on 2015/01/29.
 */
public class MainFragment extends LifeCycleFragment {

    public MainFragment() {
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

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        rootView.findViewById(R.id.button_start_second_activity)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), SecondActivity.class);
                        startActivity(intent);
                    }
                });

        rootView.findViewById(R.id.button_start_third_activity)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), ThirdActivity.class);
                        startActivity(intent);
                    }
                });

        return rootView;
    }
}