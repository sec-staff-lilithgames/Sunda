package com.fyber.inneractive.sdk.util;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f26824a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26825b;

    /* renamed from: c, reason: collision with root package name */
    public t1 f26826c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26827d;

    /* renamed from: e, reason: collision with root package name */
    public u1 f26828e;

    /* renamed from: f, reason: collision with root package name */
    public long f26829f;

    public v1(TimeUnit timeUnit, long j10) {
        this.f26827d = false;
        this.f26829f = 0L;
        this.f26825b = j10;
        this.f26824a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }

    public final void a(long j10) {
        long jUptimeMillis = (SystemClock.uptimeMillis() - j10) + 50 + this.f26829f;
        this.f26829f = jUptimeMillis;
        if (this.f26828e != null && jUptimeMillis > this.f26824a.toMillis(this.f26825b)) {
            this.f26828e.a();
            return;
        }
        t1 t1Var = this.f26826c;
        if (t1Var == null || this.f26828e == null) {
            return;
        }
        t1Var.removeMessages(1932593528);
        this.f26826c.sendEmptyMessageDelayed(1932593528, 50L);
    }

    public v1(TimeUnit timeUnit, long j10, long j11) {
        this.f26827d = false;
        this.f26825b = j10;
        this.f26824a = timeUnit;
        this.f26829f = j11;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }
}
