package gatewayprotocol.v1;

import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class NativeConfigurationKtKt {
    /* renamed from: -initializenativeConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.NativeConfiguration m4091initializenativeConfiguration(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.NativeConfiguration copy(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfiguration, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperationsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasAdOperations()) {
            return nativeConfigurationOrBuilder.getAdOperations();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getAdPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasAdPolicy()) {
            return nativeConfigurationOrBuilder.getAdPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfigurationOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasCachedAssetsConfiguration()) {
            return nativeConfigurationOrBuilder.getCachedAssetsConfiguration();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfigurationOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasCachedWebviewFilesConfiguration()) {
            return nativeConfigurationOrBuilder.getCachedWebviewFilesConfiguration();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.DebugSettings getDebugSettingsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasDebugSettings()) {
            return nativeConfigurationOrBuilder.getDebugSettings();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEventsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasDiagnosticEvents()) {
            return nativeConfigurationOrBuilder.getDiagnosticEvents();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasDownloadPolicy()) {
            return nativeConfigurationOrBuilder.getDownloadPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.FeatureFlags getFeatureFlagsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasFeatureFlags()) {
            return nativeConfigurationOrBuilder.getFeatureFlags();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getInitPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasInitPolicy()) {
            return nativeConfigurationOrBuilder.getInitPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasOperativeEventPolicy()) {
            return nativeConfigurationOrBuilder.getOperativeEventPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getOtherPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasOtherPolicy()) {
            return nativeConfigurationOrBuilder.getOtherPolicy();
        }
        return null;
    }
}
