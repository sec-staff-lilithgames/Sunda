package com.inmobi.media;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.ironsource.C3119a4;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.reflect.KProperty;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class R3 {

    /* renamed from: d, reason: collision with root package name */
    public static String f32186d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3099z1 f32187e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3099z1 f32188f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f32189g;

    /* renamed from: h, reason: collision with root package name */
    public static final tu.v f32190h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f32191i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f32192j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f32193k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile boolean f32194l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile long f32195m;

    /* renamed from: n, reason: collision with root package name */
    public static final tu.o f32196n;

    /* renamed from: o, reason: collision with root package name */
    public static final tu.o f32197o;

    /* renamed from: p, reason: collision with root package name */
    public static final tu.o f32198p;

    /* renamed from: q, reason: collision with root package name */
    public static final JSONArray f32199q;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f32184b = {kotlin.jvm.internal.c1.property1(new kotlin.jvm.internal.s0(R3.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0)), kotlin.jvm.internal.c1.property1(new kotlin.jvm.internal.s0(R3.class, "curDeviceVolume", "getCurDeviceVolume()I", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final R3 f32183a = new R3();

    /* renamed from: c, reason: collision with root package name */
    public static long f32185c = -1;

    static {
        int i10 = 15;
        f32187e = new C3099z1((Integer) i10, (kv.a) P3.f32120a, false, 12);
        f32188f = new C3099z1((Integer) i10, (kv.a) N3.f32043a, true, 8);
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(RELEASE, "RELEASE");
        f32189g = RELEASE;
        f32190h = new tu.v("d-api-lev", "" + Build.VERSION.SDK_INT);
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        f32191i = MANUFACTURER;
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(MODEL, "MODEL");
        f32192j = MODEL;
        String HARDWARE = Build.HARDWARE;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        f32193k = HARDWARE;
        tu.s sVar = tu.s.f87404c;
        f32196n = tu.q.lazy(sVar, (kv.a) Q3.f32155a);
        f32197o = tu.q.lazy(sVar, (kv.a) O3.f32088a);
        tu.o oVarLazy = tu.q.lazy(sVar, (kv.a) M3.f32020a);
        f32198p = oVarLazy;
        f32199q = (JSONArray) oVarLazy.getValue();
    }

    public static final boolean Q() {
        return true;
    }

    public static final boolean S() {
        return true;
    }

    public static void X() {
        C2925od.a(new al.b(18));
    }

    public static final void Y() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            f32185c = availableBytes / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        } catch (Exception e10) {
            C2796h2 event = new C2796h2(e10);
            Y5 y52 = Y5.f32563a;
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
    }

    public static void Z() {
        C2925od.a(new al.b(20));
    }

    public static final void a0() {
        UUID uuidFromString;
        Context contextD = C2925od.d();
        if (contextD == null) {
            return;
        }
        Object systemService = contextD.getSystemService("storagestats");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = y3.f.a(systemService);
        Object systemService2 = contextD.getSystemService(C3191e4.a.f36373k);
        kotlin.jvm.internal.e0.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid = storageVolume.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                kotlin.jvm.internal.e0.checkNotNull(uuidFromString);
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    kotlin.jvm.internal.e0.checkNotNull(uuidFromString);
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    freeBytes += storageStatsManagerA.getFreeBytes(uuidFromString);
                } catch (Exception e10) {
                    C2796h2 event = new C2796h2(e10);
                    Y5 y52 = Y5.f32563a;
                    kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                    Y5.f32566d.a(event);
                }
            }
        }
        f32185c = freeBytes / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }

    public static void b0() {
        C2925od.a(new al.b(16));
    }

    public static final void c0() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            f32186d = "" + (blockCountLong / 1048576);
        } catch (Exception e10) {
            C2796h2 event = new C2796h2(e10);
            Y5 y52 = Y5.f32563a;
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
    }

    public static final void d() {
        try {
            Context contextD = C2925od.d();
            if (contextD == null) {
                return;
            }
            Object systemService = contextD.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager == null) {
                return;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            f32194l = memoryInfo.lowMemory;
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public static void d0() {
        C2925od.a(new al.b(17));
    }

    public static final void e0() {
        UUID uuidFromString;
        Context contextD = C2925od.d();
        if (contextD == null) {
            return;
        }
        Object systemService = contextD.getSystemService("storagestats");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = y3.f.a(systemService);
        Object systemService2 = contextD.getSystemService(C3191e4.a.f36373k);
        kotlin.jvm.internal.e0.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(storageVolumes, "getStorageVolumes(...)");
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid = storageVolume.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                kotlin.jvm.internal.e0.checkNotNull(uuidFromString);
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    kotlin.jvm.internal.e0.checkNotNull(uuidFromString);
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManagerA.getTotalBytes(uuidFromString);
                } catch (Exception e10) {
                    C2796h2 event = new C2796h2(e10);
                    Y5 y52 = Y5.f32563a;
                    kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                    Y5.f32566d.a(event);
                }
            }
        }
        f32186d = "" + (totalBytes / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    public static String v() {
        String string;
        Context contextD = C2925od.d();
        if (contextD == null || !Ga.a(contextD, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = contextD.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e10) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("R3", "getSimpleName(...)");
            e10.toString();
        }
        if (activeNetworkInfo == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "";
            }
            if (!networkCapabilities.hasTransport(0)) {
                if (!networkCapabilities.hasTransport(1)) {
                    string = networkCapabilities.hasTransport(2) ? com.ironsource.Hc.f34588e : networkCapabilities.hasTransport(3) ? "9" : networkCapabilities.hasTransport(4) ? "17" : networkCapabilities.hasTransport(5) ? "10" : networkCapabilities.hasTransport(6) ? "11" : "8";
                }
                return "1";
            }
            string = "0|" + activeNetworkInfo.getSubtype();
            return string;
        }
        int type = activeNetworkInfo.getType();
        int subtype = activeNetworkInfo.getSubtype();
        if (type != 0) {
            if (type != 1) {
                string = String.valueOf(type);
            }
            return "1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        sb2.append('|');
        sb2.append(subtype);
        string = sb2.toString();
        return string;
    }

    public static final String x() {
        int iW = f32183a.w();
        return iW != 0 ? iW != 1 ? "NIL" : C3119a4.f35922b : "carrier";
    }

    public final String A() {
        return ((L3) f32196n.getValue()).f31986b;
    }

    public final int B() {
        try {
            return Runtime.getRuntime().availableProcessors();
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return 0;
        }
    }

    public final Map<String, String> C() {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        boolean enabled = ((SignalsConfig) AbstractC3035v5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getBts().getEnabled();
        HashMap map = new HashMap();
        if (enabled) {
            try {
                String string = f32199q.toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                map.put("d-t1", string);
            } catch (Exception unused) {
            }
        }
        return map;
    }

    public final tu.v D() {
        if (Build.VERSION.SDK_INT >= 26) {
            d0();
        } else {
            b0();
        }
        String str = f32186d;
        if (str != null) {
            return new tu.v("d-tot-disk", str);
        }
        return null;
    }

    public final tu.v E() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return null;
        }
        Intent intentA = D2.a(contextD, (BroadcastReceiver) null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        return (intentA == null || intentA.getIntExtra("state", 0) != 1) ? new tu.v("d-w-h", "0") : new tu.v("d-w-h", "1");
    }

    public final void F() {
        i();
        D();
        ((Boolean) f32197o.getValue()).getClass();
        t();
    }

    public final boolean G() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public final boolean H() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public final boolean I() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public final boolean J() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public final boolean K() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public final boolean L() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public final boolean M() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public final boolean N() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public final boolean O() {
        return true;
    }

    public final boolean P() {
        return true;
    }

    public final boolean R() {
        return true;
    }

    public final boolean T() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final boolean U() {
        return ((Boolean) f32197o.getValue()).booleanValue();
    }

    public final boolean V() {
        c();
        return f32194l;
    }

    public final boolean W() {
        return ((L3) f32196n.getValue()).f31985a;
    }

    public final int a(Context context, boolean z10) {
        if (context == null || z10) {
            return 0;
        }
        int iIntValue = ((Number) f32188f.getValue(this, f32184b[1])).intValue();
        int iT = t();
        if (iT > 0) {
            return (iIntValue * 100) / iT;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("R3", "getSimpleName(...)");
        return 0;
    }

    public final HashMap b(boolean z10) {
        HashMap map = new HashMap();
        map.put("os-v", f32189g);
        String BRAND = Build.BRAND;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(BRAND, "BRAND");
        map.put("d-brand-name", BRAND);
        map.put("d-manufacturer-name", f32191i);
        map.put("d-model-name", f32192j);
        map.put("d-nettype-raw", v());
        String string = Locale.getDefault().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        map.put("d-localization", string);
        String language = Locale.getDefault().getLanguage();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(language, "getLanguage(...)");
        map.put("d-language", language);
        map.put("d-devicemachinehw", f32193k);
        map.put("d-lowmem", String.valueOf(V()));
        map.put("d-pcount", String.valueOf(B()));
        map.put("d-emu", String.valueOf(U()));
        map.put("d-ps-disabled", String.valueOf(W()));
        String strA = A();
        if (strA == null) {
            strA = "N/A";
        }
        map.put("d-ps-v", strA);
        map.put("d-media-volume", String.valueOf(a(C2925od.d(), z10)));
        return map;
    }

    public final void c(boolean z10) {
        f32194l = z10;
    }

    public final boolean e() {
        try {
            String FINGERPRINT = Build.FINGERPRINT;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            Locale ROOT = Locale.ROOT;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = FINGERPRINT.toLowerCase(ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String MODEL = Build.MODEL;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(MODEL, "MODEL");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase2 = MODEL.toLowerCase(ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            String MANUFACTURER = Build.MANUFACTURER;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase3 = MANUFACTURER.toLowerCase(ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            String BRAND = Build.BRAND;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(BRAND, "BRAND");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase4 = BRAND.toLowerCase(ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
            String DEVICE = Build.DEVICE;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(DEVICE, "DEVICE");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase5 = DEVICE.toLowerCase(ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase5, "this as java.lang.String).toLowerCase(locale)");
            String HARDWARE = Build.HARDWARE;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase6 = HARDWARE.toLowerCase(ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase6, "this as java.lang.String).toLowerCase(locale)");
            String PRODUCT = Build.PRODUCT;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase7 = PRODUCT.toLowerCase(ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase7, "this as java.lang.String).toLowerCase(locale)");
            if (sv.k0.startsWith$default(lowerCase, "generic", false, 2, null) || sv.k0.startsWith$default(lowerCase, "unknown", false, 2, null) || sv.n0.contains$default((CharSequence) lowerCase2, (CharSequence) "google_sdk", false, 2, (Object) null) || sv.n0.contains$default((CharSequence) lowerCase2, (CharSequence) "emu", false, 2, (Object) null) || sv.n0.contains$default((CharSequence) lowerCase2, (CharSequence) "Android SDK built for x86", false, 2, (Object) null) || sv.n0.contains$default((CharSequence) lowerCase3, (CharSequence) "Genymotion", false, 2, (Object) null) || sv.n0.contains$default((CharSequence) lowerCase7, (CharSequence) "sdk", false, 2, (Object) null) || sv.n0.contains$default((CharSequence) lowerCase7, (CharSequence) "vbox86p", false, 2, (Object) null) || sv.n0.contains$default((CharSequence) lowerCase7, (CharSequence) "emu", false, 2, (Object) null) || kotlin.jvm.internal.e0.areEqual(lowerCase6, "goldfish") || kotlin.jvm.internal.e0.areEqual(lowerCase6, "ranchu") || kotlin.jvm.internal.e0.areEqual(lowerCase6, "vbox86p") || sv.n0.contains$default((CharSequence) lowerCase6, (CharSequence) "nox", false, 2, (Object) null)) {
                return true;
            }
            if (sv.k0.startsWith$default(lowerCase4, "generic", false, 2, null)) {
                if (sv.k0.startsWith$default(lowerCase5, "generic", false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final K3 f() {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.freeMemory();
        return new K3(jMaxMemory, jFreeMemory, jMaxMemory - jFreeMemory);
    }

    public final tu.v g() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return null;
        }
        return Settings.Global.getInt(contextD.getContentResolver(), "airplane_mode_on", 0) != 0 ? new tu.v("d-airplane-m", "1") : new tu.v("d-airplane-m", "0");
    }

    public final tu.v h() {
        return f32190h;
    }

    public final tu.v i() {
        if (Build.VERSION.SDK_INT >= 26) {
            Z();
        } else {
            X();
        }
        long j10 = f32185c;
        if (j10 != -1) {
            return new tu.v("d-av-disk", String.valueOf(j10));
        }
        return null;
    }

    public final long j() {
        return f32185c;
    }

    public final tu.v k() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return null;
        }
        Intent intentA = D2.a(contextD, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return new tu.v("d-bat-chrg", (intentA != null ? intentA.getIntExtra("status", -1) : -1) == 2 ? "1" : "0");
    }

    public final tu.v l() {
        Context contextD = C2925od.d();
        Integer numValueOf = null;
        if (contextD == null) {
            return null;
        }
        if (D2.a(contextD, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
            numValueOf = Integer.valueOf((int) ((r0.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / r0.getIntExtra("scale", -1)));
        }
        return new tu.v("d-bat-lev", "" + numValueOf);
    }

    public final tu.v m() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return null;
        }
        Object systemService = contextD.getSystemService("power");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode() ? new tu.v("d-bat-sav", "1") : new tu.v("d-bat-sav", "0");
    }

    public final JSONArray n() {
        return f32199q;
    }

    public final tu.v o() {
        String str;
        int i10 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i10 == 16) {
            str = "0";
        } else {
            if (i10 != 32) {
                return null;
            }
            str = "1";
        }
        return new tu.v("d-drk-m", str);
    }

    public final tu.v p() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return null;
        }
        Object systemService = contextD.getSystemService("notification");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new tu.v("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
        } catch (Exception unused) {
            return null;
        }
    }

    public final String q() {
        return f32193k;
    }

    public final tu.v r() {
        ArrayList arrayList = new ArrayList();
        Context contextD = C2925od.d();
        if (contextD == null) {
            return null;
        }
        Object systemService = contextD.getSystemService("input_method");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(enabledInputMethodList, "getEnabledInputMethodList(...)");
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(enabledInputMethodSubtypeList, "getEnabledInputMethodSubtypeList(...)");
            for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                if (kotlin.jvm.internal.e0.areEqual(inputMethodSubtype.getMode(), "keyboard")) {
                    String languageTag = inputMethodSubtype.getLanguageTag();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(languageTag, "getLanguageTag(...)");
                    String language = languageTag.length() > 0 ? Locale.forLanguageTag(inputMethodSubtype.getLanguageTag()).getLanguage() : new Locale(inputMethodSubtype.getLocale()).getLanguage();
                    kotlin.jvm.internal.e0.checkNotNull(language);
                    if (language.length() > 0) {
                        arrayList.add(language);
                    }
                }
            }
        }
        String string = new JSONArray((Collection) arrayList).toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return new tu.v("d-key-lang", string);
    }

    public final String s() {
        return f32191i;
    }

    public final int t() {
        return ((Number) f32187e.getValue(this, f32184b[0])).intValue();
    }

    public final String u() {
        return f32192j;
    }

    public final int w() {
        String strV = v();
        if (sv.k0.startsWith$default(strV, "0", false, 2, null)) {
            return 0;
        }
        return sv.k0.startsWith$default(strV, "1", false, 2, null) ? 1 : 2;
    }

    public final String z() {
        return f32189g;
    }

    public final void c() {
        if (System.currentTimeMillis() < f32195m) {
            return;
        }
        LinkedHashMap linkedHashMap = Q2.f32149a;
        SignalsConfig signalsConfig = (SignalsConfig) AbstractC3035v5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null);
        f32195m = (signalsConfig.getLowMemoryFreq() * 1000) + System.currentTimeMillis();
        ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).execute(new al.b(19));
    }

    public final String a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    public final Map<String, String> a(boolean z10) {
        HashMap map = new HashMap();
        try {
            map.putAll(b(z10));
            map.putAll(C());
            return map;
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("R3", "getSimpleName(...)");
            return map;
        }
    }

    public final void a(long j10) {
        f32195m = j10;
    }

    public final L3 a() {
        String str;
        try {
            Context contextD = C2925od.d();
            if (contextD == null) {
                return new L3(null, false);
            }
            PackageManager packageManager = contextD.getPackageManager();
            boolean z10 = packageManager.getApplicationEnabledSetting("com.android.vending") >= 2;
            try {
                str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
                if (str == null) {
                    str = "";
                }
            } catch (Exception unused) {
                str = null;
            }
            return new L3(str, z10);
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return new L3(null, false);
        }
    }

    public static /* synthetic */ void y() {
    }

    public final JSONArray b() {
        Context contextD = C2925od.d();
        if (contextD != null) {
            try {
                LinkedHashMap linkedHashMap = Q2.f32149a;
                Config configA = O2.a("signals", C2925od.b(), null);
                kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                SignalsConfig signalsConfig = (SignalsConfig) configA;
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6 i6A = H6.a(contextD, "boot_time");
                kotlin.jvm.internal.e0.checkNotNullParameter("bt", C3191e4.h.W);
                JSONArray jSONArray = new JSONArray(i6A.f31866a.getString("bt", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                Long lValueOf = jSONArray.length() > 0 ? Long.valueOf(jSONArray.optLong(jSONArray.length() - 1, 0L)) : null;
                if (lValueOf != null) {
                    if (Math.abs(lValueOf.longValue() - jCurrentTimeMillis) <= signalsConfig.getBts().getThreshold() * 1000) {
                        return jSONArray;
                    }
                }
                jSONArray.put(jCurrentTimeMillis);
                while (jSONArray.length() > 0 && jSONArray.length() > signalsConfig.getBts().getMaxEntries()) {
                    jSONArray.remove(0);
                }
                i6A.a("bt", jSONArray.toString(), true);
                return jSONArray;
            } catch (Exception e10) {
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
        return new JSONArray();
    }
}
