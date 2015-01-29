package com.example.lifecycletest;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/** Reference
 * http://developer.android.com/guide/components/fragments.html
 */
public class LifeCycleFragment extends Fragment {

    private String TAG = "*** LifeCycleFragment: TAG is not set ***";

    public void setTag(String tag, Object object) {
        this.TAG = "*** " + tag + "@" + Integer.toHexString(System.identityHashCode(object))+ " ***";
    }

    @Override
    public void onAttach(Activity activity) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName + " (savedInstanceState: " + getBundleInfo(savedInstanceState) + ")");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName + " (savedInstanceState: " + getBundleInfo(savedInstanceState) + ")");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName + " (savedInstanceState: " + getBundleInfo(savedInstanceState) + ")");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName + " (savedInstanceState: " + getBundleInfo(savedInstanceState) + ")");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onStart();
    }

    @Override
    public void onResume() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onResume();
    }

    // called when setting 'android:configChanges="orientation|screenSize"' in you manifest
    // http://developer.android.com/guide/topics/resources/runtime-changes.html#HandlingTheChange
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onConfigurationChanged(newConfig);
    }

    // called when calling 'setHasOptionsMenu(true)'
    // http://developer.android.com/reference/android/app/Fragment.html#setHasOptionsMenu(boolean)
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onPause() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName + " (outState: " + getBundleInfo(outState) + ")");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onDetach();
    }

    private static String getBundleInfo(Bundle bundle) {
        String info = bundle == null
                ? "null"
                : "Bundle@" + Integer.toHexString(System.identityHashCode(bundle));
        return info;
    }
}
