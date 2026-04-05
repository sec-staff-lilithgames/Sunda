package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f91110a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f91111b;

    public r0(String str, Object obj) {
        u0.a(str, "name");
        this.f91110a = str;
        this.f91111b = obj;
    }

    public Object get() {
        return get(u0.current());
    }

    public String toString() {
        return this.f91110a;
    }

    public Object get(u0 u0Var) {
        e5 e5Var = u0Var.f91144c;
        Object obj = e5Var == null ? null : e5Var.get(this, hashCode(), 0);
        return obj == null ? this.f91111b : obj;
    }
}
