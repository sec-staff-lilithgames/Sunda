package kotlinx.coroutines;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class CompletedContinuation<R> {
    public final Throwable cancelCause;
    public final CancelHandler cancelHandler;
    public final Object idempotentResume;
    public final q onCancellation;
    public final R result;

    public CompletedContinuation(R r10, CancelHandler cancelHandler, q qVar, Object obj, Throwable th2) {
        this.result = r10;
        this.cancelHandler = cancelHandler;
        this.onCancellation = qVar;
        this.idempotentResume = obj;
        this.cancelCause = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedContinuation copy$default(CompletedContinuation completedContinuation, Object obj, CancelHandler cancelHandler, q qVar, Object obj2, Throwable th2, int i10, Object obj3) {
        R r10 = obj;
        if ((i10 & 1) != 0) {
            r10 = completedContinuation.result;
        }
        if ((i10 & 2) != 0) {
            cancelHandler = completedContinuation.cancelHandler;
        }
        if ((i10 & 4) != 0) {
            qVar = completedContinuation.onCancellation;
        }
        if ((i10 & 8) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        if ((i10 & 16) != 0) {
            th2 = completedContinuation.cancelCause;
        }
        Throwable th3 = th2;
        q qVar2 = qVar;
        return completedContinuation.copy(r10, cancelHandler, qVar2, obj2, th3);
    }

    public final R component1() {
        return this.result;
    }

    public final CancelHandler component2() {
        return this.cancelHandler;
    }

    public final q component3() {
        return this.onCancellation;
    }

    public final Object component4() {
        return this.idempotentResume;
    }

    public final Throwable component5() {
        return this.cancelCause;
    }

    public final CompletedContinuation<R> copy(R r10, CancelHandler cancelHandler, q qVar, Object obj, Throwable th2) {
        return new CompletedContinuation<>(r10, cancelHandler, qVar, obj, th2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
        return e0.areEqual(this.result, completedContinuation.result) && e0.areEqual(this.cancelHandler, completedContinuation.cancelHandler) && e0.areEqual(this.onCancellation, completedContinuation.onCancellation) && e0.areEqual(this.idempotentResume, completedContinuation.idempotentResume) && e0.areEqual(this.cancelCause, completedContinuation.cancelCause);
    }

    public final boolean getCancelled() {
        return this.cancelCause != null;
    }

    public int hashCode() {
        R r10 = this.result;
        int iHashCode = (r10 == null ? 0 : r10.hashCode()) * 31;
        CancelHandler cancelHandler = this.cancelHandler;
        int iHashCode2 = (iHashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        q qVar = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.cancelCause;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final void invokeHandlers(CancellableContinuationImpl<?> cancellableContinuationImpl, Throwable th2) {
        CancelHandler cancelHandler = this.cancelHandler;
        if (cancelHandler != null) {
            cancellableContinuationImpl.callCancelHandler(cancelHandler, th2);
        }
        q qVar = this.onCancellation;
        if (qVar != null) {
            cancellableContinuationImpl.callOnCancellation(qVar, th2, this.result);
        }
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    public /* synthetic */ CompletedContinuation(Object obj, CancelHandler cancelHandler, q qVar, Object obj2, Throwable th2, int i10, u uVar) {
        this(obj, (i10 & 2) != 0 ? null : cancelHandler, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
