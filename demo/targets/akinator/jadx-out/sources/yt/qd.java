package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class qd extends a {

    /* renamed from: e, reason: collision with root package name */
    public final long f96213e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f96214f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f96215g;

    /* renamed from: h, reason: collision with root package name */
    public final tw.b f96216h;

    public qd(mt.l lVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, tw.b bVar) {
        super(lVar);
        this.f96213e = j10;
        this.f96214f = timeUnit;
        this.f96215g = m0Var;
        this.f96216h = bVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        tw.b bVar = this.f96216h;
        mt.l lVar = this.f95121c;
        mt.m0 m0Var = this.f96215g;
        if (bVar == null) {
            nd ndVar = new nd(cVar, this.f96213e, this.f96214f, m0Var.createWorker());
            cVar.onSubscribe(ndVar);
            ndVar.f96017g.replace(ndVar.f96016f.schedule(new pd(0L, ndVar), ndVar.f96014c, ndVar.f96015e));
            lVar.subscribe((mt.q) ndVar);
            return;
        }
        md mdVar = new md(cVar, this.f96213e, this.f96214f, m0Var.createWorker(), this.f96216h);
        cVar.onSubscribe(mdVar);
        mdVar.f95962o.replace(mdVar.f95961n.schedule(new pd(0L, mdVar), mdVar.f95959l, mdVar.f95960m));
        lVar.subscribe((mt.q) mdVar);
    }
}
