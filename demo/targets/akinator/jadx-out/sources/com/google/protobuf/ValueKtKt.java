package com.google.protobuf;

import com.google.protobuf.Value;
import com.google.protobuf.ValueKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ValueKtKt {
    /* renamed from: -initializevalue, reason: not valid java name */
    public static final Value m531initializevalue(l block) {
        e0.checkNotNullParameter(block, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder builderNewBuilder = Value.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Value copy(Value value, l block) {
        e0.checkNotNullParameter(value, "<this>");
        e0.checkNotNullParameter(block, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder builder = value.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        ValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ListValue getListValueOrNull(ValueOrBuilder valueOrBuilder) {
        e0.checkNotNullParameter(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasListValue()) {
            return valueOrBuilder.getListValue();
        }
        return null;
    }

    public static final Struct getStructValueOrNull(ValueOrBuilder valueOrBuilder) {
        e0.checkNotNullParameter(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasStructValue()) {
            return valueOrBuilder.getStructValue();
        }
        return null;
    }
}
