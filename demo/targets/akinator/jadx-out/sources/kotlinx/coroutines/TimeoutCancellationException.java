package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class TimeoutCancellationException extends CancellationException implements CopyableThrowable<TimeoutCancellationException> {
    public final transient Job coroutine;

    public TimeoutCancellationException(String str, Job job) {
        super(str);
        this.coroutine = job;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public TimeoutCancellationException createCopy() {
        String message = getMessage();
        if (message == null) {
            message = QpyI.YjzOeruwE;
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.coroutine);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}
