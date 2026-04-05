package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.amazon.device.ads.DtbDeviceData;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.bytedance.sdk.openadsdk.core.settings.Cif;
import com.bytedance.sdk.openadsdk.utils.qk;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DeviceUtils {

    /* renamed from: au, reason: collision with root package name */
    private static int f21496au = 0;
    private static int hna = 0;
    public static String jpo = "";
    private static int oya;
    private static int prr;
    private static int xyk;
    private static int zz;

    /* renamed from: jd, reason: collision with root package name */
    private static volatile long f21498jd = System.currentTimeMillis();
    private static volatile boolean wqx = false;

    /* renamed from: cm, reason: collision with root package name */
    private static volatile boolean f21497cm = false;
    private static volatile boolean my = false;

    /* renamed from: jj, reason: collision with root package name */
    private static volatile boolean f21499jj = true;

    /* renamed from: qk, reason: collision with root package name */
    private static long f21501qk = 0;

    /* renamed from: yd, reason: collision with root package name */
    private static String f21503yd = "";

    /* renamed from: ju, reason: collision with root package name */
    private static int f21500ju = 0;

    /* renamed from: if, reason: not valid java name */
    private static final AtomicBoolean f163if = new AtomicBoolean(false);

    /* renamed from: sq, reason: collision with root package name */
    private static AtomicBoolean f21502sq = new AtomicBoolean(false);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.p001if.xyk> jpo = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void jd(Context context) {
            if (DeviceUtils.f21497cm || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.zz.jpo());
                boolean unused = DeviceUtils.f21497cm = true;
            } catch (Throwable unused2) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.prr = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused2 = DeviceUtils.f21496au = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    if (!jpo.isEmpty()) {
                        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator<com.bytedance.sdk.openadsdk.p001if.xyk> it = AudioInfoReceiver.jpo.iterator();
                                while (it.hasNext()) {
                                    it.next().jd(DeviceUtils.f21496au);
                                }
                            }
                        });
                    }
                    if (DeviceUtils.zz != 0) {
                        int unused3 = DeviceUtils.oya = (int) ((DeviceUtils.f21496au / DeviceUtils.zz) * 100.0d);
                    }
                }
            } catch (Exception unused4) {
            }
        }

        public static void jpo(com.bytedance.sdk.openadsdk.p001if.xyk xykVar) {
            if (xykVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.p001if.xyk> copyOnWriteArrayList = jpo;
                if (copyOnWriteArrayList.contains(xykVar)) {
                    return;
                }
                copyOnWriteArrayList.add(xykVar);
            }
        }

        public static void jd(com.bytedance.sdk.openadsdk.p001if.xyk xykVar) {
            if (xykVar == null) {
                return;
            }
            jpo.remove(xykVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jd extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.f21499jj = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.f21499jj = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.f21498jd = System.currentTimeMillis();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jpo extends BroadcastReceiver {
        private jpo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void jd(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i10 >= 33) {
                    context.registerReceiver(new jpo(), intentFilter, 2);
                } else {
                    context.registerReceiver(new jpo(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.rq(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.hna = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class wqx extends com.bytedance.sdk.component.xyk.xyk {
        public wqx() {
            super("gaid_task");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [com.bytedance.sdk.openadsdk.core.wqx] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [int] */
        /* JADX WARN: Type inference failed for: r4v3 */
        @Override // java.lang.Runnable
        public void run() {
            ?? r42;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.sq.jpo());
                if (advertisingIdInfo != null) {
                    boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                    if (zIsLimitAdTrackingEnabled) {
                        com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(1);
                    }
                    DeviceUtils.jd(advertisingIdInfo, zIsLimitAdTrackingEnabled);
                    r42 = zIsLimitAdTrackingEnabled;
                } else {
                    r42 = -1;
                }
                if (r42 != -1) {
                    com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("limit_ad_track", r42);
                }
            } catch (IOException e10) {
                com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(2);
                com.bytedance.sdk.component.utils.nmd.jpo("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e10);
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(2);
                com.bytedance.sdk.component.utils.nmd.wqx("TTAD.DeviceUtils", th2.getMessage());
            }
        }
    }

    private static void hmu(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                DeviceUtils.rq(applicationContext);
            }
        });
    }

    private static int hna(Context context) {
        int i10;
        try {
            i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i10 == 32) {
            return 1;
        }
        return i10 == 16 ? 0 : -1;
    }

    /* renamed from: if, reason: not valid java name */
    public static void m493if() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.sq.jpo().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                xyk = 1;
            } else if (ringerMode == 1) {
                xyk = 2;
            } else {
                xyk = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static int jj(Context context) {
        if (!f163if.get()) {
            prr(context);
        }
        return f21500ju;
    }

    private static int jr(Context context) {
        return hna;
    }

    public static void ju() throws IOException, ClassNotFoundException {
        com.bytedance.sdk.openadsdk.core.settings.au.jpo(new Cif.jpo() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.Cif.jpo
            public void jd() {
                com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(true);
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.Cif.jpo
            public void jpo() {
                com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(true);
            }
        });
        Context contextJpo = com.bytedance.sdk.openadsdk.core.sq.jpo();
        if (contextJpo != null) {
            com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("cpu_count", yd.jpo());
            com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("cpu_max_frequency", yd.jpo(yd.jpo()));
            com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("cpu_min_frequency", yd.jd(yd.jpo()));
            String strJu = tic.ju();
            if (strJu != null) {
                com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("total_memory", strJu);
            }
            com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("total_internal_storage", tic.m497if());
            com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("free_internal_storage", com.bytedance.sdk.component.utils.sq.jpo());
            com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("total_sdcard_storage", tic.prr());
            com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("is_root", tic.sq() ? 1 : 0);
            if (TextUtils.isEmpty(yd())) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    jpo = "unity";
                } catch (ClassNotFoundException unused) {
                    jpo = "native";
                }
                com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("framework_name", jpo);
            }
            m493if();
            nmd(contextJpo);
            hna = tu(contextJpo);
            xyk.jpo(contextJpo);
        }
    }

    public static String my(Context context) {
        if (!f163if.get()) {
            prr(context);
        }
        return f21503yd;
    }

    private static void nmd(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            zz = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            f21496au = streamVolume;
            oya = (int) ((streamVolume / zz) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    private static float opi(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static JSONObject qk(Context context) {
        return jpo(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rq(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        duq.jd(new com.bytedance.sdk.component.xyk.xyk("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.hna = DeviceUtils.tu(applicationContext);
            }
        });
    }

    private static int sq(Context context) {
        return prr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int tu(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return dt(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int xyk(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.DeviceUtils", th2.getMessage());
            return -1;
        }
    }

    public static int yd(Context context) {
        return xyk;
    }

    public static int zz(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int cm(Context context) {
        if (wqx(context)) {
            return 3;
        }
        return jd(context) ? 2 : 1;
    }

    private static int dt(Context context) {
        try {
            String str = Build.MANUFACTURER;
            return str.equalsIgnoreCase(NyKZx.rgFm) ? Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0 : (str.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static void prr(Context context) {
        if (context == null || !f163if.compareAndSet(false, true)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.rq.jpo.jpo("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                f21503yd = packageInfo.versionName;
                f21500ju = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    public static int qk() {
        return f21496au;
    }

    public static boolean wqx(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 4;
    }

    public static String yd() {
        if (TextUtils.isEmpty(jpo)) {
            jpo = com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("framework_name", "");
        }
        return jpo;
    }

    public static int zz() {
        return zz;
    }

    public static boolean jd() {
        if (SystemClock.elapsedRealtime() - f21501qk >= 20000) {
            f21501qk = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.sq.jpo().getSystemService("power");
                if (powerManager != null) {
                    f21499jj = powerManager.isInteractive();
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx("TTAD.DeviceUtils", th2.getMessage());
            }
        }
        return f21499jj;
    }

    public static int wqx() {
        return com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("limit_ad_track", -1);
    }

    public static int xyk() {
        return oya;
    }

    public static String cm() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static int jj() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.sq.jpo().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static float my() {
        int i10 = -1;
        try {
            Context contextJpo = com.bytedance.sdk.openadsdk.core.sq.jpo();
            if (contextJpo != null) {
                i10 = Settings.System.getInt(contextJpo.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.DeviceUtils", th2.getMessage());
        }
        if (i10 < 0) {
            return -1.0f;
        }
        return Math.round((i10 / 255.0f) * 10.0f) / 10.0f;
    }

    public static void jpo(Context context) {
        if (wqx) {
            return;
        }
        try {
            jd jdVar = new jd();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(jdVar, intentFilter);
            wqx = true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: if, reason: not valid java name */
    public static void m494if(Context context) {
        Context applicationContext;
        if (my || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                jpo.jd(applicationContext);
            } else {
                hmu(applicationContext);
            }
            my = true;
        } catch (Throwable unused) {
        }
    }

    public static boolean jd(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static void jd(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(AdvertisingIdClient.Info info, boolean z10) {
        if (z10 || !com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().wqx()) {
            return;
        }
        String id2 = info.getId();
        String strJd = com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jd();
        if (!TextUtils.isEmpty(id2)) {
            com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(id2);
            com.bytedance.sdk.openadsdk.core.yd.wqx.jpo(id2);
        }
        if (strJd.equals(id2)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.Cif.jpo();
    }

    public static long jpo() {
        return f21498jd;
    }

    private static void jpo(JSONObject jSONObject) throws JSONException {
        jd(jSONObject);
    }

    public static JSONObject jpo(Context context, boolean z10) throws JSONException {
        String strYd;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", xyk(context));
            jpo(jSONObject);
            jSONObject.put("type", cm(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", tic.xyk(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.cm.wqx());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.cm.jd());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.cm.cm());
            jSONObject.put("screen_scale", va.jj(context));
            jSONObject.put("density", va.xyk(context));
            jSONObject.put("screen_width", va.wqx(context));
            jSONObject.put("screen_height", va.my(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.yd.wqx.jj());
            com.bytedance.sdk.openadsdk.core.settings.jj jjVarCm = com.bytedance.sdk.openadsdk.core.sq.cm();
            if (jjVarCm.se("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.Cif.wqx(context));
            jSONObject.put("rom_version", hx.jpo());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.Cif.jd(context));
            jSONObject.put("timezone", tic.se());
            jSONObject.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, com.bytedance.sdk.openadsdk.core.Cif.jd());
            jSONObject.put("carrier_name", rv.jpo());
            if (z10) {
                strYd = tic.jpo(context);
            } else {
                strYd = tic.yd();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strYd) * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
            jSONObject.put("locale_language", cm());
            jSONObject.put("screen_bright", Math.ceil(my() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", 1 ^ (jd() ? 1 : 0));
            jSONObject.put("cpu_num", yd.jd());
            jSONObject.put("cpu_max_freq", yd.wqx());
            jSONObject.put("cpu_min_freq", yd.cm());
            qk.jpo jpoVarJpo = qk.jpo();
            jSONObject.put("battery_remaining_pct", (int) jpoVarJpo.f21588jd);
            jSONObject.put("is_charging", jpoVarJpo.jpo);
            jSONObject.put("total_space", String.valueOf(tic.jd(context)));
            jSONObject.put("free_space_in", String.valueOf(tic.au()));
            jSONObject.put("sdcard_size", String.valueOf(tic.oya()));
            jSONObject.put("rooted", tic.hna());
            jSONObject.put("enable_assisted_clicking", jj());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.dt.jpo(context, "tt_choose_language"));
            jSONObject.put("airplane", zz(context));
            jSONObject.put("darkmode", hna(context));
            jSONObject.put("headset", sq(context));
            jSONObject.put("ringmute", yd(context));
            jSONObject.put("screenscale", opi(context));
            jSONObject.put("volume", xyk());
            jSONObject.put("low_power_mode", jr(context));
            jSONObject.put("enable_draw_feed", tic.uu());
            if (z10) {
                xyk.jpo(jSONObject, context);
                jSONObject.put("gp_v_name", my(context));
                jSONObject.put("gp_v_code", jj(context));
            }
            if (jjVarCm.se("mnc")) {
                jSONObject.put("mnc", rv.wqx());
            }
            if (jjVarCm.se("mcc")) {
                jSONObject.put("mcc", rv.jd());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.jpo.jpo.jd(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.jpo.jpo.jpo());
            String strWqx = com.bytedance.sdk.openadsdk.core.yd.wqx.wqx();
            com.bytedance.sdk.openadsdk.core.yd.wqx.cm();
            if (!TextUtils.isEmpty(strWqx)) {
                jSONObject.put("sof_chara", strWqx);
            }
            String strJd = com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!strJd.isEmpty()) {
                jSONObject.put("ipv6", strJd);
            }
            jSONObject.put("is_multi", com.bytedance.sdk.openadsdk.multipro.jd.wqx());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void ju(Context context) {
        AudioInfoReceiver.jd(context);
    }
}
