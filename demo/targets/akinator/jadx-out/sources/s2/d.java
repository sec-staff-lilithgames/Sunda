package s2;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static final long Constraints(int i10, int i11, int i12, int i13) {
        if (i11 < i10) {
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')').toString());
        }
        if (i13 >= i12) {
            if (i10 < 0 || i12 < 0) {
                throw new IllegalArgumentException(o2.i(i10, i12, "minWidth(", ") and minHeight(", ") must be >= 0").toString());
            }
            return c.f85320b.m6737createConstraintsZbe2FdA$ui_unit_release(i10, i11, i12, i13);
        }
        throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')').toString());
    }

    public static /* synthetic */ long Constraints$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return Constraints(i10, i11, i12, i13);
    }

    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m6769constrain4WqzIAM(long j10, long j11) {
        return w.IntSize(qv.v.coerceIn(v.m6972getWidthimpl(j11), c.m6757getMinWidthimpl(j10), c.m6755getMaxWidthimpl(j10)), qv.v.coerceIn(v.m6971getHeightimpl(j11), c.m6756getMinHeightimpl(j10), c.m6754getMaxHeightimpl(j10)));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m6770constrainN9IONVI(long j10, long j11) {
        return Constraints(qv.v.coerceIn(c.m6757getMinWidthimpl(j11), c.m6757getMinWidthimpl(j10), c.m6755getMaxWidthimpl(j10)), qv.v.coerceIn(c.m6755getMaxWidthimpl(j11), c.m6757getMinWidthimpl(j10), c.m6755getMaxWidthimpl(j10)), qv.v.coerceIn(c.m6756getMinHeightimpl(j11), c.m6756getMinHeightimpl(j10), c.m6754getMaxHeightimpl(j10)), qv.v.coerceIn(c.m6754getMaxHeightimpl(j11), c.m6756getMinHeightimpl(j10), c.m6754getMaxHeightimpl(j10)));
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m6771constrainHeightK40F9xA(long j10, int i10) {
        return qv.v.coerceIn(i10, c.m6756getMinHeightimpl(j10), c.m6754getMaxHeightimpl(j10));
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m6772constrainWidthK40F9xA(long j10, int i10) {
        return qv.v.coerceIn(i10, c.m6757getMinWidthimpl(j10), c.m6755getMaxWidthimpl(j10));
    }

    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m6773isSatisfiedBy4WqzIAM(long j10, long j11) {
        int iM6757getMinWidthimpl = c.m6757getMinWidthimpl(j10);
        int iM6755getMaxWidthimpl = c.m6755getMaxWidthimpl(j10);
        int iM6972getWidthimpl = v.m6972getWidthimpl(j11);
        if (iM6757getMinWidthimpl > iM6972getWidthimpl || iM6972getWidthimpl > iM6755getMaxWidthimpl) {
            return false;
        }
        int iM6756getMinHeightimpl = c.m6756getMinHeightimpl(j10);
        int iM6754getMaxHeightimpl = c.m6754getMaxHeightimpl(j10);
        int iM6971getHeightimpl = v.m6971getHeightimpl(j11);
        return iM6756getMinHeightimpl <= iM6971getHeightimpl && iM6971getHeightimpl <= iM6754getMaxHeightimpl;
    }

    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m6774offsetNN6EwU(long j10, int i10, int i11) {
        int iCoerceAtLeast = qv.v.coerceAtLeast(c.m6757getMinWidthimpl(j10) + i10, 0);
        int iM6755getMaxWidthimpl = c.m6755getMaxWidthimpl(j10);
        if (iM6755getMaxWidthimpl != Integer.MAX_VALUE) {
            iM6755getMaxWidthimpl = qv.v.coerceAtLeast(iM6755getMaxWidthimpl + i10, 0);
        }
        int iCoerceAtLeast2 = qv.v.coerceAtLeast(c.m6756getMinHeightimpl(j10) + i11, 0);
        int iM6754getMaxHeightimpl = c.m6754getMaxHeightimpl(j10);
        if (iM6754getMaxHeightimpl != Integer.MAX_VALUE) {
            iM6754getMaxHeightimpl = qv.v.coerceAtLeast(iM6754getMaxHeightimpl + i11, 0);
        }
        return Constraints(iCoerceAtLeast, iM6755getMaxWidthimpl, iCoerceAtLeast2, iM6754getMaxHeightimpl);
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m6775offsetNN6EwU$default(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m6774offsetNN6EwU(j10, i10, i11);
    }
}
