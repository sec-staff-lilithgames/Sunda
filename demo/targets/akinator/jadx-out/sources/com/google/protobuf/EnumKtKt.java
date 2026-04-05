package com.google.protobuf;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class EnumKtKt {
    /* renamed from: -initializeenum, reason: not valid java name */
    public static final Enum m512initializeenum(l block) {
        e0.checkNotNullParameter(block, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder builderNewBuilder = Enum.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        EnumKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext getSourceContextOrNull(EnumOrBuilder enumOrBuilder) {
        e0.checkNotNullParameter(enumOrBuilder, "<this>");
        if (enumOrBuilder.hasSourceContext()) {
            return enumOrBuilder.getSourceContext();
        }
        return null;
    }

    public static final Enum copy(Enum r22, l lVar) {
        e0.checkNotNullParameter(r22, "<this>");
        e0.checkNotNullParameter(lVar, QFzuMMDfrzagDN.JVNBB);
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder builder = r22.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        EnumKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
