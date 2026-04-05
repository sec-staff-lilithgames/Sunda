package kotlinx.coroutines.sync;

import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface Semaphore {
    Object acquire(d<? super x0> dVar);

    int getAvailablePermits();

    void release();

    boolean tryAcquire();
}
