package com.google.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampKt;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TimestampKtKt {
    public static final Timestamp copy(Timestamp timestamp, l block) {
        e0.checkNotNullParameter(timestamp, "<this>");
        e0.checkNotNullParameter(block, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builder = timestamp.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializetimestamp, reason: not valid java name */
    public static final Timestamp m527initializetimestamp(l lVar) {
        e0.checkNotNullParameter(lVar, duhsDlGWdBkekB.taSUG);
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builderNewBuilder = Timestamp.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
