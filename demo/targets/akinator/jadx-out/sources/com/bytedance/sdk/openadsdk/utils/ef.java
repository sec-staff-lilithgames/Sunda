package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ef {
    private static final Map<String, ef> jpo = new HashMap();

    /* renamed from: jd, reason: collision with root package name */
    private SharedPreferences f21512jd;

    private ef(String str, Context context) {
        if (context != null) {
            this.f21512jd = context.getSharedPreferences(str, 0);
        }
    }

    public static ef jpo(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, ef> map = jpo;
        ef efVar = map.get(str);
        if (efVar != null) {
            return efVar;
        }
        synchronized (ef.class) {
            if (efVar == null) {
                try {
                    efVar = new ef(str, com.bytedance.sdk.openadsdk.core.sq.jpo());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            map.put(str, efVar);
        }
        return efVar;
    }

    public String jpo(String str, String str2) {
        try {
            return this.f21512jd.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void jpo(String str) {
        try {
            this.f21512jd.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
