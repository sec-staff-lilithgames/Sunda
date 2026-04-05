package cu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0 extends hu.c {

    /* renamed from: e, reason: collision with root package name */
    public final i0[] f51007e;

    /* renamed from: f, reason: collision with root package name */
    public final st.c f51008f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f51009g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f51010h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f51011i;

    public j0(tw.c cVar, int i10, st.c cVar2) {
        super(cVar);
        this.f51009g = new AtomicReference();
        this.f51010h = new AtomicInteger();
        this.f51011i = new AtomicReference();
        i0[] i0VarArr = new i0[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            i0VarArr[i11] = new i0(this, cVar2);
        }
        this.f51007e = i0VarArr;
        this.f51008f = cVar2;
        this.f51010h.lazySet(i10);
    }

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        for (i0 i0Var : this.f51007e) {
            i0Var.getClass();
            hu.g.cancel(i0Var);
        }
    }

    public final void innerError(Throwable th2) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f51011i;
            if (atomicReference.compareAndSet(null, th2)) {
                cancel();
                this.f59162b.onError(th2);
                return;
            }
        } while (atomicReference.get() == null);
        if (th2 != atomicReference.get()) {
            mu.a.onError(th2);
        }
    }
}
