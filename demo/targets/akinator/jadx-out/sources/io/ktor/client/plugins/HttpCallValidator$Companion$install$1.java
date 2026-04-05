package io.ktor.client.plugins;

import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.jvm.internal.f0;
import kv.a;
import kv.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$1", f = "HttpCallValidator.kt", i = {0, 1}, l = {130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {"$this$intercept", "unwrappedCause"}, s = {"L$0", "L$0"})
/* loaded from: classes7.dex */
public final class HttpCallValidator$Companion$install$1 extends n implements q {
    final /* synthetic */ HttpCallValidator $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.HttpCallValidator$Companion$install$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements a {
        final /* synthetic */ HttpCallValidator $plugin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpCallValidator httpCallValidator) {
            super(0);
            this.$plugin = httpCallValidator;
        }

        @Override // kv.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.$plugin.expectSuccess);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidator$Companion$install$1(HttpCallValidator httpCallValidator, d<? super HttpCallValidator$Companion$install$1> dVar) {
        super(3, dVar);
        this.$plugin = httpCallValidator;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
        HttpCallValidator$Companion$install$1 httpCallValidator$Companion$install$1 = new HttpCallValidator$Companion$install$1(this.$plugin, dVar);
        httpCallValidator$Companion$install$1.L$0 = pipelineContext;
        httpCallValidator$Companion$install$1.L$1 = obj;
        return httpCallValidator$Companion$install$1.invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
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
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L16
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L16:
            java.lang.Object r0 = r8.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            tu.a0.throwOnFailure(r9)
            goto L74
        L1e:
            java.lang.Object r1 = r8.L$0
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L26
            goto L55
        L26:
            r9 = move-exception
            goto L58
        L28:
            tu.a0.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            java.lang.Object r9 = r8.L$1
            java.lang.Object r4 = r1.getContext()     // Catch: java.lang.Throwable -> L26
            io.ktor.client.request.HttpRequestBuilder r4 = (io.ktor.client.request.HttpRequestBuilder) r4     // Catch: java.lang.Throwable -> L26
            io.ktor.util.Attributes r4 = r4.getAttributes()     // Catch: java.lang.Throwable -> L26
            io.ktor.util.AttributeKey r5 = io.ktor.client.plugins.HttpCallValidatorKt.getExpectSuccessAttributeKey()     // Catch: java.lang.Throwable -> L26
            io.ktor.client.plugins.HttpCallValidator$Companion$install$1$1 r6 = new io.ktor.client.plugins.HttpCallValidator$Companion$install$1$1     // Catch: java.lang.Throwable -> L26
            io.ktor.client.plugins.HttpCallValidator r7 = r8.$plugin     // Catch: java.lang.Throwable -> L26
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L26
            r4.computeIfAbsent(r5, r6)     // Catch: java.lang.Throwable -> L26
            r8.L$0 = r1     // Catch: java.lang.Throwable -> L26
            r8.label = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r9 = r1.proceedWith(r9, r8)     // Catch: java.lang.Throwable -> L26
            if (r9 != r0) goto L55
            goto L72
        L55:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        L58:
            java.lang.Throwable r9 = io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(r9)
            io.ktor.client.plugins.HttpCallValidator r3 = r8.$plugin
            java.lang.Object r1 = r1.getContext()
            io.ktor.client.request.HttpRequestBuilder r1 = (io.ktor.client.request.HttpRequestBuilder) r1
            io.ktor.client.plugins.HttpCallValidatorKt$HttpRequest$1 r1 = io.ktor.client.plugins.HttpCallValidatorKt.access$HttpRequest(r1)
            r8.L$0 = r9
            r8.label = r2
            java.lang.Object r1 = io.ktor.client.plugins.HttpCallValidator.access$processException(r3, r9, r1, r8)
            if (r1 != r0) goto L73
        L72:
            return r0
        L73:
            r0 = r9
        L74:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpCallValidator$Companion$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
