package qe;

import android.media.metrics.LogSessionId;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s {
    public static void setLogSessionIdToMediaCodecFormat(l lVar, zd.c0 c0Var) {
        LogSessionId logSessionId = c0Var.getLogSessionId();
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        lVar.f82844b.setString("log-session-id", logSessionId.getStringId());
    }
}
