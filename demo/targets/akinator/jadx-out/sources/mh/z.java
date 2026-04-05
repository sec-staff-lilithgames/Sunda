package mh;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class z extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f74726b;

    public z(g0 g0Var) {
        this.f74726b = (g0) p1.checkNotNull(g0Var);
    }

    @Override // mh.g0, mh.q1
    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return apply((Character) obj);
    }

    @Override // mh.g0
    public int countIn(CharSequence charSequence) {
        return charSequence.length() - this.f74726b.countIn(charSequence);
    }

    @Override // mh.g0
    public final void d(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.f74726b.d(bitSet2);
        bitSet2.flip(0, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        bitSet.or(bitSet2);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return !this.f74726b.matches(c10);
    }

    @Override // mh.g0
    public boolean matchesAllOf(CharSequence charSequence) {
        return this.f74726b.matchesNoneOf(charSequence);
    }

    @Override // mh.g0
    public boolean matchesNoneOf(CharSequence charSequence) {
        return this.f74726b.matchesAllOf(charSequence);
    }

    @Override // mh.g0
    public g0 negate() {
        return this.f74726b;
    }

    @Override // mh.g0
    public String toString() {
        return this.f74726b + ".negate()";
    }
}
