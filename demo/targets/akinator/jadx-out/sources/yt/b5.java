package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b5 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.b0 f95222c;

    public b5(mt.b0 b0Var) {
        this.f95222c = b0Var;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95222c.subscribe(new a5(cVar));
    }
}
