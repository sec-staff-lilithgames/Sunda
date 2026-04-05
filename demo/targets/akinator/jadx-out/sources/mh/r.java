package mh;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r extends l {

    /* renamed from: b, reason: collision with root package name */
    public final char f74677b;

    public r(char c10) {
        this.f74677b = c10;
    }

    @Override // mh.g0
    public g0 and(g0 g0Var) {
        return g0Var.matches(this.f74677b) ? super.and(g0Var) : g0Var;
    }

    @Override // mh.g0
    public final void d(BitSet bitSet) {
        char c10 = this.f74677b;
        bitSet.set(0, c10);
        bitSet.set(c10 + 1, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return c10 != this.f74677b;
    }

    @Override // mh.l, mh.g0
    public g0 negate() {
        return g0.is(this.f74677b);
    }

    @Override // mh.g0
    public g0 or(g0 g0Var) {
        return g0Var.matches(this.f74677b) ? g0.any() : this;
    }

    @Override // mh.g0
    public String toString() {
        return "CharMatcher.isNot('" + g0.a(this.f74677b) + "')";
    }
}
