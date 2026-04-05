package ds;

import wr.k5;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e0 extends k5.a {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f52601a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f52602b;

    /* renamed from: c, reason: collision with root package name */
    public final k5 f52603c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f52604d = false;

    public e0(l0 l0Var, b0 b0Var, k5 k5Var) {
        this.f52601a = l0Var;
        this.f52602b = b0Var;
        this.f52603c = k5Var;
    }

    @Override // wr.k5.a
    public void onCancel() {
        b0 b0Var = this.f52602b;
        Runnable runnable = b0Var.f52595h;
        if (runnable != null) {
            runnable.run();
        } else {
            b0Var.f52590c = true;
        }
        if (this.f52604d) {
            return;
        }
        this.f52601a.onError(m6.f91038f.withDescription("client cancelled").asRuntimeException());
    }

    @Override // wr.k5.a
    public void onComplete() {
        Runnable runnable = this.f52602b.f52598k;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // wr.k5.a
    public void onHalfClose() {
        this.f52604d = true;
        this.f52601a.onCompleted();
    }

    @Override // wr.k5.a
    public void onMessage(Object obj) {
        this.f52601a.onNext(obj);
        if (this.f52602b.f52592e) {
            this.f52603c.request(1);
        }
    }

    @Override // wr.k5.a
    public void onReady() {
        Runnable runnable = this.f52602b.f52594g;
        if (runnable != null) {
            runnable.run();
        }
    }
}
