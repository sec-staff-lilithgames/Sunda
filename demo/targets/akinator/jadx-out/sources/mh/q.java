package mh;

import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q extends l {

    /* renamed from: b, reason: collision with root package name */
    public final char f74674b;

    /* renamed from: c, reason: collision with root package name */
    public final char f74675c;

    public q(char c10, char c11) {
        this.f74674b = c10;
        this.f74675c = c11;
    }

    @Override // mh.g0
    public final void d(BitSet bitSet) {
        bitSet.set(this.f74674b);
        bitSet.set(this.f74675c);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return c10 == this.f74674b || c10 == this.f74675c;
    }

    @Override // mh.g0
    public String toString() {
        return "CharMatcher.anyOf(\"" + g0.a(this.f74674b) + g0.a(this.f74675c) + "\")";
    }
}
