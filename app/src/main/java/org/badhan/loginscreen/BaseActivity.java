package org.badhan.loginscreen;

import android.app.Activity;
import android.os.Bundle;

import org.badhan.loginscreen.infrastructure.MyApplication;

public abstract class BaseActivity extends Activity {
    protected MyApplication application;

    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);
        application = (MyApplication) getApplication();
    }
}
