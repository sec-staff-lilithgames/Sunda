package mh;

import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f74607b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f74608c;

    public e(g0 g0Var, g0 g0Var2) {
        this.f74607b = (g0) p1.checkNotNull(g0Var);
        this.f74608c = (g0) p1.checkNotNull(g0Var2);
    }

    @Override // mh.g0, mh.q1
    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return super.apply((Character) obj);
    }

    @Override // mh.g0
    public final void d(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.f74607b.d(bitSet2);
        BitSet bitSet3 = new BitSet();
        this.f74608c.d(bitSet3);
        bitSet2.and(bitSet3);
        bitSet.or(bitSet2);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return this.f74607b.matches(c10) && this.f74608c.matches(c10);
    }

    @Override // mh.g0
    public String toString() {
        return "CharMatcher.and(" + this.f74607b + ", " + this.f74608c + ")";
    }
}
