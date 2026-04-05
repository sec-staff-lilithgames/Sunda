package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgsd {
    static {
        new zzgsb();
    }

    public static byte[] zza(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(Segment.SIZE, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i10 = 0;
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = inputStream.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return zzc(arrayDeque, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            iMin = zzgst.zzb(iMin * (iMin < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream zzb(InputStream inputStream, long j10) {
        return new zzgsc(inputStream, j10);
    }

    private static byte[] zzc(Queue queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i10) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        int i11 = i10 - length;
        while (i11 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i11, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - i11, iMin);
            i11 -= iMin;
        }
        return bArrCopyOf;
    }
}
