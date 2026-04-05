package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f23236a;

    public c(e eVar) {
        this.f23236a = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f23236a.f23257e.hasMessages(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) || this.f23236a.f23253a.get()) {
            return;
        }
        this.f23236a.f23257e.sendEmptyMessageDelayed(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.fyber.inneractive.sdk.cache.session.g gVar;
        this.f23236a.f23257e.removeMessages(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        e eVar = this.f23236a;
        if (eVar.f23253a.compareAndSet(true, false)) {
            if (eVar.f23254b) {
                IAlog.a("onActivityResumed: restartSession", new Object[0]);
                eVar.f23254b = false;
                x0 x0Var = eVar.f23256d;
                if (x0Var != null) {
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = x0Var.f23420a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.cache.session.i iVar = eVar2.f23148a;
                        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (gVar = (com.fyber.inneractive.sdk.cache.session.g) iVar.f23158a.get(cVar)) != null && gVar.f23154a != 0) {
                                eVar2.a(cVar, gVar);
                            }
                        }
                        com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION, com.fyber.inneractive.sdk.cache.session.enums.c.NONE));
                    }
                    eVar.f23256d.f23422c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                    eVar.f23256d.f23421b.clear();
                }
            }
            v1 v1Var = eVar.f23255c;
            if (v1Var != null) {
                v1Var.f26827d = false;
                v1Var.f26829f = 0L;
                t1 t1Var = v1Var.f26826c;
                if (t1Var != null) {
                    t1Var.removeMessages(1932593528);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
