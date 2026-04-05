package com.unity3d.services.core.configuration;

import android.text.TextUtils;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.services.ads.configuration.AdsModuleConfiguration;
import com.unity3d.services.analytics.core.configuration.AnalyticsModuleConfiguration;
import com.unity3d.services.banners.configuration.BannersModuleConfiguration;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.mapper.WebRequestToHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.store.core.configuration.StoreModuleConfiguration;
import hr.kNq.ikJMrW;
import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Configuration {
    private String _configUrl;
    private ConfigurationRequestFactory _configurationRequestFactory;
    private int _connectedEventThresholdInMs;
    private boolean _delayWebViewUpdate;
    private ExperimentsReader _experimentReader;
    private String _filteredJsonString;
    private int _loadTimeout;
    private int _maxRetries;
    private int _maximumConnectedEvents;
    private double _metricSampleRate;
    private Boolean _metricsEnabled;
    private String _metricsUrl;
    private final Class<?>[] _moduleConfigurationList;
    private Map<String, IModuleConfiguration> _moduleConfigurations;
    private long _networkErrorTimeout;
    private int _privacyRequestWaitTimeout;
    private JSONObject _rawJsonData;
    private int _resetWebAppTimeout;
    private long _retryDelay;
    private double _retryScalingFactor;
    private String _sTkn;
    private String _scarBiddingUrl;
    private String _sdkVersion;
    private int _showTimeout;
    private String _src;
    private String _stateId;
    private int _tokenTimeout;
    private String _unifiedAuctionToken;
    private Class[] _webAppApiClassList;
    private long _webViewAppCreateTimeout;
    private int _webViewBridgeTimeout;
    private String _webViewData;
    private String _webViewHash;
    private String _webViewUrl;
    private String _webViewVersion;

    public Configuration() {
        this._moduleConfigurationList = new Class[]{CoreModuleConfiguration.class, AdsModuleConfiguration.class, AnalyticsModuleConfiguration.class, BannersModuleConfiguration.class, StoreModuleConfiguration.class};
        this._experimentReader = new ExperimentsReader();
        setOptionalFields(new JSONObject(), false);
    }

    private void createWebAppApiClassList() {
        ArrayList arrayList = new ArrayList();
        for (Class cls : getModuleConfigurationList()) {
            IModuleConfiguration moduleConfiguration = getModuleConfiguration(cls);
            if (moduleConfiguration != null && moduleConfiguration.getWebAppApiClassList() != null) {
                arrayList.addAll(Arrays.asList(moduleConfiguration.getWebAppApiClassList()));
            }
        }
        this._webAppApiClassList = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    private JSONObject getFilteredConfigJson(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (!next.equalsIgnoreCase("tkn") && !next.equalsIgnoreCase(Q6.f35250c1) && !next.equalsIgnoreCase("srr") && !next.equalsIgnoreCase("sTkn")) {
                jSONObject2.put(next, objOpt);
            }
        }
        return jSONObject2;
    }

    public Boolean areMetricsEnabledForCurrentSession() {
        return this._metricsEnabled;
    }

    public void deleteFromDisk() {
        File file = new File(SdkProperties.getLocalConfigurationFilepath());
        if (file.exists()) {
            file.delete();
        }
    }

    public String getConfigUrl() {
        return this._configUrl;
    }

    public int getConnectedEventThreshold() {
        return this._connectedEventThresholdInMs;
    }

    public boolean getDelayWebViewUpdate() {
        return this._delayWebViewUpdate;
    }

    public IExperiments getExperiments() {
        return this._experimentReader.getCurrentlyActiveExperiments();
    }

    public ExperimentsReader getExperimentsReader() {
        return this._experimentReader;
    }

    public String getFilteredJsonString() {
        return this._filteredJsonString;
    }

    public int getLoadTimeout() {
        return this._loadTimeout;
    }

    public int getMaxRetries() {
        return this._maxRetries;
    }

    public int getMaximumConnectedEvents() {
        return this._maximumConnectedEvents;
    }

    public double getMetricSampleRate() {
        return this._metricSampleRate;
    }

    public String getMetricsUrl() {
        return this._metricsUrl;
    }

    public IModuleConfiguration getModuleConfiguration(Class cls) {
        Map<String, IModuleConfiguration> map = this._moduleConfigurations;
        if (map != null && map.containsKey(cls)) {
            return this._moduleConfigurations.get(cls);
        }
        try {
            IModuleConfiguration iModuleConfiguration = (IModuleConfiguration) cls.newInstance();
            if (iModuleConfiguration != null) {
                if (this._moduleConfigurations == null) {
                    HashMap map2 = new HashMap();
                    this._moduleConfigurations = map2;
                    map2.put(cls.getName(), iModuleConfiguration);
                }
                return iModuleConfiguration;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public Class[] getModuleConfigurationList() {
        return this._moduleConfigurationList;
    }

    public long getNetworkErrorTimeout() {
        return this._networkErrorTimeout;
    }

    public int getPrivacyRequestWaitTimeout() {
        return this._privacyRequestWaitTimeout;
    }

    public JSONObject getRawConfigData() {
        return this._rawJsonData;
    }

    public int getResetWebappTimeout() {
        return this._resetWebAppTimeout;
    }

    public long getRetryDelay() {
        return this._retryDelay;
    }

    public double getRetryScalingFactor() {
        return this._retryScalingFactor;
    }

    public String getScarBiddingUrl() {
        return this._scarBiddingUrl;
    }

    public String getSdkVersion() {
        return this._sdkVersion;
    }

    public String getSessionToken() {
        return this._sTkn;
    }

    public int getShowTimeout() {
        return this._showTimeout;
    }

    public String getSrc() {
        String str = this._src;
        return str != null ? str : "";
    }

    public String getStateId() {
        String str = this._stateId;
        return str != null ? str : "";
    }

    public int getTokenTimeout() {
        return this._tokenTimeout;
    }

    public String getUnifiedAuctionToken() {
        return this._unifiedAuctionToken;
    }

    public Class[] getWebAppApiClassList() {
        if (this._webAppApiClassList == null) {
            createWebAppApiClassList();
        }
        return this._webAppApiClassList;
    }

    public long getWebViewAppCreateTimeout() {
        return this._webViewAppCreateTimeout;
    }

    public int getWebViewBridgeTimeout() {
        return this._webViewBridgeTimeout;
    }

    public String getWebViewData() {
        return this._webViewData;
    }

    public String getWebViewHash() {
        return this._webViewHash;
    }

    public String getWebViewUrl() {
        return this._webViewUrl;
    }

    public String getWebViewVersion() {
        return this._webViewVersion;
    }

    public void handleConfigurationData(JSONObject jSONObject, boolean z10) throws JSONException, MalformedURLException {
        String string = !jSONObject.isNull("url") ? jSONObject.getString("url") : null;
        if (TextUtils.isEmpty(string)) {
            throw new MalformedURLException("WebView URL is null or empty");
        }
        this._webViewUrl = string;
        try {
            this._webViewHash = !jSONObject.isNull("hash") ? jSONObject.getString("hash") : null;
        } catch (JSONException unused) {
            this._webViewHash = null;
        }
        this._unifiedAuctionToken = !jSONObject.isNull("tkn") ? jSONObject.optString("tkn") : null;
        this._stateId = !jSONObject.isNull(Q6.f35250c1) ? jSONObject.optString(Q6.f35250c1) : null;
        this._sTkn = jSONObject.isNull("sTkn") ? null : jSONObject.optString("sTkn");
        setOptionalFields(jSONObject, z10);
        this._filteredJsonString = getFilteredConfigJson(jSONObject).toString();
        this._rawJsonData = jSONObject;
    }

    public void makeRequest() throws Exception {
        if (this._configUrl == null) {
            throw new MalformedURLException("Base URL is null");
        }
        HttpRequest httpRequest = WebRequestToHttpRequestKt.toHttpRequest(this._configurationRequestFactory.getWebRequest());
        InitializeEventsMetricSender.getInstance().didConfigRequestStart();
        try {
            handleConfigurationData(new JSONObject(((HttpClient) Utilities.getService(HttpClient.class)).executeBlocking(httpRequest).getBody().toString()), true);
            InitializeEventsMetricSender.getInstance().didConfigRequestEnd(true);
            saveToDisk();
        } catch (Exception e10) {
            InitializeEventsMetricSender.getInstance().didConfigRequestEnd(false);
            throw e10;
        }
    }

    public void saveToDisk() {
        Utilities.writeFile(new File(SdkProperties.getLocalConfigurationFilepath()), getFilteredJsonString());
    }

    public void setWebViewData(String str) {
        this._webViewData = str;
    }

    public void setWebViewHash(String str) {
        this._webViewHash = str;
    }

    public void setWebViewUrl(String str) {
        this._webViewUrl = str;
    }

    private void setOptionalFields(JSONObject jSONObject, boolean z10) {
        this._webViewVersion = jSONObject.optString("version", null);
        this._delayWebViewUpdate = jSONObject.optBoolean("dwu", false);
        this._resetWebAppTimeout = jSONObject.optInt("rwt", 10000);
        this._maxRetries = jSONObject.optInt("mr", 6);
        this._retryDelay = jSONObject.optLong("rd", 5000L);
        this._retryScalingFactor = jSONObject.optDouble("rcf", 2.0d);
        this._connectedEventThresholdInMs = jSONObject.optInt("cet", 10000);
        this._maximumConnectedEvents = jSONObject.optInt("mce", 500);
        this._networkErrorTimeout = jSONObject.optLong("net", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        this._sdkVersion = jSONObject.optString(Q6.V, "");
        this._showTimeout = jSONObject.optInt("sto", 10000);
        this._loadTimeout = jSONObject.optInt("lto", 30000);
        this._webViewBridgeTimeout = jSONObject.optInt("wto", 5000);
        this._metricsUrl = jSONObject.optString("murl", "");
        this._metricSampleRate = jSONObject.optDouble("msr", 100.0d);
        this._webViewAppCreateTimeout = jSONObject.optLong("wct", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        this._tokenTimeout = jSONObject.optInt("tto", 5000);
        this._privacyRequestWaitTimeout = jSONObject.optInt("prwto", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        this._src = jSONObject.optString("src", null);
        this._scarBiddingUrl = jSONObject.optString("scurl", ikJMrW.HzHf);
        this._metricsEnabled = Boolean.valueOf(this._metricSampleRate >= ((double) (new Random().nextInt(99) + 1)));
        IExperiments experimentObjects = jSONObject.has("expo") ? new ExperimentObjects(jSONObject.optJSONObject("expo")) : new Experiments(jSONObject.optJSONObject("exp"));
        if (z10) {
            this._experimentReader.updateRemoteExperiments(experimentObjects);
        } else {
            this._experimentReader.updateLocalExperiments(experimentObjects);
        }
    }

    public Configuration(String str) {
        this(str, new Experiments());
    }

    public Configuration(JSONObject jSONObject) throws JSONException, MalformedURLException {
        this._moduleConfigurationList = new Class[]{CoreModuleConfiguration.class, AdsModuleConfiguration.class, AnalyticsModuleConfiguration.class, BannersModuleConfiguration.class, StoreModuleConfiguration.class};
        this._experimentReader = new ExperimentsReader();
        handleConfigurationData(jSONObject, false);
    }

    public Configuration(String str, ExperimentsReader experimentsReader) {
        this(str, experimentsReader.getCurrentlyActiveExperiments());
        this._experimentReader = experimentsReader;
    }

    public Configuration(String str, IExperiments iExperiments) {
        this();
        this._configUrl = str;
        this._configurationRequestFactory = new ConfigurationRequestFactory(this);
        this._experimentReader.updateLocalExperiments(iExperiments);
    }
}
