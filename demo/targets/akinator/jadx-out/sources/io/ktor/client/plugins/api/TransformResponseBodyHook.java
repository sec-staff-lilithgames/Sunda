package io.ktor.client.plugins.api;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.content.NullBody;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.internal.e0;
import kv.q;
import kv.s;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TransformResponseBodyHook implements ClientHook<s> {
    public static final TransformResponseBodyHook INSTANCE = new TransformResponseBodyHook();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.api.TransformResponseBodyHook$install$1", f = "KtorCallContexts.kt", i = {0, 0}, l = {108, 115}, m = "invokeSuspend", n = {"$this$intercept", "typeInfo"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.api.TransformResponseBodyHook$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        final /* synthetic */ s $handler;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(s sVar, d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.$handler = sVar;
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, d<? super x0> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, dVar);
            anonymousClass1.L$0 = pipelineContext;
            return anonymousClass1.invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            PipelineContext pipelineContext;
            TypeInfo typeInfo;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                HttpResponseContainer httpResponseContainer = (HttpResponseContainer) pipelineContext2.getSubject();
                TypeInfo typeInfoComponent1 = httpResponseContainer.component1();
                Object objComponent2 = httpResponseContainer.component2();
                if (!(objComponent2 instanceof ByteReadChannel)) {
                    return x0Var;
                }
                s sVar = this.$handler;
                TransformResponseBodyContext transformResponseBodyContext = new TransformResponseBodyContext();
                HttpResponse response = ((HttpClientCall) pipelineContext2.getContext()).getResponse();
                this.L$0 = pipelineContext2;
                this.L$1 = typeInfoComponent1;
                this.label = 1;
                anonymousClass1 = this;
                Object objInvoke = sVar.invoke(transformResponseBodyContext, response, objComponent2, typeInfoComponent1, anonymousClass1);
                if (objInvoke != coroutine_suspended) {
                    pipelineContext = pipelineContext2;
                    obj = objInvoke;
                    typeInfo = typeInfoComponent1;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    a0.throwOnFailure(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            typeInfo = (TypeInfo) this.L$1;
            pipelineContext = (PipelineContext) this.L$0;
            a0.throwOnFailure(obj);
            anonymousClass1 = this;
            if (obj == null) {
                return x0Var;
            }
            if ((obj instanceof NullBody) || typeInfo.getType().isInstance(obj)) {
                HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(typeInfo, obj);
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                return pipelineContext.proceedWith(httpResponseContainer2, this) == coroutine_suspended ? coroutine_suspended : x0Var;
            }
            throw new IllegalStateException("transformResponseBody returned " + obj + " but expected value of type " + typeInfo);
        }
    }

    private TransformResponseBodyHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, s handler) {
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(handler, "handler");
        client.getResponsePipeline().intercept(HttpResponsePipeline.Phases.getTransform(), new AnonymousClass1(handler, null));
    }
}
