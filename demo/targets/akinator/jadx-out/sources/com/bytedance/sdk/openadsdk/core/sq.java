package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile tu<com.bytedance.sdk.openadsdk.cm.jpo> f20886jd = null;
    private static volatile Context jpo = null;
    private static int wqx = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {
        private static volatile Application jpo;

        static {
            try {
                Object objJd = jd();
                jpo = (Application) objJd.getClass().getMethod("getApplication", null).invoke(objJd, null);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.jpo("MyApplication", "application get failed", th2);
            }
        }

        private static Object jd() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.jpo("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th2);
                return null;
            }
        }

        public static Application jpo() {
            return jpo;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.settings.jj cm() {
        return com.bytedance.sdk.openadsdk.core.settings.au.jrx();
    }

    public static void jd(Context context) {
        if (jpo == null) {
            synchronized (sq.class) {
                try {
                    if (jpo == null) {
                        if (context != null) {
                            jpo = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                jpo = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationJpo = jpo.jpo();
                            if (applicationJpo != null) {
                                jpo = applicationJpo;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static Context jpo() {
        if (jpo == null) {
            jd(null);
        }
        return jpo;
    }

    public static com.bytedance.sdk.openadsdk.prr.wqx.wqx my() {
        return !com.bytedance.sdk.openadsdk.core.settings.zz.jpo() ? com.bytedance.sdk.openadsdk.prr.wqx.cm.jpo() : com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo();
    }

    public static tu<com.bytedance.sdk.openadsdk.cm.jpo> wqx() {
        if (f20886jd == null) {
            synchronized (sq.class) {
                try {
                    if (f20886jd == null) {
                        f20886jd = new dt(jpo);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f20886jd;
    }

    public static Context jpo(Context context) {
        if (context == null) {
            context = jpo();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int jd() {
        Context contextJpo;
        if (wqx < 0 && (contextJpo = jpo()) != null) {
            wqx = ViewConfiguration.get(contextJpo).getScaledTouchSlop();
        }
        return wqx;
    }
}
