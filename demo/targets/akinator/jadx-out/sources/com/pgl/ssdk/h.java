package com.pgl.ssdk;

import com.pgl.ssdk.d;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f50469a = "0123456789abcdef".toCharArray();

    public static i a(q qVar, t tVar, int i10) throws j, IOException {
        try {
            d.a aVarA = d.a(qVar, tVar);
            long jB = aVarA.b();
            q qVarA = aVarA.a();
            ByteBuffer byteBufferA = qVarA.a(0L, (int) qVarA.a());
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            return new i(a(byteBufferA, i10), jB, tVar.a(), tVar.e(), tVar.d());
        } catch (b e10) {
            throw new j(e10.getMessage(), e10);
        }
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i10)));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static byte[] c(ByteBuffer byteBuffer) throws a {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new a("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbT = o2.t(i10, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbT.append(byteBuffer.remaining());
        throw new a(sbT.toString());
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) throws a {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 >= 0) {
                if (i10 <= byteBuffer.remaining()) {
                    return b(byteBuffer, i10);
                }
                StringBuilder sbT = o2.t(i10, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
                sbT.append(byteBuffer.remaining());
                throw new a(sbT.toString());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i10) throws j {
        a(byteBuffer);
        ByteBuffer byteBufferA = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i11 = 0;
        while (byteBufferA.hasRemaining()) {
            i11++;
            if (byteBufferA.remaining() >= 8) {
                long j10 = byteBufferA.getLong();
                if (j10 >= 4 && j10 <= 2147483647L) {
                    int i12 = (int) j10;
                    int iPosition = byteBufferA.position() + i12;
                    if (i12 <= byteBufferA.remaining()) {
                        if (byteBufferA.getInt() == i10) {
                            return b(byteBufferA, i12 - 4);
                        }
                        byteBufferA.position(iPosition);
                    } else {
                        StringBuilder sbF = w0.i.f(i11, i12, "APK Signing Block entry #", " size out of range: ", ", available: ");
                        sbF.append(byteBufferA.remaining());
                        throw new j(sbF.toString());
                    }
                } else {
                    throw new j("APK Signing Block entry #" + i11 + " size out of range: " + j10);
                }
            } else {
                throw new j("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i11)));
            }
        }
        throw new j("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i10)));
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("start: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            int iCapacity = byteBuffer.capacity();
            if (i11 <= byteBuffer.capacity()) {
                int iLimit = byteBuffer.limit();
                int iPosition = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i11);
                    byteBuffer.position(i10);
                    ByteBuffer byteBufferSlice = byteBuffer.slice();
                    byteBufferSlice.order(byteBuffer.order());
                    return byteBufferSlice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(iLimit);
                    byteBuffer.position(iPosition);
                }
            }
            throw new IllegalArgumentException(w0.i.a(i11, iCapacity, "end > capacity: ", " > "));
        }
        throw new IllegalArgumentException(w0.i.a(i11, i10, "end < start: ", " < "));
    }
}
