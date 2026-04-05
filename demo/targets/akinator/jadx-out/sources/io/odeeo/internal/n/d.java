package io.odeeo.internal.n;

import com.applovin.shadow.okio.Segment;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f64773a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f64774b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64775c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f64776d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f64777e;

        /* renamed from: f, reason: collision with root package name */
        public final long f64778f;

        public b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f64773a = jArr;
            this.f64774b = iArr;
            this.f64775c = i10;
            this.f64776d = jArr2;
            this.f64777e = iArr2;
            this.f64778f = j10;
        }
    }

    public static b rechunk(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = Segment.SIZE / i10;
        int iCeilDivide = 0;
        for (int i12 : iArr) {
            iCeilDivide += g0.ceilDivide(i12, i11);
        }
        long[] jArr2 = new long[iCeilDivide];
        int[] iArr2 = new int[iCeilDivide];
        long[] jArr3 = new long[iCeilDivide];
        int[] iArr3 = new int[iCeilDivide];
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            long j11 = jArr[i15];
            while (i16 > 0) {
                int iMin = Math.min(i11, i16);
                jArr2[i14] = j11;
                int i17 = i10 * iMin;
                iArr2[i14] = i17;
                iMax = Math.max(iMax, i17);
                jArr3[i14] = i13 * j10;
                iArr3[i14] = 1;
                j11 += iArr2[i14];
                i13 += iMin;
                i16 -= iMin;
                i14++;
            }
        }
        return new b(jArr2, iArr2, iMax, jArr3, iArr3, j10 * i13);
    }
}
