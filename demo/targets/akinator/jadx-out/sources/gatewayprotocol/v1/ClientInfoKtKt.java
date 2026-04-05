package gatewayprotocol.v1;

import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ClientInfoKtKt {
    /* renamed from: -initializeclientInfo, reason: not valid java name */
    public static final ClientInfoOuterClass.ClientInfo m4067initializeclientInfo(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        ClientInfoOuterClass.ClientInfo.Builder builderNewBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        ClientInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo copy(ClientInfoOuterClass.ClientInfo clientInfo, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(clientInfo, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        ClientInfoOuterClass.ClientInfo.Builder builder = clientInfo.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        ClientInfoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
