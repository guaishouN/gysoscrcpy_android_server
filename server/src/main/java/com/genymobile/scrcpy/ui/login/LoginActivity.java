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

// 登录界面的Activity类
public class LoginActivity extends Activity {
    private static LoginActivity instance; // 静态实例

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // 设置布局
        instance = this; // 设置静态实例为当前实例
        check_token(); // 检查token
    }

    // 执行登录操作
    public static void doLogin() {
        Log.d("TAG", "login"); // 打印登录信息
        Context context = instance.getApplication(); // 获取应用上下文
        context.getAssets(); // 获取应用资源
    }
}
