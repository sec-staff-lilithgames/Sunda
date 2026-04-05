package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q0 {
    public static void setLogSessionIdOnAudioTrack(AudioTrack audioTrack, zd.c0 c0Var) {
        LogSessionId logSessionId = c0Var.getLogSessionId();
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
