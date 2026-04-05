package io.bidmachine.iab.vast;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm.b f60523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f60524c;

    public q(t tVar, qm.b bVar) {
        this.f60524c = tVar;
        this.f60523b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        t tVar = this.f60524c;
        z zVar = tVar.f60535h;
        if (zVar != null) {
            ((vm.n) zVar).onError(tVar, this.f60523b);
        }
    }
}
