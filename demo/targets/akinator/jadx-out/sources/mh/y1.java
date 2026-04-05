package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y1 implements q1, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final q1 f74721b;

    public y1(q1 q1Var) {
        this.f74721b = (q1) p1.checkNotNull(q1Var);
    }

    @Override // mh.q1
    public boolean apply(Object obj) {
        return !this.f74721b.apply(obj);
    }

    @Override // mh.q1
    public boolean equals(Object obj) {
        if (obj instanceof y1) {
            return this.f74721b.equals(((y1) obj).f74721b);
        }
        return false;
    }

    public int hashCode() {
        return ~this.f74721b.hashCode();
    }

    public String toString() {
        return "Predicates.not(" + this.f74721b + ")";
    }
}
