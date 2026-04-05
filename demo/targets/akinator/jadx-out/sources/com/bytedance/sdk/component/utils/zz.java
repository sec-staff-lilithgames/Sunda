package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz {
    private static volatile Handler jpo;

    public static Handler jd() {
        if (jpo == null) {
            synchronized (zz.class) {
                try {
                    if (jpo == null) {
                        jpo = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public static Handler jpo() {
        return com.bytedance.sdk.component.xyk.jpo.jpo.jpo().jd();
    }
}
