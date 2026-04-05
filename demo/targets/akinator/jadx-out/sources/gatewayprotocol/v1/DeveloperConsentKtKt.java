package gatewayprotocol.v1;

import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DeveloperConsentKtKt {
    /* renamed from: -initializedeveloperConsent, reason: not valid java name */
    public static final DeveloperConsentOuterClass.DeveloperConsent m4069initializedeveloperConsent(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DeveloperConsentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsent copy(DeveloperConsentOuterClass.DeveloperConsent developerConsent, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(developerConsent, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder builder = developerConsent.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DeveloperConsentKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
