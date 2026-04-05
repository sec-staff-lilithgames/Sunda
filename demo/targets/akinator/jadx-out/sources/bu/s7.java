package bu;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s7 extends AtomicBoolean implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10959b;

    /* renamed from: c, reason: collision with root package name */
    public final t7 f10960c;

    /* renamed from: e, reason: collision with root package name */
    public final r7 f10961e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f10962f;

    public s7(mt.i0 i0Var, t7 t7Var, r7 r7Var) {
        this.f10959b = i0Var;
        this.f10960c = t7Var;
        this.f10961e = r7Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f10962f.dispose();
        if (compareAndSet(false, true)) {
            t7 t7Var = this.f10960c;
            r7 r7Var = this.f10961e;
            synchronized (t7Var) {
                try {
                    r7 r7Var2 = t7Var.f11044h;
                    if (r7Var2 != null && r7Var2 == r7Var) {
                        long j10 = r7Var.f10911e - 1;
                        r7Var.f10911e = j10;
                        if (j10 == 0 && r7Var.f10912f) {
                            if (t7Var.f11041e == 0) {
                                t7Var.e(r7Var);
                                return;
                            }
                            tt.h hVar = new tt.h();
                            r7Var.f10910c = hVar;
                            hVar.replace(t7Var.f11043g.scheduleDirect(r7Var, t7Var.f11041e, t7Var.f11042f));
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10962f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (compareAndSet(false, true)) {
            this.f10960c.d(this.f10961e);
            this.f10959b.onComplete();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!compareAndSet(false, true)) {
            mu.a.onError(th2);
        } else {
            this.f10960c.d(this.f10961e);
            this.f10959b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10959b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10962f, cVar)) {
            this.f10962f = cVar;
            this.f10959b.onSubscribe(this);
        }
    }
}
