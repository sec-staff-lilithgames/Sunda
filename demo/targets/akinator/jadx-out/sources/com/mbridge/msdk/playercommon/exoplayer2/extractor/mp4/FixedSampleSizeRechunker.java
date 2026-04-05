package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        private Results(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i10;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j10;
        }
    }

    private FixedSampleSizeRechunker() {
    }

    public static Results rechunk(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = 8192 / i10;
        int iCeilDivide = 0;
        for (int i12 : iArr) {
            iCeilDivide += Util.ceilDivide(i12, i11);
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
        return new Results(jArr2, iArr2, iMax, jArr3, iArr3, j10 * i13);
    }
}
