package mh;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s0 implements q1, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final u0 f74687b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f74688c;

    public s0(u0 u0Var, Object obj) {
        this.f74687b = (u0) p1.checkNotNull(u0Var);
        this.f74688c = obj;
    }

    @Override // mh.q1
    public boolean apply(Object obj) {
        return this.f74687b.equivalent(obj, this.f74688c);
    }

    @Override // mh.q1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f74687b.equals(s0Var.f74687b) && Objects.equals(this.f74688c, s0Var.f74688c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f74687b, this.f74688c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f74687b);
        sb2.append(".equivalentTo(");
        return w0.i.e(sb2, this.f74688c, ")");
    }
}
