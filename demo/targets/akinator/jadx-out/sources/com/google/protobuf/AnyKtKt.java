package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.AnyKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AnyKtKt {
    /* renamed from: -initializeany, reason: not valid java name */
    public static final Any m505initializeany(l block) {
        e0.checkNotNullParameter(block, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builderNewBuilder = Any.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AnyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Any copy(Any any, l block) {
        e0.checkNotNullParameter(any, "<this>");
        e0.checkNotNullParameter(block, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builder = any.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        AnyKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
