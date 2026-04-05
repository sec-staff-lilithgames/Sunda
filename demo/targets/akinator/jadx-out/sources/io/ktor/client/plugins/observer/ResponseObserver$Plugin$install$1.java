package io.ktor.client.plugins.observer;

import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.ByteChannelsKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.io.ByteReadChannel;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kv.l;
import kv.p;
import kv.q;
import tu.a0;
import tu.v;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1", f = "ResponseObserver.kt", i = {0, 0, 0}, l = {TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER, 77}, m = "invokeSuspend", n = {"$this$intercept", "newResponse", "sideResponse"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
public final class ResponseObserver$Plugin$install$1 extends n implements q {
    final /* synthetic */ ResponseObserver $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1$1", f = "ResponseObserver.kt", i = {0}, l = {TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ ResponseObserver $plugin;
        final /* synthetic */ HttpResponse $sideResponse;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpResponse httpResponse, ResponseObserver responseObserver, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$sideResponse = httpResponse;
            this.$plugin = responseObserver;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sideResponse, this.$plugin, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        
            if (r8 == r0) goto L29;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                tu.x0 r2 = tu.x0.f87415a
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L14
                goto L69
            L14:
                r8 = move-exception
                goto L77
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L26
                goto L44
            L26:
                r8 = move-exception
                goto L48
            L28:
                tu.a0.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
                io.ktor.client.plugins.observer.ResponseObserver r1 = r7.$plugin
                io.ktor.client.statement.HttpResponse r5 = r7.$sideResponse
                int r6 = tu.z.f87419c     // Catch: java.lang.Throwable -> L26
                kv.p r1 = io.ktor.client.plugins.observer.ResponseObserver.access$getResponseHandler$p(r1)     // Catch: java.lang.Throwable -> L26
                r7.L$0 = r8     // Catch: java.lang.Throwable -> L26
                r7.label = r4     // Catch: java.lang.Throwable -> L26
                java.lang.Object r8 = r1.invoke(r5, r7)     // Catch: java.lang.Throwable -> L26
                if (r8 != r0) goto L44
                goto L68
            L44:
                tu.z.m7131constructorimpl(r2)     // Catch: java.lang.Throwable -> L26
                goto L51
            L48:
                int r1 = tu.z.f87419c
                java.lang.Object r8 = tu.a0.createFailure(r8)
                tu.z.m7131constructorimpl(r8)
            L51:
                io.ktor.client.statement.HttpResponse r8 = r7.$sideResponse
                io.ktor.utils.io.ByteReadChannel r8 = r8.getContent()
                boolean r1 = r8.isClosedForRead()
                if (r1 != 0) goto L80
                r1 = 0
                r7.L$0 = r1     // Catch: java.lang.Throwable -> L14
                r7.label = r3     // Catch: java.lang.Throwable -> L14
                java.lang.Object r8 = io.ktor.utils.io.ByteReadChannelKt.discard(r8, r7)     // Catch: java.lang.Throwable -> L14
                if (r8 != r0) goto L69
            L68:
                return r0
            L69:
                java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L14
                long r0 = r8.longValue()     // Catch: java.lang.Throwable -> L14
                java.lang.Long r8 = bv.b.boxLong(r0)     // Catch: java.lang.Throwable -> L14
                tu.z.m7131constructorimpl(r8)     // Catch: java.lang.Throwable -> L14
                goto L80
            L77:
                int r0 = tu.z.f87419c
                java.lang.Object r8 = tu.a0.createFailure(r8)
                tu.z.m7131constructorimpl(r8)
            L80:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseObserver$Plugin$install$1(ResponseObserver responseObserver, HttpClient httpClient, d<? super ResponseObserver$Plugin$install$1> dVar) {
        super(3, dVar);
        this.$plugin = responseObserver;
        this.$scope = httpClient;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<HttpResponse, x0> pipelineContext, HttpResponse httpResponse, d<? super x0> dVar) {
        ResponseObserver$Plugin$install$1 responseObserver$Plugin$install$1 = new ResponseObserver$Plugin$install$1(this.$plugin, this.$scope, dVar);
        responseObserver$Plugin$install$1.L$0 = pipelineContext;
        responseObserver$Plugin$install$1.L$1 = httpResponse;
        return responseObserver$Plugin$install$1.invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        PipelineContext pipelineContext;
        HttpResponse httpResponse;
        HttpResponse httpResponse2;
        HttpClient httpClient;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        x0 x0Var = x0.f87415a;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            pipelineContext = (PipelineContext) this.L$0;
            HttpResponse httpResponse3 = (HttpResponse) this.L$1;
            l lVar = this.$plugin.filter;
            if (lVar != null && !((Boolean) lVar.invoke(httpResponse3.getCall())).booleanValue()) {
                return x0Var;
            }
            v vVarSplit = ByteChannelsKt.split(httpResponse3.getContent(), httpResponse3);
            ByteReadChannel byteReadChannel = (ByteReadChannel) vVarSplit.component1();
            HttpResponse response = DelegatedCallKt.wrapWithContent(httpResponse3.getCall(), (ByteReadChannel) vVarSplit.component2()).getResponse();
            HttpResponse response2 = DelegatedCallKt.wrapWithContent(httpResponse3.getCall(), byteReadChannel).getResponse();
            HttpClient httpClient2 = this.$scope;
            this.L$0 = pipelineContext;
            this.L$1 = response;
            this.L$2 = response2;
            this.L$3 = httpClient2;
            this.label = 1;
            Object responseObserverContext = ResponseObserverContextJvmKt.getResponseObserverContext(this);
            if (responseObserverContext != coroutine_suspended) {
                httpResponse = response;
                httpResponse2 = response2;
                obj = responseObserverContext;
                httpClient = httpClient2;
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                a0.throwOnFailure(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ?? r12 = (CoroutineScope) this.L$3;
        HttpResponse httpResponse4 = (HttpResponse) this.L$2;
        HttpResponse httpResponse5 = (HttpResponse) this.L$1;
        pipelineContext = (PipelineContext) this.L$0;
        a0.throwOnFailure(obj);
        httpClient = r12;
        httpResponse2 = httpResponse4;
        httpResponse = httpResponse5;
        PipelineContext pipelineContext2 = pipelineContext;
        BuildersKt__Builders_commonKt.launch$default(httpClient, (m) obj, null, new AnonymousClass1(httpResponse2, this.$plugin, null), 2, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        return pipelineContext2.proceedWith(httpResponse, this) == coroutine_suspended ? coroutine_suspended : x0Var;
    }
}
