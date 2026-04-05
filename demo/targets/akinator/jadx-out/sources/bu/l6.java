package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l6 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10589b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10590c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final k6 f10591e = new k6(this);

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f10592f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public volatile eu.d f10593g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10594h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10595i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f10596j;

    /* renamed from: k, reason: collision with root package name */
    public volatile int f10597k;

    public l6(mt.i0 i0Var) {
        this.f10589b = i0Var;
    }

    public final void a() {
        mt.i0 i0Var = this.f10589b;
        int iAddAndGet = 1;
        while (!this.f10595i) {
            if (this.f10592f.get() != null) {
                this.f10594h = null;
                this.f10593g = null;
                i0Var.onError(this.f10592f.terminate());
                return;
            }
            int i10 = this.f10597k;
            if (i10 == 1) {
                Object obj = this.f10594h;
                this.f10594h = null;
                this.f10597k = 2;
                i0Var.onNext(obj);
                i10 = 2;
            }
            boolean z10 = this.f10596j;
            eu.d dVar = this.f10593g;
            Object objPoll = dVar != null ? dVar.poll() : null;
            boolean z11 = objPoll == null;
            if (z10 && z11 && i10 == 2) {
                this.f10593g = null;
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
        this.f10594h = null;
        this.f10593g = null;
    }

    @Override // pt.c
    public void dispose() {
        this.f10595i = true;
        tt.d.dispose(this.f10590c);
        tt.d.dispose(this.f10591e);
        if (getAndIncrement() == 0) {
            this.f10593g = null;
            this.f10594h = null;
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f10590c.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10596j = true;
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!this.f10592f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        tt.d.dispose(this.f10591e);
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (compareAndSet(0, 1)) {
            this.f10589b.onNext(obj);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            eu.d dVar = this.f10593g;
            if (dVar == null) {
                dVar = new eu.d(mt.b0.bufferSize());
                this.f10593g = dVar;
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
        tt.d.setOnce(this.f10590c, cVar);
    }
}
