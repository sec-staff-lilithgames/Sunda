package io.ktor.client.plugins.api;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.jvm.internal.e0;
import kv.q;
import kv.r;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RequestHook implements ClientHook<r> {
    public static final RequestHook INSTANCE = new RequestHook();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.api.RequestHook$install$1", f = "KtorCallContexts.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.api.RequestHook$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        final /* synthetic */ r $handler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(r rVar, d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.$handler = rVar;
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, dVar);
            anonymousClass1.L$0 = pipelineContext;
            return anonymousClass1.invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                PipelineContext pipelineContext = (PipelineContext) this.L$0;
                r rVar = this.$handler;
                OnRequestContext onRequestContext = new OnRequestContext();
                Object context = pipelineContext.getContext();
                Object subject = pipelineContext.getSubject();
                this.label = 1;
                if (rVar.invoke(onRequestContext, context, subject, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    private RequestHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, r handler) {
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(handler, "handler");
        client.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getState(), new AnonymousClass1(handler, null));
    }
}
