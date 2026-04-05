package com.unity3d.ads.core.extensions;

import android.util.Base64;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.jvm.internal.e0;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ProtobufExtensionsKt {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    public static final ByteString fromBase64(String str, boolean z10) {
        e0.checkNotNullParameter(str, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(Base64.decode(str, z10 ? 10 : 2));
        e0.checkNotNullExpressionValue(byteStringCopyFrom, "copyFrom(android.util.Base64.decode(this, flag))");
        return byteStringCopyFrom;
    }

    public static /* synthetic */ ByteString fromBase64$default(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return fromBase64(str, z10);
    }

    public static final String toBase64(ByteString byteString, boolean z10) {
        e0.checkNotNullParameter(byteString, "<this>");
        String strEncodeToString = Base64.encodeToString(byteString.toByteArray(), z10 ? 10 : 2);
        e0.checkNotNullExpressionValue(strEncodeToString, "encodeToString(this.toByteArray(), flag)");
        return strEncodeToString;
    }

    public static /* synthetic */ String toBase64$default(ByteString byteString, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toBase64(byteString, z10);
    }

    public static final ByteString toByteString(UUID uuid) {
        e0.checkNotNullParameter(uuid, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        e0.checkNotNullExpressionValue(byteStringCopyFrom, "copyFrom(bytes.array())");
        return byteStringCopyFrom;
    }

    public static final ByteString toISO8859ByteString(String str) {
        e0.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(g.f86137e);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bytes);
        e0.checkNotNullExpressionValue(byteStringCopyFrom, "copyFrom(this.toByteArray(Charsets.ISO_8859_1))");
        return byteStringCopyFrom;
    }

    public static final String toISO8859String(ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        String string = byteString.toString(g.f86137e);
        e0.checkNotNullExpressionValue(string, "this.toString(Charsets.ISO_8859_1)");
        return string;
    }

    public static final UUID toUUID(ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        ByteBuffer byteBufferAsReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        e0.checkNotNullExpressionValue(byteBufferAsReadOnlyByteBuffer, "this.asReadOnlyByteBuffer()");
        if (byteBufferAsReadOnlyByteBuffer.remaining() == 36) {
            UUID uuidFromString = UUID.fromString(byteString.toStringUtf8());
            e0.checkNotNullExpressionValue(uuidFromString, "fromString(uuidString)");
            return uuidFromString;
        }
        if (byteBufferAsReadOnlyByteBuffer.remaining() == 16) {
            return new UUID(byteBufferAsReadOnlyByteBuffer.getLong(), byteBufferAsReadOnlyByteBuffer.getLong());
        }
        throw new IllegalArgumentException("Expected 16 byte ByteString or UUID string");
    }
}
