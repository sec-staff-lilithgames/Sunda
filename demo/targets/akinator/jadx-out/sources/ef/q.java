package ef;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q extends ce.j implements j {

    /* renamed from: e, reason: collision with root package name */
    public j f54336e;

    /* renamed from: f, reason: collision with root package name */
    public long f54337f;

    @Override // ce.a
    public void clear() {
        super.clear();
        this.f54336e = null;
    }

    @Override // ef.j
    public List<b> getCues(long j10) {
        return ((j) com.google.android.exoplayer2.util.a.checkNotNull(this.f54336e)).getCues(j10 - this.f54337f);
    }

    @Override // ef.j
    public long getEventTime(int i10) {
        return ((j) com.google.android.exoplayer2.util.a.checkNotNull(this.f54336e)).getEventTime(i10) + this.f54337f;
    }

    @Override // ef.j
    public int getEventTimeCount() {
        return ((j) com.google.android.exoplayer2.util.a.checkNotNull(this.f54336e)).getEventTimeCount();
    }

    @Override // ef.j
    public int getNextEventTimeIndex(long j10) {
        return ((j) com.google.android.exoplayer2.util.a.checkNotNull(this.f54336e)).getNextEventTimeIndex(j10 - this.f54337f);
    }

    public void setContent(long j10, j jVar, long j11) {
        this.f12243c = j10;
        this.f54336e = jVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f54337f = j10;
    }
}
