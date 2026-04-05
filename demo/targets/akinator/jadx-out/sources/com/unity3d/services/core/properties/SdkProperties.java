package com.unity3d.services.core.properties;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.lh;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.a;
import com.unity3d.services.core.cache.CacheDirectory;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class SdkProperties {
    private static final String CACHE_DIR_NAME = "UnityAdsCache";
    private static final String CHINA_CONFIG_HOSTNAME = "dW5pdHlhZHMudW5pdHljaGluYS5jbg==";
    private static final String CHINA_ISO_ALPHA_2_CODE = "CN";
    private static final String CHINA_ISO_ALPHA_3_CODE = "CHN";
    private static final String CONFIG_VERSION_METADATA_KEY = "com.unity3d.ads.configversion";
    private static final String DEFAULT_CONFIG_HOSTNAME = "unityads.unity3d.com";
    private static final String DEFAULT_CONFIG_VERSION = "configv2";
    private static final String LOCAL_CACHE_FILE_PREFIX = "UnityAdsCache-";
    private static final String LOCAL_STORAGE_FILE_PREFIX = "UnityAdsStorage-";
    private static final String WEBVIEW_CACHE_DIR_NAME = "UnityAdsWebViewCache";
    private static long _appInitializationTimeEpochMs;
    private static CacheDirectory _cacheDirectory;
    private static String _configUrl;
    private static long _initializationTime;
    private static long _initializationTimeEpochMs;
    private static Configuration _latestConfiguration;
    private static CacheDirectory _webviewCacheDirectory;
    private static final LinkedHashSet<IUnityAdsInitializationListener> _initializationListeners = new LinkedHashSet<>();
    private static volatile boolean _initialized = false;
    private static boolean _reinitialized = false;
    private static boolean _testMode = false;
    private static boolean _previousTestMode = false;
    private static boolean _debugMode = false;
    private static final AtomicReference<InitializationState> _currentInitializationState = new AtomicReference<>(InitializationState.NOT_INITIALIZED);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum InitializationState {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED_SUCCESSFULLY,
        INITIALIZED_FAILED
    }

    public static void addInitializationListener(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (iUnityAdsInitializationListener == null) {
            return;
        }
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            linkedHashSet.add(iUnityAdsInitializationListener);
        }
    }

    public static long getAppInitializationTimeSinceEpoch() {
        return _appInitializationTimeEpochMs;
    }

    public static File getCacheDirectory() {
        return getCacheDirectory(ClientProperties.getApplicationContext());
    }

    public static String getCacheDirectoryName() {
        return "UnityAdsCache";
    }

    public static CacheDirectory getCacheDirectoryObject() {
        return _cacheDirectory;
    }

    public static String getCacheFilePrefix() {
        return LOCAL_CACHE_FILE_PREFIX;
    }

    public static String getConfigUrl() {
        if (_configUrl == null) {
            _configUrl = getDefaultConfigUrl("release");
        }
        return _configUrl;
    }

    public static String getConfigVersion(Context context) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (context != null) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    return bundle.getString(CONFIG_VERSION_METADATA_KEY, DEFAULT_CONFIG_VERSION);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                DeviceLog.warning("Failed to retrieve application info for current package");
            }
        }
        return DEFAULT_CONFIG_VERSION;
    }

    public static InitializationState getCurrentInitializationState() {
        return _currentInitializationState.get();
    }

    public static boolean getDebugMode() {
        return _debugMode;
    }

    public static String getDefaultConfigUrl(String str) {
        String str2 = isChinaLocale(Device.getNetworkCountryISO()) ? new String(Base64.decode(CHINA_CONFIG_HOSTNAME, 0)) : DEFAULT_CONFIG_HOSTNAME;
        StringBuilder sb2 = new StringBuilder(DtbConstants.HTTPS);
        sb2.append(getConfigVersion(ClientProperties.getApplicationContext()));
        sb2.append('.');
        sb2.append(str2);
        sb2.append("/webview/");
        return o2.r(sb2, getWebViewBranch(), "/", str, "/config.json");
    }

    public static IUnityAdsInitializationListener[] getInitializationListeners() {
        IUnityAdsInitializationListener[] iUnityAdsInitializationListenerArr;
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            iUnityAdsInitializationListenerArr = new IUnityAdsInitializationListener[linkedHashSet.size()];
            linkedHashSet.toArray(iUnityAdsInitializationListenerArr);
        }
        return iUnityAdsInitializationListenerArr;
    }

    public static long getInitializationTime() {
        return _initializationTime;
    }

    public static long getInitializationTimeEpoch() {
        return _initializationTimeEpochMs;
    }

    public static Configuration getLatestConfiguration() {
        return _latestConfiguration;
    }

    public static String getLocalConfigurationFilepath() {
        if (getWebViewCacheDirectory() == null) {
            return "";
        }
        return getWebViewCacheDirectory().getAbsolutePath() + "/UnityAdsWebViewConfiguration.json";
    }

    public static String getLocalStorageFilePrefix() {
        return LOCAL_STORAGE_FILE_PREFIX;
    }

    public static String getLocalWebViewFile() {
        if (getWebViewCacheDirectory() == null) {
            return "";
        }
        return getWebViewCacheDirectory().getAbsolutePath() + "/UnityAdsWebApp.html";
    }

    public static boolean getPreviousTestMode() {
        return _previousTestMode;
    }

    public static int getVersionCode() {
        return 41603;
    }

    public static String getVersionName() {
        return "4.16.3";
    }

    private static String getWebViewBranch() {
        return getVersionName();
    }

    public static File getWebViewCacheDirectory() {
        return getWebViewCacheDirectory(ClientProperties.getApplicationContext());
    }

    public static boolean isChinaLocale(String str) {
        return str.equalsIgnoreCase(CHINA_ISO_ALPHA_2_CODE) || str.equalsIgnoreCase(CHINA_ISO_ALPHA_3_CODE);
    }

    public static boolean isInitialized() {
        return _initialized;
    }

    public static boolean isReinitialized() {
        return _reinitialized;
    }

    public static boolean isTestMode() {
        return _testMode;
    }

    public static void notifyInitializationComplete() {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            try {
                setInitializeState(InitializationState.INITIALIZED_SUCCESSFULLY);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
                linkedHashSet.clear();
                Iterator it = linkedHashSet2.iterator();
                while (it.hasNext()) {
                    IUnityAdsInitializationListener iUnityAdsInitializationListener = (IUnityAdsInitializationListener) it.next();
                    Objects.requireNonNull(iUnityAdsInitializationListener);
                    Utilities.wrapCustomerListener(new a(iUnityAdsInitializationListener, 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void notifyInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            try {
                setInitializeState(InitializationState.INITIALIZED_FAILED);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
                linkedHashSet.clear();
                Iterator it = linkedHashSet2.iterator();
                while (it.hasNext()) {
                    Utilities.wrapCustomerListener(new lh((IUnityAdsInitializationListener) it.next(), 14, unityAdsInitializationError, str));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void resetInitializationListeners() {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            linkedHashSet.clear();
        }
    }

    public static void setAppInitializationTimeSinceEpoch(long j10) {
        _appInitializationTimeEpochMs = j10;
    }

    public static void setCacheDirectory(CacheDirectory cacheDirectory) {
        _cacheDirectory = cacheDirectory;
    }

    public static void setConfigUrl(String str) throws MalformedURLException, URISyntaxException {
        if (str == null) {
            throw new MalformedURLException();
        }
        if (!str.startsWith(DtbConstants.HTTP) && !str.startsWith(DtbConstants.HTTPS)) {
            throw new MalformedURLException();
        }
        new URL(str).toURI();
        _configUrl = str;
    }

    public static void setDebugMode(boolean z10) {
        _debugMode = z10;
        if (z10) {
            DeviceLog.setLogLevel(8);
        } else {
            DeviceLog.setLogLevel(4);
        }
    }

    public static void setInitializationTime(long j10) {
        _initializationTime = j10;
    }

    public static void setInitializationTimeSinceEpoch(long j10) {
        _initializationTimeEpochMs = j10;
    }

    public static void setInitializeState(InitializationState initializationState) {
        _currentInitializationState.set(initializationState);
    }

    public static void setInitialized(boolean z10) {
        _initialized = z10;
    }

    public static void setLatestConfiguration(Configuration configuration) {
        _latestConfiguration = configuration;
    }

    public static void setReinitialized(boolean z10) {
        _reinitialized = z10;
    }

    public static void setTestMode(boolean z10) {
        _previousTestMode = _testMode;
        _testMode = z10;
    }

    public static void setWebViewCacheDirectory(CacheDirectory cacheDirectory) {
        _webviewCacheDirectory = cacheDirectory;
    }

    public static File getCacheDirectory(Context context) {
        if (_cacheDirectory == null) {
            setCacheDirectory(new CacheDirectory("UnityAdsCache"));
        }
        return _cacheDirectory.getCacheDirectory(context);
    }

    public static File getWebViewCacheDirectory(Context context) {
        if (_webviewCacheDirectory == null) {
            setWebViewCacheDirectory(new CacheDirectory(WEBVIEW_CACHE_DIR_NAME, false));
        }
        return _webviewCacheDirectory.getCacheDirectory(context);
    }
}
