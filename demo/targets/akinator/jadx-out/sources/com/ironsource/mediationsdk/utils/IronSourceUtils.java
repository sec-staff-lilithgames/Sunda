package com.ironsource.mediationsdk.utils;

import a.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.ironsource.B1;
import com.ironsource.B7;
import com.ironsource.C3119a4;
import com.ironsource.C3126ab;
import com.ironsource.C3182dd;
import com.ironsource.C3285j9;
import com.ironsource.C3422r4;
import com.ironsource.Mb;
import com.ironsource.N6;
import com.ironsource.R9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.c;
import com.ironsource.mediationsdk.r;
import com.unity3d.mediation.LevelPlay;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class IronSourceUtils {
    private static int A = 1;
    private static AtomicBoolean B = new AtomicBoolean(false);
    private static String C = null;
    private static Boolean D = null;
    private static IronSourceUtils E = new IronSourceUtils();

    /* renamed from: a, reason: collision with root package name */
    private static final String f37803a = "default_is_events_formatter_type";

    /* renamed from: b, reason: collision with root package name */
    private static final String f37804b = "default_is_events_url";

    /* renamed from: c, reason: collision with root package name */
    private static final String f37805c = "default_is_non_connectivity_events";

    /* renamed from: d, reason: collision with root package name */
    private static final String f37806d = "default_is_opt_in_events";

    /* renamed from: e, reason: collision with root package name */
    private static final String f37807e = "default_is_opt_out_events";

    /* renamed from: f, reason: collision with root package name */
    private static final String f37808f = "default_is_trigger_events";

    /* renamed from: g, reason: collision with root package name */
    private static final String f37809g = "default_rv_events_formatter_type";

    /* renamed from: h, reason: collision with root package name */
    private static final String f37810h = "default_rv_events_url";

    /* renamed from: i, reason: collision with root package name */
    private static final String f37811i = "default_rv_non_connectivity_events";

    /* renamed from: j, reason: collision with root package name */
    private static final String f37812j = "default_rv_opt_in_events";

    /* renamed from: k, reason: collision with root package name */
    private static final String f37813k = "default_rv_opt_out_events";

    /* renamed from: l, reason: collision with root package name */
    private static final String f37814l = "default_rv_trigger_events";

    /* renamed from: m, reason: collision with root package name */
    private static final String f37815m = "default_pxl_events_url";

    /* renamed from: n, reason: collision with root package name */
    private static final String f37816n = "default_pxl_trigger_events";

    /* renamed from: o, reason: collision with root package name */
    private static final String f37817o = "default_app_opt_in_events";

    /* renamed from: p, reason: collision with root package name */
    private static final String f37818p = "default_app_opt_out_events";

    /* renamed from: q, reason: collision with root package name */
    private static final String f37819q = "default_app_events_url";

    /* renamed from: r, reason: collision with root package name */
    private static final String f37820r = "default_app_trigger_events";

    /* renamed from: s, reason: collision with root package name */
    private static final String f37821s = "default_app_events_formatter_type";

    /* renamed from: t, reason: collision with root package name */
    private static final String f37822t = "default_app_non_connectivity_events";

    /* renamed from: u, reason: collision with root package name */
    private static final String f37823u = "general_properties";

    /* renamed from: v, reason: collision with root package name */
    private static final String f37824v = "last_response";

    /* renamed from: w, reason: collision with root package name */
    private static final String f37825w = "firstSessionTimestamp";

    /* renamed from: x, reason: collision with root package name */
    private static final String f37826x = "providerPriority";

    /* renamed from: y, reason: collision with root package name */
    private static final String f37827y = "9.0.0";

    /* renamed from: z, reason: collision with root package name */
    private static final String f37828z = "Mediation_Shared_Preferences";

    public static String a(long j10, String str) {
        return h(j10 + r.m().n() + str);
    }

    public static IronSourceUtils b() {
        return E;
    }

    private static String c(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f37803a : (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) ? f37809g : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f37821s : "";
    }

    private static String d(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f37805c : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? f37811i : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f37822t : "";
    }

    private static String e(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f37806d : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? f37812j : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f37817o : "";
    }

    private static String f(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f37807e : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? f37813k : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f37818p : "";
    }

    public static boolean g() {
        return A == 1;
    }

    private static Map<LevelPlay.AdFormat, Map<String, JSONObject>> getAdUnitIds() {
        HashMap map = new HashMap();
        try {
            C3126ab c3126abA = Mb.U().e().a();
            if (c3126abA != null) {
                for (LevelPlay.AdFormat adFormat : LevelPlay.AdFormat.values()) {
                    HashMap map2 = new HashMap();
                    map.put(adFormat, map2);
                    for (String str : c3126abA.a(adFormat)) {
                        if (!str.equals(B1.f33864e)) {
                            map2.put(str, new JSONObject());
                        }
                    }
                }
            }
            return map;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("failed to get ad unit ids - exception = " + e10);
            return map;
        }
    }

    @Deprecated
    public static String getSDKVersion() {
        return "9.0.0";
    }

    public static String h(String str) {
        try {
            return String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e10) {
            C3422r4.d().a(e10);
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e10);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, b.l("getSHA256(input:", str, ")"), e10);
            return "";
        }
    }

    public static synchronized void i(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
    }

    private static void setSerr(int i10) {
        A = i10;
    }

    private static String b(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f37804b : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? f37810h : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? f37815m : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f37819q : "";
    }

    private static String g(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f37808f : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? f37814l : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? f37816n : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f37820r : "";
    }

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return C3119a4.f35922b;
            }
            return networkCapabilities.hasTransport(0) ? C3119a4.f35927g : "none";
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.NATIVE.error("failed to connection type - exception = " + e10);
            return "none";
        }
    }

    public static synchronized void c(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(f37828z, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(",");
                    }
                    string = sb2.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(f(str), string);
                editorEdit.apply();
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void d(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(f37828z, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(",");
                    }
                    string = sb2.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(g(str), string);
                editorEdit.apply();
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void e(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f37828z, 0).edit();
            editorEdit.putString(b(str), str2);
            editorEdit.apply();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e10);
        }
    }

    public static void f(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f37828z, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static synchronized void b(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(f37828z, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(",");
                    }
                    string = sb2.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(e(str), string);
                editorEdit.apply();
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean g(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.NATIVE.error("failed to check if network is connected - exception = " + e10);
            return false;
        }
    }

    public static String f() {
        String strA = N6.a().a("userId");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return strA;
    }

    public static void a(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new c());
        thread.start();
    }

    public static boolean f(Context context) {
        return C3182dd.d(context);
    }

    public static synchronized void a(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(f37828z, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(",");
                    }
                    string = sb2.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(d(str), string);
                editorEdit.apply();
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void e(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f37828z, 0).edit();
        editorEdit.putString(f37824v, str);
        editorEdit.apply();
    }

    public static String e(Context context) {
        return context.getSharedPreferences(f37828z, 0).getString(f37824v, "");
    }

    public static synchronized int[] c(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(f37828z, 0).getString(f(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iArr;
    }

    public static synchronized void d(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f37828z, 0).edit();
            editorEdit.putString(c(str), str2);
            editorEdit.apply();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e10);
        }
    }

    public static long e() {
        return System.currentTimeMillis();
    }

    public static synchronized String b(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(f37828z, 0).getString(b(str), str2);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e10);
        }
        return str2;
    }

    public static synchronized String a(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(f37828z, 0).getString(c(str), str2);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e10);
        }
        return str2;
    }

    public static synchronized int[] d(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(f37828z, 0).getString(g(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iArr;
    }

    public static synchronized int[] b(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(f37828z, 0).getString(e(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iArr;
    }

    public static String c(Context context, String str, String str2) {
        return context.getSharedPreferences(f37828z, 0).getString(str, str2);
    }

    public static synchronized int[] a(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(f37828z, 0).getString(d(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iArr;
    }

    public static boolean c(Context context) {
        if (D == null) {
            D = Boolean.valueOf(!C3285j9.a(context));
        }
        return D.booleanValue();
    }

    public static String c() {
        return N6.a().a("userId");
    }

    public static JSONObject b(boolean z10) {
        return a(z10, false, 1);
    }

    public static synchronized String d() {
        try {
            if (B.compareAndSet(false, true)) {
                C = UUID.randomUUID().toString();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return C;
    }

    public static void b(Context context, String str, boolean z10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f37828z, 0).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }

    public static R9 d(Context context) {
        String str;
        B7 b7I = Mb.U().i();
        if (context == null) {
            return null;
        }
        String strB = r.m().b(context);
        if (TextUtils.isEmpty(strB)) {
            strB = b7I.M(context);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
            str = gjnZrsdA.EDAcnVPEg;
        } else {
            str = IronSourceConstants.TYPE_GAID;
        }
        return new R9(strB, str);
    }

    public static void b(Context context, String str, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f37828z, 0).edit();
        editorEdit.putInt(str, i10);
        editorEdit.apply();
    }

    public static JSONObject a(boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (!z10) {
                return jSONObject;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, "dynamic");
            return jSONObject;
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            return jSONObject;
        }
    }

    public static void b(Context context, String str, long j10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f37828z, 0).edit();
        editorEdit.putLong(str, j10);
        editorEdit.apply();
    }

    public static JSONObject a(String str, List<String> list, List<String> list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i10 < list.size() && i11 < list2.size(); i11++) {
                String str2 = list.get(i10);
                String str3 = list2.get(i11);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i10++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + ";" + TextUtils.join(",", arrayList));
            return jSONObject;
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            return jSONObject;
        }
    }

    public static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (jSONObject == null && jSONObject2 == null) {
                return new JSONObject();
            }
            if (jSONObject == null) {
                return jSONObject2;
            }
            if (jSONObject2 == null) {
                return jSONObject;
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
            return jSONObject;
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static Map<String, String> b(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        map.put(next, jSONObject.get(next).toString());
                    }
                }
            }
            return map;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return map;
        }
    }

    public static JSONObject a(boolean z10, boolean z11, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z10) {
                jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z11 && i10 != -1) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i10);
            }
            return jSONObject;
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            return jSONObject;
        }
    }

    public static boolean a(Context context, String str, boolean z10) {
        return context.getSharedPreferences(f37828z, 0).getBoolean(str, z10);
    }

    public static int a(Context context, String str, int i10) {
        return context.getSharedPreferences(f37828z, 0).getInt(str, i10);
    }

    public static String b(Context context) {
        if (Mb.U().i().a(context)) {
            return "Tablet";
        }
        return "Phone";
    }

    public static long a(Context context, String str, long j10) {
        return context.getSharedPreferences(f37828z, 0).getLong(str, j10);
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            if ((obj instanceof JSONObject) && jSONObject3.optJSONObject(next) != null) {
                jSONObject3.put(next, a(jSONObject3.getJSONObject(next), (JSONObject) obj));
            } else {
                jSONObject3.put(next, obj);
            }
        }
        return jSONObject3;
    }

    public static List<Pair<String, String>> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        arrayList.add(new Pair(next, jSONObject.get(next).toString()));
                    }
                }
            }
            return arrayList;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return arrayList;
        }
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a() {
        try {
            return new Throwable().getStackTrace()[1].getMethodName();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }
}
