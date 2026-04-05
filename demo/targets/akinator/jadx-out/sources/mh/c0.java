package mh;

import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f74591b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f74592c;

    public c0(g0 g0Var, g0 g0Var2) {
        this.f74591b = (g0) p1.checkNotNull(g0Var);
        this.f74592c = (g0) p1.checkNotNull(g0Var2);
    }

    @Override // mh.g0, mh.q1
    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return super.apply((Character) obj);
    }

    @Override // mh.g0
    public final void d(BitSet bitSet) {
        this.f74591b.d(bitSet);
        this.f74592c.d(bitSet);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return this.f74591b.matches(c10) || this.f74592c.matches(c10);
    }

    @Override // mh.g0
    public String toString() {
        return "CharMatcher.or(" + this.f74591b + ", " + this.f74592c + ")";
    }
}
