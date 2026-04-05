package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.component.utils.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif {
    private static Context jpo;

    private static Configuration jd(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }

    public static void jpo(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            jpo = context.createConfigurationContext(jd(context, str, str2));
        } catch (Throwable th2) {
            th2.getMessage();
        }
        dt.jpo(jpo);
    }
}
