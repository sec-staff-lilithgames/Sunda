package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.MixinKt;
import cv.BLca.YsiBvdpw;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MixinKtKt {
    public static final Mixin copy(Mixin mixin, l block) {
        e0.checkNotNullParameter(mixin, "<this>");
        e0.checkNotNullParameter(block, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builder = mixin.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        MixinKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializemixin, reason: not valid java name */
    public static final Mixin m522initializemixin(l block) {
        e0.checkNotNullParameter(block, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builderNewBuilder = Mixin.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, YsiBvdpw.SESY);
        MixinKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
