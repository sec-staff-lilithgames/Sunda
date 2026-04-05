package gatewayprotocol.v1;

import gatewayprotocol.v1.MediationInfoKt;
import gatewayprotocol.v1.MediationInfoOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class MediationInfoKtKt {
    /* renamed from: -initializemediationInfo, reason: not valid java name */
    public static final MediationInfoOuterClass.MediationInfo m4089initializemediationInfo(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.Companion;
        MediationInfoOuterClass.MediationInfo.Builder builderNewBuilder = MediationInfoOuterClass.MediationInfo.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        MediationInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MediationInfoOuterClass.MediationInfo copy(MediationInfoOuterClass.MediationInfo mediationInfo, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationInfo, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.Companion;
        MediationInfoOuterClass.MediationInfo.Builder builder = mediationInfo.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        MediationInfoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
