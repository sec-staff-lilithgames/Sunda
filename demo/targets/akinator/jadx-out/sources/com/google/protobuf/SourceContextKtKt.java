package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContextKt;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class SourceContextKtKt {
    public static final SourceContext copy(SourceContext sourceContext, l block) {
        e0.checkNotNullParameter(sourceContext, "<this>");
        e0.checkNotNullParameter(block, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builder = sourceContext.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializesourceContext, reason: not valid java name */
    public static final SourceContext m524initializesourceContext(l lVar) {
        e0.checkNotNullParameter(lVar, SUvoXnn.CHzbJ);
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builderNewBuilder = SourceContext.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
