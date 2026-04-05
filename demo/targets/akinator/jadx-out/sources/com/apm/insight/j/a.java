package com.apm.insight.j;

import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Handler f13069a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13070b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final long f13071c;

    public a(Handler handler, long j10) {
        this.f13069a = handler;
        this.f13071c = j10;
    }

    public final void a() {
        this.f13069a.post(this);
    }

    public final long b() {
        return this.f13071c;
    }

    public final void a(long j10) {
        if (j10 > 0) {
            this.f13069a.postDelayed(this, j10);
        } else {
            this.f13069a.post(this);
        }
    }
}
