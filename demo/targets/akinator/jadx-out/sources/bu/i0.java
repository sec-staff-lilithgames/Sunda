package bu;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0 extends ku.j {

    /* renamed from: c, reason: collision with root package name */
    public final j0 f10403c;

    public i0(j0 j0Var) {
        this.f10403c = j0Var;
    }

    @Override // ku.j, mt.i0, mt.f
    public void onComplete() {
        this.f10403c.onComplete();
    }

    @Override // ku.j, mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10403c.onError(th2);
    }

    @Override // ku.j, mt.i0
    public void onNext(Object obj) {
        j0 j0Var = this.f10403c;
        j0Var.getClass();
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(j0Var.f10442j.call(), "The buffer supplied is null");
            synchronized (j0Var) {
                try {
                    Object obj2 = j0Var.f10446n;
                    if (obj2 == null) {
                        return;
                    }
                    j0Var.f10446n = collection;
                    j0Var.S(obj2, j0Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            j0Var.dispose();
            j0Var.f91285e.onError(th3);
        }
    }
}
