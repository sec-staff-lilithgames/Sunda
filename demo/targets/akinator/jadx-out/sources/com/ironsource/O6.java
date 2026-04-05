package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceData;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class O6 implements Runnable {
    public static final String M = "sdkVersion";
    public static final String N = "AdvIdOptOutReason";
    private static final int O = 15;
    private static final int P = 840;
    private static final int Q = -720;
    private Context K;

    /* renamed from: a, reason: collision with root package name */
    private final String f35102a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private final String f35103b = "bundleId";

    /* renamed from: c, reason: collision with root package name */
    private final String f35104c = "advertisingId";

    /* renamed from: d, reason: collision with root package name */
    private final String f35105d = C3191e4.i.M;

    /* renamed from: e, reason: collision with root package name */
    private final String f35106e = "appKey";

    /* renamed from: f, reason: collision with root package name */
    private final String f35107f = C3144bb.f36078o;

    /* renamed from: g, reason: collision with root package name */
    private final String f35108g = "osVersion";

    /* renamed from: h, reason: collision with root package name */
    private final String f35109h = "connectionType";

    /* renamed from: i, reason: collision with root package name */
    private final String f35110i = "rawConnectionType";

    /* renamed from: j, reason: collision with root package name */
    private final String f35111j = DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY;

    /* renamed from: k, reason: collision with root package name */
    private final String f35112k = "deviceOEM";

    /* renamed from: l, reason: collision with root package name */
    private final String f35113l = "deviceModel";

    /* renamed from: m, reason: collision with root package name */
    private final String f35114m = C3191e4.i.f36557r;

    /* renamed from: n, reason: collision with root package name */
    private final String f35115n = C3144bb.f36081r;

    /* renamed from: o, reason: collision with root package name */
    private final String f35116o = C3144bb.f36082s;

    /* renamed from: p, reason: collision with root package name */
    private final String f35117p = "battery";

    /* renamed from: q, reason: collision with root package name */
    private final String f35118q = "gmtMinutesOffset";

    /* renamed from: r, reason: collision with root package name */
    private final String f35119r = C3191e4.i.W;

    /* renamed from: s, reason: collision with root package name */
    private final String f35120s = JsonStorageKeyNames.SESSION_ID_KEY;

    /* renamed from: t, reason: collision with root package name */
    private final String f35121t = "pluginType";

    /* renamed from: u, reason: collision with root package name */
    private final String f35122u = "pluginVersion";

    /* renamed from: v, reason: collision with root package name */
    private final String f35123v = "plugin_fw_v";

    /* renamed from: w, reason: collision with root package name */
    private final String f35124w = C3144bb.f36084u;

    /* renamed from: x, reason: collision with root package name */
    private final String f35125x = C3144bb.f36083t;

    /* renamed from: y, reason: collision with root package name */
    private final String f35126y = Q6.Z0;

    /* renamed from: z, reason: collision with root package name */
    private final String f35127z = C3144bb.f36086w;
    private final String A = "mcc";
    private final String B = "mnc";
    private final String C = "icc";
    private final String D = "tz";
    private final String E = "auid";
    private final String F = "userLat";
    private final String G = "publisherAPI";
    private final String H = "missingDependencies";
    private final String I = "missingManifest";
    private final String J = "other";
    private final B7 L = Mb.U().i();

    private O6() {
    }

    private Map<String, Object> a() {
        boolean z10;
        String str;
        HashMap map = new HashMap();
        map.put(JsonStorageKeyNames.SESSION_ID_KEY, IronSourceUtils.d());
        String strE = e();
        if (!TextUtils.isEmpty(strE)) {
            map.put("bundleId", strE);
            String strB = C1.b(this.K, strE);
            if (!TextUtils.isEmpty(strB)) {
                map.put(C3191e4.i.W, strB);
            }
        }
        map.put("appKey", c());
        String strI = this.L.I(this.K);
        String strB2 = this.L.b(this.K);
        boolean z11 = false;
        if (TextUtils.isEmpty(strI)) {
            strI = this.L.M(this.K);
            z10 = true;
            str = !TextUtils.isEmpty(strI) ? IronSourceConstants.TYPE_UUID : "";
        } else {
            str = IronSourceConstants.TYPE_GAID;
            z10 = false;
        }
        if (!TextUtils.isEmpty(strI)) {
            map.put("advertisingId", strI);
            map.put(C3144bb.f36083t, str);
        }
        if (!TextUtils.isEmpty(strB2)) {
            z11 = Boolean.parseBoolean(strB2);
            map.put(C3191e4.i.M, Boolean.valueOf(z11));
        }
        if (z10 || z11) {
            map.put(N, a(strB2));
        }
        map.put(C3144bb.f36078o, h());
        if (!TextUtils.isEmpty(b())) {
            map.put("osVersion", b());
        }
        String strA = IronSourceUtils.a(this.K);
        if (!TextUtils.isEmpty(strA)) {
            map.put("connectionType", strA);
        }
        String strD = C3137b4.d(this.K);
        if (!TextUtils.isEmpty(strD)) {
            map.put("rawConnectionType", strD);
        }
        map.put("sdkVersion", r());
        String strL = l();
        if (!TextUtils.isEmpty(strL)) {
            map.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, strL);
        }
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            map.put("deviceOEM", strG);
        }
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            map.put("deviceModel", strF);
        }
        String strN = n();
        if (!TextUtils.isEmpty(strN)) {
            map.put(C3191e4.i.f36557r, strN);
        }
        map.put(C3144bb.f36082s, Long.valueOf(k()));
        map.put(C3144bb.f36081r, Long.valueOf(i()));
        map.put("battery", Integer.valueOf(d()));
        int iJ = j();
        if (a(iJ)) {
            map.put("gmtMinutesOffset", Integer.valueOf(iJ));
        }
        String strP = p();
        if (!TextUtils.isEmpty(strP)) {
            map.put("pluginType", strP);
        }
        String strQ = q();
        if (!TextUtils.isEmpty(strQ)) {
            map.put("pluginVersion", strQ);
        }
        String strO = o();
        if (!TextUtils.isEmpty(strO)) {
            map.put("plugin_fw_v", strO);
        }
        String strValueOf = String.valueOf(this.L.p());
        if (!TextUtils.isEmpty(strValueOf)) {
            map.put(C3144bb.f36084u, strValueOf);
        }
        String strM = m();
        if (!TextUtils.isEmpty(strM)) {
            map.put(Q6.Z0, strM);
        }
        String strValueOf2 = String.valueOf(IronSourceUtils.c(this.K));
        if (!TextUtils.isEmpty(strValueOf2)) {
            map.put(C3144bb.f36086w, strValueOf2);
        }
        String strD2 = this.L.d(this.K);
        if (!TextUtils.isEmpty(strD2)) {
            map.put("auid", strD2);
        }
        map.put("mcc", Integer.valueOf(C3119a4.b(this.K)));
        map.put("mnc", Integer.valueOf(C3119a4.c(this.K)));
        String strG2 = this.L.G(this.K);
        if (!TextUtils.isEmpty(strG2)) {
            map.put("icc", strG2);
        }
        String strD3 = this.L.d();
        if (!TextUtils.isEmpty(strD3)) {
            map.put("tz", strD3);
        }
        IronLog.INTERNAL.verbose("collecting data for events: " + map);
        return map;
    }

    private String b() {
        try {
            String str = Build.VERSION.RELEASE;
            return "" + Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    private String c() {
        return com.ironsource.mediationsdk.r.m().n();
    }

    private int d() {
        try {
            Intent intentRegisterReceiver = this.K.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, j1.o2.o(new StringBuilder(), this.f35102a, ":getBatteryLevel()"), e10);
        }
        return -1;
    }

    private String e() {
        try {
            return this.K.getPackageName();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    private String f() {
        try {
            return Build.MODEL;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    private String g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    private String h() {
        return "Android";
    }

    private long i() {
        if (!s()) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1048576;
    }

    private int j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, j1.o2.o(new StringBuilder(), this.f35102a, ":getGmtMinutesOffset()"), e10);
            return 0;
        }
    }

    private long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1048576;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return -1L;
        }
    }

    private String l() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    private String m() {
        return com.ironsource.mediationsdk.r.m().p();
    }

    private String n() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.K.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!networkOperatorName.equals("")) {
                    return networkOperatorName;
                }
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, j1.o2.o(new StringBuilder(), this.f35102a, ":getMobileCarrier()"), e10);
        }
        return "";
    }

    private String o() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e10);
            return "";
        }
    }

    private String p() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e10);
            return "";
        }
    }

    private String q() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e10);
            return "";
        }
    }

    private String r() {
        return LevelPlay.getSdkVersion();
    }

    private boolean s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            N6.a().a(a());
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = ".concat(getClass().getSimpleName()), e10);
        }
    }

    public O6(Context context) {
        this.K = context.getApplicationContext();
    }

    private boolean a(int i10) {
        return i10 <= P && i10 >= Q && i10 % 15 == 0;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "missingDependencies";
        }
        if (!C3120a5.f35930a.b()) {
            return "publisherAPI";
        }
        if (this.L.g(this.K)) {
            return Boolean.parseBoolean(str) ? "userLat" : "other";
        }
        return "missingManifest";
    }
}
