package kotlinx.coroutines;

import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DispatchException extends Exception {
    private final Throwable cause;

    public DispatchException(Throwable th2, CoroutineDispatcher coroutineDispatcher, m mVar) {
        super("Coroutine dispatcher " + coroutineDispatcher + " threw an exception, context = " + mVar, th2);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
