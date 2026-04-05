package io.ktor.http.websocket;

import io.ktor.util.Base64Kt;
import io.ktor.util.CryptoKt;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.e0;
import sv.g;
import sv.k0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UtilsKt {
    private static final String WEBSOCKET_SERVER_ACCEPT_TAIL = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    public static final String websocketServerAccept(String nonce) {
        byte[] bArrEncodeToByteArray;
        e0.checkNotNullParameter(nonce, "nonce");
        String str = n0.trim(nonce).toString() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
        Charset charset = g.f86137e;
        if (e0.areEqual(charset, g.f86134b)) {
            bArrEncodeToByteArray = k0.encodeToByteArray(str);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
        }
        return Base64Kt.encodeBase64(CryptoKt.sha1(bArrEncodeToByteArray));
    }
}
