package com.google.protobuf;

import com.google.protobuf.Method;
import com.google.protobuf.MethodKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MethodKtKt {
    /* renamed from: -initializemethod, reason: not valid java name */
    public static final Method m521initializemethod(l block) {
        e0.checkNotNullParameter(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builderNewBuilder = Method.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Method copy(Method method, l block) {
        e0.checkNotNullParameter(method, "<this>");
        e0.checkNotNullParameter(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builder = method.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
