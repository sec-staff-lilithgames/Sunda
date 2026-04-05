package zt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p0 extends AtomicInteger implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f98721b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f98722c;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f98723e;

    /* renamed from: f, reason: collision with root package name */
    public final st.d f98724f;

    public p0(mt.q0 q0Var, st.d dVar) {
        super(2);
        this.f98721b = q0Var;
        this.f98724f = dVar;
        this.f98722c = new q0(this);
        this.f98723e = new q0(this);
    }

    public final void a() {
        if (decrementAndGet() == 0) {
            Object obj = this.f98722c.f98733c;
            Object obj2 = this.f98723e.f98733c;
            mt.q0 q0Var = this.f98721b;
            if (obj == null || obj2 == null) {
                q0Var.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                return;
            }
            try {
                q0Var.onSuccess(Boolean.valueOf(((ut.n0) this.f98724f).test(obj, obj2)));
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                q0Var.onError(th2);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f98722c.dispose();
        this.f98723e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f98722c.get());
    }
}
