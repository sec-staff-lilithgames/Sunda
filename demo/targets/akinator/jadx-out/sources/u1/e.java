package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f87545a;

    /* renamed from: b, reason: collision with root package name */
    public final long f87546b;

    public e(long j10, long j11, kotlin.jvm.internal.u uVar) {
        this.f87545a = j10;
        this.f87546b = j11;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m7301getPositionF1C5BW0() {
        return this.f87546b;
    }

    public final long getUptimeMillis() {
        return this.f87545a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f87545a + ", position=" + ((Object) i1.h.m4193toStringimpl(this.f87546b)) + ')';
    }
}
