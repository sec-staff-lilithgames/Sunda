package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class x0 implements j0 {
    public static AudioAttributes a(gn.h hVar, boolean z10) {
        return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : hVar.getAudioAttributesV21().f57876a;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.j0
    public final AudioTrack getAudioTrack(p pVar, gn.h hVar, int i10) throws IllegalArgumentException {
        int i11 = io.bidmachine.media3.common.util.a1.f60679a;
        if (i11 < 23) {
            return new AudioTrack(a(hVar, pVar.f61000d), io.bidmachine.media3.common.util.a1.getAudioFormat(pVar.f60998b, pVar.f60999c, pVar.f60997a), pVar.f61002f, 1, i10);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(a(hVar, pVar.f61000d)).setAudioFormat(io.bidmachine.media3.common.util.a1.getAudioFormat(pVar.f60998b, pVar.f60999c, pVar.f60997a)).setTransferMode(1).setBufferSizeInBytes(pVar.f61002f).setSessionId(i10);
        if (i11 >= 29) {
            sessionId.setOffloadedPlayback(pVar.f61001e);
        }
        return sessionId.build();
    }
}
