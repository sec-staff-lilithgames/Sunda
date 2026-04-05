package io.odeeo.internal.g;

import io.odeeo.internal.g.v;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f64167a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f64168b;

    /* renamed from: c, reason: collision with root package name */
    public final long f64169c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f64170d;

    public t(long[] jArr, long[] jArr2, long j10) {
        io.odeeo.internal.q0.a.checkArgument(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f64170d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f64167a = jArr;
            this.f64168b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f64167a = jArr3;
            long[] jArr4 = new long[i10];
            this.f64168b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f64169c = j10;
    }

    @Override // io.odeeo.internal.g.v
    public long getDurationUs() {
        return this.f64169c;
    }

    @Override // io.odeeo.internal.g.v
    public v.a getSeekPoints(long j10) {
        if (!this.f64170d) {
            return new v.a(w.f64176c);
        }
        int iBinarySearchFloor = g0.binarySearchFloor(this.f64168b, j10, true, true);
        w wVar = new w(this.f64168b[iBinarySearchFloor], this.f64167a[iBinarySearchFloor]);
        if (wVar.f64177a == j10 || iBinarySearchFloor == this.f64168b.length - 1) {
            return new v.a(wVar);
        }
        int i10 = iBinarySearchFloor + 1;
        return new v.a(wVar, new w(this.f64168b[i10], this.f64167a[i10]));
    }

    @Override // io.odeeo.internal.g.v
    public boolean isSeekable() {
        return this.f64170d;
    }
}
