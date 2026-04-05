package ko;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b1 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f71610a;

    /* renamed from: b, reason: collision with root package name */
    public final long f71611b;

    public b1(long j10) {
        this(j10, 0L);
    }

    @Override // ko.y0
    public long getDurationUs() {
        return this.f71610a;
    }

    @Override // ko.y0
    public w0 getSeekPoints(long j10) {
        return new w0(new z0(j10, this.f71611b));
    }

    @Override // ko.y0
    public boolean isSeekable() {
        return true;
    }

    public b1(long j10, long j11) {
        this.f71610a = j10;
        this.f71611b = j11;
    }
}
