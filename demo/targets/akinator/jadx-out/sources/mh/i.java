package mh;

import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i extends y {

    /* renamed from: c, reason: collision with root package name */
    public final BitSet f74633c;

    public i(BitSet bitSet, String str) {
        super(str);
        this.f74633c = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
    }

    @Override // mh.g0
    public final void d(BitSet bitSet) {
        bitSet.or(this.f74633c);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return this.f74633c.get(c10);
    }
}
