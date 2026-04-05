package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class kc extends AtomicInteger implements mt.i0, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10544b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10545c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10546e;

    /* renamed from: f, reason: collision with root package name */
    public long f10547f;

    /* renamed from: g, reason: collision with root package name */
    public pt.c f10548g;

    /* renamed from: h, reason: collision with root package name */
    public pu.h f10549h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10550i;

    public kc(mt.i0 i0Var, long j10, int i10) {
        this.f10544b = i0Var;
        this.f10545c = j10;
        this.f10546e = i10;
    }

    @Override // pt.c
    public void dispose() {
        this.f10550i = true;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10550i;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        pu.h hVar = this.f10549h;
        if (hVar != null) {
            this.f10549h = null;
            hVar.onComplete();
        }
        this.f10544b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        pu.h hVar = this.f10549h;
        if (hVar != null) {
            this.f10549h = null;
            hVar.onError(th2);
        }
        this.f10544b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        pu.h hVarCreate = this.f10549h;
        if (hVarCreate == null && !this.f10550i) {
            hVarCreate = pu.h.create(this.f10546e, this);
            this.f10549h = hVarCreate;
            this.f10544b.onNext(hVarCreate);
        }
        if (hVarCreate != null) {
            hVarCreate.onNext(obj);
            long j10 = this.f10547f + 1;
            this.f10547f = j10;
            if (j10 >= this.f10545c) {
                this.f10547f = 0L;
                this.f10549h = null;
                hVarCreate.onComplete();
                if (this.f10550i) {
                    this.f10548g.dispose();
                }
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10548g, cVar)) {
            this.f10548g = cVar;
            this.f10544b.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f10550i) {
            this.f10548g.dispose();
        }
    }
}
