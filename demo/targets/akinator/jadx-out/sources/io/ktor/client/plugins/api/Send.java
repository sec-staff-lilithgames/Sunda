package io.ktor.client.plugins.api;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.HttpSend;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.jvm.internal.e0;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Send implements ClientHook<q> {
    public static final Send INSTANCE = new Send();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Sender {
        private final io.ktor.client.plugins.Sender httpSendSender;

        public Sender(io.ktor.client.plugins.Sender httpSendSender) {
            e0.checkNotNullParameter(httpSendSender, "httpSendSender");
            this.httpSendSender = httpSendSender;
        }

        public final Object proceed(HttpRequestBuilder httpRequestBuilder, d<? super HttpClientCall> dVar) {
            return this.httpSendSender.execute(httpRequestBuilder, dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.api.Send$install$1", f = "CommonHooks.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.api.Send$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        final /* synthetic */ q $handler;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.$handler = qVar;
        }

        @Override // kv.q
        public final Object invoke(io.ktor.client.plugins.Sender sender, HttpRequestBuilder httpRequestBuilder, d<? super HttpClientCall> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, dVar);
            anonymousClass1.L$0 = sender;
            anonymousClass1.L$1 = httpRequestBuilder;
            return anonymousClass1.invokeSuspend(x0.f87415a);
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
            io.ktor.client.plugins.Sender sender = (io.ktor.client.plugins.Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            q qVar = this.$handler;
            Sender sender2 = new Sender(sender);
            this.L$0 = null;
            this.label = 1;
            Object objInvoke = qVar.invoke(sender2, httpRequestBuilder, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
    }

    private Send() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, q handler) {
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(handler, "handler");
        ((HttpSend) HttpClientPluginKt.plugin(client, HttpSend.Plugin)).intercept(new AnonymousClass1(handler, null));
    }
}
