package yt;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends AtomicReference implements mt.q, Iterator, Runnable, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final eu.c f95177b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95178c;

    /* renamed from: e, reason: collision with root package name */
    public final long f95179e;

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantLock f95180f;

    /* renamed from: g, reason: collision with root package name */
    public final Condition f95181g;

    /* renamed from: h, reason: collision with root package name */
    public long f95182h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f95183i;

    /* renamed from: j, reason: collision with root package name */
    public volatile Throwable f95184j;

    public b(int i10) {
        this.f95177b = new eu.c(i10);
        this.f95178c = i10;
        this.f95179e = i10 - (i10 >> 2);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f95180f = reentrantLock;
        this.f95181g = reentrantLock.newCondition();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f95180f;
        reentrantLock.lock();
        try {
            this.f95181g.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // pt.c
    public void dispose() {
        hu.g.cancel(this);
        a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (!isDisposed()) {
            boolean z10 = this.f95183i;
            boolean zIsEmpty = this.f95177b.isEmpty();
            if (z10) {
                Throwable th2 = this.f95184j;
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
            iu.f.verifyNonBlocking();
            this.f95180f.lock();
            while (!this.f95183i && this.f95177b.isEmpty() && !isDisposed()) {
                try {
                    try {
                        this.f95181g.await();
                    } catch (InterruptedException e10) {
                        run();
                        throw iu.m.wrapOrThrow(e10);
                    }
                } finally {
                    this.f95180f.unlock();
                }
            }
        }
        Throwable th3 = this.f95184j;
        if (th3 == null) {
            return false;
        }
        throw iu.m.wrapOrThrow(th3);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == hu.g.f59176b;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objPoll = this.f95177b.poll();
        long j10 = this.f95182h + 1;
        if (j10 != this.f95179e) {
            this.f95182h = j10;
            return objPoll;
        }
        this.f95182h = 0L;
        ((tw.d) get()).request(j10);
        return objPoll;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95183i = true;
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95184j = th2;
        this.f95183i = true;
        a();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95177b.offer(obj)) {
            a();
        } else {
            hu.g.cancel(this);
            onError(new qt.e("Queue full?!"));
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, this.f95178c);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProductAction.ACTION_REMOVE);
    }

    @Override // java.lang.Runnable
    public void run() {
        hu.g.cancel(this);
        a();
    }
}
