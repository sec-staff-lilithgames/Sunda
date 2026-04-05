package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s9 extends AtomicInteger implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f10968b;

    /* renamed from: c, reason: collision with root package name */
    public final st.d f10969c;

    /* renamed from: e, reason: collision with root package name */
    public final tt.a f10970e = new tt.a(2);

    /* renamed from: f, reason: collision with root package name */
    public final mt.g0 f10971f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.g0 f10972g;

    /* renamed from: h, reason: collision with root package name */
    public final t9[] f10973h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10974i;

    /* renamed from: j, reason: collision with root package name */
    public Object f10975j;

    /* renamed from: k, reason: collision with root package name */
    public Object f10976k;

    public s9(mt.q0 q0Var, int i10, mt.g0 g0Var, mt.g0 g0Var2, st.d dVar) {
        this.f10968b = q0Var;
        this.f10971f = g0Var;
        this.f10972g = g0Var2;
        this.f10969c = dVar;
        this.f10973h = new t9[]{new t9(this, 0, i10), new t9(this, 1, i10)};
    }

    public final void a() {
        Throwable th2;
        Throwable th3;
        if (getAndIncrement() != 0) {
            return;
        }
        t9[] t9VarArr = this.f10973h;
        t9 t9Var = t9VarArr[0];
        eu.d dVar = t9Var.f11047c;
        t9 t9Var2 = t9VarArr[1];
        eu.d dVar2 = t9Var2.f11047c;
        int iAddAndGet = 1;
        while (!this.f10974i) {
            boolean z10 = t9Var.f11049f;
            if (z10 && (th3 = t9Var.f11050g) != null) {
                this.f10974i = true;
                dVar.clear();
                dVar2.clear();
                this.f10968b.onError(th3);
                return;
            }
            boolean z11 = t9Var2.f11049f;
            if (z11 && (th2 = t9Var2.f11050g) != null) {
                this.f10974i = true;
                dVar.clear();
                dVar2.clear();
                this.f10968b.onError(th2);
                return;
            }
            if (this.f10975j == null) {
                this.f10975j = dVar.poll();
            }
            boolean z12 = this.f10975j == null;
            if (this.f10976k == null) {
                this.f10976k = dVar2.poll();
            }
            Object obj = this.f10976k;
            boolean z13 = obj == null;
            if (z10 && z11 && z12 && z13) {
                this.f10968b.onSuccess(Boolean.TRUE);
                return;
            }
            if (z10 && z11 && z12 != z13) {
                this.f10974i = true;
                dVar.clear();
                dVar2.clear();
                this.f10968b.onSuccess(Boolean.FALSE);
                return;
            }
            if (!z12 && !z13) {
                try {
                    if (!((ut.n0) this.f10969c).test(this.f10975j, obj)) {
                        this.f10974i = true;
                        dVar.clear();
                        dVar2.clear();
                        this.f10968b.onSuccess(Boolean.FALSE);
                        return;
                    }
                    this.f10975j = null;
                    this.f10976k = null;
                } catch (Throwable th4) {
                    qt.d.throwIfFatal(th4);
                    this.f10974i = true;
                    dVar.clear();
                    dVar2.clear();
                    this.f10968b.onError(th4);
                    return;
                }
            }
            if (z12 || z13) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        dVar.clear();
        dVar2.clear();
    }

    @Override // pt.c
    public void dispose() {
        if (this.f10974i) {
            return;
        }
        this.f10974i = true;
        this.f10970e.dispose();
        if (getAndIncrement() == 0) {
            t9[] t9VarArr = this.f10973h;
            t9VarArr[0].f11047c.clear();
            t9VarArr[1].f11047c.clear();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10974i;
    }
}
