package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import kv.q;
import kv.r;
import tu.f;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpSend {
    public static final Plugin Plugin = new Plugin(null);
    private static final AttributeKey<HttpSend> key = new AttributeKey<>("HttpSend");
    private final List<q> interceptors;
    private final int maxSendCount;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Config {
        private int maxSendCount = 20;

        public final int getMaxSendCount() {
            return this.maxSendCount;
        }

        public final void setMaxSendCount(int i10) {
            this.maxSendCount = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultSender implements Sender {
        private final HttpClient client;
        private HttpClientCall currentCall;
        private final int maxSendCount;
        private int sentCount;

        public DefaultSender(int i10, HttpClient client) {
            e0.checkNotNullParameter(client, "client");
            this.maxSendCount = i10;
            this.client = client;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // io.ktor.client.plugins.Sender
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object execute(io.ktor.client.request.HttpRequestBuilder r6, zu.d<? super io.ktor.client.call.HttpClientCall> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof io.ktor.client.plugins.HttpSend$DefaultSender$execute$1
                if (r0 == 0) goto L13
                r0 = r7
                io.ktor.client.plugins.HttpSend$DefaultSender$execute$1 r0 = (io.ktor.client.plugins.HttpSend$DefaultSender$execute$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                io.ktor.client.plugins.HttpSend$DefaultSender$execute$1 r0 = new io.ktor.client.plugins.HttpSend$DefaultSender$execute$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L36
                if (r2 != r4) goto L2e
                java.lang.Object r6 = r0.L$0
                io.ktor.client.plugins.HttpSend$DefaultSender r6 = (io.ktor.client.plugins.HttpSend.DefaultSender) r6
                tu.a0.throwOnFailure(r7)
                goto L5f
            L2e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L36:
                tu.a0.throwOnFailure(r7)
                io.ktor.client.call.HttpClientCall r7 = r5.currentCall
                if (r7 == 0) goto L40
                kotlinx.coroutines.CoroutineScopeKt.cancel$default(r7, r3, r4, r3)
            L40:
                int r7 = r5.sentCount
                int r2 = r5.maxSendCount
                if (r7 >= r2) goto L77
                int r7 = r7 + r4
                r5.sentCount = r7
                io.ktor.client.HttpClient r7 = r5.client
                io.ktor.client.request.HttpSendPipeline r7 = r7.getSendPipeline()
                java.lang.Object r2 = r6.getBody()
                r0.L$0 = r5
                r0.label = r4
                java.lang.Object r7 = r7.execute(r6, r2, r0)
                if (r7 != r1) goto L5e
                return r1
            L5e:
                r6 = r5
            L5f:
                boolean r0 = r7 instanceof io.ktor.client.call.HttpClientCall
                if (r0 == 0) goto L66
                r3 = r7
                io.ktor.client.call.HttpClientCall r3 = (io.ktor.client.call.HttpClientCall) r3
            L66:
                if (r3 == 0) goto L6b
                r6.currentCall = r3
                return r3
            L6b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
                java.lang.String r7 = p0.o2.o(r7, r0)
                r6.<init>(r7)
                throw r6
            L77:
                io.ktor.client.plugins.SendCountExceedException r6 = new io.ktor.client.plugins.SendCountExceedException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r0 = "Max send count "
                r7.<init>(r0)
                int r0 = r5.maxSendCount
                java.lang.String r1 = " exceeded. Consider increasing the property maxSendCount if more is required."
                java.lang.String r7 = a.b.f(r0, r1, r7)
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpSend.DefaultSender.execute(io.ktor.client.request.HttpRequestBuilder, zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class InterceptedSender implements Sender {
        private final q interceptor;
        private final Sender nextSender;

        public InterceptedSender(q interceptor, Sender nextSender) {
            e0.checkNotNullParameter(interceptor, "interceptor");
            e0.checkNotNullParameter(nextSender, "nextSender");
            this.interceptor = interceptor;
            this.nextSender = nextSender;
        }

        @Override // io.ktor.client.plugins.Sender
        public Object execute(HttpRequestBuilder httpRequestBuilder, d<? super HttpClientCall> dVar) {
            return this.interceptor.invoke(this.nextSender, httpRequestBuilder, dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Plugin implements HttpClientPlugin<Config, HttpSend> {
        public /* synthetic */ Plugin(u uVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpSend> getKey() {
            return HttpSend.key;
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpSend plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getSend(), new HttpSend$Plugin$install$1(plugin, scope, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpSend prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpSend(config.getMaxSendCount(), null);
        }
    }

    public /* synthetic */ HttpSend(int i10, u uVar) {
        this(i10);
    }

    @f
    public final void intercept(r block) {
        e0.checkNotNullParameter(block, "block");
        throw new IllegalStateException("This interceptors do not allow to intercept original call. Please use another overload and call `this.execute(request)` manually");
    }

    private HttpSend(int i10) {
        this.maxSendCount = i10;
        this.interceptors = new ArrayList();
    }

    public final void intercept(q block) {
        e0.checkNotNullParameter(block, "block");
        this.interceptors.add(block);
    }

    public /* synthetic */ HttpSend(int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 20 : i10);
    }

    private static /* synthetic */ void getInterceptors$annotations() {
    }
}
