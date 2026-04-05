package du;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d3 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final Iterable f52710b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52711c;

    public d3(Iterable<? extends mt.t0> iterable, st.o oVar) {
        this.f52710b = iterable;
        this.f52711c = oVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        mt.t0[] t0VarArr = new mt.t0[8];
        try {
            int i10 = 0;
            for (mt.t0 t0Var : this.f52710b) {
                if (t0Var == null) {
                    tt.e.error(new NullPointerException("One of the sources is null"), q0Var);
                    return;
                }
                if (i10 == t0VarArr.length) {
                    t0VarArr = (mt.t0[]) Arrays.copyOf(t0VarArr, (i10 >> 2) + i10);
                }
                int i11 = i10 + 1;
                t0VarArr[i10] = t0Var;
                i10 = i11;
            }
            if (i10 == 0) {
                tt.e.error(new NoSuchElementException(), q0Var);
                return;
            }
            if (i10 == 1) {
                t0VarArr[0].subscribe(new w1(q0Var, new c3(this)));
                return;
            }
            z2 z2Var = new z2(q0Var, i10, this.f52711c);
            q0Var.onSubscribe(z2Var);
            for (int i12 = 0; i12 < i10 && !z2Var.isDisposed(); i12++) {
                t0VarArr[i12].subscribe(z2Var.f52900e[i12]);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, q0Var);
        }
    }
}
