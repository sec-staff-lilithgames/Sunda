package com.google.protobuf;

import com.google.protobuf.UInt64Value;
import com.google.protobuf.UInt64ValueKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UInt64ValueKtKt {
    /* renamed from: -initializeuInt64Value, reason: not valid java name */
    public static final UInt64Value m530initializeuInt64Value(l block) {
        e0.checkNotNullParameter(block, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder builderNewBuilder = UInt64Value.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        UInt64ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UInt64Value copy(UInt64Value uInt64Value, l block) {
        e0.checkNotNullParameter(uInt64Value, "<this>");
        e0.checkNotNullParameter(block, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder builder = uInt64Value.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        UInt64ValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
