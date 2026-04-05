package zt;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x4 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final Iterable f98830b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98831c;

    public x4(Iterable<? extends mt.y> iterable, st.o oVar) {
        this.f98830b = iterable;
        this.f98831c = oVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        mt.y[] yVarArr = new mt.y[8];
        try {
            int i10 = 0;
            for (mt.y yVar : this.f98830b) {
                if (yVar == null) {
                    tt.e.error(new NullPointerException("One of the sources is null"), vVar);
                    return;
                }
                if (i10 == yVarArr.length) {
                    yVarArr = (mt.y[]) Arrays.copyOf(yVarArr, (i10 >> 2) + i10);
                }
                int i11 = i10 + 1;
                yVarArr[i10] = yVar;
                i10 = i11;
            }
            if (i10 == 0) {
                tt.e.complete(vVar);
                return;
            }
            if (i10 == 1) {
                yVarArr[0].subscribe(new n2(vVar, new w4(this)));
                return;
            }
            t4 t4Var = new t4(vVar, i10, this.f98831c);
            vVar.onSubscribe(t4Var);
            for (int i12 = 0; i12 < i10 && !t4Var.isDisposed(); i12++) {
                yVarArr[i12].subscribe(t4Var.f98782e[i12]);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, vVar);
        }
    }
}
