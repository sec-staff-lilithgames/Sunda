package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t1 extends AtomicInteger implements mt.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final s1 f11004b;

    /* renamed from: c, reason: collision with root package name */
    public final iu.d f11005c = new iu.d();

    /* renamed from: e, reason: collision with root package name */
    public final eu.d f11006e = new eu.d(16);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f11007f;

    public t1(s1 s1Var) {
        this.f11004b = s1Var;
    }

    public final void a() {
        s1 s1Var = this.f11004b;
        eu.d dVar = this.f11006e;
        iu.d dVar2 = this.f11005c;
        int iAddAndGet = 1;
        while (!s1Var.isDisposed()) {
            if (dVar2.get() != null) {
                dVar.clear();
                s1Var.onError(dVar2.terminate());
                return;
            }
            boolean z10 = this.f11007f;
            Object objPoll = dVar.poll();
            boolean z11 = objPoll == null;
            if (z10 && z11) {
                s1Var.onComplete();
                return;
            } else if (z11) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                s1Var.onNext(objPoll);
            }
        }
        dVar.clear();
    }

    @Override // mt.d0, pt.c
    public boolean isDisposed() {
        return this.f11004b.isDisposed();
    }

    @Override // mt.d0, mt.k
    public void onComplete() {
        if (this.f11004b.isDisposed() || this.f11007f) {
            return;
        }
        this.f11007f = true;
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.d0, mt.k
    public void onError(Throwable th2) {
        if (tryOnError(th2)) {
            return;
        }
        mu.a.onError(th2);
    }

    @Override // mt.d0, mt.k
    public void onNext(Object obj) {
        if (this.f11004b.isDisposed() || this.f11007f) {
            return;
        }
        if (obj == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            this.f11004b.onNext(obj);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            eu.d dVar = this.f11006e;
            synchronized (dVar) {
                dVar.offer(obj);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        a();
    }

    @Override // mt.d0
    public void setCancellable(st.f fVar) {
        this.f11004b.setCancellable(fVar);
    }

    @Override // mt.d0
    public void setDisposable(pt.c cVar) {
        this.f11004b.setDisposable(cVar);
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f11004b.toString();
    }

    @Override // mt.d0
    public boolean tryOnError(Throwable th2) {
        if (this.f11004b.isDisposed() || this.f11007f) {
            return false;
        }
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!this.f11005c.addThrowable(th2)) {
            return false;
        }
        this.f11007f = true;
        if (getAndIncrement() == 0) {
            a();
        }
        return true;
    }

    @Override // mt.d0
    public mt.d0 serialize() {
        return this;
    }
}
