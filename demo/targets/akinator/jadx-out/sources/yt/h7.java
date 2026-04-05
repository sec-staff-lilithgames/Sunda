package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h7 extends AtomicReference implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final i7 f95592b;

    public h7(i7 i7Var) {
        this.f95592b = i7Var;
    }

    @Override // mt.f
    public void onComplete() {
        i7 i7Var = this.f95592b;
        i7Var.f95676i = true;
        if (i7Var.f95675h) {
            iu.n.onComplete(i7Var.f95670b, i7Var, i7Var.f95673f);
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        i7 i7Var = this.f95592b;
        hu.g.cancel(i7Var.f95671c);
        iu.n.onError(i7Var.f95670b, th2, i7Var, i7Var.f95673f);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
