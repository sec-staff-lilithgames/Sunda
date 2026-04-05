package pn;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s implements q {

    /* renamed from: a, reason: collision with root package name */
    public final ko.q f81562a;

    /* renamed from: b, reason: collision with root package name */
    public final long f81563b;

    public s(ko.q qVar, long j10) {
        this.f81562a = qVar;
        this.f81563b = j10;
    }

    @Override // pn.q
    public long getAvailableSegmentCount(long j10, long j11) {
        return this.f81562a.f71730a;
    }

    @Override // pn.q
    public long getDurationUs(long j10, long j11) {
        return this.f81562a.f71733d[(int) j10];
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
        return this.f81562a.f71730a;
    }

    @Override // pn.q
    public long getSegmentNum(long j10, long j11) {
        return this.f81562a.getChunkIndex(j10 + this.f81563b);
    }

    @Override // pn.q
    public qn.i getSegmentUrl(long j10) {
        return new qn.i(null, this.f81562a.f71732c[(int) j10], r1.f71731b[r7]);
    }

    @Override // pn.q
    public long getTimeUs(long j10) {
        return this.f81562a.f71734e[(int) j10] - this.f81563b;
    }

    @Override // pn.q
    public boolean isExplicit() {
        return true;
    }
}
