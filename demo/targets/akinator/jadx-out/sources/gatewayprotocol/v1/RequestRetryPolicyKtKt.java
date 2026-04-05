package gatewayprotocol.v1;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestRetryPolicyKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class RequestRetryPolicyKtKt {
    /* renamed from: -initializerequestRetryPolicy, reason: not valid java name */
    public static final NativeConfigurationOuterClass.RequestRetryPolicy m4100initializerequestRetryPolicy(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.RequestRetryPolicy copy(NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestRetryPolicy, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder = requestRetryPolicy.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
