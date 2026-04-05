package gatewayprotocol.v1;

import gatewayprotocol.v1.NetworkCapabilityTransportsKt;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class NetworkCapabilityTransportsKtKt {
    /* renamed from: -initializenetworkCapabilityTransports, reason: not valid java name */
    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports m4092initializenetworkCapabilityTransports(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        NetworkCapabilityTransportsKt.Dsl.Companion companion = NetworkCapabilityTransportsKt.Dsl.Companion;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builderNewBuilder = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        NetworkCapabilityTransportsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports copy(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkCapabilityTransports, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        NetworkCapabilityTransportsKt.Dsl.Companion companion = NetworkCapabilityTransportsKt.Dsl.Companion;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder = networkCapabilityTransports.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        NetworkCapabilityTransportsKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
