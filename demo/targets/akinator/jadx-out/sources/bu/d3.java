package bu;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d3 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f10198b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10199c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10200e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f10201f;

    /* renamed from: g, reason: collision with root package name */
    public long f10202g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10203h;

    public d3(mt.q0 q0Var, long j10, Object obj) {
        this.f10198b = q0Var;
        this.f10199c = j10;
        this.f10200e = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f10201f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10201f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10203h) {
            return;
        }
        this.f10203h = true;
        mt.q0 q0Var = this.f10198b;
        Object obj = this.f10200e;
        if (obj != null) {
            q0Var.onSuccess(obj);
        } else {
            q0Var.onError(new NoSuchElementException());
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10203h) {
            mu.a.onError(th2);
        } else {
            this.f10203h = true;
            this.f10198b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10203h) {
            return;
        }
        long j10 = this.f10202g;
        if (j10 != this.f10199c) {
            this.f10202g = j10 + 1;
            return;
        }
        this.f10203h = true;
        this.f10201f.dispose();
        this.f10198b.onSuccess(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10201f, cVar)) {
            this.f10201f = cVar;
            this.f10198b.onSubscribe(this);
        }
    }
}
