package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b0 {
    public static j getOffloadedPlaybackSupport(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return j.f60951d;
        }
        return new i().setIsFormatSupported(true).setIsGaplessSupported(io.bidmachine.media3.common.util.a1.f60679a > 32 && playbackOffloadSupport == 2).setIsSpeedChangeSupported(z10).build();
    }
}
