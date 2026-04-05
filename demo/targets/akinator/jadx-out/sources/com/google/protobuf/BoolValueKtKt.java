package com.google.protobuf;

import com.google.protobuf.BoolValue;
import com.google.protobuf.BoolValueKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class BoolValueKtKt {
    /* renamed from: -initializeboolValue, reason: not valid java name */
    public static final BoolValue m507initializeboolValue(l block) {
        e0.checkNotNullParameter(block, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder builderNewBuilder = BoolValue.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        BoolValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final BoolValue copy(BoolValue boolValue, l block) {
        e0.checkNotNullParameter(boolValue, "<this>");
        e0.checkNotNullParameter(block, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder builder = boolValue.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        BoolValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
