package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.p;
import rv.t;
import tu.f;
import tu.x0;
import zu.d;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ChannelJob implements ReaderJob, WriterJob, Job {
    private final ByteChannel channel;
    private final Job delegate;

    public ChannelJob(Job delegate, ByteChannel channel) {
        e0.checkNotNullParameter(delegate, "delegate");
        e0.checkNotNullParameter(channel, "channel");
        this.delegate = delegate;
        this.channel = channel;
    }

    @Override // kotlinx.coroutines.Job
    public ChildHandle attachChild(ChildJob child) {
        e0.checkNotNullParameter(child, "child");
        return this.delegate.attachChild(child);
    }

    @Override // kotlinx.coroutines.Job
    @f
    public /* synthetic */ void cancel() {
        this.delegate.cancel();
    }

    @Override // io.ktor.utils.io.ReaderJob, kotlinx.coroutines.Job, zu.k, zu.m
    public <R> R fold(R r10, p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return (R) this.delegate.fold(r10, operation);
    }

    @Override // io.ktor.utils.io.ReaderJob, kotlinx.coroutines.Job, zu.k, zu.m
    public <E extends k> E get(l key) {
        e0.checkNotNullParameter(key, "key");
        return (E) this.delegate.get(key);
    }

    @Override // kotlinx.coroutines.Job
    public CancellationException getCancellationException() {
        return this.delegate.getCancellationException();
    }

    @Override // kotlinx.coroutines.Job
    public t getChildren() {
        return this.delegate.getChildren();
    }

    @Override // io.ktor.utils.io.ReaderJob, kotlinx.coroutines.Job, zu.k
    public l getKey() {
        return this.delegate.getKey();
    }

    @Override // kotlinx.coroutines.Job
    public SelectClause0 getOnJoin() {
        return this.delegate.getOnJoin();
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        return this.delegate.getParent();
    }

    @Override // kotlinx.coroutines.Job
    public DisposableHandle invokeOnCompletion(kv.l handler) {
        e0.checkNotNullParameter(handler, "handler");
        return this.delegate.invokeOnCompletion(handler);
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        return this.delegate.isActive();
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return this.delegate.isCancelled();
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCompleted() {
        return this.delegate.isCompleted();
    }

    @Override // kotlinx.coroutines.Job
    public Object join(d<? super x0> dVar) {
        return this.delegate.join(dVar);
    }

    @Override // io.ktor.utils.io.ReaderJob, kotlinx.coroutines.Job, zu.k, zu.m
    public m minusKey(l key) {
        e0.checkNotNullParameter(key, "key");
        return this.delegate.minusKey(key);
    }

    @Override // kotlinx.coroutines.Job
    @f
    public Job plus(Job other) {
        e0.checkNotNullParameter(other, "other");
        return this.delegate.plus(other);
    }

    @Override // kotlinx.coroutines.Job
    public boolean start() {
        return this.delegate.start();
    }

    public String toString() {
        return "ChannelJob[" + this.delegate + AbstractJsonLexerKt.END_LIST;
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(CancellationException cancellationException) {
        this.delegate.cancel(cancellationException);
    }

    @Override // kotlinx.coroutines.Job
    public DisposableHandle invokeOnCompletion(boolean z10, boolean z11, kv.l handler) {
        e0.checkNotNullParameter(handler, "handler");
        return this.delegate.invokeOnCompletion(z10, z11, handler);
    }

    @Override // io.ktor.utils.io.ReaderJob, kotlinx.coroutines.Job, zu.k, zu.m
    public m plus(m context) {
        e0.checkNotNullParameter(context, "context");
        return this.delegate.plus(context);
    }

    @Override // kotlinx.coroutines.Job
    @f
    public /* synthetic */ boolean cancel(Throwable th2) {
        return this.delegate.cancel(th2);
    }

    @Override // io.ktor.utils.io.ReaderJob, io.ktor.utils.io.WriterJob
    public ByteChannel getChannel() {
        return this.channel;
    }
}
