package gatewayprotocol.v1;

import gatewayprotocol.v1.PrivacyUpdateRequestKt;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class PrivacyUpdateRequestKtKt {
    /* renamed from: -initializeprivacyUpdateRequest, reason: not valid java name */
    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest m4097initializeprivacyUpdateRequest(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        PrivacyUpdateRequestKt.Dsl.Companion companion = PrivacyUpdateRequestKt.Dsl.Companion;
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builderNewBuilder = PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        PrivacyUpdateRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest copy(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(privacyUpdateRequest, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        PrivacyUpdateRequestKt.Dsl.Companion companion = PrivacyUpdateRequestKt.Dsl.Companion;
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder = privacyUpdateRequest.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        PrivacyUpdateRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
