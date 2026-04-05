package t2;

import mv.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static final float lerp(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }

    public static final int lerp(int i10, int i11, float f10) {
        return d.roundToInt((i11 - i10) * f10) + i10;
    }

    public static final long lerp(long j10, long j11, float f10) {
        return d.roundToLong((j11 - j10) * f10) + j10;
    }
}
