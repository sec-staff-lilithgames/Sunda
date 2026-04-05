package mh;

import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f0 extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final int f74612c = Integer.numberOfLeadingZeros(31);

    /* renamed from: e, reason: collision with root package name */
    public static final f0 f74613e = new f0("CharMatcher.whitespace()");

    @Override // mh.g0
    public final void d(BitSet bitSet) {
        for (int i10 = 0; i10 < 32; i10++) {
            bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i10));
        }
    }

    @Override // mh.g0
    public boolean matches(char c10) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f74612c) == c10;
    }
}
