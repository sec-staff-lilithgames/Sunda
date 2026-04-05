package io.ktor.client.plugins;

import bv.f;
import bv.n;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.pipeline.PipelineContext;
import kv.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", i = {0}, l = {104, 105}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes7.dex */
public final class HttpSend$Plugin$install$1 extends n implements q {
    final /* synthetic */ HttpSend $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpSend$Plugin$install$1(HttpSend httpSend, HttpClient httpClient, d<? super HttpSend$Plugin$install$1> dVar) {
        super(3, dVar);
        this.$plugin = httpSend;
        this.$scope = httpClient;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
        HttpSend$Plugin$install$1 httpSend$Plugin$install$1 = new HttpSend$Plugin$install$1(this.$plugin, this.$scope, dVar);
        httpSend$Plugin$install$1.L$0 = pipelineContext;
        httpSend$Plugin$install$1.L$1 = obj;
        return httpSend$Plugin$install$1.invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        if (r1.proceedWith((io.ktor.client.call.HttpClientCall) r11, r10) == r0) goto L21;
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
            r4 = 0
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            tu.a0.throwOnFailure(r11)
            goto Lad
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            java.lang.Object r1 = r10.L$0
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            tu.a0.throwOnFailure(r11)
            goto La0
        L25:
            tu.a0.throwOnFailure(r11)
            java.lang.Object r11 = r10.L$0
            r1 = r11
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            java.lang.Object r11 = r10.L$1
            boolean r5 = r11 instanceof io.ktor.http.content.OutgoingContent
            if (r5 == 0) goto Lb0
            java.lang.Object r5 = r1.getContext()
            io.ktor.client.request.HttpRequestBuilder r5 = (io.ktor.client.request.HttpRequestBuilder) r5
            r5.setBody(r11)
            r5.setBodyType(r4)
            io.ktor.client.plugins.HttpSend$DefaultSender r11 = new io.ktor.client.plugins.HttpSend$DefaultSender
            io.ktor.client.plugins.HttpSend r5 = r10.$plugin
            int r5 = io.ktor.client.plugins.HttpSend.access$getMaxSendCount$p(r5)
            io.ktor.client.HttpClient r6 = r10.$scope
            r11.<init>(r5, r6)
            kotlin.jvm.internal.b1 r5 = new kotlin.jvm.internal.b1
            r5.<init>()
            r5.f71816b = r11
            io.ktor.client.plugins.HttpSend r11 = r10.$plugin
            java.util.List r11 = io.ktor.client.plugins.HttpSend.access$getInterceptors$p(r11)
            int r11 = uu.p0.getLastIndex(r11)
            r6 = 0
            qv.k r11 = qv.v.downTo(r11, r6)
            io.ktor.client.plugins.HttpSend r6 = r10.$plugin
            java.util.Iterator r11 = r11.iterator()
        L68:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L8b
            r7 = r11
            uu.j1 r7 = (uu.j1) r7
            int r7 = r7.nextInt()
            java.util.List r8 = io.ktor.client.plugins.HttpSend.access$getInterceptors$p(r6)
            java.lang.Object r7 = r8.get(r7)
            kv.q r7 = (kv.q) r7
            io.ktor.client.plugins.HttpSend$InterceptedSender r8 = new io.ktor.client.plugins.HttpSend$InterceptedSender
            java.lang.Object r9 = r5.f71816b
            io.ktor.client.plugins.Sender r9 = (io.ktor.client.plugins.Sender) r9
            r8.<init>(r7, r9)
            r5.f71816b = r8
            goto L68
        L8b:
            java.lang.Object r11 = r5.f71816b
            io.ktor.client.plugins.Sender r11 = (io.ktor.client.plugins.Sender) r11
            java.lang.Object r5 = r1.getContext()
            io.ktor.client.request.HttpRequestBuilder r5 = (io.ktor.client.request.HttpRequestBuilder) r5
            r10.L$0 = r1
            r10.label = r3
            java.lang.Object r11 = r11.execute(r5, r10)
            if (r11 != r0) goto La0
            goto Lac
        La0:
            io.ktor.client.call.HttpClientCall r11 = (io.ktor.client.call.HttpClientCall) r11
            r10.L$0 = r4
            r10.label = r2
            java.lang.Object r11 = r1.proceedWith(r11, r10)
            if (r11 != r0) goto Lad
        Lac:
            return r0
        Lad:
            tu.x0 r11 = tu.x0.f87415a
            return r11
        Lb0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "\n|Fail to prepare request body for sending. \n|The body type is: "
            r0.<init>(r2)
            java.lang.Class r11 = r11.getClass()
            kotlin.reflect.KClass r11 = kotlin.jvm.internal.c1.getOrCreateKotlinClass(r11)
            r0.append(r11)
            java.lang.String r11 = ", with Content-Type: "
            r0.append(r11)
            java.lang.Object r11 = r1.getContext()
            io.ktor.http.HttpMessageBuilder r11 = (io.ktor.http.HttpMessageBuilder) r11
            io.ktor.http.ContentType r11 = io.ktor.http.HttpMessagePropertiesKt.contentType(r11)
            r0.append(r11)
            java.lang.String r11 = ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r11 = sv.d0.trimMargin$default(r11, r4, r3, r4)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpSend$Plugin$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
