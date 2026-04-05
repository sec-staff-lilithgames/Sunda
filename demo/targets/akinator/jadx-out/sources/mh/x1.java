package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x1 implements q1, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f74714b;

    public x1(Object obj) {
        this.f74714b = obj;
    }

    @Override // mh.q1
    public boolean apply(Object obj) {
        return this.f74714b.equals(obj);
    }

    @Override // mh.q1
    public boolean equals(Object obj) {
        if (obj instanceof x1) {
            return this.f74714b.equals(((x1) obj).f74714b);
        }
        return false;
    }

    public int hashCode() {
        return this.f74714b.hashCode();
    }

    public String toString() {
        return w0.i.e(new StringBuilder("Predicates.equalTo("), this.f74714b, ")");
    }
}
