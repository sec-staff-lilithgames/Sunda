package io.odeeo.internal.q;

import io.odeeo.internal.g.v;
import io.odeeo.internal.g.w;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final b f65828a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65829b;

    /* renamed from: c, reason: collision with root package name */
    public final long f65830c;

    /* renamed from: d, reason: collision with root package name */
    public final long f65831d;

    /* renamed from: e, reason: collision with root package name */
    public final long f65832e;

    public d(b bVar, int i10, long j10, long j11) {
        this.f65828a = bVar;
        this.f65829b = i10;
        this.f65830c = j10;
        long j12 = (j11 - j10) / bVar.f65823e;
        this.f65831d = j12;
        this.f65832e = a(j12);
    }

    public final long a(long j10) {
        return g0.scaleLargeTimestamp(j10 * this.f65829b, 1000000L, this.f65828a.f65821c);
    }

    @Override // io.odeeo.internal.g.v
    public long getDurationUs() {
        return this.f65832e;
    }

    @Override // io.odeeo.internal.g.v
    public v.a getSeekPoints(long j10) {
        long jConstrainValue = g0.constrainValue((this.f65828a.f65821c * j10) / (this.f65829b * 1000000), 0L, this.f65831d - 1);
        long j11 = (this.f65828a.f65823e * jConstrainValue) + this.f65830c;
        long jA = a(jConstrainValue);
        w wVar = new w(jA, j11);
        if (jA >= j10 || jConstrainValue == this.f65831d - 1) {
            return new v.a(wVar);
        }
        long j12 = jConstrainValue + 1;
        return new v.a(wVar, new w(a(j12), (this.f65828a.f65823e * j12) + this.f65830c));
    }

    @Override // io.odeeo.internal.g.v
    public boolean isSeekable() {
        return true;
    }
}
