package du;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0[] f52671b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterable f52672c;

    public b(mt.t0[] t0VarArr, Iterable<? extends mt.t0> iterable) {
        this.f52671b = t0VarArr;
        this.f52672c = iterable;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        int length;
        mt.t0[] t0VarArr = this.f52671b;
        if (t0VarArr == null) {
            t0VarArr = new mt.t0[8];
            try {
                length = 0;
                for (mt.t0 t0Var : this.f52672c) {
                    if (t0Var == null) {
                        tt.e.error(new NullPointerException("One of the sources is null"), q0Var);
                        return;
                    }
                    if (length == t0VarArr.length) {
                        mt.t0[] t0VarArr2 = new mt.t0[(length >> 2) + length];
                        System.arraycopy(t0VarArr, 0, t0VarArr2, 0, length);
                        t0VarArr = t0VarArr2;
                    }
                    int i10 = length + 1;
                    t0VarArr[length] = t0Var;
                    length = i10;
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                tt.e.error(th2, q0Var);
                return;
            }
        } else {
            length = t0VarArr.length;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        pt.b bVar = new pt.b();
        q0Var.onSubscribe(bVar);
        for (int i11 = 0; i11 < length; i11++) {
            mt.t0 t0Var2 = t0VarArr[i11];
            if (bVar.isDisposed()) {
                return;
            }
            if (t0Var2 == null) {
                bVar.dispose();
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    q0Var.onError(nullPointerException);
                    return;
                } else {
                    mu.a.onError(nullPointerException);
                    return;
                }
            }
            t0Var2.subscribe(new a(q0Var, bVar, atomicBoolean));
        }
    }
}
