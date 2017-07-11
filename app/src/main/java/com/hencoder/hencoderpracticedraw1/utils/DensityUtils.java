package com.hencoder.hencoderpracticedraw1.utils;

import android.content.Context;

/**
 * Description: com.hencoder.hencoderpracticedraw1.utils
 * Created by zouyulong on 2017/7/11.
 * Job number:147490
 * Phone : 15810880928
 * Email : zouyulong@syswin.com
 * Person in charge :  zouyulong
 * Leader : lixiao
 */

public class DensityUtils {
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
