package com.google.protobuf;

import com.google.protobuf.Duration;
import com.google.protobuf.DurationKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DurationKtKt {
    /* renamed from: -initializeduration, reason: not valid java name */
    public static final Duration m510initializeduration(l block) {
        e0.checkNotNullParameter(block, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder builderNewBuilder = Duration.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Duration copy(Duration duration, l block) {
        e0.checkNotNullParameter(duration, "<this>");
        e0.checkNotNullParameter(block, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder builder = duration.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DurationKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
