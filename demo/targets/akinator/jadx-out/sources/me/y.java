package me;

import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final v f74507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74508b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f74509c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f74510d;

    /* renamed from: e, reason: collision with root package name */
    public final int f74511e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f74512f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f74513g;

    /* renamed from: h, reason: collision with root package name */
    public final long f74514h;

    public y(v vVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(iArr.length == jArr2.length);
        com.google.android.exoplayer2.util.a.checkArgument(jArr.length == jArr2.length);
        com.google.android.exoplayer2.util.a.checkArgument(iArr2.length == jArr2.length);
        this.f74507a = vVar;
        this.f74509c = jArr;
        this.f74510d = iArr;
        this.f74511e = i10;
        this.f74512f = jArr2;
        this.f74513g = iArr2;
        this.f74514h = j10;
        this.f74508b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int getIndexOfEarlierOrEqualSynchronizationSample(long j10) {
        for (int iBinarySearchFloor = n1.binarySearchFloor(this.f74512f, j10, true, false); iBinarySearchFloor >= 0; iBinarySearchFloor--) {
            if ((this.f74513g[iBinarySearchFloor] & 1) != 0) {
                return iBinarySearchFloor;
            }
        }
        return -1;
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long j10) {
        long[] jArr = this.f74512f;
        for (int iBinarySearchCeil = n1.binarySearchCeil(jArr, j10, true, false); iBinarySearchCeil < jArr.length; iBinarySearchCeil++) {
            if ((this.f74513g[iBinarySearchCeil] & 1) != 0) {
                return iBinarySearchCeil;
            }
        }
        return -1;
    }
}
