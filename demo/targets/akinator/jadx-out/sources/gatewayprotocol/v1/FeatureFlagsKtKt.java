package gatewayprotocol.v1;

import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class FeatureFlagsKtKt {
    /* renamed from: -initializefeatureFlags, reason: not valid java name */
    public static final NativeConfigurationOuterClass.FeatureFlags m4079initializefeatureFlags(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder builderNewBuilder = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        FeatureFlagsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.FeatureFlags copy(NativeConfigurationOuterClass.FeatureFlags featureFlags, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(featureFlags, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder builder = featureFlags.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        FeatureFlagsKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
