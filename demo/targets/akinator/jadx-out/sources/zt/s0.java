package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s0 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f98765b;

    public s0(Throwable th2) {
        this.f98765b = th2;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        vVar.onSubscribe(pt.d.disposed());
        vVar.onError(this.f98765b);
    }
}
