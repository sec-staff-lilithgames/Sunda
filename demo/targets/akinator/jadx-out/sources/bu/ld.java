package bu;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ld extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0[] f10623c;

    /* renamed from: e, reason: collision with root package name */
    public final Iterable f10624e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f10625f;

    public ld(mt.g0 g0Var, mt.g0[] g0VarArr, st.o oVar) {
        super(g0Var);
        this.f10623c = g0VarArr;
        this.f10624e = null;
        this.f10625f = oVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        int length;
        mt.g0[] g0VarArr = this.f10623c;
        if (g0VarArr == null) {
            g0VarArr = new mt.g0[8];
            try {
                length = 0;
                for (mt.g0 g0Var : this.f10624e) {
                    if (length == g0VarArr.length) {
                        g0VarArr = (mt.g0[]) Arrays.copyOf(g0VarArr, (length >> 1) + length);
                    }
                    int i10 = length + 1;
                    g0VarArr[length] = g0Var;
                    length = i10;
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                tt.e.error(th2, i0Var);
                return;
            }
        } else {
            length = g0VarArr.length;
        }
        if (length == 0) {
            new c6(this.f10053b, new id(this)).subscribeActual(i0Var);
            return;
        }
        jd jdVar = new jd(i0Var, this.f10625f, length);
        i0Var.onSubscribe(jdVar);
        kd[] kdVarArr = jdVar.f10483e;
        AtomicReference atomicReference = jdVar.f10485g;
        for (int i11 = 0; i11 < length && !tt.d.isDisposed((pt.c) atomicReference.get()) && !jdVar.f10487i; i11++) {
            g0VarArr[i11].subscribe(kdVarArr[i11]);
        }
        this.f10053b.subscribe(jdVar);
    }

    public ld(mt.g0 g0Var, Iterable<? extends mt.g0> iterable, st.o oVar) {
        super(g0Var);
        this.f10623c = null;
        this.f10624e = iterable;
        this.f10625f = oVar;
    }
}
