package r3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static int addExact(int i10, int i11) {
        int i12 = i10 + i11;
        if ((i10 >= 0) == (i11 >= 0)) {
            if ((i10 >= 0) != (i12 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i12;
    }

    public static float clamp(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    public static int decrementExact(int i10) {
        if (i10 != Integer.MIN_VALUE) {
            return i10 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return i10 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int multiplyExact(int i10, int i11) {
        int i12 = i10 * i11;
        if (i10 == 0 || i11 == 0 || (i12 / i10 == i11 && i12 / i11 == i10)) {
            return i12;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int negateExact(int i10) {
        if (i10 != Integer.MIN_VALUE) {
            return -i10;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int subtractExact(int i10, int i11) {
        int i12 = i10 - i11;
        if ((i10 < 0) != (i11 < 0)) {
            if ((i10 < 0) != (i12 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i12;
    }

    public static int toIntExact(long j10) {
        if (j10 > 2147483647L || j10 < -2147483648L) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) j10;
    }

    public static long addExact(long j10, long j11) {
        long j12 = j10 + j11;
        if ((j10 >= 0) == (j11 >= 0)) {
            if ((j10 >= 0) != (j12 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j12;
    }

    public static double clamp(double d10, double d11, double d12) {
        return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
    }

    public static long decrementExact(long j10) {
        if (j10 != Long.MIN_VALUE) {
            return j10 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long j10) {
        if (j10 != Long.MAX_VALUE) {
            return j10 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long negateExact(long j10) {
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long subtractExact(long j10, long j11) {
        long j12 = j10 - j11;
        if ((j10 < 0) != (j11 < 0)) {
            if ((j10 < 0) != (j12 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j12;
    }

    public static int clamp(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static long multiplyExact(long j10, long j11) {
        long j12 = j10 * j11;
        if (j10 == 0 || j11 == 0 || (j12 / j10 == j11 && j12 / j11 == j10)) {
            return j12;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long clamp(long j10, long j11, long j12) {
        return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
    }
}
