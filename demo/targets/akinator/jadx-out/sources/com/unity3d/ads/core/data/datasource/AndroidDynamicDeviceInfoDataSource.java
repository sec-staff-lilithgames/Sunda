package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3119a4;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv.d;
import tu.f;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidDynamicDeviceInfoDataSource implements DynamicDeviceInfoDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String DIRECTORY_MEM_INFO = "/proc/meminfo";
    public static final String DIRECTORY_MODE_READ = "r";
    public static final String DIRECTORY_PROCESS_INFO = "/proc/self/stat";
    public static final String INTENT_USB_STATE = "android.hardware.usb.action.USB_STATE";
    public static final String KEY_STAT_CONTENT = "stat";
    public static final String USB_EXTRA_CONNECTED = "connected";
    private final Context context;
    private final LifecycleDataSource lifecycleDataSource;
    private final MutableStateFlow<Map<String, Boolean>> reportedWarning;
    private final Flow<VolumeSettingsChange> volumeSettingsChange;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DynamicDeviceInfoOuterClass.ConnectionType.values().length];
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidDynamicDeviceInfoDataSource(Context context, LifecycleDataSource lifecycleDataSource) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        this.context = context;
        this.lifecycleDataSource = lifecycleDataSource;
        this.reportedWarning = StateFlowKt.MutableStateFlow(p1.emptyMap());
        this.volumeSettingsChange = FlowKt.callbackFlow(new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this, null));
    }

    private final boolean adbStatus() {
        Boolean boolValueOf;
        try {
            boolean z10 = true;
            if (1 != Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0)) {
                z10 = false;
            }
            boolValueOf = Boolean.valueOf(z10);
        } catch (Exception e10) {
            DeviceLog.exception("Problems fetching adb enabled status", e10);
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android fetchAndroidDynamicDeviceInfo() {
        DynamicDeviceInfoKt dynamicDeviceInfoKt = DynamicDeviceInfoKt.INSTANCE;
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DynamicDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setNetworkConnected(isActiveNetworkConnected());
        dsl_create.setNetworkType(getNetworkType());
        dsl_create.setNetworkMetered(getNetworkMetered());
        dsl_create.setTelephonyManagerNetworkType(getNetworkType());
        dsl_create.setAdbEnabled(isAdbEnabled());
        dsl_create.setUsbConnected(isUSBConnected());
        dsl_create.setVolume(getStreamVolume(3));
        dsl_create.setMaxVolume(getStreamMaxVolume(3));
        dsl_create.setDeviceElapsedRealtime(getElapsedRealtime());
        dsl_create.setDeviceUpTime(getUptime());
        dsl_create.setAirplaneMode(getAirplaneMode());
        dsl_create.setChargingType(getChargingType());
        dsl_create.setStayOnWhilePluggedIn(getStayOnWhilePluggedIn());
        dsl_create.setSdCardPresent(getIsSdCardPresent());
        dsl_create.setNetworkCapabilityTransports(getNetworkCapabilityTransports());
        return dsl_create._build();
    }

    private final boolean getAirplaneMode() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Throwable th2) {
            DeviceLog.error("Problems fetching airplane mode status", th2.getMessage());
            return false;
        }
    }

    private final AudioManager getAudioManager() {
        Object systemService = this.context.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            return (AudioManager) systemService;
        }
        return null;
    }

    private final double getBatteryLevel() {
        if (this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return -1.0d;
        }
        return r0.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0) / r0.getIntExtra("scale", 0);
    }

    private final int getBatteryStatus() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("status", 0);
        }
        return -1;
    }

    private final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
        return isUsingWifi() ? DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI : isActiveNetworkConnected() ? DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR : DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
    }

    private final ConnectivityManager getConnectivityManager() {
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    private final long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    private final long getEventTimeStamp() {
        return System.currentTimeMillis() / 1000;
    }

    @f
    private final long getFreeSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return d.roundToInt(file.getFreeSpace() / 1024);
    }

    private final String getLanguage() {
        String string = Locale.getDefault().toString();
        e0.checkNotNullExpressionValue(string, "getDefault().toString()");
        return string;
    }

    private final long getMemoryInfo(Device.MemoryInfoType memoryInfoType) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[memoryInfoType.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = -1;
            }
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_MEM_INFO, "r");
        String line = null;
        for (int i12 = 0; i12 < i11; i12++) {
            try {
                line = randomAccessFile.readLine();
            } finally {
            }
        }
        gv.d.closeFinally(randomAccessFile, null);
        return GetMemoryValueFromStringKt.getMemoryValueFromString(line);
    }

    private final boolean getNetworkMetered() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && connectivityManager.isActiveNetworkMetered();
    }

    private final String getNetworkOperator() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        return networkOperator == null ? "" : networkOperator;
    }

    private final String getNetworkOperatorName() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    @f
    private final int getNetworkType() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Map<String, Boolean> value;
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkType();
            } catch (SecurityException unused) {
                if (!e0.areEqual(this.reportedWarning.getValue().get("getNetworkType"), Boolean.TRUE)) {
                    MutableStateFlow<Map<String, Boolean>> mutableStateFlow = this.reportedWarning;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, p1.plus(value, tu.e0.to("getNetworkType", Boolean.TRUE))));
                    DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                }
            }
        }
        return -1;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getStreamVolume(int i10) {
        return getAudioManager() != null ? r0.getStreamVolume(i10) : -2;
    }

    private final TelephonyManager getTelephonyManager() {
        Object systemService = this.context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }

    private final String getTimeZone() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.US);
            e0.checkNotNullExpressionValue(displayName, "{\n            TimeZone.g…ORT, Locale.US)\n        }");
            return displayName;
        } catch (AssertionError e10) {
            DeviceLog.error("Could not read timeZone information: %s", e10.getMessage());
            return "";
        }
    }

    private final long getTimeZoneOffset() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
    }

    private final long getUptime() {
        return SystemClock.uptimeMillis();
    }

    private final long getUsableSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return d.roundToInt(file.getUsableSpace() / 1024);
    }

    private final boolean hasInternetConnection() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    private final boolean hasInternetConnectionM() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    private final boolean isActiveNetworkConnected() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final boolean isAdbEnabled() {
        return adbStatus();
    }

    private final boolean isAppActive() {
        return this.lifecycleDataSource.appIsForeground();
    }

    private final boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    private final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isUSBConnected() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter(INTENT_USB_STATE));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getBooleanExtra(USB_EXTRA_CONNECTED, false);
        }
        return false;
    }

    private final boolean isUsingWifi() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return false;
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && activeNetworkInfo.isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    private final boolean isWiredHeadsetOn() {
        AudioManager audioManager = getAudioManager();
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch() {
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLanguage(getLanguage());
        dsl_create.setNetworkOperator(getNetworkOperator());
        dsl_create.setNetworkOperatorName(getNetworkOperatorName());
        dsl_create.setFreeDiskSpace(getUsableSpace(this.context.getExternalFilesDir(null)));
        dsl_create.setFreeRamMemory(getFreeMemory());
        dsl_create.setWiredHeadset(isWiredHeadsetOn());
        dsl_create.setTimeZone(getTimeZone());
        dsl_create.setTimeZoneOffset(getTimeZoneOffset());
        dsl_create.setLimitedTracking(isLimitAdTrackingEnabled());
        dsl_create.setLimitedOpenAdTracking(isLimitOpenAdTrackingEnabled());
        dsl_create.setBatteryLevel(getBatteryLevel());
        dsl_create.setBatteryStatus(getBatteryStatus());
        dsl_create.setConnectionType(getConnectionType());
        dsl_create.setAndroid(fetchAndroidDynamicDeviceInfo());
        dsl_create.setAppActive(isAppActive());
        dsl_create.setScreenWidth(getScreenWidth());
        dsl_create.setScreenHeight(getScreenHeight());
        return dsl_create._build();
    }

    public final int getChargingType() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public String getConnectionTypeStr() {
        int i10 = WhenMappings.$EnumSwitchMapping$1[getConnectionType().ordinal()];
        return i10 != 1 ? i10 != 2 ? "none" : C3119a4.f35927g : C3119a4.f35922b;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getCurrentUiTheme() {
        return this.context.getResources().getConfiguration().uiMode;
    }

    public final long getFreeMemory() {
        return getMemoryInfo(Device.MemoryInfoType.FREE_MEMORY);
    }

    public final boolean getIsSdCardPresent() {
        return e0.areEqual(Environment.getExternalStorageState(), "mounted");
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public List<String> getLocaleList() {
        LocaleList locales = this.context.getResources().getConfiguration().getLocales();
        e0.checkNotNullExpressionValue(locales, "context.resources.configuration.locales");
        int size = locales.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String string = locales.get(i10).toString();
            e0.checkNotNullExpressionValue(string, "locales[it].toString()");
            arrayList.add(string);
        }
        return arrayList;
    }

    public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
        Network activeNetwork;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder result = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        if (Build.VERSION.SDK_INT < 31) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild = result.build();
            e0.checkNotNullExpressionValue(networkCapabilityTransportsBuild, "result.build()");
            return networkCapabilityTransportsBuild;
        }
        Object systemService = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild2 = result.build();
            e0.checkNotNullExpressionValue(networkCapabilityTransportsBuild2, "result.build()");
            return networkCapabilityTransportsBuild2;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild3 = result.build();
            e0.checkNotNullExpressionValue(networkCapabilityTransportsBuild3, "result.build()");
            return networkCapabilityTransportsBuild3;
        }
        boolean zHasTransport = networkCapabilities.hasTransport(1);
        e0.checkNotNullExpressionValue(result, "result");
        result.setWifi(zHasTransport);
        result.setCellular(networkCapabilities.hasTransport(0));
        result.setVpn(networkCapabilities.hasTransport(4));
        result.setEthernet(networkCapabilities.hasTransport(3));
        result.setWifiAware(networkCapabilities.hasTransport(5));
        result.setLowpan(networkCapabilities.hasTransport(6));
        result.setBluetooth(networkCapabilities.hasTransport(2));
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild4 = result.build();
        e0.checkNotNullExpressionValue(networkCapabilityTransportsBuild4, "result.build()");
        return networkCapabilityTransportsBuild4;
    }

    public final String getNetworkCountryISO() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkCountryIso = telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null;
        return networkCountryIso == null ? "" : networkCountryIso;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public String getOrientation() {
        return getScreenHeight() > getScreenWidth() ? "portrait" : "landscape";
    }

    public final Map<String, String> getProcessInfo() {
        HashMap map = new HashMap();
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_PROCESS_INFO, "r");
        try {
            String statContent = randomAccessFile.readLine();
            e0.checkNotNullExpressionValue(statContent, "statContent");
            map.put(KEY_STAT_CONTENT, statContent);
            gv.d.closeFinally(randomAccessFile, null);
            return map;
        } finally {
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getRingerMode() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public final int getScreenBrightness() {
        return Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
    }

    public final boolean getStayOnWhilePluggedIn() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Throwable th2) {
            DeviceLog.error("Problems fetching stay on while plugged in status", th2.getMessage());
            return false;
        }
    }

    public final double getStreamMaxVolume(int i10) {
        return getAudioManager() != null ? r0.getStreamMaxVolume(i10) : -2;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public Flow<VolumeSettingsChange> getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public boolean hasInternet() {
        return hasInternetConnectionM();
    }
}
