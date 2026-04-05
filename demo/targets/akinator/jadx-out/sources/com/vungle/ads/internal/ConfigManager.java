package com.vungle.ads.internal;

import android.content.Context;
import b0.e2;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InvalidEndpointError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kv.l;
import sv.k0;
import tu.o;
import tu.q;
import tu.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConfigManager {
    private static final int CONFIG_ALL_DATA = 2;
    private static final int CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY = 1;
    public static final long CONFIG_LAST_VALIDATE_TS_DEFAULT = -1;
    private static final int CONFIG_NOT_AVAILABLE = 0;
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    public static final String TAG = "ConfigManager";
    private static String applicationId;
    private static ConfigPayload config;
    private static String configExt;
    private static ConfigPayload.Endpoints endpoints;
    private static List<Placement> placements;
    public static final ConfigManager INSTANCE = new ConfigManager();
    private static final o json$delegate = q.lazy(s.f87403b, (kv.a) ConfigManager$json$2.INSTANCE);

    private ConfigManager() {
    }

    /* renamed from: fetchConfigAsync$lambda-0, reason: not valid java name */
    private static final VungleApiClient m3584fetchConfigAsync$lambda0(o oVar) {
        return (VungleApiClient) oVar.getValue();
    }

    private final Json getJson() {
        return (Json) json$delegate.getValue();
    }

    /* renamed from: initWithConfig$lambda-2, reason: not valid java name */
    private static final FilePreferences m3585initWithConfig$lambda2(o oVar) {
        return (FilePreferences) oVar.getValue();
    }

    /* renamed from: initWithConfig$lambda-4, reason: not valid java name */
    private static final VungleApiClient m3586initWithConfig$lambda4(o oVar) {
        return (VungleApiClient) oVar.getValue();
    }

    /* renamed from: initWithConfig$lambda-5, reason: not valid java name */
    private static final Executors m3587initWithConfig$lambda5(o oVar) {
        return (Executors) oVar.getValue();
    }

    public static /* synthetic */ void initWithConfig$vungle_ads_release$default(ConfigManager configManager, Context context, ConfigPayload configPayload, boolean z10, SingleValueMetric singleValueMetric, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            singleValueMetric = null;
        }
        configManager.initWithConfig$vungle_ads_release(context, configPayload, z10, singleValueMetric);
    }

    /* renamed from: updateConfigExtension$lambda-1, reason: not valid java name */
    private static final FilePreferences m3588updateConfigExtension$lambda1(o oVar) {
        return (FilePreferences) oVar.getValue();
    }

    public static /* synthetic */ boolean validateEndpoints$vungle_ads_release$default(ConfigManager configManager, ConfigPayload.Endpoints endpoints2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            endpoints2 = endpoints;
        }
        return configManager.validateEndpoints$vungle_ads_release(endpoints2);
    }

    public final long afterClickDuration() {
        ConfigPayload.AutoRedirect autoRedirect;
        Long afterClickDuration;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (afterClickDuration = autoRedirect.getAfterClickDuration()) == null) {
            return Long.MAX_VALUE;
        }
        return afterClickDuration.longValue();
    }

    public final boolean allowAutoRedirects() {
        ConfigPayload.AutoRedirect autoRedirect;
        Boolean allowAutoRedirect;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (allowAutoRedirect = autoRedirect.getAllowAutoRedirect()) == null) {
            return false;
        }
        return allowAutoRedirect.booleanValue();
    }

    public final int checkConfigPayload$vungle_ads_release(ConfigPayload configPayload) {
        Long configLastValidatedTimestamp;
        if (configPayload == null || configPayload.getConfigLastValidatedTimestamp() == null || ((configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp()) != null && configLastValidatedTimestamp.longValue() == -1)) {
            return 0;
        }
        return configPayload.getEndpoints() == null ? 1 : 2;
    }

    public final void clearConfig$vungle_ads_release() {
        endpoints = null;
        placements = null;
        config = null;
    }

    public final long configLastValidatedTimestamp() {
        Long configLastValidatedTimestamp;
        ConfigPayload configPayload = config;
        if (configPayload == null || (configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp()) == null) {
            return -1L;
        }
        return configLastValidatedTimestamp.longValue();
    }

    public final void fetchConfigAsync$vungle_ads_release(final Context context, final l onComplete) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(onComplete, "onComplete");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        try {
            Call<ConfigPayload> callConfig = m3584fetchConfigAsync$lambda0(q.lazy(s.f87403b, (kv.a) new ConfigManager$fetchConfigAsync$$inlined$inject$1(context))).config();
            if (callConfig != null) {
                callConfig.enqueue(new Callback<ConfigPayload>() { // from class: com.vungle.ads.internal.ConfigManager$fetchConfigAsync$1
                    @Override // com.vungle.ads.internal.network.Callback
                    public void onFailure(Call<ConfigPayload> call, Throwable th2) {
                        StringBuilder sb2 = new StringBuilder("Error while fetching config: ");
                        sb2.append(th2 != null ? th2.getMessage() : null);
                        new NetworkUnreachable(sb2.toString()).logErrorNoReturnValue$vungle_ads_release();
                        onComplete.invoke(Boolean.FALSE);
                    }

                    @Override // com.vungle.ads.internal.network.Callback
                    public void onResponse(Call<ConfigPayload> call, Response<ConfigPayload> response) {
                        if (response != null && response.isSuccessful() && response.body() != null) {
                            ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(context, response.body(), false, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_INIT));
                            onComplete.invoke(Boolean.TRUE);
                        } else {
                            StringBuilder sb2 = new StringBuilder("config API: ");
                            sb2.append(response != null ? Integer.valueOf(response.code()) : null);
                            new APIFailedStatusCodeError(sb2.toString()).logErrorNoReturnValue$vungle_ads_release();
                            onComplete.invoke(Boolean.FALSE);
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            if (th2 instanceof UnknownHostException ? true : th2 instanceof SecurityException) {
                new NetworkUnreachable(e2.o(th2, new StringBuilder("Config unknown: "))).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new NetworkUnreachable(e2.o(th2, new StringBuilder("Config: "))).logErrorNoReturnValue$vungle_ads_release();
            }
            onComplete.invoke(Boolean.FALSE);
        }
    }

    public final boolean fpdEnabled() {
        Boolean fpdEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (fpdEnabled = configPayload.getFpdEnabled()) == null) {
            return true;
        }
        return fpdEnabled.booleanValue();
    }

    public final String getAdsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String str = null;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        if (adsEndpoint != null && adsEndpoint.length() != 0) {
            str = adsEndpoint;
        }
        return str == null ? Constants.DEFAULT_ADS_ENDPOINT : str;
    }

    public final ConfigPayload getCachedConfig(FilePreferences filePreferences, String appId) {
        Long refreshTime;
        e0.checkNotNullParameter(filePreferences, "filePreferences");
        e0.checkNotNullParameter(appId, "appId");
        try {
            String string = filePreferences.getString(Cookie.CONFIG_APP_ID);
            if (string != null && string.length() != 0 && k0.equals(string, appId, true)) {
                String string2 = filePreferences.getString(Cookie.CONFIG_RESPONSE);
                if (string2 == null) {
                    return null;
                }
                long j10 = filePreferences.getLong(Cookie.CONFIG_UPDATE_TIME, 0L);
                Json json = INSTANCE.getJson();
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json.getSerializersModule(), c1.typeOf(ConfigPayload.class));
                e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                ConfigPayload configPayload = (ConfigPayload) json.decodeFromString(kSerializerSerializer, string2);
                ConfigPayload.ConfigSettings configSettings = configPayload.getConfigSettings();
                if (((configSettings == null || (refreshTime = configSettings.getRefreshTime()) == null) ? -1L : refreshTime.longValue()) + j10 < System.currentTimeMillis()) {
                    Logger.Companion.w(TAG, "cache config expired. re-config");
                    return null;
                }
                Logger.Companion.w(TAG, "use cache config.");
                return configPayload;
            }
            Logger.Companion.w(TAG, "app id mismatch, re-config");
            return null;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Error while parsing cached config: " + e10.getMessage());
            return null;
        }
    }

    public final int getCleverCacheDiskPercentage() {
        ConfigPayload.CleverCache cleverCache;
        Integer diskPercentage;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }

    public final long getCleverCacheDiskSize() {
        ConfigPayload.CleverCache cleverCache;
        Long diskSize;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long j10 = 1024;
        return diskSize.longValue() * j10 * j10;
    }

    public final String getConfigExtension() {
        String str = configExt;
        return str == null ? "" : str;
    }

    public final String getErrorLoggingEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String str = null;
        String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            str = errorLogsEndpoint;
        }
        return str == null ? Constants.DEFAULT_ERROR_LOGS_ENDPOINT : str;
    }

    public final String getGDPRButtonAccept() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    public final String getGDPRButtonDeny() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    public final String getGDPRConsentMessage() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    public final String getGDPRConsentMessageVersion() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        String consentMessageVersion;
        ConfigPayload configPayload = config;
        return (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    public final String getGDPRConsentTitle() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final boolean getGDPRIsCountryDataProtected() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        Boolean boolIsCountryDataProtected;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (boolIsCountryDataProtected = gdpr.isCountryDataProtected()) == null) {
            return false;
        }
        return boolIsCountryDataProtected.booleanValue();
    }

    public final int getLogLevel() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        Integer errorLogLevel;
        ConfigPayload configPayload = config;
        return (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (errorLogLevel = logMetricsSettings.getErrorLogLevel()) == null) ? AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() : errorLogLevel.intValue();
    }

    public final boolean getMetricsEnabled() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        Boolean metricsEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (metricsEnabled = logMetricsSettings.getMetricsEnabled()) == null) {
            return false;
        }
        return metricsEnabled.booleanValue();
    }

    public final String getMetricsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String str = null;
        String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        if (metricsEndpoint != null && metricsEndpoint.length() != 0) {
            str = metricsEndpoint;
        }
        return str == null ? Constants.DEFAULT_METRICS_ENDPOINT : str;
    }

    public final Placement getPlacement(String str) {
        List<Placement> list = placements;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (e0.areEqual(((Placement) next).getReferenceId(), str)) {
                obj = next;
                break;
            }
        }
        return (Placement) obj;
    }

    public final String getRiEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getRiEndpoint();
        }
        return null;
    }

    public final long getSessionTimeout() {
        Integer sessionTimeout;
        ConfigPayload configPayload = config;
        return ((configPayload == null || (sessionTimeout = configPayload.getSessionTimeout()) == null) ? DEFAULT_SESSION_TIMEOUT_SECONDS : sessionTimeout.intValue()) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        Integer signalSessionTimeout;
        ConfigPayload configPayload = config;
        return ((configPayload == null || (signalSessionTimeout = configPayload.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue()) * 1000;
    }

    public final ConfigPayload.IABSettings.TcfStatus getTcfStatus() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.IABSettings iab;
        ConfigPayload.IABSettings.TcfStatus.Companion companion = ConfigPayload.IABSettings.TcfStatus.Companion;
        ConfigPayload configPayload = config;
        return companion.fromRawValue((configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (iab = userPrivacy.getIab()) == null) ? null : iab.getTcfStatus());
    }

    public final synchronized void initWithConfig$vungle_ads_release(Context context, ConfigPayload configPayload, boolean z10, SingleValueMetric singleValueMetric) {
        try {
            e0.checkNotNullParameter(context, "context");
            try {
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                s sVar = s.f87403b;
                o oVarLazy = q.lazy(sVar, (kv.a) new ConfigManager$initWithConfig$$inlined$inject$1(context));
                int iCheckConfigPayload$vungle_ads_release = checkConfigPayload$vungle_ads_release(configPayload);
                if (iCheckConfigPayload$vungle_ads_release == 0) {
                    Logger.Companion.e(TAG, "Config is not available.");
                    return;
                }
                if (iCheckConfigPayload$vungle_ads_release == 1) {
                    if (!z10 && configPayload != null) {
                        Long configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp();
                        long jLongValue = configLastValidatedTimestamp != null ? configLastValidatedTimestamp.longValue() : -1L;
                        ConfigPayload configPayload2 = config;
                        if (configPayload2 != null) {
                            configPayload2.setConfigLastValidatedTimestamp(Long.valueOf(jLongValue));
                        }
                        ConfigPayload configPayload3 = config;
                        if (configPayload3 != null) {
                            INSTANCE.updateCachedConfig(configPayload3, m3585initWithConfig$lambda2(oVarLazy));
                        }
                    }
                    return;
                }
                config = configPayload;
                endpoints = configPayload != null ? configPayload.getEndpoints() : null;
                placements = configPayload != null ? configPayload.getPlacements() : null;
                int logLevel = getLogLevel();
                boolean metricsEnabled = getMetricsEnabled();
                o oVarLazy2 = q.lazy(sVar, (kv.a) new ConfigManager$initWithConfig$$inlined$inject$2(context));
                o oVarLazy3 = q.lazy(sVar, (kv.a) new ConfigManager$initWithConfig$$inlined$inject$3(context));
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                analyticsClient.initOrUpdate$vungle_ads_release(m3586initWithConfig$lambda4(oVarLazy2), m3587initWithConfig$lambda5(oVarLazy3).getLoggerExecutor(), logLevel, metricsEnabled);
                if (!z10 && configPayload != null) {
                    updateCachedConfig(configPayload, m3585initWithConfig$lambda2(oVarLazy));
                    String configExtension = configPayload.getConfigExtension();
                    if (configExtension != null) {
                        INSTANCE.updateConfigExtension$vungle_ads_release(context, configExtension);
                    }
                }
                if (singleValueMetric != null) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, (LogEntry) null, (String) null, 6, (Object) null);
                }
                PrivacyManager.INSTANCE.updateDisableAdId(shouldDisableAdId());
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Error while validating config: " + e10.getMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean isCleverCacheEnabled() {
        ConfigPayload.CleverCache cleverCache;
        Boolean enabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (enabled = cleverCache.getEnabled()) == null) {
            return false;
        }
        return enabled.booleanValue();
    }

    public final boolean isReportIncentivizedEnabled() {
        Boolean boolIsReportIncentivizedEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (boolIsReportIncentivizedEnabled = configPayload.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return boolIsReportIncentivizedEnabled.booleanValue();
    }

    public final boolean otEnabled() {
        Boolean enableOT;
        ConfigPayload configPayload = config;
        if (configPayload == null || (enableOT = configPayload.getEnableOT()) == null) {
            return true;
        }
        return enableOT.booleanValue();
    }

    public final List<Placement> placements() {
        return placements;
    }

    public final boolean retryPriorityTPATs() {
        Boolean retryPriorityTPATs;
        ConfigPayload configPayload = config;
        if (configPayload == null || (retryPriorityTPATs = configPayload.getRetryPriorityTPATs()) == null) {
            return false;
        }
        return retryPriorityTPATs.booleanValue();
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        ConfigPayload configPayload = config;
        if (configPayload == null || (rtaDebugging = configPayload.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final void setAppId$vungle_ads_release(String applicationId2) {
        e0.checkNotNullParameter(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        ConfigPayload configPayload = config;
        if (configPayload == null || (disableAdId = configPayload.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (signalsDisabled = configPayload.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final void updateCachedConfig(ConfigPayload config2, FilePreferences filePreferences) {
        e0.checkNotNullParameter(config2, "config");
        e0.checkNotNullParameter(filePreferences, "filePreferences");
        try {
            String str = applicationId;
            if (str == null) {
                e0.throwUninitializedPropertyAccessException("applicationId");
                str = null;
            }
            filePreferences.put(Cookie.CONFIG_APP_ID, str);
            filePreferences.put(Cookie.CONFIG_UPDATE_TIME, System.currentTimeMillis());
            Json json = getJson();
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json.getSerializersModule(), c1.typeOf(ConfigPayload.class));
            e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(Cookie.CONFIG_RESPONSE, json.encodeToString(kSerializerSerializer, config2));
            filePreferences.apply();
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Exception: " + e10.getMessage() + " for updating cached config");
        }
    }

    public final void updateConfigExtension$vungle_ads_release(Context context, String ext) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(ext, "ext");
        configExt = ext;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m3588updateConfigExtension$lambda1(q.lazy(s.f87403b, (kv.a) new ConfigManager$updateConfigExtension$$inlined$inject$1(context))).put(Cookie.CONFIG_EXTENSION, ext).apply();
    }

    public final boolean validateConfig$vungle_ads_release(ConfigPayload configPayload) {
        return ((configPayload != null ? configPayload.getEndpoints() : null) == null || !validateEndpoints$vungle_ads_release(configPayload.getEndpoints()) || configPayload.getPlacements() == null) ? false : true;
    }

    public final boolean validateEndpoints$vungle_ads_release(ConfigPayload.Endpoints endpoints2) {
        boolean z10;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT, "The ads endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
            z10 = false;
        } else {
            z10 = true;
        }
        String riEndpoint = endpoints2 != null ? endpoints2.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT, "The ri endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT, "The metrics endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            return z10;
        }
        Logger.Companion.e(TAG, "The error logging endpoint was not provided in the config.");
        return z10;
    }
}
