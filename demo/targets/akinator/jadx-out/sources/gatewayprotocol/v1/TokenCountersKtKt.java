package gatewayprotocol.v1;

import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.TokenCountersKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class TokenCountersKtKt {
    /* renamed from: -initializetokenCounters, reason: not valid java name */
    public static final HeaderBiddingTokenOuterClass.TokenCounters m4108initializetokenCounters(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        TokenCountersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final HeaderBiddingTokenOuterClass.TokenCounters copy(HeaderBiddingTokenOuterClass.TokenCounters tokenCounters, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tokenCounters, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builder = tokenCounters.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        TokenCountersKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
