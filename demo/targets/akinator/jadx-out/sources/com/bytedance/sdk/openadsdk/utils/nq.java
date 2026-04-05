package com.bytedance.sdk.openadsdk.utils;

import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import java.security.SecureRandom;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nq {
    private static final ThreadLocal<SecureRandom> jpo = new ThreadLocal<>();

    public static String jpo() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = jpo;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b10 = (byte) (bArr[6] & 15);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | 64);
        byte b11 = (byte) (bArr[8] & Utf8.REPLACEMENT_BYTE);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | 128);
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j11 = (j11 << 8) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        for (int i11 = 8; i11 < 16; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return new UUID(j11, j10).toString();
    }
}
