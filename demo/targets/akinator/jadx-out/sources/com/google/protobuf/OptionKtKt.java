package com.google.protobuf;

import com.google.protobuf.Option;
import com.google.protobuf.OptionKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class OptionKtKt {
    /* renamed from: -initializeoption, reason: not valid java name */
    public static final Option m523initializeoption(l block) {
        e0.checkNotNullParameter(block, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder builderNewBuilder = Option.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        OptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Option copy(Option option, l block) {
        e0.checkNotNullParameter(option, "<this>");
        e0.checkNotNullParameter(block, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder builder = option.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        OptionKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Any getValueOrNull(OptionOrBuilder optionOrBuilder) {
        e0.checkNotNullParameter(optionOrBuilder, "<this>");
        if (optionOrBuilder.hasValue()) {
            return optionOrBuilder.getValue();
        }
        return null;
    }
}
