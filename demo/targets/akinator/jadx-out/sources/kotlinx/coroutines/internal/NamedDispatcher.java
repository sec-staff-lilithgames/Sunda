package kotlinx.coroutines.internal;

import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import tu.f;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class NamedDispatcher extends CoroutineDispatcher implements Delay {
    private final /* synthetic */ Delay $$delegate_0;
    private final CoroutineDispatcher dispatcher;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public NamedDispatcher(CoroutineDispatcher coroutineDispatcher, String str) {
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.$$delegate_0 = delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
        this.dispatcher = coroutineDispatcher;
        this.name = str;
    }

    @Override // kotlinx.coroutines.Delay
    @f
    public Object delay(long j10, d<? super x0> dVar) {
        return this.$$delegate_0.delay(j10, dVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo5197dispatch(m mVar, Runnable runnable) {
        this.dispatcher.mo5197dispatch(mVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(m mVar, Runnable runnable) {
        this.dispatcher.dispatchYield(mVar, runnable);
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j10, Runnable runnable, m mVar) {
        return this.$$delegate_0.invokeOnTimeout(j10, runnable, mVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(m mVar) {
        return this.dispatcher.isDispatchNeeded(mVar);
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: scheduleResumeAfterDelay */
    public void mo5198scheduleResumeAfterDelay(long j10, CancellableContinuation<? super x0> cancellableContinuation) {
        this.$$delegate_0.mo5198scheduleResumeAfterDelay(j10, cancellableContinuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return this.name;
    }
}
