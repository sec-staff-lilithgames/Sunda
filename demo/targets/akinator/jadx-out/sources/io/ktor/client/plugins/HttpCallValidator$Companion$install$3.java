package io.ktor.client.plugins;

import androidx.core.app.NotificationCompat;
import av.e;
import bv.f;
import bv.n;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$3", f = "HttpCallValidator.kt", i = {1}, l = {151, 152}, m = "invokeSuspend", n = {NotificationCompat.CATEGORY_CALL}, s = {"L$0"})
/* loaded from: classes7.dex */
public final class HttpCallValidator$Companion$install$3 extends n implements q {
    final /* synthetic */ HttpCallValidator $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidator$Companion$install$3(HttpCallValidator httpCallValidator, d<? super HttpCallValidator$Companion$install$3> dVar) {
        super(3, dVar);
        this.$plugin = httpCallValidator;
    }

    @Override // kv.q
    public final Object invoke(Sender sender, HttpRequestBuilder httpRequestBuilder, d<? super HttpClientCall> dVar) {
        HttpCallValidator$Companion$install$3 httpCallValidator$Companion$install$3 = new HttpCallValidator$Companion$install$3(this.$plugin, dVar);
        httpCallValidator$Companion$install$3.L$0 = sender;
        httpCallValidator$Companion$install$3.L$1 = httpRequestBuilder;
        return httpCallValidator$Companion$install$3.invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            Sender sender = (Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            this.L$0 = null;
            this.label = 1;
            obj = sender.execute(httpRequestBuilder, this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            HttpClientCall httpClientCall = (HttpClientCall) this.L$0;
            a0.throwOnFailure(obj);
            return httpClientCall;
        }
        a0.throwOnFailure(obj);
        HttpClientCall httpClientCall2 = (HttpClientCall) obj;
        HttpCallValidator httpCallValidator = this.$plugin;
        HttpResponse response = httpClientCall2.getResponse();
        this.L$0 = httpClientCall2;
        this.label = 2;
        return httpCallValidator.validateResponse(response, this) == coroutine_suspended ? coroutine_suspended : httpClientCall2;
    }
}
