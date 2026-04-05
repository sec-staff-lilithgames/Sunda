package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class jn {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jo f3030;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f3028 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Handler f3029 = new Handler(Looper.getMainLooper());

    /* renamed from: ﻛ, reason: contains not printable characters */
    private jg f3027 = new jj() { // from class: com.ironsource.adqualitysdk.sdk.i.jn.3
        @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            jn.m3025(jn.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            jn.m3025(jn.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            jn.m3024(jn.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            jn.m3027(jn.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            jn.m3025(jn.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            jn.m3025(jn.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            jn.m3025(jn.this);
        }
    };

    public jn(jo joVar) {
        this.f3030 = joVar;
        jf.m2969().m2970(this.f3027);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m3024(jn jnVar, final Activity activity) {
        jnVar.f3029.postDelayed(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jn.5
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                jn.m3028(jn.this);
                if (jn.this.f3030 != null) {
                    jn.this.f3030.mo756(activity);
                }
            }
        }, 500L);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m3025(jn jnVar) {
        jnVar.f3029.removeCallbacksAndMessages(null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3028(jn jnVar) {
        jnVar.f3028 = true;
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m3029() {
        this.f3029.removeCallbacksAndMessages(null);
        if (this.f3027 != null) {
            jf.m2969().m2973(this.f3027);
            this.f3027 = null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m3027(jn jnVar, Activity activity) {
        if (jnVar.f3028) {
            jnVar.f3028 = false;
            jo joVar = jnVar.f3030;
            if (joVar != null) {
                joVar.mo755(activity);
            }
        }
        jnVar.f3029.removeCallbacksAndMessages(null);
    }
}
