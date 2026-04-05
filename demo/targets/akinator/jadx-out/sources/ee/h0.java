package ee;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f54195a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f54196b;

    public h0(long j10) {
        this(j10, 0L);
    }

    @Override // ee.i0
    public long getDurationUs() {
        return this.f54195a;
    }

    @Override // ee.i0
    public g0 getSeekPoints(long j10) {
        return this.f54196b;
    }

    @Override // ee.i0
    public boolean isSeekable() {
        return false;
    }

    public h0(long j10, long j11) {
        this.f54195a = j10;
        this.f54196b = new g0(j11 == 0 ? j0.f54210c : new j0(0L, j11));
    }
}
