package gatewayprotocol.v1;

import gatewayprotocol.v1.AdPlayerConfigResponseKt;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdPlayerConfigResponseKtKt {
    /* renamed from: -initializeadPlayerConfigResponse, reason: not valid java name */
    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse m4057initializeadPlayerConfigResponse(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AdPlayerConfigResponseKt.Dsl.Companion companion = AdPlayerConfigResponseKt.Dsl.Companion;
        AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builderNewBuilder = AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AdPlayerConfigResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse copy(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adPlayerConfigResponse, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AdPlayerConfigResponseKt.Dsl.Companion companion = AdPlayerConfigResponseKt.Dsl.Companion;
        AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder = adPlayerConfigResponse.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        AdPlayerConfigResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasError()) {
            return adPlayerConfigResponseOrBuilder.getError();
        }
        return null;
    }

    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasWebviewConfiguration()) {
            return adPlayerConfigResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }
}
