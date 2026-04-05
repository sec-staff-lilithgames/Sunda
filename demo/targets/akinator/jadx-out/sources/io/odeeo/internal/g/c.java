package io.odeeo.internal.g;

import io.odeeo.internal.g.v;
import io.odeeo.internal.q0.g0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f64105a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f64106b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f64107c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f64108d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f64109e;

    /* renamed from: f, reason: collision with root package name */
    public final long f64110f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f64106b = iArr;
        this.f64107c = jArr;
        this.f64108d = jArr2;
        this.f64109e = jArr3;
        int length = iArr.length;
        this.f64105a = length;
        if (length <= 0) {
            this.f64110f = 0L;
        } else {
            int i10 = length - 1;
            this.f64110f = jArr2[i10] + jArr3[i10];
        }
    }

    public int getChunkIndex(long j10) {
        return g0.binarySearchFloor(this.f64109e, j10, true, true);
    }

    @Override // io.odeeo.internal.g.v
    public long getDurationUs() {
        return this.f64110f;
    }

    @Override // io.odeeo.internal.g.v
    public v.a getSeekPoints(long j10) {
        int chunkIndex = getChunkIndex(j10);
        w wVar = new w(this.f64109e[chunkIndex], this.f64107c[chunkIndex]);
        if (wVar.f64177a >= j10 || chunkIndex == this.f64105a - 1) {
            return new v.a(wVar);
        }
        int i10 = chunkIndex + 1;
        return new v.a(wVar, new w(this.f64109e[i10], this.f64107c[i10]));
    }

    @Override // io.odeeo.internal.g.v
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f64105a + ", sizes=" + Arrays.toString(this.f64106b) + ", offsets=" + Arrays.toString(this.f64107c) + ", timeUs=" + Arrays.toString(this.f64109e) + ", durationsUs=" + Arrays.toString(this.f64108d) + ")";
    }
}
