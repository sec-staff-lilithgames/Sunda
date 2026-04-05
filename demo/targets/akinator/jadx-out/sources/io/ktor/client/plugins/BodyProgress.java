package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.HttpClient;
import io.ktor.client.content.ObservableContent;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.pipeline.InvalidPhaseException;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class BodyProgress {
    public static final Plugin Plugin = new Plugin(null);
    private static final AttributeKey<BodyProgress> key = new AttributeKey<>("BodyProgress");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Plugin implements HttpClientPlugin<x0, BodyProgress> {
        public /* synthetic */ Plugin(u uVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<BodyProgress> getKey() {
            return BodyProgress.key;
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(BodyProgress plugin, HttpClient scope) throws InvalidPhaseException {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            plugin.handle(scope);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public BodyProgress prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            return new BodyProgress();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.BodyProgress$handle$1", f = "BodyProgress.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.BodyProgress$handle$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = pipelineContext;
            anonymousClass1.L$1 = obj;
            return anonymousClass1.invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                PipelineContext pipelineContext = (PipelineContext) this.L$0;
                Object obj2 = this.L$1;
                q qVar = (q) ((HttpRequestBuilder) pipelineContext.getContext()).getAttributes().getOrNull(BodyProgressKt.UploadProgressListenerAttributeKey);
                if (qVar == null) {
                    return x0Var;
                }
                e0.checkNotNull(obj2, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
                ObservableContent observableContent = new ObservableContent((OutgoingContent) obj2, ((HttpRequestBuilder) pipelineContext.getContext()).getExecutionContext(), qVar);
                this.L$0 = null;
                this.label = 1;
                if (pipelineContext.proceedWith(observableContent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.BodyProgress$handle$2", f = "BodyProgress.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.BodyProgress$handle$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<HttpResponse, x0> pipelineContext, HttpResponse httpResponse, d<? super x0> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = pipelineContext;
            anonymousClass2.L$1 = httpResponse;
            return anonymousClass2.invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                PipelineContext pipelineContext = (PipelineContext) this.L$0;
                HttpResponse httpResponse = (HttpResponse) this.L$1;
                q qVar = (q) httpResponse.getCall().getRequest().getAttributes().getOrNull(BodyProgressKt.DownloadProgressListenerAttributeKey);
                if (qVar == null) {
                    return x0Var;
                }
                HttpResponse httpResponseWithObservableDownload = BodyProgressKt.withObservableDownload(httpResponse, qVar);
                this.L$0 = null;
                this.label = 1;
                if (pipelineContext.proceedWith(httpResponseWithObservableDownload, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handle(HttpClient httpClient) throws InvalidPhaseException {
        PipelinePhase pipelinePhase = new PipelinePhase("ObservableContent");
        httpClient.getRequestPipeline().insertPhaseAfter(HttpRequestPipeline.Phases.getRender(), pipelinePhase);
        httpClient.getRequestPipeline().intercept(pipelinePhase, new AnonymousClass1(null));
        httpClient.getReceivePipeline().intercept(HttpReceivePipeline.Phases.getAfter(), new AnonymousClass2(null));
    }
}
