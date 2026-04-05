package kotlinx.coroutines.internal;

import bv.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;
import p0.o2;
import tu.a0;
import tu.z;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements e, d<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _reusableCancellableContinuation$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public Object _state;
    public final d<T> continuation;
    public final Object countOrElement;
    public final CoroutineDispatcher dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, d<? super T> dVar) {
        super(-1);
        this.dispatcher = coroutineDispatcher;
        this.continuation = dVar;
        this._state = DispatchedContinuationKt.UNDEFINED;
        this.countOrElement = ThreadContextKt.threadContextElements(getContext());
    }

    private final CancellableContinuationImpl<?> getReusableCancellableContinuation() {
        Object obj = _reusableCancellableContinuation$volatile$FU.get(this);
        if (obj instanceof CancellableContinuationImpl) {
            return (CancellableContinuationImpl) obj;
        }
        return null;
    }

    private final /* synthetic */ Object get_reusableCancellableContinuation$volatile() {
        return this._reusableCancellableContinuation$volatile;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_reusableCancellableContinuation$volatile(Object obj) {
        this._reusableCancellableContinuation$volatile = obj;
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        while (_reusableCancellableContinuation$volatile$FU.get(this) == DispatchedContinuationKt.REUSABLE_CLAIMED) {
        }
    }

    public final CancellableContinuationImpl<T> claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                _reusableCancellableContinuation$volatile$FU.set(this, DispatchedContinuationKt.REUSABLE_CLAIMED);
                return null;
            }
            if (obj instanceof CancellableContinuationImpl) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, symbol)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                return (CancellableContinuationImpl) obj;
            }
            if (obj != DispatchedContinuationKt.REUSABLE_CLAIMED && !(obj instanceof Throwable)) {
                throw new IllegalStateException(o2.o(obj, "Inconsistent state "));
            }
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(m mVar, T t10) {
        this._state = t10;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(mVar, this);
    }

    @Override // bv.e
    public e getCallerFrame() {
        d<T> dVar = this.continuation;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // zu.d
    public m getContext() {
        return this.continuation.getContext();
    }

    @Override // bv.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        return _reusableCancellableContinuation$volatile$FU.get(this) != null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if (e0.areEqual(obj, symbol)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, symbol, th2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != symbol) {
                        break;
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _reusableCancellableContinuation$volatile$FU;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    break;
                }
            }
            return false;
        }
    }

    public final void release$kotlinx_coroutines_core() {
        awaitReusability$kotlinx_coroutines_core();
        CancellableContinuationImpl<?> reusableCancellableContinuation = getReusableCancellableContinuation();
        if (reusableCancellableContinuation != null) {
            reusableCancellableContinuation.detachChild$kotlinx_coroutines_core();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[Catch: all -> 0x0060, DONT_GENERATE, TryCatch #0 {all -> 0x0060, blocks: (B:10:0x0037, B:12:0x0045, B:14:0x004b, B:29:0x008e, B:17:0x0062, B:19:0x0072, B:23:0x007d, B:25:0x0082, B:28:0x008b, B:27:0x0088, B:34:0x009f, B:36:0x00a4, B:39:0x00ad, B:40:0x00b0, B:38:0x00aa, B:22:0x0078), top: B:47:0x0037, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlinx.coroutines.CompletionStateKt.toState(r7)
            kotlinx.coroutines.CoroutineDispatcher r1 = r6.dispatcher
            zu.m r2 = r6.getContext()
            boolean r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.safeIsDispatchNeeded(r1, r2)
            r2 = 1
            if (r1 == 0) goto L1f
            r6._state = r0
            r6.resumeMode = r2
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.dispatcher
            zu.m r0 = r6.getContext()
            kotlinx.coroutines.internal.DispatchedContinuationKt.safeDispatch(r7, r0, r6)
            return
        L1f:
            kotlinx.coroutines.ThreadLocalEventLoop r1 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r1 = r1.getEventLoop$kotlinx_coroutines_core()
            boolean r3 = r1.isUnconfinedLoopActive()
            if (r3 == 0) goto L34
            r6._state = r0
            r6.resumeMode = r2
            r1.dispatchUnconfined(r6)
            goto Lb8
        L34:
            r1.incrementUseCount(r2)
            zu.m r3 = r6.getContext()     // Catch: java.lang.Throwable -> L60
            kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L60
            zu.k r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L60
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L62
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L60
            if (r4 != 0) goto L62
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L60
            r6.cancelCompletedResult$kotlinx_coroutines_core(r0, r7)     // Catch: java.lang.Throwable -> L60
            int r0 = tu.z.f87419c     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = tu.a0.createFailure(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = tu.z.m7131constructorimpl(r7)     // Catch: java.lang.Throwable -> L60
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L60
            goto L8e
        L60:
            r7 = move-exception
            goto Lb1
        L62:
            zu.d<T> r0 = r6.continuation     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> L60
            zu.m r4 = r0.getContext()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L60
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L60
            if (r3 == r5) goto L77
            kotlinx.coroutines.UndispatchedCoroutine r0 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r0, r4, r3)     // Catch: java.lang.Throwable -> L60
            goto L78
        L77:
            r0 = 0
        L78:
            zu.d<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L9e
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9e
            kotlin.jvm.internal.b0.finallyStart(r2)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L88
            boolean r7 = r0.clearThreadContext()     // Catch: java.lang.Throwable -> L60
            if (r7 == 0) goto L8b
        L88:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L60
        L8b:
            kotlin.jvm.internal.b0.finallyEnd(r2)     // Catch: java.lang.Throwable -> L60
        L8e:
            boolean r7 = r1.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L60
            if (r7 != 0) goto L8e
            kotlin.jvm.internal.b0.finallyStart(r2)
        L97:
            r1.decrementUseCount(r2)
            kotlin.jvm.internal.b0.finallyEnd(r2)
            goto Lb8
        L9e:
            r7 = move-exception
            kotlin.jvm.internal.b0.finallyStart(r2)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto Laa
            boolean r0 = r0.clearThreadContext()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto Lad
        Laa:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L60
        Lad:
            kotlin.jvm.internal.b0.finallyEnd(r2)     // Catch: java.lang.Throwable -> L60
            throw r7     // Catch: java.lang.Throwable -> L60
        Lb1:
            r6.handleFatalException$kotlinx_coroutines_core(r7)     // Catch: java.lang.Throwable -> Lb9
            kotlin.jvm.internal.b0.finallyStart(r2)
            goto L97
        Lb8:
            return
        Lb9:
            r7 = move-exception
            kotlin.jvm.internal.b0.finallyStart(r2)
            r1.decrementUseCount(r2)
            kotlin.jvm.internal.b0.finallyEnd(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuation.resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object):void");
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(Object obj) {
        Job job = (Job) getContext().get(Job.Key);
        if (job == null || job.isActive()) {
            return false;
        }
        CancellationException cancellationException = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
        int i10 = z.f87419c;
        resumeWith(z.m7131constructorimpl(a0.createFailure(cancellationException)));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resumeUndispatchedWith$kotlinx_coroutines_core(java.lang.Object r6) {
        /*
            r5 = this;
            zu.d<T> r0 = r5.continuation
            java.lang.Object r1 = r5.countOrElement
            zu.m r2 = r0.getContext()
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r2, r1)
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r1 == r3) goto L15
            kotlinx.coroutines.UndispatchedCoroutine r0 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r0, r2, r1)
            goto L16
        L15:
            r0 = 0
        L16:
            r3 = 1
            zu.d<T> r4 = r5.continuation     // Catch: java.lang.Throwable -> L2e
            r4.resumeWith(r6)     // Catch: java.lang.Throwable -> L2e
            kotlin.jvm.internal.b0.finallyStart(r3)
            if (r0 == 0) goto L27
            boolean r6 = r0.clearThreadContext()
            if (r6 == 0) goto L2a
        L27:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r1)
        L2a:
            kotlin.jvm.internal.b0.finallyEnd(r3)
            return
        L2e:
            r6 = move-exception
            kotlin.jvm.internal.b0.finallyStart(r3)
            if (r0 == 0) goto L3a
            boolean r0 = r0.clearThreadContext()
            if (r0 == 0) goto L3d
        L3a:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r1)
        L3d:
            kotlin.jvm.internal.b0.finallyEnd(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuation.resumeUndispatchedWith$kotlinx_coroutines_core(java.lang.Object):void");
    }

    @Override // zu.d
    public void resumeWith(Object obj) {
        Object state = CompletionStateKt.toState(obj);
        if (DispatchedContinuationKt.safeIsDispatchNeeded(this.dispatcher, getContext())) {
            this._state = state;
            this.resumeMode = 0;
            DispatchedContinuationKt.safeDispatch(this.dispatcher, getContext(), this);
            return;
        }
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state;
            this.resumeMode = 0;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            m context = getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, this.countOrElement);
            try {
                this.continuation.resumeWith(obj);
                while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
                }
            } finally {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Object takeState$kotlinx_coroutines_core() {
        Object obj = this._state;
        this._state = DispatchedContinuationKt.UNDEFINED;
        return obj;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + DebugStringsKt.toDebugString(this.continuation) + AbstractJsonLexerKt.END_LIST;
    }

    public final Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(CancellableContinuation<?> cancellableContinuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if (obj == symbol) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, symbol, cancellableContinuation)) {
                    if (atomicReferenceFieldUpdater2.get(this) != symbol) {
                        break;
                    }
                }
                return null;
            }
            if (!(obj instanceof Throwable)) {
                throw new IllegalStateException(o2.o(obj, "Inconsistent state "));
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _reusableCancellableContinuation$volatile$FU;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            return (Throwable) obj;
        }
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public d<T> getDelegate$kotlinx_coroutines_core() {
        return this;
    }
}
