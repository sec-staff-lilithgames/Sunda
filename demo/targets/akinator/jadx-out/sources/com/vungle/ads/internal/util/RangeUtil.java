package com.vungle.ads.internal.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RangeUtil {
    public static final RangeUtil INSTANCE = new RangeUtil();

    private RangeUtil() {
    }

    public static /* synthetic */ boolean isInRange$default(RangeUtil rangeUtil, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return rangeUtil.isInRange(i10, i11, i12);
    }

    public final boolean isInRange(float f10, float f11, float f12) {
        return f11 <= f10 && f10 <= f12;
    }

    public static /* synthetic */ boolean isInRange$default(RangeUtil rangeUtil, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = Float.MAX_VALUE;
        }
        return rangeUtil.isInRange(f10, f11, f12);
    }

    public final boolean isInRange(int i10, int i11, int i12) {
        return i11 <= i10 && i10 <= i12;
    }
}
