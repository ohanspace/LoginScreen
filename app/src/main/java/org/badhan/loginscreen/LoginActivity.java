package org.badhan.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        View loginBtn = findViewById(R.id.login_activity_loginButton);
        loginBtn.setOnClickListener(new OnLoginButtonClickListener());
    }


    private class OnLoginButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            login();
        }
    }

    private void login(){
        application.getAuth().getUser().setLoggedIn(true);
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
