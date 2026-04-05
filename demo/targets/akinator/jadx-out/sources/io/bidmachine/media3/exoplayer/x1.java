package io.bidmachine.media3.exoplayer;

import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface x1 {
    s1[] createRenderers(Handler handler, io.g0 g0Var, io.bidmachine.media3.exoplayer.audio.o oVar, eo.g gVar, yn.c cVar);

    default s1 createSecondaryRenderer(s1 s1Var, Handler handler, io.g0 g0Var, io.bidmachine.media3.exoplayer.audio.o oVar, eo.g gVar, yn.c cVar) {
        return null;
    }
}
