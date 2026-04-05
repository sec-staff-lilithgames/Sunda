package yt;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o6 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f96049c;

    /* renamed from: e, reason: collision with root package name */
    public final long f96050e;

    /* renamed from: f, reason: collision with root package name */
    public final long f96051f;

    /* renamed from: g, reason: collision with root package name */
    public final long f96052g;

    /* renamed from: h, reason: collision with root package name */
    public final long f96053h;

    /* renamed from: i, reason: collision with root package name */
    public final TimeUnit f96054i;

    public o6(long j10, long j11, long j12, long j13, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f96052g = j12;
        this.f96053h = j13;
        this.f96054i = timeUnit;
        this.f96049c = m0Var;
        this.f96050e = j10;
        this.f96051f = j11;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        n6 n6Var = new n6(cVar, this.f96050e, this.f96051f);
        cVar.onSubscribe(n6Var);
        mt.m0 m0Var = this.f96049c;
        if (!(m0Var instanceof fu.v0)) {
            n6Var.setResource(m0Var.schedulePeriodicallyDirect(n6Var, this.f96052g, this.f96053h, this.f96054i));
        } else {
            m0.a aVarCreateWorker = m0Var.createWorker();
            n6Var.setResource(aVarCreateWorker);
            aVarCreateWorker.schedulePeriodically(n6Var, this.f96052g, this.f96053h, this.f96054i);
        }
    }
}
