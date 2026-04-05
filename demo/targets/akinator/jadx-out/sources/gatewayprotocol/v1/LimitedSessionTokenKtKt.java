package gatewayprotocol.v1;

import gatewayprotocol.v1.LimitedSessionTokenKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class LimitedSessionTokenKtKt {
    /* renamed from: -initializelimitedSessionToken, reason: not valid java name */
    public static final UniversalRequestOuterClass.LimitedSessionToken m4088initializelimitedSessionToken(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        UniversalRequestOuterClass.LimitedSessionToken.Builder builderNewBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        LimitedSessionTokenKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken copy(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(limitedSessionToken, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        UniversalRequestOuterClass.LimitedSessionToken.Builder builder = limitedSessionToken.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        LimitedSessionTokenKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
