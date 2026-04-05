package gatewayprotocol.v1;

import gatewayprotocol.v1.PrivacyUpdateResponseKt;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class PrivacyUpdateResponseKtKt {
    /* renamed from: -initializeprivacyUpdateResponse, reason: not valid java name */
    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse m4098initializeprivacyUpdateResponse(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        PrivacyUpdateResponseKt.Dsl.Companion companion = PrivacyUpdateResponseKt.Dsl.Companion;
        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builderNewBuilder = PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        PrivacyUpdateResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse copy(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(privacyUpdateResponse, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        PrivacyUpdateResponseKt.Dsl.Companion companion = PrivacyUpdateResponseKt.Dsl.Companion;
        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder = privacyUpdateResponse.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        PrivacyUpdateResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
