package pn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface q {
    long getAvailableSegmentCount(long j10, long j11);

    long getDurationUs(long j10, long j11);

    long getFirstAvailableSegmentNum(long j10, long j11);

    long getFirstSegmentNum();

    long getNextSegmentAvailableTimeUs(long j10, long j11);

    long getSegmentCount(long j10);

    long getSegmentNum(long j10, long j11);

    qn.i getSegmentUrl(long j10);

    long getTimeUs(long j10);

    boolean isExplicit();
}
