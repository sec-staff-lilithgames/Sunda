package cu;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t0 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final lu.b f51086c;

    /* renamed from: e, reason: collision with root package name */
    public final Comparator f51087e;

    public t0(lu.b bVar, Comparator<Object> comparator) {
        this.f51086c = bVar;
        this.f51087e = comparator;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        lu.b bVar = this.f51086c;
        s0 s0Var = new s0(cVar, bVar.parallelism(), this.f51087e);
        cVar.onSubscribe(s0Var);
        bVar.subscribe(s0Var.f51073c);
    }
}
