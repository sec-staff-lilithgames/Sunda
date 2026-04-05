package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class f0 {
    public static void setLogSessionIdOnAudioTrack(AudioTrack audioTrack, on.f0 f0Var) {
        LogSessionId logSessionId = f0Var.getLogSessionId();
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
