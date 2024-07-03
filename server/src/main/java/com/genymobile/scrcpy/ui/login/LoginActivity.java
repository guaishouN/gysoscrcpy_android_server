package com.genymobile.scrcpy.ui.login;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.genymobile.scrcpy.R;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoginActivity extends Activity {
    private static LoginActivity instance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        instance = this;
        check_token();
    }

    public static void doLogin() {
        Log.d("TAG", "login");
        Context context = instance.getApplication();
        context.getAssets();
    }

    public static void check_token() {
        ExecutorService exe = Executors.newCachedThreadPool();
        exe.submit(()->{
            Calendar now = Calendar.getInstance();
            now.add(Calendar.DAY_OF_YEAR, -1);
            if (now.after(Utils.getTokenCreateTime())) {
                Log.i("login","Token已经过期重新登录");
                doLogin();
            }
        });
    }
}





