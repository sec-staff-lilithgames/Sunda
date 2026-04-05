package com.unity3d.ads.core.extensions;

import com.applovin.sdk.AppLovinErrorCodes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.adplayer.model.ErrorReason;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class IntExtensionKt {
    public static final ErrorReason webResourceToErrorReason(int i10) {
        switch (i10) {
            case -16:
                return ErrorReason.REASON_WEB_ERROR_UNSAFE_RESOURCE;
            case -15:
                return ErrorReason.REASON_WEB_ERROR_TOO_MANY_REQUESTS;
            case -14:
                return ErrorReason.REASON_WEB_ERROR_FILE_NOT_FOUND;
            case -13:
                return ErrorReason.REASON_WEB_ERROR_FILE;
            case -12:
                return ErrorReason.REASON_WEB_ERROR_BAD_URL;
            case -11:
                return ErrorReason.REASON_WEB_ERROR_FAILED_SSL_HANDSHAKE;
            case -10:
                return ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_SCHEME;
            case -9:
                return ErrorReason.REASON_WEB_ERROR_REDIRECT_LOOP;
            case AppLovinErrorCodes.INVALID_AD_TOKEN /* -8 */:
                return ErrorReason.REASON_WEB_ERROR_TIMEOUT;
            case AppLovinErrorCodes.INVALID_ZONE /* -7 */:
                return ErrorReason.REASON_WEB_ERROR_IO;
            case AppLovinErrorCodes.UNABLE_TO_RENDER_AD /* -6 */:
                return ErrorReason.REASON_WEB_ERROR_CONNECT;
            case C.RESULT_FORMAT_READ /* -5 */:
                return ErrorReason.REASON_WEB_ERROR_PROXY_AUTHENTICATION;
            case C.RESULT_BUFFER_READ /* -4 */:
                return ErrorReason.REASON_WEB_ERROR_AUTHENTICATION;
            case -3:
                return ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_AUTH_SCHEME;
            case -2:
                return ErrorReason.REASON_WEB_ERROR_HOST_LOOKUP;
            case -1:
                return ErrorReason.REASON_WEB_ERROR_UNKNOWN;
            default:
                return ErrorReason.REASON_UNKNOWN;
        }
    }
}
