package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v6 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final tw.b f96441b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f96442c;

    public v6(tw.b bVar, Object obj) {
        this.f96441b = bVar;
        this.f96442c = obj;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f96441b.subscribe(new u6(q0Var, this.f96442c));
    }
}
