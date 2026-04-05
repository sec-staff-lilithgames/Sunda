package io.ktor.client.engine;

import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.util.CoroutinesUtilsKt;
import io.ktor.util.InternalAPI;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kv.l;
import tu.f;
import tu.o;
import tu.q;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes6.dex */
public abstract class HttpClientJvmEngine implements HttpClientEngine {
    private final m clientContext;
    private final o coroutineContext$delegate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.engine.HttpClientJvmEngine$createCallContext$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        final /* synthetic */ DisposableHandle $onParentCancelCleanupHandle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DisposableHandle disposableHandle) {
            super(1);
            this.$onParentCancelCleanupHandle = disposableHandle;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            DisposableHandle disposableHandle = this.$onParentCancelCleanupHandle;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }
    }

    public HttpClientJvmEngine(String engineName) {
        e0.checkNotNullParameter(engineName, "engineName");
        this.clientContext = CoroutinesUtilsKt.SilentSupervisor$default(null, 1, null);
        this.coroutineContext$delegate = q.lazy(new HttpClientJvmEngine$coroutineContext$2(this, engineName));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Job job = JobKt.getJob(this.clientContext);
        e0.checkNotNull(job, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((CompletableJob) job).complete();
    }

    public final Object createCallContext(d<? super m> dVar) {
        m mVar = this.clientContext;
        Job.Key key = Job.Key;
        CompletableJob completableJobJob = JobKt.Job((Job) mVar.get(key));
        m mVarPlus = getCoroutineContext().plus(completableJobJob);
        Job job = (Job) dVar.getContext().get(key);
        completableJobJob.invokeOnCompletion(new AnonymousClass2(job != null ? Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new HttpClientJvmEngine$createCallContext$onParentCancelCleanupHandle$1(mVarPlus), 2, null) : null));
        return mVarPlus;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return (m) this.coroutineContext$delegate.getValue();
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public Set<HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return HttpClientEngine.DefaultImpls.getSupportedCapabilities(this);
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    @InternalAPI
    public void install(HttpClient httpClient) {
        HttpClientEngine.DefaultImpls.install(this, httpClient);
    }
}
