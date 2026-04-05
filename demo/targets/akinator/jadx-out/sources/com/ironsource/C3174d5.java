package com.ironsource;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.amazon.device.ads.DtbConstants;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.B7;
import com.ironsource.InterfaceC3456t4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.d5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3174d5 implements B7, B7.a {
    private static final String A = "browser_user_agent";
    private static final String B = "browser_user_agent_time";
    private static final String C = "IABTCF_gdprApplies";
    private static final String D = "IABTCF_TCString";
    private static final String E = "IABTCF_AddtlConsent";

    /* renamed from: j, reason: collision with root package name */
    private static final String f36230j = "android";

    /* renamed from: k, reason: collision with root package name */
    private static final String f36231k = "com.google.android.gms.permission.AD_ID";

    /* renamed from: l, reason: collision with root package name */
    private static final String f36232l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    /* renamed from: m, reason: collision with root package name */
    private static final String f36233m = "com.google.android.gms.appset.AppSet";

    /* renamed from: n, reason: collision with root package name */
    private static final String f36234n = "com.google.android.gms.tasks.OnSuccessListener";

    /* renamed from: o, reason: collision with root package name */
    private static final String f36235o = "getAdvertisingIdInfo";

    /* renamed from: p, reason: collision with root package name */
    private static final String f36236p = "getClient";

    /* renamed from: q, reason: collision with root package name */
    private static final String f36237q = "getAppSetIdInfo";

    /* renamed from: r, reason: collision with root package name */
    private static final String f36238r = "addOnSuccessListener";

    /* renamed from: s, reason: collision with root package name */
    private static final String f36239s = "getId";

    /* renamed from: t, reason: collision with root package name */
    private static final String f36240t = "isLimitAdTrackingEnabled";

    /* renamed from: u, reason: collision with root package name */
    private static final String f36241u = "Mediation_Shared_Preferences";

    /* renamed from: v, reason: collision with root package name */
    private static final String f36242v = "supersonic_shared_preferen";

    /* renamed from: w, reason: collision with root package name */
    private static final String f36243w = "cachedUUID";

    /* renamed from: x, reason: collision with root package name */
    private static final String f36244x = "auid";

    /* renamed from: y, reason: collision with root package name */
    private static final String f36245y = "unityads-installinfo";

    /* renamed from: z, reason: collision with root package name */
    private static final String f36246z = "unityads-idfi";

    /* renamed from: b, reason: collision with root package name */
    private String f36247b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f36248c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f36249d = null;

    /* renamed from: e, reason: collision with root package name */
    private String f36250e = "";

    /* renamed from: f, reason: collision with root package name */
    private boolean f36251f = false;

    /* renamed from: g, reason: collision with root package name */
    private String f36252g = "";

    /* renamed from: h, reason: collision with root package name */
    private volatile String f36253h;

    /* renamed from: i, reason: collision with root package name */
    private volatile String f36254i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.d5$a */
    public class a implements InvocationHandler {
        public a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                        String string = obj2.getClass().getMethod(C3174d5.f36239s, null).invoke(objArr[0], null).toString();
                        if (!TextUtils.isEmpty(string)) {
                            C3174d5.this.f36252g = string;
                            return null;
                        }
                    }
                } catch (Exception e10) {
                    C3422r4.d().a(e10);
                }
            }
            return null;
        }
    }

    private String O(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objQ = Q(context);
        return objQ.getClass().getMethod(f36239s, null).invoke(objQ, null).toString();
    }

    private void P(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = AppSet.class.getMethod(f36236p, Context.class).invoke(AppSet.class, context);
        Object objInvoke2 = objInvoke.getClass().getMethod(f36237q, null).invoke(objInvoke, null);
        objInvoke2.getClass().getMethod(f36238r, OnSuccessListener.class).invoke(objInvoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new a()));
    }

    private Object Q(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return AdvertisingIdClient.class.getMethod(f36235o, Context.class).invoke(AdvertisingIdClient.class, context);
    }

    private String R(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objQ = Q(context);
        return String.valueOf(((Boolean) objQ.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objQ, null)).booleanValue());
    }

    private String S(Context context) {
        try {
            return C3215fa.a(context, f36241u, A, "");
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    private long T(Context context) {
        try {
            return Long.parseLong(C3215fa.a(context, f36241u, B, String.valueOf(-1L)));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1L;
        }
    }

    @Override // com.ironsource.B7
    public String A(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.B7
    public File B(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.B7
    public boolean C(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.ironsource.B7
    public int D(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.B7
    public float E(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.B7
    public String F(Context context) {
        try {
            return C3215fa.a(context, "IABTCF_AddtlConsent", (String) null);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return null;
        }
    }

    @Override // com.ironsource.B7
    public String G(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.B7
    public List<ApplicationInfo> H(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.ironsource.B7
    public String I(Context context) {
        C3120a5 c3120a5 = C3120a5.f35930a;
        if (c3120a5.b()) {
            try {
                if (!c3120a5.a()) {
                    return O(context);
                }
                if (this.f36254i != null) {
                    return this.f36254i;
                }
                String strO = O(context);
                if (TextUtils.isEmpty(strO)) {
                    return strO;
                }
                this.f36254i = strO;
                return strO;
            } catch (Exception e10) {
                C3422r4.d().a(e10);
            }
        }
        return null;
    }

    @Override // com.ironsource.B7
    public int K(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.B7
    public String L(Context context) {
        try {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (resolveInfoResolveActivity != null) {
                return resolveInfoResolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            return null;
        }
    }

    @Override // com.ironsource.B7
    public synchronized String M(Context context) {
        if (!TextUtils.isEmpty(this.f36247b)) {
            return this.f36247b;
        }
        if (C3215fa.a(context, f36241u, B7.f33890a, true)) {
            String strA = C3215fa.a(context, f36241u, f36243w, "");
            if (TextUtils.isEmpty(strA)) {
                String string = UUID.randomUUID().toString();
                this.f36247b = string;
                C3215fa.b(context, f36241u, f36243w, string);
            } else {
                this.f36247b = strA;
            }
        }
        return this.f36247b;
    }

    @Override // com.ironsource.B7
    public int N(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.B7
    public Boolean b(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.ironsource.B7
    public String c(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.B7
    public String d() {
        String id2 = TimeZone.getDefault().getID();
        return id2 != null ? id2 : "";
    }

    @Override // com.ironsource.B7
    public boolean e(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.B7
    public String f() {
        return "android";
    }

    @Override // com.ironsource.B7
    public long g() {
        if (j()) {
            return a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.B7
    public boolean h(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.B7
    public String i() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.B7
    public boolean j() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                if (Environment.isExternalStorageRemovable()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return false;
        }
    }

    @Override // com.ironsource.B7
    public int k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.B7
    public String l() {
        return Build.MODEL;
    }

    @Override // com.ironsource.B7
    public int m() {
        return -(TimeZone.getDefault().getOffset(a()) / DtbConstants.NETWORK_READ_TIMEOUT);
    }

    @Override // com.ironsource.B7
    public ActivityManager.MemoryInfo n(Context context) {
        if (context == null || !Mb.U().g().a()) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return null;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    @Override // com.ironsource.B7
    public int o() {
        return k();
    }

    @Override // com.ironsource.B7
    public boolean p() {
        return b("su");
    }

    @Override // com.ironsource.B7
    public long q(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.ironsource.B7
    public float r() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // com.ironsource.B7
    public String s() {
        try {
            return this.f36250e.isEmpty() ? S(ContextProvider.getInstance().getApplicationContext()) : this.f36250e;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    @Override // com.ironsource.B7
    public String t() {
        try {
            return System.getProperty("os.arch");
        } catch (SecurityException e10) {
            IronLog.INTERNAL.error(e10.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.B7
    public String u(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.B7
    public String v(Context context) {
        try {
            return C3215fa.a(context, "IABTCF_TCString", (String) null);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return null;
        }
    }

    @Override // com.ironsource.B7
    public boolean w(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.ironsource.B7
    public String x(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.B7
    public String y(Context context) {
        if (!C3120a5.f35930a.c()) {
            return "";
        }
        try {
            P(context);
            return !TextUtils.isEmpty(this.f36252g) ? this.f36252g : "";
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    @Override // com.ironsource.B7
    public int z(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    private boolean b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10] + str).exists()) {
                    return true;
                }
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
        }
        return false;
    }

    @Override // com.ironsource.B7
    public boolean J(Context context) {
        try {
            return ((PowerManager) context.getSystemService(KerkSviMAy.drxUy)).isPowerSaveMode();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.B7
    public long a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.B7
    public Long c(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.ironsource.B7
    public File f(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.B7
    public String i(Context context) {
        if (!TextUtils.isEmpty(this.f36249d)) {
            return this.f36249d;
        }
        if (context == null) {
            return null;
        }
        String strA = C3215fa.a(context, "unityads-installinfo", "unityads-idfi", (String) null);
        this.f36249d = strA;
        return strA;
    }

    @Override // com.ironsource.B7
    public File l(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.B7
    public String m(Context context) {
        if (context == null) {
            return "";
        }
        int iN = N(context);
        if (iN == 0) {
            return "landscape";
        }
        if (iN == 1) {
            return "portrait";
        }
        if (iN == 11) {
            return "landscape";
        }
        if (iN == 12) {
            return "portrait";
        }
        switch (iN) {
            case 6:
            case 8:
                return "landscape";
            case 7:
            case 9:
                return "portrait";
            default:
                return "none";
        }
    }

    @Override // com.ironsource.B7
    public int o(Context context) {
        int iK = K(context);
        int iZ = z(context);
        return (((iK == 0 || iK == 2) && iZ == 2) || ((iK == 1 || iK == 3) && iZ == 1)) ? 2 : 1;
    }

    @Override // com.ironsource.B7
    public boolean p(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.B7
    public int c() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.B7
    public synchronized String d(Context context) {
        if (!TextUtils.isEmpty(this.f36248c)) {
            return this.f36248c;
        }
        if (context == null) {
            return "";
        }
        String strA = C3215fa.a(context, "supersonic_shared_preferen", "auid", "");
        this.f36248c = strA;
        if (TextUtils.isEmpty(strA)) {
            String string = UUID.randomUUID().toString();
            this.f36248c = string;
            C3215fa.b(context, "supersonic_shared_preferen", "auid", string);
        }
        return this.f36248c;
    }

    @Override // com.ironsource.B7
    public int k(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return -1;
    }

    @Override // com.ironsource.B7
    public String r(Context context) {
        if (a(context)) {
            return "Tablet";
        }
        return "Phone";
    }

    @Override // com.ironsource.B7
    public int t(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.ironsource.B7
    public int e() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.B7
    public boolean g(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(f36231k)) {
                    return true;
                }
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
        }
        return false;
    }

    @Override // com.ironsource.B7
    public boolean a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.B7
    public long h() {
        return a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.B7
    public boolean n() {
        return this.f36251f;
    }

    @Override // com.ironsource.B7
    public String q() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.B7
    public File j(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.B7
    public int s(Context context) {
        try {
            return C3215fa.a(context, "IABTCF_gdprApplies", -1);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return -1;
        }
    }

    @Override // com.ironsource.B7
    public int b() {
        return c();
    }

    @Override // com.ironsource.B7
    public String b(Context context) {
        try {
            if (C3120a5.f35930a.a()) {
                if (this.f36253h == null) {
                    String strR = R(context);
                    if (TextUtils.isEmpty(strR)) {
                        return strR;
                    }
                    this.f36253h = strR;
                    return strR;
                }
                return this.f36253h;
            }
            return R(context);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return null;
        }
    }

    private long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576;
    }

    @Override // com.ironsource.B7
    public Long a(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.threshold);
    }

    @Override // com.ironsource.B7
    public long a(String str) {
        return a(new File(str));
    }

    @Override // com.ironsource.B7
    public boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    @Override // com.ironsource.B7.a
    public void a(Context context, long j10) {
        if (context != null) {
            if (!new C3274ig(new InterfaceC3456t4.a()).a(T(context), j10)) {
                this.f36250e = S(context);
                this.f36251f = !r0.isEmpty();
            }
            if (this.f36250e.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.f36250e = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j10 > 0) {
                        b(context, System.currentTimeMillis());
                    }
                } catch (Exception e10) {
                    C3422r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
    }

    private void b(Context context, long j10) {
        try {
            C3215fa.b(context, f36241u, B, String.valueOf(j10));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void a(Context context, String str) {
        try {
            C3215fa.b(context, f36241u, A, str);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
