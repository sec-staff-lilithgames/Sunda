package gatewayprotocol.v1;

import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdOperationsConfigurationKtKt {
    /* renamed from: -initializeadOperationsConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.AdOperationsConfiguration m4055initializeadOperationsConfiguration(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.AdOperationsConfiguration copy(NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adOperationsConfiguration, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder = adOperationsConfiguration.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
