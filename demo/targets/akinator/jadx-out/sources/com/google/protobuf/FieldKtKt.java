package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.FieldKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FieldKtKt {
    /* renamed from: -initializefield, reason: not valid java name */
    public static final Field m514initializefield(l block) {
        e0.checkNotNullParameter(block, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builderNewBuilder = Field.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Field copy(Field field, l block) {
        e0.checkNotNullParameter(field, "<this>");
        e0.checkNotNullParameter(block, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builder = field.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
