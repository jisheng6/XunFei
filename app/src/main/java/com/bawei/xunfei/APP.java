package com.bawei.xunfei;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;


/**
 * date:2016/11/3
 * author:易宸锋(dell)
 * function:
 */
public class APP extends Application {

    @Override
    public void onCreate() {
        //将“12345678”替换成您申请的 APPID，申请地址：http://www.xfyun.cn
        //请勿在“=”与 appid 之间添加任务空字符或者转义符
        SpeechUtility.createUtility(this, SpeechConstant.APPID +"=58155541");
        super.onCreate();
    }
}
