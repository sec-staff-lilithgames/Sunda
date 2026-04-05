package com.unity3d.services.core.device;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.ironsource.C3119a4;
import com.ironsource.C3191e4;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Device {
    private static ConcurrentHashMap<String, Boolean> _reportedWarning = new ConcurrentHashMap<>();
    private static SDKMetricsSender sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.core.device.Device$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType;

        static {
            int[] iArr = new int[MemoryInfoType.values().length];
            $SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType = iArr;
            try {
                iArr[MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType[MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum MemoryInfoType {
        TOTAL_MEMORY,
        FREE_MEMORY
    }

    public static String getAdvertisingTrackingId() {
        return AdvertisingId.getAdvertisingTrackingId();
    }

    public static int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    public static String getApkDigest() throws Exception {
        String packageCodePath = ClientProperties.getApplicationContext().getPackageCodePath();
        long jNanoTime = System.nanoTime();
        FileInputStream fileInputStream = null;
        try {
            File file = new File(packageCodePath);
            long length = file.length() / 1048576;
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                String strSha256 = Utilities.Sha256(fileInputStream2);
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                if (TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime) > 5000) {
                    sdkMetricsSender.sendMetric(new Metric("native_device_info_apk_digest_timeout", Long.valueOf(length)));
                }
                sdkMetricsSender.sendMetric(new Metric("native_device_info_apk_size", Long.valueOf(length)));
                return strSha256;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String getAuid() {
        return AndroidPreferences.getString("supersonic_shared_preferen", "auid");
    }

    public static float getBatteryLevel() {
        Intent intentRegisterReceiver;
        if (ClientProperties.getApplicationContext() == null || (intentRegisterReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1.0f;
        }
        return intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / intentRegisterReceiver.getIntExtra("scale", -1);
    }

    public static int getBatteryStatus() {
        Intent intentRegisterReceiver;
        if (ClientProperties.getApplicationContext() == null || (intentRegisterReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1;
        }
        return intentRegisterReceiver.getIntExtra("status", -1);
    }

    public static String getBoard() {
        return Build.BOARD;
    }

    public static String getBootloader() {
        return Build.BOOTLOADER;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildId() {
        return Build.ID;
    }

    public static String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    public static long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static String getCertificateFingerprint() {
        try {
            Signature[] signatureArr = ClientProperties.getApplicationContext().getPackageManager().getPackageInfo(ClientProperties.getApplicationContext().getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length < 1) {
                return null;
            }
            return Utilities.toHexString(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded()));
        } catch (Exception e10) {
            DeviceLog.exception("Exception when signing certificate fingerprint", e10);
            return null;
        }
    }

    public static String getConnectionType() {
        return isUsingWifi() ? C3119a4.f35922b : isActiveNetworkConnected() ? C3119a4.f35927g : "none";
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static float getDisplayMetricDensity() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().density;
        }
        return -1.0f;
    }

    public static long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public static int getExtensionVersion() {
        if (Build.VERSION.SDK_INT >= 30) {
            return SdkExtensions.getExtensionVersion(30);
        }
        return -1;
    }

    public static String getFingerprint() {
        return Build.FINGERPRINT;
    }

    public static long getFreeMemory() {
        return getMemoryInfo(MemoryInfoType.FREE_MEMORY);
    }

    public static long getFreeSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round(file.getFreeSpace() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
    }

    public static String getGLVersion() {
        ActivityManager activityManager;
        ConfigurationInfo deviceConfigurationInfo;
        if (ClientProperties.getApplicationContext() == null || (activityManager = (ActivityManager) ClientProperties.getApplicationContext().getSystemService("activity")) == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) {
            return null;
        }
        return deviceConfigurationInfo.getGlEsVersion();
    }

    public static String getHardware() {
        return Build.HARDWARE;
    }

    public static String getHost() {
        return Build.HOST;
    }

    public static String getIdfi() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String string = AndroidPreferences.getString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string != null) {
            return string;
        }
        String uniqueEventId = getUniqueEventId();
        AndroidPreferences.setString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI, uniqueEventId);
        return uniqueEventId;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType r6) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error closing RandomAccessFile"
            int[] r1 = com.unity3d.services.core.device.Device.AnonymousClass1.$SwitchMap$com$unity3d$services$core$device$Device$MemoryInfoType
            int r2 = r6.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L11
            r2 = 2
            if (r1 == r2) goto L11
            r2 = -1
        L11:
            r1 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            java.lang.String r4 = "/proc/meminfo"
            java.lang.String r5 = "r"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            r4 = 0
        L1c:
            if (r4 >= r2) goto L2a
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            int r4 = r4 + 1
            goto L1c
        L25:
            r6 = move-exception
            r1 = r3
            goto L5d
        L28:
            r1 = move-exception
            goto L3c
        L2a:
            long r1 = getMemoryValueFromString(r1)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            r3.close()     // Catch: java.io.IOException -> L32
            return r1
        L32:
            r6 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r0, r6)
            return r1
        L37:
            r6 = move-exception
            goto L5d
        L39:
            r2 = move-exception
            r3 = r1
            r1 = r2
        L3c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "Error while reading memory info: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L25
            r2.append(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L25
            com.unity3d.services.core.log.DeviceLog.exception(r6, r1)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L5a
            r3.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r6 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r0, r6)
        L5a:
            r0 = -1
            return r0
        L5d:
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.io.IOException -> L63
            goto L67
        L63:
            r1 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r0, r1)
        L67:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.Device.getMemoryInfo(com.unity3d.services.core.device.Device$MemoryInfoType):long");
    }

    private static long getMemoryValueFromString(String str) {
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String strGroup = "";
        while (matcher.find()) {
            strGroup = matcher.group(1);
        }
        return Long.parseLong(strGroup);
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getNetworkCountryISO() {
        return ClientProperties.getApplicationContext() != null ? ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkCountryIso() : "";
    }

    public static boolean getNetworkMetered() {
        ConnectivityManager connectivityManager;
        if (ClientProperties.getApplicationContext() == null || (connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        return connectivityManager.isActiveNetworkMetered();
    }

    public static String getNetworkOperator() {
        return ClientProperties.getApplicationContext() != null ? ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkOperator() : "";
    }

    public static String getNetworkOperatorName() {
        return ClientProperties.getApplicationContext() != null ? ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkOperatorName() : "";
    }

    public static int getNetworkType() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        try {
            return ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
        } catch (SecurityException unused) {
            if (_reportedWarning.containsKey("getNetworkType")) {
                return -1;
            }
            DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
            _reportedWarning.put("getNetworkType", Boolean.TRUE);
            return -1;
        }
    }

    private static ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(Build.SUPPORTED_ABIS));
        return arrayList;
    }

    private static ArrayList<String> getOldAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(Build.CPU_ABI);
        arrayList.add(Build.CPU_ABI2);
        return arrayList;
    }

    public static String getOpenAdvertisingTrackingId() {
        return OpenAdvertisingId.getOpenAdvertisingTrackingId();
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static JSONObject getPackageInfo(PackageManager packageManager) throws JSONException, PackageManager.NameNotFoundException {
        String appName = ClientProperties.getAppName();
        PackageInfo packageInfo = packageManager.getPackageInfo(appName, 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("installer", packageManager.getInstallerPackageName(appName));
        jSONObject.put(C3191e4.i.X, packageInfo.firstInstallTime);
        jSONObject.put(C3191e4.i.V, packageInfo.lastUpdateTime);
        jSONObject.put("versionCode", packageInfo.versionCode);
        jSONObject.put("versionName", packageInfo.versionName);
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, packageInfo.packageName);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> getProcessInfo() throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error closing RandomAccessFile"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            java.lang.String r4 = "/proc/self/stat"
            java.lang.String r5 = "r"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L26
            java.lang.String r4 = "stat"
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L26
            r3.close()     // Catch: java.io.IOException -> L1e
            return r1
        L1e:
            r2 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r0, r2)
            goto L38
        L23:
            r1 = move-exception
            r2 = r3
            goto L39
        L26:
            r2 = move-exception
            goto L2e
        L28:
            r1 = move-exception
            goto L39
        L2a:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L2e:
            java.lang.String r4 = "Error while reading processor info: "
            com.unity3d.services.core.log.DeviceLog.exception(r4, r2)     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L38
            r3.close()     // Catch: java.io.IOException -> L1e
        L38:
            return r1
        L39:
            if (r2 == 0) goto L43
            r2.close()     // Catch: java.io.IOException -> L3f
            goto L43
        L3f:
            r2 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r0, r2)
        L43:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.Device.getProcessInfo():java.util.Map");
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static int getRingerMode() {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public static int getScreenBrightness() {
        if (ClientProperties.getApplicationContext() != null) {
            return Settings.System.getInt(ClientProperties.getApplicationContext().getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    public static int getScreenDensity() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return -1;
    }

    public static int getScreenHeight() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        }
        return -1;
    }

    public static int getScreenLayout() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getConfiguration().screenLayout;
        }
        return -1;
    }

    public static int getScreenWidth() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        }
        return -1;
    }

    public static List<Sensor> getSensorList() {
        if (ClientProperties.getApplicationContext() != null) {
            return ((SensorManager) ClientProperties.getApplicationContext().getSystemService("sensor")).getSensorList(-1);
        }
        return null;
    }

    public static int getStreamMaxVolume(int i10) {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(i10);
        }
        return -2;
    }

    public static int getStreamVolume(int i10) {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamVolume(i10);
        }
        return -2;
    }

    public static ArrayList<String> getSupportedAbis() {
        return getApiLevel() < 21 ? getOldAbiList() : getNewAbiList();
    }

    public static String getSystemProperty(String str, String str2) {
        return str2 != null ? System.getProperty(str, str2) : System.getProperty(str);
    }

    public static long getTotalMemory() {
        return getMemoryInfo(MemoryInfoType.TOTAL_MEMORY);
    }

    public static long getTotalSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round(file.getTotalSpace() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
    }

    public static String getUniqueEventId() {
        return UUID.randomUUID().toString();
    }

    public static long getUptime() {
        return SystemClock.uptimeMillis();
    }

    public static boolean hasAV1Decoder() {
        return selectAllDecodeCodecs(MimeTypes.VIDEO_AV1).size() > 0;
    }

    public static boolean hasX264Decoder() {
        return selectAllDecodeCodecs("video/avc").size() > 0;
    }

    public static boolean hasX265Decoder() {
        return selectAllDecodeCodecs("video/hevc").size() > 0;
    }

    public static boolean isActiveNetworkConnected() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (ClientProperties.getApplicationContext() == null || (connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static Boolean isAdbEnabled() {
        return getApiLevel() < 17 ? oldAdbStatus() : newAdbStatus();
    }

    private static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo, String str) {
        return getApiLevel() >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    private static boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    public static boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    public static boolean isRooted() {
        try {
            return searchPathForBinary("su");
        } catch (Exception e10) {
            DeviceLog.exception("Rooted check failed", e10);
            return false;
        }
    }

    private static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo, String str) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase();
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return true;
        }
        return (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) ? false : true;
    }

    private static boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean isUSBConnected() {
        Intent intentRegisterReceiver;
        if (ClientProperties.getApplicationContext() == null || (intentRegisterReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter(AndroidDynamicDeviceInfoDataSource.INTENT_USB_STATE))) == null) {
            return false;
        }
        return intentRegisterReceiver.getBooleanExtra(AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED, false);
    }

    public static boolean isUsingWifi() {
        ConnectivityManager connectivityManager;
        if (ClientProperties.getApplicationContext() == null || (connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        TelephonyManager telephonyManager = (TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && connectivityManager.getActiveNetworkInfo().isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    public static boolean isWiredHeadsetOn() {
        if (ClientProperties.getApplicationContext() != null) {
            return ((AudioManager) ClientProperties.getApplicationContext().getSystemService("audio")).isWiredHeadsetOn();
        }
        return false;
    }

    private static Boolean newAdbStatus() {
        try {
            return Boolean.valueOf(1 == Settings.Global.getInt(ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0));
        } catch (Exception e10) {
            DeviceLog.exception("Problems fetching adb enabled status", e10);
            return null;
        }
    }

    private static Boolean oldAdbStatus() {
        try {
            return Boolean.valueOf(1 == Settings.Secure.getInt(ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0));
        } catch (Exception e10) {
            DeviceLog.exception("Problems fetching adb enabled status", e10);
            return null;
        }
    }

    private static boolean searchPathForBinary(String str) {
        File[] fileArrListFiles;
        for (String str2 : System.getenv(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH).split(":")) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.getName().equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static List<MediaCodecInfo> selectAllDecodeCodecs(String str) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
            if (!codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str) && isHardwareAccelerated(codecInfoAt, str)) {
                        arrayList.add(codecInfoAt);
                    }
                }
            }
        }
        return arrayList;
    }
}
