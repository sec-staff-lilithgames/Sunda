package kotlinx.coroutines.internal;

import kotlin.jvm.internal.b0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DispatchedContinuationKt {
    private static final Symbol UNDEFINED = new Symbol("UNDEFINED");
    public static final Symbol REUSABLE_CLAIMED = new Symbol("REUSABLE_CLAIMED");

    private static final boolean executeUnconfined(DispatchedContinuation<?> dispatchedContinuation, Object obj, int i10, boolean z10, kv.a aVar) {
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (z10 && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i10;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            aVar.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            b0.finallyStart(1);
        } catch (Throwable th2) {
            try {
                dispatchedContinuation.handleFatalException$kotlinx_coroutines_core(th2);
                b0.finallyStart(1);
            } catch (Throwable th3) {
                b0.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                b0.finallyEnd(1);
                throw th3;
            }
        }
        eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        b0.finallyEnd(1);
        return false;
    }

    public static /* synthetic */ boolean executeUnconfined$default(DispatchedContinuation dispatchedContinuation, Object obj, int i10, boolean z10, kv.a aVar, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (z10 && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i10;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            aVar.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            b0.finallyStart(1);
        } catch (Throwable th2) {
            try {
                dispatchedContinuation.handleFatalException$kotlinx_coroutines_core(th2);
                b0.finallyStart(1);
            } catch (Throwable th3) {
                b0.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                b0.finallyEnd(1);
                throw th3;
            }
        }
        eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        b0.finallyEnd(1);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x003e, B:13:0x004c, B:15:0x0052, B:28:0x008f, B:18:0x0069, B:20:0x0079, B:25:0x0086, B:27:0x008c, B:33:0x009c, B:36:0x00a5, B:35:0x00a2, B:23:0x007f), top: B:45:0x003e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void resumeCancellableWith(zu.d<? super T> r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto Lb0
            kotlinx.coroutines.internal.DispatchedContinuation r6 = (kotlinx.coroutines.internal.DispatchedContinuation) r6
            java.lang.Object r0 = kotlinx.coroutines.CompletionStateKt.toState(r7)
            kotlinx.coroutines.CoroutineDispatcher r1 = r6.dispatcher
            zu.m r2 = r6.getContext()
            boolean r1 = safeIsDispatchNeeded(r1, r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6._state = r0
            r6.resumeMode = r2
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.dispatcher
            zu.m r0 = r6.getContext()
            safeDispatch(r7, r0, r6)
            goto Laa
        L26:
            kotlinx.coroutines.ThreadLocalEventLoop r1 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r1 = r1.getEventLoop$kotlinx_coroutines_core()
            boolean r3 = r1.isUnconfinedLoopActive()
            if (r3 == 0) goto L3b
            r6._state = r0
            r6.resumeMode = r2
            r1.dispatchUnconfined(r6)
            goto Laa
        L3b:
            r1.incrementUseCount(r2)
            zu.m r3 = r6.getContext()     // Catch: java.lang.Throwable -> L67
            kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L67
            zu.k r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L67
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L67
            r6.cancelCompletedResult$kotlinx_coroutines_core(r0, r7)     // Catch: java.lang.Throwable -> L67
            int r0 = tu.z.f87419c     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = tu.a0.createFailure(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = tu.z.m7131constructorimpl(r7)     // Catch: java.lang.Throwable -> L67
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
            goto L8f
        L67:
            r7 = move-exception
            goto La6
        L69:
            zu.d<T> r0 = r6.continuation     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> L67
            zu.m r4 = r0.getContext()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L67
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            kotlinx.coroutines.UndispatchedCoroutine r0 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            zu.d<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L99
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L8c
            boolean r7 = r0.clearThreadContext()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L8f
        L8c:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L67
        L8f:
            boolean r7 = r1.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L8f
        L95:
            r1.decrementUseCount(r2)
            goto Laa
        L99:
            r7 = move-exception
            if (r0 == 0) goto La2
            boolean r0 = r0.clearThreadContext()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La5
        La2:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L67
        La5:
            throw r7     // Catch: java.lang.Throwable -> L67
        La6:
            r6.handleFatalException$kotlinx_coroutines_core(r7)     // Catch: java.lang.Throwable -> Lab
            goto L95
        Laa:
            return
        Lab:
            r6 = move-exception
            r1.decrementUseCount(r2)
            throw r6
        Lb0:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(zu.d, java.lang.Object):void");
    }

    public static final void safeDispatch(CoroutineDispatcher coroutineDispatcher, m mVar, Runnable runnable) {
        try {
            coroutineDispatcher.mo5197dispatch(mVar, runnable);
        } catch (Throwable th2) {
            throw new DispatchException(th2, coroutineDispatcher, mVar);
        }
    }

    public static final boolean safeIsDispatchNeeded(CoroutineDispatcher coroutineDispatcher, m mVar) throws DispatchException {
        try {
            return coroutineDispatcher.isDispatchNeeded(mVar);
        } catch (Throwable th2) {
            throw new DispatchException(th2, coroutineDispatcher, mVar);
        }
    }

    public static final boolean yieldUndispatched(DispatchedContinuation<? super x0> dispatchedContinuation) {
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = x0.f87415a;
            dispatchedContinuation.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            dispatchedContinuation.run();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
