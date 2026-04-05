package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f7 extends gu.o {
    @Override // gu.o
    public final void b(Object obj) {
        mt.a0 a0Var = (mt.a0) obj;
        if (a0Var.isOnError()) {
            mu.a.onError(a0Var.getError());
        }
    }

    @Override // gu.o, mt.q, tw.c, mt.f
    public void onComplete() {
        a(mt.a0.createOnComplete());
    }

    @Override // gu.o, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        a(mt.a0.createOnError(th2));
    }

    @Override // gu.o, mt.q, tw.c
    public void onNext(Object obj) {
        this.f58462f++;
        this.f58459b.onNext(mt.a0.createOnNext(obj));
    }
}
