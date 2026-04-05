package pe;

import com.google.android.exoplayer2.util.n1;
import ee.g0;
import ee.i0;
import ee.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f80991a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80992b;

    /* renamed from: c, reason: collision with root package name */
    public final long f80993c;

    /* renamed from: d, reason: collision with root package name */
    public final long f80994d;

    /* renamed from: e, reason: collision with root package name */
    public final long f80995e;

    public g(d dVar, int i10, long j10, long j11) {
        this.f80991a = dVar;
        this.f80992b = i10;
        this.f80993c = j10;
        long j12 = (j11 - j10) / dVar.f80986d;
        this.f80994d = j12;
        this.f80995e = n1.scaleLargeTimestamp(j12 * i10, 1000000L, dVar.f80985c);
    }

    @Override // ee.i0
    public long getDurationUs() {
        return this.f80995e;
    }

    @Override // ee.i0
    public g0 getSeekPoints(long j10) {
        d dVar = this.f80991a;
        int i10 = this.f80992b;
        long j11 = this.f80994d - 1;
        long jConstrainValue = n1.constrainValue((dVar.f80985c * j10) / (i10 * 1000000), 0L, j11);
        int i11 = dVar.f80986d;
        long j12 = this.f80993c;
        long jScaleLargeTimestamp = n1.scaleLargeTimestamp(jConstrainValue * i10, 1000000L, dVar.f80985c);
        j0 j0Var = new j0(jScaleLargeTimestamp, (i11 * jConstrainValue) + j12);
        if (jScaleLargeTimestamp >= j10 || jConstrainValue == j11) {
            return new g0(j0Var);
        }
        long j13 = jConstrainValue + 1;
        return new g0(j0Var, new j0(n1.scaleLargeTimestamp(j13 * i10, 1000000L, dVar.f80985c), (i11 * j13) + j12));
    }

    @Override // ee.i0
    public boolean isSeekable() {
        return true;
    }
}
