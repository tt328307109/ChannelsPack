package cn.melonmobile.pujin;

import android.app.Application;
import android.text.TextUtils;

import com.umeng.commonsdk.UMConfigure;

/**
 * 使用多渠道打包后，如果需要加入统计功能则在init方法中的第三个参数，必须如下填写(如果不需要统计这个信息也可以填写"unknow")
 * 意思是从meta-data中获取当前的apk的渠道。然后传入友盟后台统计
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UMConfigure.init(this, "5acf55c9f29d98626c0001ae", TextUtils.isEmpty(MetaDataUtil.getAppMetaDataString(this, "UMENG_CHANNEL")) ?
                "unknow" : MetaDataUtil.getAppMetaDataString(this, "UMENG_CHANNEL"), UMConfigure.DEVICE_TYPE_PHONE, "");
//        PlatformConfig.setQQZone("1105891995","qwRR14ZrA5TUyyic");//QQ分享初始化
    }
}
