package gatewayprotocol.v1;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.DiagnosticTagKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DiagnosticTagKtKt {
    /* renamed from: -initializediagnosticTag, reason: not valid java name */
    public static final DiagnosticEventRequestOuterClass.DiagnosticTag m4074initializediagnosticTag(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DiagnosticTagKt.Dsl.Companion companion = DiagnosticTagKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DiagnosticTagKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticTag copy(DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(diagnosticTag, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DiagnosticTagKt.Dsl.Companion companion = DiagnosticTagKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder = diagnosticTag.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DiagnosticTagKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
