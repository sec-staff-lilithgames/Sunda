package gatewayprotocol.v1;

import bp.oM.DwaEpyvxz;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ErrorKtKt {
    public static final ErrorOuterClass.Error copy(ErrorOuterClass.Error error, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builder = error.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        ErrorKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializeerror, reason: not valid java name */
    public static final ErrorOuterClass.Error m4078initializeerror(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builderNewBuilder = ErrorOuterClass.Error.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, DwaEpyvxz.SChImzCEcYBN);
        ErrorKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
