package gatewayprotocol.v1;

import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DynamicDeviceInfoKtKt {
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dynamicDeviceInfo, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder = dynamicDeviceInfo.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroidOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasAndroid()) {
            return dynamicDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIosOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasIos()) {
            return dynamicDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransportsOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder androidOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(androidOrBuilder, "<this>");
        if (androidOrBuilder.hasNetworkCapabilityTransports()) {
            return androidOrBuilder.getNetworkCapabilityTransports();
        }
        return null;
    }

    /* renamed from: -initializedynamicDeviceInfo, reason: not valid java name */
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo m4077initializedynamicDeviceInfo(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, PcrIk.oOYT);
        DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(android2, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder = android2.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ios, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        DynamicDeviceInfoKt.IosKt.Dsl.Companion companion = DynamicDeviceInfoKt.IosKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder = ios.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.IosKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
