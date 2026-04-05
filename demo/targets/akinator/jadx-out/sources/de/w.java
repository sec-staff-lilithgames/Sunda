package de;

import android.media.MediaDrm;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w {
    public static boolean isMediaDrmStateException(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int mediaDrmStateExceptionToErrorCode(Throwable th2) {
        return n1.getErrorCodeForMediaDrmErrorCode(n1.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
