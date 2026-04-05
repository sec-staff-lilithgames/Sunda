package io.ktor.util;

import java.nio.charset.Charset;
import kv.l;
import zu.d;

/* loaded from: classes8.dex */
public final class CryptoKt {
    public static final int NONCE_SIZE_IN_BYTES = 16;

    public static final Digest Digest(String str) {
        return CryptoKt__CryptoJvmKt.Digest(str);
    }

    @InternalAPI
    public static final Object build(Digest digest, String str, Charset charset, d<? super byte[]> dVar) {
        return CryptoKt__CryptoKt.build(digest, str, charset, dVar);
    }

    public static final String generateNonce() {
        return CryptoKt__CryptoJvmKt.generateNonce();
    }

    public static final l getDigestFunction(String str, l lVar) {
        return CryptoKt__CryptoJvmKt.getDigestFunction(str, lVar);
    }

    public static final String hex(byte[] bArr) {
        return CryptoKt__CryptoKt.hex(bArr);
    }

    public static final byte[] sha1(byte[] bArr) {
        return CryptoKt__CryptoJvmKt.sha1(bArr);
    }

    @InternalAPI
    public static final Object build(Digest digest, byte[] bArr, d<? super byte[]> dVar) {
        return CryptoKt__CryptoKt.build(digest, bArr, dVar);
    }

    public static final byte[] generateNonce(int i10) {
        return CryptoKt__CryptoKt.generateNonce(i10);
    }

    public static final byte[] hex(String str) {
        return CryptoKt__CryptoKt.hex(str);
    }
}
