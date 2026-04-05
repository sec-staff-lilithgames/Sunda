package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class HeaderBiddingTokenKtKt {
    /* renamed from: -initializeheaderBiddingToken, reason: not valid java name */
    public static final HeaderBiddingTokenOuterClass.HeaderBiddingToken m4082initializeheaderBiddingToken(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        HeaderBiddingTokenKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final HeaderBiddingTokenOuterClass.HeaderBiddingToken copy(HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingToken, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder = headerBiddingToken.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        HeaderBiddingTokenKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasCampaignState()) {
            return headerBiddingTokenOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasClientInfo()) {
            return headerBiddingTokenOrBuilder.getClientInfo();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasDynamicDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasInitializationData()) {
            return headerBiddingTokenOrBuilder.getInitializationData();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasLimitedSessionToken()) {
            return headerBiddingTokenOrBuilder.getLimitedSessionToken();
        }
        return null;
    }

    public static final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasMediationInfo()) {
            return headerBiddingTokenOrBuilder.getMediationInfo();
        }
        return null;
    }

    public static final PiiOuterClass.Pii getPiiOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasPii()) {
            return headerBiddingTokenOrBuilder.getPii();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasSessionCounters()) {
            return headerBiddingTokenOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasStaticDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final TestDataOuterClass.TestData getTestDataOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTestData()) {
            return headerBiddingTokenOrBuilder.getTestData();
        }
        return null;
    }

    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTimestamps()) {
            return headerBiddingTokenOrBuilder.getTimestamps();
        }
        return null;
    }

    public static final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTokenCounters()) {
            return headerBiddingTokenOrBuilder.getTokenCounters();
        }
        return null;
    }
}
