package io.ktor.client.plugins.cache;

import av.e;
import bv.f;
import com.ironsource.C3191e4;
import com.ironsource.Me;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.cache.storage.CacheStorage;
import io.ktor.client.plugins.cache.storage.CachedResponseData;
import io.ktor.client.plugins.cache.storage.HttpCacheStorage;
import io.ktor.client.plugins.cache.storage.HttpCacheStorageKt;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.EventDefinition;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import io.ktor.util.pipeline.InvalidPhaseException;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.pipeline.PipelinePhase;
import io.ktor.utils.io.ByteChannelCtorKt;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpCache {
    private final boolean isSharedClient;
    private final HttpCacheStorage privateStorage;
    private final CacheStorage privateStorageNew;
    private final HttpCacheStorage publicStorage;
    private final CacheStorage publicStorageNew;
    private final boolean useOldStorage;
    public static final Companion Companion = new Companion(null);
    private static final AttributeKey<HttpCache> key = new AttributeKey<>("HttpCache");
    private static final EventDefinition<HttpResponse> HttpResponseFromCache = new EventDefinition<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion implements HttpClientPlugin<Config, HttpCache> {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object proceedWithWarning(PipelineContext<Object, HttpRequestBuilder> pipelineContext, CachedResponseData cachedResponseData, HttpClient httpClient, m mVar, d<? super x0> dVar) {
            HttpRequestData httpRequestDataBuild = pipelineContext.getContext().build();
            HttpStatusCode statusCode = cachedResponseData.getStatusCode();
            GMTDate requestTime = cachedResponseData.getRequestTime();
            Headers.Companion companion = Headers.Companion;
            HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
            headersBuilder.appendAll(cachedResponseData.getHeaders());
            headersBuilder.append(HttpHeaders.INSTANCE.getWarning(), "110");
            HttpClientCall httpClientCall = new HttpClientCall(httpClient, httpRequestDataBuild, new HttpResponseData(statusCode, requestTime, headersBuilder.build(), cachedResponseData.getVersion(), ByteChannelCtorKt.ByteReadChannel(cachedResponseData.getBody()), mVar));
            pipelineContext.finish();
            httpClient.getMonitor().raise(getHttpResponseFromCache(), httpClientCall.getResponse());
            Object objProceedWith = pipelineContext.proceedWith(httpClientCall, dVar);
            return objProceedWith == e.getCOROUTINE_SUSPENDED() ? objProceedWith : x0.f87415a;
        }

        public final EventDefinition<HttpResponse> getHttpResponseFromCache() {
            return HttpCache.HttpResponseFromCache;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpCache> getKey() {
            return HttpCache.key;
        }

        public final Object proceedWithCache$ktor_client_core(PipelineContext<Object, HttpRequestBuilder> pipelineContext, HttpClient httpClient, HttpClientCall httpClientCall, d<? super x0> dVar) {
            pipelineContext.finish();
            httpClient.getMonitor().raise(getHttpResponseFromCache(), httpClientCall.getResponse());
            Object objProceedWith = pipelineContext.proceedWith(httpClientCall, dVar);
            return objProceedWith == e.getCOROUTINE_SUSPENDED() ? objProceedWith : x0.f87415a;
        }

        public final Object proceedWithMissingCache$ktor_client_core(PipelineContext<Object, HttpRequestBuilder> pipelineContext, HttpClient httpClient, d<? super x0> dVar) {
            pipelineContext.finish();
            HttpRequestData httpRequestDataBuild = pipelineContext.getContext().build();
            Object objProceedWith = pipelineContext.proceedWith(new HttpClientCall(httpClient, httpRequestDataBuild, new HttpResponseData(HttpStatusCode.Companion.getGatewayTimeout(), DateJvmKt.GMTDate$default(null, 1, null), Headers.Companion.getEmpty(), HttpProtocolVersion.Companion.getHTTP_1_1(), ByteChannelCtorKt.ByteReadChannel(new byte[0]), httpRequestDataBuild.getExecutionContext())), dVar);
            return objProceedWith == e.getCOROUTINE_SUSPENDED() ? objProceedWith : x0.f87415a;
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpCache plugin, HttpClient scope) throws InvalidPhaseException {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            PipelinePhase pipelinePhase = new PipelinePhase("Cache");
            scope.getSendPipeline().insertPhaseAfter(HttpSendPipeline.Phases.getState(), pipelinePhase);
            scope.getSendPipeline().intercept(pipelinePhase, new HttpCache$Companion$install$1(plugin, scope, null));
            scope.getReceivePipeline().intercept(HttpReceivePipeline.Phases.getState(), new HttpCache$Companion$install$2(plugin, scope, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpCache prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpCache(config.getPublicStorage(), config.getPrivateStorage(), config.getPublicStorageNew$ktor_client_core(), config.getPrivateStorageNew$ktor_client_core(), config.getUseOldStorage$ktor_client_core(), config.isShared(), null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 0, 0, 0, 1, 1, 1}, l = {298, 300}, m = "findAndRefresh", n = {"this", AdActivity.REQUEST_KEY_EXTRA, Me.f34938n, C3191e4.a.f36373k, "varyKeysFrom304", AdActivity.REQUEST_KEY_EXTRA, Me.f34938n, "cache"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCache.this.findAndRefresh(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {1}, l = {Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE}, m = "findResponse", n = {"requestHeaders"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.cache.HttpCache$findResponse$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38991 extends bv.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C38991(d<? super C38991> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCache.this.findResponse(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 0, 1}, l = {328, 328}, m = "findResponse", n = {"this", "url", "lookup", "lookup"}, s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: io.ktor.client.plugins.cache.HttpCache$findResponse$4, reason: invalid class name */
    public static final class AnonymousClass4 extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass4(d<? super AnonymousClass4> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCache.this.findResponse(null, null, this);
        }
    }

    public /* synthetic */ HttpCache(HttpCacheStorage httpCacheStorage, HttpCacheStorage httpCacheStorage2, CacheStorage cacheStorage, CacheStorage cacheStorage2, boolean z10, boolean z11, u uVar) {
        this(httpCacheStorage, httpCacheStorage2, cacheStorage, cacheStorage2, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object cacheResponse(HttpResponse httpResponse, d<? super CachedResponseData> dVar) {
        HttpRequest request = httpResponse.getCall().getRequest();
        List<HeaderValue> listCacheControl = HttpMessagePropertiesKt.cacheControl(httpResponse);
        List<HeaderValue> listCacheControl2 = HttpMessagePropertiesKt.cacheControl(request);
        CacheControl cacheControl = CacheControl.INSTANCE;
        boolean zContains = listCacheControl.contains(cacheControl.getPRIVATE$ktor_client_core());
        if (zContains && this.isSharedClient) {
            return null;
        }
        CacheStorage cacheStorage = zContains ? this.privateStorageNew : this.publicStorageNew;
        if (listCacheControl.contains(cacheControl.getNO_STORE$ktor_client_core()) || listCacheControl2.contains(cacheControl.getNO_STORE$ktor_client_core())) {
            return null;
        }
        return HttpCacheStorageKt.store(cacheStorage, httpResponse, HttpCacheEntryKt.varyKeys(httpResponse), this.isSharedClient, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findAndRefresh(io.ktor.client.request.HttpRequest r10, io.ktor.client.statement.HttpResponse r11, zu.d<? super io.ktor.client.statement.HttpResponse> r12) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCache.findAndRefresh(io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findResponse(io.ktor.client.plugins.cache.storage.CacheStorage r6, java.util.Map<java.lang.String, java.lang.String> r7, io.ktor.http.Url r8, io.ktor.client.request.HttpRequest r9, zu.d<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof io.ktor.client.plugins.cache.HttpCache.C38991
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.cache.HttpCache$findResponse$1 r0 = (io.ktor.client.plugins.cache.HttpCache.C38991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.HttpCache$findResponse$1 r0 = new io.ktor.client.plugins.cache.HttpCache$findResponse$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            kv.l r6 = (kv.l) r6
            tu.a0.throwOnFailure(r10)
            goto L75
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            tu.a0.throwOnFailure(r10)
            return r10
        L3c:
            tu.a0.throwOnFailure(r10)
            boolean r10 = r7.isEmpty()
            if (r10 != 0) goto L4f
            r0.label = r4
            java.lang.Object r6 = r6.find(r8, r7, r0)
            if (r6 != r1) goto L4e
            goto L73
        L4e:
            return r6
        L4f:
            io.ktor.http.content.OutgoingContent r7 = r9.getContent()
            io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$1 r10 = new io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$1
            io.ktor.http.Headers r2 = r9.getHeaders()
            r10.<init>(r2)
            io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$2 r2 = new io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$2
            io.ktor.http.Headers r9 = r9.getHeaders()
            r2.<init>(r9)
            kv.l r7 = io.ktor.client.plugins.cache.HttpCacheKt.mergedHeadersLookup(r7, r10, r2)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r10 = r6.findAll(r8, r0)
            if (r10 != r1) goto L74
        L73:
            return r1
        L74:
            r6 = r7
        L75:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1 r7 = new io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1
            r7.<init>()
            java.util.List r7 = uu.y0.sortedWith(r10, r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L86:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc9
            java.lang.Object r8 = r7.next()
            r9 = r8
            io.ktor.client.plugins.cache.storage.CachedResponseData r9 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r9
            java.util.Map r9 = r9.getVaryKeys()
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L9e
            goto Lca
        L9e:
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        La6:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lca
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r0 = r10.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r6.invoke(r0)
            boolean r10 = kotlin.jvm.internal.e0.areEqual(r0, r10)
            if (r10 != 0) goto La6
            goto L86
        Lc9:
            r8 = 0
        Lca:
            io.ktor.client.plugins.cache.storage.CachedResponseData r8 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCache.findResponse(io.ktor.client.plugins.cache.storage.CacheStorage, java.util.Map, io.ktor.http.Url, io.ktor.client.request.HttpRequest, zu.d):java.lang.Object");
    }

    public final HttpCacheStorage getPrivateStorage() {
        return this.privateStorage;
    }

    public final HttpCacheStorage getPublicStorage() {
        return this.publicStorage;
    }

    public final boolean isSharedClient$ktor_client_core() {
        return this.isSharedClient;
    }

    private HttpCache(HttpCacheStorage httpCacheStorage, HttpCacheStorage httpCacheStorage2, CacheStorage cacheStorage, CacheStorage cacheStorage2, boolean z10, boolean z11) {
        this.publicStorage = httpCacheStorage;
        this.privateStorage = httpCacheStorage2;
        this.publicStorageNew = cacheStorage;
        this.privateStorageNew = cacheStorage2;
        this.useOldStorage = z10;
        this.isSharedClient = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findResponse(io.ktor.client.request.HttpRequestBuilder r9, io.ktor.http.content.OutgoingContent r10, zu.d<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCache.findResponse(io.ktor.client.request.HttpRequestBuilder, io.ktor.http.content.OutgoingContent, zu.d):java.lang.Object");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Config {
        private boolean isShared;
        private HttpCacheStorage privateStorage;
        private CacheStorage privateStorageNew;
        private HttpCacheStorage publicStorage;
        private CacheStorage publicStorageNew;
        private boolean useOldStorage;

        public Config() {
            CacheStorage.Companion companion = CacheStorage.Companion;
            this.publicStorageNew = (CacheStorage) companion.getUnlimited().invoke();
            this.privateStorageNew = (CacheStorage) companion.getUnlimited().invoke();
            HttpCacheStorage.Companion companion2 = HttpCacheStorage.Companion;
            this.publicStorage = (HttpCacheStorage) companion2.getUnlimited().invoke();
            this.privateStorage = (HttpCacheStorage) companion2.getUnlimited().invoke();
        }

        public final HttpCacheStorage getPrivateStorage() {
            return this.privateStorage;
        }

        public final CacheStorage getPrivateStorageNew$ktor_client_core() {
            return this.privateStorageNew;
        }

        public final HttpCacheStorage getPublicStorage() {
            return this.publicStorage;
        }

        public final CacheStorage getPublicStorageNew$ktor_client_core() {
            return this.publicStorageNew;
        }

        public final boolean getUseOldStorage$ktor_client_core() {
            return this.useOldStorage;
        }

        public final boolean isShared() {
            return this.isShared;
        }

        public final void privateStorage(CacheStorage storage) {
            e0.checkNotNullParameter(storage, "storage");
            this.privateStorageNew = storage;
        }

        public final void publicStorage(CacheStorage storage) {
            e0.checkNotNullParameter(storage, "storage");
            this.publicStorageNew = storage;
        }

        public final void setPrivateStorage(HttpCacheStorage value) {
            e0.checkNotNullParameter(value, "value");
            this.useOldStorage = true;
            this.privateStorage = value;
        }

        public final void setPrivateStorageNew$ktor_client_core(CacheStorage cacheStorage) {
            e0.checkNotNullParameter(cacheStorage, "<set-?>");
            this.privateStorageNew = cacheStorage;
        }

        public final void setPublicStorage(HttpCacheStorage value) {
            e0.checkNotNullParameter(value, "value");
            this.useOldStorage = true;
            this.publicStorage = value;
        }

        public final void setPublicStorageNew$ktor_client_core(CacheStorage cacheStorage) {
            e0.checkNotNullParameter(cacheStorage, "<set-?>");
            this.publicStorageNew = cacheStorage;
        }

        public final void setShared(boolean z10) {
            this.isShared = z10;
        }

        public final void setUseOldStorage$ktor_client_core(boolean z10) {
            this.useOldStorage = z10;
        }

        @tu.f
        public static /* synthetic */ void getPrivateStorage$annotations() {
        }

        @tu.f
        public static /* synthetic */ void getPublicStorage$annotations() {
        }
    }

    @tu.f
    public static /* synthetic */ void getPrivateStorage$annotations() {
    }

    @tu.f
    public static /* synthetic */ void getPublicStorage$annotations() {
    }
}
