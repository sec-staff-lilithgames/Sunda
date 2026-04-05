package io.ktor.client.plugins;

import bv.f;
import bv.n;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.util.pipeline.PipelineContext;
import kv.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$2", f = "HttpCallValidator.kt", i = {0, 1}, l = {142, 145}, m = "invokeSuspend", n = {"$this$intercept", "unwrappedCause"}, s = {"L$0", "L$0"})
/* loaded from: classes7.dex */
public final class HttpCallValidator$Companion$install$2 extends n implements q {
    final /* synthetic */ HttpCallValidator $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidator$Companion$install$2(HttpCallValidator httpCallValidator, d<? super HttpCallValidator$Companion$install$2> dVar) {
        super(3, dVar);
        this.$plugin = httpCallValidator;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, d<? super x0> dVar) {
        HttpCallValidator$Companion$install$2 httpCallValidator$Companion$install$2 = new HttpCallValidator$Companion$install$2(this.$plugin, dVar);
        httpCallValidator$Companion$install$2.L$0 = pipelineContext;
        httpCallValidator$Companion$install$2.L$1 = httpResponseContainer;
        return httpCallValidator$Companion$install$2.invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.PipelineContext] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L16
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L16:
            java.lang.Object r0 = r4.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            tu.a0.throwOnFailure(r5)
            goto L5e
        L1e:
            java.lang.Object r1 = r4.L$0
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            tu.a0.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L26
            goto L3f
        L26:
            r5 = move-exception
            goto L42
        L28:
            tu.a0.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            java.lang.Object r5 = r4.L$1
            io.ktor.client.statement.HttpResponseContainer r5 = (io.ktor.client.statement.HttpResponseContainer) r5
            r4.L$0 = r1     // Catch: java.lang.Throwable -> L26
            r4.label = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r1.proceedWith(r5, r4)     // Catch: java.lang.Throwable -> L26
            if (r5 != r0) goto L3f
            goto L5c
        L3f:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        L42:
            java.lang.Throwable r5 = io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(r5)
            io.ktor.client.plugins.HttpCallValidator r3 = r4.$plugin
            java.lang.Object r1 = r1.getContext()
            io.ktor.client.call.HttpClientCall r1 = (io.ktor.client.call.HttpClientCall) r1
            io.ktor.client.request.HttpRequest r1 = r1.getRequest()
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r1 = io.ktor.client.plugins.HttpCallValidator.access$processException(r3, r5, r1, r4)
            if (r1 != r0) goto L5d
        L5c:
            return r0
        L5d:
            r0 = r5
        L5e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpCallValidator$Companion$install$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
