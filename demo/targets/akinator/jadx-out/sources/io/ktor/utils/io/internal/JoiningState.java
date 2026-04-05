package io.ktor.utils.io.internal;

import av.e;
import io.ktor.utils.io.ByteBufferChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JoiningState {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closeWaitJob$FU = AtomicReferenceFieldUpdater.newUpdater(JoiningState.class, Object.class, "_closeWaitJob");
    private volatile /* synthetic */ Object _closeWaitJob;
    private volatile /* synthetic */ int closed;
    private final boolean delegateClose;
    private final ByteBufferChannel delegatedTo;

    public JoiningState(ByteBufferChannel delegatedTo, boolean z10) {
        e0.checkNotNullParameter(delegatedTo, "delegatedTo");
        this.delegatedTo = delegatedTo;
        this.delegateClose = z10;
        this._closeWaitJob = null;
        this.closed = 0;
    }

    private final Job getCloseWaitJob() {
        while (true) {
            Job job = (Job) this._closeWaitJob;
            if (job != null) {
                return job;
            }
            CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closeWaitJob$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, completableJobJob$default)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            if (this.closed == 1) {
                Job.DefaultImpls.cancel$default((Job) completableJobJob$default, (CancellationException) null, 1, (Object) null);
            }
            return completableJobJob$default;
        }
    }

    public final Object awaitClose(d<? super x0> dVar) {
        Object objJoin;
        x0 x0Var = x0.f87415a;
        return (this.closed != 1 && (objJoin = getCloseWaitJob().join(dVar)) == e.getCOROUTINE_SUSPENDED()) ? objJoin : x0Var;
    }

    public final void complete() {
        this.closed = 1;
        Job job = (Job) _closeWaitJob$FU.getAndSet(this, null);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public final boolean getDelegateClose() {
        return this.delegateClose;
    }

    public final ByteBufferChannel getDelegatedTo() {
        return this.delegatedTo;
    }
}
