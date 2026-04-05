package rh;

import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f84371a = new long[37];

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f84372b = new int[37];

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f84373c = new int[37];

    static {
        BigInteger bigIntegerShiftLeft = BigInteger.ONE.shiftLeft(64);
        for (int i10 = 2; i10 <= 36; i10++) {
            long j10 = i10;
            f84371a[i10] = j0.divide(-1L, j10);
            f84372b[i10] = (int) j0.remainder(-1L, j10);
            f84373c[i10] = bigIntegerShiftLeft.toString(i10).length() - 1;
        }
    }
}
