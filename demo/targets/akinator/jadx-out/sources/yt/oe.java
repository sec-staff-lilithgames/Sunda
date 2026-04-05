package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class oe extends qu.b {

    /* renamed from: c, reason: collision with root package name */
    public final pe f96085c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f96086e;

    public oe(pe peVar) {
        this.f96085c = peVar;
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96086e) {
            return;
        }
        this.f96086e = true;
        pe peVar = this.f96085c;
        peVar.f96147l.cancel();
        peVar.f96148m = true;
        peVar.b();
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96086e) {
            mu.a.onError(th2);
            return;
        }
        this.f96086e = true;
        pe peVar = this.f96085c;
        peVar.f96147l.cancel();
        if (!peVar.f96143h.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            peVar.f96148m = true;
            peVar.b();
        }
    }

    @Override // qu.b, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96086e) {
            return;
        }
        this.f96086e = true;
        dispose();
        pe peVar = this.f96085c;
        AtomicReference atomicReference = peVar.f96140e;
        while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
        }
        peVar.f96142g.offer(pe.f96137q);
        peVar.b();
    }
}
