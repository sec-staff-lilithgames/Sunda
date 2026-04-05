package kotlinx.coroutines;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ThreadContextKt;
import tu.a0;
import tu.z;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DispatchedTaskKt {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    public static final <T> void dispatch(DispatchedTask<? super T> dispatchedTask, int i10) {
        d<? super T> delegate$kotlinx_coroutines_core = dispatchedTask.getDelegate$kotlinx_coroutines_core();
        boolean z10 = i10 == 4;
        if (z10 || !(delegate$kotlinx_coroutines_core instanceof DispatchedContinuation) || isCancellableMode(i10) != isCancellableMode(dispatchedTask.resumeMode)) {
            resume(dispatchedTask, delegate$kotlinx_coroutines_core, z10);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) delegate$kotlinx_coroutines_core;
        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.dispatcher;
        m context = dispatchedContinuation.getContext();
        if (DispatchedContinuationKt.safeIsDispatchNeeded(coroutineDispatcher, context)) {
            DispatchedContinuationKt.safeDispatch(coroutineDispatcher, context, dispatchedTask);
        } else {
            resumeUnconfined(dispatchedTask);
        }
    }

    public static final boolean isCancellableMode(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean isReusableMode(int i10) {
        return i10 == 2;
    }

    public static final <T> void resume(DispatchedTask<? super T> dispatchedTask, d<? super T> dVar, boolean z10) {
        Object successfulResult$kotlinx_coroutines_core;
        Object objTakeState$kotlinx_coroutines_core = dispatchedTask.takeState$kotlinx_coroutines_core();
        Throwable exceptionalResult$kotlinx_coroutines_core = dispatchedTask.getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            int i10 = z.f87419c;
            successfulResult$kotlinx_coroutines_core = a0.createFailure(exceptionalResult$kotlinx_coroutines_core);
        } else {
            int i11 = z.f87419c;
            successfulResult$kotlinx_coroutines_core = dispatchedTask.getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        }
        Object objM7131constructorimpl = z.m7131constructorimpl(successfulResult$kotlinx_coroutines_core);
        if (!z10) {
            dVar.resumeWith(objM7131constructorimpl);
            return;
        }
        e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) dVar;
        d<T> dVar2 = dispatchedContinuation.continuation;
        Object obj = dispatchedContinuation.countOrElement;
        m context = dVar2.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(dVar2, context, objUpdateThreadContext) : null;
        try {
            dispatchedContinuation.continuation.resumeWith(objM7131constructorimpl);
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        } catch (Throwable th2) {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
            throw th2;
        }
    }

    private static final void resumeUnconfined(DispatchedTask<?> dispatchedTask) {
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedTask);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            resume(dispatchedTask, dispatchedTask.getDelegate$kotlinx_coroutines_core(), true);
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void resumeWithStackTrace(d<?> dVar, Throwable th2) {
        int i10 = z.f87419c;
        dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(th2)));
    }

    public static final void runUnconfinedEventLoop(DispatchedTask<?> dispatchedTask, EventLoop eventLoop, kv.a aVar) {
        eventLoop.incrementUseCount(true);
        try {
            aVar.invoke();
            do {
            } while (eventLoop.processUnconfinedEvent());
            b0.finallyStart(1);
        } catch (Throwable th2) {
            try {
                dispatchedTask.handleFatalException$kotlinx_coroutines_core(th2);
                b0.finallyStart(1);
            } catch (Throwable th3) {
                b0.finallyStart(1);
                eventLoop.decrementUseCount(true);
                b0.finallyEnd(1);
                throw th3;
            }
        }
        eventLoop.decrementUseCount(true);
        b0.finallyEnd(1);
    }

    public static /* synthetic */ void getMODE_CANCELLABLE$annotations() {
    }
}
