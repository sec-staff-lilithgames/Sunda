package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.TypeKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TypeKtKt {
    /* renamed from: -initializetype, reason: not valid java name */
    public static final Type m528initializetype(l block) {
        e0.checkNotNullParameter(block, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder builderNewBuilder = Type.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        TypeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Type copy(Type type, l block) {
        e0.checkNotNullParameter(type, "<this>");
        e0.checkNotNullParameter(block, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder builder = type.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        TypeKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext getSourceContextOrNull(TypeOrBuilder typeOrBuilder) {
        e0.checkNotNullParameter(typeOrBuilder, "<this>");
        if (typeOrBuilder.hasSourceContext()) {
            return typeOrBuilder.getSourceContext();
        }
        return null;
    }
}
