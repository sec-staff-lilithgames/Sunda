package iu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class x {
    public static boolean isPowerOfTwo(int i10) {
        return (i10 & (i10 + (-1))) == 0;
    }

    public static int roundToPowerOfTwo(int i10) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i10 - 1));
    }
}
