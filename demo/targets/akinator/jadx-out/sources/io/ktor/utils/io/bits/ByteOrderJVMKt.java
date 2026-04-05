package io.ktor.utils.io.bits;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteOrderJVMKt {
    public static final short reverseByteOrder(short s10) {
        return Short.reverseBytes(s10);
    }

    public static final int reverseByteOrder(int i10) {
        return Integer.reverseBytes(i10);
    }

    public static final long reverseByteOrder(long j10) {
        return Long.reverseBytes(j10);
    }

    public static final float reverseByteOrder(float f10) {
        return Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f10)));
    }

    public static final double reverseByteOrder(double d10) {
        return Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d10)));
    }
}
