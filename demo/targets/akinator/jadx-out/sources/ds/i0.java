package ds;

import wr.e4;
import wr.k5;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i0 extends k5.a {

    /* renamed from: a, reason: collision with root package name */
    public final k5 f52613a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f52614b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52615c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f52616d;

    /* renamed from: e, reason: collision with root package name */
    public Object f52617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f52618f;

    public i0(j0 j0Var, b0 b0Var, k5 k5Var) {
        this.f52618f = j0Var;
        this.f52613a = k5Var;
        this.f52614b = b0Var;
    }

    @Override // wr.k5.a
    public void onCancel() {
        b0 b0Var = this.f52614b;
        Runnable runnable = b0Var.f52595h;
        if (runnable != null) {
            runnable.run();
        } else {
            b0Var.f52590c = true;
        }
    }

    @Override // wr.k5.a
    public void onComplete() {
        Runnable runnable = this.f52614b.f52598k;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // wr.k5.a
    public void onHalfClose() {
        if (this.f52615c) {
            Object obj = this.f52617e;
            if (obj == null) {
                this.f52613a.close(m6.f91046n.withDescription("Half-closed without a request"), new e4());
                return;
            }
            rk.w wVar = (rk.w) this.f52618f.f52627a;
            b0 b0Var = this.f52614b;
            wVar.invoke(obj, b0Var);
            this.f52617e = null;
            b0Var.f52591d = true;
            if (this.f52616d) {
                onReady();
            }
        }
    }

    @Override // wr.k5.a
    public void onMessage(Object obj) {
        if (this.f52617e == null) {
            this.f52617e = obj;
            return;
        }
        this.f52613a.close(m6.f91046n.withDescription("Too many requests"), new e4());
        this.f52615c = false;
    }

    @Override // wr.k5.a
    public void onReady() {
        this.f52616d = true;
        Runnable runnable = this.f52614b.f52594g;
        if (runnable != null) {
            runnable.run();
        }
    }
}
