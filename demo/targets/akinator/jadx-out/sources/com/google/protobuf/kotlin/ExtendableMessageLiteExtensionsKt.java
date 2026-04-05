package com.google.protobuf.kotlin;

import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ExtendableMessageLiteExtensionsKt {
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MorBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>> boolean contains(MorBT morbt, ExtensionLite<M, ?> extension) {
        e0.checkNotNullParameter(morbt, "<this>");
        e0.checkNotNullParameter(extension, "extension");
        return morbt.hasExtension(extension);
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MOrBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>, T> T get(MOrBT morbt, ExtensionLite<M, T> extension) {
        e0.checkNotNullParameter(morbt, "<this>");
        e0.checkNotNullParameter(extension, "extension");
        T t10 = (T) morbt.getExtension(extension);
        e0.checkNotNullExpressionValue(t10, "getExtension(extension)");
        return t10;
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, B>, B extends GeneratedMessageLite.ExtendableBuilder<M, B>, T> void set(B b10, ExtensionLite<M, T> extension, T value) {
        e0.checkNotNullParameter(b10, "<this>");
        e0.checkNotNullParameter(extension, "extension");
        e0.checkNotNullParameter(value, "value");
        b10.setExtension(extension, value);
    }
}
