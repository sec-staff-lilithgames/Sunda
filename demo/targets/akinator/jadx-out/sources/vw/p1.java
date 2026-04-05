package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final ax.c f90041a = new ax.c();

    /* renamed from: b, reason: collision with root package name */
    public final yw.j f90042b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f90043c;

    public p1(t0 t0Var, v4 v4Var) {
        this.f90042b = v4Var.getFormat();
        this.f90043c = t0Var.getType();
    }

    public o1 build(String str) throws Exception {
        ax.c cVar = this.f90041a;
        o1 o1Var = (o1) cVar.fetch(str);
        if (o1Var != null) {
            return o1Var;
        }
        n3 n3Var = new n3(str, new n(this.f90043c), this.f90042b);
        cVar.cache(str, n3Var);
        return n3Var;
    }
}
