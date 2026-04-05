package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nzb {
    private static String jpo;

    public static String jd() {
        if (TextUtils.isEmpty(jpo)) {
            jpo = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return jpo;
    }

    public static boolean jpo() {
        return com.bytedance.sdk.component.utils.prr.cm() && com.bytedance.sdk.openadsdk.core.zz.jd().sq() && com.bytedance.sdk.openadsdk.core.zz.jd().jr();
    }

    public static boolean wqx() {
        return false;
    }

    public static String jpo(String str) {
        try {
            if (!jpo()) {
                return str;
            }
            String strNmd = com.bytedance.sdk.openadsdk.core.zz.jd().nmd();
            if (TextUtils.isEmpty(strNmd)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(strNmd)));
            return Uri.parse(str).buildUpon().appendQueryParameter(jd(), strNmd).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
