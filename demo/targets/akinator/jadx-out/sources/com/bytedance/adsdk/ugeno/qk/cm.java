package com.bytedance.adsdk.ugeno.qk;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class cm {

    /* renamed from: jd, reason: collision with root package name */
    private static Resources f17956jd;
    private static String jpo;
    private static Context wqx;

    public static int jd(Context context, String str) {
        return jpo(context, str, "drawable");
    }

    public static void jpo(String str) {
        jpo = str;
    }

    private static String jpo(Context context) {
        if (jpo == null) {
            jpo = context.getPackageName();
        }
        return jpo;
    }

    private static int jpo(Context context, String str, String str2) {
        if (f17956jd == null) {
            f17956jd = context.getResources();
        }
        return f17956jd.getIdentifier(str, str2, jpo(context));
    }

    public static int jpo(Context context, String str) {
        return jpo(context, str, "raw");
    }
}
