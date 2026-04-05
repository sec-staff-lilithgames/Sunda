package bu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b9 extends AtomicReference implements mt.i0, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final ku.m f10123b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10124c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10125e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f10126f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f10127g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    public pt.c f10128h;

    public b9(ku.m mVar, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f10123b = mVar;
        this.f10124c = j10;
        this.f10125e = timeUnit;
        this.f10126f = m0Var;
    }

    public abstract void a();

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f10127g);
        this.f10128h.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10128h.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        tt.d.dispose(this.f10127g);
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this.f10127g);
        this.f10123b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        lazySet(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10128h, cVar)) {
            this.f10128h = cVar;
            this.f10123b.onSubscribe(this);
            long j10 = this.f10124c;
            tt.d.replace(this.f10127g, this.f10126f.schedulePeriodicallyDirect(this, j10, j10, this.f10125e));
        }
    }
}
