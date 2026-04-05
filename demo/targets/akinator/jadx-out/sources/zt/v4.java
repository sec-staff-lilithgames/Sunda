package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v4 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y[] f98804b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98805c;

    public v4(mt.y[] yVarArr, st.o oVar) {
        this.f98804b = yVarArr;
        this.f98805c = oVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        mt.y[] yVarArr = this.f98804b;
        int length = yVarArr.length;
        if (length == 1) {
            yVarArr[0].subscribe(new n2(vVar, new s4(this)));
            return;
        }
        t4 t4Var = new t4(vVar, length, this.f98805c);
        vVar.onSubscribe(t4Var);
        for (int i10 = 0; i10 < length && !t4Var.isDisposed(); i10++) {
            mt.y yVar = yVarArr[i10];
            if (yVar == null) {
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (t4Var.getAndSet(0) <= 0) {
                    mu.a.onError(nullPointerException);
                    return;
                } else {
                    t4Var.a(i10);
                    t4Var.f98780b.onError(nullPointerException);
                    return;
                }
            }
            yVar.subscribe(t4Var.f98782e[i10]);
        }
    }
}
