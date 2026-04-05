package com.bytedance.sdk.openadsdk.hmu.jpo;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.xyk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static HandlerThread f21172jd;
    private static Handler jpo;

    public static Handler jpo() {
        try {
            HandlerThread handlerThread = f21172jd;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (jpo.class) {
                    try {
                        HandlerThread handlerThread2 = f21172jd;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            f21172jd = xyk.jpo("csj_ev");
                            jpo = new Handler(f21172jd.getLooper());
                        }
                    } finally {
                    }
                }
            } else if (jpo == null) {
                synchronized (jpo.class) {
                    try {
                        if (jpo == null) {
                            jpo = new Handler(f21172jd.getLooper());
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return jpo;
    }
}
