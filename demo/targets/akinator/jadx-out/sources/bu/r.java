package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0[] f10879b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterable f10880c;

    public r(mt.g0[] g0VarArr, Iterable<? extends mt.g0> iterable) {
        this.f10879b = g0VarArr;
        this.f10880c = iterable;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        int length;
        mt.g0[] g0VarArr = this.f10879b;
        if (g0VarArr == null) {
            g0VarArr = new mt.g0[8];
            try {
                length = 0;
                for (mt.g0 g0Var : this.f10880c) {
                    if (g0Var == null) {
                        tt.e.error(new NullPointerException("One of the sources is null"), i0Var);
                        return;
                    }
                    if (length == g0VarArr.length) {
                        mt.g0[] g0VarArr2 = new mt.g0[(length >> 2) + length];
                        System.arraycopy(g0VarArr, 0, g0VarArr2, 0, length);
                        g0VarArr = g0VarArr2;
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
            tt.e.complete(i0Var);
        } else if (length == 1) {
            g0VarArr[0].subscribe(i0Var);
        } else {
            new p(i0Var, length).subscribe(g0VarArr);
        }
    }
}
