package m2;

import g2.a2;
import g2.b2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m5585updateRangeAfterDeletepWDy79M(long j10, long j11) {
        int iM3956getLengthimpl;
        int iM3958getMinimpl = a2.m3958getMinimpl(j10);
        int iM3957getMaximpl = a2.m3957getMaximpl(j10);
        if (a2.m3962intersects5zctL8(j11, j10)) {
            if (a2.m3950contains5zctL8(j11, j10)) {
                iM3958getMinimpl = a2.m3958getMinimpl(j11);
                iM3957getMaximpl = iM3958getMinimpl;
            } else {
                if (a2.m3950contains5zctL8(j10, j11)) {
                    iM3956getLengthimpl = a2.m3956getLengthimpl(j11);
                } else if (a2.m3951containsimpl(j11, iM3958getMinimpl)) {
                    iM3958getMinimpl = a2.m3958getMinimpl(j11);
                    iM3956getLengthimpl = a2.m3956getLengthimpl(j11);
                } else {
                    iM3957getMaximpl = a2.m3958getMinimpl(j11);
                }
                iM3957getMaximpl -= iM3956getLengthimpl;
            }
        } else if (iM3957getMaximpl > a2.m3958getMinimpl(j11)) {
            iM3958getMinimpl -= a2.m3956getLengthimpl(j11);
            iM3956getLengthimpl = a2.m3956getLengthimpl(j11);
            iM3957getMaximpl -= iM3956getLengthimpl;
        }
        return b2.TextRange(iM3958getMinimpl, iM3957getMaximpl);
    }
}
