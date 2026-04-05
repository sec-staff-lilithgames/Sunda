package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends Exception {
    public b(o oVar, f fVar, int i10) {
        super("Decoder init failed: [" + i10 + "], " + oVar, fVar);
        String str = oVar.f25701f;
        Math.abs(i10);
    }

    public b(o oVar, Exception exc, String str) {
        super("Decoder init failed: " + str + ", " + oVar, exc);
        String str2 = oVar.f25701f;
        if (z.f26070a < 21 || !(exc instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) exc).getDiagnosticInfo();
    }
}
