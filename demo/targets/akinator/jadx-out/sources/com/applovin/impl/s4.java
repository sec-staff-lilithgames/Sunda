package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.ktor.util.date.GMTDateParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class s4 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f15216a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f15217b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);


        /* renamed from: a, reason: collision with root package name */
        private final int f15222a;

        a(int i10) {
            this.f15222a = i10;
        }

        public int b() {
            return this.f15222a;
        }

        public static a a(int i10) {
            return i10 == 0 ? DEFAULT : i10 == 1 ? V2 : DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f15217b = bArr;
        System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    public static byte[] a(String str, long j10, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() >= 86) {
            return TextUtils.isEmpty(str) ? new byte[0] : a.NONE == aVar ? str.getBytes() : a.V2 == aVar ? a(str, j10, false, str2, kVar) : a(str, j10, str2, kVar);
        }
        throw new IllegalArgumentException("SDK key is too short");
    }

    public static String b(String str, long j10, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str) || a.NONE == aVar) {
            return str;
        }
        byte[] bArrA = a.V2 == aVar ? a(str, j10, true, str2, kVar) : a(str, j10, str2, kVar);
        if (bArrA != null) {
            return new String(bArrA);
        }
        return null;
    }

    private static int c(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
        int iA;
        int i10;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (iA = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(f15217b, kVar).getBytes();
        int i11 = iA + 1;
        int length = bytes.length + i11;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i10 = length + 55) || bArr[i10] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i11, bytes.length + i11), bytes)) {
            return 0;
        }
        int i12 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i12;
    }

    private static byte[] a(String str, long j10, String str2, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        char c10 = ' ';
        try {
            String strSubstring = str2.substring(32);
            byte b10 = 0;
            String strSubstring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes(C.UTF8_NAME);
            byte[] bArrA = a(strSubstring2, f15216a, kVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j10 & 255)) ^ bArrA[0]);
            char c11 = '\b';
            byteArrayOutputStream.write(((byte) ((j10 >> 8) & 255)) ^ bArrA[1]);
            char c12 = 16;
            byteArrayOutputStream.write(((byte) ((j10 >> 16) & 255)) ^ bArrA[2]);
            byteArrayOutputStream.write(((byte) ((j10 >> 24) & 255)) ^ bArrA[3]);
            byteArrayOutputStream.write(((byte) ((j10 >> 32) & 255)) ^ bArrA[4]);
            byteArrayOutputStream.write(((byte) ((j10 >> 40) & 255)) ^ bArrA[5]);
            byteArrayOutputStream.write(((byte) ((j10 >> 48) & 255)) ^ bArrA[6]);
            byteArrayOutputStream.write(((byte) ((j10 >> 56) & 255)) ^ bArrA[7]);
            int i10 = 0;
            while (i10 < bytes.length) {
                char c13 = c11;
                char c14 = c12;
                long j11 = j10 + i10;
                long j12 = (j11 ^ (j11 >> 33)) * (-4417276706812531889L);
                long j13 = (j12 ^ (j12 >> 29)) * (-8796714831421723037L);
                long j14 = j13 ^ (j13 >> c10);
                char c15 = c10;
                byteArrayOutputStream.write((byte) (((i10 >= bytes.length ? b10 : bytes[i10]) ^ bArrA[i10 % bArrA.length]) ^ (j14 & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i10 + 1 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j14 >> c13) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i10 + 2 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j14 >> c14) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i10 + 3 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j14 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i10 + 4 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j14 >> c15) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i10 + 5 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j14 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i10 + 6 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j14 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i10 + 7 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j14 >> 56) & 255)));
                i10 += 8;
                c11 = c13;
                c12 = c14;
                c10 = c15;
                b10 = 0;
            }
            String strC = c(byteArrayOutputStream.toByteArray());
            return ("1:" + a(f15216a, kVar) + ":" + strSubstring + ":" + strC).getBytes(C.UTF8_NAME);
        } catch (UnsupportedEncodingException e10) {
            kVar.E().a("AppLovinSdk", "encode", e10);
            return null;
        }
    }

    public static String b(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
        if (str != null) {
            if (str.length() < 86) {
                throw new IllegalArgumentException("SDK key is too short");
            }
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                return "";
            }
            a aVarB = b(bArr);
            if (a.NONE == aVarB) {
                return new String(bArr);
            }
            if (aVarB == a.V2) {
                return a(bArr, str, kVar);
            }
            return a(new String(bArr), str, kVar);
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static String c(byte[] bArr) {
        return a(Base64.encode(bArr, 2));
    }

    public static a b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c10 = (char) bArr[0];
            if (c10 == '2') {
                return a.V2;
            }
            if (c10 == '{') {
                return a.NONE;
            }
            return a.DEFAULT;
        }
        return a.NONE;
    }

    private static byte[] b(String str) {
        return Base64.decode(a(str), 0);
    }

    private static byte[] a(String str, long j10, boolean z10, String str2, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer byteBufferAllocate;
        try {
            byte[] bytes = str.getBytes(C.UTF8_NAME);
            int length = bytes.length;
            String strSubstring = str2.substring(32);
            String strSubstring2 = str2.substring(0, 32);
            byte[] bArr = f15217b;
            byte[] bArrA = a(strSubstring2, bArr, kVar);
            long jC = k7.c(bArrA) ^ j10;
            byte[] bytes2 = ("2:" + a(bArr, kVar) + ":" + strSubstring + ":").getBytes();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.putLong((long) length);
            byteBufferAllocate2.putLong(jC);
            byteBufferAllocate2.flip();
            byte[] bArrA2 = a(k7.a(bytes), j10, bArrA);
            if (z10) {
                byte[] bytes3 = c(byteBufferAllocate2.array()).getBytes();
                byte[] bytes4 = c(bArrA2).getBytes();
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(bytes3);
                byteBufferAllocate.put(bytes4);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + byteBufferAllocate2.remaining() + bArrA2.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(byteBufferAllocate2);
                byteBufferAllocate.put(bArrA2);
            }
            byteBufferAllocate.flip();
            return byteBufferAllocate.array();
        } catch (UnsupportedEncodingException e10) {
            kVar.E().a("AppLovinSdk", "encode2", e10);
            throw new RuntimeException(SFPXhf.uykluwErhzis, e10);
        } catch (IOException e11) {
            kVar.E().a("AppLovinSdk", "encode2", e11);
            return null;
        }
    }

    private static byte[] a(byte[] bArr, long j10, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        long j11 = j10;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (i10 % 8 == 0) {
                long j12 = i10 + j10;
                long j13 = (j12 ^ (j12 >>> 33)) * (-4417276706812531889L);
                long j14 = (j13 ^ (j13 >>> 29)) * (-8796714831421723037L);
                j11 = j14 ^ (j14 >>> 32);
            }
            byte b10 = bArrCopyOf[i10];
            bArrCopyOf[i10] = (byte) (b10 ^ (((j11 >> (r4 * 8)) & 255) ^ bArr2[i10 % bArr2.length]));
        }
        return bArrCopyOf;
    }

    private static String a(String str, String str2, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException, IOException {
        String str3;
        String[] strArrSplit = str.split(":");
        try {
            try {
                if (!"1".equals(strArrSplit[0]) || strArrSplit.length != 4) {
                    return null;
                }
                String str4 = strArrSplit[1];
                char c10 = 2;
                String str5 = strArrSplit[2];
                char c11 = 3;
                byte[] bArrB = b(strArrSplit[3]);
                if (!str2.endsWith(str5)) {
                    return null;
                }
                byte[] bArr = f15216a;
                if (!a(bArr, kVar).equals(str4)) {
                    return null;
                }
                byte[] bArrA = a(str2.substring(0, 32), bArr, kVar);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrB);
                char c12 = 5;
                str3 = null;
                char c13 = '(';
                try {
                    char c14 = 7;
                    long j10 = (((byteArrayInputStream.read() ^ bArrA[1]) & 255) << 8) | ((byteArrayInputStream.read() ^ bArrA[0]) & 255) | (((byteArrayInputStream.read() ^ bArrA[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ bArrA[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ bArrA[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ bArrA[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ bArrA[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ bArrA[7]) & 255) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8];
                    int i10 = byteArrayInputStream.read(bArr2);
                    int i11 = 0;
                    while (i10 >= 0) {
                        char c15 = c14;
                        long j11 = i11 + j10;
                        long j12 = (j11 ^ (j11 >> 33)) * (-4417276706812531889L);
                        long j13 = (j12 ^ (j12 >> 29)) * (-8796714831421723037L);
                        long j14 = j13 ^ (j13 >> 32);
                        byteArrayOutputStream.write((byte) ((bArr2[0] ^ bArrA[i11 % bArrA.length]) ^ (j14 & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[1] ^ bArrA[(i11 + 1) % bArrA.length]) ^ ((j14 >> 8) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r23] ^ bArrA[(i11 + 2) % bArrA.length]) ^ ((j14 >> 16) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r27] ^ bArrA[(i11 + 3) % bArrA.length]) ^ ((j14 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[4] ^ bArrA[(i11 + 4) % bArrA.length]) ^ ((j14 >> 32) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r26] ^ bArrA[(i11 + 5) % bArrA.length]) ^ ((j14 >> r28) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[6] ^ bArrA[(i11 + 6) % bArrA.length]) ^ ((j14 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) (((j14 >> 56) & 255) ^ (bArr2[c15] ^ bArrA[(i11 + 7) % bArrA.length])));
                        i11 += 8;
                        c10 = c10;
                        c12 = c12;
                        c11 = c11;
                        c13 = c13;
                        i10 = byteArrayInputStream.read(bArr2);
                        c14 = c15;
                    }
                    return new String(byteArrayOutputStream.toByteArray(), C.UTF8_NAME).trim();
                } catch (IOException e10) {
                    e = e10;
                    com.applovin.impl.sdk.o.b("AppLovinSdk", "Failed to read bytes", e);
                    kVar.E().a("AppLovinSdk", "decode", e);
                    return str3;
                }
            } catch (IOException e11) {
                e = e11;
                str3 = null;
            }
        } catch (UnsupportedEncodingException e12) {
            kVar.E().a("AppLovinSdk", "decode", e12);
            throw new RuntimeException("UTF-8 encoding not found", e12);
        }
    }

    private static String a(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException {
        try {
            int iC = c(bArr, str, kVar);
            if (iC == 0) {
                return null;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iC, bArr.length);
            if (bArrCopyOfRange.length < 16) {
                return null;
            }
            long jA = k7.a(bArrCopyOfRange, 8);
            byte[] bArrA = a(str.substring(0, 32), f15217b, kVar);
            return new String(k7.d(a(Arrays.copyOfRange(bArrCopyOfRange, 16, bArrCopyOfRange.length), jA ^ k7.c(bArrA), bArrA)), C.UTF8_NAME);
        } catch (UnsupportedEncodingException e10) {
            kVar.E().a("AppLovinSdk", "decode2", e10);
            throw new RuntimeException("UTF-8 encoding not found", e10);
        } catch (IOException e11) {
            com.applovin.impl.sdk.o.b("AppLovinSdk", "Failed to ungzip decode", e11);
            kVar.E().a("AppLovinSdk", "decode2", e11);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b10) {
        if (bArr != null && bArr.length != 0) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] == b10) {
                    return i10;
                }
            }
        }
        return -1;
    }

    private static byte[] a(String str, byte[] bArr, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes(C.UTF8_NAME));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            kVar.E().a("AppLovinSdk", "SHA256", e10);
            throw new RuntimeException("SHA-256 algorithm not found", e10);
        }
    }

    private static String a(byte[] bArr, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            kVar.E().a("AppLovinSdk", "SHA1", e10);
            throw new RuntimeException("SHA-1 algorithm not found", e10);
        }
    }

    private static String a(String str) {
        return str.replace('-', '+').replace('_', '/').replace(GMTDateParser.ANY, G5.T);
    }

    private static String a(byte[] bArr) {
        return new String(bArr, C.UTF8_NAME).replace('+', '-').replace('/', '_').replace(G5.T, GMTDateParser.ANY);
    }
}
