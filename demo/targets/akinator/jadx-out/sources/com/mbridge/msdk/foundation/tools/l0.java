package com.mbridge.msdk.foundation.tools;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ironsource.Y1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import j1.o2;
import java.lang.reflect.Constructor;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class l0 extends u {
    private static int A = 0;
    private static String B = "";
    private static Object C = null;
    private static int D = 0;
    private static int E = 0;
    private static long F = -1;
    private static long G = -1;
    private static String H = "";
    private static String I = "";

    /* renamed from: j, reason: collision with root package name */
    private static String f41134j = "";

    /* renamed from: k, reason: collision with root package name */
    private static String f41135k = "";

    /* renamed from: l, reason: collision with root package name */
    private static int f41136l = -1;

    /* renamed from: m, reason: collision with root package name */
    private static String f41137m = "";

    /* renamed from: n, reason: collision with root package name */
    private static int f41138n = -1;

    /* renamed from: o, reason: collision with root package name */
    private static int f41139o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static String f41140p = "";

    /* renamed from: q, reason: collision with root package name */
    private static int f41141q = -1;

    /* renamed from: r, reason: collision with root package name */
    private static String f41142r = "";

    /* renamed from: s, reason: collision with root package name */
    private static String f41143s = "";

    /* renamed from: t, reason: collision with root package name */
    private static volatile int f41144t = -1;

    /* renamed from: u, reason: collision with root package name */
    private static String f41145u = "";

    /* renamed from: v, reason: collision with root package name */
    private static String f41146v = "";

    /* renamed from: w, reason: collision with root package name */
    private static int f41147w = 0;

    /* renamed from: x, reason: collision with root package name */
    private static String f41148x = "";

    /* renamed from: y, reason: collision with root package name */
    private static String f41149y = "";

    /* renamed from: z, reason: collision with root package name */
    private static int f41150z = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41151a;

        public a(Context context) {
            this.f41151a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.tools.f.c(this.f41151a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41152a;

        public b(Context context) {
            this.f41152a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String defaultUserAgent;
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(this.f41152a);
            } catch (Throwable unused) {
                defaultUserAgent = null;
            }
            try {
                if (TextUtils.isEmpty(defaultUserAgent) || defaultUserAgent.equals(l0.f41149y)) {
                    return;
                }
                String unused2 = l0.f41149y = defaultUserAgent;
                l0.G(this.f41152a);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41153a;

        public c(Context context) {
            this.f41153a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f41153a.getSystemService("connectivity");
                if (connectivityManager != null && com.mbridge.msdk.foundation.same.a.f40729z) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        int unused = l0.f41144t = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        int unused2 = l0.f41144t = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) this.f41153a.getSystemService("phone");
                    if (telephonyManager == null) {
                        int unused3 = l0.f41144t = 0;
                    } else {
                        int unused4 = l0.f41144t = l0.c(telephonyManager.getNetworkType());
                    }
                }
            } catch (Exception unused5) {
                int unused6 = l0.f41144t = 0;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = l0.f41148x = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.util.c.a();
            } catch (Exception e10) {
                p0.b("SameDiTool", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
            if (contextD != null) {
                ActivityManager activityManager = (ActivityManager) contextD.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                long unused = l0.G = memoryInfo.totalMem;
                long unused2 = l0.F = memoryInfo.availMem;
            }
        }
    }

    public static int A() {
        return f41150z;
    }

    public static int B() {
        if (D == 0) {
            D = u0.e();
        }
        return D;
    }

    public static void C(Context context) {
        try {
            u.e(context);
            o();
            q();
            t(context);
            B(context);
            A(context);
            F(context);
            n();
            s();
            p(context);
            w();
            com.mbridge.msdk.foundation.same.a.B = false;
            com.mbridge.msdk.foundation.same.a.f40729z = u0.b("android.permission.ACCESS_NETWORK_STATE", context);
            w(context);
            l();
            com.mbridge.msdk.foundation.tools.f.b();
            g();
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage());
        }
    }

    public static int D(Context context) {
        if (f41136l == -1) {
            f41136l = u0.c(context, "com.tencent.mm") ? 1 : 0;
        }
        return f41136l;
    }

    private static void E() {
        String str = Build.VERSION.RELEASE;
        String strN = n();
        String str2 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strN)) {
            f41149y = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
            return;
        }
        StringBuilder sbB = b3.h.b("Mozilla/5.0 (Linux; Android ", str, "; ", strN, " Build/");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        f41149y = o2.o(sbB, str2, ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
    }

    public static int F(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Context context) {
        try {
            x0.b(context, "mbridge_ua", f41149y);
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage(), th2);
        }
    }

    public static int c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public static Object d(String str) {
        if (C == null) {
            C = u0.g(str);
        }
        return C;
    }

    public static int e(String str) {
        if (E == 0) {
            E = u0.f(str);
        }
        return E;
    }

    public static void g(Context context) {
        try {
            c cVar = new c(context);
            if (com.mbridge.msdk.foundation.same.threadpool.a.d().getActiveCount() < 1) {
                com.mbridge.msdk.foundation.same.threadpool.a.d().execute(cVar);
            }
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage());
        }
    }

    public static void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.mbridge.msdk.foundation.tools.f.c(context);
            } else {
                new Handler(context.getMainLooper()).post(new a(context));
            }
        } catch (Exception e10) {
            p0.b("SameDiTool", "", e10);
        }
    }

    public static String i() {
        if (TextUtils.isEmpty(f41149y)) {
            l(com.mbridge.msdk.foundation.controller.c.m().d());
        }
        return f41149y;
    }

    public static String j() {
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    public static void k() {
        try {
            Object objA = x0.a(com.mbridge.msdk.foundation.controller.c.m().d(), MBridgeConstans.SP_GA_ID, "");
            Object objA2 = x0.a(com.mbridge.msdk.foundation.controller.c.m().d(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (objA instanceof String) {
                String str = (String) objA;
                if (!TextUtils.isEmpty(str)) {
                    com.mbridge.msdk.foundation.tools.f.a(str);
                }
                if (objA2 instanceof Integer) {
                    com.mbridge.msdk.foundation.tools.f.a(((Integer) objA2).intValue());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("SameDiTool", e10.getMessage());
            }
        }
    }

    public static String l(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return null;
        }
        i(context);
        try {
            if (Looper.myLooper() != Looper.getMainLooper() || MBridgeConstans.DNT_GUA_ON_UI) {
                if (TextUtils.isEmpty(f41149y)) {
                    E();
                }
                z(context);
            } else if (TextUtils.isEmpty(f41149y)) {
                try {
                    f41149y = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(f41149y)) {
                    try {
                        Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                        declaredConstructor.setAccessible(true);
                        f41149y = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                        declaredConstructor.setAccessible(false);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    if (TextUtils.isEmpty(f41149y)) {
                        try {
                            f41149y = new WebView(context).getSettings().getUserAgentString();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                    if (TextUtils.isEmpty(f41149y)) {
                        E();
                    }
                }
            } else {
                z(context);
            }
        } catch (Throwable th4) {
            p0.b("SameDiTool", th4.getMessage(), th4);
        }
        G(context);
        return f41149y;
    }

    public static int m(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapV = v(context);
            return mapV.get("height") == null ? displayMetrics.heightPixels : ((Integer) mapV.get("height")).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String n() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MODEL;
    }

    private static void o() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new f());
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage());
        }
    }

    public static String p() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MANUFACTURER;
    }

    public static String q(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f41142r = "";
            } else if (TextUtils.isEmpty(f41142r)) {
                if (context == null) {
                    f41142r = "";
                    return "";
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (u0.j(simOperator)) {
                    f41142r = simOperator.substring(0, Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f41142r = "";
        }
        return f41142r;
    }

    public static String r(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f41143s = "";
            } else if (TextUtils.isEmpty(f41143s)) {
                if (context == null) {
                    f41143s = "";
                    return f41142r;
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (u0.j(simOperator)) {
                    f41143s = simOperator.substring(Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f41143s = "";
        }
        return f41143s;
    }

    public static int s(Context context) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return f41144t;
            }
            if (contextD == null) {
                return f41144t;
            }
            if (f41144t != -1) {
                g(contextD);
                return f41144t;
            }
            f41144t = 0;
            return f41144t;
        } catch (Exception e10) {
            p0.b("SameDiTool", e10.getMessage(), e10);
            f41144t = 0;
            return f41144t;
        }
    }

    public static String t(Context context) {
        if (context == null) {
            return f41146v;
        }
        try {
            if (!TextUtils.isEmpty(f41146v)) {
                return f41146v;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            f41146v = str;
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String u() throws JSONException {
        try {
            if (TextUtils.isEmpty(I)) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                long jA = k0.a();
                String strJ = j(contextD);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("1", strJ);
                    jSONObject.put("2", String.valueOf(G));
                    jSONObject.put("3", String.valueOf(jA));
                    jSONObject.put("4", "");
                    jSONObject.put(CampaignEx.CLICKMODE_ON, "");
                } catch (Exception e10) {
                    p0.b("SameDiTool", e10.getMessage());
                }
                String strB = com.mbridge.msdk.foundation.tools.a.b(jSONObject.toString());
                I = strB;
                if (strB == null) {
                    I = "";
                }
            }
        } catch (Exception e11) {
            p0.b("SameDiTool", e11.getMessage());
        }
        return I;
    }

    public static HashMap v(Context context) {
        HashMap map = new HashMap();
        if (context == null) {
            return map;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            map.put("height", Integer.valueOf(displayMetrics.heightPixels));
            map.put("width", Integer.valueOf(displayMetrics.widthPixels));
            return map;
        } catch (Exception e10) {
            p0.b("SameDiTool", e10.getMessage(), e10);
            return map;
        }
    }

    public static String w() {
        try {
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage(), th2);
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            return "";
        }
        if (TextUtils.isEmpty(f41148x)) {
            new Thread(new d()).start();
            return f41148x;
        }
        return f41148x;
    }

    public static String x(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e10) {
            p0.b("SameDiTool", e10.getMessage(), e10);
            return "";
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage(), th2);
            return "";
        }
    }

    public static String y(Context context) {
        return (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) && context != null) ? String.valueOf(G) : "";
    }

    private static void z(Context context) {
        try {
            new Thread(new b(context)).start();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static int A(Context context) {
        if (context == null) {
            return A;
        }
        int i10 = A;
        if (i10 != 0) {
            return i10;
        }
        try {
            int i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            A = i11;
            return i11;
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static String a(Context context, int i10) {
        TelephonyManager telephonyManager;
        if (i10 != 0 && i10 != 9) {
            try {
                return (!com.mbridge.msdk.foundation.same.a.f40729z || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
            } catch (Throwable th2) {
                p0.b("SameDiTool", th2.getMessage(), th2);
            }
        }
        return "";
    }

    public static String j(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f41135k)) {
                    f41135k = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
                }
            } else {
                f41135k = "";
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f41135k = "";
        }
        return f41135k;
    }

    public static float o(Context context) {
        Resources resources;
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null && (resources = context.getResources()) != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage());
        }
        return -1.0f;
    }

    public static int y() {
        try {
        } catch (Exception e10) {
            f41139o = 0;
            p0.b("SameDiTool", e10.getMessage());
        }
        if (!r0.a().a("v_a_d_p", false)) {
            return 0;
        }
        if (u0.i()) {
            f41139o = 1;
        } else if (u0.j()) {
            f41139o = 2;
        } else {
            f41139o = 0;
        }
        return f41139o;
    }

    public static String B(Context context) {
        if (context == null) {
            return B;
        }
        try {
            if (TextUtils.isEmpty(B)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                B = str;
                return str;
            }
            return B;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static int D() {
        if (f41138n == -1) {
            f41138n = u0.g() ? 1 : 0;
        }
        return f41138n;
    }

    public static void d(int i10) {
        f41141q = i10;
    }

    private static void i(Context context) {
        if (TextUtils.isEmpty(f41149y)) {
            try {
                f41149y = x0.a(context, "mbridge_ua", "").toString();
            } catch (Throwable th2) {
                p0.b("SameDiTool", th2.getMessage(), th2);
            }
        }
    }

    public static int n(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapV = v(context);
            return mapV.get("width") == null ? displayMetrics.widthPixels : ((Integer) mapV.get("width")).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String p(Context context) {
        Locale locale;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f41140p)) {
            String str = PcrIk.uepUvGTTSFCDtT;
            if (context == null) {
                return str;
            }
            try {
                if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                    return str;
                }
                String languageTag = locale.toLanguageTag();
                f41140p = languageTag;
                return languageTag;
            } catch (Throwable th2) {
                p0.a("SameDiTool", th2.getMessage());
                f41140p = str;
            }
        }
        return f41140p;
    }

    public static int z() {
        try {
            if (u0.i()) {
                return 1;
            }
            return u0.j() ? 2 : 0;
        } catch (Exception e10) {
            p0.b("SameDiTool", e10.getMessage());
            return 0;
        }
    }

    public static void g() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new e());
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage());
        }
    }

    public static int h() {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return 0;
            }
            long j10 = F;
            if (j10 > 0) {
                return Long.valueOf((j10 / 1000) / 1000).intValue();
            }
            return -1;
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage(), th2);
            return -1;
        }
    }

    public static int m() {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.VERSION.SDK_INT;
        }
        return -1;
    }

    public static String x() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(H)) {
            long j10 = G;
            if (j10 > 0) {
                H = Math.ceil(Float.valueOf(j10 / 1.0737418E9f).doubleValue()) + "GB";
            }
        }
        return H;
    }

    public static String a(String str, Context context) {
        try {
        } catch (Exception e10) {
            p0.b("SameDiTool", e10.getMessage(), e10);
        }
        if (!TextUtils.isEmpty(f41134j)) {
            return f41134j;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            f41134j = context.getPackageManager().getInstallerPackageName(str);
            p0.a("SameDiTool", "PKGSource:" + f41134j);
        }
        return f41134j;
    }

    public static String t() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static int v() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        long j10 = G;
        if (j10 > 0) {
            return Long.valueOf((j10 / 1000) / 1000).intValue();
        }
        return -1;
    }

    public static int w(Context context) {
        if (context == null) {
            return f41147w;
        }
        if (f41147w == 0) {
            try {
                f41147w = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e10) {
                p0.b("SameDiTool", e10.getMessage());
            }
        }
        return f41147w;
    }

    public static String k(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) || context == null) {
                return Y1.f35726f;
            }
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            String str = new DecimalFormat("0.0").format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(str) ? Y1.f35726f : str;
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage());
            return Y1.f35726f;
        }
    }

    public static String q() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f41145u)) {
            f41145u = p0.o2.j(r(), "");
        }
        return f41145u;
    }

    public static int r() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String s() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.BRAND;
    }

    public static int u(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return -1;
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage());
            return -1;
        }
    }

    public static int C() {
        return f41141q;
    }

    public static boolean E(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static String l() {
        String str;
        if (!TextUtils.isEmpty(f41137m)) {
            return f41137m;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
        } catch (Throwable th2) {
            p0.b("SameDiTool", th2.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod("getVersion", null).invoke(cls2, null));
                } catch (Throwable th3) {
                    p0.b("SameDiTool", th3.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.m().d().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th4) {
                    p0.b("SameDiTool", th4.getMessage());
                }
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = j0.b(string);
                }
                f41137m = string;
            } else {
                f41137m = "android";
            }
        } catch (Throwable th5) {
            p0.b("SameDiTool", th5.getMessage());
        }
        return f41137m;
    }
}
