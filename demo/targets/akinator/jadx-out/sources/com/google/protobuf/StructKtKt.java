package com.google.protobuf;

import com.google.protobuf.Struct;
import com.google.protobuf.StructKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class StructKtKt {
    /* renamed from: -initializestruct, reason: not valid java name */
    public static final Struct m526initializestruct(l block) {
        e0.checkNotNullParameter(block, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        StructKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Struct copy(Struct struct, l block) {
        e0.checkNotNullParameter(struct, "<this>");
        e0.checkNotNullParameter(block, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builder = struct.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        StructKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
