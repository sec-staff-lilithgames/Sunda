package com.unity3d.services.core.network.core;

import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RefactoredOkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";
    private final l0 client;
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
    @f(c = "com.unity3d.services.core.network.core.RefactoredOkHttp3Client", f = "RefactoredOkHttp3Client.kt", i = {0, 0, 0}, l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "execute", n = {AdActivity.REQUEST_KEY_EXTRA, "okHttpRequest", "configuredClient"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RefactoredOkHttp3Client.this.execute(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.core.network.core.RefactoredOkHttp3Client$executeBlocking$1", f = "RefactoredOkHttp3Client.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.network.core.RefactoredOkHttp3Client$executeBlocking$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38551 extends n implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38551(HttpRequest httpRequest, zu.d<? super C38551> dVar) {
            super(2, dVar);
            this.$request = httpRequest;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return RefactoredOkHttp3Client.this.new C38551(this.$request, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws UnityAdsNetworkException {
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
            RefactoredOkHttp3Client refactoredOkHttp3Client = RefactoredOkHttp3Client.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute = refactoredOkHttp3Client.execute(httpRequest, this);
            return objExecute == coroutine_suspended ? coroutine_suspended : objExecute;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super HttpResponse> dVar) {
            return ((C38551) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public RefactoredOkHttp3Client(ISDKDispatchers dispatchers, l0 client) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.unity3d.services.core.network.model.HttpRequest r11, zu.d<? super com.unity3d.services.core.network.model.HttpResponse> r12) throws com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.unity3d.services.core.network.core.RefactoredOkHttp3Client.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1 r0 = (com.unity3d.services.core.network.core.RefactoredOkHttp3Client.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1 r0 = new com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r11 = r0.L$2
            xv.l0 r11 = (xv.l0) r11
            java.lang.Object r11 = r0.L$1
            xv.o0 r11 = (xv.o0) r11
            java.lang.Object r11 = r0.L$0
            com.unity3d.services.core.network.model.HttpRequest r11 = (com.unity3d.services.core.network.model.HttpRequest) r11
            tu.a0.throwOnFailure(r12)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            return r12
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            tu.a0.throwOnFailure(r12)
            xv.o0 r12 = com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(r11)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            xv.l0 r2 = r10.client     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            xv.l0$a r2 = r2.newBuilder()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            int r4 = r11.getConnectTimeout()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            long r4 = (long) r4     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            xv.l0$a r2 = r2.connectTimeout(r4, r6)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            int r4 = r11.getReadTimeout()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            long r4 = (long) r4     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            xv.l0$a r2 = r2.readTimeout(r4, r6)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            int r4 = r11.getWriteTimeout()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            long r4 = (long) r4     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            xv.l0$a r2 = r2.writeTimeout(r4, r6)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            xv.l0 r2 = r2.build()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r0.L$0 = r11     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r0.L$1 = r12     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r0.L$2 = r2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r0.label = r3     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            zu.d r5 = av.b.intercepted(r0)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r4.<init>(r5, r3)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r4.initCancellability()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            xv.j r12 = r2.newCall(r12)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$1 r2 = new com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$1     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r2.<init>(r12)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r4.invokeOnCancellation(r2)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$2 r2 = new com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r2.<init>()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r12.enqueue(r2)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            java.lang.Object r12 = r4.getResult()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            if (r12 != r2) goto La0
            bv.h.probeCoroutineSuspended(r0)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
        La0:
            if (r12 != r1) goto La3
            return r1
        La3:
            return r12
        La4:
            com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException r0 = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException
            java.lang.String r4 = r11.getBaseURL()
            r8 = 54
            r9 = 0
            java.lang.String r1 = "Network request failed"
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r0
        Lb9:
            com.unity3d.ads.core.data.model.exception.NetworkTimeoutException r0 = new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException
            java.lang.String r4 = r11.getBaseURL()
            r8 = 54
            r9 = 0
            java.lang.String r1 = "Network request timeout"
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.RefactoredOkHttp3Client.execute(com.unity3d.services.core.network.model.HttpRequest, zu.d):java.lang.Object");
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        e0.checkNotNullParameter(request, "request");
        return (HttpResponse) BuildersKt.runBlocking(this.dispatchers.getIo(), new C38551(request, null));
    }
}
