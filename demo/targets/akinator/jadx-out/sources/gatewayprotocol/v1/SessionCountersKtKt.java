package gatewayprotocol.v1;

import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class SessionCountersKtKt {
    /* renamed from: -initializesessionCounters, reason: not valid java name */
    public static final SessionCountersOuterClass.SessionCounters m4102initializesessionCounters(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        SessionCountersOuterClass.SessionCounters.Builder builderNewBuilder = SessionCountersOuterClass.SessionCounters.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        SessionCountersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SessionCountersOuterClass.SessionCounters copy(SessionCountersOuterClass.SessionCounters sessionCounters, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionCounters, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        SessionCountersOuterClass.SessionCounters.Builder builder = sessionCounters.toBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        SessionCountersKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
