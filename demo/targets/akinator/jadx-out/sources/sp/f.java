package sp;

import io.bidmachine.media3.common.util.a1;
import ko.w0;
import ko.y0;
import ko.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f86106a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86107b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86108c;

    /* renamed from: d, reason: collision with root package name */
    public final long f86109d;

    /* renamed from: e, reason: collision with root package name */
    public final long f86110e;

    public f(c cVar, int i10, long j10, long j11) {
        this.f86106a = cVar;
        this.f86107b = i10;
        this.f86108c = j10;
        long j12 = (j11 - j10) / cVar.f86101d;
        this.f86109d = j12;
        this.f86110e = a1.scaleLargeTimestamp(j12 * i10, 1000000L, cVar.f86100c);
    }

    @Override // ko.y0
    public long getDurationUs() {
        return this.f86110e;
    }

    @Override // ko.y0
    public w0 getSeekPoints(long j10) {
        c cVar = this.f86106a;
        int i10 = this.f86107b;
        long j11 = this.f86109d - 1;
        long jConstrainValue = a1.constrainValue((cVar.f86100c * j10) / (i10 * 1000000), 0L, j11);
        int i11 = cVar.f86101d;
        long j12 = this.f86108c;
        long jScaleLargeTimestamp = a1.scaleLargeTimestamp(jConstrainValue * i10, 1000000L, cVar.f86100c);
        z0 z0Var = new z0(jScaleLargeTimestamp, (i11 * jConstrainValue) + j12);
        if (jScaleLargeTimestamp >= j10 || jConstrainValue == j11) {
            return new w0(z0Var);
        }
        long j13 = jConstrainValue + 1;
        return new w0(z0Var, new z0(a1.scaleLargeTimestamp(j13 * i10, 1000000L, cVar.f86100c), (i11 * j13) + j12));
    }

    @Override // ko.y0
    public boolean isSeekable() {
        return true;
    }
}
