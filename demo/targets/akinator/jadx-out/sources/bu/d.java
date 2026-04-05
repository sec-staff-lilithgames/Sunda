package bu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends ku.j implements Iterator {

    /* renamed from: c, reason: collision with root package name */
    public mt.a0 f10189c;

    /* renamed from: e, reason: collision with root package name */
    public final Semaphore f10190e = new Semaphore(0);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f10191f = new AtomicReference();

    @Override // java.util.Iterator
    public boolean hasNext() throws InterruptedException {
        mt.a0 a0Var = this.f10189c;
        if (a0Var != null && a0Var.isOnError()) {
            throw iu.m.wrapOrThrow(this.f10189c.getError());
        }
        if (this.f10189c == null) {
            try {
                iu.f.verifyNonBlocking();
                this.f10190e.acquire();
                mt.a0 a0Var2 = (mt.a0) this.f10191f.getAndSet(null);
                this.f10189c = a0Var2;
                if (a0Var2.isOnError()) {
                    throw iu.m.wrapOrThrow(a0Var2.getError());
                }
            } catch (InterruptedException e10) {
                dispose();
                this.f10189c = mt.a0.createOnError(e10);
                throw iu.m.wrapOrThrow(e10);
            }
        }
        return this.f10189c.isOnNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object value = this.f10189c.getValue();
        this.f10189c = null;
        return value;
    }

    @Override // ku.j, mt.i0, mt.f
    public void onError(Throwable th2) {
        mu.a.onError(th2);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Read-only iterator.");
    }

    @Override // ku.j, mt.i0
    public void onNext(mt.a0 a0Var) {
        if (this.f10191f.getAndSet(a0Var) == null) {
            this.f10190e.release();
        }
    }

    @Override // ku.j, mt.i0, mt.f
    public void onComplete() {
    }
}
