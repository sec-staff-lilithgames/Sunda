package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import bp.oM.DwaEpyvxz;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.G5;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.UserAgentError;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AdvertisingInfo;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.DeviceNode;
import com.vungle.ads.internal.model.ErrorInfo;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import pw.g;
import pw.h0;
import pw.j;
import pw.w;
import qv.m;
import sv.k0;
import tu.o;
import tu.q;
import tu.s;
import uu.p0;
import uu.y0;
import w3.b;
import xv.g0;
import xv.i0;
import xv.j0;
import xv.l0;
import xv.n0;
import xv.o0;
import xv.u0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VungleApiClient {
    private static final String TAG = "VungleApiClient";
    private AdvertisingInfo advertisingInfo;
    private VungleApi api;
    private AppNode appBody;
    private final Context applicationContext;
    private DeviceNode baseDeviceInfo;
    private final FilePreferences filePreferences;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private final Platform platform;
    private i0 responseInterceptor;
    private Map<String, Long> retryAfterDataMap;
    private final o signalManager$delegate;
    private String uaString;
    public static final Companion Companion = new Companion(null);
    private static final String BASE_URL = "https://config.ads.vungle.com/";
    private static final Set<i0> networkInterceptors = new HashSet();
    private static final Set<i0> logInterceptors = new HashSet();
    private static final Json json = JsonKt.Json$default(null, VungleApiClient$Companion$json$1.INSTANCE, 1, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final String getBASE_URL$vungle_ads_release() {
            return VungleApiClient.BASE_URL;
        }

        public final void reset$vungle_ads_release() {
            VungleHeader.INSTANCE.reset();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionTypeDetail {
        public static final String CDMA_1XRTT = "cdma_1xrtt";
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";
        public static final String CDMA_EVDO_A = "cdma_evdo_a";
        public static final String CDMA_EVDO_B = "cdma_evdo_b";
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EDGE = "edge";
        public static final String FIFTH_G = "5g";
        public static final String GPRS = "gprs";
        public static final String HRPD = "hrpd";
        public static final String HSDPA = "hsdpa";
        public static final String HSUPA = "hsupa";
        public static final String LTE = "lte";
        public static final String UNKNOWN = "unknown";
        public static final String WCDMA = "wcdma";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String CDMA_1XRTT = "cdma_1xrtt";
            public static final String CDMA_EVDO_0 = "cdma_evdo_0";
            public static final String CDMA_EVDO_A = "cdma_evdo_a";
            public static final String CDMA_EVDO_B = "cdma_evdo_b";
            public static final String EDGE = "edge";
            public static final String FIFTH_G = "5g";
            public static final String GPRS = "gprs";
            public static final String HRPD = "hrpd";
            public static final String HSDPA = "hsdpa";
            public static final String HSUPA = "hsupa";
            public static final String LTE = "lte";
            public static final String UNKNOWN = "unknown";
            public static final String WCDMA = "wcdma";

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class GzipRequestInterceptor implements i0 {
        private static final String CONTENT_ENCODING = "Content-Encoding";
        public static final Companion Companion = new Companion(null);
        private static final String GZIP = "gzip";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            private Companion() {
            }
        }

        private final u0 gzip(final u0 u0Var) throws IOException {
            final g gVar = new g();
            j jVarBuffer = h0.buffer(new w(gVar));
            u0Var.writeTo(jVarBuffer);
            jVarBuffer.close();
            return new u0() { // from class: com.vungle.ads.internal.network.VungleApiClient$GzipRequestInterceptor$gzip$1
                @Override // xv.u0
                public long contentLength() {
                    return gVar.size();
                }

                @Override // xv.u0
                public j0 contentType() {
                    return u0Var.contentType();
                }

                @Override // xv.u0
                public void writeTo(j sink) throws IOException {
                    e0.checkNotNullParameter(sink, "sink");
                    sink.write(gVar.snapshot());
                }
            };
        }

        @Override // xv.i0
        public v0 intercept(xv.h0 chain) throws IOException {
            e0.checkNotNullParameter(chain, "chain");
            o0 o0VarRequest = chain.request();
            u0 u0VarBody = o0VarRequest.body();
            if (u0VarBody != null) {
                String str = wHkgq.qtCDJpc;
                if (o0VarRequest.header(str) == null) {
                    return chain.proceed(o0VarRequest.newBuilder().header(str, GZIP).method(o0VarRequest.method(), gzip(u0VarBody)).build());
                }
            }
            return chain.proceed(o0VarRequest);
        }
    }

    public VungleApiClient(Context applicationContext, Platform platform, FilePreferences filePreferences) {
        e0.checkNotNullParameter(applicationContext, "applicationContext");
        e0.checkNotNullParameter(platform, "platform");
        e0.checkNotNullParameter(filePreferences, "filePreferences");
        this.applicationContext = applicationContext;
        this.platform = platform;
        this.filePreferences = filePreferences;
        this.uaString = System.getProperty("http.agent");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.signalManager$delegate = q.lazy(s.f87403b, (kv.a) new VungleApiClient$special$$inlined$inject$1(applicationContext));
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = new i0() { // from class: com.vungle.ads.internal.network.a
            @Override // xv.i0
            public final v0 intercept(xv.h0 h0Var) {
                return VungleApiClient.m3621responseInterceptor$lambda0(this.f50772a, h0Var);
            }
        };
        l0.a aVar = new l0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        l0.a aVarProxySelector = aVar.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).addInterceptor(this.responseInterceptor).proxySelector(new ProxySelector() { // from class: com.vungle.ads.internal.network.VungleApiClient$builder$1
            @Override // java.net.ProxySelector
            public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
                try {
                    ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
                } catch (Exception unused) {
                }
            }

            @Override // java.net.ProxySelector
            public List<Proxy> select(URI uri) {
                try {
                    List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
                    e0.checkNotNullExpressionValue(listSelect, "{\n                      …ri)\n                    }");
                    return listSelect;
                } catch (Exception unused) {
                    return uu.o0.listOf(Proxy.NO_PROXY);
                }
            }
        });
        l0 l0VarBuild = aVarProxySelector.build();
        l0 l0VarBuild2 = aVarProxySelector.addInterceptor(new GzipRequestInterceptor()).build();
        this.api = new VungleApiImpl(l0VarBuild);
        this.gzipApi = new VungleApiImpl(l0VarBuild2);
    }

    private final String bodyToString(u0 u0Var) {
        try {
            g gVar = new g();
            if (u0Var != null) {
                u0Var.writeTo(gVar);
                return gVar.readUtf8();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private final v0 defaultErrorResponse(o0 o0Var) {
        return new v0.a().request(o0Var).code(500).protocol(n0.f93760f).message("Server is busy").body(w0.Companion.create("{\"Error\":\"Server is busy\"}", j0.f93670e.parse(G5.L))).build();
    }

    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    private final String getConnectionType() {
        if (m3.a.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "NONE";
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? (type == 1 || type == 6) ? "WIFI" : type != 7 ? type != 9 ? "UNKNOWN" : "ETHERNET" : "BLUETOOTH" : "MOBILE";
    }

    private final DeviceNode getDeviceBody() throws IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    private final CommonRequestBody.RequestExt getExtBody(boolean z10) {
        String strGenerateSignals;
        String configExtension = ConfigManager.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.filePreferences.getString(Cookie.CONFIG_EXTENSION);
        }
        if (z10) {
            try {
                strGenerateSignals = getSignalManager().generateSignals();
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Couldn't convert signals for sending. Error: " + e10.getMessage());
            }
        } else {
            strGenerateSignals = null;
        }
        if ((configExtension == null || configExtension.length() == 0) && (strGenerateSignals == null || strGenerateSignals.length() == 0)) {
            return null;
        }
        return new CommonRequestBody.RequestExt(configExtension, strGenerateSignals, Long.valueOf(ConfigManager.INSTANCE.configLastValidatedTimestamp()));
    }

    public static /* synthetic */ CommonRequestBody.RequestExt getExtBody$default(VungleApiClient vungleApiClient, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return vungleApiClient.getExtBody(z10);
    }

    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    private final String getPlacementID(u0 u0Var) {
        List<String> placements;
        try {
            Json json2 = json;
            String strBodyToString = bodyToString(u0Var);
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), c1.typeOf(CommonRequestBody.class));
            e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            CommonRequestBody.RequestParam request = ((CommonRequestBody) json2.decodeFromString(kSerializerSerializer, strBodyToString)).getRequest();
            if (request != null && (placements = request.getPlacements()) != null) {
                String str = placements.get(0);
                if (str != null) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager$delegate.getValue();
    }

    private final CommonRequestBody.User getUserBody(boolean z10) {
        CommonRequestBody.User user = new CommonRequestBody.User((CommonRequestBody.GDPR) null, (CommonRequestBody.CCPA) null, (CommonRequestBody.COPPA) null, (FirstPartyData) null, (CommonRequestBody.IAB) null, 31, (u) null);
        PrivacyManager privacyManager = PrivacyManager.INSTANCE;
        user.setGdpr(new CommonRequestBody.GDPR(privacyManager.getConsentStatus(), privacyManager.getConsentSource(), privacyManager.getConsentTimestamp(), privacyManager.getConsentMessageVersion()));
        user.setCcpa(new CommonRequestBody.CCPA(privacyManager.getCcpaStatus()));
        if (privacyManager.getCoppaStatus() != COPPA.COPPA_NOTSET) {
            user.setCoppa(new CommonRequestBody.COPPA(privacyManager.getCoppaStatus().getValue()));
        }
        if (privacyManager.shouldSendTCFString()) {
            user.setIab(new CommonRequestBody.IAB(privacyManager.getIABTCFString()));
        }
        if (z10) {
            user.setFpd(VungleAds.firstPartyData);
        }
        return user;
    }

    public static /* synthetic */ CommonRequestBody.User getUserBody$default(VungleApiClient vungleApiClient, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return vungleApiClient.getUserBody(z10);
    }

    private final void initUserAgentLazy() {
        final TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
        timeIntervalMetric.markStart();
        this.platform.getUserAgentLazy(new b() { // from class: com.vungle.ads.internal.network.VungleApiClient.initUserAgentLazy.1
            @Override // w3.b
            public void accept(String str) throws Throwable {
                if (str == null) {
                    Logger.Companion.e(VungleApiClient.TAG, "Cannot Get UserAgent. Setting Default Device UserAgent");
                    new UserAgentError().logErrorNoReturnValue$vungle_ads_release();
                } else {
                    timeIntervalMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric, (LogEntry) null, (String) null, 6, (Object) null);
                    this.uaString = str;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorInfo pingTPAT$default(VungleApiClient vungleApiClient, String str, Map map, String str2, HttpMethod httpMethod, LogEntry logEntry, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            httpMethod = HttpMethod.GET;
        }
        if ((i10 & 16) != 0) {
            logEntry = null;
        }
        return vungleApiClient.pingTPAT(str, map, str2, httpMethod, logEntry);
    }

    public static /* synthetic */ CommonRequestBody requestBody$default(VungleApiClient vungleApiClient, boolean z10, boolean z11, int i10, Object obj) throws IllegalStateException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return vungleApiClient.requestBody(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: responseInterceptor$lambda-0, reason: not valid java name */
    public static final v0 m3621responseInterceptor$lambda0(VungleApiClient this$0, xv.h0 chain) throws NumberFormatException {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(chain, "chain");
        o0 o0VarRequest = chain.request();
        try {
            try {
                v0 v0VarProceed = chain.proceed(o0VarRequest);
                String str = v0VarProceed.headers().get(CommonGatewayClient.HEADER_RETRY_AFTER);
                if (str != null && str.length() != 0) {
                    try {
                        long j10 = Long.parseLong(str);
                        if (j10 > 0) {
                            String strEncodedPath = o0VarRequest.url().encodedPath();
                            long jCurrentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
                            if (k0.endsWith$default(strEncodedPath, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, false, 2, null)) {
                                String placementID = this$0.getPlacementID(o0VarRequest.body());
                                if (placementID.length() > 0) {
                                    this$0.retryAfterDataMap.put(placementID, Long.valueOf(jCurrentTimeMillis));
                                }
                            }
                        }
                    } catch (Exception unused) {
                        Logger.Companion.d(TAG, "Retry-After value is not an valid value");
                    }
                }
                return v0VarProceed;
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Exception: " + e10.getMessage() + " for " + o0VarRequest.url());
                return this$0.defaultErrorResponse(o0VarRequest);
            }
        } catch (OutOfMemoryError unused2) {
            Logger.Companion.e(TAG, "OOM for " + o0VarRequest.url());
            return this$0.defaultErrorResponse(o0VarRequest);
        }
    }

    public final void addPlaySvcAvailabilityInCookie(boolean z10) {
        this.filePreferences.put(Cookie.IS_PLAY_SERVICE_AVAILABLE, z10).apply();
    }

    public final boolean checkIsRetryAfterActive(String placementID) {
        e0.checkNotNullParameter(placementID, "placementID");
        Long l9 = this.retryAfterDataMap.get(placementID);
        if ((l9 != null ? l9.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(placementID);
        return false;
    }

    public final Call<ConfigPayload> config() throws IOException {
        AppNode appNode = this.appBody;
        if (appNode == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody$vungle_ads_release(true), appNode, getUserBody$default(this, false, 1, null), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (u) null);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        FileUtility fileUtility = FileUtility.INSTANCE;
        String str = BASE_URL;
        if (!fileUtility.isValidUrl(str)) {
            str = "https://config.ads.vungle.com/";
        }
        if (!k0.endsWith$default(str, "/", false, 2, null)) {
            str = str + '/';
        }
        return this.api.config(VungleHeader.INSTANCE.getHeaderUa(), str + DTBMetricsConfiguration.CONFIG_DIR, commonRequestBody);
    }

    public final AppNode getAppBody$vungle_ads_release() {
        return this.appBody;
    }

    public final String getConnectionTypeDetail(int i10) {
        if (i10 == 1) {
            return "gprs";
        }
        if (i10 == 2) {
            return "edge";
        }
        if (i10 == 20) {
            return "5g";
        }
        switch (i10) {
            case 4:
                return "wcdma";
            case 5:
                return "cdma_evdo_0";
            case 6:
                return "cdma_evdo_a";
            case 7:
                return "cdma_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            default:
                switch (i10) {
                    case 12:
                        return "cdma_evdo_b";
                    case 13:
                        return "lte";
                    case 14:
                        return "hrpd";
                    default:
                        return "unknown";
                }
        }
    }

    public final String getConnectionTypeDetail$vungle_ads_release() {
        if (m3.a.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null ? getConnectionTypeDetail(activeNetworkInfo.getSubtype()) : "unknown";
    }

    public final synchronized DeviceNode getDeviceBody$vungle_ads_release(boolean z10) throws IllegalStateException {
        DeviceNode deviceNodeCopy$default;
        String str;
        try {
            DeviceNode basicDeviceBody = this.baseDeviceInfo;
            if (basicDeviceBody == null) {
                basicDeviceBody = getBasicDeviceBody(this.applicationContext);
                this.baseDeviceInfo = basicDeviceBody;
            }
            deviceNodeCopy$default = DeviceNode.copy$default(basicDeviceBody, null, null, null, null, null, 0, 0, null, null, null, null, 2047, null);
            DeviceNode.VungleExt vungleExt = new DeviceNode.VungleExt(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, 4194303, (u) null);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = this.applicationContext.getSystemService("window");
            e0.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            deviceNodeCopy$default.setH(displayMetrics.heightPixels);
            deviceNodeCopy$default.setW(displayMetrics.widthPixels);
            AdvertisingInfo advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
            String advertisingId = advertisingInfo != null ? advertisingInfo.getAdvertisingId() : null;
            AdvertisingInfo advertisingInfo2 = this.advertisingInfo;
            Boolean boolValueOf = advertisingInfo2 != null ? Boolean.valueOf(advertisingInfo2.getLimitAdTracking()) : null;
            PrivacyManager privacyManager = PrivacyManager.INSTANCE;
            if (privacyManager.shouldSendAdIds()) {
                if (advertisingId != null) {
                    if (e0.areEqual("Amazon", Build.MANUFACTURER)) {
                        vungleExt.setAmazonAdvertisingId(advertisingId);
                    } else {
                        vungleExt.setGaid(advertisingId);
                    }
                    deviceNodeCopy$default.setIfa(advertisingId);
                } else {
                    deviceNodeCopy$default.setIfa("");
                }
            }
            if (z10 || !privacyManager.shouldSendAdIds()) {
                deviceNodeCopy$default.setIfa(null);
                vungleExt.setGaid(null);
                vungleExt.setAmazonAdvertisingId(null);
            }
            Boolean bool = Boolean.TRUE;
            boolean zHasSystemFeature = false;
            deviceNodeCopy$default.setLmt(e0.areEqual(boolValueOf, bool) ? 1 : 0);
            vungleExt.setGooglePlayServicesAvailable(e0.areEqual(bool, isGooglePlayServicesAvailable()));
            if (privacyManager.allowDeviceIDFromTCF() != PrivacyManager.DeviceIdAllowed.DISABLE_ID) {
                String appSetId = this.platform.getAppSetId();
                if (appSetId != null) {
                    vungleExt.setAppSetId(appSetId);
                }
                Integer appSetIdScope = this.platform.getAppSetIdScope();
                if (appSetIdScope != null) {
                    vungleExt.setAppSetIdScope(Integer.valueOf(appSetIdScope.intValue()));
                }
            }
            Intent intentRegisterReceiver = this.applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra > 0 && intExtra2 > 0) {
                    vungleExt.setBatteryLevel(intExtra / intExtra2);
                }
                int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra3 == -1) {
                    str = "UNKNOWN";
                } else if (intExtra3 == 2 || intExtra3 == 5) {
                    int intExtra4 = intentRegisterReceiver.getIntExtra("plugged", -1);
                    str = intExtra4 != 1 ? intExtra4 != 2 ? intExtra4 != 4 ? "BATTERY_PLUGGED_OTHERS" : "BATTERY_PLUGGED_WIRELESS" : "BATTERY_PLUGGED_USB" : "BATTERY_PLUGGED_AC";
                } else {
                    str = "NOT_CHARGING";
                }
            } else {
                str = "UNKNOWN";
            }
            vungleExt.setBatteryState(str);
            Object systemService2 = this.applicationContext.getSystemService("power");
            e0.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
            vungleExt.setBatterySaverEnabled(((PowerManager) systemService2).isPowerSaveMode() ? 1 : 0);
            String connectionType = getConnectionType();
            if (connectionType != null) {
                vungleExt.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                vungleExt.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            vungleExt.setLocale(Locale.getDefault().toString());
            vungleExt.setLanguage(Locale.getDefault().getLanguage());
            vungleExt.setTimeZone(TimeZone.getDefault().getID());
            vungleExt.setVolumeLevel(this.platform.getVolumeLevel());
            vungleExt.setSoundEnabled(this.platform.isSoundEnabled() ? 1 : 0);
            if (e0.areEqual("Amazon", Build.MANUFACTURER)) {
                zHasSystemFeature = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            } else {
                Object systemService3 = this.applicationContext.getSystemService("uimode");
                e0.checkNotNull(systemService3, "null cannot be cast to non-null type android.app.UiModeManager");
                if (((UiModeManager) systemService3).getCurrentModeType() == 4) {
                    zHasSystemFeature = true;
                }
            }
            vungleExt.setTv(zHasSystemFeature);
            vungleExt.setSideloadEnabled(this.platform.isSideLoaded());
            vungleExt.setSdCardAvailable(this.platform.isSdCardPresent() ? 1 : 0);
            if (ConfigManager.INSTANCE.otEnabled()) {
                vungleExt.setSit(Long.valueOf(this.platform.getSDKInstallationTime()));
                vungleExt.setOit(Long.valueOf(this.platform.getOSInstallationTime()));
                vungleExt.setOrt(Long.valueOf(this.platform.getLastBootTime()));
                vungleExt.setObt(Long.valueOf(this.platform.getBuildTime()));
            }
            deviceNodeCopy$default.setUa(this.uaString);
            deviceNodeCopy$default.setExt(vungleExt);
        } catch (Throwable th2) {
            throw th2;
        }
        return deviceNodeCopy$default;
    }

    public final VungleApi getGzipApi$vungle_ads_release() {
        return this.gzipApi;
    }

    public final Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean boolValueOf = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            e0.checkNotNullExpressionValue(googleApiAvailabilityLight, "getInstance()");
            boolean z10 = googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0;
            boolValueOf = Boolean.valueOf(z10);
            addPlaySvcAvailabilityInCookie(z10);
            return boolValueOf;
        } catch (Exception unused) {
            Logger.Companion.w(TAG, "Unexpected exception from Play services lib.");
            return boolValueOf;
        } catch (NoClassDefFoundError unused2) {
            Logger.Companion.w(TAG, "Play services Not available");
            boolValueOf = Boolean.FALSE;
            try {
                addPlaySvcAvailabilityInCookie(false);
            } catch (Exception unused3) {
                Logger.Companion.w(TAG, "Failure to write GPS availability to DB");
            }
            return boolValueOf;
        }
    }

    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean(Cookie.IS_PLAY_SERVICE_AVAILABLE);
    }

    public final i0 getResponseInterceptor$vungle_ads_release() {
        return this.responseInterceptor;
    }

    public final Map<String, Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final long getRetryAfterHeaderValue(String placementID) {
        e0.checkNotNullParameter(placementID, "placementID");
        Long l9 = this.retryAfterDataMap.get(placementID);
        if (l9 != null) {
            return l9.longValue();
        }
        return 0L;
    }

    public final synchronized void initialize(String appId) {
        PackageInfo packageInfo;
        try {
            e0.checkNotNullParameter(appId, "appId");
            VungleHeader.INSTANCE.setAppId(appId);
            String str = APSAnalytics.DEFAULT_SDK_VERSION;
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                    e0.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
                } else {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                    e0.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
                }
                String str2 = packageInfo.versionName;
                e0.checkNotNullExpressionValue(str2, "packageInfo.versionName");
                str = str2;
            } catch (Exception unused) {
            }
            VungleHeader.INSTANCE.setAppVersion(str);
            this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
            String packageName = this.applicationContext.getPackageName();
            e0.checkNotNullExpressionValue(packageName, "applicationContext.packageName");
            this.appBody = new AppNode(packageName, str, appId);
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    public final ErrorInfo pingTPAT(String url, Map<String, String> map, String str, HttpMethod requestType, LogEntry logEntry) {
        v0 v0VarRaw;
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(requestType, "requestType");
        if (url.length() == 0 || g0.f93628j.parse(url) == null) {
            return new ErrorInfo("Invalid URL", true, false, 4, null);
        }
        try {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(url).getHost()) && URLUtil.isHttpUrl(url)) {
                return new ErrorInfo("Clear Text Traffic is blocked", false, false, 6, null);
            }
            try {
                String str2 = this.uaString;
                if (str2 == null) {
                    str2 = "";
                }
                Response<Void> responseExecute = this.api.pingTPAT(str2, url, requestType, map, str != null ? u0.Companion.create(str, j0.f93670e.parse(G5.L)) : null).execute();
                if (responseExecute != null && responseExecute.isSuccessful()) {
                    return null;
                }
                Integer numValueOf = (responseExecute == null || (v0VarRaw = responseExecute.raw()) == null) ? null : Integer.valueOf(v0VarRaw.code());
                if (y0.contains(p0.listOf((Object[]) new Integer[]{Integer.valueOf(Sdk.SDKError.Reason.MRAID_ERROR_VALUE), Integer.valueOf(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE), 307, 308}), numValueOf)) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT, 0L, logEntry, url, 2, null);
                    return null;
                }
                boolean z10 = numValueOf != null && new m(500, CommonGatewayClient.CODE_599).contains(numValueOf.intValue());
                StringBuilder sb2 = new StringBuilder("unsuccessful response, error code: ");
                sb2.append(numValueOf);
                sb2.append(", message: ");
                sb2.append(responseExecute != null ? responseExecute.message() : null);
                return new ErrorInfo(sb2.toString(), false, z10, 2, null);
            } catch (Throwable th2) {
                String localizedMessage = th2.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new ErrorInfo(localizedMessage, false, true, 2, null);
            }
        } catch (MalformedURLException e10) {
            String localizedMessage2 = e10.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new ErrorInfo(localizedMessage2, true, false, 4, null);
        }
    }

    public final void reportErrors(BlockingQueue<Sdk.SDKError.Builder> errors, final AnalyticsClient.RequestListener requestListener) {
        e0.checkNotNullParameter(errors, "errors");
        e0.checkNotNullParameter(requestListener, "requestListener");
        String errorLoggingEndpoint = ConfigManager.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk.SDKError.Builder builder : errors) {
            builder.setSessionId(getSignalManager().getUuid());
            Placement placement = ConfigManager.INSTANCE.getPlacement(builder.getPlacementReferenceId());
            if (placement != null) {
                builder.setIsHbPlacement(placement.getHeaderBidding() ? 1L : 0L);
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                builder.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk.SDKError sDKErrorBuild = builder.build();
            Logger.Companion.e(TAG, "Sending Error: " + sDKErrorBuild.getReason());
            linkedBlockingQueue.add(sDKErrorBuild);
        }
        Sdk.SDKErrorBatch sDKErrorBatchBuild = Sdk.SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue).build();
        u0.a aVar = u0.Companion;
        byte[] byteArray = sDKErrorBatchBuild.toByteArray();
        e0.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.api.sendErrors(VungleHeader.INSTANCE.getHeaderUa(), errorLoggingEndpoint, aVar.create(byteArray, j0.f93670e.parse(CommonGatewayClient.HEADER_PROTOBUF), 0, sDKErrorBatchBuild.toByteArray().length)).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.reportErrors.2
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th2) {
                requestListener.onFailure();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                requestListener.onSuccess();
            }
        });
    }

    public final void reportMetrics(BlockingQueue<Sdk.SDKMetric.Builder> metrics, final AnalyticsClient.RequestListener requestListener) {
        e0.checkNotNullParameter(metrics, "metrics");
        e0.checkNotNullParameter(requestListener, "requestListener");
        String metricsEndpoint = ConfigManager.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk.SDKMetric.Builder builder : metrics) {
            builder.setSessionId(getSignalManager().getUuid());
            Placement placement = ConfigManager.INSTANCE.getPlacement(builder.getPlacementReferenceId());
            if (placement != null) {
                builder.setIsHbPlacement(placement.getHeaderBidding() ? 1L : 0L);
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                builder.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk.SDKMetric sDKMetricBuild = builder.build();
            Logger.Companion.e(TAG, "Sending Metric: " + sDKMetricBuild.getType());
            linkedBlockingQueue.add(sDKMetricBuild);
        }
        Sdk.MetricBatch metricBatchBuild = Sdk.MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue).build();
        u0.a aVar = u0.Companion;
        j0 j0Var = j0.f93670e.parse(CommonGatewayClient.HEADER_PROTOBUF);
        byte[] byteArray = metricBatchBuild.toByteArray();
        e0.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.api.sendMetrics(VungleHeader.INSTANCE.getHeaderUa(), metricsEndpoint, u0.a.create$default(aVar, j0Var, byteArray, 0, 0, 12, (Object) null)).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.reportMetrics.2
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th2) {
                requestListener.onFailure();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                requestListener.onSuccess();
            }
        });
    }

    public final Call<AdPayload> requestAd(String placement, VungleAdSize vungleAdSize) throws IllegalStateException {
        e0.checkNotNullParameter(placement, "placement");
        ConfigManager configManager = ConfigManager.INSTANCE;
        String adsEndpoint = configManager.getAdsEndpoint();
        CommonRequestBody commonRequestBodyRequestBody = requestBody(!configManager.signalsDisabled(), configManager.fpdEnabled());
        CommonRequestBody.RequestParam requestParam = new CommonRequestBody.RequestParam(uu.o0.listOf(placement), (CommonRequestBody.AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, 62, (u) null);
        if (vungleAdSize != null) {
            requestParam.setAdSize(new CommonRequestBody.AdSizeParam(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        commonRequestBodyRequestBody.setRequest(requestParam);
        return this.gzipApi.ads(VungleHeader.INSTANCE.getHeaderUa(), adsEndpoint, commonRequestBodyRequestBody);
    }

    public final CommonRequestBody requestBody(boolean z10, boolean z11) throws IllegalStateException {
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), this.appBody, getUserBody(z11), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (u) null);
        CommonRequestBody.RequestExt extBody = getExtBody(z10);
        if (extBody != null) {
            commonRequestBody.setExt(extBody);
        }
        return commonRequestBody;
    }

    public final Call<Void> ri(CommonRequestBody.RequestParam request) {
        AppNode appNode;
        e0.checkNotNullParameter(request, "request");
        String riEndpoint = ConfigManager.INSTANCE.getRiEndpoint();
        if (riEndpoint == null || riEndpoint.length() == 0 || (appNode = this.appBody) == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), appNode, getUserBody$default(this, false, 1, null), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (u) null);
        commonRequestBody.setRequest(request);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        return this.api.ri(VungleHeader.INSTANCE.getHeaderUa(), riEndpoint, commonRequestBody);
    }

    public final void sendAdMarkup(String adMarkup, String endpoint) {
        e0.checkNotNullParameter(adMarkup, "adMarkup");
        e0.checkNotNullParameter(endpoint, "endpoint");
        this.api.sendAdMarkup(endpoint, u0.Companion.create(adMarkup, j0.f93670e.parse(G5.L))).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.sendAdMarkup.1
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th2) {
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
            }
        });
    }

    public final void setAppBody$vungle_ads_release(AppNode appNode) {
        this.appBody = appNode;
    }

    public final void setGzipApi$vungle_ads_release(VungleApi vungleApi) {
        e0.checkNotNullParameter(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    public final void setResponseInterceptor$vungle_ads_release(i0 i0Var) {
        e0.checkNotNullParameter(i0Var, "<set-?>");
        this.responseInterceptor = i0Var;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(Map<String, Long> map) {
        e0.checkNotNullParameter(map, "<set-?>");
        this.retryAfterDataMap = map;
    }

    private final DeviceNode getBasicDeviceBody(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String MANUFACTURER = Build.MANUFACTURER;
        e0.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        e0.checkNotNullExpressionValue(MODEL, "MODEL");
        String str = Build.VERSION.RELEASE;
        e0.checkNotNullExpressionValue(str, DwaEpyvxz.gQkJ);
        DeviceNode deviceNode = new DeviceNode(MANUFACTURER, MODEL, str, AndroidPlatform.Companion.getCarrierName$vungle_ads_release(context), e0.areEqual("Amazon", MANUFACTURER) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (DeviceNode.VungleExt) null, 1792, (u) null);
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            deviceNode.setUa(userAgent);
            initUserAgentLazy();
            AdvertisingInfo advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
            return deviceNode;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e10.getLocalizedMessage());
            return deviceNode;
        }
    }
}
