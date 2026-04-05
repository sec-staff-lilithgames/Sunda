package io.ktor.util.cio;

import av.e;
import kotlinx.coroutines.sync.SemaphoreKt;
import tu.f;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class Semaphore {
    private final kotlinx.coroutines.sync.Semaphore delegate;
    private final int limit;

    public Semaphore(int i10) {
        this.limit = i10;
        this.delegate = SemaphoreKt.Semaphore$default(i10, 0, 2, null);
    }

    public final Object acquire(d<? super x0> dVar) {
        Object objAcquire = this.delegate.acquire(dVar);
        return objAcquire == e.getCOROUTINE_SUSPENDED() ? objAcquire : x0.f87415a;
    }

    @f
    public final Object enter(d<? super x0> dVar) {
        Object objAcquire = this.delegate.acquire(dVar);
        return objAcquire == e.getCOROUTINE_SUSPENDED() ? objAcquire : x0.f87415a;
    }

    public final int getLimit() {
        return this.limit;
    }

    @f
    public final void leave() {
        this.delegate.release();
    }

    public final void release() {
        this.delegate.release();
    }
}
