package com.google.firebase.messaging;

import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class f {
    public static byte[] a(int i10, ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static InputStream limit(InputStream inputStream, long j10) {
        return new e(inputStream, j10);
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(Segment.SIZE, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = inputStream.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return a(i10, arrayDeque);
                }
                i11 += i12;
                i10 += i12;
            }
            long j10 = iMin * (iMin < 4096 ? 4 : 2);
            iMin = j10 > 2147483647L ? Integer.MAX_VALUE : j10 < -2147483648L ? Integer.MIN_VALUE : (int) j10;
        }
        if (inputStream.read() == -1) {
            return a(2147483639, arrayDeque);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
