package io.ktor.client.plugins;

import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.util.pipeline.PipelineContext;
import kv.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$2", f = "HttpPlainText.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 138}, m = "invokeSuspend", n = {"$this$intercept", "info"}, s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
public final class HttpPlainText$Plugin$install$2 extends n implements q {
    final /* synthetic */ HttpPlainText $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainText$Plugin$install$2(HttpPlainText httpPlainText, d<? super HttpPlainText$Plugin$install$2> dVar) {
        super(3, dVar);
        this.$plugin = httpPlainText;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, d<? super x0> dVar) {
        HttpPlainText$Plugin$install$2 httpPlainText$Plugin$install$2 = new HttpPlainText$Plugin$install$2(this.$plugin, dVar);
        httpPlainText$Plugin$install$2.L$0 = pipelineContext;
        httpPlainText$Plugin$install$2.L$1 = httpResponseContainer;
        return httpPlainText$Plugin$install$2.invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008d A[RETURN] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r13.label
            tu.x0 r2 = tu.x0.f87415a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            tu.a0.throwOnFailure(r14)
            r10 = r13
            goto L8d
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            java.lang.Object r1 = r13.L$1
            io.ktor.util.reflect.TypeInfo r1 = (io.ktor.util.reflect.TypeInfo) r1
            java.lang.Object r4 = r13.L$0
            io.ktor.util.pipeline.PipelineContext r4 = (io.ktor.util.pipeline.PipelineContext) r4
            tu.a0.throwOnFailure(r14)
            r10 = r13
            goto L6c
        L2b:
            tu.a0.throwOnFailure(r14)
            java.lang.Object r14 = r13.L$0
            io.ktor.util.pipeline.PipelineContext r14 = (io.ktor.util.pipeline.PipelineContext) r14
            java.lang.Object r1 = r13.L$1
            io.ktor.client.statement.HttpResponseContainer r1 = (io.ktor.client.statement.HttpResponseContainer) r1
            io.ktor.util.reflect.TypeInfo r5 = r1.component1()
            java.lang.Object r1 = r1.component2()
            kotlin.reflect.KClass r6 = r5.getType()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            kotlin.reflect.KClass r7 = kotlin.jvm.internal.c1.getOrCreateKotlinClass(r7)
            boolean r6 = kotlin.jvm.internal.e0.areEqual(r6, r7)
            if (r6 == 0) goto L52
            boolean r6 = r1 instanceof io.ktor.utils.io.ByteReadChannel
            if (r6 != 0) goto L54
        L52:
            r10 = r13
            goto L8d
        L54:
            r7 = r1
            io.ktor.utils.io.ByteReadChannel r7 = (io.ktor.utils.io.ByteReadChannel) r7
            r13.L$0 = r14
            r13.L$1 = r5
            r13.label = r4
            r8 = 0
            r11 = 1
            r12 = 0
            r10 = r13
            java.lang.Object r1 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.readRemaining$default(r7, r8, r10, r11, r12)
            if (r1 != r0) goto L69
            goto L8c
        L69:
            r4 = r14
            r14 = r1
            r1 = r5
        L6c:
            io.ktor.utils.io.core.ByteReadPacket r14 = (io.ktor.utils.io.core.ByteReadPacket) r14
            io.ktor.client.plugins.HttpPlainText r5 = r10.$plugin
            java.lang.Object r6 = r4.getContext()
            io.ktor.client.call.HttpClientCall r6 = (io.ktor.client.call.HttpClientCall) r6
            java.lang.String r14 = r5.read$ktor_client_core(r6, r14)
            io.ktor.client.statement.HttpResponseContainer r5 = new io.ktor.client.statement.HttpResponseContainer
            r5.<init>(r1, r14)
            r14 = 0
            r10.L$0 = r14
            r10.L$1 = r14
            r10.label = r3
            java.lang.Object r14 = r4.proceedWith(r5, r13)
            if (r14 != r0) goto L8d
        L8c:
            return r0
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpPlainText$Plugin$install$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
