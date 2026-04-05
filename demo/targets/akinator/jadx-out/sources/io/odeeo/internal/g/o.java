package io.odeeo.internal.g;

import io.odeeo.internal.g.p;
import io.odeeo.internal.g.v;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f64146a;

    /* renamed from: b, reason: collision with root package name */
    public final long f64147b;

    public o(p pVar, long j10) {
        this.f64146a = pVar;
        this.f64147b = j10;
    }

    public final w a(long j10, long j11) {
        return new w((j10 * 1000000) / this.f64146a.f64152e, this.f64147b + j11);
    }

    @Override // io.odeeo.internal.g.v
    public long getDurationUs() {
        return this.f64146a.getDurationUs();
    }

    @Override // io.odeeo.internal.g.v
    public v.a getSeekPoints(long j10) {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f64146a.f64158k);
        p pVar = this.f64146a;
        p.a aVar = pVar.f64158k;
        long[] jArr = aVar.f64160a;
        long[] jArr2 = aVar.f64161b;
        int iBinarySearchFloor = g0.binarySearchFloor(jArr, pVar.getSampleNumber(j10), true, false);
        w wVarA = a(iBinarySearchFloor == -1 ? 0L : jArr[iBinarySearchFloor], iBinarySearchFloor != -1 ? jArr2[iBinarySearchFloor] : 0L);
        if (wVarA.f64177a == j10 || iBinarySearchFloor == jArr.length - 1) {
            return new v.a(wVarA);
        }
        int i10 = iBinarySearchFloor + 1;
        return new v.a(wVarA, a(jArr[i10], jArr2[i10]));
    }

    @Override // io.odeeo.internal.g.v
    public boolean isSeekable() {
        return true;
    }
}
