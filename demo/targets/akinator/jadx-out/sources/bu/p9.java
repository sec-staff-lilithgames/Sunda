package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p9 extends AtomicInteger implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10799b;

    /* renamed from: c, reason: collision with root package name */
    public final st.d f10800c;

    /* renamed from: e, reason: collision with root package name */
    public final tt.a f10801e = new tt.a(2);

    /* renamed from: f, reason: collision with root package name */
    public final mt.g0 f10802f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.g0 f10803g;

    /* renamed from: h, reason: collision with root package name */
    public final q9[] f10804h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10805i;

    /* renamed from: j, reason: collision with root package name */
    public Object f10806j;

    /* renamed from: k, reason: collision with root package name */
    public Object f10807k;

    public p9(mt.i0 i0Var, int i10, mt.g0 g0Var, mt.g0 g0Var2, st.d dVar) {
        this.f10799b = i0Var;
        this.f10802f = g0Var;
        this.f10803g = g0Var2;
        this.f10800c = dVar;
        this.f10804h = new q9[]{new q9(this, 0, i10), new q9(this, 1, i10)};
    }

    public final void a() {
        Throwable th2;
        Throwable th3;
        if (getAndIncrement() != 0) {
            return;
        }
        q9[] q9VarArr = this.f10804h;
        q9 q9Var = q9VarArr[0];
        eu.d dVar = q9Var.f10860c;
        q9 q9Var2 = q9VarArr[1];
        eu.d dVar2 = q9Var2.f10860c;
        int iAddAndGet = 1;
        while (!this.f10805i) {
            boolean z10 = q9Var.f10862f;
            if (z10 && (th3 = q9Var.f10863g) != null) {
                this.f10805i = true;
                dVar.clear();
                dVar2.clear();
                this.f10799b.onError(th3);
                return;
            }
            boolean z11 = q9Var2.f10862f;
            if (z11 && (th2 = q9Var2.f10863g) != null) {
                this.f10805i = true;
                dVar.clear();
                dVar2.clear();
                this.f10799b.onError(th2);
                return;
            }
            if (this.f10806j == null) {
                this.f10806j = dVar.poll();
            }
            boolean z12 = this.f10806j == null;
            if (this.f10807k == null) {
                this.f10807k = dVar2.poll();
            }
            Object obj = this.f10807k;
            boolean z13 = obj == null;
            if (z10 && z11 && z12 && z13) {
                this.f10799b.onNext(Boolean.TRUE);
                this.f10799b.onComplete();
                return;
            }
            if (z10 && z11 && z12 != z13) {
                this.f10805i = true;
                dVar.clear();
                dVar2.clear();
                this.f10799b.onNext(Boolean.FALSE);
                this.f10799b.onComplete();
                return;
            }
            if (!z12 && !z13) {
                try {
                    if (!((ut.n0) this.f10800c).test(this.f10806j, obj)) {
                        this.f10805i = true;
                        dVar.clear();
                        dVar2.clear();
                        this.f10799b.onNext(Boolean.FALSE);
                        this.f10799b.onComplete();
                        return;
                    }
                    this.f10806j = null;
                    this.f10807k = null;
                } catch (Throwable th4) {
                    qt.d.throwIfFatal(th4);
                    this.f10805i = true;
                    dVar.clear();
                    dVar2.clear();
                    this.f10799b.onError(th4);
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
        if (this.f10805i) {
            return;
        }
        this.f10805i = true;
        this.f10801e.dispose();
        if (getAndIncrement() == 0) {
            q9[] q9VarArr = this.f10804h;
            q9VarArr[0].f10860c.clear();
            q9VarArr[1].f10860c.clear();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10805i;
    }
}
