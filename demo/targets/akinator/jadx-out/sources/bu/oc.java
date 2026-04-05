package bu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class oc extends AtomicInteger implements mt.i0, pt.c, Runnable {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f10764m = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10765b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10766c;

    /* renamed from: e, reason: collision with root package name */
    public final nc f10767e = new nc(this);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f10768f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f10769g = new AtomicInteger(1);

    /* renamed from: h, reason: collision with root package name */
    public final eu.b f10770h = new eu.b();

    /* renamed from: i, reason: collision with root package name */
    public final iu.d f10771i = new iu.d();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f10772j = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f10773k;

    /* renamed from: l, reason: collision with root package name */
    public pu.h f10774l;

    public oc(mt.i0 i0Var, int i10) {
        this.f10765b = i0Var;
        this.f10766c = i10;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        mt.i0 i0Var = this.f10765b;
        eu.b bVar = this.f10770h;
        iu.d dVar = this.f10771i;
        int iAddAndGet = 1;
        while (this.f10769g.get() != 0) {
            pu.h hVar = this.f10774l;
            boolean z10 = this.f10773k;
            if (z10 && dVar.get() != null) {
                bVar.clear();
                Throwable thTerminate = dVar.terminate();
                if (hVar != null) {
                    this.f10774l = null;
                    hVar.onError(thTerminate);
                }
                i0Var.onError(thTerminate);
                return;
            }
            Object objPoll = bVar.poll();
            boolean z11 = objPoll == null;
            if (z10 && z11) {
                Throwable thTerminate2 = dVar.terminate();
                if (thTerminate2 == null) {
                    if (hVar != null) {
                        this.f10774l = null;
                        hVar.onComplete();
                    }
                    i0Var.onComplete();
                    return;
                }
                if (hVar != null) {
                    this.f10774l = null;
                    hVar.onError(thTerminate2);
                }
                i0Var.onError(thTerminate2);
                return;
            }
            if (z11) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (objPoll != f10764m) {
                hVar.onNext(objPoll);
            } else {
                if (hVar != null) {
                    this.f10774l = null;
                    hVar.onComplete();
                }
                if (!this.f10772j.get()) {
                    pu.h hVarCreate = pu.h.create(this.f10766c, this);
                    this.f10774l = hVarCreate;
                    this.f10769g.getAndIncrement();
                    i0Var.onNext(hVarCreate);
                }
            }
        }
        bVar.clear();
        this.f10774l = null;
    }

    @Override // pt.c
    public void dispose() {
        if (this.f10772j.compareAndSet(false, true)) {
            this.f10767e.dispose();
            if (this.f10769g.decrementAndGet() == 0) {
                tt.d.dispose(this.f10768f);
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10772j.get();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10767e.dispose();
        this.f10773k = true;
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10767e.dispose();
        if (!this.f10771i.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            this.f10773k = true;
            a();
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10770h.offer(obj);
        a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this.f10768f, cVar)) {
            this.f10770h.offer(f10764m);
            a();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f10769g.decrementAndGet() == 0) {
            tt.d.dispose(this.f10768f);
        }
    }
}
