package gatewayprotocol.v1;

import gatewayprotocol.v1.DebugSettingsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DebugSettingsKtKt {
    /* renamed from: -initializedebugSettings, reason: not valid java name */
    public static final NativeConfigurationOuterClass.DebugSettings m4068initializedebugSettings(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DebugSettingsKt.Dsl.Companion companion = DebugSettingsKt.Dsl.Companion;
        NativeConfigurationOuterClass.DebugSettings.Builder builderNewBuilder = NativeConfigurationOuterClass.DebugSettings.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DebugSettingsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.DebugSettings copy(NativeConfigurationOuterClass.DebugSettings debugSettings, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(debugSettings, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DebugSettingsKt.Dsl.Companion companion = DebugSettingsKt.Dsl.Companion;
        NativeConfigurationOuterClass.DebugSettings.Builder builder = debugSettings.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DebugSettingsKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
