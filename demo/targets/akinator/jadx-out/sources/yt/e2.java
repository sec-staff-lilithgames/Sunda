package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e2 extends AtomicInteger implements mt.n {

    /* renamed from: b, reason: collision with root package name */
    public final y1 f95407b;

    /* renamed from: c, reason: collision with root package name */
    public final iu.d f95408c = new iu.d();

    /* renamed from: e, reason: collision with root package name */
    public final eu.d f95409e = new eu.d(16);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f95410f;

    public e2(y1 y1Var) {
        this.f95407b = y1Var;
    }

    public final void a() {
        y1 y1Var = this.f95407b;
        eu.d dVar = this.f95409e;
        iu.d dVar2 = this.f95408c;
        int iAddAndGet = 1;
        while (!y1Var.isCancelled()) {
            if (dVar2.get() != null) {
                dVar.clear();
                y1Var.onError(dVar2.terminate());
                return;
            }
            boolean z10 = this.f95410f;
            Object objPoll = dVar.poll();
            boolean z11 = objPoll == null;
            if (z10 && z11) {
                y1Var.onComplete();
                return;
            } else if (z11) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                y1Var.onNext(objPoll);
            }
        }
        dVar.clear();
    }

    @Override // mt.n
    public boolean isCancelled() {
        return this.f95407b.isCancelled();
    }

    @Override // mt.n, mt.k
    public void onComplete() {
        if (this.f95407b.isCancelled() || this.f95410f) {
            return;
        }
        this.f95410f = true;
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.n, mt.k
    public void onError(Throwable th2) {
        if (tryOnError(th2)) {
            return;
        }
        mu.a.onError(th2);
    }

    @Override // mt.n, mt.k
    public void onNext(Object obj) {
        if (this.f95407b.isCancelled() || this.f95410f) {
            return;
        }
        if (obj == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            this.f95407b.onNext(obj);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            eu.d dVar = this.f95409e;
            synchronized (dVar) {
                dVar.offer(obj);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        a();
    }

    @Override // mt.n
    public long requested() {
        return this.f95407b.requested();
    }

    @Override // mt.n
    public void setCancellable(st.f fVar) {
        this.f95407b.setCancellable(fVar);
    }

    @Override // mt.n
    public void setDisposable(pt.c cVar) {
        this.f95407b.setDisposable(cVar);
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f95407b.toString();
    }

    @Override // mt.n
    public boolean tryOnError(Throwable th2) {
        if (this.f95407b.isCancelled() || this.f95410f) {
            return false;
        }
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!this.f95408c.addThrowable(th2)) {
            return false;
        }
        this.f95410f = true;
        if (getAndIncrement() == 0) {
            a();
        }
        return true;
    }

    @Override // mt.n
    public mt.n serialize() {
        return this;
    }
}
