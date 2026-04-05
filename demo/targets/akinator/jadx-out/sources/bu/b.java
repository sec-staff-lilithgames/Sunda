package bu;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends AtomicReference implements mt.i0, Iterator, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final eu.d f10103b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f10104c;

    /* renamed from: e, reason: collision with root package name */
    public final Condition f10105e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f10106f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Throwable f10107g;

    public b(int i10) {
        this.f10103b = new eu.d(i10);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f10104c = reentrantLock;
        this.f10105e = reentrantLock.newCondition();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f10104c;
        reentrantLock.lock();
        try {
            this.f10105e.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
        a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (!isDisposed()) {
            boolean z10 = this.f10106f;
            boolean zIsEmpty = this.f10103b.isEmpty();
            if (z10) {
                Throwable th2 = this.f10107g;
                if (th2 != null) {
                    throw iu.m.wrapOrThrow(th2);
                }
                if (zIsEmpty) {
                    return false;
                }
            }
            if (!zIsEmpty) {
                return true;
            }
            try {
                iu.f.verifyNonBlocking();
                this.f10104c.lock();
                while (!this.f10106f && this.f10103b.isEmpty() && !isDisposed()) {
                    try {
                        this.f10105e.await();
                    } catch (Throwable th3) {
                        this.f10104c.unlock();
                        throw th3;
                    }
                }
                this.f10104c.unlock();
            } catch (InterruptedException e10) {
                tt.d.dispose(this);
                a();
                throw iu.m.wrapOrThrow(e10);
            }
        }
        Throwable th4 = this.f10107g;
        if (th4 == null) {
            return false;
        }
        throw iu.m.wrapOrThrow(th4);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            return this.f10103b.poll();
        }
        throw new NoSuchElementException();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10106f = true;
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10107g = th2;
        this.f10106f = true;
        a();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10103b.offer(obj);
        a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProductAction.ACTION_REMOVE);
    }
}
