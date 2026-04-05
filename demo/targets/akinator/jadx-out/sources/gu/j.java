package gu;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends CountDownLatch implements mt.q, Future, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public Object f58438b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f58439c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f58440e;

    public j() {
        super(1);
        this.f58440e = new AtomicReference();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        hu.g gVar;
        while (true) {
            AtomicReference atomicReference = this.f58440e;
            tw.d dVar = (tw.d) atomicReference.get();
            if (dVar == this || dVar == (gVar = hu.g.f59176b)) {
                return false;
            }
            while (!atomicReference.compareAndSet(dVar, gVar)) {
                if (atomicReference.get() != dVar) {
                    break;
                }
            }
            if (dVar != null) {
                dVar.cancel();
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
        Throwable th2 = this.f58439c;
        if (th2 == null) {
            return this.f58438b;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f58440e.get() == hu.g.f59176b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f58438b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while (true) {
            AtomicReference atomicReference = this.f58440e;
            tw.d dVar = (tw.d) atomicReference.get();
            if (dVar == this || dVar == hu.g.f59176b) {
                return;
            }
            while (!atomicReference.compareAndSet(dVar, this)) {
                if (atomicReference.get() != dVar) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        mu.a.onError(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        return;
     */
    @Override // mt.q, tw.c, mt.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference r0 = r3.f58440e
            java.lang.Object r1 = r0.get()
            tw.d r1 = (tw.d) r1
            if (r1 == r3) goto L22
            hu.g r2 = hu.g.f59176b
            if (r1 != r2) goto Lf
            goto L22
        Lf:
            r3.f58439c = r4
        L11:
            boolean r2 = r0.compareAndSet(r1, r3)
            if (r2 == 0) goto L1b
            r3.countDown()
            return
        L1b:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L11
            goto L0
        L22:
            mu.a.onError(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gu.j.onError(java.lang.Throwable):void");
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f58438b == null) {
            this.f58438b = obj;
        } else {
            ((tw.d) this.f58440e.get()).cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this.f58440e, dVar, Long.MAX_VALUE);
    }

    @Override // tw.d
    public void cancel() {
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
            Throwable th2 = this.f58439c;
            if (th2 == null) {
                return this.f58438b;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // tw.d
    public void request(long j10) {
    }
}
