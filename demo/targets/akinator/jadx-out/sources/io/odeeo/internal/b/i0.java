package io.odeeo.internal.b;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i0 extends Exception implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final g.a<i0> f62742c = new hv.t(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f62743a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62744b;

    public i0(String str, Throwable th2, int i10) {
        this(str, th2, i10, io.odeeo.internal.q0.d.f65844a.elapsedRealtime());
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static String getErrorCodeName(int i10) {
        if (i10 == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i10 == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
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

    public boolean errorInfoEquals(i0 i0Var) {
        if (this == i0Var) {
            return true;
        }
        if (i0Var != null && getClass() == i0Var.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = i0Var.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!io.odeeo.internal.q0.g0.areEqual(cause.getMessage(), cause2.getMessage()) || !io.odeeo.internal.q0.g0.areEqual(cause.getClass(), cause2.getClass())) {
                return false;
            }
            if (this.f62743a == i0Var.f62743a && io.odeeo.internal.q0.g0.areEqual(getMessage(), i0Var.getMessage()) && this.f62744b == i0Var.f62744b) {
                return true;
            }
        }
        return false;
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a(0), this.f62743a);
        bundle.putLong(a(1), this.f62744b);
        bundle.putString(a(2), getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(a(3), cause.getClass().getName());
            bundle.putString(a(4), cause.getMessage());
        }
        return bundle;
    }

    public i0(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    public static Throwable a(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    public static RemoteException a(String str) {
        return new RemoteException(str);
    }

    public static Throwable a(Bundle bundle) {
        String string = bundle.getString(a(3));
        String string2 = bundle.getString(a(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, i0.class.getClassLoader());
            Throwable thA = Throwable.class.isAssignableFrom(cls) ? a(cls, string2) : null;
            if (thA != null) {
                return thA;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    public i0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.f62743a = i10;
        this.f62744b = j10;
    }

    public final String getErrorCodeName() {
        return getErrorCodeName(this.f62743a);
    }
}
