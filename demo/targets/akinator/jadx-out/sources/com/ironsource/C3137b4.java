package com.ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.b4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3137b4 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f36029a = "NETWORK_TYPE_WIFI";

    /* renamed from: b, reason: collision with root package name */
    public static final String f36030b = "NETWORK_TYPE_VPN";

    /* renamed from: c, reason: collision with root package name */
    public static final String f36031c = "NETWORK_TYPE_ETHERNET";

    /* renamed from: d, reason: collision with root package name */
    public static final String f36032d = "NETWORK_TYPE_UNKNOWN";

    /* renamed from: e, reason: collision with root package name */
    public static final String f36033e = "notReachable";

    /* renamed from: f, reason: collision with root package name */
    public static final String f36034f = "PHONE_TYPE_NONE";

    /* renamed from: g, reason: collision with root package name */
    public static final String f36035g = "NETWORK_TYPE_GPRS";

    /* renamed from: h, reason: collision with root package name */
    public static final String f36036h = "NETWORK_TYPE_EDGE";

    /* renamed from: i, reason: collision with root package name */
    public static final String f36037i = "NETWORK_TYPE_UMTS";

    /* renamed from: j, reason: collision with root package name */
    public static final String f36038j = "NETWORK_TYPE_CDMA";

    /* renamed from: k, reason: collision with root package name */
    public static final String f36039k = "NETWORK_TYPE_EVDO_0";

    /* renamed from: l, reason: collision with root package name */
    public static final String f36040l = "NETWORK_TYPE_EVDO_A";

    /* renamed from: m, reason: collision with root package name */
    public static final String f36041m = "NETWORK_TYPE_1xRTT";

    /* renamed from: n, reason: collision with root package name */
    public static final String f36042n = "NETWORK_TYPE_HSDPA";

    /* renamed from: o, reason: collision with root package name */
    public static final String f36043o = "NETWORK_TYPE_HSUPA";

    /* renamed from: p, reason: collision with root package name */
    public static final String f36044p = "NETWORK_TYPE_HSPA";

    /* renamed from: q, reason: collision with root package name */
    public static final String f36045q = "NETWORK_TYPE_IDEN";

    /* renamed from: r, reason: collision with root package name */
    public static final String f36046r = "NETWORK_TYPE_EVDO_B";

    /* renamed from: s, reason: collision with root package name */
    public static final String f36047s = "NETWORK_TYPE_LTE";

    /* renamed from: t, reason: collision with root package name */
    public static final String f36048t = "NETWORK_TYPE_EHRPD";

    /* renamed from: u, reason: collision with root package name */
    public static final String f36049u = "NETWORK_TYPE_HSPAP";

    /* renamed from: v, reason: collision with root package name */
    public static final String f36050v = "NETWORK_TYPE_GSM";

    /* renamed from: w, reason: collision with root package name */
    public static final String f36051w = "NETWORK_TYPE_TD_SCDMA";

    /* renamed from: x, reason: collision with root package name */
    public static final String f36052x = "NETWORK_TYPE_IWLAN";

    /* renamed from: y, reason: collision with root package name */
    public static final String f36053y = "NETWORK_TYPE_LTE_CA";

    /* renamed from: z, reason: collision with root package name */
    public static final String f36054z = "NETWORK_TYPE_NR";

    public static String a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network != null && connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                return networkCapabilities == null ? c(context) : networkCapabilities.hasTransport(1) ? C3119a4.f35922b : networkCapabilities.hasTransport(0) ? C3119a4.f35921a : c(context);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return "none";
    }

    public static String b(Context context) {
        return a(a(context), context);
    }

    private static String c(Context context) {
        String strA = C3119a4.a(context);
        return TextUtils.isEmpty(strA) ? "none" : strA;
    }

    public static String d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network networkA = a(connectivityManager);
            if (networkA == null) {
                return f36033e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkA);
                if (networkCapabilities == null) {
                    return f36032d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f36029a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th2) {
                C3422r4.d().a(th2);
                IronLog.INTERNAL.error("Error getting network capabilities: " + th2);
            }
        }
        return f36032d;
    }

    public static boolean e(Context context) {
        return b(context, a(context)).equals("vpn");
    }

    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        return C3119a4.f35922b;
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        return C3119a4.f35927g;
                    }
                    if (networkCapabilities.hasTransport(4)) {
                        return "vpn";
                    }
                    if (networkCapabilities.hasTransport(3)) {
                        return C3119a4.f35925e;
                    }
                    if (networkCapabilities.hasTransport(5)) {
                        return C3119a4.f35928h;
                    }
                    if (networkCapabilities.hasTransport(6)) {
                        return C3119a4.f35929i;
                    }
                    if (networkCapabilities.hasTransport(2)) {
                        return C3119a4.f35924d;
                    }
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return "";
    }

    public static Network a(Context context) {
        if (context == null) {
            return null;
        }
        return a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    public static JSONObject a(Context context, Network network) throws JSONException {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put(C3191e4.i.f36562v, e(context));
                    return jSONObject;
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return jSONObject;
    }

    private static String a(int i10) {
        switch (i10) {
            case 0:
                return f36034f;
            case 1:
                return f36035g;
            case 2:
                return f36036h;
            case 3:
                return f36037i;
            case 4:
                return f36038j;
            case 5:
                return f36039k;
            case 6:
                return f36040l;
            case 7:
                return OIPXcgrVyyxoLF.NWPc;
            case 8:
                return f36042n;
            case 9:
                return f36043o;
            case 10:
                return f36044p;
            case 11:
                return f36045q;
            case 12:
                return f36046r;
            case 13:
                return f36047s;
            case 14:
                return f36048t;
            case 15:
                return f36049u;
            case 16:
                return f36050v;
            case 17:
                return f36051w;
            case 18:
                return f36052x;
            case 19:
                return f36053y;
            case 20:
                return f36054z;
            default:
                return f36032d;
        }
    }

    private static Network a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            return null;
        }
    }
}
