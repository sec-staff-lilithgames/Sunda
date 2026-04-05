package gn;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b1 extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public static final String f57809f = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f57810g = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f57811h = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: i, reason: collision with root package name */
    public static final String f57812i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: j, reason: collision with root package name */
    public static final String f57813j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: k, reason: collision with root package name */
    public static final String f57814k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(5);

    /* renamed from: b, reason: collision with root package name */
    public final int f57815b;

    /* renamed from: c, reason: collision with root package name */
    public final long f57816c;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f57817e;

    public b1(String str, Throwable th2, int i10) {
        this(str, th2, i10, Bundle.EMPTY, io.bidmachine.media3.common.util.g.f60717a.elapsedRealtime());
    }

    public static b1 fromBundle(Bundle bundle) {
        String string = bundle.getString(f57811h);
        String string2 = bundle.getString(f57812i);
        String string3 = bundle.getString(f57813j);
        if (!TextUtils.isEmpty(string2)) {
            try {
                Class<?> cls = Class.forName(string2, true, b1.class.getClassLoader());
                remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                if (remoteException == null) {
                    remoteException = new RemoteException(string3);
                }
            } catch (Throwable unused) {
                remoteException = new RemoteException(string3);
            }
        }
        Throwable th2 = remoteException;
        int i10 = bundle.getInt(f57809f, 1000);
        Bundle bundle2 = bundle.getBundle(f57814k);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new b1(string, th2, i10, bundle2, bundle.getLong(f57810g, SystemClock.elapsedRealtime()));
    }

    public static String getErrorCodeName(int i10) {
        if (i10 == -100) {
            return "ERROR_CODE_DISCONNECTED";
        }
        if (i10 == -6) {
            return "ERROR_CODE_NOT_SUPPORTED";
        }
        if (i10 == -4) {
            return "ERROR_CODE_PERMISSION_DENIED";
        }
        if (i10 == -3) {
            return "ERROR_CODE_BAD_VALUE";
        }
        if (i10 == -2) {
            return "ERROR_CODE_INVALID_STATE";
        }
        if (i10 == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i10 == 7001) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        switch (i10) {
            case -110:
                return "ERROR_CODE_CONTENT_ALREADY_PLAYING";
            case -109:
                return "ERROR_CODE_END_OF_PLAYLIST";
            case -108:
                return "ERROR_CODE_SETUP_REQUIRED";
            case -107:
                return "ERROR_CODE_SKIP_LIMIT_REACHED";
            case -106:
                return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
            case -105:
                return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
            case -104:
                return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
            case -103:
                return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
            case -102:
                return "ERROR_CODE_AUTHENTICATION_EXPIRED";
            default:
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
                                            case 4006:
                                                return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                            default:
                                                switch (i10) {
                                                    case IronSourceConstants.errorCode_biddingDataException /* 5001 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                    case IronSourceConstants.errorCode_isReadyException /* 5002 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                    case IronSourceConstants.errorCode_loadInProgress /* 5003 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                    case IronSourceConstants.errorCode_showInProgress /* 5004 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
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
        }
    }

    public boolean errorInfoEquals(b1 b1Var) {
        if (this == b1Var) {
            return true;
        }
        if (b1Var != null && getClass() == b1Var.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = b1Var.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (this.f57815b == b1Var.f57815b && Objects.equals(getMessage(), b1Var.getMessage()) && this.f57816c == b1Var.f57816c) {
                return true;
            }
        }
        return false;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f57809f, this.f57815b);
        bundle.putLong(f57810g, this.f57816c);
        bundle.putString(f57811h, getMessage());
        bundle.putBundle(f57814k, this.f57817e);
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f57812i, cause.getClass().getName());
            bundle.putString(f57813j, cause.getMessage());
        }
        return bundle;
    }

    public b1(String str, Throwable th2, int i10, Bundle bundle) {
        this(str, th2, i10, bundle, io.bidmachine.media3.common.util.g.f60717a.elapsedRealtime());
    }

    public b1(String str, Throwable th2, int i10, Bundle bundle, long j10) {
        super(str, th2);
        this.f57815b = i10;
        this.f57817e = bundle;
        this.f57816c = j10;
    }

    public final String getErrorCodeName() {
        return getErrorCodeName(this.f57815b);
    }
}
