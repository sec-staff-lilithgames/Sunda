package com.bytedance.sdk.component.jj.jpo.qk;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.jj.jpo.my;
import com.bytedance.sdk.component.jj.jpo.xyk;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile Handler f18734jd = null;
    private static volatile HandlerThread jpo = null;
    private static int wqx = 3000;

    static {
        wqx();
    }

    public static int jd() {
        if (wqx <= 0) {
            wqx = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        }
        return wqx;
    }

    public static Handler jpo() {
        if (jpo == null || !jpo.isAlive()) {
            synchronized (jpo.class) {
                try {
                    if (jpo == null || !jpo.isAlive()) {
                        wqx();
                        f18734jd = new Handler(jpo.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (f18734jd == null) {
            synchronized (jpo.class) {
                try {
                    if (f18734jd == null) {
                        f18734jd = new Handler(jpo.getLooper());
                    }
                } finally {
                }
            }
        }
        return f18734jd;
    }

    private static void wqx() {
        HandlerThread handlerThreadJpo;
        my myVarHna = xyk.qk().hna();
        if (myVarHna != null && (handlerThreadJpo = myVarHna.jpo("csj_ad_log", 10)) != null) {
            jpo = handlerThreadJpo;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        jpo = handlerThread;
        handlerThread.start();
    }
}
