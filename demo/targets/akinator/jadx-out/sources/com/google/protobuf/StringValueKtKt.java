package com.google.protobuf;

import com.google.protobuf.StringValue;
import com.google.protobuf.StringValueKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class StringValueKtKt {
    /* renamed from: -initializestringValue, reason: not valid java name */
    public static final StringValue m525initializestringValue(l block) {
        e0.checkNotNullParameter(block, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder builderNewBuilder = StringValue.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        StringValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final StringValue copy(StringValue stringValue, l block) {
        e0.checkNotNullParameter(stringValue, "<this>");
        e0.checkNotNullParameter(block, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder builder = stringValue.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        StringValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
