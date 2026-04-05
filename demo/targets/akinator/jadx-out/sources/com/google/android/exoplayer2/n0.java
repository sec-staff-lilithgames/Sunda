package com.google.android.exoplayer2;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n0 {
    public static zd.c0 registerMediaMetricsListener(Context context, r0 r0Var, boolean z10) {
        zd.z zVarCreate = zd.z.create(context);
        if (zVarCreate == null) {
            com.google.android.exoplayer2.util.f0.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zd.c0(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z10) {
            r0Var.addAnalyticsListener(zVarCreate);
        }
        return new zd.c0(zVarCreate.getLogSessionId());
    }
}
