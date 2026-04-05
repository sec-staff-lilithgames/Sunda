package com.pgl.ssdk;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class p {
    public static o<ByteBuffer, Long> a(q qVar) throws IOException {
        if (qVar.a() < 22) {
            return null;
        }
        o<ByteBuffer, Long> oVarA = a(qVar, 0);
        return oVarA != null ? oVarA : a(qVar, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    private static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i10 = iCapacity - 22;
        int iMin = Math.min(i10, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        for (int i11 = 0; i11 <= iMin; i11++) {
            int i12 = i10 - i11;
            if (byteBuffer.getInt(i12) == 101010256 && a(byteBuffer, i12 + 20) == i11) {
                return i12;
            }
        }
        return -1;
    }

    public static long c(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 16);
    }

    public static long d(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 12);
    }

    public static int e(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return a(byteBuffer, byteBuffer.position() + 10);
    }

    private static o<ByteBuffer, Long> a(q qVar, int i10) throws IOException {
        if (i10 >= 0 && i10 <= 65535) {
            long jA = qVar.a();
            if (jA < 22) {
                return null;
            }
            int iMin = ((int) Math.min(i10, jA - 22)) + 22;
            long j10 = jA - iMin;
            ByteBuffer byteBufferA = qVar.a(j10, iMin);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            int iB = b(byteBufferA);
            if (iB == -1) {
                return null;
            }
            byteBufferA.position(iB);
            ByteBuffer byteBufferSlice = byteBufferA.slice();
            byteBufferSlice.order(byteOrder);
            return o.a(byteBufferSlice, Long.valueOf(j10 + iB));
        }
        throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i10)));
    }

    public static long b(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.getInt(i10) & 4294967295L;
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int a(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.getShort(i10) & 65535;
    }
}
