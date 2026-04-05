package wt;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import mt.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q extends CountDownLatch implements q0, Future, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public Object f91272b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f91273c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f91274e;

    public q() {
        super(1);
        this.f91274e = new AtomicReference();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        tt.d dVar;
        while (true) {
            AtomicReference atomicReference = this.f91274e;
            pt.c cVar = (pt.c) atomicReference.get();
            if (cVar == this || cVar == (dVar = tt.d.f87352b)) {
                return false;
            }
            while (!atomicReference.compareAndSet(cVar, dVar)) {
                if (atomicReference.get() != cVar) {
                    break;
                }
            }
            if (cVar != null) {
                cVar.dispose();
            }
            countDown();
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            iu.f.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f91273c;
        if (th2 == null) {
            return this.f91272b;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return tt.d.isDisposed((pt.c) this.f91274e.get());
    }

    @Override // pt.c
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        while (true) {
            AtomicReference atomicReference = this.f91274e;
            pt.c cVar = (pt.c) atomicReference.get();
            if (cVar == tt.d.f87352b) {
                mu.a.onError(th2);
                return;
            }
            this.f91273c = th2;
            while (!atomicReference.compareAndSet(cVar, this)) {
                if (atomicReference.get() != cVar) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f91274e, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        AtomicReference atomicReference = this.f91274e;
        pt.c cVar = (pt.c) atomicReference.get();
        if (cVar == tt.d.f87352b) {
            return;
        }
        this.f91272b = obj;
        while (!atomicReference.compareAndSet(cVar, this) && atomicReference.get() == cVar) {
        }
        countDown();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            iu.f.verifyNonBlocking();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(iu.m.timeoutMessage(j10, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th2 = this.f91273c;
            if (th2 == null) {
                return this.f91272b;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // pt.c
    public void dispose() {
    }
}
