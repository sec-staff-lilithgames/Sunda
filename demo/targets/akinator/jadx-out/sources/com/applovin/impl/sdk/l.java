package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.ApplicationStartInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DtbConstants;
import com.applovin.impl.b6;
import com.applovin.impl.c2;
import com.applovin.impl.g5;
import com.applovin.impl.h7;
import com.applovin.impl.j7;
import com.applovin.impl.k7;
import com.applovin.impl.k8;
import com.applovin.impl.m5;
import com.applovin.impl.o0;
import com.applovin.impl.o4;
import com.applovin.impl.p0;
import com.applovin.impl.p6;
import com.applovin.impl.q0;
import com.applovin.impl.q2;
import com.applovin.impl.r0;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v;
import com.applovin.impl.v4;
import com.applovin.impl.x4;
import com.applovin.impl.z3;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.Q6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sfbx.appconsent.core.IABConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;
import rw.hIT.uQjDr;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: i, reason: collision with root package name */
    private static String f15504i;

    /* renamed from: j, reason: collision with root package name */
    private static String f15505j;

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicReference f15506k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicReference f15507l = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final k f15508a;

    /* renamed from: b, reason: collision with root package name */
    private final o f15509b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f15510c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f15511d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f15513f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15514g;

    /* renamed from: e, reason: collision with root package name */
    private final Object f15512e = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f15515h = new AtomicReference();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class a implements m5.a {
        public a() {
        }

        @Override // com.applovin.impl.m5.a
        public void a(v.a aVar) {
            l.f15506k.set(aVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f15517a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15518b;

        public b(String str, int i10) {
            this.f15517a = str;
            this.f15518b = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f15519a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f15520b = -1;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f15521c = null;
    }

    public l(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f15508a = kVar;
        this.f15509b = kVar.O();
        this.f15510c = k.o();
        this.f15511d = B();
        this.f15513f = A();
    }

    private Map A() {
        PackageInfo packageInfo;
        HashMap map = new HashMap();
        PackageManager packageManager = this.f15510c.getPackageManager();
        ApplicationInfo applicationInfo = this.f15510c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        try {
            packageInfo = packageManager.getPackageInfo(this.f15510c.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        String strA = a(applicationInfo.packageName, packageManager, this.f15508a);
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        if (strA == null) {
            strA = "";
        }
        map.put("installer_name", strA);
        map.put("tg", j7.a(this.f15508a));
        map.put("debug", Boolean.valueOf(k7.c(this.f15508a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(k.n()));
        map.put("session_id", this.f15508a.n0().getSessionId());
        map.put("j8", Boolean.valueOf(k.G0()));
        map.put("ps_tpg", Boolean.valueOf(o4.d(this.f15510c)));
        map.put("ps_apg", Boolean.valueOf(o4.b(this.f15510c)));
        map.put("ps_capg", Boolean.valueOf(o4.c(this.f15510c)));
        map.put("ps_aipg", Boolean.valueOf(o4.a(this.f15510c)));
        k kVar = this.f15508a;
        x4 x4Var = x4.f16180h;
        Long l9 = (Long) kVar.a(x4Var);
        if (l9 != null) {
            map.put("ia_v2", l9);
        } else {
            this.f15508a.b(x4Var, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f15508a.e0().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.j.b(), map);
        map.put("api_did", this.f15508a.a(v4.f15919f));
        map.put("first_install_v3_ms", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : "");
        CollectionUtils.putLongIfValid("last_launch_ms", this.f15508a.M(), map);
        CollectionUtils.putLongIfValid("app_launch_count", Long.valueOf(this.f15508a.N()), map);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (o0.g()) {
            map.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.f15508a.I0()) {
            map.put("unity_version", k7.a(this.f15508a.o0()));
        }
        List listI = i();
        if (!CollectionUtils.isEmpty(listI)) {
            map.put("application_start_info", listI);
        }
        List listG = g();
        if (!CollectionUtils.isEmpty(listG)) {
            map.put("application_exit_info", listG);
        }
        return map;
    }

    private double C() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONArray D() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.D():org.json.JSONArray");
    }

    public static String H() {
        return f15505j;
    }

    private Map J() {
        return k7.a(a((Map) null, true, false));
    }

    private JSONArray M() {
        if (o0.e()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    private boolean N() {
        try {
            if (!b()) {
                if (!c()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean O() {
        ConnectivityManager connectivityManager;
        if (o0.g() && (connectivityManager = (ConnectivityManager) this.f15510c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th2) {
                this.f15508a.O();
                if (o.a()) {
                    this.f15508a.O().a("DataCollector", "Unable to collect constrained network info.", th2);
                }
            }
        }
        return false;
    }

    private boolean P() {
        boolean z10 = this.f15510c.getResources().getConfiguration().keyboard == 2;
        PackageManager packageManager = this.f15510c.getPackageManager();
        return z10 && (packageManager.hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") || packageManager.hasSystemFeature("android.hardware.type.pc"));
    }

    private Boolean Q() {
        if (o0.h()) {
            return Boolean.valueOf(this.f15510c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.f15515h.set(q());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long d() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.d():long");
    }

    private List g() {
        ActivityManager activityManager;
        if (!o0.b()) {
            return null;
        }
        Integer num = (Integer) this.f15508a.a(v4.f16068x4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f15510c.getSystemService("activity")) == null) {
            return null;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(((Boolean) this.f15508a.a(v4.f16076y4)).booleanValue() ? this.f15510c.getPackageName() : null, 0, num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessExitReasons)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
        Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoB = sn.t.b(it.next());
            HashMap map = new HashMap(13);
            int reason = applicationExitInfoB.getReason();
            map.put("reason", Integer.valueOf(reason));
            String description = applicationExitInfoB.getDescription();
            CollectionUtils.putStringIfValid("description", description, map);
            map.put("timestamp", Long.valueOf(applicationExitInfoB.getTimestamp()));
            map.put("status", Integer.valueOf(applicationExitInfoB.getStatus()));
            map.put("importance", Integer.valueOf(applicationExitInfoB.getImportance()));
            map.put("pss", Long.valueOf(applicationExitInfoB.getPss()));
            map.put("rss", Long.valueOf(applicationExitInfoB.getRss()));
            CollectionUtils.putStringIfValid("process_name", applicationExitInfoB.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationExitInfoB.getPid()));
            map.put("ruid", Integer.valueOf(applicationExitInfoB.getRealUid()));
            map.put("puid", Integer.valueOf(applicationExitInfoB.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationExitInfoB.getDefiningUid()));
            String strA = a(applicationExitInfoB, reason);
            if (StringUtils.isValidString(strA)) {
                map.put("stack_trace", strA);
                b(strA, reason, description);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    private String h() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f15510c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    private List i() {
        ActivityManager activityManager;
        if (!o0.c()) {
            return null;
        }
        Integer num = (Integer) this.f15508a.a(v4.f16060w4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f15510c.getSystemService("activity")) == null) {
            return null;
        }
        List<ApplicationStartInfo> historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessStartReasons)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(historicalProcessStartReasons.size());
        for (ApplicationStartInfo applicationStartInfo : historicalProcessStartReasons) {
            HashMap map = new HashMap(11);
            map.put("reason", Integer.valueOf(applicationStartInfo.getReason()));
            map.put("startup_state", Integer.valueOf(applicationStartInfo.getStartupState()));
            map.put("start_type", Integer.valueOf(applicationStartInfo.getStartType()));
            map.put("was_force_stopped", Boolean.valueOf(applicationStartInfo.wasForceStopped()));
            map.put("startup_timestamps", applicationStartInfo.getStartupTimestamps());
            CollectionUtils.putStringIfValid("process_name", applicationStartInfo.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationStartInfo.getPid()));
            map.put("ruid", Integer.valueOf(applicationStartInfo.getRealUid()));
            map.put("puid", Integer.valueOf(applicationStartInfo.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationStartInfo.getDefiningUid()));
            map.put("launch_mode", Integer.valueOf(applicationStartInfo.getLaunchMode()));
            map.put("intent", a(applicationStartInfo.getIntent()));
            arrayList.add(map);
        }
        return arrayList;
    }

    private c j() {
        c cVar = new c();
        Intent intentRegisterReceiver = this.f15510c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f15520b = -1;
        } else {
            cVar.f15520b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f15519a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        cVar.f15521c = Boolean.valueOf(Settings.Global.getInt(this.f15510c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        return cVar;
    }

    private String k() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f15510c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th2) {
            if (!o.a()) {
                return "";
            }
            this.f15509b.a("DataCollector", "Unable to collect carrier", th2);
            return "";
        }
    }

    private String m() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f15510c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String n() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(DtbConstants.HTTPS));
        ResolveInfo resolveInfoResolveActivity = this.f15510c.getPackageManager().resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
            f15505j = activityInfo.packageName;
        }
        return f15505j;
    }

    private String p() {
        if (!o0.g()) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            LocaleList locales = this.f15510c.getResources().getConfiguration().getLocales();
            for (int i10 = 0; i10 < locales.size(); i10++) {
                sb2.append(locales.get(i10));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Float q() {
        Float f10 = (Float) this.f15508a.a(v4.X3);
        Float fB = this.f15508a.q().b();
        if (fB == null) {
            return null;
        }
        return Float.valueOf(f10.floatValue() * fB.floatValue());
    }

    private float r() {
        try {
            return Settings.System.getFloat(this.f15510c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e10) {
            if (!o.a()) {
                return -1.0f;
            }
            this.f15509b.a("DataCollector", "Error collecting font scale", e10);
            return -1.0f;
        }
    }

    private boolean s() {
        SensorManager sensorManager = (SensorManager) this.f15510c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map t() {
        HashMap map = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f15508a.s0().g(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f15508a.s0().j(), map);
        CollectionUtils.putStringIfValid(IABConstants.GOOGLE_ADDITIONAL_CONSENT, this.f15508a.s0().c(), map);
        return map;
    }

    private Boolean u() {
        AudioManager audioManager = (AudioManager) this.f15510c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean v() {
        AudioManager audioManager = (AudioManager) this.f15510c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String w() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f15510c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th2) {
            if (!o.a()) {
                return "";
            }
            this.f15509b.a("DataCollector", "Unable to collect mobile country code", th2);
            return "";
        }
    }

    private String x() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f15510c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th2) {
            if (!o.a()) {
                return "";
            }
            this.f15509b.a("DataCollector", "Unable to collect mobile network code", th2);
            return "";
        }
    }

    private String z() {
        AudioManager audioManager = (AudioManager) this.f15510c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (o0.f()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb2.append(audioDeviceInfo.getType());
                sb2.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb2.append("3,");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb2.append("7,");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb2.append(8);
            }
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string) && o.a()) {
            this.f15509b.a("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    public Map E() {
        Map map = CollectionUtils.map(this.f15513f);
        String str = StringUtils.isValidString(f15504i) ? f15504i : this.f15510c.getApplicationInfo().packageName;
        map.put("package_name", str);
        map.put("vz", StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.f15508a.D0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f15508a.A0()));
        map.put("test_ads", Boolean.valueOf(this.f15514g));
        map.put("test_mode", Integer.valueOf(this.f15508a.t0().c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.f15508a.o0().isMuted()));
        if (((Boolean) this.f15508a.a(v4.f16067x3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f15508a.x0().e(), map);
        }
        if (((Boolean) this.f15508a.a(v4.A3)).booleanValue()) {
            map.put("compass_random_token", this.f15508a.v());
        }
        if (((Boolean) this.f15508a.a(v4.C3)).booleanValue()) {
            map.put("applovin_random_token", this.f15508a.i0());
        }
        if (((Boolean) this.f15508a.a(v4.G3)).booleanValue()) {
            map.put("art", this.f15508a.s());
        }
        map.putAll(t());
        if (this.f15508a.h0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f15508a.h0().a(), map);
        }
        CollectionUtils.putStringIfValid("template_browser_package_name", (String) this.f15508a.q0().a(x4.S, null), map);
        return map;
    }

    public b F() {
        return (b) f15507l.get();
    }

    public String G() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(J()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f15508a.a(v4.f15900c5)).booleanValue() ? s4.b(strEncodeToString, k7.a(this.f15508a), s4.a.a(((Integer) this.f15508a.a(v4.f15909d5)).intValue()), this.f15508a.j0(), this.f15508a) : strEncodeToString;
    }

    public String I() {
        ActivityManager activityManager = (ActivityManager) this.f15510c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map K() {
        return CollectionUtils.map(this.f15513f);
    }

    public Map L() {
        return CollectionUtils.map(this.f15511d);
    }

    public boolean R() {
        return this.f15514g;
    }

    public void T() {
        b6 b6VarR0 = this.f15508a.r0();
        m5 m5Var = new m5(this.f15508a, new a());
        b6.b bVar = b6.b.OTHER;
        b6VarR0.a((g5) m5Var, bVar);
        this.f15508a.r0().a((g5) new p6(this.f15508a, true, "setDeviceVolume", new a2.s(this, 15)), bVar);
    }

    public void U() {
        synchronized (this.f15512e) {
            a(this.f15511d);
        }
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sc", this.f15508a.a(v4.f15967l));
        map.put("sc2", this.f15508a.a(v4.f15975m));
        map.put("sc3", this.f15508a.a(v4.f15983n));
        map.put("server_installed_at", this.f15508a.a(v4.f15991o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f15508a.a(x4.G), map);
        return map;
    }

    public v.a f() {
        v.a aVarB = com.applovin.impl.v.b(this.f15510c);
        if (aVarB == null) {
            return new v.a();
        }
        if (((Boolean) this.f15508a.a(v4.f16051v3)).booleanValue()) {
            if (aVarB.c() && !((Boolean) this.f15508a.a(v4.f16043u3)).booleanValue()) {
                aVarB.a("");
            }
            f15506k.set(aVarB);
        } else {
            aVarB = new v.a();
        }
        List<String> testDeviceAdvertisingIds = this.f15508a.K() != null ? this.f15508a.K().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds == null) {
            this.f15514g = false;
            return aVarB;
        }
        String strA = aVarB.a();
        if (StringUtils.isValidString(strA)) {
            this.f15514g = testDeviceAdvertisingIds.contains(strA);
        }
        b bVarF = F();
        String str = bVarF != null ? bVarF.f15517a : null;
        if (StringUtils.isValidString(str)) {
            this.f15514g = testDeviceAdvertisingIds.contains(str) | this.f15514g;
        }
        return aVarB;
    }

    public Map l() {
        HashMap map = new HashMap();
        z3 z3VarD0 = this.f15508a.d0();
        Deque dequeB = z3VarD0.b();
        if (!CollectionUtils.isEmpty(dequeB)) {
            map.put("network_throughput_info", dequeB);
        }
        CollectionUtils.putLongIfValid("network_throughput_kbps", z3VarD0.a(), map);
        q0.d dVarA = this.f15508a.x().a();
        if (dVarA != null) {
            map.put("lrm_ts_ms", String.valueOf(dVarA.c()));
            map.put("lrm_url", dVarA.d());
            map.put("lrm_ct_ms", String.valueOf(dVarA.a()));
            map.put("lrm_rs", String.valueOf(dVarA.b()));
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public Map o() {
        return a(false);
    }

    public String y() {
        return AppLovinSdkUtils.isFireOS(this.f15510c) ? "fireos" : "android";
    }

    private Map B() {
        HashMap map = new HashMap(35);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(com.applovin.impl.v.a()));
        map.put("locale", Locale.getDefault().toString());
        map.put("model", Build.MODEL);
        map.put("os", Build.VERSION.RELEASE);
        map.put(Q6.H, y());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(C()));
        map.put("gy", Boolean.valueOf(s()));
        map.put("country_code", m());
        map.put("mcc", w());
        map.put("mnc", x());
        map.put("carrier", k());
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f15510c)));
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY, Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        map.put("hdr", Q());
        map.put(QpyI.hvLYEw, M());
        DisplayMetrics displayMetrics = this.f15510c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            o0.b bVarA = o0.a(this.f15510c, this.f15508a);
            if (bVarA != null) {
                map.put("tl_cr", Integer.valueOf(bVarA.c()));
                map.put("tr_cr", Integer.valueOf(bVarA.d()));
                map.put(uQjDr.cSvmqJRvvob, Integer.valueOf(bVarA.a()));
                map.put("br_cr", Integer.valueOf(bVarA.b()));
            }
        }
        map.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        map.put("tbalsi_ms", Long.valueOf(this.f15508a.L() - k.n()));
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(o4.e(this.f15510c)), map);
        CollectionUtils.putStringIfValid("process_name", k7.c(this.f15510c), map);
        CollectionUtils.putBooleanIfValid("is_main_process", k7.i(this.f15510c), map);
        try {
            PackageInfo packageInfo = this.f15510c.getPackageManager().getPackageInfo("com.android.vending", 0);
            map.put("ps_version", packageInfo.versionName);
            map.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            map.put("ps_version", "");
            map.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", h7.a(this.f15510c), map);
        a(map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String strG = G();
            if (StringUtils.isValidString(strG)) {
                this.f15508a.O();
                if (o.a()) {
                    this.f15508a.O().a("DataCollector", "Successfully retrieved bid token");
                }
                q2.a(appLovinBidTokenCollectionListener, strG);
                return;
            }
            this.f15508a.O();
            if (o.a()) {
                this.f15508a.O().b("DataCollector", "Empty bid token");
            }
            q2.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th2) {
            if (o.a()) {
                this.f15509b.a("DataCollector", "Failed to collect bid token", th2);
            }
            this.f15508a.E().a("DataCollector", "collectBidToken", th2);
            q2.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(c(strArr[i10])).exists()) {
                return true;
            }
        }
        return false;
    }

    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f15508a.r0().a((g5) new p6(this.f15508a, ((Boolean) this.f15508a.a(v4.K3)).booleanValue(), "DataCollector", new t(4, this, appLovinBidTokenCollectionListener)), b6.b.CORE);
    }

    public Map a(Map map, boolean z10, boolean z11) {
        HashMap map2 = new HashMap(64);
        Map mapA = a(z10);
        Map mapE = E();
        Map mapL = l();
        Map mapL0 = this.f15508a.l0();
        if (z11) {
            map2.put("device_info", mapA);
            map2.put("app_info", mapE);
            if (mapL != null) {
                map2.put("connection_info", mapL);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(mapL0)) {
                map2.put("segments", mapL0);
            }
        } else {
            map2.putAll(mapA);
            map2.putAll(mapE);
            if (mapL != null) {
                map2.putAll(mapL);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (!CollectionUtils.isEmpty(mapL0)) {
                map2.putAll(mapL0);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f15508a.V(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f15508a.D(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f15508a.a(v4.I3), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f15508a.u0()), map2);
        if (!((Boolean) this.f15508a.a(v4.f15883a5)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f15508a.j0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f15508a.r(), map2);
        map2.putAll(e());
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
            for (int i11 = 9; i11 >= 0; i11--) {
                cArr[i10] = (char) (cArr[i10] ^ iArr[i11]);
            }
        }
        return new String(cArr);
    }

    private void b(String str, int i10, String str2) {
        this.f15508a.r0().a((g5) new p6(this.f15508a, "reportAppExitInfoStackTrace", new y(i10, 0, this, str, str2)), b6.b.OTHER);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f15510c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    public Map a(boolean z10) {
        Map map;
        synchronized (this.f15512e) {
            map = CollectionUtils.map(this.f15511d);
        }
        return a(map, z10);
    }

    private void a(Map map) {
        JSONArray jSONArrayD;
        if (((Boolean) this.f15508a.a(v4.R3)).booleanValue() && !map.containsKey(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT)) {
            map.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, Long.valueOf(d()));
        }
        if (((Boolean) this.f15508a.a(v4.S3)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(r()));
        }
        if (((Boolean) this.f15508a.a(v4.Z3)).booleanValue() && k7.d(this.f15508a)) {
            k8.a(this.f15508a);
        }
        if (((Boolean) this.f15508a.a(v4.f15964k4)).booleanValue()) {
            k8.b(this.f15508a);
        }
        if (((Boolean) this.f15508a.a(v4.Y3)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f15508a.a(v4.U3)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(O()));
        }
        map.put("is_pc", Boolean.valueOf(P()));
        if (((Boolean) this.f15508a.a(v4.f15980m4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", I(), map);
        }
        if (((Boolean) this.f15508a.a(v4.f16078y6)).booleanValue()) {
            CollectionUtils.putStringIfValid("dbpn", n(), map);
        }
        if (!((Boolean) this.f15508a.a(v4.f16086z6)).booleanValue() || map.containsKey("video_decoders") || (jSONArrayD = D()) == null || jSONArrayD.length() <= 0) {
            return;
        }
        map.put("video_decoders", jSONArrayD);
    }

    private Map a(Map map, boolean z10) {
        v.a aVarF;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point pointB = o0.b(this.f15510c);
        map2.put("dx", Integer.valueOf(pointB.x));
        map2.put("dy", Integer.valueOf(pointB.y));
        if (this.f15510c.getResources().getDisplayMetrics() != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(pointB.y, 2.0d) + Math.pow(pointB.x, 2.0d)) / r5.xdpi));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f15510c)));
        if (((Boolean) this.f15508a.a(v4.B4)).booleanValue()) {
            String strB = k7.b(this.f15510c);
            Map mapA = o0.a(strB);
            if (mapA != null) {
                map2.put("display_cutout_insets", mapA);
            }
            Map mapC = o0.c(strB);
            if (mapC != null) {
                map2.put("status_bar_insets", mapC);
            }
            Map mapB = o0.b(strB);
            if (mapB != null) {
                map2.put("nav_bar_insets", mapB);
            }
        }
        if (z10) {
            aVarF = (v.a) f15506k.get();
            if (aVarF != null) {
                T();
            } else if (k7.h()) {
                aVarF = new v.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVarF = f();
            }
        } else {
            aVarF = f();
        }
        String strA = aVarF.a();
        if (StringUtils.isValidString(strA)) {
            map2.put("idfa", strA);
        }
        map2.put("dnt", Boolean.valueOf(aVarF.c()));
        map2.put("dnt_code", aVarF.b().b());
        b bVar = (b) f15507l.get();
        if (((Boolean) this.f15508a.a(v4.f16059w3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f15517a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f15518b));
        }
        Boolean boolB = p0.b().b(this.f15510c);
        if (boolB != null) {
            map2.put("huc", boolB);
        }
        Boolean boolB2 = p0.c().b(this.f15510c);
        if (boolB2 != null) {
            map2.put("aru", boolB2);
        }
        Boolean boolB3 = p0.a().b(this.f15510c);
        if (boolB3 != null) {
            map2.put("dns", boolB3);
        }
        if (((Boolean) this.f15508a.a(v4.L3)).booleanValue()) {
            c cVarJ = j();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(cVarJ.f15519a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(cVarJ.f15520b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", cVarJ.f15521c, map2);
        }
        if (((Boolean) this.f15508a.a(v4.T3)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f15508a.n0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f15508a.a(v4.W3)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(N()));
        }
        Float fQ = z10 ? (Float) this.f15515h.get() : q();
        if (fQ != null) {
            map2.put("volume", fQ);
        }
        CollectionUtils.putBooleanIfValid("ma", u(), map2);
        CollectionUtils.putBooleanIfValid("spo", v(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f15508a.n0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f15508a.n0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f15508a.n0().getAppEnteredBackgroundTimeMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f15510c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e10) {
            if (o.a()) {
                this.f15509b.a("DataCollector", "Unable to collect screen brightness", e10);
            }
        }
        if (((Boolean) this.f15508a.a(v4.Z3)).booleanValue() && k7.d(this.f15508a)) {
            k8.a(this.f15508a);
            String strA2 = k8.a();
            if (StringUtils.isValidString(strA2)) {
                map2.put(Q6.f35252d0, strA2);
            }
        }
        if (((Boolean) this.f15508a.a(v4.f15964k4)).booleanValue()) {
            k8.b(this.f15508a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(k8.d()), map2);
            CollectionUtils.putStringIfValid("wvv", k8.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", k8.b(), map2);
        }
        if (((Boolean) this.f15508a.a(v4.N3)).booleanValue()) {
            try {
                map2.put(Q6.T0, Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th2) {
                map2.put(Q6.T0, -1);
                map2.put("tds", -1);
                if (o.a()) {
                    this.f15509b.a("DataCollector", "Unable to collect total & free space.", th2);
                }
            }
        }
        if (((Boolean) this.f15508a.a(v4.O3)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoA = k7.a((ActivityManager) this.f15510c.getSystemService("activity"));
            if (memoryInfoA != null) {
                map2.put("fm", Long.valueOf(memoryInfoA.availMem));
                map2.put("tm", Long.valueOf(memoryInfoA.totalMem));
                map2.put("lmt", Long.valueOf(memoryInfoA.threshold));
                map2.put("lm", Boolean.valueOf(memoryInfoA.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f15508a.a(v4.P3)).booleanValue() && o0.a("android.permission.READ_PHONE_STATE", this.f15510c) && o0.g()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f15510c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f15508a.a(v4.M3)).booleanValue()) {
            String strZ = z();
            if (!TextUtils.isEmpty(strZ)) {
                map2.put("so", strZ);
            }
        }
        map2.put("device_orientation", k7.b(this.f15510c));
        map2.put("orientation_lock", h());
        if (((Boolean) this.f15508a.a(v4.Q3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(k7.j()));
        }
        if (o0.e() && (powerManager = (PowerManager) this.f15510c.getSystemService("power")) != null) {
            map2.put(Q6.Y0, Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f15508a.a(v4.f15890b4)).booleanValue() && this.f15508a.m0() != null) {
            map2.put("da", Float.valueOf(this.f15508a.m0().a()));
        }
        if (((Boolean) this.f15508a.a(v4.f15899c4)).booleanValue() && this.f15508a.m0() != null) {
            map2.put(ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER, Float.valueOf(this.f15508a.m0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f15508a.q().c()));
        map2.put("network", r0.g(this.f15508a));
        String strP = p();
        if (StringUtils.isValidString(strP)) {
            map2.put("kb", strP);
        }
        ArrayService arrayServiceP = this.f15508a.p();
        if (arrayServiceP.isAppHubInstalled()) {
            if (arrayServiceP.getIsDirectDownloadEnabled() != null) {
                map2.put("ah_dd_enabled", arrayServiceP.getIsDirectDownloadEnabled());
            }
            map2.put("ah_sdk_version_code", Long.valueOf(arrayServiceP.getAppHubVersionCode()));
            map2.put("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceP.getRandomUserToken()));
            map2.put("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceP.getAppHubPackageName()));
        }
        return map2;
    }

    private Map a(Intent intent) {
        if (intent == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(5);
        map.put("action", StringUtils.emptyIfNull(intent.getAction()));
        map.put("data", StringUtils.emptyIfNull(intent.getDataString()));
        map.put("flags", Integer.valueOf(intent.getFlags()));
        ComponentName component = intent.getComponent();
        map.put("component", component != null ? component.flattenToString() : "");
        Set<String> categories = intent.getCategories();
        map.put("categories", categories != null ? new ArrayList(categories) : Collections.EMPTY_LIST);
        return map;
    }

    private String a(ApplicationExitInfo applicationExitInfo, int i10) {
        InputStream traceInputStream;
        String line;
        if (this.f15508a.c(v4.A4).contains(Integer.toString(i10))) {
            return null;
        }
        Integer num = (Integer) this.f15508a.a(v4.f16084z4);
        if (num.intValue() <= 0) {
            return null;
        }
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
        } catch (Throwable th2) {
            this.f15508a.O();
            if (o.a()) {
                this.f15508a.O().a("DataCollector", "Failed to obtain trace input stream from application exit info", th2);
            }
            this.f15508a.E().b("DataCollector", "getTraceInputStream", th2);
            traceInputStream = null;
        }
        if (traceInputStream == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
            for (int i11 = 0; i11 < num.intValue() && (line = bufferedReader.readLine()) != null; i11++) {
                try {
                    sb2.append(line);
                    sb2.append('\n');
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Throwable th3) {
            this.f15508a.O();
            if (o.a()) {
                this.f15508a.O().a("DataCollector", "Failed to read stack trace from input stream", th3);
            }
            this.f15508a.E().b("DataCollector", "readStackTraceFromInputStream", th3);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i10, String str2) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str);
        CollectionUtils.putIntegerIfValid("error_code", Integer.valueOf(i10), mapHashMap);
        CollectionUtils.putStringIfValid("error_message", str2, mapHashMap);
        this.f15508a.E().d(c2.f13736s0, mapHashMap);
    }

    public static void a(v.a aVar) {
        f15506k.set(aVar);
    }

    public static void a(b bVar) {
        f15507l.set(bVar);
    }

    public static void a(String str, k kVar) {
        String strA = a(k.o().getApplicationInfo().packageName, k.o().getPackageManager(), kVar);
        List listC = kVar.c(v4.K6);
        if (!StringUtils.isValidString(strA) || listC.contains(strA)) {
            f15504i = str;
        }
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    private static String a(String str, PackageManager packageManager, k kVar) {
        try {
            if (((Boolean) kVar.a(v4.f16044u4)).booleanValue() && o0.b()) {
                return packageManager.getInstallSourceInfo(str).getInstallingPackageName();
            }
            return packageManager.getInstallerPackageName(str);
        } catch (Throwable th2) {
            kVar.E().a("DataCollector", "getInstallerName", th2);
            return null;
        }
    }
}
