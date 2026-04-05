package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c1 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98555b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98556c;

    public c1(mt.y yVar, st.o oVar) {
        this.f98555b = yVar;
        this.f98556c = oVar;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        b1 b1Var = new b1(fVar, this.f98556c);
        fVar.onSubscribe(b1Var);
        this.f98555b.subscribe(b1Var);
    }
}
