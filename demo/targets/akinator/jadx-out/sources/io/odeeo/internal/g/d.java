package io.odeeo.internal.g;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.g.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final long f64111a;

    /* renamed from: b, reason: collision with root package name */
    public final long f64112b;

    /* renamed from: c, reason: collision with root package name */
    public final int f64113c;

    /* renamed from: d, reason: collision with root package name */
    public final long f64114d;

    /* renamed from: e, reason: collision with root package name */
    public final int f64115e;

    /* renamed from: f, reason: collision with root package name */
    public final long f64116f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f64117g;

    public d(long j10, long j11, int i10, int i11) {
        this(j10, j11, i10, i11, false);
    }

    public static long a(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    @Override // io.odeeo.internal.g.v
    public long getDurationUs() {
        return this.f64116f;
    }

    @Override // io.odeeo.internal.g.v
    public v.a getSeekPoints(long j10) {
        if (this.f64114d == -1 && !this.f64117g) {
            return new v.a(new w(0L, this.f64112b));
        }
        long jA = a(j10);
        long timeUsAtPosition = getTimeUsAtPosition(jA);
        w wVar = new w(timeUsAtPosition, jA);
        if (this.f64114d != -1 && timeUsAtPosition < j10) {
            long j11 = jA + this.f64113c;
            if (j11 < this.f64111a) {
                return new v.a(wVar, new w(getTimeUsAtPosition(j11), j11));
            }
        }
        return new v.a(wVar);
    }

    public long getTimeUsAtPosition(long j10) {
        return a(j10, this.f64112b, this.f64115e);
    }

    @Override // io.odeeo.internal.g.v
    public boolean isSeekable() {
        return this.f64114d != -1 || this.f64117g;
    }

    public d(long j10, long j11, int i10, int i11, boolean z10) {
        this.f64111a = j10;
        this.f64112b = j11;
        this.f64113c = i11 == -1 ? 1 : i11;
        this.f64115e = i10;
        this.f64117g = z10;
        if (j10 == -1) {
            this.f64114d = -1L;
            this.f64116f = C.TIME_UNSET;
        } else {
            this.f64114d = j10 - j11;
            this.f64116f = a(j10, j11, i10);
        }
    }

    public final long a(long j10) {
        long j11 = this.f64113c;
        long jMin = (((j10 * this.f64115e) / 8000000) / j11) * j11;
        long j12 = this.f64114d;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - j11);
        }
        return this.f64112b + Math.max(jMin, 0L);
    }
}
