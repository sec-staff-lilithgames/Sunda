package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o6 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10742b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10743c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final n6 f10744e = new n6(this);

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f10745f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public volatile eu.d f10746g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10747h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10748i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f10749j;

    /* renamed from: k, reason: collision with root package name */
    public volatile int f10750k;

    public o6(mt.i0 i0Var) {
        this.f10742b = i0Var;
    }

    public final void a() {
        mt.i0 i0Var = this.f10742b;
        int iAddAndGet = 1;
        while (!this.f10748i) {
            if (this.f10745f.get() != null) {
                this.f10747h = null;
                this.f10746g = null;
                i0Var.onError(this.f10745f.terminate());
                return;
            }
            int i10 = this.f10750k;
            if (i10 == 1) {
                Object obj = this.f10747h;
                this.f10747h = null;
                this.f10750k = 2;
                i0Var.onNext(obj);
                i10 = 2;
            }
            boolean z10 = this.f10749j;
            eu.d dVar = this.f10746g;
            Object objPoll = dVar != null ? dVar.poll() : null;
            boolean z11 = objPoll == null;
            if (z10 && z11 && i10 == 2) {
                this.f10746g = null;
                i0Var.onComplete();
                return;
            } else if (z11) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                i0Var.onNext(objPoll);
            }
        }
        this.f10747h = null;
        this.f10746g = null;
    }

    @Override // pt.c
    public void dispose() {
        this.f10748i = true;
        tt.d.dispose(this.f10743c);
        tt.d.dispose(this.f10744e);
        if (getAndIncrement() == 0) {
            this.f10746g = null;
            this.f10747h = null;
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f10743c.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10749j = true;
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!this.f10745f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        tt.d.dispose(this.f10744e);
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (compareAndSet(0, 1)) {
            this.f10742b.onNext(obj);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            eu.d dVar = this.f10746g;
            if (dVar == null) {
                dVar = new eu.d(mt.b0.bufferSize());
                this.f10746g = dVar;
            }
            dVar.offer(obj);
            if (getAndIncrement() != 0) {
                return;
            }
        }
        a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10743c, cVar);
    }
}
