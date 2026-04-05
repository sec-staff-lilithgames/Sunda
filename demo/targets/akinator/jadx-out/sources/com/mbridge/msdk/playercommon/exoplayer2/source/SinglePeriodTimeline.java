package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SinglePeriodTimeline extends Timeline {
    private static final Object UID = new Object();
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final Object tag;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;

    public SinglePeriodTimeline(long j10, boolean z10, boolean z11) {
        this(j10, z10, z11, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
        Assertions.checkIndex(i10, 0, 1);
        return period.set(null, z10 ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getPeriodCount() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[PHI: r1
      0x0031: PHI (r1v4 long) = (r1v3 long), (r1v3 long), (r1v7 long) binds: [B:8:0x0015, B:10:0x001b, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.playercommon.exoplayer2.Timeline.Window getWindow(int r19, com.mbridge.msdk.playercommon.exoplayer2.Timeline.Window r20, boolean r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 1
            r3 = r19
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkIndex(r3, r1, r2)
            if (r21 == 0) goto Lf
            java.lang.Object r1 = r0.tag
        Ld:
            r3 = r1
            goto L11
        Lf:
            r1 = 0
            goto Ld
        L11:
            long r1 = r0.windowDefaultStartPositionUs
            boolean r9 = r0.isDynamic
            if (r9 == 0) goto L31
            r4 = 0
            int r4 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r4 == 0) goto L31
            long r4 = r0.windowDurationUs
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L29
            goto L2f
        L29:
            long r1 = r1 + r22
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L31
        L2f:
            r10 = r6
            goto L32
        L31:
            r10 = r1
        L32:
            long r4 = r0.presentationStartTimeMs
            long r6 = r0.windowStartTimeMs
            boolean r8 = r0.isSeekable
            long r12 = r0.windowDurationUs
            long r1 = r0.windowPositionInPeriodUs
            r14 = 0
            r15 = 0
            r16 = r1
            r2 = r20
            com.mbridge.msdk.playercommon.exoplayer2.Timeline$Window r1 = r2.set(r3, r4, r6, r8, r9, r10, r12, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.source.SinglePeriodTimeline.getWindow(int, com.mbridge.msdk.playercommon.exoplayer2.Timeline$Window, boolean, long):com.mbridge.msdk.playercommon.exoplayer2.Timeline$Window");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j10, boolean z10, boolean z11, Object obj) {
        this(j10, j10, 0L, 0L, z10, z11, obj);
    }

    public SinglePeriodTimeline(long j10, long j11, long j12, long j13, boolean z10, boolean z11, Object obj) {
        this(C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, j13, z10, z11, obj);
    }

    public SinglePeriodTimeline(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, Object obj) {
        this.presentationStartTimeMs = j10;
        this.windowStartTimeMs = j11;
        this.periodDurationUs = j12;
        this.windowDurationUs = j13;
        this.windowPositionInPeriodUs = j14;
        this.windowDefaultStartPositionUs = j15;
        this.isSeekable = z10;
        this.isDynamic = z11;
        this.tag = obj;
    }
}
