package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nq {
    private static volatile String jpo;

    public static String jpo() {
        if (!TextUtils.isEmpty(jpo)) {
            return jpo;
        }
        String str = Build.MODEL;
        jpo = str;
        return str;
    }
}
