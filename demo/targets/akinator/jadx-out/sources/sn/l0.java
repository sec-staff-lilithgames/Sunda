package sn;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class l0 {
    public static boolean requiresSecureDecoder(MediaDrm mediaDrm, String str, int i10) {
        return mediaDrm.requiresSecureDecoder(str, i10);
    }

    public static void setLogSessionIdOnMediaDrmSession(MediaDrm mediaDrm, byte[] bArr, on.f0 f0Var) {
        LogSessionId logSessionId = f0Var.getLogSessionId();
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        com.google.android.gms.internal.ads.a.c(io.bidmachine.media3.common.util.a.checkNotNull(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionId);
    }
}
