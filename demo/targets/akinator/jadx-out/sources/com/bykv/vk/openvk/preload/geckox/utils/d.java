package com.bykv.vk.openvk.preload.geckox.utils;

import b0.e2;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.ktor.util.date.GMTDateParser;
import java.io.InputStream;
import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f17222a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    public static void a(InputStream inputStream, String str) throws Exception {
        if (str == null) {
            throw new RuntimeException("md5 check failed: md5 == null");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = inputStream.read(bArr, 0, 4096);
                        if (i10 == -1) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i10);
                        }
                    }
                    try {
                        byte[] bArrDigest = messageDigest.digest();
                        String strA = a(bArrDigest, bArrDigest.length);
                        if (!str.equals(strA)) {
                            throw new RuntimeException(a.b.m("md5 check failed file: local md5:", strA, " expect md5:", str));
                        }
                    } catch (Exception e10) {
                        throw new RuntimeException(e2.l(e10, new StringBuilder("md5 check failed:")), e10);
                    }
                } catch (Exception e11) {
                    throw new RuntimeException("md5 check failed:" + e11.getMessage(), e11);
                }
            } finally {
                CloseableUtils.close(inputStream);
            }
        } catch (Exception e12) {
            throw new RuntimeException(e2.l(e12, new StringBuilder("md5 check failed:")), e12);
        }
    }

    private static String a(byte[] bArr, int i10) {
        if (bArr != null) {
            if (i10 <= bArr.length) {
                int i11 = i10 << 1;
                char[] cArr = new char[i11];
                int i12 = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    byte b10 = bArr[i13];
                    int i14 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i15 = i12 + 1;
                    char[] cArr2 = f17222a;
                    cArr[i12] = cArr2[i14 >> 4];
                    i12 += 2;
                    cArr[i15] = cArr2[b10 & 15];
                }
                return new String(cArr, 0, i11);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
