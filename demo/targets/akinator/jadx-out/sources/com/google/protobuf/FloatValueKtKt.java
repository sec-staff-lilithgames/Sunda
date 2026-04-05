package com.google.protobuf;

import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValueKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FloatValueKtKt {
    /* renamed from: -initializefloatValue, reason: not valid java name */
    public static final FloatValue m517initializefloatValue(l block) {
        e0.checkNotNullParameter(block, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder builderNewBuilder = FloatValue.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        FloatValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FloatValue copy(FloatValue floatValue, l block) {
        e0.checkNotNullParameter(floatValue, "<this>");
        e0.checkNotNullParameter(block, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder builder = floatValue.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        FloatValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
