package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValueKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class EnumValueKtKt {
    /* renamed from: -initializeenumValue, reason: not valid java name */
    public static final EnumValue m513initializeenumValue(l block) {
        e0.checkNotNullParameter(block, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builderNewBuilder = EnumValue.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EnumValue copy(EnumValue enumValue, l block) {
        e0.checkNotNullParameter(enumValue, "<this>");
        e0.checkNotNullParameter(block, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builder = enumValue.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
