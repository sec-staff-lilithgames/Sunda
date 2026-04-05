package s2;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {
    public b(kotlin.jvm.internal.u uVar) {
    }

    public static int a(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        if (i10 < 262143) {
            return 18;
        }
        throw new IllegalArgumentException(o2.k(i10, "Can't represent a size of ", " in Constraints"));
    }

    /* renamed from: createConstraints-Zbe2FdA$ui_unit_release, reason: not valid java name */
    public final long m6737createConstraintsZbe2FdA$ui_unit_release(int i10, int i11, int i12, int i13) {
        long j10;
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iA = a(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iA2 = a(i15);
        if (iA + iA2 > 31) {
            throw new IllegalArgumentException(o2.i(i15, i14, "Can't represent a width of ", " and height of ", " in Constraints"));
        }
        if (iA2 == 13) {
            j10 = 3;
        } else if (iA2 == 18) {
            j10 = 1;
        } else if (iA2 == 15) {
            j10 = 2;
        } else {
            if (iA2 != 16) {
                throw new IllegalStateException("Should only have the provided constants.");
            }
            j10 = 0;
        }
        int i16 = i11 == Integer.MAX_VALUE ? 0 : i11 + 1;
        int i17 = i13 != Integer.MAX_VALUE ? i13 + 1 : 0;
        int i18 = c.f85321c[(int) j10];
        return c.m6745constructorimpl((i16 << 33) | j10 | (i10 << 2) | (i12 << i18) | (i17 << (i18 + 31)));
    }

    /* renamed from: fixed-JhjzzOo, reason: not valid java name */
    public final long m6738fixedJhjzzOo(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(o2.i(i10, i11, "width(", ") and height(", ") must be >= 0").toString());
        }
        return m6737createConstraintsZbe2FdA$ui_unit_release(i10, i10, i11, i11);
    }

    /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
    public final long m6739fixedHeightOenEA2s(int i10) {
        if (i10 >= 0) {
            return m6737createConstraintsZbe2FdA$ui_unit_release(0, Integer.MAX_VALUE, i10, i10);
        }
        throw new IllegalArgumentException(o2.k(i10, "height(", ") must be >= 0").toString());
    }

    /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
    public final long m6740fixedWidthOenEA2s(int i10) {
        if (i10 >= 0) {
            return m6737createConstraintsZbe2FdA$ui_unit_release(i10, i10, 0, Integer.MAX_VALUE);
        }
        throw new IllegalArgumentException(o2.k(i10, "width(", ") must be >= 0").toString());
    }
}
