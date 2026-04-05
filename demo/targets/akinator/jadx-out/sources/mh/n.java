package mh;

import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n extends l {

    /* renamed from: b, reason: collision with root package name */
    public final char f74656b;

    /* renamed from: c, reason: collision with root package name */
    public final char f74657c;

    public n(char c10, char c11) {
        p1.checkArgument(c11 >= c10);
        this.f74656b = c10;
        this.f74657c = c11;
    }

    @Override // mh.g0
    public final void d(BitSet bitSet) {
        bitSet.set(this.f74656b, this.f74657c + 1);
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return this.f74656b <= c10 && c10 <= this.f74657c;
    }

    @Override // mh.g0
    public String toString() {
        return "CharMatcher.inRange('" + g0.a(this.f74656b) + "', '" + g0.a(this.f74657c) + "')";
    }
}
