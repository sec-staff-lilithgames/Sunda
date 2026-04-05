package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final u0 f74693b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f74694c;

    public t0(u0 u0Var, Object obj) {
        this.f74693b = (u0) p1.checkNotNull(u0Var);
        this.f74694c = obj;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        u0 u0Var = t0Var.f74693b;
        u0 u0Var2 = this.f74693b;
        if (u0Var2.equals(u0Var)) {
            return u0Var2.equivalent(this.f74694c, t0Var.f74694c);
        }
        return false;
    }

    public Object get() {
        return this.f74694c;
    }

    public int hashCode() {
        return this.f74693b.hash(this.f74694c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f74693b);
        sb2.append(".wrap(");
        return w0.i.e(sb2, this.f74694c, ")");
    }
}
