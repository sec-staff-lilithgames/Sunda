package io.odeeo.internal.m;

import b0.e2;
import io.odeeo.internal.d.r;
import io.odeeo.internal.g.v;
import io.odeeo.internal.g.w;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long f64627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64628b;

    /* renamed from: c, reason: collision with root package name */
    public final long f64629c;

    /* renamed from: d, reason: collision with root package name */
    public final long f64630d;

    /* renamed from: e, reason: collision with root package name */
    public final long f64631e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f64632f;

    public g(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public static g create(long j10, long j11, r.a aVar, x xVar) {
        int unsignedIntToInt;
        int i10 = aVar.f63487g;
        int i11 = aVar.f63484d;
        int i12 = xVar.readInt();
        if ((i12 & 1) != 1 || (unsignedIntToInt = xVar.readUnsignedIntToInt()) == 0) {
            return null;
        }
        long jScaleLargeTimestamp = g0.scaleLargeTimestamp(unsignedIntToInt, i10 * 1000000, i11);
        if ((i12 & 6) != 6) {
            return new g(j11, aVar.f63483c, jScaleLargeTimestamp);
        }
        long unsignedInt = xVar.readUnsignedInt();
        long[] jArr = new long[100];
        for (int i13 = 0; i13 < 100; i13++) {
            jArr[i13] = xVar.readUnsignedByte();
        }
        if (j10 != -1) {
            long j12 = j11 + unsignedInt;
            if (j10 != j12) {
                StringBuilder sbR = e2.r(j10, "XING data size mismatch: ", ", ");
                sbR.append(j12);
                p.w("XingSeeker", sbR.toString());
            }
        }
        return new g(j11, aVar.f63483c, jScaleLargeTimestamp, unsignedInt, jArr);
    }

    public final long a(int i10) {
        return (this.f64629c * i10) / 100;
    }

    @Override // io.odeeo.internal.m.e
    public long getDataEndPosition() {
        return this.f64631e;
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public long getDurationUs() {
        return this.f64629c;
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public v.a getSeekPoints(long j10) {
        if (!isSeekable()) {
            return new v.a(new w(0L, this.f64627a + this.f64628b));
        }
        long jConstrainValue = g0.constrainValue(j10, 0L, this.f64629c);
        double d10 = (jConstrainValue * 100.0d) / this.f64629c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) io.odeeo.internal.q0.a.checkStateNotNull(this.f64632f))[i10];
                d11 = d12 + (((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12) * (d10 - i10));
            }
        }
        return new v.a(new w(jConstrainValue, this.f64627a + g0.constrainValue(Math.round((d11 / 256.0d) * this.f64630d), this.f64628b, this.f64630d - 1)));
    }

    @Override // io.odeeo.internal.m.e
    public long getTimeUs(long j10) {
        long j11 = j10 - this.f64627a;
        if (!isSeekable() || j11 <= this.f64628b) {
            return 0L;
        }
        long[] jArr = (long[]) io.odeeo.internal.q0.a.checkStateNotNull(this.f64632f);
        double d10 = (j11 * 256.0d) / this.f64630d;
        int iBinarySearchFloor = g0.binarySearchFloor(jArr, (long) d10, true, true);
        long jA = a(iBinarySearchFloor);
        long j12 = jArr[iBinarySearchFloor];
        int i10 = iBinarySearchFloor + 1;
        long jA2 = a(i10);
        return Math.round((j12 == (iBinarySearchFloor == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jA2 - jA)) + jA;
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public boolean isSeekable() {
        return this.f64632f != null;
    }

    public g(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f64627a = j10;
        this.f64628b = i10;
        this.f64629c = j11;
        this.f64632f = jArr;
        this.f64630d = j12;
        this.f64631e = j12 != -1 ? j10 + j12 : -1L;
    }
}
