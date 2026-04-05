package io.ktor.client.plugins.cache;

import av.e;
import bv.d;
import bv.f;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.cache.storage.HttpCacheStorage;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.date.GMTDate;
import io.ktor.util.pipeline.PipelineContext;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.x0;
import uu.d2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpCacheLegacyKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", i = {}, l = {111}, m = "cacheResponse", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheLegacyKt.cacheResponse(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", i = {0}, l = {62, 63, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "interceptReceiveLegacy", n = {"$this$interceptReceiveLegacy"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39011 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C39011(zu.d<? super C39011> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheLegacyKt.interceptReceiveLegacy(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object cacheResponse(io.ktor.client.plugins.cache.HttpCache r8, io.ktor.client.statement.HttpResponse r9, zu.d<? super io.ktor.client.statement.HttpResponse> r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.client.plugins.cache.HttpCacheLegacyKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1 r0 = (io.ktor.client.plugins.cache.HttpCacheLegacyKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1 r0 = new io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r10)
            goto L7f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            tu.a0.throwOnFailure(r10)
            io.ktor.client.call.HttpClientCall r10 = r9.getCall()
            io.ktor.client.request.HttpRequest r10 = r10.getRequest()
            java.util.List r2 = io.ktor.http.HttpMessagePropertiesKt.cacheControl(r9)
            java.util.List r4 = io.ktor.http.HttpMessagePropertiesKt.cacheControl(r10)
            io.ktor.client.plugins.cache.CacheControl r5 = io.ktor.client.plugins.cache.CacheControl.INSTANCE
            io.ktor.http.HeaderValue r6 = r5.getPRIVATE$ktor_client_core()
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto L55
            io.ktor.client.plugins.cache.storage.HttpCacheStorage r6 = r8.getPrivateStorage()
            goto L59
        L55:
            io.ktor.client.plugins.cache.storage.HttpCacheStorage r6 = r8.getPublicStorage()
        L59:
            io.ktor.http.HeaderValue r7 = r5.getNO_STORE$ktor_client_core()
            boolean r2 = r2.contains(r7)
            if (r2 != 0) goto L86
            io.ktor.http.HeaderValue r2 = r5.getNO_STORE$ktor_client_core()
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L6e
            goto L86
        L6e:
            io.ktor.http.Url r10 = r10.getUrl()
            boolean r8 = r8.isSharedClient$ktor_client_core()
            r0.label = r3
            java.lang.Object r10 = io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.store(r6, r10, r9, r8, r0)
            if (r10 != r1) goto L7f
            return r1
        L7f:
            io.ktor.client.plugins.cache.HttpCacheEntry r10 = (io.ktor.client.plugins.cache.HttpCacheEntry) r10
            io.ktor.client.statement.HttpResponse r8 = r10.produceResponse$ktor_client_core()
            return r8
        L86:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCacheLegacyKt.cacheResponse(io.ktor.client.plugins.cache.HttpCache, io.ktor.client.statement.HttpResponse, zu.d):java.lang.Object");
    }

    private static final HttpResponse findAndRefresh(HttpCache httpCache, HttpRequest httpRequest, HttpResponse httpResponse) {
        Url url = httpResponse.getCall().getRequest().getUrl();
        HttpCacheStorage privateStorage = HttpMessagePropertiesKt.cacheControl(httpResponse).contains(CacheControl.INSTANCE.getPRIVATE$ktor_client_core()) ? httpCache.getPrivateStorage() : httpCache.getPublicStorage();
        Map<String, String> mapVaryKeys = HttpCacheEntryKt.varyKeys(httpResponse);
        HttpCacheEntry httpCacheEntryFindResponse = findResponse(httpCache, privateStorage, mapVaryKeys, url, httpRequest);
        if (httpCacheEntryFindResponse == null) {
            return null;
        }
        if (mapVaryKeys.isEmpty()) {
            mapVaryKeys = httpCacheEntryFindResponse.getVaryKeys();
        }
        privateStorage.store(url, new HttpCacheEntry(HttpCacheEntryKt.cacheExpires$default(httpResponse, httpCache.isSharedClient$ktor_client_core(), null, 2, null), mapVaryKeys, httpCacheEntryFindResponse.getResponse(), httpCacheEntryFindResponse.getBody()));
        return httpCacheEntryFindResponse.produceResponse$ktor_client_core();
    }

    private static final HttpCacheEntry findResponse(HttpCache httpCache, HttpCacheStorage httpCacheStorage, Map<String, String> map, Url url, HttpRequest httpRequest) {
        Object next;
        if (!map.isEmpty()) {
            return httpCacheStorage.find(url, map);
        }
        l lVarMergedHeadersLookup = HttpCacheKt.mergedHeadersLookup(httpRequest.getContent(), new HttpCacheLegacyKt$findResponse$requestHeaders$1(httpRequest.getHeaders()), new HttpCacheLegacyKt$findResponse$requestHeaders$2(httpRequest.getHeaders()));
        Iterator it = y0.sortedWith(httpCacheStorage.findByUrl(url), new Comparator() { // from class: io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return xu.d.compareValues(((HttpCacheEntry) t11).getResponse().getResponseTime(), ((HttpCacheEntry) t10).getResponse().getResponseTime());
            }
        }).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map<String, String> varyKeys = ((HttpCacheEntry) next).getVaryKeys();
            if (!varyKeys.isEmpty()) {
                for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                    String key = entry.getKey();
                    if (!e0.areEqual(lVarMergedHeadersLookup.invoke(key), entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return (HttpCacheEntry) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object interceptReceiveLegacy(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, tu.x0> r7, io.ktor.client.statement.HttpResponse r8, io.ktor.client.plugins.cache.HttpCache r9, io.ktor.client.HttpClient r10, zu.d<? super tu.x0> r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.client.plugins.cache.HttpCacheLegacyKt.C39011
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1 r0 = (io.ktor.client.plugins.cache.HttpCacheLegacyKt.C39011) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1 r0 = new io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            tu.x0 r6 = tu.x0.f87415a
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            tu.a0.throwOnFailure(r11)
            goto La4
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            tu.a0.throwOnFailure(r11)
            goto L6c
        L3e:
            java.lang.Object r7 = r0.L$0
            io.ktor.util.pipeline.PipelineContext r7 = (io.ktor.util.pipeline.PipelineContext) r7
            tu.a0.throwOnFailure(r11)
            goto L5e
        L46:
            tu.a0.throwOnFailure(r11)
            io.ktor.http.HttpStatusCode r11 = r8.getStatus()
            boolean r11 = io.ktor.http.HttpStatusCodeKt.isSuccess(r11)
            if (r11 == 0) goto L6d
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r11 = cacheResponse(r9, r8, r0)
            if (r11 != r1) goto L5e
            goto La3
        L5e:
            io.ktor.client.statement.HttpResponse r11 = (io.ktor.client.statement.HttpResponse) r11
            r8 = 0
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r7 = r7.proceedWith(r11, r0)
            if (r7 != r1) goto L6c
            goto La3
        L6c:
            return r6
        L6d:
            io.ktor.http.HttpStatusCode r11 = r8.getStatus()
            io.ktor.http.HttpStatusCode$Companion r2 = io.ktor.http.HttpStatusCode.Companion
            io.ktor.http.HttpStatusCode r2 = r2.getNotModified()
            boolean r11 = kotlin.jvm.internal.e0.areEqual(r11, r2)
            if (r11 == 0) goto Lb7
            io.ktor.client.statement.HttpResponseKt.complete(r8)
            io.ktor.client.call.HttpClientCall r11 = r8.getCall()
            io.ktor.client.request.HttpRequest r11 = r11.getRequest()
            io.ktor.client.statement.HttpResponse r9 = findAndRefresh(r9, r11, r8)
            if (r9 == 0) goto La5
            io.ktor.events.Events r8 = r10.getMonitor()
            io.ktor.client.plugins.cache.HttpCache$Companion r10 = io.ktor.client.plugins.cache.HttpCache.Companion
            io.ktor.events.EventDefinition r10 = r10.getHttpResponseFromCache()
            r8.raise(r10, r9)
            r0.label = r3
            java.lang.Object r7 = r7.proceedWith(r9, r0)
            if (r7 != r1) goto La4
        La3:
            return r1
        La4:
            return r6
        La5:
            io.ktor.client.plugins.cache.InvalidCacheStateException r7 = new io.ktor.client.plugins.cache.InvalidCacheStateException
            io.ktor.client.call.HttpClientCall r8 = r8.getCall()
            io.ktor.client.request.HttpRequest r8 = r8.getRequest()
            io.ktor.http.Url r8 = r8.getUrl()
            r7.<init>(r8)
            throw r7
        Lb7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCacheLegacyKt.interceptReceiveLegacy(io.ktor.util.pipeline.PipelineContext, io.ktor.client.statement.HttpResponse, io.ktor.client.plugins.cache.HttpCache, io.ktor.client.HttpClient, zu.d):java.lang.Object");
    }

    public static final Object interceptSendLegacy(PipelineContext<Object, HttpRequestBuilder> pipelineContext, HttpCache httpCache, OutgoingContent outgoingContent, HttpClient httpClient, zu.d<? super x0> dVar) {
        Object objProceedWithMissingCache$ktor_client_core;
        HttpCacheEntry httpCacheEntryFindResponse = findResponse(httpCache, pipelineContext.getContext(), outgoingContent);
        x0 x0Var = x0.f87415a;
        if (httpCacheEntryFindResponse == null) {
            return (HttpHeaderValueParserKt.parseHeaderValue(pipelineContext.getContext().getHeaders().get(HttpHeaders.INSTANCE.getCacheControl())).contains(CacheControl.INSTANCE.getONLY_IF_CACHED$ktor_client_core()) && (objProceedWithMissingCache$ktor_client_core = HttpCache.Companion.proceedWithMissingCache$ktor_client_core(pipelineContext, httpClient, dVar)) == e.getCOROUTINE_SUSPENDED()) ? objProceedWithMissingCache$ktor_client_core : x0Var;
        }
        HttpClientCall call = httpCacheEntryFindResponse.produceResponse$ktor_client_core().getCall();
        ValidateStatus validateStatusShouldValidate = HttpCacheEntryKt.shouldValidate(httpCacheEntryFindResponse.getExpires(), httpCacheEntryFindResponse.getResponse().getHeaders(), pipelineContext.getContext());
        if (validateStatusShouldValidate == ValidateStatus.ShouldNotValidate) {
            Object objProceedWithCache$ktor_client_core = HttpCache.Companion.proceedWithCache$ktor_client_core(pipelineContext, httpClient, call, dVar);
            return objProceedWithCache$ktor_client_core == e.getCOROUTINE_SUSPENDED() ? objProceedWithCache$ktor_client_core : x0Var;
        }
        if (validateStatusShouldValidate == ValidateStatus.ShouldWarn) {
            Object objProceedWithWarning = proceedWithWarning(pipelineContext, call, httpClient, dVar);
            return objProceedWithWarning == e.getCOROUTINE_SUSPENDED() ? objProceedWithWarning : x0Var;
        }
        Headers responseHeaders$ktor_client_core = httpCacheEntryFindResponse.getResponseHeaders$ktor_client_core();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = responseHeaders$ktor_client_core.get(httpHeaders.getETag());
        if (str != null) {
            UtilsKt.header(pipelineContext.getContext(), httpHeaders.getIfNoneMatch(), str);
        }
        String str2 = httpCacheEntryFindResponse.getResponseHeaders$ktor_client_core().get(httpHeaders.getLastModified());
        if (str2 != null) {
            UtilsKt.header(pipelineContext.getContext(), httpHeaders.getIfModifiedSince(), str2);
        }
        return x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object proceedWithWarning(PipelineContext<Object, HttpRequestBuilder> pipelineContext, HttpClientCall httpClientCall, HttpClient httpClient, zu.d<? super x0> dVar) {
        HttpRequestData httpRequestDataBuild = pipelineContext.getContext().build();
        HttpStatusCode status = httpClientCall.getResponse().getStatus();
        GMTDate requestTime = httpClientCall.getResponse().getRequestTime();
        Headers.Companion companion = Headers.Companion;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(httpClientCall.getResponse().getHeaders());
        headersBuilder.append(HttpHeaders.INSTANCE.getWarning(), "110");
        HttpClientCall httpClientCall2 = new HttpClientCall(httpClient, httpRequestDataBuild, new HttpResponseData(status, requestTime, headersBuilder.build(), httpClientCall.getResponse().getVersion(), httpClientCall.getResponse().getContent(), httpClientCall.getResponse().getCoroutineContext()));
        pipelineContext.finish();
        httpClient.getMonitor().raise(HttpCache.Companion.getHttpResponseFromCache(), httpClientCall2.getResponse());
        Object objProceedWith = pipelineContext.proceedWith(httpClientCall2, dVar);
        return objProceedWith == e.getCOROUTINE_SUSPENDED() ? objProceedWith : x0.f87415a;
    }

    private static final HttpCacheEntry findResponse(HttpCache httpCache, HttpRequestBuilder httpRequestBuilder, OutgoingContent outgoingContent) {
        Url Url = URLUtilsKt.Url(httpRequestBuilder.getUrl());
        l lVarMergedHeadersLookup = HttpCacheKt.mergedHeadersLookup(outgoingContent, new HttpCacheLegacyKt$findResponse$lookup$1(httpRequestBuilder.getHeaders()), new HttpCacheLegacyKt$findResponse$lookup$2(httpRequestBuilder.getHeaders()));
        for (HttpCacheEntry httpCacheEntry : d2.plus((Set) httpCache.getPrivateStorage().findByUrl(Url), (Iterable) httpCache.getPublicStorage().findByUrl(Url))) {
            Map<String, String> varyKeys = httpCacheEntry.getVaryKeys();
            if (varyKeys.isEmpty() || varyKeys.isEmpty()) {
                return httpCacheEntry;
            }
            for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                String key = entry.getKey();
                if (!e0.areEqual(lVarMergedHeadersLookup.invoke(key), entry.getValue())) {
                    break;
                }
            }
            return httpCacheEntry;
        }
        return null;
    }
}
