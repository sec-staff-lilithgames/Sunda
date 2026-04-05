package xr;

import java.lang.Thread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class kb implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        throw wr.m6.fromThrowable(th2).withDescription("Uncaught exception in the SynchronizationContext. Re-thrown.").asRuntimeException();
    }
}
