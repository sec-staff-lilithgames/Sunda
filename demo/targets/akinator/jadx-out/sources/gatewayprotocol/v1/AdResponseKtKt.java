package gatewayprotocol.v1;

import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdResponseKtKt {
    /* renamed from: -initializeadResponse, reason: not valid java name */
    public static final AdResponseOuterClass.AdResponse m4059initializeadResponse(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.Companion;
        AdResponseOuterClass.AdResponse.Builder builderNewBuilder = AdResponseOuterClass.AdResponse.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AdResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdResponseOuterClass.AdResponse copy(AdResponseOuterClass.AdResponse adResponse, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adResponse, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.Companion;
        AdResponseOuterClass.AdResponse.Builder builder = adResponse.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        AdResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adResponseOrBuilder, "<this>");
        if (adResponseOrBuilder.hasError()) {
            return adResponseOrBuilder.getError();
        }
        return null;
    }

    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adResponseOrBuilder, "<this>");
        if (adResponseOrBuilder.hasWebviewConfiguration()) {
            return adResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }
}
