package yt;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ec extends a {

    /* renamed from: e, reason: collision with root package name */
    public final mt.m0 f95439e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95440f;

    public ec(mt.l lVar, mt.m0 m0Var, boolean z10) {
        super(lVar);
        this.f95439e = m0Var;
        this.f95440f = z10;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        m0.a aVarCreateWorker = this.f95439e.createWorker();
        dc dcVar = new dc(cVar, aVarCreateWorker, this.f95121c, this.f95440f);
        cVar.onSubscribe(dcVar);
        aVarCreateWorker.schedule(dcVar);
    }
}
