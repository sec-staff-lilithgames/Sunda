package kotlinx.coroutines;

import e3.g;
import kv.p;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class AbstractCoroutine<T> extends JobSupport implements Job, d<T>, CoroutineScope {
    private final m context;

    public AbstractCoroutine(m mVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            initParentJob((Job) mVar.get(Job.Key));
        }
        this.context = mVar.plus(this);
    }

    public void afterResume(Object obj) {
        afterCompletion(obj);
    }

    @Override // kotlinx.coroutines.JobSupport
    public String cancellationExceptionMessage() {
        return DebugStringsKt.getClassSimpleName(this) + " was cancelled";
    }

    @Override // zu.d
    public final m getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void handleOnCompletionException$kotlinx_coroutines_core(Throwable th2) {
        CoroutineExceptionHandlerKt.handleCoroutineException(this.context, th2);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.JobSupport
    public String nameString$kotlinx_coroutines_core() {
        String coroutineName = CoroutineContextKt.getCoroutineName(this.context);
        if (coroutineName == null) {
            return super.nameString$kotlinx_coroutines_core();
        }
        StringBuilder sbO = g.o("\"", coroutineName, "\":");
        sbO.append(super.nameString$kotlinx_coroutines_core());
        return sbO.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    public final void onCompletionInternal(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            onCompleted(obj);
        } else {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            onCancelled(completedExceptionally.cause, completedExceptionally.getHandled());
        }
    }

    @Override // zu.d
    public final void resumeWith(Object obj) {
        Object objMakeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(CompletionStateKt.toState(obj));
        if (objMakeCompletingOnce$kotlinx_coroutines_core == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return;
        }
        afterResume(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    public final <R> void start(CoroutineStart coroutineStart, R r10, p pVar) {
        coroutineStart.invoke(pVar, r10, this);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    public void onCompleted(T t10) {
    }

    public void onCancelled(Throwable th2, boolean z10) {
    }
}
