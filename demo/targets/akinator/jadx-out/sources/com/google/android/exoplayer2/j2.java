package com.google.android.exoplayer2;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j2 extends Exception implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final String f27553e = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f27554f = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: g, reason: collision with root package name */
    public static final String f27555g = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: h, reason: collision with root package name */
    public static final String f27556h = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

    /* renamed from: i, reason: collision with root package name */
    public static final String f27557i = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);

    /* renamed from: b, reason: collision with root package name */
    public final int f27558b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27559c;

    public j2(String str, Throwable th2, int i10) {
        this(str, th2, i10, com.google.android.exoplayer2.util.d.f28436a.elapsedRealtime());
    }

    public static String getErrorCodeName(int i10) {
        if (i10 == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i10 == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        if (i10 == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i10 == 7001) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        switch (i10) {
            case 1000:
                return "ERROR_CODE_UNSPECIFIED";
            case 1001:
                return "ERROR_CODE_REMOTE_ERROR";
            case 1002:
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            case IronSourceError.AUCTION_ERROR_DECRYPTION /* 1003 */:
                return "ERROR_CODE_TIMEOUT";
            case 1004:
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            default:
                switch (i10) {
                    case 2000:
                        return "ERROR_CODE_IO_UNSPECIFIED";
                    case 2001:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                    case 2002:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                    case 2003:
                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                    case 2004:
                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                    case 2005:
                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                    case 2006:
                        return "ERROR_CODE_IO_NO_PERMISSION";
                    case 2007:
                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                    case 2008:
                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                    default:
                        switch (i10) {
                            case 3001:
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            case 3002:
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            case BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE:
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            case IronSourceError.ERROR_REWARD_VALIDATION_FAILED /* 3004 */:
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            default:
                                switch (i10) {
                                    case 4001:
                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                    case 4002:
                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                    case 4003:
                                        return "ERROR_CODE_DECODING_FAILED";
                                    case 4004:
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    case 4005:
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    default:
                                        switch (i10) {
                                            case 6000:
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            case AdError.MEDIAVIEW_MISSING_ERROR_CODE /* 6001 */:
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                            case 6004:
                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                            case 6005:
                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                            case 6006:
                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                            case 6007:
                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                            case 6008:
                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                            default:
                                                return i10 >= 1000000 ? "custom error code" : "invalid error code";
                                        }
                                }
                        }
                }
        }
    }

    public boolean errorInfoEquals(j2 j2Var) {
        if (this == j2Var) {
            return true;
        }
        if (j2Var != null && getClass() == j2Var.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = j2Var.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!com.google.android.exoplayer2.util.n1.areEqual(cause.getMessage(), cause2.getMessage()) || !com.google.android.exoplayer2.util.n1.areEqual(cause.getClass(), cause2.getClass())) {
                return false;
            }
            if (this.f27558b == j2Var.f27558b && com.google.android.exoplayer2.util.n1.areEqual(getMessage(), j2Var.getMessage()) && this.f27559c == j2Var.f27559c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f27553e, this.f27558b);
        bundle.putLong(f27554f, this.f27559c);
        bundle.putString(f27555g, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f27556h, cause.getClass().getName());
            bundle.putString(f27557i, cause.getMessage());
        }
        return bundle;
    }

    public j2(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.f27558b = i10;
        this.f27559c = j10;
    }

    public final String getErrorCodeName() {
        return getErrorCodeName(this.f27558b);
    }
}
