package xt;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m extends AtomicInteger implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93458b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f93459c;

    /* renamed from: e, reason: collision with root package name */
    public final tt.h f93460e = new tt.h();

    public m(mt.f fVar, Iterator it) {
        this.f93458b = fVar;
        this.f93459c = it;
    }

    public final void a() {
        mt.f fVar = this.f93458b;
        tt.h hVar = this.f93460e;
        if (!hVar.isDisposed() && getAndIncrement() == 0) {
            Iterator it = this.f93459c;
            while (!hVar.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        fVar.onComplete();
                        return;
                    }
                    try {
                        ((mt.i) ut.o0.requireNonNull(it.next(), "The CompletableSource returned is null")).subscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } catch (Throwable th2) {
                        qt.d.throwIfFatal(th2);
                        fVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    fVar.onError(th3);
                    return;
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
        this.f93458b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93460e.replace(cVar);
    }
}
