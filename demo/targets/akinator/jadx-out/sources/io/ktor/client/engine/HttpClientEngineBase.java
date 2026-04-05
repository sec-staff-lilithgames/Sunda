package io.ktor.client.engine;

import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.util.InternalAPI;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import tu.o;
import tu.q;
import zu.k;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class HttpClientEngineBase implements HttpClientEngine {
    private static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientEngineBase.class, "closed");
    private volatile /* synthetic */ int closed;
    private final o coroutineContext$delegate;
    private final CoroutineDispatcher dispatcher;
    private final String engineName;

    public HttpClientEngineBase(String engineName) {
        e0.checkNotNullParameter(engineName, "engineName");
        this.engineName = engineName;
        this.closed = 0;
        this.dispatcher = HttpClientEngineBase_jvmKt.ioDispatcher();
        this.coroutineContext$delegate = q.lazy(new HttpClientEngineBase$coroutineContext$2(this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (closed$FU.compareAndSet(this, 0, 1)) {
            k kVar = getCoroutineContext().get(Job.Key);
            CompletableJob completableJob = kVar instanceof CompletableJob ? (CompletableJob) kVar : null;
            if (completableJob == null) {
                return;
            }
            completableJob.complete();
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return (m) this.coroutineContext$delegate.getValue();
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
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
