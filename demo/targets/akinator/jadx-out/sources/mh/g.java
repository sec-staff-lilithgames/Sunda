package mh;

import java.util.Arrays;
import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public final char[] f74621b;

    public g(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.f74621b = charArray;
        Arrays.sort(charArray);
    }

    @Override // mh.g0, mh.q1
    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return super.apply((Character) obj);
    }

    @Override // mh.g0
    public final void d(BitSet bitSet) {
        for (char c10 : this.f74621b) {
            bitSet.set(c10);
        }
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return Arrays.binarySearch(this.f74621b, c10) >= 0;
    }

    @Override // mh.g0
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c10 : this.f74621b) {
            sb2.append(g0.a(c10));
        }
        sb2.append("\")");
        return sb2.toString();
    }
}
