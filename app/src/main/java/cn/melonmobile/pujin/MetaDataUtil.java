package cn.melonmobile.pujin;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by tanghuan on 2018/3/20.
 * Supported By 甜瓜移动.
 * Official Website: www.melonmobile.cn.
 *
 * @author tanghuan
 */
public class MetaDataUtil {

    public static String getAppMetaDataString(Context context, String metaName) {
        try {
            return context
                    .getPackageManager()
                    .getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA)
                    .metaData.getString(metaName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Integer getAppMetaDataInt(Context context, String metaName) {
        try {
            return context
                    .getPackageManager()
                    .getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA)
                    .metaData.getInt(metaName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
