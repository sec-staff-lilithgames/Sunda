package io.ktor.client.plugins;

import bv.d;
import bv.f;
import com.ironsource.Me;
import com.vungle.ads.internal.ui.AdActivity;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import io.ktor.util.pipeline.InvalidPhaseException;
import io.ktor.util.pipeline.PipelinePhase;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import kv.p;
import kv.q;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpCallValidator {
    public static final Companion Companion = new Companion(null);
    private static final AttributeKey<HttpCallValidator> key = new AttributeKey<>("HttpResponseValidator");
    private final List<HandlerWrapper> callExceptionHandlers;
    private final boolean expectSuccess;
    private final List<p> responseValidators;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion implements HttpClientPlugin<Config, HttpCallValidator> {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpCallValidator> getKey() {
            return HttpCallValidator.key;
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpCallValidator plugin, HttpClient scope) throws InvalidPhaseException {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getBefore(), new HttpCallValidator$Companion$install$1(plugin, null));
            PipelinePhase pipelinePhase = new PipelinePhase("BeforeReceive");
            scope.getResponsePipeline().insertPhaseBefore(HttpResponsePipeline.Phases.getReceive(), pipelinePhase);
            scope.getResponsePipeline().intercept(pipelinePhase, new HttpCallValidator$Companion$install$2(plugin, null));
            ((HttpSend) HttpClientPluginKt.plugin(scope, HttpSend.Plugin)).intercept(new HttpCallValidator$Companion$install$3(plugin, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpCallValidator prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpCallValidator(y0.reversed(config.getResponseValidators$ktor_client_core()), y0.reversed(config.getResponseExceptionHandlers$ktor_client_core()), config.getExpectSuccess());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", i = {0, 0, 1, 1}, l = {58, 59}, m = "processException", n = {"cause", AdActivity.REQUEST_KEY_EXTRA, "cause", AdActivity.REQUEST_KEY_EXTRA}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.HttpCallValidator$processException$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCallValidator.this.processException(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", i = {0}, l = {51}, m = "validateResponse", n = {Me.f34938n}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.HttpCallValidator$validateResponse$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38971 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C38971(zu.d<? super C38971> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCallValidator.this.validateResponse(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidator(List<? extends p> responseValidators, List<? extends HandlerWrapper> callExceptionHandlers, boolean z10) {
        e0.checkNotNullParameter(responseValidators, "responseValidators");
        e0.checkNotNullParameter(callExceptionHandlers, "callExceptionHandlers");
        this.responseValidators = responseValidators;
        this.callExceptionHandlers = callExceptionHandlers;
        this.expectSuccess = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        if (r2.invoke(r9, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        r2 = r9;
        r9 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processException(java.lang.Throwable r8, io.ktor.client.request.HttpRequest r9, zu.d<? super tu.x0> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof io.ktor.client.plugins.HttpCallValidator.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.HttpCallValidator$processException$1 r0 = (io.ktor.client.plugins.HttpCallValidator.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.HttpCallValidator$processException$1 r0 = new io.ktor.client.plugins.HttpCallValidator$processException$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            java.lang.Object r8 = r0.L$2
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.L$1
            io.ktor.client.request.HttpRequest r9 = (io.ktor.client.request.HttpRequest) r9
            java.lang.Object r2 = r0.L$0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            tu.a0.throwOnFailure(r10)
            goto L98
        L41:
            tu.a0.throwOnFailure(r10)
            bx.a r10 = io.ktor.client.plugins.HttpCallValidatorKt.access$getLOGGER$p()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Processing exception "
            r2.<init>(r5)
            r2.append(r8)
            java.lang.String r5 = " for request "
            r2.append(r5)
            io.ktor.http.Url r5 = r9.getUrl()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r10.trace(r2)
            java.util.List<io.ktor.client.plugins.HandlerWrapper> r10 = r7.callExceptionHandlers
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L71:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r8.next()
            io.ktor.client.plugins.HandlerWrapper r2 = (io.ktor.client.plugins.HandlerWrapper) r2
            boolean r5 = r2 instanceof io.ktor.client.plugins.ExceptionHandlerWrapper
            if (r5 == 0) goto L9b
            io.ktor.client.plugins.ExceptionHandlerWrapper r2 = (io.ktor.client.plugins.ExceptionHandlerWrapper) r2
            kv.p r2 = r2.getHandler()
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r8
            r0.label = r4
            java.lang.Object r2 = r2.invoke(r9, r0)
            if (r2 != r1) goto L96
            goto Lb3
        L96:
            r2 = r9
            r9 = r10
        L98:
            r10 = r9
            r9 = r2
            goto L71
        L9b:
            boolean r5 = r2 instanceof io.ktor.client.plugins.RequestExceptionHandlerWrapper
            if (r5 == 0) goto L71
            io.ktor.client.plugins.RequestExceptionHandlerWrapper r2 = (io.ktor.client.plugins.RequestExceptionHandlerWrapper) r2
            kv.q r2 = r2.getHandler()
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r2 = r2.invoke(r9, r10, r0)
            if (r2 != r1) goto L96
        Lb3:
            return r1
        Lb4:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpCallValidator.processException(java.lang.Throwable, io.ktor.client.request.HttpRequest, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object validateResponse(io.ktor.client.statement.HttpResponse r7, zu.d<? super tu.x0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.HttpCallValidator.C38971
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.HttpCallValidator$validateResponse$1 r0 = (io.ktor.client.plugins.HttpCallValidator.C38971) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.HttpCallValidator$validateResponse$1 r0 = new io.ktor.client.plugins.HttpCallValidator$validateResponse$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.L$0
            io.ktor.client.statement.HttpResponse r2 = (io.ktor.client.statement.HttpResponse) r2
            tu.a0.throwOnFailure(r8)
            r8 = r2
            goto L69
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            tu.a0.throwOnFailure(r8)
            bx.a r8 = io.ktor.client.plugins.HttpCallValidatorKt.access$getLOGGER$p()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Validating response for request "
            r2.<init>(r4)
            io.ktor.client.call.HttpClientCall r4 = r7.getCall()
            io.ktor.client.request.HttpRequest r4 = r4.getRequest()
            io.ktor.http.Url r4 = r4.getUrl()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r8.trace(r2)
            java.util.List<kv.p> r8 = r6.responseValidators
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r8 = r7
            r7 = r5
        L69:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r7.next()
            kv.p r2 = (kv.p) r2
            r0.L$0 = r8
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r2 = r2.invoke(r8, r0)
            if (r2 != r1) goto L69
            return r1
        L82:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpCallValidator.validateResponse(io.ktor.client.statement.HttpResponse, zu.d):java.lang.Object");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Config {
        private final List<p> responseValidators = new ArrayList();
        private final List<HandlerWrapper> responseExceptionHandlers = new ArrayList();
        private boolean expectSuccess = true;

        public final boolean getExpectSuccess() {
            return this.expectSuccess;
        }

        public final List<HandlerWrapper> getResponseExceptionHandlers$ktor_client_core() {
            return this.responseExceptionHandlers;
        }

        public final List<p> getResponseValidators$ktor_client_core() {
            return this.responseValidators;
        }

        @tu.f
        public final void handleResponseException(p block) {
            e0.checkNotNullParameter(block, "block");
            this.responseExceptionHandlers.add(new ExceptionHandlerWrapper(block));
        }

        public final void handleResponseExceptionWithRequest(q block) {
            e0.checkNotNullParameter(block, "block");
            this.responseExceptionHandlers.add(new RequestExceptionHandlerWrapper(block));
        }

        public final void setExpectSuccess(boolean z10) {
            this.expectSuccess = z10;
        }

        public final void validateResponse(p block) {
            e0.checkNotNullParameter(block, "block");
            this.responseValidators.add(block);
        }

        @tu.f
        public static /* synthetic */ void getExpectSuccess$annotations() {
        }
    }
}
