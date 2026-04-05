package com.unity3d.services.core.di;

import android.content.Context;
import av.e;
import bv.f;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.CommonAlternativeFlowReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.log.UnityLogger;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.fid.Constants;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import k4.h;
import k4.n;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kv.a;
import kv.l;
import kv.p;
import tu.a0;
import tu.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ServiceProvider implements IServiceProvider {
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    public static final String DATA_STORE_PRIVACY = "privacy.pb";
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;
    public static final ServiceProvider INSTANCE;
    public static final String IO_DISPATCHER = "io_dispatcher";
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    public static final String MAIN_DISPATCHER = "main_dispatcher";
    public static final String NAMED_AD_REQ = "ad_req";
    public static final String NAMED_GATEWAY_HTTP_CLIENT = "gateway_http_client";
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    public static final String NAMED_INIT_REQ = "init_req";
    public static final String NAMED_INIT_SCOPE = "init_scope";
    public static final String NAMED_LOAD_SCOPE = "load_scope";
    public static final String NAMED_LOCAL = "local";
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";
    public static final String NAMED_OMID_SCOPE = "omid_scope";
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";
    public static final String NAMED_OTHER_REQ = "other_req";
    public static final String NAMED_PUBLIC_JOB = "public_job";
    public static final String NAMED_REMOTE = "remote";
    public static final String NAMED_SCAR_SCOPE = "scar_scope";
    public static final String NAMED_SDK = "sdk";
    public static final String NAMED_SHOW_SCOPE = "show_scope";
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;
    private static final IServicesRegistry serviceRegistry;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05491 extends f0 implements a {
            public static final C05491 INSTANCE = new C05491();

            public C05491() {
                super(0);
            }

            @Override // kv.a
            public final Context invoke() {
                return ClientProperties.getApplicationContext();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$10, reason: invalid class name */
        public static final class AnonymousClass10 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CoroutineScope invoke() {
                return this.$moduleInstance.transactionCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey("sdk", c1.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, c1.getOrCreateKotlinClass(Job.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$100, reason: invalid class name */
        public static final class AnonymousClass100 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass100(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetInitializationState invoke() {
                return new CommonGetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SDKPropertiesManager.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$101, reason: invalid class name */
        public static final class AnonymousClass101 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass101(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetIsFileCache invoke() {
                return new CommonGetIsFileCache((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$102, reason: invalid class name */
        public static final class AnonymousClass102 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass102(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final SetInitializationState invoke() {
                return new CommonSetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SDKPropertiesManager.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$103, reason: invalid class name */
        public static final class AnonymousClass103 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass103(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetRequestPolicy invoke() {
                return new AndroidGetAdRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$104, reason: invalid class name */
        public static final class AnonymousClass104 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass104(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetAdDataRefreshRequest invoke() {
                return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CampaignRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$105, reason: invalid class name */
        public static final class AnonymousClass105 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass105(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetAdPlayerConfigRequest invoke() {
                return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$106, reason: invalid class name */
        public static final class AnonymousClass106 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass106(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidGetAdPlayerContext invoke() {
                return new AndroidGetAdPlayerContext((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$107, reason: invalid class name */
        public static final class AnonymousClass107 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass107(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetAdRequest invoke() {
                return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CampaignRepository.class))), (WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(WebviewConfigurationDataSource.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(TcfRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$108, reason: invalid class name */
        public static final class AnonymousClass108 extends f0 implements a {
            public static final AnonymousClass108 INSTANCE = new AnonymousClass108();

            public AnonymousClass108() {
                super(0);
            }

            @Override // kv.a
            public final GetHbTokenEventRequest invoke() {
                return new GetAndroidTokenEventRequest();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$109, reason: invalid class name */
        public static final class AnonymousClass109 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass109(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CommonScarEventReceiver invoke() {
                return new CommonScarEventReceiver((CoroutineScope) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$11, reason: invalid class name */
        public static final class AnonymousClass11 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CoroutineScope invoke() {
                return this.$moduleInstance.getTokenCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey("sdk", c1.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, c1.getOrCreateKotlinClass(Job.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$110, reason: invalid class name */
        public static final class AnonymousClass110 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass110(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GMAScarAdapterBridge invoke() {
                GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CommonScarEventReceiver.class))))).getBridge();
                e0.checkNotNullExpressionValue(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                return bridge;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$111, reason: invalid class name */
        public static final class AnonymousClass111 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass111(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ScarTimeHackFixer invoke() {
                return new ScarTimeHackFixer((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$112, reason: invalid class name */
        public static final class AnonymousClass112 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass112(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ScarManager invoke() {
                return new AndroidScarManager((CommonScarEventReceiver) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ScarTimeHackFixer.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$113, reason: invalid class name */
        public static final class AnonymousClass113 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass113(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final FetchSignalsAndSendUseCase invoke() {
                return new AndroidFetchSignalsAndSendUseCase((CoroutineScope) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ScarManager.class))), (HandleGetTokenRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleGetTokenRequest.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$114, reason: invalid class name */
        public static final class AnonymousClass114 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass114(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final LoadScarAd invoke() {
                return new LoadScarAd((ScarManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ScarManager.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$115, reason: invalid class name */
        public static final class AnonymousClass115 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass115(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final HandleGetTokenRequest invoke() {
                return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetHbTokenEventRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, c1.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GatewayClient.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$116, reason: invalid class name */
        public static final class AnonymousClass116 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass116(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetClientInfo invoke() {
                return new AndroidGetClientInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(MediationRepository.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OmidManager.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OfferwallManager.class))), (FIdExistenceDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(FIdExistenceDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$117, reason: invalid class name */
        public static final class AnonymousClass117 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass117(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetInitializationCompletedRequest invoke() {
                return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$118, reason: invalid class name */
        public static final class AnonymousClass118 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass118(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetInitializationRequest invoke() {
                return new AndroidGetInitializationRequest((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$119, reason: invalid class name */
        public static final class AnonymousClass119 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass119(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetLimitedSessionToken invoke() {
                return new AndroidGetLimitedSessionToken((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(MediationRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$12, reason: invalid class name */
        public static final class AnonymousClass12 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass12(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CoroutineScope invoke() {
                return this.$moduleInstance.scarSignalsCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey("sdk", c1.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, c1.getOrCreateKotlinClass(Job.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$120, reason: invalid class name */
        public static final class AnonymousClass120 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass120(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetOpenGLRendererInfo invoke() {
                return new AndroidGetOpenGLRendererInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$121, reason: invalid class name */
        public static final class AnonymousClass121 extends f0 implements a {
            public static final AnonymousClass121 INSTANCE = new AnonymousClass121();

            public AnonymousClass121() {
                super(0);
            }

            @Override // kv.a
            public final GetSharedDataTimestamps invoke() {
                return new AndroidGetSharedDataTimestamps();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$122, reason: invalid class name */
        public static final class AnonymousClass122 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass122(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetUniversalRequestForPayLoad invoke() {
                return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestSharedData.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$123, reason: invalid class name */
        public static final class AnonymousClass123 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass123(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetUniversalRequestSharedData invoke() {
                return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetSharedDataTimestamps.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetLimitedSessionToken.class))), (DeveloperConsentRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeveloperConsentRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$124, reason: invalid class name */
        public static final class AnonymousClass124 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass124(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetCachedAsset invoke() {
                return new GetCachedAsset((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CacheRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CacheWebViewAssets.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$125, reason: invalid class name */
        public static final class AnonymousClass125 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass125(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetWebViewBridgeUseCase invoke() {
                return new CommonGetWebViewBridgeUseCase((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$126, reason: invalid class name */
        public static final class AnonymousClass126 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass126(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetRequestPolicy invoke() {
                return new GetInitRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$127, reason: invalid class name */
        public static final class AnonymousClass127 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass127(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetLatestWebViewConfiguration invoke() {
                return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(WebviewConfigurationDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$128, reason: invalid class name */
        public static final class AnonymousClass128 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass128(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetRequestPolicy invoke() {
                return new GetOperativeEventRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$129, reason: invalid class name */
        public static final class AnonymousClass129 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass129(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetRequestPolicy invoke() {
                return new GetOtherRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$13, reason: invalid class name */
        public static final class AnonymousClass13 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass13(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CoroutineScope invoke() {
                return this.$moduleInstance.offerwallSignalsCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey("sdk", c1.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, c1.getOrCreateKotlinClass(Job.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$130, reason: invalid class name */
        public static final class AnonymousClass130 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass130(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetPrivacyUpdateRequest invoke() {
                return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$131, reason: invalid class name */
        public static final class AnonymousClass131 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass131(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final HandleGatewayInitializationResponse invoke() {
                return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(TriggerInitializationCompletedRequest.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (CoroutineScope) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class))), (HandleDebugSettings) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleDebugSettings.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$132, reason: invalid class name */
        public static final class AnonymousClass132 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass132(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final HandleGatewayUniversalResponse invoke() {
                return new AndroidHandleGatewayUniversalResponse((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))), (AndroidAppSetIdDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidAppSetIdDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$133, reason: invalid class name */
        public static final class AnonymousClass133 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass133(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeBoldSDK invoke() {
                return new AndroidInitializeBoldSDK((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (InitializeOMSDK) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeOMSDK.class))), (GetInitializationRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, c1.getOrCreateKotlinClass(GetRequestPolicy.class))), (CleanAssets) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CleanAssets.class))), (HandleGatewayInitializationResponse) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleGatewayInitializationResponse.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GatewayClient.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (EventObservers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(EventObservers.class))), (TriggerInitializeListener) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(TriggerInitializeListener.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (StorageManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(StorageManager.class))), (ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ConfigurationReader.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SDKPropertiesManager.class))), (GetGameId) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetGameId.class))), (AndroidHandleFocusCounters) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidHandleFocusCounters.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$134, reason: invalid class name */
        public static final class AnonymousClass134 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass134(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final LegacyShowUseCase invoke() {
                return new LegacyShowUseCase((Show) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Show.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetOperativeEventApi.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationState.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SafeCallbackInvoke.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$135, reason: invalid class name */
        public static final class AnonymousClass135 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass135(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final SendPrivacyUpdateRequest invoke() {
                return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, c1.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GatewayClient.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$136, reason: invalid class name */
        public static final class AnonymousClass136 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass136(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final TriggerInitializationCompletedRequest invoke() {
                return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationCompletedRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, c1.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GatewayClient.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$137, reason: invalid class name */
        public static final class AnonymousClass137 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass137(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final TriggerInitializeListener invoke() {
                return new TriggerInitializeListener((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$138, reason: invalid class name */
        public static final class AnonymousClass138 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass138(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final DiagnosticEventObserver invoke() {
                return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetDiagnosticEventBatchRequest.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(BackgroundWorker.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$139, reason: invalid class name */
        public static final class AnonymousClass139 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass139(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final EventObservers invoke() {
                return new EventObservers((OperativeEventObserver) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OperativeEventObserver.class))), (DiagnosticEventObserver) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DiagnosticEventObserver.class))), (TransactionEventObserver) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(TransactionEventObserver.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$14, reason: invalid class name */
        public static final class AnonymousClass14 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass14(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CoroutineScope invoke() {
                return this.$moduleInstance.omidCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey("sdk", c1.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, c1.getOrCreateKotlinClass(Job.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$140, reason: invalid class name */
        public static final class AnonymousClass140 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass140(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetTransactionData invoke() {
                return new AndroidGetTransactionData((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetByteStringId.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$141, reason: invalid class name */
        public static final class AnonymousClass141 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass141(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetTransactionRequest invoke() {
                return new CommonGetTransactionRequest((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$142, reason: invalid class name */
        public static final class AnonymousClass142 extends f0 implements a {
            public static final AnonymousClass142 INSTANCE = new AnonymousClass142();

            public AnonymousClass142() {
                super(0);
            }

            @Override // kv.a
            public final GetDiagnosticEventBatchRequest invoke() {
                return new GetDiagnosticEventBatchRequest();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$143, reason: invalid class name */
        public static final class AnonymousClass143 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass143(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetDiagnosticEventRequest invoke() {
                return new GetDiagnosticEventRequest((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetSharedDataTimestamps.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$144, reason: invalid class name */
        public static final class AnonymousClass144 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass144(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetOperativeEventApi invoke() {
                return new GetOperativeEventApi((OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OperativeEventRepository.class))), (GetOperativeEventRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetOperativeEventRequest.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$145, reason: invalid class name */
        public static final class AnonymousClass145 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass145(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetOperativeEventRequest invoke() {
                return new GetOperativeEventRequest((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetByteStringId.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CampaignRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$146, reason: invalid class name */
        public static final class AnonymousClass146 extends f0 implements a {
            public static final AnonymousClass146 INSTANCE = new AnonymousClass146();

            public AnonymousClass146() {
                super(0);
            }

            @Override // kv.a
            public final HandleGatewayEventResponse invoke() {
                return new AndroidHandleGatewayEventResponse();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$147, reason: invalid class name */
        public static final class AnonymousClass147 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass147(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final OperativeEventObserver invoke() {
                return new OperativeEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OperativeEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(BackgroundWorker.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$148, reason: invalid class name */
        public static final class AnonymousClass148 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass148(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final TransactionEventObserver invoke() {
                return new TransactionEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(TransactionEventRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, c1.getOrCreateKotlinClass(GetRequestPolicy.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, c1.getOrCreateKotlinClass(ByteStringDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$149, reason: invalid class name */
        public static final class AnonymousClass149 extends f0 implements a {
            public static final AnonymousClass149 INSTANCE = new AnonymousClass149();

            public AnonymousClass149() {
                super(0);
            }

            @Override // kv.a
            public final UniversalRequestTtlValidator invoke() {
                return new CommonUniversalRequestTtlValidator();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$15, reason: invalid class name */
        public static final class AnonymousClass15 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass15(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final Job invoke() {
                return this.$moduleInstance.publicApiJob((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DiagnosticEventRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$150, reason: invalid class name */
        public static final class AnonymousClass150 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass150(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final UniversalRequestEventSender invoke() {
                return new UniversalRequestEventSender((GatewayClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(UniversalRequestTtlValidator.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$151, reason: invalid class name */
        public static final class AnonymousClass151 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass151(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final OmFinishSession invoke() {
                return new AndroidOmFinishSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$152, reason: invalid class name */
        public static final class AnonymousClass152 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass152(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final OmImpressionOccurred invoke() {
                return new AndroidOmImpressionOccurred((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$153, reason: invalid class name */
        public static final class AnonymousClass153 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass153(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidOmInteraction invoke() {
                return new AndroidOmStartSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$154, reason: invalid class name */
        public static final class AnonymousClass154 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass154(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetOmData invoke() {
                return new CommonGetOmData((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$155, reason: invalid class name */
        public static final class AnonymousClass155 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass155(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final IsOMActivated invoke() {
                return new CommonIsOMActivated((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$156, reason: invalid class name */
        public static final class AnonymousClass156 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass156(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeOMSDK invoke() {
                return new AndroidInitializeOMSDK((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$157, reason: invalid class name */
        public static final class AnonymousClass157 extends f0 implements a {
            public static final AnonymousClass157 INSTANCE = new AnonymousClass157();

            public AnonymousClass157() {
                super(0);
            }

            @Override // kv.a
            public final FlattenerRulesUseCase invoke() {
                return new DeveloperConsentFlattenerRulesUseCase();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$158, reason: invalid class name */
        public static final class AnonymousClass158 extends f0 implements a {
            public static final AnonymousClass158 INSTANCE = new AnonymousClass158();

            public AnonymousClass158() {
                super(0);
            }

            @Override // kv.a
            public final FlattenerRulesUseCase invoke() {
                return new LegacyUserConsentFlattenerRulesUseCase();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$159, reason: invalid class name */
        public static final class AnonymousClass159 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass159(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final BackgroundWorker invoke() {
                return new BackgroundWorker((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$16, reason: invalid class name */
        public static final class AnonymousClass16 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass16(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ByteStringDataSource invoke() {
                return new AndroidLegacyConfigStoreDataSource((StorageManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(StorageManager.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$160, reason: invalid class name */
        public static final class AnonymousClass160 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass160(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final DiagnosticEventRequestWorkModifier invoke() {
                return new DiagnosticEventRequestWorkModifier((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$161, reason: invalid class name */
        public static final class AnonymousClass161 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass161(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GatewayClient invoke() {
                return new CommonGatewayClient((HttpClient) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_GATEWAY_HTTP_CLIENT, c1.getOrCreateKotlinClass(HttpClient.class))), (HandleGatewayUniversalResponse) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$162, reason: invalid class name */
        public static final class AnonymousClass162 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass162(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CoroutineExceptionHandler invoke() {
                return new SDKErrorHandler((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AlternativeFlowReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SDKMetricsSender.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$163, reason: invalid class name */
        public static final class AnonymousClass163 extends f0 implements a {
            public static final AnonymousClass163 INSTANCE = new AnonymousClass163();

            public AnonymousClass163() {
                super(0);
            }

            @Override // kv.a
            public final TokenStorage invoke() {
                return new InMemoryTokenStorage();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$164, reason: invalid class name */
        public static final class AnonymousClass164 extends f0 implements a {
            public static final AnonymousClass164 INSTANCE = new AnonymousClass164();

            public AnonymousClass164() {
                super(0);
            }

            @Override // kv.a
            public final VolumeChange invoke() {
                return new VolumeChangeContentObserver();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$165, reason: invalid class name */
        public static final class AnonymousClass165 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass165(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ConfigFileFromLocalStorage invoke() {
                return new ConfigFileFromLocalStorage((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$166, reason: invalid class name */
        public static final class AnonymousClass166 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass166(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeSDK invoke() {
                return new InitializeSDK((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class))), (InitializeStateReset) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateReset.class))), (InitializeStateError) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateError.class))), (InitializeStateConfig) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateConfig.class))), (InitializeStateCreate) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateCreate.class))), (InitializeStateLoadCache) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateLoadWeb.class))), (InitializeStateComplete) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateComplete.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$167, reason: invalid class name */
        public static final class AnonymousClass167 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass167(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeStateComplete invoke() {
                return new InitializeStateComplete((n) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, c1.getOrCreateKotlinClass(n.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$168, reason: invalid class name */
        public static final class AnonymousClass168 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass168(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeStateConfig invoke() {
                return new InitializeStateConfig((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateConfigWithLoader.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$169, reason: invalid class name */
        public static final class AnonymousClass169 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass169(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeStateConfigWithLoader invoke() {
                return new InitializeStateConfigWithLoader((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateNetworkError.class))), (TokenStorage) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SDKMetricsSender.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$17, reason: invalid class name */
        public static final class AnonymousClass17 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass17(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final n invoke() {
                return this.$moduleInstance.privacyDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$170, reason: invalid class name */
        public static final class AnonymousClass170 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass170(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeStateCreate invoke() {
                return new InitializeStateCreate((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$171, reason: invalid class name */
        public static final class AnonymousClass171 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass171(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeStateError invoke() {
                return new InitializeStateError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$172, reason: invalid class name */
        public static final class AnonymousClass172 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass172(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeStateLoadCache invoke() {
                return new InitializeStateLoadCache((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$173, reason: invalid class name */
        public static final class AnonymousClass173 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass173(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeStateLoadWeb invoke() {
                return new InitializeStateLoadWeb((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateNetworkError.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HttpClient.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$174, reason: invalid class name */
        public static final class AnonymousClass174 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass174(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeStateReset invoke() {
                return new InitializeStateReset((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$175, reason: invalid class name */
        public static final class AnonymousClass175 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass175(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final StoreMonitor invoke() {
                return new StoreMonitor((StoreExceptionHandler) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(StoreExceptionHandler.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$176, reason: invalid class name */
        public static final class AnonymousClass176 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass176(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final StoreWebViewEventSender invoke() {
                return new StoreWebViewEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(IEventSender.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$177, reason: invalid class name */
        public static final class AnonymousClass177 extends f0 implements a {
            public static final AnonymousClass177 INSTANCE = new AnonymousClass177();

            public AnonymousClass177() {
                super(0);
            }

            @Override // kv.a
            public final StoreExceptionHandler invoke() {
                return new GatewayStoreExceptionHandler();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$178, reason: invalid class name */
        public static final class AnonymousClass178 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass178(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final StoreEventListenerFactory invoke() {
                return new StoreEventListenerFactory((StoreWebViewEventSender) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(StoreWebViewEventSender.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$179, reason: invalid class name */
        public static final class AnonymousClass179 extends f0 implements a {
            public static final AnonymousClass179 INSTANCE = new AnonymousClass179();

            public AnonymousClass179() {
                super(0);
            }

            @Override // kv.a
            public final ConfigurationReader invoke() {
                return new ConfigurationReader();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$18, reason: invalid class name */
        public static final class AnonymousClass18 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass18(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyDataStore((n) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, c1.getOrCreateKotlinClass(n.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$180, reason: invalid class name */
        public static final class AnonymousClass180 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass180(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidAttribution invoke() {
                return new AndroidAttribution((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$181, reason: invalid class name */
        public static final class AnonymousClass181 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass181(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AdPlayerScope invoke() {
                return new AdPlayerScope((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$182, reason: invalid class name */
        public static final class AnonymousClass182 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass182(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidWebViewClient invoke() {
                return new AndroidWebViewClient((GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetCachedAsset.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$183, reason: invalid class name */
        public static final class AnonymousClass183 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass183(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidGetWebViewContainerUseCase invoke() {
                return new AndroidGetWebViewContainerUseCase((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (AndroidWebViewClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendWebViewClientErrorDiagnostics.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$184, reason: invalid class name */
        public static final class AnonymousClass184 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass184(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final Load invoke() {
                return new AndroidLoad((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (GetAdRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetAdRequest.class))), (GetAdPlayerConfigRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, c1.getOrCreateKotlinClass(GetRequestPolicy.class))), (HandleGatewayAdResponse) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleGatewayAdResponse.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GatewayClient.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$185, reason: invalid class name */
        public static final class AnonymousClass185 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass185(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AwaitInitialization invoke() {
                return new CommonAwaitInitialization((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$186, reason: invalid class name */
        public static final class AnonymousClass186 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass186(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetAsyncHeaderBiddingToken invoke() {
                return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SafeCallbackInvoke.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$187, reason: invalid class name */
        public static final class AnonymousClass187 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass187(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetAdPlayer invoke() {
                return new CommonGetAdPlayer((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CoroutineScope) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AdPlayerScope.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OfferwallManager.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AdRepository.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(LifecycleDataSource.class))), (OrientationRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OrientationRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$188, reason: invalid class name */
        public static final class AnonymousClass188 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass188(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CacheWebViewAssets invoke() {
                return new AndroidCacheWebViewAssets((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CacheRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$189, reason: invalid class name */
        public static final class AnonymousClass189 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass189(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final HandleGatewayAdResponse invoke() {
                return new AndroidHandleGatewayAdResponse((AdRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AdRepository.class))), (AndroidGetWebViewContainerUseCase) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CampaignRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetLatestWebViewConfiguration.class))), (AdPlayerScope) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AdPlayerScope.class))), (GetAdPlayer) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetAdPlayer.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CacheWebViewAssets.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$19, reason: invalid class name */
        public static final class AnonymousClass19 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass19(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final n invoke() {
                return this.$moduleInstance.privacyFsmDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$190, reason: invalid class name */
        public static final class AnonymousClass190 extends f0 implements a {
            public static final AnonymousClass190 INSTANCE = new AnonymousClass190();

            public AnonymousClass190() {
                super(0);
            }

            @Override // kv.a
            public final HandleInvocationsFromAdViewer invoke() {
                return new HandleInvocationsFromAdViewer();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$191, reason: invalid class name */
        public static final class AnonymousClass191 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass191(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final LegacyLoadUseCase invoke() {
                return new LegacyLoadUseCase((Load) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Load.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AdRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CleanUpWhenOpportunityExpires.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$192, reason: invalid class name */
        public static final class AnonymousClass192 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass192(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final SafeCallbackInvoke invoke() {
                return new CommonSafeCallbackInvoke((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$193, reason: invalid class name */
        public static final class AnonymousClass193 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass193(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final InitializeStateNetworkError invoke() {
                return new InitializeStateNetworkError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$194, reason: invalid class name */
        public static final class AnonymousClass194 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass194(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CoroutineTimer invoke() {
                return new CommonCoroutineTimer((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$195, reason: invalid class name */
        public static final class AnonymousClass195 extends f0 implements a {
            public static final AnonymousClass195 INSTANCE = new AnonymousClass195();

            public AnonymousClass195() {
                super(0);
            }

            @Override // kv.a
            public final IEventSender invoke() {
                return SharedInstances.INSTANCE.getWebViewEventSender();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$196, reason: invalid class name */
        public static final class AnonymousClass196 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass196(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final SetGameId invoke() {
                return new CommonSetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$197, reason: invalid class name */
        public static final class AnonymousClass197 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass197(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetGameId invoke() {
                return new CommonGetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$198, reason: invalid class name */
        public static final class AnonymousClass198 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass198(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ValidateGameId invoke() {
                return new CommonValidateGameId((GetGameId) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetGameId.class))), (SetGameId) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SetGameId.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$199, reason: invalid class name */
        public static final class AnonymousClass199 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass199(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ShouldAllowInitialization invoke() {
                return new CommonShouldAllowInitialization((AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationState.class))), (SetInitializationState) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SetInitializationState.class))), (ValidateGameId) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ValidateGameId.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // kv.a
            public final CoroutineDispatcher invoke() {
                return this.$moduleInstance.mainDispatcher();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$20, reason: invalid class name */
        public static final class AnonymousClass20 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass20(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyFsmDataStore((n) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, c1.getOrCreateKotlinClass(n.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$200, reason: invalid class name */
        public static final class AnonymousClass200 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass200(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CheckForGameIdAndTestModeChanges invoke() {
                return new CommonCheckForGameIdAndTestModeChanges((GetGameId) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetGameId.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$201, reason: invalid class name */
        public static final class AnonymousClass201 extends f0 implements a {
            public static final AnonymousClass201 INSTANCE = new AnonymousClass201();

            public AnonymousClass201() {
                super(0);
            }

            @Override // kv.a
            public final DownloadPriorityQueue invoke() {
                return new DownloadPriorityQueue();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$202, reason: invalid class name */
        public static final class AnonymousClass202 extends f0 implements a {
            public static final AnonymousClass202 INSTANCE = new AnonymousClass202();

            public AnonymousClass202() {
                super(0);
            }

            @Override // kv.a
            public final CleanupDirectory invoke() {
                return new CleanupDirectory();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$203, reason: invalid class name */
        public static final class AnonymousClass203 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass203(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final FocusRepository invoke() {
                return new FocusRepository((AndroidGetLifecycleFlow) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidGetLifecycleFlow.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$204, reason: invalid class name */
        public static final class AnonymousClass204 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass204(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidGetIsAdActivity invoke() {
                return new AndroidGetIsAdActivity((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$205, reason: invalid class name */
        public static final class AnonymousClass205 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass205(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidGetLifecycleFlow invoke() {
                return new AndroidGetLifecycleFlow((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$206, reason: invalid class name */
        public static final class AnonymousClass206 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass206(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidHandleFocusCounters invoke() {
                return new AndroidHandleFocusCounters((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (FocusRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(FocusRepository.class))), (AndroidGetIsAdActivity) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidGetIsAdActivity.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), null, 16, null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$207, reason: invalid class name */
        public static final class AnonymousClass207 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass207(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final OfferwallAdapterBridge invoke() {
                return new OfferwallAdapterBridge((CoroutineScope) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$208, reason: invalid class name */
        public static final class AnonymousClass208 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass208(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final OfferwallManager invoke() {
                return new AndroidOfferwallManager((OfferwallAdapterBridge) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OfferwallAdapterBridge.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$209, reason: invalid class name */
        public static final class AnonymousClass209 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass209(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final LoadOfferwallAd invoke() {
                return new LoadOfferwallAd((OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OfferwallManager.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$21, reason: invalid class name */
        public static final class AnonymousClass21 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass21(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final n invoke() {
                return this.$moduleInstance.nativeConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$210, reason: invalid class name */
        public static final class AnonymousClass210 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass210(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetIsOfferwallAdReady invoke() {
                return new GetIsOfferwallAdReady((OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OfferwallManager.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$211, reason: invalid class name */
        public static final class AnonymousClass211 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass211(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final FIdDataSource invoke() {
                return new AndroidFIdDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$212, reason: invalid class name */
        public static final class AnonymousClass212 extends f0 implements a {
            public static final AnonymousClass212 INSTANCE = new AnonymousClass212();

            public AnonymousClass212() {
                super(0);
            }

            @Override // kv.a
            public final FIdExistenceDataSource invoke() {
                return new AndroidFIdExistenceDataSource(Constants.FID_CLASS);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$213, reason: invalid class name */
        public static final class AnonymousClass213 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass213(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CleanUpWhenOpportunityExpires invoke() {
                return new CleanUpWhenOpportunityExpires((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$214, reason: invalid class name */
        public static final class AnonymousClass214 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass214(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final OrientationRepository invoke() {
                return new OrientationRepository((AndroidGetLifecycleFlow) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidGetLifecycleFlow.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$215, reason: invalid class name */
        public static final class AnonymousClass215 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass215(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidAppSetIdDataSource invoke() {
                return new AndroidAppSetIdDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$216, reason: invalid class name */
        public static final class AnonymousClass216 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass216(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidUnityInfoDataSource invoke() {
                return new AndroidUnityInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$217, reason: invalid class name */
        public static final class AnonymousClass217 extends f0 implements a {
            public static final AnonymousClass217 INSTANCE = new AnonymousClass217();

            public AnonymousClass217() {
                super(0);
            }

            @Override // kv.a
            public final HandleDebugSettings invoke() {
                return new HandleDebugSettings();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$218, reason: invalid class name */
        public static final class AnonymousClass218 extends f0 implements a {
            public static final AnonymousClass218 INSTANCE = new AnonymousClass218();

            public AnonymousClass218() {
                super(0);
            }

            @Override // kv.a
            public final Logger invoke() {
                return new UnityLogger();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$219, reason: invalid class name */
        public static final class AnonymousClass219 extends f0 implements a {
            public static final AnonymousClass219 INSTANCE = new AnonymousClass219();

            public AnonymousClass219() {
                super(0);
            }

            @Override // kv.a
            public final IsBillingClientAvailable invoke() {
                return new IsBillingClientAvailable();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$22, reason: invalid class name */
        public static final class AnonymousClass22 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass22(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.nativeConfigurationDataStore((n) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, c1.getOrCreateKotlinClass(n.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$220, reason: invalid class name */
        public static final class AnonymousClass220 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass220(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final UnityBootConfigDataSource invoke() {
                return new AndroidUnityBootConfigDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$23, reason: invalid class name */
        public static final class AnonymousClass23 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass23(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final n invoke() {
                return this.$moduleInstance.glInfoDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (h) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, c1.getOrCreateKotlinClass(h.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$24, reason: invalid class name */
        public static final class AnonymousClass24 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass24(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.glInfoDataStore((n) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, c1.getOrCreateKotlinClass(n.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$25, reason: invalid class name */
        public static final class AnonymousClass25 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass25(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final n invoke() {
                return this.$moduleInstance.universalRequestDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$26, reason: invalid class name */
        public static final class AnonymousClass26 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass26(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final n invoke() {
                return this.$moduleInstance.iapTransactionDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$27, reason: invalid class name */
        public static final class AnonymousClass27 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass27(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.iapTransactionDataStore((n) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, c1.getOrCreateKotlinClass(n.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$28, reason: invalid class name */
        public static final class AnonymousClass28 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass28(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final n invoke() {
                return this.$moduleInstance.webViewConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$29, reason: invalid class name */
        public static final class AnonymousClass29 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass29(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AsyncTokenStorage invoke() {
                return this.$moduleInstance.asyncTokenStorage((TokenStorage) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SDKMetricsSender.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // kv.a
            public final CoroutineDispatcher invoke() {
                return this.$moduleInstance.defaultDispatcher();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$30, reason: invalid class name */
        public static final class AnonymousClass30 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass30(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final VolumeChangeMonitor invoke() {
                return this.$moduleInstance.volumeChangeMonitor((VolumeChange) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(VolumeChange.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$31, reason: invalid class name */
        public static final class AnonymousClass31 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass31(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // kv.a
            public final JsonStorage invoke() {
                return this.$moduleInstance.publicJsonStorage();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$32, reason: invalid class name */
        public static final class AnonymousClass32 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass32(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // kv.a
            public final JsonStorage invoke() {
                return this.$moduleInstance.privateJsonStorage();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$33, reason: invalid class name */
        public static final class AnonymousClass33 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass33(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // kv.a
            public final JsonStorage invoke() {
                return this.$moduleInstance.memoryJsonStorage();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$34, reason: invalid class name */
        public static final class AnonymousClass34 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass34(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // kv.a
            public final NativeConfigurationOuterClass.NativeConfiguration invoke() {
                return this.$moduleInstance.defaultNativeConfiguration();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$35, reason: invalid class name */
        public static final class AnonymousClass35 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass35(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final MeasurementsService invoke() {
                return this.$moduleInstance.measurementService((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$36, reason: invalid class name */
        public static final class AnonymousClass36 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass36(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final TopicsService invoke() {
                return this.$moduleInstance.topicsService((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$37, reason: invalid class name */
        public static final class AnonymousClass37 extends f0 implements a {
            public static final AnonymousClass37 INSTANCE = new AnonymousClass37();

            public AnonymousClass37() {
                super(0);
            }

            @Override // kv.a
            public final CronetEngineBuilderFactory invoke() {
                return new CronetEngineBuilderFactory();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$38, reason: invalid class name */
        public static final class AnonymousClass38 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass38(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final HttpClientProvider invoke() {
                return new AndroidHttpClientProvider((ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AlternativeFlowReader.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (CronetEngineBuilderFactory) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CronetEngineBuilderFactory.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (CleanupDirectory) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CleanupDirectory.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(MediationTraitsMetadataReader.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39, reason: invalid class name */
        public static final class AnonymousClass39 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1", f = "ServiceProvider.kt", i = {}, l = {460}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1, reason: invalid class name and collision with other inner class name */
            public static final class C05501 extends bv.n implements p {
                final /* synthetic */ ServicesRegistry $this_registry;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05501(ServicesRegistry servicesRegistry, d<? super C05501> dVar) {
                    super(2, dVar);
                    this.$this_registry = servicesRegistry;
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    return new C05501(this.$this_registry, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0.throwOnFailure(obj);
                        return obj;
                    }
                    a0.throwOnFailure(obj);
                    HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HttpClientProvider.class)));
                    this.label = 1;
                    Object objInvoke$default = HttpClientProvider.DefaultImpls.invoke$default(httpClientProvider, false, this, 1, null);
                    return objInvoke$default == coroutine_suspended ? coroutine_suspended : objInvoke$default;
                }

                @Override // kv.p
                public final Object invoke(CoroutineScope coroutineScope, d<? super HttpClient> dVar) {
                    return ((C05501) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass39(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final HttpClient invoke() {
                return (HttpClient) BuildersKt__BuildersKt.runBlocking$default(null, new C05501(this.$this_registry, null), 1, null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // kv.a
            public final CoroutineDispatcher invoke() {
                return this.$moduleInstance.ioDispatcher();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$40, reason: invalid class name */
        public static final class AnonymousClass40 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$40$1", f = "ServiceProvider.kt", i = {}, l = {461}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$40$1, reason: invalid class name and collision with other inner class name */
            public static final class C05511 extends bv.n implements p {
                final /* synthetic */ ServicesRegistry $this_registry;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05511(ServicesRegistry servicesRegistry, d<? super C05511> dVar) {
                    super(2, dVar);
                    this.$this_registry = servicesRegistry;
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    return new C05511(this.$this_registry, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0.throwOnFailure(obj);
                        return obj;
                    }
                    a0.throwOnFailure(obj);
                    HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HttpClientProvider.class)));
                    this.label = 1;
                    Object objInvoke = httpClientProvider.invoke(true, this);
                    return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
                }

                @Override // kv.p
                public final Object invoke(CoroutineScope coroutineScope, d<? super HttpClient> dVar) {
                    return ((C05511) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass40(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final HttpClient invoke() {
                return (HttpClient) BuildersKt__BuildersKt.runBlocking$default(null, new C05511(this.$this_registry, null), 1, null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$41, reason: invalid class name */
        public static final class AnonymousClass41 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass41(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final MediationTraitsMetadataReader invoke() {
                return new MediationTraitsMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", c1.getOrCreateKotlinClass(JsonStorage.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$42, reason: invalid class name */
        public static final class AnonymousClass42 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass42(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AlternativeFlowReader invoke() {
                return new CommonAlternativeFlowReader((ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ConfigurationReader.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(MediationTraitsMetadataReader.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$43, reason: invalid class name */
        public static final class AnonymousClass43 extends f0 implements a {
            public static final AnonymousClass43 INSTANCE = new AnonymousClass43();

            public AnonymousClass43() {
                super(0);
            }

            @Override // kv.a
            public final TcfDataSource invoke() {
                return new AndroidTcfDataSource();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$44, reason: invalid class name */
        public static final class AnonymousClass44 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass44(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final TcfRepository invoke() {
                return new AndroidTcfRepository((TcfDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(TcfDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$45, reason: invalid class name */
        public static final class AnonymousClass45 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass45(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidManifestIntPropertyReader invoke() {
                return new AndroidManifestIntPropertyReader((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$46, reason: invalid class name */
        public static final class AnonymousClass46 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass46(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final AndroidTestDataInfo invoke() {
                return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidManifestIntPropertyReader.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$47, reason: invalid class name */
        public static final class AnonymousClass47 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass47(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GameServerIdReader invoke() {
                return new GameServerIdReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", c1.getOrCreateKotlinClass(JsonStorage.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$48, reason: invalid class name */
        public static final class AnonymousClass48 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass48(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final StoreDataSource invoke() {
                return new AndroidStoreDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$49, reason: invalid class name */
        public static final class AnonymousClass49 extends f0 implements a {
            public static final AnonymousClass49 INSTANCE = new AnonymousClass49();

            public AnonymousClass49() {
                super(0);
            }

            @Override // kv.a
            public final AnalyticsDataSource invoke() {
                return new AndroidAnalyticsDataSource();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // kv.a
            public final ISDKDispatchers invoke() {
                return this.$moduleInstance.sdkDispatchers();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$50, reason: invalid class name */
        public static final class AnonymousClass50 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass50(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final DeveloperConsentDataSource invoke() {
                return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, c1.getOrCreateKotlinClass(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", c1.getOrCreateKotlinClass(JsonStorage.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$51, reason: invalid class name */
        public static final class AnonymousClass51 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass51(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final DynamicDeviceInfoDataSource invoke() {
                return new AndroidDynamicDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(LifecycleDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$52, reason: invalid class name */
        public static final class AnonymousClass52 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass52(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final LegacyUserConsentDataSource invoke() {
                return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, c1.getOrCreateKotlinClass(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PRIVATE", c1.getOrCreateKotlinClass(JsonStorage.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$53, reason: invalid class name */
        public static final class AnonymousClass53 extends f0 implements a {
            public static final AnonymousClass53 INSTANCE = new AnonymousClass53();

            public AnonymousClass53() {
                super(0);
            }

            @Override // kv.a
            public final LifecycleDataSource invoke() {
                return new AndroidLifecycleDataSource();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$54, reason: invalid class name */
        public static final class AnonymousClass54 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass54(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CacheDataSource invoke() {
                return new AndroidLocalCacheDataSource((CreateFile) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetFileExtensionFromUrl.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$55, reason: invalid class name */
        public static final class AnonymousClass55 extends f0 implements a {
            public static final AnonymousClass55 INSTANCE = new AnonymousClass55();

            public AnonymousClass55() {
                super(0);
            }

            @Override // kv.a
            public final CreateFile invoke() {
                return new CommonCreateFile();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$56, reason: invalid class name */
        public static final class AnonymousClass56 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass56(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetFileExtensionFromUrl invoke() {
                return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(RemoveUrlQuery.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$57, reason: invalid class name */
        public static final class AnonymousClass57 extends f0 implements a {
            public static final AnonymousClass57 INSTANCE = new AnonymousClass57();

            public AnonymousClass57() {
                super(0);
            }

            @Override // kv.a
            public final RemoveUrlQuery invoke() {
                return new AndroidRemoveUrlQuery();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$58, reason: invalid class name */
        public static final class AnonymousClass58 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass58(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final MediationDataSource invoke() {
                return new AndroidMediationDataSource((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", c1.getOrCreateKotlinClass(JsonStorage.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$59, reason: invalid class name */
        public static final class AnonymousClass59 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass59(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final PrivacyDeviceInfoDataSource invoke() {
                return new AndroidPrivacyDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (FIdDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(FIdDataSource.class))), (AndroidAppSetIdDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidAppSetIdDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$6, reason: invalid class name */
        public static final class AnonymousClass6 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // kv.a
            public final SDKMetricsSender invoke() {
                return this.$moduleInstance.sdkMetrics();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$60, reason: invalid class name */
        public static final class AnonymousClass60 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass60(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CacheDataSource invoke() {
                return new AndroidRemoteCacheDataSource((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetFileExtensionFromUrl.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HttpClient.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$61, reason: invalid class name */
        public static final class AnonymousClass61 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass61(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final StaticDeviceInfoDataSource invoke() {
                return new AndroidStaticDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, c1.getOrCreateKotlinClass(ByteStringDataSource.class))), (AnalyticsDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AnalyticsDataSource.class))), (StoreDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(StoreDataSource.class))), (UnityBootConfigDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(UnityBootConfigDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$62, reason: invalid class name */
        public static final class AnonymousClass62 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass62(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final h invoke() {
                return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetOpenGLRendererInfo.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$63, reason: invalid class name */
        public static final class AnonymousClass63 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass63(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final UniversalRequestDataSource invoke() {
                return new UniversalRequestDataSource((n) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, c1.getOrCreateKotlinClass(n.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$64, reason: invalid class name */
        public static final class AnonymousClass64 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass64(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final WebviewConfigurationDataSource invoke() {
                return new WebviewConfigurationDataSource((n) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, c1.getOrCreateKotlinClass(n.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$65, reason: invalid class name */
        public static final class AnonymousClass65 extends f0 implements a {
            public static final AnonymousClass65 INSTANCE = new AnonymousClass65();

            public AnonymousClass65() {
                super(0);
            }

            @Override // kv.a
            public final OmidManager invoke() {
                return new AndroidOmidManager();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$66, reason: invalid class name */
        public static final class AnonymousClass66 extends f0 implements a {
            public static final AnonymousClass66 INSTANCE = new AnonymousClass66();

            public AnonymousClass66() {
                super(0);
            }

            @Override // kv.a
            public final SDKPropertiesManager invoke() {
                return new AndroidSDKPropertiesManager();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$67, reason: invalid class name */
        public static final class AnonymousClass67 extends f0 implements a {
            public static final AnonymousClass67 INSTANCE = new AnonymousClass67();

            public AnonymousClass67() {
                super(0);
            }

            @Override // kv.a
            public final StorageManager invoke() {
                return new AndroidStorageManager();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$68, reason: invalid class name */
        public static final class AnonymousClass68 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass68(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final BillingClientAdapter invoke() {
                return new BillingClientAdapterFactory().createBillingClientAdapter((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$69, reason: invalid class name */
        public static final class AnonymousClass69 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass69(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ProductDetailsFetcher invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                KClass orCreateKotlinClass = c1.getOrCreateKotlinClass(BillingClientAdapter.class);
                String str = PcrIk.NMWpNgpvOrDqiR;
                return new ProductDetailsFetcherWithFallback(new CommonProductDetailsFetcher((BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey(str, orCreateKotlinClass)), "inapp"), new CommonProductDetailsFetcher((BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey(str, c1.getOrCreateKotlinClass(BillingClientAdapter.class))), "subs"));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$7, reason: invalid class name */
        public static final class AnonymousClass7 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CoroutineScope invoke() {
                return this.$moduleInstance.initCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey("sdk", c1.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, c1.getOrCreateKotlinClass(Job.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$70, reason: invalid class name */
        public static final class AnonymousClass70 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass70(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final TransactionEventManager invoke() {
                return new TransactionEventManager((CoroutineScope) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class))), (BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(BillingClientAdapter.class))), (GetTransactionData) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetTransactionData.class))), (GetTransactionRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetTransactionRequest.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(TransactionEventRepository.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, c1.getOrCreateKotlinClass(ByteStringDataSource.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (IsBillingClientAvailable) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(IsBillingClientAvailable.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (ProductDetailsFetcher) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ProductDetailsFetcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$71, reason: invalid class name */
        public static final class AnonymousClass71 extends f0 implements a {
            public static final AnonymousClass71 INSTANCE = new AnonymousClass71();

            public AnonymousClass71() {
                super(0);
            }

            @Override // kv.a
            public final AdRepository invoke() {
                return new AndroidAdRepository();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$72, reason: invalid class name */
        public static final class AnonymousClass72 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass72(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CacheRepository invoke() {
                return new AndroidCacheRepository((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (GetCacheDirectory) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetCacheDirectory.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey("local", c1.getOrCreateKotlinClass(CacheDataSource.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, c1.getOrCreateKotlinClass(CacheDataSource.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (CleanupDirectory) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CleanupDirectory.class))), (DownloadPriorityQueue) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DownloadPriorityQueue.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CreateFile.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$73, reason: invalid class name */
        public static final class AnonymousClass73 extends f0 implements a {
            public static final AnonymousClass73 INSTANCE = new AnonymousClass73();

            public AnonymousClass73() {
                super(0);
            }

            @Override // kv.a
            public final GetCacheDirectory invoke() {
                return new CommonGetCacheDirectory();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$74, reason: invalid class name */
        public static final class AnonymousClass74 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass74(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CampaignRepository invoke() {
                return new AndroidCampaignRepository((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetSharedDataTimestamps.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$75, reason: invalid class name */
        public static final class AnonymousClass75 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass75(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final DeveloperConsentRepository invoke() {
                return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeveloperConsentDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$76, reason: invalid class name */
        public static final class AnonymousClass76 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass76(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final DeviceInfoRepository invoke() {
                return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(PrivacyDeviceInfoDataSource.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$77, reason: invalid class name */
        public static final class AnonymousClass77 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass77(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final DiagnosticEventRepository invoke() {
                return new AndroidDiagnosticEventRepository((CoroutineTimer) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CoroutineTimer.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetDiagnosticEventRequest.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$78, reason: invalid class name */
        public static final class AnonymousClass78 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass78(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final LegacyUserConsentRepository invoke() {
                return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(LegacyUserConsentDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$79, reason: invalid class name */
        public static final class AnonymousClass79 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass79(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final MediationRepository invoke() {
                return new AndroidMediationRepository((MediationDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(MediationDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$8, reason: invalid class name */
        public static final class AnonymousClass8 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CoroutineScope invoke() {
                return this.$moduleInstance.loadCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey("sdk", c1.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, c1.getOrCreateKotlinClass(Job.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$80, reason: invalid class name */
        public static final class AnonymousClass80 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass80(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final OpenMeasurementRepository invoke() {
                return new AndroidOpenMeasurementRepository((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OmidManager.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$81, reason: invalid class name */
        public static final class AnonymousClass81 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass81(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final SessionRepository invoke() {
                return new AndroidSessionRepository((ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, c1.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, c1.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, c1.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, c1.getOrCreateKotlinClass(ByteStringDataSource.class))), (AndroidUnityInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidUnityInfoDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class))), (CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$82, reason: invalid class name */
        public static final class AnonymousClass82 extends f0 implements a {
            public static final AnonymousClass82 INSTANCE = new AnonymousClass82();

            public AnonymousClass82() {
                super(0);
            }

            @Override // kv.a
            public final TransactionEventRepository invoke() {
                return new AndroidTransactionEventRepository();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$83, reason: invalid class name */
        public static final class AnonymousClass83 extends f0 implements a {
            public static final AnonymousClass83 INSTANCE = new AnonymousClass83();

            public AnonymousClass83() {
                super(0);
            }

            @Override // kv.a
            public final OperativeEventRepository invoke() {
                return new OperativeEventRepository();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$84, reason: invalid class name */
        public static final class AnonymousClass84 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass84(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final ExecuteAdViewerRequest invoke() {
                return new AndroidExecuteAdViewerRequest((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(HttpClient.class))), (GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetCachedAsset.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$85, reason: invalid class name */
        public static final class AnonymousClass85 extends f0 implements a {
            public static final AnonymousClass85 INSTANCE = new AnonymousClass85();

            public AnonymousClass85() {
                super(0);
            }

            @Override // kv.a
            public final GetByteStringId invoke() {
                return new AndroidGenerateByteStringId();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$86, reason: invalid class name */
        public static final class AnonymousClass86 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass86(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final HandleOpenUrl invoke() {
                return new AndroidHandleOpenUrl((Context) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$87, reason: invalid class name */
        public static final class AnonymousClass87 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass87(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final Refresh invoke() {
                return new AndroidRefresh((CoroutineDispatcher) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class))), (GetAdDataRefreshRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetAdDataRefreshRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, c1.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GatewayClient.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$88, reason: invalid class name */
        public static final class AnonymousClass88 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass88(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final SendDiagnosticEvent invoke() {
                return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetDiagnosticEventRequest.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(LifecycleDataSource.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$89, reason: invalid class name */
        public static final class AnonymousClass89 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass89(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final SendWebViewClientErrorDiagnostics invoke() {
                return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$9, reason: invalid class name */
        public static final class AnonymousClass9 extends f0 implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CoroutineScope invoke() {
                return this.$moduleInstance.showCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) this.$this_registry.resolveService(new ServiceKey("sdk", c1.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, c1.getOrCreateKotlinClass(Job.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$90, reason: invalid class name */
        public static final class AnonymousClass90 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass90(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final Show invoke() {
                return new AndroidShow((AdRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AdRepository.class))), (GameServerIdReader) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GameServerIdReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$91, reason: invalid class name */
        public static final class AnonymousClass91 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass91(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CacheFile invoke() {
                return new CommonCacheFile((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$92, reason: invalid class name */
        public static final class AnonymousClass92 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass92(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final CleanAssets invoke() {
                return new CommonCleanAssets((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$93, reason: invalid class name */
        public static final class AnonymousClass93 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass93(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetAdObject invoke() {
                return new CommonGetAdObject((AdRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AdRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$94, reason: invalid class name */
        public static final class AnonymousClass94 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass94(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetHeaderBiddingToken invoke() {
                return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(FetchSignalsAndSendUseCase.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$95, reason: invalid class name */
        public static final class AnonymousClass95 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass95(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final BuildHeaderBiddingToken invoke() {
                return new AndroidBuildHeaderBiddingToken((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetByteStringId.class))), (GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetClientInfo.class))), (GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetLimitedSessionToken.class))), (GetInitializationData) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationData.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(CampaignRepository.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(TcfRepository.class))), (AndroidTestDataInfo) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidTestDataInfo.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(OfferwallManager.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$96, reason: invalid class name */
        public static final class AnonymousClass96 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass96(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final TokenNumberProvider invoke() {
                return new CommonTokenNumberProvider((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$97, reason: invalid class name */
        public static final class AnonymousClass97 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass97(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetInitializationData invoke() {
                return new AndroidGetInitializationData((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestSharedData.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$98, reason: invalid class name */
        public static final class AnonymousClass98 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass98(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final MediationInitBlobMetadataReader invoke() {
                return new MediationInitBlobMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", c1.getOrCreateKotlinClass(JsonStorage.class))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$99, reason: invalid class name */
        public static final class AnonymousClass99 extends f0 implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass99(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // kv.a
            public final GetInitializationRequestPayload invoke() {
                return new AndroidGetInitializationRequestPayload((GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(GetClientInfo.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class))), (LegacyUserConsentRepository) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) this.$this_registry.resolveService(new ServiceKey("", c1.getOrCreateKotlinClass(MediationInitBlobMetadataReader.class))));
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ServicesRegistry) obj);
            return x0.f87415a;
        }

        public final void invoke(ServicesRegistry registry) {
            e0.checkNotNullParameter(registry, "$this$registry");
            UnityAdsModule unityAdsModule = new UnityAdsModule();
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(Context.class)), q.lazy(C05491.INSTANCE));
            registry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class)), q.lazy(new AnonymousClass2(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class)), q.lazy(new AnonymousClass3(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, c1.getOrCreateKotlinClass(CoroutineDispatcher.class)), q.lazy(new AnonymousClass4(unityAdsModule)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(ISDKDispatchers.class)), q.lazy(new AnonymousClass5(unityAdsModule)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(SDKMetricsSender.class)), q.lazy(new AnonymousClass6(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass7(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass8(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass9(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass10(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass11(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass12(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass13(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, c1.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass14(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, c1.getOrCreateKotlinClass(Job.class)), ServiceFactoryKt.factoryOf(new AnonymousClass15(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, c1.getOrCreateKotlinClass(ByteStringDataSource.class)), q.lazy(new AnonymousClass16(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, c1.getOrCreateKotlinClass(n.class)), q.lazy(new AnonymousClass17(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, c1.getOrCreateKotlinClass(ByteStringDataSource.class)), q.lazy(new AnonymousClass18(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, c1.getOrCreateKotlinClass(n.class)), q.lazy(new AnonymousClass19(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, c1.getOrCreateKotlinClass(ByteStringDataSource.class)), q.lazy(new AnonymousClass20(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, c1.getOrCreateKotlinClass(n.class)), q.lazy(new AnonymousClass21(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, c1.getOrCreateKotlinClass(ByteStringDataSource.class)), q.lazy(new AnonymousClass22(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, c1.getOrCreateKotlinClass(n.class)), q.lazy(new AnonymousClass23(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, c1.getOrCreateKotlinClass(ByteStringDataSource.class)), q.lazy(new AnonymousClass24(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, c1.getOrCreateKotlinClass(n.class)), q.lazy(new AnonymousClass25(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, c1.getOrCreateKotlinClass(n.class)), q.lazy(new AnonymousClass26(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, c1.getOrCreateKotlinClass(ByteStringDataSource.class)), q.lazy(new AnonymousClass27(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, c1.getOrCreateKotlinClass(n.class)), q.lazy(new AnonymousClass28(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AsyncTokenStorage.class)), q.lazy(new AnonymousClass29(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(VolumeChangeMonitor.class)), q.lazy(new AnonymousClass30(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("PUBLIC", c1.getOrCreateKotlinClass(JsonStorage.class)), q.lazy(new AnonymousClass31(unityAdsModule)));
            registry.updateService(new ServiceKey("PRIVATE", c1.getOrCreateKotlinClass(JsonStorage.class)), q.lazy(new AnonymousClass32(unityAdsModule)));
            AnonymousClass33 anonymousClass33 = new AnonymousClass33(unityAdsModule);
            registry.updateService(new ServiceKey(QCmNMSGd.aAhsjOp, c1.getOrCreateKotlinClass(JsonStorage.class)), q.lazy(anonymousClass33));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class)), q.lazy(new AnonymousClass34(unityAdsModule)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(MeasurementsService.class)), q.lazy(new AnonymousClass35(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(TopicsService.class)), q.lazy(new AnonymousClass36(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CronetEngineBuilderFactory.class)), q.lazy(AnonymousClass37.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(HttpClientProvider.class)), q.lazy(new AnonymousClass38(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(HttpClient.class)), q.lazy(new AnonymousClass39(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_GATEWAY_HTTP_CLIENT, c1.getOrCreateKotlinClass(HttpClient.class)), q.lazy(new AnonymousClass40(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new AnonymousClass41(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AlternativeFlowReader.class)), q.lazy(new AnonymousClass42(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(TcfDataSource.class)), q.lazy(AnonymousClass43.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(TcfRepository.class)), q.lazy(new AnonymousClass44(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidManifestIntPropertyReader.class)), q.lazy(new AnonymousClass45(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidTestDataInfo.class)), q.lazy(new AnonymousClass46(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GameServerIdReader.class)), q.lazy(new AnonymousClass47(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(StoreDataSource.class)), q.lazy(new AnonymousClass48(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AnalyticsDataSource.class)), q.lazy(AnonymousClass49.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(DeveloperConsentDataSource.class)), q.lazy(new AnonymousClass50(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(DynamicDeviceInfoDataSource.class)), q.lazy(new AnonymousClass51(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(LegacyUserConsentDataSource.class)), q.lazy(new AnonymousClass52(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(LifecycleDataSource.class)), q.lazy(AnonymousClass53.INSTANCE));
            registry.updateService(new ServiceKey("local", c1.getOrCreateKotlinClass(CacheDataSource.class)), q.lazy(new AnonymousClass54(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CreateFile.class)), q.lazy(AnonymousClass55.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetFileExtensionFromUrl.class)), q.lazy(new AnonymousClass56(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(RemoveUrlQuery.class)), q.lazy(AnonymousClass57.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(MediationDataSource.class)), q.lazy(new AnonymousClass58(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(PrivacyDeviceInfoDataSource.class)), q.lazy(new AnonymousClass59(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, c1.getOrCreateKotlinClass(CacheDataSource.class)), q.lazy(new AnonymousClass60(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(StaticDeviceInfoDataSource.class)), q.lazy(new AnonymousClass61(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, c1.getOrCreateKotlinClass(h.class)), q.lazy(new AnonymousClass62(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(UniversalRequestDataSource.class)), q.lazy(new AnonymousClass63(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(WebviewConfigurationDataSource.class)), q.lazy(new AnonymousClass64(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(OmidManager.class)), q.lazy(AnonymousClass65.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(SDKPropertiesManager.class)), q.lazy(AnonymousClass66.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(StorageManager.class)), q.lazy(AnonymousClass67.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(BillingClientAdapter.class)), q.lazy(new AnonymousClass68(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(ProductDetailsFetcher.class)), q.lazy(new AnonymousClass69(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(TransactionEventManager.class)), q.lazy(new AnonymousClass70(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AdRepository.class)), q.lazy(AnonymousClass71.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CacheRepository.class)), q.lazy(new AnonymousClass72(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetCacheDirectory.class)), q.lazy(AnonymousClass73.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CampaignRepository.class)), q.lazy(new AnonymousClass74(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(DeveloperConsentRepository.class)), q.lazy(new AnonymousClass75(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(DeviceInfoRepository.class)), q.lazy(new AnonymousClass76(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(DiagnosticEventRepository.class)), q.lazy(new AnonymousClass77(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(LegacyUserConsentRepository.class)), q.lazy(new AnonymousClass78(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(MediationRepository.class)), q.lazy(new AnonymousClass79(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(OpenMeasurementRepository.class)), q.lazy(new AnonymousClass80(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(SessionRepository.class)), q.lazy(new AnonymousClass81(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(TransactionEventRepository.class)), q.lazy(AnonymousClass82.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(OperativeEventRepository.class)), q.lazy(AnonymousClass83.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)), q.lazy(new AnonymousClass84(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetByteStringId.class)), q.lazy(AnonymousClass85.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleOpenUrl.class)), q.lazy(new AnonymousClass86(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(Refresh.class)), q.lazy(new AnonymousClass87(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(SendDiagnosticEvent.class)), q.lazy(new AnonymousClass88(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(SendWebViewClientErrorDiagnostics.class)), q.lazy(new AnonymousClass89(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(Show.class)), q.lazy(new AnonymousClass90(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CacheFile.class)), q.lazy(new AnonymousClass91(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CleanAssets.class)), q.lazy(new AnonymousClass92(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetAdObject.class)), q.lazy(new AnonymousClass93(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass94(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass95(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new AnonymousClass96(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationData.class)), q.lazy(new AnonymousClass97(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new AnonymousClass98(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationRequestPayload.class)), q.lazy(new AnonymousClass99(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationState.class)), q.lazy(new AnonymousClass100(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetIsFileCache.class)), q.lazy(new AnonymousClass101(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(SetInitializationState.class)), q.lazy(new AnonymousClass102(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, c1.getOrCreateKotlinClass(GetRequestPolicy.class)), q.lazy(new AnonymousClass103(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetAdDataRefreshRequest.class)), q.lazy(new AnonymousClass104(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetAdPlayerConfigRequest.class)), q.lazy(new AnonymousClass105(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidGetAdPlayerContext.class)), q.lazy(new AnonymousClass106(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetAdRequest.class)), q.lazy(new AnonymousClass107(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetHbTokenEventRequest.class)), q.lazy(AnonymousClass108.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CommonScarEventReceiver.class)), q.lazy(new AnonymousClass109(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GMAScarAdapterBridge.class)), q.lazy(new AnonymousClass110(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(ScarTimeHackFixer.class)), q.lazy(new AnonymousClass111(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(ScarManager.class)), q.lazy(new AnonymousClass112(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(FetchSignalsAndSendUseCase.class)), q.lazy(new AnonymousClass113(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(LoadScarAd.class)), q.lazy(new AnonymousClass114(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleGetTokenRequest.class)), q.lazy(new AnonymousClass115(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetClientInfo.class)), q.lazy(new AnonymousClass116(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationCompletedRequest.class)), q.lazy(new AnonymousClass117(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetInitializationRequest.class)), q.lazy(new AnonymousClass118(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetLimitedSessionToken.class)), q.lazy(new AnonymousClass119(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetOpenGLRendererInfo.class)), q.lazy(new AnonymousClass120(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetSharedDataTimestamps.class)), q.lazy(AnonymousClass121.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class)), q.lazy(new AnonymousClass122(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetUniversalRequestSharedData.class)), q.lazy(new AnonymousClass123(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetCachedAsset.class)), q.lazy(new AnonymousClass124(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetWebViewBridgeUseCase.class)), q.lazy(new AnonymousClass125(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, c1.getOrCreateKotlinClass(GetRequestPolicy.class)), q.lazy(new AnonymousClass126(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetLatestWebViewConfiguration.class)), q.lazy(new AnonymousClass127(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, c1.getOrCreateKotlinClass(GetRequestPolicy.class)), q.lazy(new AnonymousClass128(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, c1.getOrCreateKotlinClass(GetRequestPolicy.class)), q.lazy(new AnonymousClass129(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetPrivacyUpdateRequest.class)), q.lazy(new AnonymousClass130(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleGatewayInitializationResponse.class)), q.lazy(new AnonymousClass131(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleGatewayUniversalResponse.class)), q.lazy(new AnonymousClass132(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeBoldSDK.class)), q.lazy(new AnonymousClass133(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass134(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(SendPrivacyUpdateRequest.class)), q.lazy(new AnonymousClass135(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(TriggerInitializationCompletedRequest.class)), q.lazy(new AnonymousClass136(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(TriggerInitializeListener.class)), q.lazy(new AnonymousClass137(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(DiagnosticEventObserver.class)), q.lazy(new AnonymousClass138(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(EventObservers.class)), q.lazy(new AnonymousClass139(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetTransactionData.class)), q.lazy(new AnonymousClass140(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetTransactionRequest.class)), q.lazy(new AnonymousClass141(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetDiagnosticEventBatchRequest.class)), q.lazy(AnonymousClass142.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetDiagnosticEventRequest.class)), q.lazy(new AnonymousClass143(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetOperativeEventApi.class)), q.lazy(new AnonymousClass144(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetOperativeEventRequest.class)), q.lazy(new AnonymousClass145(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleGatewayEventResponse.class)), q.lazy(AnonymousClass146.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(OperativeEventObserver.class)), q.lazy(new AnonymousClass147(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(TransactionEventObserver.class)), q.lazy(new AnonymousClass148(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(UniversalRequestTtlValidator.class)), q.lazy(AnonymousClass149.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(UniversalRequestEventSender.class)), q.lazy(new AnonymousClass150(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(OmFinishSession.class)), q.lazy(new AnonymousClass151(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(OmImpressionOccurred.class)), q.lazy(new AnonymousClass152(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidOmInteraction.class)), q.lazy(new AnonymousClass153(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetOmData.class)), q.lazy(new AnonymousClass154(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(IsOMActivated.class)), q.lazy(new AnonymousClass155(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeOMSDK.class)), q.lazy(new AnonymousClass156(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, c1.getOrCreateKotlinClass(FlattenerRulesUseCase.class)), q.lazy(AnonymousClass157.INSTANCE));
            registry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, c1.getOrCreateKotlinClass(FlattenerRulesUseCase.class)), q.lazy(AnonymousClass158.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(BackgroundWorker.class)), q.lazy(new AnonymousClass159(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(DiagnosticEventRequestWorkModifier.class)), q.lazy(new AnonymousClass160(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GatewayClient.class)), q.lazy(new AnonymousClass161(registry)));
            registry.updateService(new ServiceKey("sdk", c1.getOrCreateKotlinClass(CoroutineExceptionHandler.class)), q.lazy(new AnonymousClass162(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(TokenStorage.class)), q.lazy(AnonymousClass163.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(VolumeChange.class)), q.lazy(AnonymousClass164.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class)), q.lazy(new AnonymousClass165(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeSDK.class)), q.lazy(new AnonymousClass166(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateComplete.class)), q.lazy(new AnonymousClass167(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateConfig.class)), q.lazy(new AnonymousClass168(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateConfigWithLoader.class)), q.lazy(new AnonymousClass169(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateCreate.class)), q.lazy(new AnonymousClass170(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateError.class)), q.lazy(new AnonymousClass171(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateLoadCache.class)), q.lazy(new AnonymousClass172(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateLoadWeb.class)), q.lazy(new AnonymousClass173(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateReset.class)), q.lazy(new AnonymousClass174(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(StoreMonitor.class)), q.lazy(new AnonymousClass175(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(StoreWebViewEventSender.class)), q.lazy(new AnonymousClass176(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(StoreExceptionHandler.class)), q.lazy(AnonymousClass177.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(StoreEventListenerFactory.class)), q.lazy(new AnonymousClass178(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(ConfigurationReader.class)), q.lazy(AnonymousClass179.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidAttribution.class)), q.lazy(new AnonymousClass180(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass181(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new AnonymousClass182(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass183(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(Load.class)), ServiceFactoryKt.factoryOf(new AnonymousClass184(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new AnonymousClass185(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass186(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass187(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CacheWebViewAssets.class)), q.lazy(new AnonymousClass188(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new AnonymousClass189(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(AnonymousClass190.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass191(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(SafeCallbackInvoke.class)), q.lazy(new AnonymousClass192(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new AnonymousClass193(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass194(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(IEventSender.class)), q.lazy(AnonymousClass195.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(SetGameId.class)), q.lazy(new AnonymousClass196(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetGameId.class)), q.lazy(new AnonymousClass197(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(ValidateGameId.class)), q.lazy(new AnonymousClass198(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(ShouldAllowInitialization.class)), q.lazy(new AnonymousClass199(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CheckForGameIdAndTestModeChanges.class)), q.lazy(new AnonymousClass200(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(DownloadPriorityQueue.class)), q.lazy(AnonymousClass201.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CleanupDirectory.class)), q.lazy(AnonymousClass202.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(FocusRepository.class)), q.lazy(new AnonymousClass203(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidGetIsAdActivity.class)), q.lazy(new AnonymousClass204(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidGetLifecycleFlow.class)), q.lazy(new AnonymousClass205(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidHandleFocusCounters.class)), q.lazy(new AnonymousClass206(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(OfferwallAdapterBridge.class)), q.lazy(new AnonymousClass207(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(OfferwallManager.class)), q.lazy(new AnonymousClass208(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(LoadOfferwallAd.class)), q.lazy(new AnonymousClass209(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(GetIsOfferwallAdReady.class)), q.lazy(new AnonymousClass210(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(FIdDataSource.class)), q.lazy(new AnonymousClass211(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(FIdExistenceDataSource.class)), q.lazy(AnonymousClass212.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(CleanUpWhenOpportunityExpires.class)), q.lazy(new AnonymousClass213(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(OrientationRepository.class)), q.lazy(new AnonymousClass214(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidAppSetIdDataSource.class)), q.lazy(new AnonymousClass215(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(AndroidUnityInfoDataSource.class)), q.lazy(new AnonymousClass216(registry)));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(HandleDebugSettings.class)), q.lazy(AnonymousClass217.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(Logger.class)), q.lazy(AnonymousClass218.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(IsBillingClientAvailable.class)), q.lazy(AnonymousClass219.INSTANCE));
            registry.updateService(new ServiceKey("", c1.getOrCreateKotlinClass(UnityBootConfigDataSource.class)), q.lazy(new AnonymousClass220(registry)));
        }
    }

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(AnonymousClass1.INSTANCE);
    }
}
