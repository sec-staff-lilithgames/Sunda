package io.ktor.websocket;

import io.ktor.utils.io.charsets.EncodingKt;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.InputPrimitivesKt;
import io.ktor.utils.io.core.Output;
import io.ktor.utils.io.core.OutputKt;
import io.ktor.websocket.Frame;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FrameCommonKt {
    public static final byte[] readBytes(Frame frame) {
        e0.checkNotNullParameter(frame, "<this>");
        byte[] data = frame.getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public static final CloseReason readReason(Frame.Close close) {
        e0.checkNotNullParameter(close, "<this>");
        if (close.getData().length < 2) {
            return null;
        }
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            OutputKt.writeFully$default((Output) bytePacketBuilder, close.getData(), 0, 0, 6, (Object) null);
            ByteReadPacket byteReadPacketBuild = bytePacketBuilder.build();
            return new CloseReason(InputPrimitivesKt.readShort(byteReadPacketBuild), Input.readText$default(byteReadPacketBuild, 0, 0, 3, null));
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    public static final String readText(Frame.Text text) {
        e0.checkNotNullParameter(text, "<this>");
        if (!text.getFin()) {
            throw new IllegalArgumentException("Text could be only extracted from non-fragmented frame");
        }
        CharsetDecoder charsetDecoderNewDecoder = g.f86134b.newDecoder();
        e0.checkNotNullExpressionValue(charsetDecoderNewDecoder, "UTF_8.newDecoder()");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            OutputKt.writeFully$default((Output) bytePacketBuilder, text.getData(), 0, 0, 6, (Object) null);
            return EncodingKt.decode$default(charsetDecoderNewDecoder, bytePacketBuilder.build(), 0, 2, null);
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }
}
