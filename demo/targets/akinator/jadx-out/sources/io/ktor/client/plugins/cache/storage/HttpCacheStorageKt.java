package io.ktor.client.plugins.cache.storage;

import bv.d;
import bv.f;
import com.ironsource.C3191e4;
import com.ironsource.Me;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedHttpCall;
import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.client.plugins.cache.HttpCacheEntryKt;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.Url;
import io.ktor.util.InternalAPI;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import java.util.Map;
import kotlin.jvm.internal.e0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpCacheStorageKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0}, l = {57}, m = C3191e4.h.U, n = {"$this$store", "url"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheStorageKt.store((HttpCacheStorage) null, (Url) null, (HttpResponse) null, false, (zu.d<? super HttpCacheEntry>) this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0, 0, 0, 0, 1}, l = {Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 138}, m = C3191e4.h.U, n = {"$this$store", Me.f34938n, "varyKeys", "url", "isShared", "data"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0"})
    /* renamed from: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$4, reason: invalid class name */
    public static final class AnonymousClass4 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass4(zu.d<? super AnonymousClass4> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheStorageKt.store((CacheStorage) null, (HttpResponse) null, (Map<String, String>) null, false, (zu.d<? super CachedResponseData>) this);
        }
    }

    public static final HttpResponse createResponse(final CachedResponseData cachedResponseData, HttpClient client, HttpRequest request, final m responseContext) {
        e0.checkNotNullParameter(cachedResponseData, "<this>");
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(request, "request");
        e0.checkNotNullParameter(responseContext, "responseContext");
        return new SavedHttpCall(client, request, new HttpResponse(cachedResponseData, responseContext) { // from class: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$createResponse$response$1
            private final m coroutineContext;
            private final Headers headers;
            private final GMTDate requestTime;
            private final GMTDate responseTime;
            private final HttpStatusCode status;
            private final HttpProtocolVersion version;

            {
                this.status = cachedResponseData.getStatusCode();
                this.version = cachedResponseData.getVersion();
                this.requestTime = cachedResponseData.getRequestTime();
                this.responseTime = cachedResponseData.getResponseTime();
                this.headers = cachedResponseData.getHeaders();
                this.coroutineContext = responseContext;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public HttpClientCall getCall() {
                throw new IllegalStateException("This is a fake response");
            }

            @Override // io.ktor.client.statement.HttpResponse
            public ByteReadChannel getContent() {
                throw new IllegalStateException("This is a fake response");
            }

            @Override // kotlinx.coroutines.CoroutineScope
            public m getCoroutineContext() {
                return this.coroutineContext;
            }

            @Override // io.ktor.http.HttpMessage
            public Headers getHeaders() {
                return this.headers;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public GMTDate getRequestTime() {
                return this.requestTime;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public GMTDate getResponseTime() {
                return this.responseTime;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public HttpStatusCode getStatus() {
                return this.status;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public HttpProtocolVersion getVersion() {
                return this.version;
            }

            @InternalAPI
            public static /* synthetic */ void getContent$annotations() {
            }
        }, cachedResponseData.getBody()).getResponse();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object store(io.ktor.client.plugins.cache.storage.HttpCacheStorage r4, io.ktor.http.Url r5, io.ktor.client.statement.HttpResponse r6, boolean r7, zu.d<? super io.ktor.client.plugins.cache.HttpCacheEntry> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1 r0 = (io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1 r0 = new io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            io.ktor.http.Url r5 = (io.ktor.http.Url) r5
            java.lang.Object r4 = r0.L$0
            io.ktor.client.plugins.cache.storage.HttpCacheStorage r4 = (io.ktor.client.plugins.cache.storage.HttpCacheStorage) r4
            tu.a0.throwOnFailure(r8)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            tu.a0.throwOnFailure(r8)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.plugins.cache.HttpCacheEntryKt.HttpCacheEntry(r7, r6, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            io.ktor.client.plugins.cache.HttpCacheEntry r8 = (io.ktor.client.plugins.cache.HttpCacheEntry) r8
            r4.store(r5, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.store(io.ktor.client.plugins.cache.storage.HttpCacheStorage, io.ktor.http.Url, io.ktor.client.statement.HttpResponse, boolean, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object store$default(CacheStorage cacheStorage, HttpResponse httpResponse, Map map, boolean z10, zu.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return store(cacheStorage, httpResponse, (Map<String, String>) map, z10, (zu.d<? super CachedResponseData>) dVar);
    }

    @tu.f
    public static final Object store(CacheStorage cacheStorage, HttpResponse httpResponse, zu.d<? super CachedResponseData> dVar) {
        return store$default(cacheStorage, httpResponse, HttpCacheEntryKt.varyKeys(httpResponse), false, dVar, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object store(io.ktor.client.plugins.cache.storage.CacheStorage r22, io.ktor.client.statement.HttpResponse r23, java.util.Map<java.lang.String, java.lang.String> r24, boolean r25, zu.d<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r26) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.AnonymousClass4
            if (r1 == 0) goto L16
            r1 = r0
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$4 r1 = (io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.AnonymousClass4) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r5 = r1
            goto L1c
        L16:
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$4 r1 = new io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$4
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r5.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r5.label
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L56
            if (r2 == r9) goto L3c
            if (r2 != r8) goto L34
            java.lang.Object r1 = r5.L$0
            io.ktor.client.plugins.cache.storage.CachedResponseData r1 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r1
            tu.a0.throwOnFailure(r0)
            return r1
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            boolean r2 = r5.Z$0
            java.lang.Object r3 = r5.L$3
            io.ktor.http.Url r3 = (io.ktor.http.Url) r3
            java.lang.Object r4 = r5.L$2
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r5.L$1
            io.ktor.client.statement.HttpResponse r6 = (io.ktor.client.statement.HttpResponse) r6
            java.lang.Object r7 = r5.L$0
            io.ktor.client.plugins.cache.storage.CacheStorage r7 = (io.ktor.client.plugins.cache.storage.CacheStorage) r7
            tu.a0.throwOnFailure(r0)
            r13 = r2
            r20 = r4
            r11 = r6
            goto L8d
        L56:
            tu.a0.throwOnFailure(r0)
            io.ktor.client.call.HttpClientCall r0 = r23.getCall()
            io.ktor.client.request.HttpRequest r0 = r0.getRequest()
            io.ktor.http.Url r0 = r0.getUrl()
            io.ktor.utils.io.ByteReadChannel r2 = r23.getContent()
            r10 = r22
            r5.L$0 = r10
            r11 = r23
            r5.L$1 = r11
            r12 = r24
            r5.L$2 = r12
            r5.L$3 = r0
            r13 = r25
            r5.Z$0 = r13
            r5.label = r9
            r3 = 0
            r6 = 1
            r7 = 0
            java.lang.Object r2 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.readRemaining$default(r2, r3, r5, r6, r7)
            if (r2 != r1) goto L88
            goto Ld2
        L88:
            r3 = r0
            r0 = r2
            r7 = r10
            r20 = r12
        L8d:
            io.ktor.utils.io.core.ByteReadPacket r0 = (io.ktor.utils.io.core.ByteReadPacket) r0
            r2 = 0
            r4 = 0
            byte[] r21 = io.ktor.utils.io.core.StringsKt.readBytes$default(r0, r2, r9, r4)
            io.ktor.client.statement.HttpResponseKt.complete(r11)
            io.ktor.client.call.HttpClientCall r0 = r11.getCall()
            io.ktor.client.request.HttpRequest r0 = r0.getRequest()
            io.ktor.http.Url r0 = r0.getUrl()
            io.ktor.http.HttpStatusCode r14 = r11.getStatus()
            io.ktor.util.date.GMTDate r15 = r11.getRequestTime()
            io.ktor.http.Headers r19 = r11.getHeaders()
            io.ktor.http.HttpProtocolVersion r17 = r11.getVersion()
            io.ktor.util.date.GMTDate r16 = r11.getResponseTime()
            io.ktor.util.date.GMTDate r18 = io.ktor.client.plugins.cache.HttpCacheEntryKt.cacheExpires$default(r11, r13, r4, r8, r4)
            io.ktor.client.plugins.cache.storage.CachedResponseData r12 = new io.ktor.client.plugins.cache.storage.CachedResponseData
            r13 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r5.L$0 = r12
            r5.L$1 = r4
            r5.L$2 = r4
            r5.L$3 = r4
            r5.label = r8
            java.lang.Object r0 = r7.store(r3, r12, r5)
            if (r0 != r1) goto Ld3
        Ld2:
            return r1
        Ld3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.store(io.ktor.client.plugins.cache.storage.CacheStorage, io.ktor.client.statement.HttpResponse, java.util.Map, boolean, zu.d):java.lang.Object");
    }
}
