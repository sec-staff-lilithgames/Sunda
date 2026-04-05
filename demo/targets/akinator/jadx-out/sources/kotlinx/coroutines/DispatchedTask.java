package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.Task;
import tu.a0;
import tu.z;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class DispatchedTask<T> extends Task {
    public int resumeMode;

    public DispatchedTask(int i10) {
        this.resumeMode = i10;
    }

    public abstract d<T> getDelegate$kotlinx_coroutines_core();

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable th2) {
        CoroutineExceptionHandlerKt.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            d<T> delegate$kotlinx_coroutines_core = getDelegate$kotlinx_coroutines_core();
            e0.checkNotNull(delegate$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) delegate$kotlinx_coroutines_core;
            d<T> dVar = dispatchedContinuation.continuation;
            Object obj = dispatchedContinuation.countOrElement;
            m context = dVar.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
            Job job = null;
            UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(dVar, context, objUpdateThreadContext) : null;
            try {
                m context2 = dVar.getContext();
                Object objTakeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
                if (exceptionalResult$kotlinx_coroutines_core == null && DispatchedTaskKt.isCancellableMode(this.resumeMode)) {
                    job = (Job) context2.get(Job.Key);
                }
                if (job != null && !job.isActive()) {
                    CancellationException cancellationException = job.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core, cancellationException);
                    int i10 = z.f87419c;
                    dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(cancellationException)));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    int i11 = z.f87419c;
                    dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(exceptionalResult$kotlinx_coroutines_core)));
                } else {
                    int i12 = z.f87419c;
                    dVar.resumeWith(z.m7131constructorimpl(getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core)));
                }
                if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                }
            } catch (Throwable th2) {
                if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                }
                throw th2;
            }
        } catch (DispatchException e10) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getContext(), e10.getCause());
        } catch (Throwable th3) {
            handleFatalException$kotlinx_coroutines_core(th3);
        }
    }

    public abstract Object takeState$kotlinx_coroutines_core();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj;
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th2) {
    }
}
