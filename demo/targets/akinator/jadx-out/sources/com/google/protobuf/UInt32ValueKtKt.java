package com.google.protobuf;

import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt32ValueKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UInt32ValueKtKt {
    /* renamed from: -initializeuInt32Value, reason: not valid java name */
    public static final UInt32Value m529initializeuInt32Value(l block) {
        e0.checkNotNullParameter(block, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        UInt32Value.Builder builderNewBuilder = UInt32Value.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        UInt32ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UInt32Value copy(UInt32Value uInt32Value, l block) {
        e0.checkNotNullParameter(uInt32Value, "<this>");
        e0.checkNotNullParameter(block, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        UInt32Value.Builder builder = uInt32Value.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        UInt32ValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
