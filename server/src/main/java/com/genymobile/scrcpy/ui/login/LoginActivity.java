package com.genymobile.scrcpy.ui.login;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.genymobile.scrcpy.R;
public class LoginActivity extends Activity {
    private static LoginActivity instance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        instance = this;
        doLogin();
    }

    public static void doLogin() {
        Log.d("TAG", "login");
        Context context = instance.getApplication();
        context.getAssets();
    }
}





