package bu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f4 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final Iterable f10302b;

    public f4(Iterable<Object> iterable) {
        this.f10302b = iterable;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        try {
            Iterator it = this.f10302b.iterator();
            try {
                if (!it.hasNext()) {
                    tt.e.complete(i0Var);
                    return;
                }
                e4 e4Var = new e4(i0Var, it);
                i0Var.onSubscribe(e4Var);
                if (e4Var.f10254f) {
                    return;
                }
                Iterator it2 = e4Var.f10252c;
                mt.i0 i0Var2 = e4Var.f10251b;
                while (!e4Var.isDisposed()) {
                    try {
                        i0Var2.onNext(ut.o0.requireNonNull(it2.next(), "The iterator returned a null value"));
                        if (e4Var.isDisposed()) {
                            return;
                        }
                        try {
                            if (!it2.hasNext()) {
                                if (e4Var.isDisposed()) {
                                    return;
                                }
                                i0Var2.onComplete();
                                return;
                            }
                        } catch (Throwable th2) {
                            qt.d.throwIfFatal(th2);
                            i0Var2.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        qt.d.throwIfFatal(th3);
                        i0Var2.onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                qt.d.throwIfFatal(th4);
                tt.e.error(th4, i0Var);
            }
        } catch (Throwable th5) {
            qt.d.throwIfFatal(th5);
            tt.e.error(th5, i0Var);
        }
    }
}
