package com.unity3d.services.core.network.core;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LegacyHttpClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String NETWORK_CLIENT_LEGACY = "legacy";
    private final ISDKDispatchers dispatchers;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.network.core.LegacyHttpClient$execute$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpRequest httpRequest, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$request = httpRequest;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$request, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Exception {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            WebRequest webRequest = HttpRequestToWebRequestKt.toWebRequest(this.$request);
            String strMakeRequest = webRequest.makeRequest();
            int responseCode = webRequest.getResponseCode();
            Map<String, List<String>> headers = webRequest.getHeaders();
            String string = webRequest.getUrl().toString();
            if (strMakeRequest == null) {
                strMakeRequest = "";
            }
            e0.checkNotNullExpressionValue(headers, "headers");
            e0.checkNotNullExpressionValue(string, "toString()");
            return new HttpResponse(strMakeRequest, responseCode, headers, string, null, LegacyHttpClient.NETWORK_CLIENT_LEGACY, 0L, 80, null);
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super HttpResponse> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.core.network.core.LegacyHttpClient$executeBlocking$1", f = "LegacyHttpClient.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.network.core.LegacyHttpClient$executeBlocking$1, reason: invalid class name */
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
            return LegacyHttpClient.this.new AnonymousClass1(this.$request, dVar);
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
            LegacyHttpClient legacyHttpClient = LegacyHttpClient.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute = legacyHttpClient.execute(httpRequest, this);
            return objExecute == coroutine_suspended ? coroutine_suspended : objExecute;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super HttpResponse> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public LegacyHttpClient(ISDKDispatchers dispatchers) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        return BuildersKt.withContext(this.dispatchers.getIo(), new AnonymousClass2(httpRequest, null), dVar);
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        e0.checkNotNullParameter(request, "request");
        return (HttpResponse) BuildersKt.runBlocking(this.dispatchers.getIo(), new AnonymousClass1(request, null));
    }
}
