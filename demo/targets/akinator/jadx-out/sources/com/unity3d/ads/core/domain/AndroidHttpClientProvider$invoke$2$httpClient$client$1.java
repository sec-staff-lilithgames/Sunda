package com.unity3d.ads.core.domain;

import android.content.Context;
import av.e;
import bv.f;
import bv.n;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.RefactoredOkHttp3Client;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import xv.l0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$2$httpClient$client$1", f = "AndroidHttpClientProvider.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AndroidHttpClientProvider$invoke$2$httpClient$client$1 extends n implements p {
    final /* synthetic */ boolean $usingRefactoredGatewayClient;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$invoke$2$httpClient$client$1(boolean z10, AndroidHttpClientProvider androidHttpClientProvider, d<? super AndroidHttpClientProvider$invoke$2$httpClient$client$1> dVar) {
        super(2, dVar);
        this.$usingRefactoredGatewayClient = z10;
        this.this$0 = androidHttpClientProvider;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new AndroidHttpClientProvider$invoke$2$httpClient$client$1(this.$usingRefactoredGatewayClient, this.this$0, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            if (this.$usingRefactoredGatewayClient) {
                return new RefactoredOkHttp3Client(this.this$0.dispatchers, new l0());
            }
            AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
            Context context = androidHttpClientProvider.context;
            ISDKDispatchers iSDKDispatchers = this.this$0.dispatchers;
            this.label = 1;
            obj = androidHttpClientProvider.buildNetworkClient(context, iSDKDispatchers, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return (HttpClient) obj;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super HttpClient> dVar) {
        return ((AndroidHttpClientProvider$invoke$2$httpClient$client$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
