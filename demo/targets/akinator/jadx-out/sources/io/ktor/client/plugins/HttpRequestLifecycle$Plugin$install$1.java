package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;
import zu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpRequestLifecycle$Plugin$install$1", f = "HttpRequestLifecycle.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"executionContext"}, s = {"L$0"})
/* loaded from: classes7.dex */
public final class HttpRequestLifecycle$Plugin$install$1 extends n implements q {
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestLifecycle$Plugin$install$1(HttpClient httpClient, d<? super HttpRequestLifecycle$Plugin$install$1> dVar) {
        super(3, dVar);
        this.$scope = httpClient;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
        HttpRequestLifecycle$Plugin$install$1 httpRequestLifecycle$Plugin$install$1 = new HttpRequestLifecycle$Plugin$install$1(this.$scope, dVar);
        httpRequestLifecycle$Plugin$install$1.L$0 = pipelineContext;
        return httpRequestLifecycle$Plugin$install$1.invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        CompletableJob completableJob;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableJob = (CompletableJob) this.L$0;
            try {
                a0.throwOnFailure(obj);
                completableJob.complete();
                return x0.f87415a;
            } catch (Throwable th2) {
                th = th2;
                try {
                    completableJob.completeExceptionally(th);
                    throw th;
                } catch (Throwable th3) {
                    completableJob.complete();
                    throw th3;
                }
            }
        }
        a0.throwOnFailure(obj);
        PipelineContext pipelineContext = (PipelineContext) this.L$0;
        CompletableJob completableJobSupervisorJob = SupervisorKt.SupervisorJob(((HttpRequestBuilder) pipelineContext.getContext()).getExecutionContext());
        k kVar = this.$scope.getCoroutineContext().get(Job.Key);
        e0.checkNotNull(kVar);
        HttpRequestLifecycleKt.attachToClientEngineJob(completableJobSupervisorJob, (Job) kVar);
        try {
            ((HttpRequestBuilder) pipelineContext.getContext()).setExecutionContext$ktor_client_core(completableJobSupervisorJob);
            this.L$0 = completableJobSupervisorJob;
            this.label = 1;
            if (pipelineContext.proceed(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            completableJob = completableJobSupervisorJob;
            completableJob.complete();
            return x0.f87415a;
        } catch (Throwable th4) {
            th = th4;
            completableJob = completableJobSupervisorJob;
            completableJob.completeExceptionally(th);
            throw th;
        }
    }
}
