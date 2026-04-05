package com.google.protobuf;

import com.google.protobuf.BytesValue;
import com.google.protobuf.BytesValueKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class BytesValueKtKt {
    /* renamed from: -initializebytesValue, reason: not valid java name */
    public static final BytesValue m508initializebytesValue(l block) {
        e0.checkNotNullParameter(block, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder builderNewBuilder = BytesValue.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final BytesValue copy(BytesValue bytesValue, l block) {
        e0.checkNotNullParameter(bytesValue, "<this>");
        e0.checkNotNullParameter(block, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder builder = bytesValue.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
