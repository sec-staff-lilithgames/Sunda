package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: jd, reason: collision with root package name */
    private static Boolean f21571jd;
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.dt> jpo;

    public static com.bytedance.sdk.openadsdk.core.model.dt jd() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.dt> softReference = jpo;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static boolean jpo() {
        try {
            if (f21571jd == null) {
                boolean z10 = true;
                if (com.bytedance.sdk.openadsdk.rq.jpo.jpo("enable_get_ad_new", 0) != 1) {
                    z10 = false;
                }
                f21571jd = Boolean.valueOf(z10);
            }
            return f21571jd.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (dtVar == null) {
            return;
        }
        jpo = new SoftReference<>(dtVar);
    }
}
