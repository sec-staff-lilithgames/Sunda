package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.utils.tic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static String jpo;

    public static String cm() {
        return tic.xyk();
    }

    public static String jd() {
        return "1371";
    }

    public static String jj() {
        return com.bytedance.sdk.component.utils.opi.qk(com.bytedance.sdk.openadsdk.core.sq.jpo());
    }

    public static String jpo() {
        return "open_news";
    }

    public static String my() {
        return com.bytedance.sdk.openadsdk.core.zz.jd().xyk();
    }

    public static String qk() {
        try {
            if (!TextUtils.isEmpty(jpo)) {
                return jpo;
            }
            String strJpo = com.bytedance.sdk.openadsdk.core.zz.jpo("sdk_app_sha1", 259200000L);
            jpo = strJpo;
            if (jpo(strJpo)) {
                return jpo;
            }
            String strJpo2 = com.bytedance.sdk.component.utils.wqx.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo());
            jpo = strJpo2;
            if (!jpo(strJpo2)) {
                return "";
            }
            String upperCase = jpo.toUpperCase();
            jpo = upperCase;
            com.bytedance.sdk.openadsdk.core.zz.jpo("sdk_app_sha1", upperCase);
            return jpo;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String wqx() {
        return BuildConfig.VERSION_NAME;
    }

    public static String jpo(Context context) {
        return Cif.jpo(context);
    }

    private static boolean jpo(String str) {
        String[] strArrSplit;
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(":")) != null && strArrSplit.length >= 20) {
            for (String str2 : strArrSplit) {
                if (!"00".equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
