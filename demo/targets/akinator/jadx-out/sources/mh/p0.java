package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p0 extends q0 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final q0 f74668c;

    public p0(q0 q0Var) {
        this.f74668c = q0Var;
    }

    @Override // mh.q0
    public final Object a(Object obj) {
        return this.f74668c.b(obj);
    }

    @Override // mh.q0
    public final Object b(Object obj) {
        return this.f74668c.a(obj);
    }

    @Override // mh.q0
    public final Object d(Object obj) {
        throw new AssertionError();
    }

    @Override // mh.q0
    public final Object e(Object obj) {
        throw new AssertionError();
    }

    @Override // mh.q0, mh.v0
    public boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f74668c.equals(((p0) obj).f74668c);
        }
        return false;
    }

    public int hashCode() {
        return ~this.f74668c.hashCode();
    }

    @Override // mh.q0
    public q0 reverse() {
        return this.f74668c;
    }

    public String toString() {
        return this.f74668c + ".reverse()";
    }
}
