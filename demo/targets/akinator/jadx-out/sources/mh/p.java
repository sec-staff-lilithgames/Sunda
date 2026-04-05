package mh;

import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends l {

    /* renamed from: b, reason: collision with root package name */
    public final char f74667b;

    public p(char c10) {
        this.f74667b = c10;
    }

    @Override // mh.g0
    public g0 and(g0 g0Var) {
        return g0Var.matches(this.f74667b) ? this : g0.none();
    }

    @Override // mh.g0
    public final void d(BitSet bitSet) {
        bitSet.set(this.f74667b);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return c10 == this.f74667b;
    }

    @Override // mh.l, mh.g0
    public g0 negate() {
        return g0.isNot(this.f74667b);
    }

    @Override // mh.g0
    public g0 or(g0 g0Var) {
        return g0Var.matches(this.f74667b) ? g0Var : super.or(g0Var);
    }

    @Override // mh.g0
    public String replaceFrom(CharSequence charSequence, char c10) {
        return charSequence.toString().replace(this.f74667b, c10);
    }

    @Override // mh.g0
    public String toString() {
        return "CharMatcher.is('" + g0.a(this.f74667b) + "')";
    }
}
