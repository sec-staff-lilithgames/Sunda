package io.ktor.util.pipeline;

import av.b;
import av.e;
import bv.h;
import java.util.List;
import kotlin.jvm.internal.e0;
import kv.q;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SuspendFunctionGun<TSubject, TContext> extends PipelineContext<TSubject, TContext> {
    private final List<q> blocks;
    private final d<x0> continuation;
    private int index;
    private int lastSuspensionIndex;
    private TSubject subject;
    private final d<TSubject>[] suspensions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendFunctionGun(TSubject initial, TContext context, List<? extends q> blocks) {
        super(context);
        e0.checkNotNullParameter(initial, "initial");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(blocks, "blocks");
        this.blocks = blocks;
        this.continuation = new SuspendFunctionGun$continuation$1(this);
        this.subject = initial;
        this.suspensions = new d[blocks.size()];
        this.lastSuspensionIndex = -1;
    }

    private final void discardLastRootContinuation() {
        int i10 = this.lastSuspensionIndex;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        d<TSubject>[] dVarArr = this.suspensions;
        this.lastSuspensionIndex = i10 - 1;
        dVarArr[i10] = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean loop(boolean z10) {
        int i10;
        do {
            i10 = this.index;
            if (i10 == this.blocks.size()) {
                if (z10) {
                    return true;
                }
                int i11 = z.f87419c;
                resumeRootWith(z.m7131constructorimpl(getSubject()));
                return false;
            }
            this.index = i10 + 1;
            try {
            } catch (Throwable th2) {
                int i12 = z.f87419c;
                resumeRootWith(z.m7131constructorimpl(a0.createFailure(th2)));
                return false;
            }
        } while (this.blocks.get(i10).invoke(this, getSubject(), this.continuation) != e.getCOROUTINE_SUSPENDED());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeRootWith(Object obj) {
        int i10 = this.lastSuspensionIndex;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        d<TSubject> dVar = this.suspensions[i10];
        e0.checkNotNull(dVar);
        d<TSubject>[] dVarArr = this.suspensions;
        int i11 = this.lastSuspensionIndex;
        this.lastSuspensionIndex = i11 - 1;
        dVarArr[i11] = null;
        if (!z.m7136isFailureimpl(obj)) {
            dVar.resumeWith(obj);
            return;
        }
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
        e0.checkNotNull(thM7134exceptionOrNullimpl);
        dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(StackTraceRecoverKt.recoverStackTraceBridge(thM7134exceptionOrNullimpl, dVar))));
    }

    public final void addContinuation$ktor_utils(d<? super TSubject> continuation) {
        e0.checkNotNullParameter(continuation, "continuation");
        d<TSubject>[] dVarArr = this.suspensions;
        int i10 = this.lastSuspensionIndex + 1;
        this.lastSuspensionIndex = i10;
        dVarArr[i10] = continuation;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object execute$ktor_utils(TSubject tsubject, d<? super TSubject> dVar) {
        this.index = 0;
        if (this.blocks.size() == 0) {
            return tsubject;
        }
        setSubject(tsubject);
        if (this.lastSuspensionIndex < 0) {
            return proceed(dVar);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void finish() {
        this.index = this.blocks.size();
    }

    public final d<x0> getContinuation$ktor_utils() {
        return this.continuation;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.continuation.getContext();
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public TSubject getSubject() {
        return this.subject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object proceed(d<? super TSubject> dVar) {
        Object coroutine_suspended;
        if (this.index == this.blocks.size()) {
            coroutine_suspended = getSubject();
        } else {
            addContinuation$ktor_utils(b.intercepted(dVar));
            if (loop(true)) {
                discardLastRootContinuation();
                coroutine_suspended = getSubject();
            } else {
                coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            }
        }
        if (coroutine_suspended == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return coroutine_suspended;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object proceedWith(TSubject tsubject, d<? super TSubject> dVar) {
        setSubject(tsubject);
        return proceed(dVar);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void setSubject(TSubject tsubject) {
        e0.checkNotNullParameter(tsubject, "<set-?>");
        this.subject = tsubject;
    }
}
