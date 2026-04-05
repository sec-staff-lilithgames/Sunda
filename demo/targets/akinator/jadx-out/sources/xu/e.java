package xu;

import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e extends d {
    public static <T extends Comparable<? super T>> T maxOf(T a10, T b10) {
        e0.checkNotNullParameter(a10, "a");
        e0.checkNotNullParameter(b10, "b");
        return a10.compareTo(b10) >= 0 ? a10 : b10;
    }

    public static final <T extends Comparable<? super T>> T minOf(T a10, T b10) {
        e0.checkNotNullParameter(a10, "a");
        e0.checkNotNullParameter(b10, "b");
        return a10.compareTo(b10) <= 0 ? a10 : b10;
    }

    public static final <T extends Comparable<? super T>> T maxOf(T a10, T b10, T c10) {
        e0.checkNotNullParameter(a10, "a");
        e0.checkNotNullParameter(b10, "b");
        e0.checkNotNullParameter(c10, "c");
        return (T) maxOf(a10, maxOf(b10, c10));
    }

    public static final <T extends Comparable<? super T>> T minOf(T a10, T b10, T c10) {
        e0.checkNotNullParameter(a10, "a");
        e0.checkNotNullParameter(b10, "b");
        e0.checkNotNullParameter(c10, "c");
        return (T) minOf(a10, minOf(b10, c10));
    }

    public static final <T extends Comparable<? super T>> T maxOf(T a10, T... other) {
        e0.checkNotNullParameter(a10, "a");
        e0.checkNotNullParameter(other, "other");
        for (T t10 : other) {
            a10 = (T) maxOf(a10, t10);
        }
        return a10;
    }

    public static final <T extends Comparable<? super T>> T minOf(T a10, T... tArr) {
        e0.checkNotNullParameter(a10, "a");
        e0.checkNotNullParameter(tArr, SUvoXnn.ZxLeZPWvHkjl);
        for (T t10 : tArr) {
            a10 = (T) minOf(a10, t10);
        }
        return a10;
    }

    public static final byte maxOf(byte b10, byte... other) {
        e0.checkNotNullParameter(other, "other");
        for (byte b11 : other) {
            b10 = (byte) Math.max((int) b10, (int) b11);
        }
        return b10;
    }

    public static final byte minOf(byte b10, byte... other) {
        e0.checkNotNullParameter(other, "other");
        for (byte b11 : other) {
            b10 = (byte) Math.min((int) b10, (int) b11);
        }
        return b10;
    }

    public static final short maxOf(short s10, short... other) {
        e0.checkNotNullParameter(other, "other");
        for (short s11 : other) {
            s10 = (short) Math.max((int) s10, (int) s11);
        }
        return s10;
    }

    public static final short minOf(short s10, short... other) {
        e0.checkNotNullParameter(other, "other");
        for (short s11 : other) {
            s10 = (short) Math.min((int) s10, (int) s11);
        }
        return s10;
    }

    public static int maxOf(int i10, int... other) {
        e0.checkNotNullParameter(other, "other");
        for (int i11 : other) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    public static final int minOf(int i10, int... other) {
        e0.checkNotNullParameter(other, "other");
        for (int i11 : other) {
            i10 = Math.min(i10, i11);
        }
        return i10;
    }

    public static final long maxOf(long j10, long... other) {
        e0.checkNotNullParameter(other, "other");
        for (long j11 : other) {
            j10 = Math.max(j10, j11);
        }
        return j10;
    }

    public static final long minOf(long j10, long... other) {
        e0.checkNotNullParameter(other, "other");
        for (long j11 : other) {
            j10 = Math.min(j10, j11);
        }
        return j10;
    }

    public static float maxOf(float f10, float... other) {
        e0.checkNotNullParameter(other, "other");
        for (float f11 : other) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    public static float minOf(float f10, float... other) {
        e0.checkNotNullParameter(other, "other");
        for (float f11 : other) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }

    public static final double maxOf(double d10, double... other) {
        e0.checkNotNullParameter(other, "other");
        for (double d11 : other) {
            d10 = Math.max(d10, d11);
        }
        return d10;
    }

    public static final double minOf(double d10, double... other) {
        e0.checkNotNullParameter(other, "other");
        for (double d11 : other) {
            d10 = Math.min(d10, d11);
        }
        return d10;
    }
}
