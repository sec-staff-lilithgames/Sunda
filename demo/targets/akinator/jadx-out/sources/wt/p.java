package wt;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p extends CountDownLatch implements i0, Future, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public Object f91269b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f91270c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f91271e;

    public p() {
        super(1);
        this.f91271e = new AtomicReference();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        tt.d dVar;
        while (true) {
            AtomicReference atomicReference = this.f91271e;
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
        Throwable th2 = this.f91270c;
        if (th2 == null) {
            return this.f91269b;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return tt.d.isDisposed((pt.c) this.f91271e.get());
    }

    @Override // pt.c
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f91269b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while (true) {
            AtomicReference atomicReference = this.f91271e;
            pt.c cVar = (pt.c) atomicReference.get();
            if (cVar == this || cVar == tt.d.f87352b) {
                return;
            }
            while (!atomicReference.compareAndSet(cVar, this)) {
                if (atomicReference.get() != cVar) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        mu.a.onError(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        return;
     */
    @Override // mt.i0, mt.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            java.lang.Throwable r0 = r3.f91270c
            if (r0 != 0) goto L2a
            r3.f91270c = r4
        L6:
            java.util.concurrent.atomic.AtomicReference r0 = r3.f91271e
            java.lang.Object r1 = r0.get()
            pt.c r1 = (pt.c) r1
            if (r1 == r3) goto L26
            tt.d r2 = tt.d.f87352b
            if (r1 != r2) goto L15
            goto L26
        L15:
            boolean r2 = r0.compareAndSet(r1, r3)
            if (r2 == 0) goto L1f
            r3.countDown()
            return
        L1f:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L15
            goto L6
        L26:
            mu.a.onError(r4)
            return
        L2a:
            mu.a.onError(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.p.onError(java.lang.Throwable):void");
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f91269b == null) {
            this.f91269b = obj;
        } else {
            ((pt.c) this.f91271e.get()).dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f91271e, cVar);
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
            Throwable th2 = this.f91270c;
            if (th2 == null) {
                return this.f91269b;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // pt.c
    public void dispose() {
    }
}
