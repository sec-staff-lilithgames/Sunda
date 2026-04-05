package com.google.protobuf;

import com.google.protobuf.Int64Value;
import com.google.protobuf.Int64ValueKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Int64ValueKtKt {
    /* renamed from: -initializeint64Value, reason: not valid java name */
    public static final Int64Value m519initializeint64Value(l block) {
        e0.checkNotNullParameter(block, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        Int64Value.Builder builderNewBuilder = Int64Value.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        Int64ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Int64Value copy(Int64Value int64Value, l block) {
        e0.checkNotNullParameter(int64Value, "<this>");
        e0.checkNotNullParameter(block, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        Int64Value.Builder builder = int64Value.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        Int64ValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
