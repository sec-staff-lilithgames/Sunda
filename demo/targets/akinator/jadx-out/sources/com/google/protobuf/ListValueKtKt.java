package com.google.protobuf;

import com.google.protobuf.ListValue;
import com.google.protobuf.ListValueKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ListValueKtKt {
    /* renamed from: -initializelistValue, reason: not valid java name */
    public static final ListValue m520initializelistValue(l block) {
        e0.checkNotNullParameter(block, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        ListValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ListValue copy(ListValue listValue, l block) {
        e0.checkNotNullParameter(listValue, "<this>");
        e0.checkNotNullParameter(block, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder builder = listValue.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        ListValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
