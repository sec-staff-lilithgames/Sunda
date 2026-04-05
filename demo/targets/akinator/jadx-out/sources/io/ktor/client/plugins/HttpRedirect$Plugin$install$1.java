package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpRedirect;
import io.ktor.client.request.HttpRequestBuilder;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpRedirect$Plugin$install$1", f = "HttpRedirect.kt", i = {0, 0}, l = {64, TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER}, m = "invokeSuspend", n = {"$this$intercept", "context"}, s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
public final class HttpRedirect$Plugin$install$1 extends n implements q {
    final /* synthetic */ HttpRedirect $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRedirect$Plugin$install$1(HttpRedirect httpRedirect, HttpClient httpClient, d<? super HttpRedirect$Plugin$install$1> dVar) {
        super(3, dVar);
        this.$plugin = httpRedirect;
        this.$scope = httpClient;
    }

    @Override // kv.q
    public final Object invoke(Sender sender, HttpRequestBuilder httpRequestBuilder, d<? super HttpClientCall> dVar) {
        HttpRedirect$Plugin$install$1 httpRedirect$Plugin$install$1 = new HttpRedirect$Plugin$install$1(this.$plugin, this.$scope, dVar);
        httpRedirect$Plugin$install$1.L$0 = sender;
        httpRedirect$Plugin$install$1.L$1 = httpRequestBuilder;
        return httpRedirect$Plugin$install$1.invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        HttpRequestBuilder httpRequestBuilder;
        Sender sender;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            Sender sender2 = (Sender) this.L$0;
            httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            this.L$0 = sender2;
            this.L$1 = httpRequestBuilder;
            this.label = 1;
            Object objExecute = sender2.execute(httpRequestBuilder, this);
            if (objExecute != coroutine_suspended) {
                sender = sender2;
                obj = objExecute;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        httpRequestBuilder = (HttpRequestBuilder) this.L$1;
        Sender sender3 = (Sender) this.L$0;
        a0.throwOnFailure(obj);
        sender = sender3;
        HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
        HttpClientCall httpClientCall = (HttpClientCall) obj;
        if (this.$plugin.checkHttpMethod && !HttpRedirectKt.ALLOWED_FOR_REDIRECT.contains(httpClientCall.getRequest().getMethod())) {
            return httpClientCall;
        }
        HttpRedirect.Plugin plugin = HttpRedirect.Plugin;
        boolean z10 = this.$plugin.allowHttpsDowngrade;
        HttpClient httpClient = this.$scope;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objHandleCall = plugin.handleCall(sender, httpRequestBuilder2, httpClientCall, z10, httpClient, this);
        return objHandleCall == coroutine_suspended ? coroutine_suspended : objHandleCall;
    }
}
