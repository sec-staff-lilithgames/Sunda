package nh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class v2 implements Comparable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f76705b;

    public v2(Comparable comparable) {
        this.f76705b = comparable;
    }

    public static u2 a(Comparable comparable) {
        return new u2((Comparable) mh.p1.checkNotNull(comparable));
    }

    public abstract void c(StringBuilder sb2);

    public abstract void d(StringBuilder sb2);

    public Comparable e() {
        return this.f76705b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v2) {
            try {
                if (compareTo((v2) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract Comparable f(a3 a3Var);

    public abstract boolean g(Comparable comparable);

    public abstract Comparable h(a3 a3Var);

    public abstract int hashCode();

    public abstract r0 i();

    public abstract r0 j();

    public abstract v2 k(r0 r0Var, a3 a3Var);

    public abstract v2 l(r0 r0Var, a3 a3Var);

    @Override // java.lang.Comparable
    public int compareTo(v2 v2Var) {
        if (v2Var == t2.f76651c) {
            return 1;
        }
        if (v2Var == r2.f76594c) {
            return -1;
        }
        Comparable comparable = v2Var.f76705b;
        ze zeVar = ze.f76826e;
        int iCompareTo = this.f76705b.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof s2, v2Var instanceof s2);
    }

    public v2 b(a3 a3Var) {
        return this;
    }
}
