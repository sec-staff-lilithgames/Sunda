package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.request.ClientUpgradeContent;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.URLProtocolKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1", f = "HttpTimeout.kt", i = {}, l = {146, 174}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class HttpTimeout$Plugin$install$1 extends n implements q {
    final /* synthetic */ HttpTimeout $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeout$Plugin$install$1(HttpTimeout httpTimeout, HttpClient httpClient, d<? super HttpTimeout$Plugin$install$1> dVar) {
        super(3, dVar);
        this.$plugin = httpTimeout;
        this.$scope = httpClient;
    }

    @Override // kv.q
    public final Object invoke(Sender sender, HttpRequestBuilder httpRequestBuilder, d<? super HttpClientCall> dVar) {
        HttpTimeout$Plugin$install$1 httpTimeout$Plugin$install$1 = new HttpTimeout$Plugin$install$1(this.$plugin, this.$scope, dVar);
        httpTimeout$Plugin$install$1.L$0 = sender;
        httpTimeout$Plugin$install$1.L$1 = httpRequestBuilder;
        return httpTimeout$Plugin$install$1.invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.throwOnFailure(obj);
                return obj;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        Sender sender = (Sender) this.L$0;
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$1;
        if (URLProtocolKt.isWebsocket(httpRequestBuilder.getUrl().getProtocol()) || (httpRequestBuilder.getBody() instanceof ClientUpgradeContent)) {
            this.L$0 = null;
            this.label = 1;
            Object objExecute = sender.execute(httpRequestBuilder, this);
            if (objExecute != coroutine_suspended) {
                return objExecute;
            }
        } else {
            HttpTimeout.Plugin plugin = HttpTimeout.Plugin;
            HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) httpRequestBuilder.getCapabilityOrNull(plugin);
            if (httpTimeoutCapabilityConfiguration == null && this.$plugin.hasNotNullTimeouts()) {
                HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration2 = new HttpTimeout.HttpTimeoutCapabilityConfiguration(null, null, null, 7, null);
                httpRequestBuilder.setCapability(plugin, httpTimeoutCapabilityConfiguration2);
                httpTimeoutCapabilityConfiguration = httpTimeoutCapabilityConfiguration2;
            }
            if (httpTimeoutCapabilityConfiguration != null) {
                HttpTimeout httpTimeout = this.$plugin;
                HttpClient httpClient = this.$scope;
                Long connectTimeoutMillis = httpTimeoutCapabilityConfiguration.getConnectTimeoutMillis();
                if (connectTimeoutMillis == null) {
                    connectTimeoutMillis = httpTimeout.connectTimeoutMillis;
                }
                httpTimeoutCapabilityConfiguration.setConnectTimeoutMillis(connectTimeoutMillis);
                Long socketTimeoutMillis = httpTimeoutCapabilityConfiguration.getSocketTimeoutMillis();
                if (socketTimeoutMillis == null) {
                    socketTimeoutMillis = httpTimeout.socketTimeoutMillis;
                }
                httpTimeoutCapabilityConfiguration.setSocketTimeoutMillis(socketTimeoutMillis);
                Long requestTimeoutMillis = httpTimeoutCapabilityConfiguration.getRequestTimeoutMillis();
                if (requestTimeoutMillis == null) {
                    requestTimeoutMillis = httpTimeout.requestTimeoutMillis;
                }
                httpTimeoutCapabilityConfiguration.setRequestTimeoutMillis(requestTimeoutMillis);
                Long requestTimeoutMillis2 = httpTimeoutCapabilityConfiguration.getRequestTimeoutMillis();
                if (requestTimeoutMillis2 == null) {
                    requestTimeoutMillis2 = httpTimeout.requestTimeoutMillis;
                }
                if (requestTimeoutMillis2 != null && requestTimeoutMillis2.longValue() != Long.MAX_VALUE) {
                    httpRequestBuilder.getExecutionContext().invokeOnCompletion(new HttpTimeout$Plugin$install$1$1$1(BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new HttpTimeout$Plugin$install$1$1$killer$1(requestTimeoutMillis2, httpRequestBuilder, httpRequestBuilder.getExecutionContext(), null), 3, null)));
                }
            }
            this.L$0 = null;
            this.label = 2;
            Object objExecute2 = sender.execute(httpRequestBuilder, this);
            if (objExecute2 != coroutine_suspended) {
                return objExecute2;
            }
        }
        return coroutine_suspended;
    }
}
