package nh;

import java.io.Serializable;
import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x2 extends a3 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final x2 f76753c = new x2(true);

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f76754e = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f76755f = BigInteger.valueOf(Long.MAX_VALUE);

    @Override // nh.a3
    public final Comparable a(Comparable comparable, long j10) {
        jh.i.p(j10);
        return ((BigInteger) comparable).add(BigInteger.valueOf(j10));
    }

    public String toString() {
        return "DiscreteDomain.bigIntegers()";
    }

    @Override // nh.a3
    public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger2.subtract(bigInteger).max(f76754e).min(f76755f).longValue();
    }

    @Override // nh.a3
    public BigInteger next(BigInteger bigInteger) {
        return bigInteger.add(BigInteger.ONE);
    }

    @Override // nh.a3
    public BigInteger previous(BigInteger bigInteger) {
        return bigInteger.subtract(BigInteger.ONE);
    }
}
