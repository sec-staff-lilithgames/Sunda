package io.odeeo.internal.m1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import io.odeeo.internal.n1.f;
import io.odeeo.internal.v1.k;
import io.odeeo.sdk.OdeeoSDK;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.k0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends io.odeeo.internal.n1.e {

    /* renamed from: x, reason: collision with root package name */
    public static final a f64693x = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public String f64694f;

    /* renamed from: g, reason: collision with root package name */
    public String f64695g;

    /* renamed from: h, reason: collision with root package name */
    public String f64696h;

    /* renamed from: i, reason: collision with root package name */
    public String f64697i;

    /* renamed from: j, reason: collision with root package name */
    public String f64698j;

    /* renamed from: k, reason: collision with root package name */
    public String f64699k;

    /* renamed from: l, reason: collision with root package name */
    public String f64700l;

    /* renamed from: m, reason: collision with root package name */
    public final int f64701m;

    /* renamed from: n, reason: collision with root package name */
    public final AudioManager f64702n;

    /* renamed from: o, reason: collision with root package name */
    public final String f64703o;

    /* renamed from: p, reason: collision with root package name */
    public final String f64704p;

    /* renamed from: q, reason: collision with root package name */
    public final String f64705q;

    /* renamed from: r, reason: collision with root package name */
    public final String f64706r;

    /* renamed from: s, reason: collision with root package name */
    public final String f64707s;

    /* renamed from: t, reason: collision with root package name */
    public final String f64708t;

    /* renamed from: u, reason: collision with root package name */
    public String f64709u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f64710v;

    /* renamed from: w, reason: collision with root package name */
    public final ConnectivityManager f64711w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public final String a(Context context) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception unused) {
                io.odeeo.internal.b2.a.d("Failed to retrieve PackageInfo#versionName.", new Object[0]);
                return null;
            }
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.m1.b$b, reason: collision with other inner class name */
    public enum EnumC0621b {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        MOBILE(3),
        GG(4),
        GGG(5),
        GGGG(6),
        GGGGG(7);


        /* renamed from: a, reason: collision with root package name */
        public final int f64721a;

        EnumC0621b(int i10) {
            this.f64721a = i10;
        }

        public final int getId() {
            return this.f64721a;
        }

        @Override // java.lang.Enum
        public String toString() {
            String string = Integer.toString(this.f64721a);
            e0.checkNotNullExpressionValue(string, "toString(id)");
            return string;
        }
    }

    public b(Context context) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        e0.checkNotNullParameter(context, "context");
        this.f64701m = 3;
        Object systemService = context.getSystemService("audio");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
        }
        this.f64702n = (AudioManager) systemService;
        Context applicationContext = context.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f64710v = applicationContext;
        Object systemService2 = applicationContext.getSystemService("connectivity");
        if (systemService2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        this.f64711w = (ConnectivityManager) systemService2;
        String MANUFACTURER = Build.MANUFACTURER;
        e0.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        this.f64703o = MANUFACTURER;
        String MODEL = Build.MODEL;
        e0.checkNotNullExpressionValue(MODEL, "MODEL");
        this.f64704p = MODEL;
        String PRODUCT = Build.PRODUCT;
        e0.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        this.f64705q = PRODUCT;
        String RELEASE = Build.VERSION.RELEASE;
        e0.checkNotNullExpressionValue(RELEASE, "RELEASE");
        this.f64706r = RELEASE;
        this.f64707s = f64693x.a(applicationContext);
        PackageManager packageManager = applicationContext.getPackageManager();
        String packageName = applicationContext.getPackageName();
        e0.checkNotNullExpressionValue(packageName, "mContext.packageName");
        this.f64708t = packageName;
        try {
            applicationInfo = packageManager.getApplicationInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            this.f64709u = packageManager.getApplicationLabel(applicationInfo).toString();
        }
        Object systemService3 = this.f64710v.getSystemService("phone");
        TelephonyManager telephonyManager = systemService3 instanceof TelephonyManager ? (TelephonyManager) systemService3 : null;
        if (telephonyManager != null) {
            this.f64694f = telephonyManager.getNetworkOperator();
            this.f64695g = telephonyManager.getNetworkOperator();
            if (telephonyManager.getPhoneType() == 2 && telephonyManager.getSimState() == 5) {
                this.f64694f = telephonyManager.getSimOperator();
                this.f64696h = telephonyManager.getSimOperator();
            }
            if (OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getPersonalInfo().canCollectPersonalInformation$odeeoSdk_release()) {
                this.f64697i = telephonyManager.getNetworkCountryIso();
                this.f64698j = telephonyManager.getSimCountryIso();
            } else {
                this.f64697i = "";
                this.f64698j = "";
            }
            try {
                this.f64699k = telephonyManager.getNetworkOperatorName();
                if (telephonyManager.getSimState() == 5) {
                    this.f64700l = telephonyManager.getSimOperatorName();
                }
            } catch (SecurityException unused2) {
                this.f64699k = null;
                this.f64700l = null;
            }
        }
        e0.checkNotNullExpressionValue(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "this.javaClass.simpleName");
        setState(new f(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, null, null, 6, null));
    }

    public final EnumC0621b getActiveNetworkType() {
        if (!k.f67283a.isPermissionGranted(this.f64710v, "android.permission.ACCESS_NETWORK_STATE")) {
            return EnumC0621b.UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = this.f64711w.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return EnumC0621b.UNKNOWN;
        }
        Network[] allNetworks = this.f64711w.getAllNetworks();
        e0.checkNotNullExpressionValue(allNetworks, "mConnectivityManager.allNetworks");
        int length = allNetworks.length;
        int i10 = 0;
        while (i10 < length) {
            Network network = allNetworks[i10];
            i10++;
            NetworkCapabilities networkCapabilities = this.f64711w.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                return EnumC0621b.ETHERNET;
            }
        }
        NetworkInfo networkInfo = this.f64711w.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isConnected()) {
            return EnumC0621b.WIFI;
        }
        NetworkInfo networkInfo2 = this.f64711w.getNetworkInfo(0);
        if (networkInfo2 == null || !networkInfo2.isConnected()) {
            return EnumC0621b.UNKNOWN;
        }
        int subtype = networkInfo2.getSubtype();
        if (subtype == 20) {
            return EnumC0621b.GGGGG;
        }
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return EnumC0621b.GG;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
                return EnumC0621b.GGG;
            case 13:
            case 15:
                return EnumC0621b.GGGG;
            default:
                return EnumC0621b.MOBILE;
        }
    }

    public final String getAppName() {
        return this.f64709u;
    }

    public final String getAppPackageName() {
        return this.f64708t;
    }

    public final String getAppVersion() {
        return this.f64707s;
    }

    public final String getCurrentLanguage() {
        String languageTag = getDeviceLocale().toLanguageTag();
        e0.checkNotNullExpressionValue(languageTag, "{\n                device…nguageTag()\n            }");
        return languageTag;
    }

    public final int getCurrentVolume() {
        return this.f64702n.getStreamVolume(this.f64701m);
    }

    public final float getDensity() {
        return this.f64710v.getResources().getDisplayMetrics().density;
    }

    public final int getDeviceBatteryLevel() {
        Object systemService = this.f64710v.getSystemService("batterymanager");
        if (systemService != null) {
            return ((BatteryManager) systemService).getIntProperty(4);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.BatteryManager");
    }

    public final String getDeviceBatteryState() {
        Intent intentRegisterReceiver = this.f64710v.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        e0.checkNotNull(intentRegisterReceiver);
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 4 ? "notcharging" : intExtra == 5 ? "charged" : intExtra == 2 ? "charging" : "unknown";
    }

    public final List<String> getDeviceInputInfo() {
        AudioDeviceInfo[] devices = this.f64702n.getDevices(1);
        String[] strArr = new String[devices.length];
        int length = devices.length;
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = String.valueOf(devices[i10].getType());
        }
        return y0.sorted(y0.distinct(k0.filterNotNull(strArr)));
    }

    public final String[] getDeviceInputLanguages() {
        return (String[]) k0.sortedArray(io.odeeo.internal.v1.e.getDeviceInputLanguages(this.f64710v));
    }

    public final Locale getDeviceLocale() {
        Locale locale = this.f64710v.getResources().getConfiguration().getLocales().get(0);
        e0.checkNotNullExpressionValue(locale, "{\n            mContext.r…tion.locales[0]\n        }");
        return locale;
    }

    public final String getDeviceManufacturer() {
        return this.f64703o;
    }

    public final String getDeviceModel() {
        return this.f64704p;
    }

    public final String getDeviceOsVersion() {
        return this.f64706r;
    }

    public final List<String> getDeviceOutputInfo() {
        AudioDeviceInfo[] devices = this.f64702n.getDevices(2);
        String[] strArr = new String[devices.length];
        int length = devices.length;
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = String.valueOf(devices[i10].getType());
        }
        return y0.sorted(y0.distinct(k0.filterNotNull(strArr)));
    }

    public final String getDeviceProduct() {
        return this.f64705q;
    }

    public final float getDeviceVolumeLevel() {
        return io.odeeo.internal.v1.b.getDeviceVolumePercent(this.f64702n, this.f64701m);
    }

    public final String getDeviceVolumeLevelStr() {
        return io.odeeo.internal.v1.b.getDeviceVolumeStr(this.f64702n, this.f64701m);
    }

    public final String getIsoCountryCode() {
        return OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getPersonalInfo().canCollectPersonalInformation$odeeoSdk_release() ? this.f64697i : "";
    }

    public final int getMaxVolume() {
        return this.f64702n.getStreamMaxVolume(this.f64701m);
    }

    public final String getNetworkOperator() {
        return this.f64695g;
    }

    public final String getNetworkOperatorForUrl() {
        return this.f64694f;
    }

    public final String getNetworkOperatorName() {
        return this.f64699k;
    }

    public final String getOrientationString() {
        int i10 = this.f64710v.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? ApsMetricsDataMap.APSMETRICS_FIELD_URL : "l" : "p";
    }

    public final String getSimIsoCountryCode() {
        return OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getPersonalInfo().canCollectPersonalInformation$odeeoSdk_release() ? this.f64698j : "";
    }

    public final String getSimOperator() {
        return this.f64696h;
    }

    public final String getSimOperatorName() {
        return this.f64700l;
    }

    public final void repopulateCountryData() {
        io.odeeo.internal.b2.a.d("repopulateCountryData", new Object[0]);
        Object systemService = this.f64710v.getSystemService("phone");
        if ((systemService instanceof TelephonyManager) && OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getPersonalInfo().canCollectPersonalInformation$odeeoSdk_release()) {
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            this.f64697i = telephonyManager.getNetworkCountryIso();
            this.f64698j = telephonyManager.getSimCountryIso();
        }
    }

    public final void setAppName(String str) {
        this.f64709u = str;
    }

    public final void setNetworkOperator(String str) {
        this.f64695g = str;
    }

    public final void setNetworkOperatorForUrl(String str) {
        this.f64694f = str;
    }

    public final void setNetworkOperatorName(String str) {
        this.f64699k = str;
    }

    public final void setSimOperator(String str) {
        this.f64696h = str;
    }

    public final void setSimOperatorName(String str) {
        this.f64700l = str;
    }
}
