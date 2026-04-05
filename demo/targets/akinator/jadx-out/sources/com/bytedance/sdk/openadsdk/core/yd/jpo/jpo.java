package com.bytedance.sdk.openadsdk.core.yd.jpo;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements Application.ActivityLifecycleCallbacks {
    private static volatile jpo jpo;

    /* renamed from: jd, reason: collision with root package name */
    private final jd f21034jd;

    private jpo(Application application) {
        this.f21034jd = jd.jpo(application);
    }

    public static jpo jpo(Application application) {
        if (jpo == null) {
            synchronized (jpo.class) {
                try {
                    if (jpo == null) {
                        jpo = new jpo(application);
                        application.registerActivityLifecycleCallbacks(jpo);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        jd jdVar = this.f21034jd;
        if (jdVar != null) {
            jdVar.jpo(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        jd jdVar = this.f21034jd;
        if (jdVar != null) {
            jdVar.jd(activity);
        }
    }

    public String jpo(String str, long j10, int i10) {
        jd jdVar = this.f21034jd;
        if (jdVar != null) {
            return jdVar.jpo(str, j10, i10);
        }
        return AbstractJsonLexerKt.NULL;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
