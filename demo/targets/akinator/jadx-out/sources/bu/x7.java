package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x7 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.e f11210c;

    public x7(mt.b0 b0Var, st.e eVar) {
        super(b0Var);
        this.f11210c = eVar;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        tt.h hVar = new tt.h();
        i0Var.onSubscribe(hVar);
        w7 w7Var = new w7(i0Var, this.f11210c, hVar, this.f10053b);
        if (w7Var.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                w7Var.f11175e.subscribe(w7Var);
                iAddAndGet = w7Var.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }
}
