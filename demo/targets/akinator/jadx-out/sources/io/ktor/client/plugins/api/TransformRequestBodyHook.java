package io.ktor.client.plugins.api;

import bv.f;
import bv.n;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.jvm.internal.e0;
import kv.q;
import kv.s;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TransformRequestBodyHook implements ClientHook<s> {
    public static final TransformRequestBodyHook INSTANCE = new TransformRequestBodyHook();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.api.TransformRequestBodyHook$install$1", f = "KtorCallContexts.kt", i = {0}, l = {82, 83}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.api.TransformRequestBodyHook$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        final /* synthetic */ s $handler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(s sVar, d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.$handler = sVar;
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, dVar);
            anonymousClass1.L$0 = pipelineContext;
            return anonymousClass1.invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            if (r1.proceedWith(r11, r10) == r0) goto L17;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                tu.a0.throwOnFailure(r11)
                r9 = r10
                goto L61
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                java.lang.Object r1 = r10.L$0
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                tu.a0.throwOnFailure(r11)
                r9 = r10
                goto L51
            L24:
                tu.a0.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                r1 = r11
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                kv.s r4 = r10.$handler
                io.ktor.client.plugins.api.TransformRequestBodyContext r5 = new io.ktor.client.plugins.api.TransformRequestBodyContext
                r5.<init>()
                java.lang.Object r6 = r1.getContext()
                java.lang.Object r7 = r1.getSubject()
                java.lang.Object r11 = r1.getContext()
                io.ktor.client.request.HttpRequestBuilder r11 = (io.ktor.client.request.HttpRequestBuilder) r11
                io.ktor.util.reflect.TypeInfo r8 = r11.getBodyType()
                r10.L$0 = r1
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.invoke(r5, r6, r7, r8, r9)
                if (r11 != r0) goto L51
                goto L60
            L51:
                io.ktor.http.content.OutgoingContent r11 = (io.ktor.http.content.OutgoingContent) r11
                if (r11 == 0) goto L61
                r3 = 0
                r9.L$0 = r3
                r9.label = r2
                java.lang.Object r11 = r1.proceedWith(r11, r10)
                if (r11 != r0) goto L61
            L60:
                return r0
            L61:
                tu.x0 r11 = tu.x0.f87415a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.TransformRequestBodyHook.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private TransformRequestBodyHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, s handler) {
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(handler, "handler");
        client.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getTransform(), new AnonymousClass1(handler, null));
    }
}
