package nh;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t2 extends v2 {

    /* renamed from: c, reason: collision with root package name */
    public static final t2 f76651c = new t2("");

    @Override // nh.v2
    public final v2 b(a3 a3Var) {
        try {
            return v2.a(a3Var.minValue());
        } catch (NoSuchElementException unused) {
            return this;
        }
    }

    @Override // nh.v2
    public final void c(StringBuilder sb2) {
        sb2.append("(-∞");
    }

    @Override // nh.v2
    public final void d(StringBuilder sb2) {
        throw new AssertionError();
    }

    @Override // nh.v2
    public final Comparable e() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // nh.v2
    public final Comparable f(a3 a3Var) {
        throw new AssertionError();
    }

    @Override // nh.v2
    public final boolean g(Comparable comparable) {
        return true;
    }

    @Override // nh.v2
    public final Comparable h(a3 a3Var) {
        return a3Var.minValue();
    }

    @Override // nh.v2
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // nh.v2
    public final r0 i() {
        throw new IllegalStateException();
    }

    @Override // nh.v2
    public final r0 j() {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // nh.v2
    public final v2 k(r0 r0Var, a3 a3Var) {
        throw new IllegalStateException();
    }

    @Override // nh.v2
    public final v2 l(r0 r0Var, a3 a3Var) {
        throw new AssertionError("this statement should be unreachable");
    }

    public String toString() {
        return "-∞";
    }

    @Override // nh.v2, java.lang.Comparable
    public int compareTo(v2 v2Var) {
        return v2Var == this ? 0 : -1;
    }
}
