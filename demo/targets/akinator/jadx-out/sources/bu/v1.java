package bu;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v1 extends ku.j {

    /* renamed from: c, reason: collision with root package name */
    public final w1 f11110c;

    /* renamed from: e, reason: collision with root package name */
    public final long f11111e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11112f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11113g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f11114h = new AtomicBoolean();

    public v1(w1 w1Var, long j10, Object obj) {
        this.f11110c = w1Var;
        this.f11111e = j10;
        this.f11112f = obj;
    }

    public final void a() {
        if (this.f11114h.compareAndSet(false, true)) {
            w1 w1Var = this.f11110c;
            long j10 = this.f11111e;
            Object obj = this.f11112f;
            if (j10 == w1Var.f11151g) {
                w1Var.f11147b.onNext(obj);
            }
        }
    }

    @Override // ku.j, mt.i0, mt.f
    public void onComplete() {
        if (this.f11113g) {
            return;
        }
        this.f11113g = true;
        a();
    }

    @Override // ku.j, mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11113g) {
            mu.a.onError(th2);
        } else {
            this.f11113g = true;
            this.f11110c.onError(th2);
        }
    }

    @Override // ku.j, mt.i0
    public void onNext(Object obj) {
        if (this.f11113g) {
            return;
        }
        this.f11113g = true;
        dispose();
        a();
    }
}
