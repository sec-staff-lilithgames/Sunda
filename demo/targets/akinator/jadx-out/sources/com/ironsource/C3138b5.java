package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.b5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3138b5 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36055a = "b5";

    public static JSONObject a(Context context) throws JSONException {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(f36055a, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(f36055a, "add LAT");
                jSONObject.put(C3191e4.i.M, Boolean.parseBoolean(limitAdTracking));
            }
            return jSONObject;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static JSONObject b(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        d(context, jSONObject);
        c(jSONObject);
        b(context, jSONObject);
        g(context, jSONObject);
        e(context, jSONObject);
        b(jSONObject);
        f(context, jSONObject);
        c(context, jSONObject);
        a(context, jSONObject);
        h(context, jSONObject);
        return jSONObject;
    }

    private static void c(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36565y), SDKUtils.encodeString(String.valueOf(Mb.U().i().h())));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void d(Context context, JSONObject jSONObject) throws JSONException {
        try {
            String strB = C3137b4.b(context);
            String strD = C3137b4.d(context);
            if (!TextUtils.isEmpty(strD)) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strD));
            }
            if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
            }
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36562v), C3137b4.e(context));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void e(Context context, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.P), C3156c5.b(context).a(context));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void f(Context context, JSONObject jSONObject) throws JSONException {
        B7 b7I = Mb.U().i();
        try {
            if (a(C3191e4.i.f36544k0)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36544k0), b7I.C(context));
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void g(Context context, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString(Q6.Y0), Mb.U().i().J(context));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void h(Context context, JSONObject jSONObject) throws JSONException {
        B7 b7I = Mb.U().i();
        try {
            if (a(C3191e4.i.f36550n0)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36550n0), b7I.h(context));
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void c(Context context, JSONObject jSONObject) throws JSONException {
        B7 b7I = Mb.U().i();
        try {
            if (a(C3191e4.i.f36546l0)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36546l0), b7I.D(context));
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void b(Context context, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.Y), Mb.U().i().k(context));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public static JSONObject c(Context context) throws JSONException {
        B7 b7I = Mb.U().i();
        C3156c5 c3156c5B = C3156c5.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String strD = c3156c5B.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = c3156c5B.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
            }
            String strE = c3156c5B.e();
            if (strE != null) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36547m), SDKUtils.encodeString(strE));
            }
            String strF = c3156c5B.f();
            if (strF != null) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36549n), strF.replaceAll("[^0-9/.]", ""));
            }
            String strF2 = c3156c5B.f();
            if (strF2 != null) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36551o), SDKUtils.encodeString(strF2));
            }
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36553p), String.valueOf(c3156c5B.a()));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36555q), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (c3156c5B.b() != null && c3156c5B.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36557r), SDKUtils.encodeString(c3156c5B.b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36564x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (a(C3191e4.i.f36542j0)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36542j0), SDKUtils.encodeString(String.valueOf(b7I.q(context))));
            }
            String strG = C1.g(context);
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
            }
            String strValueOf = String.valueOf(b7I.r());
            if (!TextUtils.isEmpty(strValueOf)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.K), SDKUtils.encodeString(strValueOf));
            }
            String strValueOf2 = String.valueOf(b7I.p());
            if (!TextUtils.isEmpty(strValueOf2)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.O), SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), C3182dd.d(context));
            jSONObject.put("mcc", C3119a4.b(context));
            jSONObject.put("mnc", C3119a4.c(context));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.S), C3119a4.f(context));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.R), SDKUtils.encodeString(C3119a4.g(context)));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.V), C1.f(context));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.X), C1.d(context));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.W), SDKUtils.encodeString(C1.b(context)));
            jSONObject.put(SDKUtils.encodeString("stid"), C3182dd.c(context));
            String strE2 = C1.e(context);
            if (!TextUtils.isEmpty(strE2)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36528c0), SDKUtils.encodeString(strE2));
            }
            jSONObject.put(C3191e4.i.f36530d0, SDKUtils.encodeString(String.valueOf(b7I.a())));
            jSONObject.put(C3191e4.i.f36532e0, SDKUtils.encodeString(String.valueOf(b7I.m())));
            String strG2 = b7I.G(context);
            if (!TextUtils.isEmpty(strG2)) {
                jSONObject.put("icc", strG2);
            }
            String strD2 = b7I.d();
            if (!TextUtils.isEmpty(strD2)) {
                jSONObject.put("tz", SDKUtils.encodeString(strD2));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            return jSONObject;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    private static boolean a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    private static void a(JSONObject jSONObject) {
        B7 b7I = Mb.U().i();
        try {
            a(jSONObject, C3191e4.i.H, String.valueOf(b7I.k()));
            a(jSONObject, C3191e4.i.I, String.valueOf(b7I.c()));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void b(JSONObject jSONObject) throws JSONException {
        B7 b7I = Mb.U().i();
        try {
            if (a(C3191e4.i.f36540i0)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36540i0), b7I.j());
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void a(Context context, JSONObject jSONObject) throws JSONException {
        B7 b7I = Mb.U().i();
        try {
            if (a(C3191e4.i.f36548m0)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36548m0), b7I.e(context));
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
