package com.unity3d.services.core.network.core;

import av.b;
import av.e;
import bv.f;
import bv.h;
import bv.n;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kv.p;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import sv.g;
import sv.j0;
import sv.n0;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CronetClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    private static final String NETWORK_CLIENT_CRONET = "cronet";
    private final ISDKDispatchers dispatchers;
    private final CronetEngine engine;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", f = "CronetClient.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.network.core.CronetClient$executeBlocking$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpRequest httpRequest, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$request = httpRequest;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return CronetClient.this.new AnonymousClass1(this.$request, dVar);
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
            CronetClient cronetClient = CronetClient.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute = cronetClient.execute(httpRequest, this);
            return objExecute == coroutine_suspended ? coroutine_suspended : objExecute;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super HttpResponse> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public CronetClient(CronetEngine engine, ISDKDispatchers dispatchers) {
        e0.checkNotNullParameter(engine, "engine");
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        this.engine = engine;
        this.dispatchers = dispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(HttpRequest httpRequest) {
        return n0.removeSuffix(n0.trim(httpRequest.getBaseURL(), '/') + '/' + n0.trim(httpRequest.getPath(), '/'), (CharSequence) "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(UrlResponseInfo urlResponseInfo) {
        String str;
        Long longOrNull;
        List<String> list = urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list == null || (str = list.get(0)) == null || (longOrNull = j0.toLongOrNull(str)) == null) {
            return -1L;
        }
        return longOrNull.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 != 1) {
            return i10 != 2 ? 1 : 2;
        }
        return 3;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        byte[] bytes;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        final ISDKDispatchers iSDKDispatchers = this.dispatchers;
        final long readTimeout = httpRequest.getReadTimeout();
        UnityAdsUrlRequestCallback unityAdsUrlRequestCallback = new UnityAdsUrlRequestCallback(iSDKDispatchers, readTimeout) { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
                super.onCanceled(urlRequest, urlResponseInfo);
                NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Network request timed out", null, null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, null, "cronet", 38, null);
                CancellableContinuation<HttpResponse> cancellableContinuation = cancellableContinuationImpl;
                int i10 = z.f87419c;
                cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(networkTimeoutException)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
                super.onFailed(urlRequest, urlResponseInfo, cronetException);
                NetworkException networkException = cronetException instanceof NetworkException ? (NetworkException) cronetException : null;
                UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException("Network request failed", null, urlResponseInfo != null ? Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null);
                CancellableContinuation<HttpResponse> cancellableContinuation = cancellableContinuationImpl;
                int i10 = z.f87419c;
                cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(unityAdsNetworkException)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(UrlRequest request, UrlResponseInfo info, byte[] bodyBytes) {
                e0.checkNotNullParameter(request, "request");
                e0.checkNotNullParameter(info, "info");
                e0.checkNotNullParameter(bodyBytes, "bodyBytes");
                CancellableContinuation<HttpResponse> cancellableContinuation = cancellableContinuationImpl;
                int httpStatusCode = info.getHttpStatusCode();
                Map<String, List<String>> allHeaders = info.getAllHeaders();
                String url = info.getUrl();
                String negotiatedProtocol = info.getNegotiatedProtocol();
                long contentSize = this.getContentSize(info);
                e0.checkNotNullExpressionValue(allHeaders, "allHeaders");
                e0.checkNotNullExpressionValue(url, "url");
                e0.checkNotNullExpressionValue(negotiatedProtocol, "negotiatedProtocol");
                cancellableContinuation.resumeWith(z.m7131constructorimpl(new HttpResponse(bodyBytes, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize)));
            }
        };
        UrlRequest.Builder builderNewUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), unityAdsUrlRequestCallback, ExecutorsKt.asExecutor(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builderNewUrlRequestBuilder.addHeader(key, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bytes = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bytes = ((String) httpRequest.getBody()).getBytes(g.f86134b);
                e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = new byte[0];
            }
            builderNewUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bytes), ExecutorsKt.asExecutor(this.dispatchers.getIo()));
        }
        UrlRequest req = builderNewUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        cancellableContinuationImpl.invokeOnCancellation(new CronetClient$execute$2$2(req));
        e0.checkNotNullExpressionValue(req, "req");
        unityAdsUrlRequestCallback.startTimer(req);
        req.start();
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        e0.checkNotNullParameter(request, "request");
        return (HttpResponse) BuildersKt.runBlocking(this.dispatchers.getIo(), new AnonymousClass1(request, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
    }
}
