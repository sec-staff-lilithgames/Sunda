package de;

import com.facebook.ads.AdError;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y {
    public static int getErrorCodeForMediaDrmException(Exception exc, int i10) {
        int i11 = n1.f28506a;
        if (i11 >= 21 && w.isMediaDrmStateException(exc)) {
            return w.mediaDrmStateExceptionToErrorCode(exc);
        }
        if (i11 >= 23 && x.isMediaDrmResetException(exc)) {
            return 6006;
        }
        if (i11 >= 18 && v.isNotProvisionedException(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (i11 >= 18 && v.isDeniedByServerException(exc)) {
            return 6007;
        }
        if (exc instanceof r0) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof g) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof o0) {
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
