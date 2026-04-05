package io.bidmachine.media3.exoplayer;

import android.content.Context;
import com.applovin.impl.aa;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class i0 {
    public static void registerMediaMetricsListener(Context context, l0 l0Var, boolean z10, on.f0 f0Var) {
        ((io.bidmachine.media3.common.util.q0) l0Var.getClock()).createHandler(l0Var.getPlaybackLooper(), null).post(new aa(context, z10, l0Var, f0Var, 10));
    }
}
