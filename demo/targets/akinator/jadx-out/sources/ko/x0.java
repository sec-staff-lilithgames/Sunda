package ko;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class x0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f71799a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f71800b;

    public x0(long j10) {
        this(j10, 0L);
    }

    @Override // ko.y0
    public long getDurationUs() {
        return this.f71799a;
    }

    @Override // ko.y0
    public w0 getSeekPoints(long j10) {
        return this.f71800b;
    }

    @Override // ko.y0
    public boolean isSeekable() {
        return false;
    }

    public x0(long j10, long j11) {
        this.f71799a = j10;
        this.f71800b = new w0(j11 == 0 ? z0.f71810c : new z0(0L, j11));
    }
}
