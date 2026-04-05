package io.ktor.client.engine;

import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ClientEventsKt;
import io.ktor.util.InternalAPI;
import io.ktor.util.pipeline.PipelineContext;
import java.io.Closeable;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kv.l;
import kv.q;
import tu.x0;
import uu.c2;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface HttpClientEngine extends CoroutineScope, Closeable {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        /* JADX INFO: Access modifiers changed from: private */
        public static void checkExtensions(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData) {
            for (HttpClientEngineCapability<?> httpClientEngineCapability : httpRequestData.getRequiredCapabilities$ktor_client_core()) {
                if (!httpClientEngine.getSupportedCapabilities().contains(httpClientEngineCapability)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + httpClientEngineCapability).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object executeWithinCallContext(io.ktor.client.engine.HttpClientEngine r10, io.ktor.client.request.HttpRequestData r11, zu.d<? super io.ktor.client.request.HttpResponseData> r12) {
            /*
                boolean r0 = r12 instanceof io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1
                if (r0 == 0) goto L13
                r0 = r12
                io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1 r0 = (io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1 r0 = new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                tu.a0.throwOnFailure(r12)
                return r12
            L2c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L34:
                java.lang.Object r10 = r0.L$1
                r11 = r10
                io.ktor.client.request.HttpRequestData r11 = (io.ktor.client.request.HttpRequestData) r11
                java.lang.Object r10 = r0.L$0
                io.ktor.client.engine.HttpClientEngine r10 = (io.ktor.client.engine.HttpClientEngine) r10
                tu.a0.throwOnFailure(r12)
            L40:
                r4 = r10
                goto L56
            L42:
                tu.a0.throwOnFailure(r12)
                kotlinx.coroutines.Job r12 = r11.getExecutionContext()
                r0.L$0 = r10
                r0.L$1 = r11
                r0.label = r4
                java.lang.Object r12 = io.ktor.client.engine.HttpClientEngineKt.createCallContext(r10, r12, r0)
                if (r12 != r1) goto L40
                goto L7a
            L56:
                zu.m r12 = (zu.m) r12
                io.ktor.client.engine.KtorCallContextElement r10 = new io.ktor.client.engine.KtorCallContextElement
                r10.<init>(r12)
                zu.m r5 = r12.plus(r10)
                io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2 r7 = new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2
                r10 = 0
                r7.<init>(r4, r11, r10)
                r8 = 2
                r9 = 0
                r6 = 0
                kotlinx.coroutines.Deferred r11 = kotlinx.coroutines.BuildersKt.async$default(r4, r5, r6, r7, r8, r9)
                r0.L$0 = r10
                r0.L$1 = r10
                r0.label = r3
                java.lang.Object r10 = r11.await(r0)
                if (r10 != r1) goto L7b
            L7a:
                return r1
            L7b:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.HttpClientEngine.DefaultImpls.executeWithinCallContext(io.ktor.client.engine.HttpClientEngine, io.ktor.client.request.HttpRequestData, zu.d):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean getClosed(HttpClientEngine httpClientEngine) {
            return !(((Job) httpClientEngine.getCoroutineContext().get(Job.Key)) != null ? r1.isActive() : false);
        }

        public static Set<HttpClientEngineCapability<?>> getSupportedCapabilities(HttpClientEngine httpClientEngine) {
            return c2.emptySet();
        }

        @InternalAPI
        public static void install(HttpClientEngine httpClientEngine, HttpClient client) {
            e0.checkNotNullParameter(client, "client");
            client.getSendPipeline().intercept(HttpSendPipeline.Phases.getEngine(), new AnonymousClass1(client, httpClientEngine, null));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", i = {0, 0}, l = {TokenParametersOuterClass$TokenParameters.COPPAAPPLIES_FIELD_NUMBER, 82}, m = "invokeSuspend", n = {"$this$intercept", "requestData"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.engine.HttpClientEngine$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        final /* synthetic */ HttpClient $client;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ HttpClientEngine this$0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.ktor.client.engine.HttpClientEngine$install$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05851 extends f0 implements l {
            final /* synthetic */ HttpClient $client;
            final /* synthetic */ HttpResponse $response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05851(HttpClient httpClient, HttpResponse httpResponse) {
                super(1);
                this.$client = httpClient;
                this.$response = httpResponse;
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return x0.f87415a;
            }

            public final void invoke(Throwable th2) {
                if (th2 != null) {
                    this.$client.getMonitor().raise(ClientEventsKt.getHttpResponseCancelled(), this.$response);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpClient httpClient, HttpClientEngine httpClientEngine, d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.$client = httpClient;
            this.this$0 = httpClientEngine;
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$client, this.this$0, dVar);
            anonymousClass1.L$0 = pipelineContext;
            anonymousClass1.L$1 = obj;
            return anonymousClass1.invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00f0, code lost:
        
            if (r3.proceedWith(r5, r9) == r0) goto L23;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L29
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                tu.a0.throwOnFailure(r10)
                goto Lf3
            L14:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1c:
                java.lang.Object r1 = r9.L$1
                io.ktor.client.request.HttpRequestData r1 = (io.ktor.client.request.HttpRequestData) r1
                java.lang.Object r3 = r9.L$0
                io.ktor.util.pipeline.PipelineContext r3 = (io.ktor.util.pipeline.PipelineContext) r3
                tu.a0.throwOnFailure(r10)
                goto Lba
            L29:
                tu.a0.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                io.ktor.util.pipeline.PipelineContext r10 = (io.ktor.util.pipeline.PipelineContext) r10
                java.lang.Object r1 = r9.L$1
                io.ktor.client.request.HttpRequestBuilder r5 = new io.ktor.client.request.HttpRequestBuilder
                r5.<init>()
                java.lang.Object r6 = r10.getContext()
                io.ktor.client.request.HttpRequestBuilder r6 = (io.ktor.client.request.HttpRequestBuilder) r6
                r5.takeFromWithExecutionContext(r6)
                java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                if (r1 != 0) goto L5d
                io.ktor.http.content.NullBody r1 = io.ktor.http.content.NullBody.INSTANCE
                r5.setBody(r1)
                kotlin.reflect.KType r1 = kotlin.jvm.internal.c1.typeOf(r6)
                java.lang.reflect.Type r7 = kotlin.reflect.TypesJVMKt.getJavaType(r1)
                kotlin.reflect.KClass r6 = kotlin.jvm.internal.c1.getOrCreateKotlinClass(r6)
                io.ktor.util.reflect.TypeInfo r1 = io.ktor.util.reflect.TypeInfoJvmKt.typeInfoImpl(r7, r6, r1)
                r5.setBodyType(r1)
                goto L7e
            L5d:
                boolean r7 = r1 instanceof io.ktor.http.content.OutgoingContent
                if (r7 == 0) goto L68
                r5.setBody(r1)
                r5.setBodyType(r4)
                goto L7e
            L68:
                r5.setBody(r1)
                kotlin.reflect.KType r1 = kotlin.jvm.internal.c1.typeOf(r6)
                java.lang.reflect.Type r7 = kotlin.reflect.TypesJVMKt.getJavaType(r1)
                kotlin.reflect.KClass r6 = kotlin.jvm.internal.c1.getOrCreateKotlinClass(r6)
                io.ktor.util.reflect.TypeInfo r1 = io.ktor.util.reflect.TypeInfoJvmKt.typeInfoImpl(r7, r6, r1)
                r5.setBodyType(r1)
            L7e:
                io.ktor.client.HttpClient r1 = r9.$client
                io.ktor.events.Events r1 = r1.getMonitor()
                io.ktor.events.EventDefinition r6 = io.ktor.client.utils.ClientEventsKt.getHttpRequestIsReadyForSending()
                r1.raise(r6, r5)
                io.ktor.client.request.HttpRequestData r1 = r5.build()
                io.ktor.client.HttpClient r5 = r9.$client
                io.ktor.util.Attributes r6 = r1.getAttributes()
                io.ktor.util.AttributeKey r7 = io.ktor.client.engine.HttpClientEngineKt.getCLIENT_CONFIG()
                io.ktor.client.HttpClientConfig r5 = r5.getConfig$ktor_client_core()
                r6.put(r7, r5)
                io.ktor.client.engine.HttpClientEngineKt.access$validateHeaders(r1)
                io.ktor.client.engine.HttpClientEngine r5 = r9.this$0
                io.ktor.client.engine.HttpClientEngine.DefaultImpls.access$checkExtensions(r5, r1)
                io.ktor.client.engine.HttpClientEngine r5 = r9.this$0
                r9.L$0 = r10
                r9.L$1 = r1
                r9.label = r3
                java.lang.Object r3 = io.ktor.client.engine.HttpClientEngine.DefaultImpls.access$executeWithinCallContext(r5, r1, r9)
                if (r3 != r0) goto Lb7
                goto Lf2
            Lb7:
                r8 = r3
                r3 = r10
                r10 = r8
            Lba:
                io.ktor.client.request.HttpResponseData r10 = (io.ktor.client.request.HttpResponseData) r10
                io.ktor.client.call.HttpClientCall r5 = new io.ktor.client.call.HttpClientCall
                io.ktor.client.HttpClient r6 = r9.$client
                r5.<init>(r6, r1, r10)
                io.ktor.client.statement.HttpResponse r10 = r5.getResponse()
                io.ktor.client.HttpClient r1 = r9.$client
                io.ktor.events.Events r1 = r1.getMonitor()
                io.ktor.events.EventDefinition r6 = io.ktor.client.utils.ClientEventsKt.getHttpResponseReceived()
                r1.raise(r6, r10)
                zu.m r1 = r10.getCoroutineContext()
                kotlinx.coroutines.Job r1 = kotlinx.coroutines.JobKt.getJob(r1)
                io.ktor.client.engine.HttpClientEngine$install$1$1 r6 = new io.ktor.client.engine.HttpClientEngine$install$1$1
                io.ktor.client.HttpClient r7 = r9.$client
                r6.<init>(r7, r10)
                r1.invokeOnCompletion(r6)
                r9.L$0 = r4
                r9.L$1 = r4
                r9.label = r2
                java.lang.Object r10 = r3.proceedWith(r5, r9)
                if (r10 != r0) goto Lf3
            Lf2:
                return r0
            Lf3:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.HttpClientEngine.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InternalAPI
    Object execute(HttpRequestData httpRequestData, d<? super HttpResponseData> dVar);

    HttpClientEngineConfig getConfig();

    CoroutineDispatcher getDispatcher();

    Set<HttpClientEngineCapability<?>> getSupportedCapabilities();

    @InternalAPI
    void install(HttpClient httpClient);
}
