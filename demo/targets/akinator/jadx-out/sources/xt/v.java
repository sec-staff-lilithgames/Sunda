package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v implements mt.f, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93516b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f93517c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f93518e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f93519f;

    public v(mt.f fVar, mt.m0 m0Var) {
        this.f93516b = fVar;
        this.f93517c = m0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f93519f = true;
        this.f93517c.scheduleDirect(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f93519f;
    }

    @Override // mt.f
    public void onComplete() {
        if (this.f93519f) {
            return;
        }
        this.f93516b.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        if (this.f93519f) {
            mu.a.onError(th2);
        } else {
            this.f93516b.onError(th2);
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f93518e, cVar)) {
            this.f93518e = cVar;
            this.f93516b.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93518e.dispose();
        this.f93518e = tt.d.f87352b;
    }
}
