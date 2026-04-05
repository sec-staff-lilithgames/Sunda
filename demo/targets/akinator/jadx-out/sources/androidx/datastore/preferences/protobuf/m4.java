package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m4 {

    /* renamed from: a, reason: collision with root package name */
    public static final kc.p f5958a;

    static {
        f5958a = (j4.f5926e && j4.f5925d && !e.a()) ? new k4(1) : new k4(0);
    }

    public static int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return f(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return g(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        if (i12 == 0) {
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i12 == 1) {
            return f(i10, byteBuffer.get(i11));
        }
        if (i12 == 2) {
            return g(i10, byteBuffer.get(i11), byteBuffer.get(i11 + 1));
        }
        throw new AssertionError();
    }

    public static String c(ByteBuffer byteBuffer, int i10, int i11) {
        kc.p pVar = f5958a;
        pVar.getClass();
        if (byteBuffer.hasArray()) {
            return pVar.g(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
        }
        return byteBuffer.isDirect() ? pVar.i(byteBuffer, i10, i11) : kc.p.h(byteBuffer, i10, i11);
    }

    public static void d(String str, ByteBuffer byteBuffer) {
        kc.p pVar = f5958a;
        pVar.getClass();
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(pVar.k(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        } else if (byteBuffer.isDirect()) {
            pVar.m(str, byteBuffer);
        } else {
            kc.p.l(str, byteBuffer);
        }
    }

    public static int e(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new l4(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    public static int f(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int g(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
