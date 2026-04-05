package io.ktor.utils.io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class DefaultParking implements Parking<Thread> {
    public static final DefaultParking INSTANCE = new DefaultParking();

    private DefaultParking() {
    }

    @Override // io.ktor.utils.io.jvm.javaio.Parking
    public void park(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LockSupport.parkNanos(j10);
    }

    @Override // io.ktor.utils.io.jvm.javaio.Parking
    public Thread token() {
        Thread threadCurrentThread = Thread.currentThread();
        e0.checkNotNullExpressionValue(threadCurrentThread, "currentThread()");
        return threadCurrentThread;
    }

    @Override // io.ktor.utils.io.jvm.javaio.Parking
    public void unpark(Thread token) {
        e0.checkNotNullParameter(token, "token");
        LockSupport.unpark(token);
    }
}
