package gatewayprotocol.v1;

import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataKt;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class MutableDataKtKt {
    /* renamed from: -initializemutableData, reason: not valid java name */
    public static final MutableDataOuterClass.MutableData m4090initializemutableData(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.Companion;
        MutableDataOuterClass.MutableData.Builder builderNewBuilder = MutableDataOuterClass.MutableData.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        MutableDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MutableDataOuterClass.MutableData copy(MutableDataOuterClass.MutableData mutableData, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mutableData, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.Companion;
        MutableDataOuterClass.MutableData.Builder builder = mutableData.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        MutableDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasAllowedPii()) {
            return mutableDataOrBuilder.getAllowedPii();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasSessionCounters()) {
            return mutableDataOrBuilder.getSessionCounters();
        }
        return null;
    }
}
