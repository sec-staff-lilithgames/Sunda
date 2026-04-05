package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface i2 {
    void disable();

    void enable(h2 h2Var, Context context, Looper looper, Looper looper2, io.bidmachine.media3.common.util.g gVar);

    boolean isSelectedOutputSuitableForPlayback();
}
