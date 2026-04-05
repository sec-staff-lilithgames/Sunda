package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a3 extends AtomicReference implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final z2 f52669b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52670c;

    public a3(z2 z2Var, int i10) {
        this.f52669b = z2Var;
        this.f52670c = i10;
    }

    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52669b.a(th2, this.f52670c);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        z2 z2Var = this.f52669b;
        mt.q0 q0Var = z2Var.f52898b;
        Object[] objArr = z2Var.f52901f;
        objArr[this.f52670c] = obj;
        if (z2Var.decrementAndGet() == 0) {
            try {
                q0Var.onSuccess(ut.o0.requireNonNull(z2Var.f52899c.apply(objArr), "The zipper returned a null value"));
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                q0Var.onError(th2);
            }
        }
    }
}
