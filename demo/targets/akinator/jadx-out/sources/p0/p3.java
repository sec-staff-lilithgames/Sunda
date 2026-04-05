package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p3 implements d1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n3 f80394a;

    public p3(n3 n3Var) {
        this.f80394a = n3Var;
    }

    @Override // d1.l
    public void dispose() {
        Object obj = this.f80394a.f80350c;
        n3 n3Var = this.f80394a;
        synchronized (obj) {
            z.t0 t0Var = n3Var.A;
            if (t0Var != null) {
                t0Var.remove(null);
            }
        }
    }
}
