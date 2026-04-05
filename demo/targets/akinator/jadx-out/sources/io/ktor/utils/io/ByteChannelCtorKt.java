package io.ktor.utils.io;

import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.e0;
import sv.g;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteChannelCtorKt {
    public static final ByteReadChannel ByteReadChannel(byte[] content) {
        e0.checkNotNullParameter(content, "content");
        return ByteChannelKt.ByteReadChannel(content, 0, content.length);
    }

    public static /* synthetic */ ByteReadChannel ByteReadChannel$default(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = g.f86134b;
        }
        return ByteReadChannel(str, charset);
    }

    public static final ByteReadChannel ByteReadChannel(byte[] content, int i10) {
        e0.checkNotNullParameter(content, "content");
        return ByteChannelKt.ByteReadChannel(content, i10, content.length);
    }

    public static final ByteReadChannel ByteReadChannel(String text, Charset charset) {
        byte[] bArrEncodeToByteArray;
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(charset, "charset");
        if (e0.areEqual(charset, g.f86134b)) {
            bArrEncodeToByteArray = k0.encodeToByteArray(text);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, text, 0, text.length());
        }
        return ByteReadChannel(bArrEncodeToByteArray);
    }
}
