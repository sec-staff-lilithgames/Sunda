package de;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m0 {
    public static boolean requiresSecureDecoder(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void setLogSessionIdOnMediaDrmSession(MediaDrm mediaDrm, byte[] bArr, zd.c0 c0Var) {
        LogSessionId logSessionId = c0Var.getLogSessionId();
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        com.google.android.gms.internal.ads.a.c(com.google.android.exoplayer2.util.a.checkNotNull(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionId);
    }
}
