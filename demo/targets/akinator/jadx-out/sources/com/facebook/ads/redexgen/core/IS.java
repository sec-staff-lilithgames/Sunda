package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Segment;

/* loaded from: assets/audience_network.dex */
public abstract class IS {
    public static String[] A00 = {"oZj5aoX1KvbFHq33YkjSnnR9n2", "YrN4", "d5f6mUL", "wzC2np4aQz", "bSG0VkmAa5PTnnRqB4khFtTiUFve1XQW", "Qyz6G41qMcU917EtFwNhHmzpy", "Reep", "5AjdKovxhleFLdRt3FcvPVZSBJ"};

    public static IR A00(int i10, long[] jArr, int[] iArr, long j10) {
        int chunkSamplesRemaining = Segment.SIZE / i10;
        int iA05 = 0;
        for (int i11 : iArr) {
            iA05 += AbstractC09264a.A05(i11, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[iA05];
        int[] iArr2 = new int[iA05];
        int originalSampleIndex = 0;
        long[] timestamps = new long[iA05];
        int[] flags = new int[iA05];
        int i12 = 0;
        int bufferSampleCount = 0;
        int i13 = 0;
        String[] strArr = A00;
        String str = strArr[2];
        String str2 = strArr[3];
        int maxSampleCount = str.length();
        if (maxSampleCount != str2.length()) {
            String[] strArr2 = A00;
            strArr2[2] = "OG99HZu";
            strArr2[3] = "ptKGW28cJb";
            while (true) {
                int rechunkedSampleCount = iArr.length;
                String[] strArr3 = A00;
                String str3 = strArr3[2];
                String str4 = strArr3[3];
                int maxSampleCount2 = str3.length();
                if (maxSampleCount2 == str4.length()) {
                    break;
                }
                A00[5] = "uTdlUcyBkPhiZ9U2ydDZL";
                if (i13 < rechunkedSampleCount) {
                    int rechunkedSampleCount2 = iArr[i13];
                    int maxSampleCount3 = A00[5].length();
                    if (maxSampleCount3 == 5) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A00;
                    strArr4[2] = "PmQbGcH";
                    strArr4[3] = "fT2ewQCR49";
                    long j11 = jArr[i13];
                    while (rechunkedSampleCount2 > 0) {
                        int maximumSize = Math.min(chunkSamplesRemaining, rechunkedSampleCount2);
                        jArr2[bufferSampleCount] = j11;
                        iArr2[bufferSampleCount] = i10 * maximumSize;
                        originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                        timestamps[bufferSampleCount] = i12 * j10;
                        flags[bufferSampleCount] = 1;
                        j11 += iArr2[bufferSampleCount];
                        i12 += maximumSize;
                        rechunkedSampleCount2 -= maximumSize;
                        bufferSampleCount++;
                    }
                    i13++;
                } else {
                    return new IR(jArr2, iArr2, originalSampleIndex, timestamps, flags, j10 * i12);
                }
            }
        }
        throw new RuntimeException();
    }
}
