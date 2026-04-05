package gatewayprotocol.v1;

import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseKt;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class InitializationResponseKtKt {
    /* renamed from: -initializeinitializationResponse, reason: not valid java name */
    public static final InitializationResponseOuterClass.InitializationResponse m4087initializeinitializationResponse(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        InitializationResponseKt.Dsl.Companion companion = InitializationResponseKt.Dsl.Companion;
        InitializationResponseOuterClass.InitializationResponse.Builder builderNewBuilder = InitializationResponseOuterClass.InitializationResponse.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        InitializationResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationResponseOuterClass.InitializationResponse copy(InitializationResponseOuterClass.InitializationResponse initializationResponse, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initializationResponse, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        InitializationResponseKt.Dsl.Companion companion = InitializationResponseKt.Dsl.Companion;
        InitializationResponseOuterClass.InitializationResponse.Builder builder = initializationResponse.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        InitializationResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasError()) {
            return initializationResponseOrBuilder.getError();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.NativeConfiguration getNativeConfigurationOrNull(InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasNativeConfiguration()) {
            return initializationResponseOrBuilder.getNativeConfiguration();
        }
        return null;
    }
}
