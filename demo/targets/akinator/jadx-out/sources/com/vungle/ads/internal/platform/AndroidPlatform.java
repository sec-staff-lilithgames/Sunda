package com.vungle.ads.internal.platform;

import af.g;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.Task;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdvertisingInfo;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.Logger;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.a;
import sv.k0;
import sv.n0;
import tu.a0;
import tu.o;
import tu.q;
import tu.s;
import tu.z;
import w3.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidPlatform implements Platform {
    public static final Companion Companion = new Companion(null);
    private static final String PREF_KEY_SDK_INSTALL_TIME = "sit";
    private static final String TAG = "AndroidPlatform";
    private AdvertisingInfo advertisingInfo;
    private String appSetId;
    private Integer appSetIdScope;
    private final AudioManager audioManager;
    private final Context context;
    private final boolean isSideLoaded;
    private final PowerManager powerManager;
    private Long sdkInstallationTime;
    private final VungleThreadPoolExecutor uaExecutor;
    private String userAgent;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final String getCarrierName$vungle_ads_release(Context context) {
            e0.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("phone");
            e0.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return ((TelephonyManager) systemService).getNetworkOperatorName();
        }

        private Companion() {
        }
    }

    public AndroidPlatform(Context context, VungleThreadPoolExecutor uaExecutor) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(uaExecutor, "uaExecutor");
        this.context = context;
        this.uaExecutor = uaExecutor;
        updateAppSetID();
        Object systemService = context.getSystemService("power");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.powerManager = (PowerManager) systemService;
        Object systemService2 = context.getSystemService("audio");
        e0.checkNotNull(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService2;
    }

    private final AdvertisingInfo getAmazonAdvertisingInfo() {
        AdvertisingInfo advertisingInfo = new AdvertisingInfo();
        try {
            ContentResolver contentResolver = this.context.getContentResolver();
            boolean z10 = true;
            if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                z10 = false;
            }
            advertisingInfo.setLimitAdTracking(z10);
            advertisingInfo.setAdvertisingId(Settings.Secure.getString(contentResolver, "advertising_id"));
            return advertisingInfo;
        } catch (Settings.SettingNotFoundException e10) {
            Logger.Companion.w(TAG, "Error getting Amazon advertising info: Setting not found.", e10);
            return advertisingInfo;
        } catch (Exception e11) {
            Logger.Companion.w(TAG, "Error getting Amazon advertising info", e11);
            return advertisingInfo;
        }
    }

    private final AdvertisingInfo getGoogleAdvertisingInfo() {
        AdvertisingInfo advertisingInfo = new AdvertisingInfo();
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            e0.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            advertisingInfo.setAdvertisingId(advertisingIdInfo.getId());
            advertisingInfo.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
            return advertisingInfo;
        } catch (GooglePlayServicesNotAvailableException e10) {
            Logger.Companion.e(TAG, "Play services Not available: " + e10.getLocalizedMessage());
            return advertisingInfo;
        } catch (Exception e11) {
            Logger.Companion.e(TAG, "Error getting Google advertising info: " + e11.getLocalizedMessage());
            return advertisingInfo;
        } catch (NoClassDefFoundError e12) {
            Logger.Companion.e(TAG, "Play services Not available: " + e12.getLocalizedMessage());
            advertisingInfo.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
            return advertisingInfo;
        }
    }

    /* renamed from: getSDKInstallationTime$lambda-4, reason: not valid java name */
    private static final FilePreferences m3624getSDKInstallationTime$lambda4(o oVar) {
        return (FilePreferences) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUserAgentLazy$lambda-0, reason: not valid java name */
    public static final void m3625getUserAgentLazy$lambda0(AndroidPlatform this$0, b consumer) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(consumer, "$consumer");
        WebViewUtil.INSTANCE.getUserAgent(this$0.context, consumer);
    }

    private final void updateAppSetID() {
        String str = this.appSetId;
        if (str == null || str.length() == 0) {
            try {
                AppSetIdClient client = AppSet.getClient(this.context);
                e0.checkNotNullExpressionValue(client, "getClient(context)");
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                e0.checkNotNullExpressionValue(appSetIdInfo, "client.appSetIdInfo");
                appSetIdInfo.addOnSuccessListener(new g(this, 20));
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Error getting AppSetID: " + e10.getLocalizedMessage());
            } catch (NoClassDefFoundError e11) {
                Logger.Companion.e(TAG, "Required libs to get AppSetID Not available: " + e11.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateAppSetID$lambda-6, reason: not valid java name */
    public static final void m3626updateAppSetID$lambda6(AndroidPlatform this$0, AppSetIdInfo appSetIdInfo) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (appSetIdInfo != null) {
            this$0.appSetId = appSetIdInfo.getId();
            this$0.appSetIdScope = Integer.valueOf(appSetIdInfo.getScope());
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public AdvertisingInfo getAdvertisingInfo() {
        String advertisingId;
        AdvertisingInfo advertisingInfo = this.advertisingInfo;
        if (advertisingInfo != null && (advertisingId = advertisingInfo.getAdvertisingId()) != null && advertisingId.length() != 0) {
            return advertisingInfo;
        }
        AdvertisingInfo amazonAdvertisingInfo = k0.equals(Build.MANUFACTURER, "Amazon", true) ? getAmazonAdvertisingInfo() : getGoogleAdvertisingInfo();
        this.advertisingInfo = amazonAdvertisingInfo;
        return amazonAdvertisingInfo;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getAppSetId() {
        return this.appSetId;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public Integer getAppSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getBuildTime() {
        return Build.TIME;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getCarrierName() {
        String carrierName$vungle_ads_release = Companion.getCarrierName$vungle_ads_release(this.context);
        e0.checkNotNullExpressionValue(carrierName$vungle_ads_release, "getCarrierName(context)");
        return carrierName$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getLastBootTime() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getOSInstallationTime() {
        Object objM7131constructorimpl;
        try {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(Long.valueOf((Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getPackageInfo("android", PackageManager.PackageInfoFlags.of(0L)) : this.context.getPackageManager().getPackageInfo("android", 0)).firstInstallTime));
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
        if (thM7134exceptionOrNullimpl != null) {
            if (thM7134exceptionOrNullimpl instanceof PackageManager.NameNotFoundException) {
                Logger.Companion.e(TAG, "Error getting OS installation time: " + ((PackageManager.NameNotFoundException) thM7134exceptionOrNullimpl).getLocalizedMessage());
            }
            objM7131constructorimpl = -1L;
        }
        return ((Number) objM7131constructorimpl).longValue();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getSDKInstallationTime() {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        o oVarLazy = q.lazy(s.f87403b, (a) new AndroidPlatform$getSDKInstallationTime$$inlined$inject$1(this.context));
        Long l9 = this.sdkInstallationTime;
        if (l9 != null) {
            return l9.longValue();
        }
        long jCurrentTimeMillis = m3624getSDKInstallationTime$lambda4(oVarLazy).getLong(PREF_KEY_SDK_INSTALL_TIME, 0L);
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            m3624getSDKInstallationTime$lambda4(oVarLazy).put(PREF_KEY_SDK_INSTALL_TIME, jCurrentTimeMillis).apply();
        }
        this.sdkInstallationTime = Long.valueOf(jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getUserAgent() {
        String str = this.userAgent;
        return str == null ? System.getProperty("http.agent") : str;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public void getUserAgentLazy(b consumer) {
        e0.checkNotNullParameter(consumer, "consumer");
        this.uaExecutor.execute(new com.ironsource.environment.thread.a(13, this, consumer));
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public float getVolumeLevel() {
        try {
            return this.audioManager.getStreamVolume(3) / this.audioManager.getStreamMaxVolume(3);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isProblematicMaliDevice() {
        String str = Build.HARDWARE;
        boolean z10 = str != null && n0.contains((CharSequence) str, (CharSequence) "mali", true);
        int i10 = Build.VERSION.SDK_INT;
        return z10 && (29 <= i10 && i10 < 34);
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSdCardPresent() {
        try {
            return e0.areEqual(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Acquiring external storage state failed", e10);
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSideLoaded() {
        return this.isSideLoaded;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSilentModeEnabled() {
        try {
            if (this.audioManager.getRingerMode() != 0) {
                if (this.audioManager.getRingerMode() != 1) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSoundEnabled() {
        try {
            return this.audioManager.getStreamVolume(3) > 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }
}
