package io.odeeo.internal.n;

import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final k f64896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64897b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f64898c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f64899d;

    /* renamed from: e, reason: collision with root package name */
    public final int f64900e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f64901f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f64902g;

    /* renamed from: h, reason: collision with root package name */
    public final long f64903h;

    public n(k kVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        io.odeeo.internal.q0.a.checkArgument(iArr.length == jArr2.length);
        io.odeeo.internal.q0.a.checkArgument(jArr.length == jArr2.length);
        io.odeeo.internal.q0.a.checkArgument(iArr2.length == jArr2.length);
        this.f64896a = kVar;
        this.f64898c = jArr;
        this.f64899d = iArr;
        this.f64900e = i10;
        this.f64901f = jArr2;
        this.f64902g = iArr2;
        this.f64903h = j10;
        this.f64897b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int getIndexOfEarlierOrEqualSynchronizationSample(long j10) {
        for (int iBinarySearchFloor = g0.binarySearchFloor(this.f64901f, j10, true, false); iBinarySearchFloor >= 0; iBinarySearchFloor--) {
            if ((this.f64902g[iBinarySearchFloor] & 1) != 0) {
                return iBinarySearchFloor;
            }
        }
        return -1;
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long j10) {
        for (int iBinarySearchCeil = g0.binarySearchCeil(this.f64901f, j10, true, false); iBinarySearchCeil < this.f64901f.length; iBinarySearchCeil++) {
            if ((this.f64902g[iBinarySearchCeil] & 1) != 0) {
                return iBinarySearchCeil;
            }
        }
        return -1;
    }
}
