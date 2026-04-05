package com.unity3d.services.core.di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import be.nVUQ.UupKET;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import java.io.File;
import k4.h;
import k4.n;
import k4.o;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kv.a;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UnityAdsModule {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.core.di.UnityAdsModule$glInfoDataStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kv.a
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_GL_INFO);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.core.di.UnityAdsModule$provideByteStringDataStore$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38521 extends f0 implements a {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $dataStoreFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38521(Context context, String str) {
            super(0);
            this.$context = context;
            this.$dataStoreFile = str;
        }

        @Override // kv.a
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, this.$dataStoreFile);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.core.di.UnityAdsModule$universalRequestDataStore$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38531 extends f0 implements a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38531(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kv.a
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.core.di.UnityAdsModule$webViewConfigurationDataStore$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38541 extends f0 implements a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38541(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kv.a
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
        }
    }

    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLoadTimeoutMs(30000);
        dsl_create.setShowTimeoutMs(10000);
        dsl_create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        RequestPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setRetryPolicy(getDefaultRequestRetryPolicy());
        dsl_create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setMaxDuration(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        dsl_create.setRetryWaitBase(500);
        dsl_create.setRetryJitterPct(0.1f);
        dsl_create.setShouldStoreLocally(false);
        dsl_create.setRetryMaxInterval(2500);
        dsl_create.setRetryScalingFactor(2.0f);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setConnectTimeoutMs(30000);
        dsl_create.setReadTimeoutMs(30000);
        dsl_create.setWriteTimeoutMs(30000);
        dsl_create.setOverallTimeoutMs(30000);
        return dsl_create._build();
    }

    private final ByteStringDataSource provideByteStringDataSource(n nVar) {
        return new AndroidByteStringDataSource(nVar);
    }

    private final n provideByteStringDataStore(Context context, CoroutineDispatcher coroutineDispatcher, String str) {
        return o.create$default(o.f70432a, new ByteStringSerializer(), null, null, CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new C38521(context, str), 4, null);
    }

    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    public final AsyncTokenStorage asyncTokenStorage(TokenStorage tokenStorage, SDKMetricsSender sdkMetricsSender) {
        e0.checkNotNullParameter(tokenStorage, "tokenStorage");
        e0.checkNotNullParameter(sdkMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sdkMetricsSender, tokenStorage);
    }

    public final ByteStringDataSource auidDataStore(n dataStore) {
        e0.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final CoroutineDispatcher defaultDispatcher() {
        return Dispatchers.getDefault();
    }

    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setAdOperations(getDefaultAdOperations());
        dsl_create.setInitPolicy(getDefaultRequestPolicy());
        dsl_create.setAdPolicy(getDefaultRequestPolicy());
        dsl_create.setOtherPolicy(getDefaultRequestPolicy());
        dsl_create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builderNewBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setEnabled(true);
        dsl_create2.setMaxBatchSize(10);
        dsl_create2.setMaxBatchIntervalMs(30000);
        dsl_create2.setTtmEnabled(false);
        dsl_create.setDiagnosticEvents(dsl_create2._build());
        FeatureFlagsKt.Dsl.Companion companion3 = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder builderNewBuilder3 = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder3, "newBuilder()");
        FeatureFlagsKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
        dsl_create3.setBoldSdkNextSessionEnabled(true);
        dsl_create.setFeatureFlags(dsl_create3._build());
        return dsl_create._build();
    }

    public final ByteStringDataSource gatewayCacheDataStore(n dataStore) {
        e0.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final n gatewayDataStore(Context context, CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    public final CoroutineScope getTokenCoroutineScope(ISDKDispatchers dispatchers, CoroutineExceptionHandler errorHandler, Job parentJob) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(errorHandler, "errorHandler");
        e0.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(errorHandler));
    }

    public final n glInfoDataStore(Context context, CoroutineDispatcher dispatcher, h fetchGLInfo) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        e0.checkNotNullParameter(fetchGLInfo, "fetchGLInfo");
        return o.create$default(o.f70432a, new ByteStringSerializer(), null, o0.listOf(fetchGLInfo), CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new AnonymousClass1(context), 2, null);
    }

    public final n iapTransactionDataStore(Context context, CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    public final ByteStringDataSource idfiDataStore(n dataStore) {
        e0.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final CoroutineScope initCoroutineScope(ISDKDispatchers dispatchers, CoroutineExceptionHandler errorHandler, Job parentJob) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(errorHandler, "errorHandler");
        e0.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_INIT_SCOPE)).plus(errorHandler));
    }

    public final CoroutineDispatcher ioDispatcher() {
        return Dispatchers.getIO();
    }

    public final CoroutineScope loadCoroutineScope(ISDKDispatchers dispatchers, CoroutineExceptionHandler errorHandler, Job parentJob) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(errorHandler, "errorHandler");
        e0.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_LOAD_SCOPE)).plus(errorHandler));
    }

    public final CoroutineDispatcher mainDispatcher() {
        return Dispatchers.getMain();
    }

    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    public final n nativeConfigurationDataStore(Context context, CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    public final CoroutineScope offerwallSignalsCoroutineScope(ISDKDispatchers dispatchers, CoroutineExceptionHandler errorHandler, Job parentJob) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(errorHandler, "errorHandler");
        e0.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_OFFERWALL_SCOPE)).plus(errorHandler));
    }

    public final CoroutineScope omidCoroutineScope(ISDKDispatchers dispatchers, CoroutineExceptionHandler errorHandler, Job parentJob) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(errorHandler, "errorHandler");
        e0.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_OMID_SCOPE)).plus(errorHandler));
    }

    public final n privacyDataStore(Context context, CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY);
    }

    public final n privacyFsmDataStore(Context context, CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    public final Job publicApiJob(DiagnosticEventRepository diagnosticEventRepository) {
        e0.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        completableJobJob$default.invokeOnCompletion(new UnityAdsModule$publicApiJob$1$1(diagnosticEventRepository));
        return completableJobJob$default;
    }

    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    public final CoroutineScope scarSignalsCoroutineScope(ISDKDispatchers dispatchers, CoroutineExceptionHandler errorHandler, Job parentJob) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(errorHandler, "errorHandler");
        e0.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_SCAR_SCOPE)).plus(errorHandler));
    }

    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        e0.checkNotNullExpressionValue(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    public final CoroutineScope showCoroutineScope(ISDKDispatchers dispatchers, CoroutineExceptionHandler errorHandler, Job parentJob) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(errorHandler, "errorHandler");
        e0.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_SHOW_SCOPE)).plus(errorHandler));
    }

    public final TopicsService topicsService(Context context, ISDKDispatchers dispatchers) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        return new TopicsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final CoroutineScope transactionCoroutineScope(ISDKDispatchers dispatchers, CoroutineExceptionHandler errorHandler, Job parentJob) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(errorHandler, "errorHandler");
        e0.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(errorHandler));
    }

    public final n universalRequestDataStore(Context context, CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        return o.create$default(o.f70432a, new UniversalRequestStoreSerializer(), null, null, CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new C38531(context), 4, null);
    }

    public final VolumeChangeMonitor volumeChangeMonitor(VolumeChange volumeChange) {
        e0.checkNotNullParameter(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    public final n webViewConfigurationDataStore(Context context, CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        return o.create$default(o.f70432a, new WebViewConfigurationStoreSerializer(), null, null, CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new C38541(context), 4, null);
    }

    public final ByteStringDataSource iapTransactionDataStore(n dataStore) {
        e0.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final MeasurementsService measurementService(Context context, ISDKDispatchers dispatchers) {
        e0.checkNotNullParameter(context, UupKET.gEuyjm);
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        return new MeasurementsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final ByteStringDataSource nativeConfigurationDataStore(n dataStore) {
        e0.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyDataStore(n dataStore) {
        e0.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyFsmDataStore(n dataStore) {
        e0.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (StorageManager.init(ClientProperties.getApplicationContext())) {
            Storage storage = StorageManager.getStorage(storageType);
            e0.checkNotNullExpressionValue(storage, "getStorage(storageType)");
            return storage;
        }
        throw new IllegalStateException(SUvoXnn.OVuYm);
    }

    public final ByteStringDataSource glInfoDataStore(n dataStore) {
        e0.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }
}
