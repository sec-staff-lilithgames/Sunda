package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.c3;
import im.k;
import j1.o2;
import java.util.concurrent.CancellationException;
import k4.y1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonDisposableHandle;
import qv.v;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class HandlerContext extends HandlerDispatcher implements Delay {
    private final Handler handler;
    private final HandlerContext immediate;
    private final boolean invokeImmediately;
    private final String name;

    private HandlerContext(Handler handler, String str, boolean z10) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z10;
        this.immediate = z10 ? this : new HandlerContext(handler, str, true);
    }

    private final void cancelOnRejection(m mVar, Runnable runnable) {
        JobKt.cancel(mVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Dispatchers.getIO().mo5197dispatch(mVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeOnTimeout$lambda$3(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.handler.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleResumeAfterDelay$lambda$1(CancellableContinuation cancellableContinuation, HandlerContext handlerContext) {
        cancellableContinuation.resumeUndispatched(handlerContext, x0.f87415a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 scheduleResumeAfterDelay$lambda$2(HandlerContext handlerContext, Runnable runnable, Throwable th2) {
        handlerContext.handler.removeCallbacks(runnable);
        return x0.f87415a;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo5197dispatch(m mVar, Runnable runnable) {
        if (this.handler.post(runnable)) {
            return;
        }
        cancelOnRejection(mVar, runnable);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) obj;
        return handlerContext.handler == this.handler && handlerContext.invokeImmediately == this.invokeImmediately;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j10, Runnable runnable, m mVar) {
        if (this.handler.postDelayed(runnable, v.coerceAtMost(j10, 4611686018427387903L))) {
            return new y1(1, this, runnable);
        }
        cancelOnRejection(mVar, runnable);
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(m mVar) {
        return (this.invokeImmediately && e0.areEqual(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: scheduleResumeAfterDelay */
    public void mo5198scheduleResumeAfterDelay(long j10, CancellableContinuation<? super x0> cancellableContinuation) {
        k kVar = new k(21, cancellableContinuation, this);
        if (this.handler.postDelayed(kVar, v.coerceAtMost(j10, 4611686018427387903L))) {
            cancellableContinuation.invokeOnCancellation(new c3(13, this, kVar));
        } else {
            cancelOnRejection(cancellableContinuation.getContext(), kVar);
        }
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        String string = this.name;
        if (string == null) {
            string = this.handler.toString();
        }
        return this.invokeImmediately ? o2.l(string, ".immediate") : string;
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.MainCoroutineDispatcher
    public HandlerContext getImmediate() {
        return this.immediate;
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i10, u uVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
