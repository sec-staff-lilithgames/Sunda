package pn;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final co.h f81564a;

    /* renamed from: b, reason: collision with root package name */
    public final qn.l f81565b;

    /* renamed from: c, reason: collision with root package name */
    public final qn.b f81566c;

    /* renamed from: d, reason: collision with root package name */
    public final q f81567d;

    /* renamed from: e, reason: collision with root package name */
    public final long f81568e;

    /* renamed from: f, reason: collision with root package name */
    public final long f81569f;

    public t(long j10, qn.l lVar, qn.b bVar, co.h hVar, long j11, q qVar) {
        this.f81568e = j10;
        this.f81565b = lVar;
        this.f81566c = bVar;
        this.f81569f = j11;
        this.f81564a = hVar;
        this.f81567d = qVar;
    }

    public final t a(qn.l lVar, long j10) throws ao.b {
        long segmentNum;
        long segmentNum2;
        q index = this.f81565b.getIndex();
        q index2 = lVar.getIndex();
        if (index == null) {
            return new t(j10, lVar, this.f81566c, this.f81564a, this.f81569f, index);
        }
        if (!index.isExplicit()) {
            return new t(j10, lVar, this.f81566c, this.f81564a, this.f81569f, index2);
        }
        long segmentCount = index.getSegmentCount(j10);
        if (segmentCount == 0) {
            return new t(j10, lVar, this.f81566c, this.f81564a, this.f81569f, index2);
        }
        io.bidmachine.media3.common.util.a.checkStateNotNull(index2);
        long firstSegmentNum = index.getFirstSegmentNum();
        long timeUs = index.getTimeUs(firstSegmentNum);
        long j11 = segmentCount + firstSegmentNum;
        long j12 = j11 - 1;
        long durationUs = index.getDurationUs(j12, j10) + index.getTimeUs(j12);
        long firstSegmentNum2 = index2.getFirstSegmentNum();
        long timeUs2 = index2.getTimeUs(firstSegmentNum2);
        long j13 = this.f81569f;
        if (durationUs == timeUs2) {
            segmentNum = j11 - firstSegmentNum2;
        } else {
            if (durationUs < timeUs2) {
                throw new ao.b();
            }
            if (timeUs2 < timeUs) {
                segmentNum2 = j13 - (index2.getSegmentNum(timeUs, j10) - firstSegmentNum);
                return new t(j10, lVar, this.f81566c, this.f81564a, segmentNum2, index2);
            }
            segmentNum = index.getSegmentNum(timeUs2, j10) - firstSegmentNum2;
        }
        segmentNum2 = segmentNum + j13;
        return new t(j10, lVar, this.f81566c, this.f81564a, segmentNum2, index2);
    }

    public long getFirstAvailableSegmentNum(long j10) {
        return ((q) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f81567d)).getFirstAvailableSegmentNum(this.f81568e, j10) + this.f81569f;
    }

    public long getFirstSegmentNum() {
        return ((q) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f81567d)).getFirstSegmentNum() + this.f81569f;
    }

    public long getLastAvailableSegmentNum(long j10) {
        return (((q) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f81567d)).getAvailableSegmentCount(this.f81568e, j10) + getFirstAvailableSegmentNum(j10)) - 1;
    }

    public long getSegmentCount() {
        return ((q) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f81567d)).getSegmentCount(this.f81568e);
    }

    public long getSegmentEndTimeUs(long j10) {
        return ((q) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f81567d)).getDurationUs(j10 - this.f81569f, this.f81568e) + getSegmentStartTimeUs(j10);
    }

    public long getSegmentNum(long j10) {
        return ((q) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f81567d)).getSegmentNum(j10, this.f81568e) + this.f81569f;
    }

    public long getSegmentStartTimeUs(long j10) {
        return ((q) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f81567d)).getTimeUs(j10 - this.f81569f);
    }

    public qn.i getSegmentUrl(long j10) {
        return ((q) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f81567d)).getSegmentUrl(j10 - this.f81569f);
    }

    public boolean isSegmentAvailableAtFullNetworkSpeed(long j10, long j11) {
        return ((q) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f81567d)).isExplicit() || j11 == C.TIME_UNSET || getSegmentEndTimeUs(j10) <= j11;
    }
}
