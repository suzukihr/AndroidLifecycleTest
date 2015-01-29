package com.example.lifecycletest;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

/** Reference
 * http://developer.android.com/reference/android/app/Activity.html
 */
public class LifeCycleActivity extends Activity {

    private String TAG = "*** LifeCycleActivity: TAG is not set ***";

    public void setTag(String tag, Object object) {
        this.TAG = "*** " + tag + "@" + Integer.toHexString(System.identityHashCode(object))+ " ***";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("********************", getClass().getSimpleName() + " start ﹕********************");
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName+ " (savedInstanceState: " + getBundleInfo(savedInstanceState) + ")");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName + " (savedInstanceState: " + getBundleInfo(savedInstanceState) + ")");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onResume();
    }

    @Override
    public void onAttachedToWindow() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onAttachedToWindow();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onWindowFocusChanged(hasFocus);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        return true;
    }

    // called when setting 'android:configChanges="orientation|screenSize"' in your manifest
    // http://developer.android.com/guide/topics/resources/runtime-changes.html#HandlingTheChange
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onPause() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName + " (outState: " + getBundleInfo(outState) + ")");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onDestroy();
    }

    @Override
    public void onDetachedFromWindow() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.d(TAG, methodName);
        super.onDetachedFromWindow();
    }

    private static String getBundleInfo(Bundle bundle) {
        String info = bundle == null
                ? "null"
                : "Bundle@" + Integer.toHexString(System.identityHashCode(bundle));
        return info;
    }
}
