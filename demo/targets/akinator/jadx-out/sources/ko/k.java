package ko;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f71681a;

    /* renamed from: b, reason: collision with root package name */
    public final long f71682b;

    /* renamed from: c, reason: collision with root package name */
    public final long f71683c;

    /* renamed from: d, reason: collision with root package name */
    public long f71684d;

    /* renamed from: e, reason: collision with root package name */
    public long f71685e;

    /* renamed from: f, reason: collision with root package name */
    public long f71686f;

    /* renamed from: g, reason: collision with root package name */
    public long f71687g;

    /* renamed from: h, reason: collision with root package name */
    public long f71688h;

    public k(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f71681a = j10;
        this.f71682b = j11;
        this.f71684d = j12;
        this.f71685e = j13;
        this.f71686f = j14;
        this.f71687g = j15;
        this.f71683c = j16;
        this.f71688h = a(j11, j12, j13, j14, j15, j16);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return io.bidmachine.media3.common.util.a1.constrainValue(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
    }
}
