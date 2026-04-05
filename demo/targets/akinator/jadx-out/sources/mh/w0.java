package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w0 extends u0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final v0 f74704b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f74705c;

    public w0(v0 v0Var, u0 u0Var) {
        this.f74704b = (v0) p1.checkNotNull(v0Var);
        this.f74705c = (u0) p1.checkNotNull(u0Var);
    }

    @Override // mh.u0
    public final boolean a(Object obj, Object obj2) {
        v0 v0Var = this.f74704b;
        return this.f74705c.equivalent(v0Var.apply(obj), v0Var.apply(obj2));
    }

    @Override // mh.u0
    public final int b(Object obj) {
        return this.f74705c.hash(this.f74704b.apply(obj));
    }

    @Override // mh.u0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f74704b.equals(w0Var.f74704b) && this.f74705c.equals(w0Var.f74705c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return h1.hashCode(this.f74704b, this.f74705c);
    }

    public String toString() {
        return this.f74705c + ".onResultOf(" + this.f74704b + ")";
    }
}
