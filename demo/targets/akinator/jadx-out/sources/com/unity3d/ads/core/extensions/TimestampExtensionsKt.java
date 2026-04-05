package com.unity3d.ads.core.extensions;

import com.google.protobuf.Timestamp;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TimestampExtensionsKt {
    public static final long duration(long j10) {
        return System.nanoTime() - j10;
    }

    public static final Timestamp fromMillis(long j10) {
        long j11 = 1000;
        Timestamp timestampBuild = Timestamp.newBuilder().setSeconds(j10 / j11).setNanos((int) ((j10 % j11) * 1000000)).build();
        e0.checkNotNullExpressionValue(timestampBuild, "newBuilder().setSeconds(…000000).toInt())).build()");
        return timestampBuild;
    }
}
