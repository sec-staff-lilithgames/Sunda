package io.bidmachine.iab.vast;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm.b f60500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f60501c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f60502e;

    public m(t tVar, qm.b bVar, u uVar) {
        this.f60502e = tVar;
        this.f60500b = bVar;
        this.f60501c = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        t tVar = this.f60502e;
        sm.c cVar = tVar.f60536i;
        qm.b bVar = this.f60500b;
        if (cVar != null) {
            cVar.onError(bVar);
        }
        u uVar = this.f60501c;
        if (uVar != null) {
            if (tVar.f60529b != qm.a.f83290e || !tVar.f60551x.get() || tVar.f60552y.get()) {
                ((lm.c) uVar).onVastLoadFailed(tVar, bVar);
            } else {
                ((lm.c) uVar).onVastLoadFailed(tVar, qm.b.expired(String.format("%s load failed after display - %s", tVar.f60529b, bVar)));
            }
        }
    }
}
