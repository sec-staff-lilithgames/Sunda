package gatewayprotocol.v1;

import gatewayprotocol.v1.AudienceManagementRequestKt;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AudienceManagementRequestKtKt {
    /* renamed from: -initializeaudienceManagementRequest, reason: not valid java name */
    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest m4061initializeaudienceManagementRequest(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.Companion;
        AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builderNewBuilder = AudienceManagementRequestOuterClass.AudienceManagementRequest.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AudienceManagementRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasDynamicDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasSessionCounters()) {
            return audienceManagementRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasStaticDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest copy(AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(audienceManagementRequest, GalEuEfxjome.ulUGPV);
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.Companion;
        AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder = audienceManagementRequest.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        AudienceManagementRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
