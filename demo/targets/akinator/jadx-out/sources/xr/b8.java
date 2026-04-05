package xr;

import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3.f f92274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wr.f0 f92275c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d8 f92276e;

    public b8(d8 d8Var, b3.f fVar, wr.f0 f0Var) {
        this.f92276e = d8Var;
        this.f92274b = fVar;
        this.f92275c = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        wr.f0 f0Var = this.f92275c;
        b3.f fVar = this.f92274b;
        d8 d8Var = this.f92276e;
        u8 u8Var = d8Var.f92426b;
        if (d8Var != u8Var.E) {
            return;
        }
        u8Var.F = fVar;
        u8Var.L.b(fVar);
        if (f0Var != wr.f0.f90916g) {
            d8Var.f92426b.V.log(wr.l.f91018c, "Entering {0} state with picker: {1}", f0Var, fVar);
            d8Var.f92426b.f93131x.a(f0Var);
        }
    }
}
