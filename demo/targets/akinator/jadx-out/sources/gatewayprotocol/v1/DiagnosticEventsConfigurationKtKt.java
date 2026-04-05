package gatewayprotocol.v1;

import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DiagnosticEventsConfigurationKtKt {
    /* renamed from: -initializediagnosticEventsConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration m4073initializediagnosticEventsConfiguration(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DiagnosticEventsConfigurationKt.Dsl.Companion companion = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration copy(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(diagnosticEventsConfiguration, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DiagnosticEventsConfigurationKt.Dsl.Companion companion = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder = diagnosticEventsConfiguration.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
