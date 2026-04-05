package ep;

import com.applovin.shadow.okio.Segment;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class q {
    public static p rechunk(int i10, long[] jArr, int[] iArr, long j10) {
        int[] iArr2 = iArr;
        int i11 = Segment.SIZE / i10;
        int i12 = 0;
        int iCeilDivide = 0;
        for (int i13 : iArr2) {
            iCeilDivide += a1.ceilDivide(i13, i11);
        }
        long[] jArr2 = new long[iCeilDivide];
        int[] iArr3 = new int[iCeilDivide];
        long[] jArr3 = new long[iCeilDivide];
        int[] iArr4 = new int[iCeilDivide];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int iMax = 0;
        while (i12 < iArr2.length) {
            int i17 = iArr2[i12];
            long j11 = jArr[i12];
            while (i17 > 0) {
                int iMin = Math.min(i11, i17);
                jArr2[i16] = j11;
                int i18 = i10 * iMin;
                iArr3[i16] = i18;
                i15 += i18;
                iMax = Math.max(iMax, i18);
                jArr3[i16] = i14 * j10;
                iArr4[i16] = 1;
                j11 += iArr3[i16];
                i14 += iMin;
                i17 -= iMin;
                i16++;
                i11 = i11;
            }
            i12++;
            iArr2 = iArr;
        }
        return new p(jArr2, iArr3, iMax, jArr3, iArr4, j10 * i14, i15);
    }
}
