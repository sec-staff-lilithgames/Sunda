package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements r {

    /* renamed from: c, reason: collision with root package name */
    public v1 f23255c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f23256d;

    /* renamed from: f, reason: collision with root package name */
    public final d f23258f;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f23253a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public boolean f23254b = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f23257e = new Handler(Looper.getMainLooper(), new b(this));

    public e(x0 x0Var) {
        c cVar = new c(this);
        this.f23258f = new d(this);
        this.f23256d = x0Var;
        Application application = com.fyber.inneractive.sdk.util.o.f26796a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }

    public final void a() {
        s sVar = IAConfigManager.O.f23226u;
        if (!sVar.f23396d) {
            sVar.f23395c.add(this);
        }
        v1 v1Var = new v1(TimeUnit.MINUTES, r0.f23226u.f23394b.a("session_duration", 30, 1));
        this.f23255c = v1Var;
        v1Var.f26828e = this.f23258f;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(s sVar, o oVar) {
        v1 v1Var = this.f23255c;
        if (v1Var != null) {
            v1Var.f26827d = false;
            v1Var.f26829f = 0L;
            t1 t1Var = v1Var.f26826c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
            v1 v1Var2 = new v1(TimeUnit.MINUTES, oVar.a("session_duration", 30, 1), this.f23255c.f26829f);
            this.f23255c = v1Var2;
            v1Var2.f26828e = this.f23258f;
        }
        sVar.f23395c.remove(this);
    }
}
