package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m0 extends q0 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final q0 f74653c;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f74654e;

    public m0(q0 q0Var, q0 q0Var2) {
        this.f74653c = q0Var;
        this.f74654e = q0Var2;
    }

    @Override // mh.q0
    public final Object a(Object obj) {
        return this.f74653c.a(this.f74654e.a(obj));
    }

    @Override // mh.q0
    public final Object b(Object obj) {
        return this.f74654e.b(this.f74653c.b(obj));
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
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f74653c.equals(m0Var.f74653c) && this.f74654e.equals(m0Var.f74654e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f74654e.hashCode() + (this.f74653c.hashCode() * 31);
    }

    public String toString() {
        return this.f74653c + ".andThen(" + this.f74654e + ")";
    }
}
