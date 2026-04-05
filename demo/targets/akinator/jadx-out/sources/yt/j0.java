package yt;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0 extends qu.b {

    /* renamed from: c, reason: collision with root package name */
    public final k0 f95711c;

    public j0(k0 k0Var) {
        this.f95711c = k0Var;
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95711c.onComplete();
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95711c.onError(th2);
    }

    @Override // qu.b, mt.q, tw.c
    public void onNext(Object obj) {
        k0 k0Var = this.f95711c;
        k0Var.getClass();
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(k0Var.f95770k.call(), "The buffer supplied is null");
            synchronized (k0Var) {
                try {
                    Object obj2 = k0Var.f95774o;
                    if (obj2 == null) {
                        return;
                    }
                    k0Var.f95774o = collection;
                    k0Var.S(obj2, k0Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            k0Var.cancel();
            k0Var.f58454f.onError(th3);
        }
    }
}
