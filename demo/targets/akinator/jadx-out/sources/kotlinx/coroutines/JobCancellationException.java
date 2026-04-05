package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JobCancellationException extends CancellationException implements CopyableThrowable<JobCancellationException> {
    private final transient Job _job;

    public JobCancellationException(String str, Throwable th2, Job job) {
        super(str);
        this._job = job;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public JobCancellationException createCopy() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        return e0.areEqual(jobCancellationException.getMessage(), getMessage()) && e0.areEqual(jobCancellationException.getJob$kotlinx_coroutines_core(), getJob$kotlinx_coroutines_core()) && e0.areEqual(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final Job getJob$kotlinx_coroutines_core() {
        Job job = this._job;
        return job == null ? NonCancellable.INSTANCE : job;
    }

    public int hashCode() {
        String message = getMessage();
        e0.checkNotNull(message);
        int iHashCode = message.hashCode() * 31;
        Job job$kotlinx_coroutines_core = getJob$kotlinx_coroutines_core();
        int iHashCode2 = (iHashCode + (job$kotlinx_coroutines_core != null ? job$kotlinx_coroutines_core.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + getJob$kotlinx_coroutines_core();
    }
}
