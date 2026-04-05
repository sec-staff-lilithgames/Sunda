package yt;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends qu.b implements Iterator {

    /* renamed from: c, reason: collision with root package name */
    public final Semaphore f95307c = new Semaphore(0);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f95308e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public mt.a0 f95309f;

    @Override // java.util.Iterator
    public boolean hasNext() throws InterruptedException {
        mt.a0 a0Var = this.f95309f;
        if (a0Var != null && a0Var.isOnError()) {
            throw iu.m.wrapOrThrow(this.f95309f.getError());
        }
        mt.a0 a0Var2 = this.f95309f;
        if ((a0Var2 == null || a0Var2.isOnNext()) && this.f95309f == null) {
            try {
                iu.f.verifyNonBlocking();
                this.f95307c.acquire();
                mt.a0 a0Var3 = (mt.a0) this.f95308e.getAndSet(null);
                this.f95309f = a0Var3;
                if (a0Var3.isOnError()) {
                    throw iu.m.wrapOrThrow(a0Var3.getError());
                }
            } catch (InterruptedException e10) {
                dispose();
                this.f95309f = mt.a0.createOnError(e10);
                throw iu.m.wrapOrThrow(e10);
            }
        }
        return this.f95309f.isOnNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext() || !this.f95309f.isOnNext()) {
            throw new NoSuchElementException();
        }
        Object value = this.f95309f.getValue();
        this.f95309f = null;
        return value;
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        mu.a.onError(th2);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Read-only iterator.");
    }

    @Override // qu.b, mt.q, tw.c
    public void onNext(mt.a0 a0Var) {
        if (this.f95308e.getAndSet(a0Var) == null) {
            this.f95307c.release();
        }
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onComplete() {
    }
}
