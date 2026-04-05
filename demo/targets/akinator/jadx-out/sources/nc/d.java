package nc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final rc.q f75878a;

    /* renamed from: b, reason: collision with root package name */
    public final rc.d0 f75879b;

    /* renamed from: c, reason: collision with root package name */
    public final tb.c f75880c;

    public d(rc.q qVar, rc.d0 d0Var, tb.c cVar) {
        this.f75878a = qVar;
        this.f75879b = d0Var;
        this.f75880c = cVar;
    }

    public jc.n0 fullName() {
        rc.d0 d0Var = this.f75879b;
        if (d0Var == null) {
            return null;
        }
        return d0Var.getFullName();
    }

    public boolean hasFullName() {
        rc.d0 d0Var = this.f75879b;
        if (d0Var == null) {
            return false;
        }
        return d0Var.getFullName().hasSimpleName();
    }
}
