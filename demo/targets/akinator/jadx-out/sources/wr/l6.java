package wr;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l6 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f91024a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    @Override // wr.d4
    public String parseAsciiString(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            if (b10 < 32 || b10 >= 126 || (b10 == 37 && i10 + 2 < bArr.length)) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                int i11 = 0;
                while (i11 < bArr.length) {
                    if (bArr[i11] == 37 && i11 + 2 < bArr.length) {
                        try {
                            byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i11 + 1, 2, mh.h0.f74626a), 16));
                            i11 += 3;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    byteBufferAllocate.put(bArr[i11]);
                    i11++;
                }
                return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), mh.h0.f74628c);
            }
        }
        return new String(bArr, 0);
    }

    @Override // wr.d4
    public byte[] toAsciiString(String str) {
        byte[] bytes = str.getBytes(mh.h0.f74628c);
        int i10 = 0;
        while (i10 < bytes.length) {
            byte b10 = bytes[i10];
            if (b10 < 32 || b10 >= 126 || b10 == 37) {
                byte[] bArr = new byte[j1.o2.b(bytes.length, i10, 3, i10)];
                if (i10 != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i10);
                }
                int i11 = i10;
                while (i10 < bytes.length) {
                    byte b11 = bytes[i10];
                    if (b11 < 32 || b11 >= 126 || b11 == 37) {
                        bArr[i11] = 37;
                        byte[] bArr2 = f91024a;
                        bArr[i11 + 1] = bArr2[(b11 >> 4) & 15];
                        bArr[i11 + 2] = bArr2[b11 & 15];
                        i11 += 3;
                    } else {
                        bArr[i11] = b11;
                        i11++;
                    }
                    i10++;
                }
                return Arrays.copyOf(bArr, i11);
            }
            i10++;
        }
        return bytes;
    }
}
