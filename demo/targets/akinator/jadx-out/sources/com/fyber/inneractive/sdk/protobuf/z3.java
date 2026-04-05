package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z3 {
    public static String a(ByteBuffer byteBuffer, int i10, int i11) throws n1 {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = byteBuffer.get(i10);
            if (!y3.a(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (y3.a(b11)) {
                cArr[i14] = (char) b11;
                i14++;
                i10 = i15;
                while (i10 < i12) {
                    byte b12 = byteBuffer.get(i10);
                    if (!y3.a(b12)) {
                        break;
                    }
                    i10++;
                    cArr[i14] = (char) b12;
                    i14++;
                }
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                i10 += 2;
                y3.a(b11, byteBuffer.get(i15), cArr, i14);
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                int i16 = i10 + 2;
                i10 += 3;
                y3.a(b11, byteBuffer.get(i15), byteBuffer.get(i16), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                byte b13 = byteBuffer.get(i15);
                int i17 = i10 + 3;
                byte b14 = byteBuffer.get(i10 + 2);
                i10 += 4;
                y3.a(b11, b13, b14, byteBuffer.get(i17), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    public abstract int a(CharSequence charSequence, byte[] bArr, int i10, int i11);

    public abstract String a(byte[] bArr, int i10, int i11);

    public abstract String b(ByteBuffer byteBuffer, int i10, int i11);

    public final boolean b(byte[] bArr, int i10, int i11) {
        return c(bArr, i10, i11) == 0;
    }

    public abstract int c(byte[] bArr, int i10, int i11);
}
