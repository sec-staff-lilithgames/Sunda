package hp;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class o extends nn.i implements i {

    /* renamed from: f, reason: collision with root package name */
    public i f59122f;

    /* renamed from: g, reason: collision with root package name */
    public long f59123g;

    @Override // nn.i, nn.a
    public void clear() {
        super.clear();
        this.f59122f = null;
    }

    @Override // hp.i
    public List<in.b> getCues(long j10) {
        return ((i) io.bidmachine.media3.common.util.a.checkNotNull(this.f59122f)).getCues(j10 - this.f59123g);
    }

    @Override // hp.i
    public long getEventTime(int i10) {
        return ((i) io.bidmachine.media3.common.util.a.checkNotNull(this.f59122f)).getEventTime(i10) + this.f59123g;
    }

    @Override // hp.i
    public int getEventTimeCount() {
        return ((i) io.bidmachine.media3.common.util.a.checkNotNull(this.f59122f)).getEventTimeCount();
    }

    @Override // hp.i
    public int getNextEventTimeIndex(long j10) {
        return ((i) io.bidmachine.media3.common.util.a.checkNotNull(this.f59122f)).getNextEventTimeIndex(j10 - this.f59123g);
    }

    public void setContent(long j10, i iVar, long j11) {
        this.f77086c = j10;
        this.f59122f = iVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f59123g = j10;
    }
}
