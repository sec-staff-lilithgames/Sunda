package ee;

import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f54168a;

    /* renamed from: b, reason: collision with root package name */
    public final long f54169b;

    /* renamed from: c, reason: collision with root package name */
    public final long f54170c;

    /* renamed from: d, reason: collision with root package name */
    public long f54171d;

    /* renamed from: e, reason: collision with root package name */
    public long f54172e;

    /* renamed from: f, reason: collision with root package name */
    public long f54173f;

    /* renamed from: g, reason: collision with root package name */
    public long f54174g;

    /* renamed from: h, reason: collision with root package name */
    public long f54175h;

    public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f54168a = j10;
        this.f54169b = j11;
        this.f54171d = j12;
        this.f54172e = j13;
        this.f54173f = j14;
        this.f54174g = j15;
        this.f54170c = j16;
        this.f54175h = a(j11, j12, j13, j14, j15, j16);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return n1.constrainValue(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
    }
}
