package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.ironsource.C3191e4;
import com.moloco.sdk.BKC.JzVV;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class oya {
    public static volatile boolean jpo;
    public static long my;

    /* renamed from: qk, reason: collision with root package name */
    private static volatile HandlerThread f20823qk;

    /* renamed from: jd, reason: collision with root package name */
    public static AtomicBoolean f20821jd = new AtomicBoolean(false);
    public static long wqx = 0;

    /* renamed from: jj, reason: collision with root package name */
    private static volatile int f20822jj = 0;

    /* renamed from: cm, reason: collision with root package name */
    public static float f20820cm = 1.0f;
    private static volatile Handler xyk = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.oya.1
            boolean jpo = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.jpo) {
                    return;
                }
                this.jpo = true;
                super.start();
            }
        };
        f20823qk = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.xyk.jpo(f20823qk);
        my = System.currentTimeMillis();
    }

    public static int cm() {
        return f20822jj;
    }

    public static Handler jd() {
        if (f20823qk == null || !f20823qk.isAlive()) {
            synchronized (oya.class) {
                try {
                    if (f20823qk == null || !f20823qk.isAlive()) {
                        f20823qk = com.bytedance.sdk.component.utils.xyk.jpo("csj_init_handle", -1);
                        xyk = new Handler(f20823qk.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (xyk == null) {
            synchronized (oya.class) {
                try {
                    if (xyk == null) {
                        xyk = new Handler(f20823qk.getLooper());
                    }
                } finally {
                }
            }
        }
        return xyk;
    }

    public static void jj() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - wqx <= 10000) {
            return;
        }
        wqx = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.duq.jpo(new com.bytedance.sdk.component.xyk.xyk("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.oya.2
            @Override // java.lang.Runnable
            public void run() {
                String strWqx = com.bytedance.sdk.openadsdk.core.settings.au.wqx(sq.jpo());
                if (TextUtils.equals(strWqx, com.bytedance.sdk.openadsdk.core.settings.au.f20838cm)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.au.jrx().jpo(6, true);
                com.bytedance.sdk.openadsdk.core.settings.au.f20838cm = strWqx;
            }
        });
    }

    public static void jpo(long j10) {
        my = j10;
    }

    public static boolean my() {
        return cm() == 1;
    }

    public static void qk() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - wqx <= 10000) {
            return;
        }
        synchronized (oya.class) {
            try {
                if (jElapsedRealtime - wqx <= 10000) {
                    return;
                }
                wqx = jElapsedRealtime;
                com.bytedance.sdk.component.utils.zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oya.3
                    @Override // java.lang.Runnable
                    public void run() {
                        String strWqx = com.bytedance.sdk.openadsdk.core.settings.au.wqx(sq.jpo());
                        if (TextUtils.equals(strWqx, com.bytedance.sdk.openadsdk.core.settings.au.f20838cm)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.settings.au.jrx().jpo(6, true);
                        com.bytedance.sdk.openadsdk.core.settings.au.f20838cm = strWqx;
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler wqx() {
        return new Handler(Looper.getMainLooper());
    }

    public static void xyk() {
        jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oya.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.oya.4.1
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            return a.h(C3191e4.a.f36368f);
                        }
                    });
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.nmd.wqx("InitHelper", th2.getMessage());
                }
            }
        });
    }

    public static long jpo() {
        return my;
    }

    public static void jpo(int i10) {
        f20822jj = i10;
    }

    public static void jpo(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (JzVV.VbFvPpFgytXGavn.equals(jSONObject.optString("name", ""))) {
                    zz.jd().jd(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("InitHelper", th2.getMessage());
        }
    }
}
