package cn.melonmobile.pujin;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UMConfigure.init(this,"5acf55c9f29d98626c0001ae","unknow",UMConfigure.DEVICE_TYPE_PHONE,"");
//        PlatformConfig.setQQZone("1105891995","qwRR14ZrA5TUyyic");//QQ分享初始化
    }
}
