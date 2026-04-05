package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.utils.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif {
    private static String jd(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.cm.cm.jd(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void jpo(String str) {
        jpo("any_door_id", str);
    }

    public static String jpo() {
        return jd("any_door_id", null);
    }

    private static void jpo(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
