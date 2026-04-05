package bu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ib extends AtomicReference implements mt.i0, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final ku.m f10427b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10428c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10429e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f10430f;

    /* renamed from: g, reason: collision with root package name */
    public pt.c f10431g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f10432h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10433i;

    public ib(ku.m mVar, long j10, TimeUnit timeUnit, m0.a aVar) {
        this.f10427b = mVar;
        this.f10428c = j10;
        this.f10429e = timeUnit;
        this.f10430f = aVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10431g.dispose();
        this.f10430f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10430f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10433i) {
            return;
        }
        this.f10433i = true;
        this.f10427b.onComplete();
        this.f10430f.dispose();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10433i) {
            mu.a.onError(th2);
            return;
        }
        this.f10433i = true;
        this.f10427b.onError(th2);
        this.f10430f.dispose();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10432h || this.f10433i) {
            return;
        }
        this.f10432h = true;
        this.f10427b.onNext(obj);
        pt.c cVar = (pt.c) get();
        if (cVar != null) {
            cVar.dispose();
        }
        tt.d.replace(this, this.f10430f.schedule(this, this.f10428c, this.f10429e));
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10431g, cVar)) {
            this.f10431g = cVar;
            this.f10427b.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10432h = false;
    }
}
