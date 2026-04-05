package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s1 implements q1, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final q1 f74689b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f74690c;

    public s1(q1 q1Var, v0 v0Var) {
        this.f74689b = (q1) p1.checkNotNull(q1Var);
        this.f74690c = (v0) p1.checkNotNull(v0Var);
    }

    @Override // mh.q1
    public boolean apply(Object obj) {
        return this.f74689b.apply(this.f74690c.apply(obj));
    }

    @Override // mh.q1
    public boolean equals(Object obj) {
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            if (this.f74690c.equals(s1Var.f74690c) && this.f74689b.equals(s1Var.f74689b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f74690c.hashCode() ^ this.f74689b.hashCode();
    }

    public String toString() {
        return this.f74689b + "(" + this.f74690c + ")";
    }
}
