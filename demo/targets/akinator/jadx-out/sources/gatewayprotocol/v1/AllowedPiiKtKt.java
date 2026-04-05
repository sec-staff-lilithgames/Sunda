package gatewayprotocol.v1;

import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AllowedPiiKtKt {
    /* renamed from: -initializeallowedPii, reason: not valid java name */
    public static final AllowedPiiOuterClass.AllowedPii m4060initializeallowedPii(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder builderNewBuilder = AllowedPiiOuterClass.AllowedPii.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AllowedPiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii copy(AllowedPiiOuterClass.AllowedPii allowedPii, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(allowedPii, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder builder = allowedPii.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        AllowedPiiKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
