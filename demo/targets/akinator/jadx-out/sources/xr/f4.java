package xr;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f4 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f92498a = new Random();

    /* renamed from: b, reason: collision with root package name */
    public final long f92499b;

    /* renamed from: c, reason: collision with root package name */
    public final double f92500c;

    /* renamed from: d, reason: collision with root package name */
    public final double f92501d;

    /* renamed from: e, reason: collision with root package name */
    public long f92502e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements m0 {
        @Override // xr.m0
        public n0 get() {
            return new f4();
        }
    }

    public f4() {
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.f92499b = TimeUnit.MINUTES.toNanos(2L);
        this.f92500c = 1.6d;
        this.f92501d = 0.2d;
        this.f92502e = nanos;
    }

    @Override // xr.n0
    public long nextBackoffNanos() {
        long j10 = this.f92502e;
        double d10 = j10;
        this.f92502e = Math.min((long) (this.f92500c * d10), this.f92499b);
        double d11 = this.f92501d;
        double d12 = (-d11) * d10;
        double d13 = d11 * d10;
        mh.p1.checkArgument(d13 >= d12);
        return j10 + ((long) ((this.f92498a.nextDouble() * (d13 - d12)) + d12));
    }
}
