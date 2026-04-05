package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.EmptyKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class EmptyKtKt {
    /* renamed from: -initializeempty, reason: not valid java name */
    public static final Empty m511initializeempty(l block) {
        e0.checkNotNullParameter(block, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builderNewBuilder = Empty.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Empty copy(Empty empty, l block) {
        e0.checkNotNullParameter(empty, "<this>");
        e0.checkNotNullParameter(block, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builder = empty.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
