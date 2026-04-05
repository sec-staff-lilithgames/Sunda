package yt;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m6 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f95937c;

    /* renamed from: e, reason: collision with root package name */
    public final long f95938e;

    /* renamed from: f, reason: collision with root package name */
    public final long f95939f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeUnit f95940g;

    public m6(long j10, long j11, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f95938e = j10;
        this.f95939f = j11;
        this.f95940g = timeUnit;
        this.f95937c = m0Var;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        l6 l6Var = new l6(cVar);
        cVar.onSubscribe(l6Var);
        mt.m0 m0Var = this.f95937c;
        if (!(m0Var instanceof fu.v0)) {
            l6Var.setResource(m0Var.schedulePeriodicallyDirect(l6Var, this.f95938e, this.f95939f, this.f95940g));
        } else {
            m0.a aVarCreateWorker = m0Var.createWorker();
            l6Var.setResource(aVarCreateWorker);
            aVarCreateWorker.schedulePeriodically(l6Var, this.f95938e, this.f95939f, this.f95940g);
        }
    }
}
