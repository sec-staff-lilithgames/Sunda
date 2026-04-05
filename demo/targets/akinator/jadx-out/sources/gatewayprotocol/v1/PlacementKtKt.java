package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.PlacementKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class PlacementKtKt {
    /* renamed from: -initializeplacement, reason: not valid java name */
    public static final InitializationResponseOuterClass.Placement m4096initializeplacement(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builderNewBuilder = InitializationResponseOuterClass.Placement.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationResponseOuterClass.Placement copy(InitializationResponseOuterClass.Placement placement, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builder = placement.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
