package io.odeeo.internal.f;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.facebook.ads.AdError;
import io.odeeo.internal.f.c;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public static boolean isDeniedByServerException(Throwable th2) {
            return th2 instanceof DeniedByServerException;
        }

        public static boolean isNotProvisionedException(Throwable th2) {
            return th2 instanceof NotProvisionedException;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public static boolean isMediaDrmStateException(Throwable th2) {
            return th2 instanceof MediaDrm.MediaDrmStateException;
        }

        public static int mediaDrmStateExceptionToErrorCode(Throwable th2) {
            return g0.getErrorCodeForMediaDrmErrorCode(g0.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {
        public static boolean isMediaDrmResetException(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    public static int getErrorCodeForMediaDrmException(Exception exc, int i10) {
        int i11 = g0.f65861a;
        if (i11 >= 21 && b.isMediaDrmStateException(exc)) {
            return b.mediaDrmStateExceptionToErrorCode(exc);
        }
        if (i11 >= 23 && c.isMediaDrmResetException(exc)) {
            return 6006;
        }
        if (i11 >= 18 && a.isNotProvisionedException(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (i11 >= 18 && a.isDeniedByServerException(exc)) {
            return 6007;
        }
        if (exc instanceof t) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof c.e) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof q) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
