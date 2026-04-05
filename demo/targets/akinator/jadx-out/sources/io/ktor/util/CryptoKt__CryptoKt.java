package io.ktor.util;

import com.inmobi.commons.core.configs.AdConfig;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.e0;
import sv.e;
import sv.g;
import sv.k0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final /* synthetic */ class CryptoKt__CryptoKt {
    private static final char[] digits = CharsetKt.toCharArray("0123456789abcdef");

    @InternalAPI
    public static final Object build(Digest digest, byte[] bArr, d<? super byte[]> dVar) {
        digest.plusAssign(bArr);
        return digest.build(dVar);
    }

    public static /* synthetic */ Object build$default(Digest digest, String str, Charset charset, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = g.f86134b;
        }
        return CryptoKt.build(digest, str, charset, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final byte[] generateNonce(int i10) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
        while (bytePacketBuilder.getSize() < i10) {
            try {
                StringsKt.writeText$default(bytePacketBuilder, CryptoKt.generateNonce(), 0, 0, (Charset) null, 14, (Object) null);
            } catch (Throwable th2) {
                bytePacketBuilder.release();
                throw th2;
            }
        }
        return StringsKt.readBytes(bytePacketBuilder.build(), i10);
    }

    public static final String hex(byte[] bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        char[] cArr = new char[bytes.length * 2];
        char[] cArr2 = digits;
        int i10 = 0;
        for (byte b10 : bytes) {
            int i11 = i10 + 1;
            cArr[i10] = cArr2[(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return k0.concatToString(cArr);
    }

    @InternalAPI
    public static final Object build(Digest digest, String str, Charset charset, d<? super byte[]> dVar) {
        byte[] bArrEncodeToByteArray;
        if (e0.areEqual(charset, g.f86134b)) {
            bArrEncodeToByteArray = k0.encodeToByteArray(str);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
        }
        digest.plusAssign(bArrEncodeToByteArray);
        return digest.build(dVar);
    }

    public static final byte[] hex(String s10) {
        e0.checkNotNullParameter(s10, "s");
        int length = s10.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (Integer.parseInt(String.valueOf(s10.charAt(i11 + 1)), e.checkRadix(16)) | (Integer.parseInt(String.valueOf(s10.charAt(i11)), e.checkRadix(16)) << 4));
        }
        return bArr;
    }
}
