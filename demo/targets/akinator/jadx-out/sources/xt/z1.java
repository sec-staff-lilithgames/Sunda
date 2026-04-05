package xt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z1 implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f93546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f93547c;

    public z1(a2 a2Var, mt.q0 q0Var) {
        this.f93547c = a2Var;
        this.f93546b = q0Var;
    }

    @Override // mt.f
    public void onComplete() {
        Object objCall;
        a2 a2Var = this.f93547c;
        Callable callable = a2Var.f93372c;
        mt.q0 q0Var = this.f93546b;
        if (callable != null) {
            try {
                objCall = callable.call();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                q0Var.onError(th2);
                return;
            }
        } else {
            objCall = a2Var.f93373e;
        }
        if (objCall == null) {
            q0Var.onError(new NullPointerException("The value supplied is null"));
        } else {
            q0Var.onSuccess(objCall);
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93546b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93546b.onSubscribe(cVar);
    }
}
