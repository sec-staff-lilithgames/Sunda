package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c1 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b[] f95245c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f95246e;

    public c1(tw.b[] bVarArr, boolean z10) {
        this.f95245c = bVarArr;
        this.f95246e = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        b1 b1Var = new b1(this.f95245c, this.f95246e, cVar);
        cVar.onSubscribe(b1Var);
        b1Var.onComplete();
    }
}
