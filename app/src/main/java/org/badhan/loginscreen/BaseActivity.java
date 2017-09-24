package org.badhan.loginscreen;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import org.badhan.loginscreen.infrastructure.MyApplication;

public abstract class BaseActivity extends Activity {
    public String tag;
    protected MyApplication application;

    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);
        tag = getClass().getSimpleName();
        application = (MyApplication) getApplication();
    }
}
