package com.unity3d.services.core.configuration;

import a.b;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.api.DownloadLatestWebViewStatus;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.connectivity.IConnectivityListener;
import com.unity3d.services.core.device.reader.DeviceInfoDataFactory;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class InitializeThread extends Thread {
    private static InitializeThread _thread;
    private InitializeState _state;
    private String _stateName;
    private long _stateStartTimestamp;
    private boolean _stopThread = false;
    private boolean _didRetry = false;
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class InitializeState {
        private InitializeState() {
        }

        public abstract InitializeState execute();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateCheckForCachedWebViewUpdate extends InitializeState {
        private Configuration _configuration;

        public InitializeStateCheckForCachedWebViewUpdate(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            try {
                byte[] bArrLoadCachedFileToByteArray = InitializeThread.loadCachedFileToByteArray(new File(SdkProperties.getLocalWebViewFile()));
                if (Utilities.Sha256(bArrLoadCachedFileToByteArray).equals(this._configuration.getWebViewHash())) {
                    return new InitializeStateUpdateCache(this._configuration, new String(bArrLoadCachedFileToByteArray, C.UTF8_NAME));
                }
            } catch (Exception unused) {
            }
            return new InitializeStateDownloadWebView(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateCheckForUpdatedWebView extends InitializeState {
        private Configuration _configuration;
        private Configuration _localWebViewConfiguration;
        private byte[] _localWebViewData;

        public InitializeStateCheckForUpdatedWebView(Configuration configuration, byte[] bArr, Configuration configuration2) {
            super();
            this._configuration = configuration;
            this._localWebViewData = bArr;
            this._localWebViewConfiguration = configuration2;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            try {
                String strSha256 = Utilities.Sha256(this._localWebViewData);
                if (!strSha256.equals(this._configuration.getWebViewHash())) {
                    SdkProperties.setLatestConfiguration(this._configuration);
                }
                if (!TextUtils.isEmpty(strSha256)) {
                    Configuration configuration = this._localWebViewConfiguration;
                    if (configuration != null && configuration.getWebViewHash() != null && this._localWebViewConfiguration.getWebViewHash().equals(strSha256) && SdkProperties.getVersionName().equals(this._localWebViewConfiguration.getSdkVersion())) {
                        return new InitializeStateCreate(this._localWebViewConfiguration, new String(this._localWebViewData, C.UTF8_NAME));
                    }
                    Configuration configuration2 = this._configuration;
                    if (configuration2 != null && configuration2.getWebViewHash().equals(strSha256)) {
                        return new InitializeStateCreate(this._configuration, new String(this._localWebViewData, C.UTF8_NAME));
                    }
                }
            } catch (Exception unused) {
            }
            return new InitializeStateCleanCache(this._configuration, new InitializeStateLoadWeb(this._configuration));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateCleanCache extends InitializeState {
        private Configuration _configuration;
        private InitializeState _nextState;

        public InitializeStateCleanCache(Configuration configuration, InitializeState initializeState) {
            super();
            this._configuration = configuration;
            this._nextState = initializeState;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            try {
                File file = new File(SdkProperties.getLocalConfigurationFilepath());
                File file2 = new File(SdkProperties.getLocalWebViewFile());
                file.delete();
                file2.delete();
            } catch (Exception e10) {
                DeviceLog.error("Failure trying to clean cache: " + e10.getMessage());
            }
            return this._nextState;
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateCleanCacheIgnoreError extends InitializeStateCleanCache {
        public InitializeStateCleanCacheIgnoreError(Configuration configuration, InitializeState initializeState) {
            super(configuration, initializeState);
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateCleanCache, com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            try {
                InitializeState initializeStateExecute = super.execute();
                if (initializeStateExecute instanceof InitializeStateError) {
                    return null;
                }
                return initializeStateExecute;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateComplete extends InitializeState {
        private Configuration _configuration;

        public InitializeStateComplete(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            for (Class cls : this._configuration.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this._configuration.getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initCompleteState(this._configuration);
                }
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateConfig extends InitializeState {
        private Configuration _configuration;
        private Configuration _localConfig;
        private int _maxRetries;
        private InitializeState _nextState;
        private int _retries;
        private long _retryDelay;
        private double _scalingFactor;

        public InitializeStateConfig(Configuration configuration) {
            super();
            this._configuration = new Configuration(SdkProperties.getConfigUrl(), configuration.getExperimentsReader());
            this._retries = 0;
            this._retryDelay = configuration.getRetryDelay();
            this._maxRetries = configuration.getMaxRetries();
            this._scalingFactor = configuration.getRetryScalingFactor();
            this._localConfig = configuration;
            this._nextState = null;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
            return executeWithLoader();
        }

        public InitializeState executeLegacy(Configuration configuration) {
            try {
                configuration.makeRequest();
                return configuration.getDelayWebViewUpdate() ? new InitializeStateLoadCacheConfigAndWebView(configuration, this._localConfig) : new InitializeStateLoadCache(configuration);
            } catch (Exception e10) {
                if (this._retries >= this._maxRetries) {
                    return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, e10, this, this._localConfig);
                }
                this._retryDelay = (long) (this._retryDelay * this._scalingFactor);
                this._retries++;
                InitializeEventsMetricSender.getInstance().onRetryConfig();
                return new InitializeStateRetry(this, this._retryDelay);
            }
        }

        public InitializeState executeWithLoader() {
            final SDKMetricsSender sDKMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
            HttpClient httpClient = (HttpClient) Utilities.getService(HttpClient.class);
            PrivacyConfigStorage privacyConfigStorage = PrivacyConfigStorage.getInstance();
            DeviceInfoDataFactory deviceInfoDataFactory = new DeviceInfoDataFactory(sDKMetricsSender);
            PrivacyConfigurationLoader privacyConfigurationLoader = new PrivacyConfigurationLoader(new ConfigurationLoader(new ConfigurationRequestFactory(this._configuration, deviceInfoDataFactory.getDeviceInfoData(InitRequestType.TOKEN)), sDKMetricsSender, httpClient), new ConfigurationRequestFactory(this._configuration, deviceInfoDataFactory.getDeviceInfoData(InitRequestType.PRIVACY)), privacyConfigStorage, httpClient);
            final Configuration configuration = new Configuration(SdkProperties.getConfigUrl());
            try {
                privacyConfigurationLoader.loadConfiguration(new IConfigurationLoaderListener() { // from class: com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.1
                    @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onError(String str) {
                        sDKMetricsSender.sendMetric(TSIMetric.newEmergencySwitchOff());
                        InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                        initializeStateConfig._nextState = initializeStateConfig.executeLegacy(configuration);
                    }

                    @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onSuccess(Configuration configuration2) {
                        InitializeStateConfig.this._configuration = configuration2;
                        InitializeStateConfig.this._configuration.saveToDisk();
                        if (InitializeStateConfig.this._configuration.getDelayWebViewUpdate()) {
                            InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                            initializeStateConfig._nextState = new InitializeStateLoadCacheConfigAndWebView(initializeStateConfig._configuration, InitializeStateConfig.this._localConfig);
                        }
                        ((TokenStorage) Utilities.getService(TokenStorage.class)).setInitToken(InitializeStateConfig.this._configuration.getUnifiedAuctionToken());
                        InitializeStateConfig initializeStateConfig2 = InitializeStateConfig.this;
                        initializeStateConfig2._nextState = new InitializeStateLoadCache(initializeStateConfig2._configuration);
                    }
                });
                return this._nextState;
            } catch (Exception e10) {
                int i10 = this._retries;
                if (i10 >= this._maxRetries) {
                    return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, e10, this, this._configuration);
                }
                this._retryDelay = (long) (this._retryDelay * this._scalingFactor);
                this._retries = i10 + 1;
                InitializeEventsMetricSender.getInstance().onRetryConfig();
                return new InitializeStateRetry(this, this._retryDelay);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateCreate extends InitializeState {
        private Configuration _configuration;
        private String _webViewData;

        public InitializeStateCreate(Configuration configuration, String str) {
            super();
            this._configuration = configuration;
            this._webViewData = str;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            DeviceLog.debug("Unity Ads init: creating webapp");
            Configuration configuration = this._configuration;
            configuration.setWebViewData(this._webViewData);
            try {
                ErrorState errorStateCreate = WebViewApp.create(configuration, false);
                if (errorStateCreate == null) {
                    return new InitializeStateComplete(this._configuration);
                }
                String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                DeviceLog.error(webAppFailureMessage);
                return new InitializeStateError(errorStateCreate, new Exception(webAppFailureMessage), this._configuration);
            } catch (IllegalThreadStateException e10) {
                DeviceLog.exception("Illegal Thread", e10);
                return new InitializeStateError(ErrorState.CreateWebApp, e10, this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }

        public String getWebData() {
            return this._webViewData;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateCreateWithRemote extends InitializeState {
        private Configuration _configuration;

        public InitializeStateCreateWithRemote(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            DeviceLog.debug("Unity Ads init: creating webapp");
            try {
                ErrorState errorStateCreate = WebViewApp.create(this._configuration, true);
                if (errorStateCreate == null) {
                    return new InitializeStateComplete(this._configuration);
                }
                String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                DeviceLog.error(webAppFailureMessage);
                return new InitializeStateError(errorStateCreate, new Exception(webAppFailureMessage), this._configuration);
            } catch (IllegalThreadStateException e10) {
                DeviceLog.exception("Illegal Thread", e10);
                return new InitializeStateError(ErrorState.CreateWebApp, e10, this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateDownloadWebView extends InitializeState {
        private Configuration _configuration;
        private HttpClient _httpClient;
        private int _retries;
        private long _retryDelay;

        public InitializeStateDownloadWebView(Configuration configuration) {
            super();
            this._httpClient = (HttpClient) Utilities.getService(HttpClient.class);
            this._configuration = configuration;
            this._retries = 0;
            this._retryDelay = configuration.getRetryDelay();
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            DeviceLog.info("Unity Ads init: downloading webapp from " + this._configuration.getWebViewUrl());
            try {
                try {
                    String string = this._httpClient.executeBlocking(new HttpRequest(this._configuration.getWebViewUrl())).getBody().toString();
                    String webViewHash = this._configuration.getWebViewHash();
                    if (string == null || webViewHash == null || !Utilities.Sha256(string).equals(webViewHash)) {
                        return null;
                    }
                    return new InitializeStateUpdateCache(this._configuration, string);
                } catch (Exception unused) {
                    if (this._retries >= this._configuration.getMaxRetries()) {
                        return null;
                    }
                    long retryScalingFactor = (long) (this._configuration.getRetryScalingFactor() * this._retryDelay);
                    this._retryDelay = retryScalingFactor;
                    this._retries++;
                    return new InitializeStateRetry(this, retryScalingFactor);
                }
            } catch (Exception e10) {
                DeviceLog.exception("Malformed URL", e10);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateError extends InitializeState {
        protected Configuration _configuration;
        ErrorState _errorState;
        Exception _exception;

        public InitializeStateError(ErrorState errorState, Exception exc, Configuration configuration) {
            super();
            this._errorState = errorState;
            this._exception = exc;
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            DeviceLog.error("Unity Ads init: halting init in " + this._errorState.getMetricName() + ": " + this._exception.getMessage());
            for (Class cls : this._configuration.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this._configuration.getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initErrorState(this._configuration, this._errorState, this._exception.getMessage());
                }
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateForceReset extends InitializeStateReset {
        public InitializeStateForceReset() {
            super(new Configuration());
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateReset, com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            SdkProperties.setInitializeState(SdkProperties.InitializationState.NOT_INITIALIZED);
            super.execute();
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateInitModules extends InitializeState {
        private Configuration _configuration;

        public InitializeStateInitModules(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            return new InitializeStateConfig(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateLoadCache extends InitializeState {
        private Configuration _configuration;

        public InitializeStateLoadCache(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws Throwable {
            DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            try {
                byte[] fileBytes = Utilities.readFileBytes(new File(SdkProperties.getLocalWebViewFile()));
                String strSha256 = Utilities.Sha256(fileBytes);
                if (strSha256 == null || !strSha256.equals(this._configuration.getWebViewHash())) {
                    return new InitializeStateLoadWeb(this._configuration);
                }
                try {
                    String str = new String(fileBytes, C.UTF8_NAME);
                    DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                    return new InitializeStateCreate(this._configuration, str);
                } catch (Exception e10) {
                    return new InitializeStateError(ErrorState.LoadCache, e10, this._configuration);
                }
            } catch (Exception e11) {
                DeviceLog.debug("Unity Ads init: webapp not found in local cache: " + e11.getMessage());
                return new InitializeStateLoadWeb(this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateLoadCacheConfigAndWebView extends InitializeState {
        private Configuration _configuration;
        private Configuration _localConfig;

        public InitializeStateLoadCacheConfigAndWebView(Configuration configuration, Configuration configuration2) {
            super();
            this._configuration = configuration;
            this._localConfig = configuration2;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            try {
                return new InitializeStateCheckForUpdatedWebView(this._configuration, InitializeThread.loadCachedFileToByteArray(new File(SdkProperties.getLocalWebViewFile())), this._localConfig);
            } catch (Exception unused) {
                return new InitializeStateCleanCache(this._configuration, new InitializeStateLoadWeb(this._configuration));
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateLoadConfigFile extends InitializeState {
        private Configuration _configuration;

        public InitializeStateLoadConfigFile(Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            DeviceLog.debug("Unity Ads init: Loading Config File Parameters");
            File file = new File(SdkProperties.getLocalConfigurationFilepath());
            if (!file.exists()) {
                return new InitializeStateReset(this._configuration);
            }
            try {
                this._configuration = new Configuration(new JSONObject(new String(Utilities.readFileBytes(file))));
            } catch (Exception unused) {
                DeviceLog.debug("Unity Ads init: Using default configuration parameters");
            }
            return new InitializeStateReset(this._configuration);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateLoadWeb extends InitializeState {
        private Configuration _configuration;
        private HttpClient _httpClient;
        private int _maxRetries;
        private int _retries;
        private long _retryDelay;
        private double _scalingFactor;

        public InitializeStateLoadWeb(Configuration configuration) {
            super();
            this._httpClient = (HttpClient) Utilities.getService(HttpClient.class);
            this._configuration = configuration;
            this._retries = 0;
            this._retryDelay = configuration.getRetryDelay();
            this._maxRetries = configuration.getMaxRetries();
            this._scalingFactor = configuration.getRetryScalingFactor();
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            DeviceLog.info("Unity Ads init: loading webapp from " + this._configuration.getWebViewUrl());
            try {
                try {
                    String string = this._httpClient.executeBlocking(new HttpRequest(this._configuration.getWebViewUrl())).getBody().toString();
                    String webViewHash = this._configuration.getWebViewHash();
                    if (webViewHash != null && !Utilities.Sha256(string).equals(webViewHash)) {
                        return new InitializeStateError(ErrorState.InvalidHash, new Exception("Invalid webViewHash"), this._configuration);
                    }
                    if (webViewHash != null) {
                        Utilities.writeFile(new File(SdkProperties.getLocalWebViewFile()), string);
                    }
                    return new InitializeStateCreate(this._configuration, string);
                } catch (Exception e10) {
                    int i10 = this._retries;
                    if (i10 >= this._maxRetries) {
                        return new InitializeStateNetworkError(ErrorState.NetworkWebviewRequest, e10, this, this._configuration);
                    }
                    this._retryDelay = (long) (this._retryDelay * this._scalingFactor);
                    this._retries = i10 + 1;
                    InitializeEventsMetricSender.getInstance().onRetryWebview();
                    return new InitializeStateRetry(this, this._retryDelay);
                }
            } catch (Exception e11) {
                DeviceLog.exception("Malformed URL", e11);
                return new InitializeStateError(ErrorState.MalformedWebviewRequest, e11, this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateNetworkError extends InitializeStateError implements IConnectivityListener {
        private static long _lastConnectedEventTimeMs;
        private static int _receivedConnectedEvents;
        private ConditionVariable _conditionVariable;
        private int _connectedEventThreshold;
        private InitializeState _erroredState;
        private int _maximumConnectedEvents;
        private long _networkErrorTimeout;
        private ErrorState _state;

        public InitializeStateNetworkError(ErrorState errorState, Exception exc, InitializeState initializeState, Configuration configuration) {
            super(errorState, exc, configuration);
            this._state = errorState;
            _receivedConnectedEvents = 0;
            _lastConnectedEventTimeMs = 0L;
            this._erroredState = initializeState;
            this._networkErrorTimeout = configuration.getNetworkErrorTimeout();
            this._maximumConnectedEvents = configuration.getMaximumConnectedEvents();
            this._connectedEventThreshold = configuration.getConnectedEventThreshold();
        }

        private boolean shouldHandleConnectedEvent() {
            return System.currentTimeMillis() - _lastConnectedEventTimeMs >= ((long) this._connectedEventThreshold) && _receivedConnectedEvents <= this._maximumConnectedEvents;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateError, com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            DeviceLog.error("Unity Ads init: network error, waiting for connection events");
            this._conditionVariable = new ConditionVariable();
            ConnectivityMonitor.addListener(this);
            if (this._conditionVariable.block(this._networkErrorTimeout)) {
                ConnectivityMonitor.removeListener(this);
                return this._erroredState;
            }
            ConnectivityMonitor.removeListener(this);
            return new InitializeStateError(this._state, new Exception("No connected events within the timeout!"), this._configuration);
        }

        @Override // com.unity3d.services.core.connectivity.IConnectivityListener
        public void onConnected() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            _receivedConnectedEvents++;
            DeviceLog.debug("Unity Ads init got connected event");
            if (shouldHandleConnectedEvent()) {
                this._conditionVariable.open();
            }
            if (_receivedConnectedEvents > this._maximumConnectedEvents) {
                ConnectivityMonitor.removeListener(this);
            }
            _lastConnectedEventTimeMs = System.currentTimeMillis();
        }

        @Override // com.unity3d.services.core.connectivity.IConnectivityListener
        public void onDisconnected() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            DeviceLog.debug("Unity Ads init got disconnected event");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateReset extends InitializeState {
        private Configuration _configuration;
        private int _resetWebAppTimeout;

        public InitializeStateReset(Configuration configuration) {
            super();
            this._configuration = configuration;
            this._resetWebAppTimeout = configuration.getResetWebappTimeout();
        }

        private void unregisterLifecycleCallbacks() {
            if (Lifecycle.getLifecycleListener() != null) {
                if (ClientProperties.getApplication() != null) {
                    ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
                }
                Lifecycle.setLifecycleListener(null);
            }
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            boolean zBlock;
            DeviceLog.debug("Unity Ads init: starting init");
            final ConditionVariable conditionVariable = new ConditionVariable();
            final WebViewApp currentApp = WebViewApp.getCurrentApp();
            if (currentApp != null) {
                currentApp.resetWebViewAppInitialization();
                if (currentApp.getWebView() != null) {
                    Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializeThread.InitializeStateReset.1
                        @Override // java.lang.Runnable
                        public void run() {
                            WebView webView = currentApp.getWebView();
                            if (webView != null) {
                                webView.destroy();
                                currentApp.setWebView(null);
                            }
                            conditionVariable.open();
                        }
                    });
                    zBlock = conditionVariable.block(this._resetWebAppTimeout);
                } else {
                    zBlock = true;
                }
                if (!zBlock) {
                    return new InitializeStateError(ErrorState.ResetWebApp, new Exception("Reset failed on opening ConditionVariable"), this._configuration);
                }
            }
            unregisterLifecycleCallbacks();
            SdkProperties.setCacheDirectory(null);
            if (SdkProperties.getCacheDirectory() == null) {
                return new InitializeStateError(ErrorState.ResetWebApp, new Exception("Cache directory is NULL"), this._configuration);
            }
            SdkProperties.setWebViewCacheDirectory(null);
            if (SdkProperties.getWebViewCacheDirectory() == null) {
                return new InitializeStateError(ErrorState.ResetWebApp, new Exception("WebView cache directory is NULL"), this._configuration);
            }
            SdkProperties.setInitialized(false);
            for (Class cls : this._configuration.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this._configuration.getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.resetState(this._configuration);
                }
            }
            return new InitializeStateInitModules(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateRetry extends InitializeState {
        long _delay;
        InitializeState _state;

        public InitializeStateRetry(InitializeState initializeState, long j10) {
            super();
            this._state = initializeState;
            this._delay = j10;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() throws IllegalAccessException, InterruptedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            DeviceLog.debug("Unity Ads init: retrying in " + this._delay + " milliseconds");
            try {
                Thread.sleep(this._delay);
            } catch (Exception e10) {
                DeviceLog.exception("Init retry interrupted", e10);
                Thread.currentThread().interrupt();
            }
            return this._state;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class InitializeStateUpdateCache extends InitializeState {
        private Configuration _configuration;
        private String _webViewData;

        public InitializeStateUpdateCache(Configuration configuration, String str) {
            super();
            this._configuration = configuration;
            this._webViewData = str;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public InitializeState execute() {
            if (this._configuration != null && this._webViewData != null) {
                try {
                    Utilities.writeFile(new File(SdkProperties.getLocalWebViewFile()), this._webViewData);
                    Utilities.writeFile(new File(SdkProperties.getLocalConfigurationFilepath()), this._configuration.getFilteredJsonString());
                } catch (Exception unused) {
                    return new InitializeStateCleanCacheIgnoreError(this._configuration, null);
                }
            }
            return null;
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    private InitializeThread(InitializeState initializeState) {
        this._state = initializeState;
    }

    public static synchronized DownloadLatestWebViewStatus downloadLatestWebView() {
        if (_thread != null) {
            return DownloadLatestWebViewStatus.INIT_QUEUE_NOT_EMPTY;
        }
        if (SdkProperties.getLatestConfiguration() == null) {
            return DownloadLatestWebViewStatus.MISSING_LATEST_CONFIG;
        }
        InitializeThread initializeThread = new InitializeThread(new InitializeStateCheckForCachedWebViewUpdate(SdkProperties.getLatestConfiguration()));
        _thread = initializeThread;
        initializeThread.setName("UnityAdsDownloadThread");
        _thread.start();
        return DownloadLatestWebViewStatus.BACKGROUND_DOWNLOAD_STARTED;
    }

    private String getMetricNameForState(InitializeState initializeState) {
        if (initializeState == null) {
            return null;
        }
        String simpleName = initializeState.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            return null;
        }
        String lowerCase = simpleName.substring(getStatePrefixLength()).toLowerCase();
        return b.o(new StringBuilder(lowerCase.length() + 13), "native_", lowerCase, "_state");
    }

    private Map<String, String> getMetricTagsForState() {
        return InitializeEventsMetricSender.getInstance().getRetryTags();
    }

    private int getStatePrefixLength() {
        return 15;
    }

    private void handleStateEndMetrics(InitializeState initializeState) {
        if (this._stateName == null || isRetryState(initializeState) || this._stateName.equals("native_retry_state")) {
            return;
        }
        this._sdkMetricsSender.sendMetric(new Metric(this._stateName, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._stateStartTimestamp)), getMetricTagsForState()));
    }

    private void handleStateStartMetrics(InitializeState initializeState) {
        if (isRetryState(initializeState)) {
            this._didRetry = true;
        } else {
            if (!this._didRetry) {
                this._stateStartTimestamp = System.nanoTime();
            }
            this._didRetry = false;
        }
        this._stateName = getMetricNameForState(initializeState);
    }

    public static synchronized void initialize(Configuration configuration) {
        if (_thread == null) {
            InitializeEventsMetricSender.getInstance().didInitStart();
            CachedLifecycle.register();
            InitializeThread initializeThread = new InitializeThread(new InitializeStateLoadConfigFile(configuration));
            _thread = initializeThread;
            initializeThread.setName("UnityAdsInitializeThread");
            _thread.start();
        }
    }

    private boolean isRetryState(InitializeState initializeState) {
        return initializeState instanceof InitializeStateRetry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] loadCachedFileToByteArray(File file) throws IOException {
        if (file == null || !file.exists()) {
            throw new IOException("file not found");
        }
        try {
            return Utilities.readFileBytes(file);
        } catch (IOException unused) {
            throw new IOException("could not read from file");
        }
    }

    public static synchronized void reset() {
        if (_thread == null) {
            InitializeThread initializeThread = new InitializeThread(new InitializeStateForceReset());
            _thread = initializeThread;
            initializeThread.setName("UnityAdsResetThread");
            _thread.start();
        }
    }

    public void quit() {
        this._stopThread = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                InitializeState initializeState = this._state;
                if (initializeState == null || this._stopThread) {
                    break;
                }
                try {
                    handleStateStartMetrics(initializeState);
                    InitializeState initializeStateExecute = this._state.execute();
                    this._state = initializeStateExecute;
                    handleStateEndMetrics(initializeStateExecute);
                } catch (Exception e10) {
                    DeviceLog.exception("Unity Ads SDK encountered an error during initialization, cancel initialization", e10);
                    Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializeThread.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK encountered an error during initialization, cancel initialization");
                        }
                    });
                    this._state = new InitializeStateForceReset();
                } catch (OutOfMemoryError e11) {
                    DeviceLog.exception("Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK", new Exception(e11));
                    Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializeThread.2
                        @Override // java.lang.Runnable
                        public void run() {
                            SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK");
                        }
                    });
                    this._state = new InitializeStateForceReset();
                }
            } catch (OutOfMemoryError unused) {
            }
        }
        _thread = null;
    }
}
