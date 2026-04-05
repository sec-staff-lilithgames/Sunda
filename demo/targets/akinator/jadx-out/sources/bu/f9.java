package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f9 extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final ku.m f10310b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10311c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f10312e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public pt.c f10313f;

    public f9(ku.m mVar, mt.g0 g0Var) {
        this.f10310b = mVar;
        this.f10311c = g0Var;
    }

    public abstract void a();

    public abstract void b();

    public void complete() {
        this.f10313f.dispose();
        a();
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f10312e);
        this.f10313f.dispose();
    }

    public void error(Throwable th2) {
        this.f10313f.dispose();
        this.f10310b.onError(th2);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10312e.get() == tt.d.f87352b;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        tt.d.dispose(this.f10312e);
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this.f10312e);
        this.f10310b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        lazySet(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10313f, cVar)) {
            this.f10313f = cVar;
            this.f10310b.onSubscribe(this);
            if (this.f10312e.get() == null) {
                this.f10311c.subscribe(new g9(this));
            }
        }
    }
}
