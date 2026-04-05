package ee;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f54203a;

    /* renamed from: b, reason: collision with root package name */
    public final long f54204b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54205c;

    /* renamed from: d, reason: collision with root package name */
    public final long f54206d;

    /* renamed from: e, reason: collision with root package name */
    public final int f54207e;

    /* renamed from: f, reason: collision with root package name */
    public final long f54208f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f54209g;

    public j(long j10, long j11, int i10, int i11) {
        this(j10, j11, i10, i11, false);
    }

    @Override // ee.i0
    public long getDurationUs() {
        return this.f54208f;
    }

    @Override // ee.i0
    public g0 getSeekPoints(long j10) {
        long j11 = this.f54206d;
        long j12 = this.f54204b;
        if (j11 == -1 && !this.f54209g) {
            return new g0(new j0(0L, j12));
        }
        int i10 = this.f54205c;
        long j13 = i10;
        long jMin = (((this.f54207e * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = j12 + Math.max(jMin, 0L);
        long timeUsAtPosition = getTimeUsAtPosition(jMax);
        j0 j0Var = new j0(timeUsAtPosition, jMax);
        if (j11 == -1 || timeUsAtPosition >= j10 || i10 + jMax >= this.f54203a) {
            return new g0(j0Var);
        }
        long j14 = jMax + i10;
        return new g0(j0Var, new j0(getTimeUsAtPosition(j14), j14));
    }

    public long getTimeUsAtPosition(long j10) {
        return (Math.max(0L, j10 - this.f54204b) * 8000000) / this.f54207e;
    }

    @Override // ee.i0
    public boolean isSeekable() {
        return this.f54206d != -1 || this.f54209g;
    }

    public j(long j10, long j11, int i10, int i11, boolean z10) {
        this.f54203a = j10;
        this.f54204b = j11;
        this.f54205c = i11 == -1 ? 1 : i11;
        this.f54207e = i10;
        this.f54209g = z10;
        if (j10 == -1) {
            this.f54206d = -1L;
            this.f54208f = C.TIME_UNSET;
        } else {
            long j12 = j10 - j11;
            this.f54206d = j12;
            this.f54208f = (Math.max(0L, j12) * 8000000) / i10;
        }
    }
}
