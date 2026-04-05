package qn;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements pn.q {

    /* renamed from: a, reason: collision with root package name */
    public final i f83386a;

    public o(i iVar) {
        this.f83386a = iVar;
    }

    @Override // pn.q
    public long getAvailableSegmentCount(long j10, long j11) {
        return 1L;
    }

    @Override // pn.q
    public long getFirstAvailableSegmentNum(long j10, long j11) {
        return 0L;
    }

    @Override // pn.q
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // pn.q
    public long getNextSegmentAvailableTimeUs(long j10, long j11) {
        return C.TIME_UNSET;
    }

    @Override // pn.q
    public long getSegmentCount(long j10) {
        return 1L;
    }

    @Override // pn.q
    public long getSegmentNum(long j10, long j11) {
        return 0L;
    }

    @Override // pn.q
    public i getSegmentUrl(long j10) {
        return this.f83386a;
    }

    @Override // pn.q
    public long getTimeUs(long j10) {
        return 0L;
    }

    @Override // pn.q
    public boolean isExplicit() {
        return true;
    }

    @Override // pn.q
    public long getDurationUs(long j10, long j11) {
        return j11;
    }
}
