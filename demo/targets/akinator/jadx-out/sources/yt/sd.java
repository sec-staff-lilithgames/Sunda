package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class sd extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f96324c;

    /* renamed from: e, reason: collision with root package name */
    public final long f96325e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f96326f;

    public sd(long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f96325e = j10;
        this.f96326f = timeUnit;
        this.f96324c = m0Var;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        rd rdVar = new rd(cVar);
        cVar.onSubscribe(rdVar);
        rdVar.setResource(this.f96324c.scheduleDirect(rdVar, this.f96325e, this.f96326f));
    }
}
