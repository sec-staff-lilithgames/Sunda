package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.ApiKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ApiKtKt {
    /* renamed from: -initializeapi, reason: not valid java name */
    public static final Api m506initializeapi(l block) {
        e0.checkNotNullParameter(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder builderNewBuilder = Api.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Api copy(Api api, l block) {
        e0.checkNotNullParameter(api, "<this>");
        e0.checkNotNullParameter(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder builder = api.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext getSourceContextOrNull(ApiOrBuilder apiOrBuilder) {
        e0.checkNotNullParameter(apiOrBuilder, "<this>");
        if (apiOrBuilder.hasSourceContext()) {
            return apiOrBuilder.getSourceContext();
        }
        return null;
    }
}
