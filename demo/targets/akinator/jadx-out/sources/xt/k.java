package xt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k extends AtomicInteger implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93446b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.i[] f93447c;

    /* renamed from: e, reason: collision with root package name */
    public int f93448e;

    /* renamed from: f, reason: collision with root package name */
    public final tt.h f93449f = new tt.h();

    public k(mt.f fVar, mt.i[] iVarArr) {
        this.f93446b = fVar;
        this.f93447c = iVarArr;
    }

    public final void a() {
        tt.h hVar = this.f93449f;
        if (!hVar.isDisposed() && getAndIncrement() == 0) {
            while (!hVar.isDisposed()) {
                int i10 = this.f93448e;
                this.f93448e = i10 + 1;
                mt.i[] iVarArr = this.f93447c;
                if (i10 == iVarArr.length) {
                    this.f93446b.onComplete();
                    return;
                } else {
                    iVarArr[i10].subscribe(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // mt.f
    public void onComplete() {
        a();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93446b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93449f.replace(cVar);
    }
}
