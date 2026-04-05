package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f2 implements q1, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Class f74619b;

    public f2(Class cls) {
        this.f74619b = (Class) p1.checkNotNull(cls);
    }

    @Override // mh.q1
    public boolean equals(Object obj) {
        return (obj instanceof f2) && this.f74619b == ((f2) obj).f74619b;
    }

    public int hashCode() {
        return this.f74619b.hashCode();
    }

    public String toString() {
        return b0.e2.k(this.f74619b, new StringBuilder("Predicates.subtypeOf("), ")");
    }

    @Override // mh.q1
    public boolean apply(Class<?> cls) {
        return this.f74619b.isAssignableFrom(cls);
    }
}
