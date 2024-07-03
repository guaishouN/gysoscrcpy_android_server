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
    // 检查token是否有效
    public static void check_token() {
        ExecutorService exe = Executors.newCachedThreadPool(); // 创建线程池
        exe.submit(() -> {
            Calendar now = Calendar.getInstance(); // 获取当前时间
            now.add(Calendar.DAY_OF_YEAR, -2); // 减去2天
            if (now.after(Utils.getTokenCreateTime())) { // 如果当前时间在token创建时间之后
                Log.i("login", "Token已经过期重新登录"); // 打印token过期信息
                doLogin(); // 执行登录操作
            }
        });
    }
}
