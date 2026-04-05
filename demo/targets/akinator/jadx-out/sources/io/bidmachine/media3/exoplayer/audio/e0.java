package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioTrack;
import java.math.RoundingMode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e0 {
    public static long getAudioTrackBufferSizeUs(AudioTrack audioTrack, l0 l0Var) {
        return l0Var.f60974c == 0 ? l0Var.framesToDurationUs(audioTrack.getBufferSizeInFrames()) : io.bidmachine.media3.common.util.a1.scaleLargeValue(audioTrack.getBufferSizeInFrames(), 1000000L, w0.a(l0Var.f60978g), RoundingMode.DOWN);
    }

    public static void setPreferredDeviceOnAudioTrack(AudioTrack audioTrack, h hVar) {
        audioTrack.setPreferredDevice(hVar == null ? null : hVar.f60946a);
    }
}
