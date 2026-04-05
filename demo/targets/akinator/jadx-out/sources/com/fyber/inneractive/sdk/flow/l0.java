package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f23676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f23677b;

    public l0(p0 p0Var, long j10) {
        this.f23677b = p0Var;
        this.f23676a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23677b.K()) {
            p0 p0Var = this.f23677b;
            p0Var.f23767n = new k0(this);
            long jA = p0Var.a(this.f23676a);
            p0 p0Var2 = this.f23677b;
            p0Var2.getClass();
            v1 v1Var = new v1(TimeUnit.MILLISECONDS, jA);
            p0Var2.f23768o = v1Var;
            v1Var.f26828e = new o0(p0Var2);
            t1 t1Var = new t1(v1Var);
            v1Var.f26826c = t1Var;
            v1Var.f26827d = false;
            t1Var.sendEmptyMessage(1932593528);
            p0 p0Var3 = this.f23677b;
            p0Var3.getClass();
            IAlog.a("%sad contains custom close. Will show transparent x in %d", IAlog.a(p0Var3), Long.valueOf(jA));
            this.f23677b.f23765l = null;
        } else {
            p0 p0Var4 = this.f23677b;
            p0Var4.getClass();
            IAlog.a("%sad does not contain custom close. Showing close button", IAlog.a(p0Var4));
            this.f23677b.d(false);
        }
        Runnable runnable = this.f23677b.f23765l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(runnable);
            this.f23677b.f23765l = null;
        }
    }
}
