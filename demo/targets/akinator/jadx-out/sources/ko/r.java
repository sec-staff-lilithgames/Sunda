package ko;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class r implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f71739a;

    /* renamed from: b, reason: collision with root package name */
    public final long f71740b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71741c;

    /* renamed from: d, reason: collision with root package name */
    public final long f71742d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71743e;

    /* renamed from: f, reason: collision with root package name */
    public final long f71744f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f71745g;

    public r(long j10, long j11, int i10, int i11) {
        this(j10, j11, i10, i11, false);
    }

    @Override // ko.y0
    public long getDurationUs() {
        return this.f71744f;
    }

    @Override // ko.y0
    public w0 getSeekPoints(long j10) {
        long j11 = this.f71742d;
        long j12 = this.f71740b;
        if (j11 == -1 && !this.f71745g) {
            return new w0(new z0(0L, j12));
        }
        int i10 = this.f71741c;
        long j13 = i10;
        long jMin = (((this.f71743e * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = j12 + Math.max(jMin, 0L);
        long timeUsAtPosition = getTimeUsAtPosition(jMax);
        z0 z0Var = new z0(timeUsAtPosition, jMax);
        if (j11 == -1 || timeUsAtPosition >= j10 || i10 + jMax >= this.f71739a) {
            return new w0(z0Var);
        }
        long j14 = jMax + i10;
        return new w0(z0Var, new z0(getTimeUsAtPosition(j14), j14));
    }

    public long getTimeUsAtPosition(long j10) {
        return (Math.max(0L, j10 - this.f71740b) * 8000000) / this.f71743e;
    }

    @Override // ko.y0
    public boolean isSeekable() {
        return this.f71742d != -1 || this.f71745g;
    }

    public r(long j10, long j11, int i10, int i11, boolean z10) {
        this.f71739a = j10;
        this.f71740b = j11;
        this.f71741c = i11 == -1 ? 1 : i11;
        this.f71743e = i10;
        this.f71745g = z10;
        if (j10 == -1) {
            this.f71742d = -1L;
            this.f71744f = C.TIME_UNSET;
        } else {
            long j12 = j10 - j11;
            this.f71742d = j12;
            this.f71744f = (Math.max(0L, j12) * 8000000) / i10;
        }
    }
}
