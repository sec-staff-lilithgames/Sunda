package io.ktor.client.plugins.api;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.services.core.request.NJc.yFkbx;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.jvm.internal.e0;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class SendingRequest implements ClientHook<q> {
    public static final SendingRequest INSTANCE = new SendingRequest();

    private SendingRequest() {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.api.SendingRequest$install$1", f = "CommonHooks.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.api.SendingRequest$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        final /* synthetic */ q $handler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.$handler = qVar;
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
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.throwOnFailure(obj);
                PipelineContext pipelineContext = (PipelineContext) this.L$0;
                q qVar = this.$handler;
                Object context = pipelineContext.getContext();
                Object subject = pipelineContext.getSubject();
                e0.checkNotNull(subject, yFkbx.rwBRGYEDKaTe);
                this.label = 1;
                if (qVar.invoke(context, (OutgoingContent) subject, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return x0.f87415a;
        }
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, q handler) {
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(handler, "handler");
        client.getSendPipeline().intercept(HttpSendPipeline.Phases.getState(), new AnonymousClass1(handler, null));
    }
}
