package bu;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z2 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11294b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11295c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11296e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11297f;

    /* renamed from: g, reason: collision with root package name */
    public pt.c f11298g;

    /* renamed from: h, reason: collision with root package name */
    public long f11299h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11300i;

    public z2(mt.i0 i0Var, long j10, Object obj, boolean z10) {
        this.f11294b = i0Var;
        this.f11295c = j10;
        this.f11296e = obj;
        this.f11297f = z10;
    }

    @Override // pt.c
    public void dispose() {
        this.f11298g.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11298g.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11300i) {
            return;
        }
        this.f11300i = true;
        mt.i0 i0Var = this.f11294b;
        Object obj = this.f11296e;
        if (obj == null && this.f11297f) {
            i0Var.onError(new NoSuchElementException());
            return;
        }
        if (obj != null) {
            i0Var.onNext(obj);
        }
        i0Var.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11300i) {
            mu.a.onError(th2);
        } else {
            this.f11300i = true;
            this.f11294b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11300i) {
            return;
        }
        long j10 = this.f11299h;
        if (j10 != this.f11295c) {
            this.f11299h = j10 + 1;
            return;
        }
        this.f11300i = true;
        this.f11298g.dispose();
        mt.i0 i0Var = this.f11294b;
        i0Var.onNext(obj);
        i0Var.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11298g, cVar)) {
            this.f11298g = cVar;
            this.f11294b.onSubscribe(this);
        }
    }
}
