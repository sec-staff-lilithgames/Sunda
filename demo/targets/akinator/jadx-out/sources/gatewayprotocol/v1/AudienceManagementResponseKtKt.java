package gatewayprotocol.v1;

import gatewayprotocol.v1.AudienceManagementResponseKt;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AudienceManagementResponseKtKt {
    /* renamed from: -initializeaudienceManagementResponse, reason: not valid java name */
    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse m4062initializeaudienceManagementResponse(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AudienceManagementResponseKt.Dsl.Companion companion = AudienceManagementResponseKt.Dsl.Companion;
        AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builderNewBuilder = AudienceManagementResponseOuterClass.AudienceManagementResponse.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AudienceManagementResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse copy(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(audienceManagementResponse, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AudienceManagementResponseKt.Dsl.Companion companion = AudienceManagementResponseKt.Dsl.Companion;
        AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder = audienceManagementResponse.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        AudienceManagementResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder audienceManagementResponseOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(audienceManagementResponseOrBuilder, "<this>");
        if (audienceManagementResponseOrBuilder.hasError()) {
            return audienceManagementResponseOrBuilder.getError();
        }
        return null;
    }
}
