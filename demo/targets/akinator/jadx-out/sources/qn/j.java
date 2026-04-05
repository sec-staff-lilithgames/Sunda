package qn;

import java.util.List;
import qn.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class j extends l implements pn.q {

    /* renamed from: h, reason: collision with root package name */
    public final m.a f83353h;

    public j(long j10, io.bidmachine.media3.common.b bVar, List<b> list, m.a aVar, List<e> list2, List<e> list3, List<e> list4) {
        super(bVar, list, aVar, list2, list3, list4);
        this.f83353h = aVar;
    }

    @Override // pn.q
    public long getAvailableSegmentCount(long j10, long j11) {
        return this.f83353h.getAvailableSegmentCount(j10, j11);
    }

    @Override // qn.l
    public String getCacheKey() {
        return null;
    }

    @Override // pn.q
    public long getDurationUs(long j10, long j11) {
        return this.f83353h.getSegmentDurationUs(j10, j11);
    }

    @Override // pn.q
    public long getFirstAvailableSegmentNum(long j10, long j11) {
        return this.f83353h.getFirstAvailableSegmentNum(j10, j11);
    }

    @Override // pn.q
    public long getFirstSegmentNum() {
        return this.f83353h.getFirstSegmentNum();
    }

    @Override // qn.l
    public i getIndexUri() {
        return null;
    }

    @Override // pn.q
    public long getNextSegmentAvailableTimeUs(long j10, long j11) {
        return this.f83353h.getNextSegmentAvailableTimeUs(j10, j11);
    }

    @Override // pn.q
    public long getSegmentCount(long j10) {
        return this.f83353h.getSegmentCount(j10);
    }

    @Override // pn.q
    public long getSegmentNum(long j10, long j11) {
        return this.f83353h.getSegmentNum(j10, j11);
    }

    @Override // pn.q
    public i getSegmentUrl(long j10) {
        return this.f83353h.getSegmentUrl(this, j10);
    }

    @Override // pn.q
    public long getTimeUs(long j10) {
        return this.f83353h.getSegmentTimeUs(j10);
    }

    @Override // pn.q
    public boolean isExplicit() {
        return this.f83353h.isExplicit();
    }

    @Override // qn.l
    public pn.q getIndex() {
        return this;
    }
}
