package com.facebook.ads.redexgen.core;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: com.facebook.ads.redexgen.X.8b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10288b {
    public static void A00(AudioTrack audioTrack, C10167m c10167m) {
        LogSessionId logSessionIdA00 = c10167m.A00();
        LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!logSessionIdA00.equals(logSessionId)) {
            audioTrack.setLogSessionId(logSessionIdA00);
        }
    }
}
