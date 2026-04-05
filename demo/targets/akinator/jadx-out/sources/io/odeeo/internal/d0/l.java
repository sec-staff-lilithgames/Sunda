package io.odeeo.internal.d0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class l extends io.odeeo.internal.e.h implements f {

    /* renamed from: d, reason: collision with root package name */
    public f f63603d;

    /* renamed from: e, reason: collision with root package name */
    public long f63604e;

    @Override // io.odeeo.internal.e.a
    public void clear() {
        super.clear();
        this.f63603d = null;
    }

    @Override // io.odeeo.internal.d0.f
    public List<a> getCues(long j10) {
        return ((f) io.odeeo.internal.q0.a.checkNotNull(this.f63603d)).getCues(j10 - this.f63604e);
    }

    @Override // io.odeeo.internal.d0.f
    public long getEventTime(int i10) {
        return ((f) io.odeeo.internal.q0.a.checkNotNull(this.f63603d)).getEventTime(i10) + this.f63604e;
    }

    @Override // io.odeeo.internal.d0.f
    public int getEventTimeCount() {
        return ((f) io.odeeo.internal.q0.a.checkNotNull(this.f63603d)).getEventTimeCount();
    }

    @Override // io.odeeo.internal.d0.f
    public int getNextEventTimeIndex(long j10) {
        return ((f) io.odeeo.internal.q0.a.checkNotNull(this.f63603d)).getNextEventTimeIndex(j10 - this.f63604e);
    }

    public void setContent(long j10, f fVar, long j11) {
        this.f63713b = j10;
        this.f63603d = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f63604e = j10;
    }
}
