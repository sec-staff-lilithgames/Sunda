package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w1 implements q1, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Class f74706b;

    public w1(Class cls) {
        this.f74706b = (Class) p1.checkNotNull(cls);
    }

    @Override // mh.q1
    public boolean apply(Object obj) {
        return this.f74706b.isInstance(obj);
    }

    @Override // mh.q1
    public boolean equals(Object obj) {
        return (obj instanceof w1) && this.f74706b == ((w1) obj).f74706b;
    }

    public int hashCode() {
        return this.f74706b.hashCode();
    }

    public String toString() {
        return b0.e2.k(this.f74706b, new StringBuilder("Predicates.instanceOf("), ")");
    }
}
