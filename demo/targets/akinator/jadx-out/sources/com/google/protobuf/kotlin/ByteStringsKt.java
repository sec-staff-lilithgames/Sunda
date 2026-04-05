package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ByteStringsKt {
    public static final byte get(ByteString byteString, int i10) {
        e0.checkNotNullParameter(byteString, "<this>");
        return byteString.byteAt(i10);
    }

    public static final boolean isNotEmpty(ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        return !byteString.isEmpty();
    }

    public static final ByteString plus(ByteString byteString, ByteString other) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(other, "other");
        ByteString byteStringConcat = byteString.concat(other);
        e0.checkNotNullExpressionValue(byteStringConcat, "concat(other)");
        return byteStringConcat;
    }

    public static final ByteString toByteString(byte[] bArr) {
        e0.checkNotNullParameter(bArr, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bArr);
        e0.checkNotNullExpressionValue(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }

    public static final ByteString toByteStringUtf8(String str) {
        e0.checkNotNullParameter(str, "<this>");
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(str);
        e0.checkNotNullExpressionValue(byteStringCopyFromUtf8, "copyFromUtf8(this)");
        return byteStringCopyFromUtf8;
    }

    public static final ByteString toByteString(ByteBuffer byteBuffer) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(byteBuffer);
        e0.checkNotNullExpressionValue(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }
}
