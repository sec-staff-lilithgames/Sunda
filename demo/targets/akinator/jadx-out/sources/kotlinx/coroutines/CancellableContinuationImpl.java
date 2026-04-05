package kotlinx.coroutines;

import bv.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kv.l;
import kv.q;
import p0.o2;
import tu.k;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, e, Waiter {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private final m context;
    private final d<T> delegate;
    private static final /* synthetic */ AtomicIntegerFieldUpdater _decisionAndIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(d<? super T> dVar, int i10) {
        super(i10);
        this.delegate = dVar;
        this.context = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Active.INSTANCE;
    }

    private final Void alreadyResumedError(Object obj) {
        throw new IllegalStateException(o2.o(obj, "Already resumed, but proposed with update "));
    }

    private final void callCancelHandlerSafely(kv.a aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void callSegmentOnCancellation(Segment<?> segment, Throwable th2) {
        int i10 = _decisionAndIndex$volatile$FU.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.onCancellation(i10, th2, getContext());
        } catch (Throwable th3) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    private final boolean cancelLater(Throwable th2) {
        if (!isReusable()) {
            return false;
        }
        d<T> dVar = this.delegate;
        e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((DispatchedContinuation) dVar).postponeCancellation$kotlinx_coroutines_core(th2);
    }

    private final void detachChildIfNonReusable() {
        if (isReusable()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    private final void dispatchResume(int i10) {
        if (tryResume()) {
            return;
        }
        DispatchedTaskKt.dispatch(this, i10);
    }

    private final DisposableHandle getParentHandle() {
        return (DisposableHandle) _parentHandle$volatile$FU.get(this);
    }

    private final String getStateDebugRepresentation() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return state$kotlinx_coroutines_core instanceof NotCompleted ? "Active" : state$kotlinx_coroutines_core instanceof CancelledContinuation ? "Cancelled" : "Completed";
    }

    private final /* synthetic */ int get_decisionAndIndex$volatile() {
        return this._decisionAndIndex$volatile;
    }

    private final /* synthetic */ Object get_parentHandle$volatile() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final DisposableHandle installParentHandle() {
        Job job = (Job) getContext().get(Job.Key);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleInvokeOnCompletion$default = JobKt__JobKt.invokeOnCompletion$default(job, false, new ChildContinuation(this), 1, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _parentHandle$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, disposableHandleInvokeOnCompletion$default)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return disposableHandleInvokeOnCompletion$default;
            }
        }
        return disposableHandleInvokeOnCompletion$default;
    }

    private final void invokeOnCancellationImpl(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Active) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            if (!(obj2 instanceof CancelHandler) && !(obj2 instanceof Segment)) {
                if (obj2 instanceof CompletedExceptionally) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj2;
                    if (!completedExceptionally.makeHandled()) {
                        multipleHandlersError(obj, obj2);
                    }
                    if (obj2 instanceof CancelledContinuation) {
                        Throwable th2 = completedExceptionally.cause;
                        if (obj instanceof CancelHandler) {
                            callCancelHandler((CancelHandler) obj, th2);
                            return;
                        } else {
                            e0.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            callSegmentOnCancellation((Segment) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (!(obj2 instanceof CompletedContinuation)) {
                    if (obj instanceof Segment) {
                        return;
                    }
                    e0.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    CompletedContinuation completedContinuation = new CompletedContinuation(obj2, (CancelHandler) obj, null, null, null, 28, null);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _state$volatile$FU;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj2, completedContinuation)) {
                        if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                            break;
                        }
                    }
                    return;
                }
                CompletedContinuation completedContinuation2 = (CompletedContinuation) obj2;
                if (completedContinuation2.cancelHandler != null) {
                    multipleHandlersError(obj, obj2);
                }
                if (obj instanceof Segment) {
                    return;
                }
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                CancelHandler cancelHandler = (CancelHandler) obj;
                if (completedContinuation2.getCancelled()) {
                    callCancelHandler(cancelHandler, completedContinuation2.cancelCause);
                    return;
                }
                CompletedContinuation completedContinuationCopy$default = CompletedContinuation.copy$default(completedContinuation2, null, cancelHandler, null, null, null, 29, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = _state$volatile$FU;
                while (!atomicReferenceFieldUpdater4.compareAndSet(this, obj2, completedContinuationCopy$default)) {
                    if (atomicReferenceFieldUpdater4.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            multipleHandlersError(obj, obj2);
        }
    }

    private final boolean isReusable() {
        if (!DispatchedTaskKt.isReusableMode(this.resumeMode)) {
            return false;
        }
        d<T> dVar = this.delegate;
        e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((DispatchedContinuation) dVar).isReusable$kotlinx_coroutines_core();
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final void multipleHandlersError(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 resume$lambda$13$lambda$12(l lVar, Throwable th2, Object obj, m mVar) {
        lVar.invoke(th2);
        return x0.f87415a;
    }

    public static /* synthetic */ void resumeImpl$kotlinx_coroutines_core$default(CancellableContinuationImpl cancellableContinuationImpl, Object obj, int i10, q qVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            qVar = null;
        }
        cancellableContinuationImpl.resumeImpl$kotlinx_coroutines_core(obj, i10, qVar);
    }

    private final <R> Object resumedState(NotCompleted notCompleted, R r10, int i10, q qVar, Object obj) {
        if (r10 instanceof CompletedExceptionally) {
            return r10;
        }
        if ((DispatchedTaskKt.isCancellableMode(i10) || obj != null) && !(qVar == null && !(notCompleted instanceof CancelHandler) && obj == null)) {
            return new CompletedContinuation(r10, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, qVar, obj, null, 16, null);
        }
        return r10;
    }

    private final /* synthetic */ void set_decisionAndIndex$volatile(int i10) {
        this._decisionAndIndex$volatile = i10;
    }

    private final /* synthetic */ void set_parentHandle$volatile(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean tryResume() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final <R> Symbol tryResumeImpl(R r10, Object obj, q qVar) {
        R r11;
        Object obj2;
        q qVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof NotCompleted)) {
                Object obj4 = obj;
                if ((obj3 instanceof CompletedContinuation) && obj4 != null && ((CompletedContinuation) obj3).idempotentResume == obj4) {
                    return CancellableContinuationImplKt.RESUME_TOKEN;
                }
                return null;
            }
            r11 = r10;
            obj2 = obj;
            qVar2 = qVar;
            Object objResumedState = resumedState((NotCompleted) obj3, r11, this.resumeMode, qVar2, obj2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj3, objResumedState)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj3) {
                    break;
                }
            }
            detachChildIfNonReusable();
            return CancellableContinuationImplKt.RESUME_TOKEN;
            r10 = r11;
            qVar = qVar2;
            obj = obj2;
        }
    }

    private final boolean trySuspend() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, l lVar) {
        int i10;
        do {
            i10 = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i10, ((Number) lVar.invoke(Integer.valueOf(i10))).intValue()));
    }

    public final void callCancelHandler(CancelHandler cancelHandler, Throwable th2) {
        try {
            cancelHandler.invoke(th2);
        } catch (Throwable th3) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final <R> void callOnCancellation(q qVar, Throwable th2, R r10) {
        try {
            qVar.invoke(th2, r10, getContext());
        } catch (Throwable th3) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            CancelledContinuation cancelledContinuation = new CancelledContinuation(this, th2, (obj instanceof CancelHandler) || (obj instanceof Segment));
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, cancelledContinuation)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    break;
                }
            }
            NotCompleted notCompleted = (NotCompleted) obj;
            if (notCompleted instanceof CancelHandler) {
                callCancelHandler((CancelHandler) obj, th2);
            } else if (notCompleted instanceof Segment) {
                callSegmentOnCancellation((Segment) obj, th2);
            }
            detachChildIfNonReusable();
            dispatchResume(this.resumeMode);
            return true;
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th2) {
        Throwable th3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof NotCompleted) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof CompletedExceptionally) {
                return;
            }
            if (!(obj2 instanceof CompletedContinuation)) {
                th3 = th2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
                CompletedContinuation completedContinuation = new CompletedContinuation(obj2, null, null, null, th3, 14, null);
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, completedContinuation)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            CompletedContinuation completedContinuation2 = (CompletedContinuation) obj2;
            if (completedContinuation2.getCancelled()) {
                throw new IllegalStateException("Must be called at most once");
            }
            Throwable th4 = th2;
            CompletedContinuation completedContinuationCopy$default = CompletedContinuation.copy$default(completedContinuation2, null, null, null, null, th4, 15, null);
            th3 = th4;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _state$volatile$FU;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj2, completedContinuationCopy$default)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                    break;
                }
            }
            completedContinuation2.invokeHandlers(this, th3);
            return;
            th2 = th3;
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(Object obj) {
        dispatchResume(this.resumeMode);
    }

    public final void detachChild$kotlinx_coroutines_core() {
        DisposableHandle parentHandle = getParentHandle();
        if (parentHandle == null) {
            return;
        }
        parentHandle.dispose();
        _parentHandle$volatile$FU.set(this, NonDisposableHandle.INSTANCE);
    }

    @Override // bv.e
    public e getCallerFrame() {
        d<T> dVar = this.delegate;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // kotlinx.coroutines.CancellableContinuation, zu.d
    public m getContext() {
        return this.context;
    }

    public Throwable getContinuationCancellationCause(Job job) {
        return job.getCancellationException();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final d<T> getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    public final Object getResult() {
        Job job;
        boolean zIsReusable = isReusable();
        if (trySuspend()) {
            if (getParentHandle() == null) {
                installParentHandle();
            }
            if (zIsReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return av.e.getCOROUTINE_SUSPENDED();
        }
        if (zIsReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        if (!DispatchedTaskKt.isCancellableMode(this.resumeMode) || (job = (Job) getContext().get(Job.Key)) == null || job.isActive()) {
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        CancellationException cancellationException = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
        throw cancellationException;
    }

    @Override // bv.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object getState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof CompletedContinuation ? (T) ((CompletedContinuation) obj).result : obj;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        DisposableHandle disposableHandleInstallParentHandle = installParentHandle();
        if (disposableHandleInstallParentHandle != null && isCompleted()) {
            disposableHandleInstallParentHandle.dispose();
            _parentHandle$volatile$FU.set(this, NonDisposableHandle.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        invokeOnCancellationImpl(segment);
    }

    public final void invokeOnCancellationInternal$kotlinx_coroutines_core(CancelHandler cancelHandler) {
        invokeOnCancellationImpl(cancelHandler);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof CancelledContinuation;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof NotCompleted);
    }

    public String nameString() {
        return "CancellableContinuation";
    }

    public final void parentCancelled$kotlinx_coroutines_core(Throwable th2) {
        if (cancelLater(th2)) {
            return;
        }
        cancel(th2);
        detachChildIfNonReusable();
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        Throwable thTryReleaseClaimedContinuation$kotlinx_coroutines_core;
        d<T> dVar = this.delegate;
        DispatchedContinuation dispatchedContinuation = dVar instanceof DispatchedContinuation ? (DispatchedContinuation) dVar : null;
        if (dispatchedContinuation == null || (thTryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(thTryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    public final boolean resetStateReusable() {
        Object obj = _state$volatile$FU.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        _decisionAndIndex$volatile$FU.set(this, 536870911);
        _state$volatile$FU.set(this, Active.INSTANCE);
        return true;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T t10, l lVar) {
        resumeImpl$kotlinx_coroutines_core(t10, this.resumeMode, lVar != null ? new a(lVar, 0) : null);
    }

    public final <R> void resumeImpl$kotlinx_coroutines_core(R r10, int i10, q qVar) {
        R r11;
        int i11;
        q qVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof NotCompleted) {
                r11 = r10;
                i11 = i10;
                qVar2 = qVar;
                Object objResumedState = resumedState((NotCompleted) obj, r11, i11, qVar2, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, objResumedState)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                detachChildIfNonReusable();
                dispatchResume(i11);
                return;
            }
            R r12 = r10;
            q qVar3 = qVar;
            if (obj instanceof CancelledContinuation) {
                CancelledContinuation cancelledContinuation = (CancelledContinuation) obj;
                if (cancelledContinuation.makeResumed()) {
                    if (qVar3 != null) {
                        callOnCancellation(qVar3, cancelledContinuation.cause, r12);
                        return;
                    }
                    return;
                }
            }
            alreadyResumedError(r12);
            throw new k();
            r10 = r11;
            i10 = i11;
            qVar = qVar2;
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t10) {
        d<T> dVar = this.delegate;
        DispatchedContinuation dispatchedContinuation = dVar instanceof DispatchedContinuation ? (DispatchedContinuation) dVar : null;
        resumeImpl$kotlinx_coroutines_core$default(this, t10, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th2) {
        d<T> dVar = this.delegate;
        DispatchedContinuation dispatchedContinuation = dVar instanceof DispatchedContinuation ? (DispatchedContinuation) dVar : null;
        resumeImpl$kotlinx_coroutines_core$default(this, new CompletedExceptionally(th2, false, 2, null), (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation, zu.d
    public void resumeWith(Object obj) {
        resumeImpl$kotlinx_coroutines_core$default(this, CompletionStateKt.toState(obj, this), this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    public String toString() {
        return nameString() + '(' + DebugStringsKt.toDebugString(this.delegate) + "){" + getStateDebugRepresentation() + "}@" + DebugStringsKt.getHexAddress(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResumeWithException(Throwable th2) {
        return tryResumeImpl(new CompletedExceptionally(th2, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> void resume(R r10, q qVar) {
        resumeImpl$kotlinx_coroutines_core(r10, this.resumeMode, qVar);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(l lVar) {
        CancellableContinuationKt.invokeOnCancellation(this, new CancelHandler.UserSupplied(lVar));
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResume(T t10, Object obj) {
        return tryResumeImpl(t10, obj, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> Object tryResume(R r10, Object obj, q qVar) {
        return tryResumeImpl(r10, obj, qVar);
    }
}
