package gatewayprotocol.v1;

import gatewayprotocol.v1.PiiKt;
import gatewayprotocol.v1.PiiOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class PiiKtKt {
    /* renamed from: -initializepii, reason: not valid java name */
    public static final PiiOuterClass.Pii m4095initializepii(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builderNewBuilder = PiiOuterClass.Pii.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        PiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PiiOuterClass.Pii copy(PiiOuterClass.Pii pii, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pii, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builder = pii.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        PiiKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
