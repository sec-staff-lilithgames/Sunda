package com.unity3d.ads.network.client;

import av.b;
import av.e;
import bv.f;
import bv.h;
import bv.n;
import com.unity3d.ads.network.HttpClient;
import com.unity3d.ads.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import com.unity3d.services.core.domain.ISDKDispatchers;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import xv.j;
import xv.k;
import xv.l0;
import xv.o0;
import xv.v0;
import xv.w0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OkHttp3Client implements HttpClient {
    private final l0 client;
    private final ISDKDispatchers dispatchers;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.network.client.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.network.client.OkHttp3Client$execute$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ HttpRequest $request;
        int label;
        final /* synthetic */ OkHttp3Client this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpRequest httpRequest, OkHttp3Client okHttp3Client, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$request = httpRequest;
            this.this$0 = okHttp3Client;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$request, this.this$0, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                o0 okHttpRequest = HttpRequestToOkHttpRequestKt.toOkHttpRequest(this.$request);
                OkHttp3Client okHttp3Client = this.this$0;
                long connectTimeout = this.$request.getConnectTimeout();
                long readTimeout = this.$request.getReadTimeout();
                this.label = 1;
                obj = okHttp3Client.makeRequest(okHttpRequest, connectTimeout, readTimeout, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            v0 v0Var = (v0) obj;
            int iCode = v0Var.code();
            Map<String, List<String>> multimap = v0Var.headers().toMultimap();
            String string = v0Var.request().url().toString();
            w0 w0VarBody = v0Var.body();
            String strString = w0VarBody != null ? w0VarBody.string() : null;
            if (strString == null) {
                strString = "";
            }
            e0.checkNotNullExpressionValue(multimap, "toMultimap()");
            e0.checkNotNullExpressionValue(string, "toString()");
            return new HttpResponse(strString, iCode, multimap, string);
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super HttpResponse> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public OkHttp3Client(ISDKDispatchers dispatchers, l0 client) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object makeRequest(o0 o0Var, long j10, long j11, d<? super v0> dVar) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        l0.a aVarNewBuilder = this.client.newBuilder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVarNewBuilder.connectTimeout(j10, timeUnit).readTimeout(j11, timeUnit).build().newCall(o0Var).enqueue(new k() { // from class: com.unity3d.ads.network.client.OkHttp3Client$makeRequest$2$1
            @Override // xv.k
            public void onFailure(j call, IOException e10) {
                e0.checkNotNullParameter(call, "call");
                e0.checkNotNullParameter(e10, "e");
                CancellableContinuation<v0> cancellableContinuation = cancellableContinuationImpl;
                int i10 = z.f87419c;
                cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(e10)));
            }

            @Override // xv.k
            public void onResponse(j call, v0 response) {
                e0.checkNotNullParameter(call, "call");
                e0.checkNotNullParameter(response, "response");
                cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(response));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    @Override // com.unity3d.ads.network.HttpClient
    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        return BuildersKt.withContext(this.dispatchers.getIo(), new AnonymousClass2(httpRequest, this, null), dVar);
    }
}
