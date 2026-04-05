package com.google.protobuf;

import com.google.protobuf.FieldMask;
import com.google.protobuf.FieldMaskKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FieldMaskKtKt {
    /* renamed from: -initializefieldMask, reason: not valid java name */
    public static final FieldMask m515initializefieldMask(l block) {
        e0.checkNotNullParameter(block, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        FieldMask.Builder builderNewBuilder = FieldMask.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        FieldMaskKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FieldMask copy(FieldMask fieldMask, l block) {
        e0.checkNotNullParameter(fieldMask, "<this>");
        e0.checkNotNullParameter(block, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        FieldMask.Builder builder = fieldMask.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        FieldMaskKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
