package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class vc extends ku.j {

    /* renamed from: c, reason: collision with root package name */
    public final wc f11136c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11137e;

    public vc(wc wcVar) {
        this.f11136c = wcVar;
    }

    @Override // ku.j, mt.i0, mt.f
    public void onComplete() {
        if (this.f11137e) {
            return;
        }
        this.f11137e = true;
        wc wcVar = this.f11136c;
        wcVar.f11193k.dispose();
        wcVar.f11194l = true;
        wcVar.b();
    }

    @Override // ku.j, mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11137e) {
            mu.a.onError(th2);
            return;
        }
        this.f11137e = true;
        wc wcVar = this.f11136c;
        wcVar.f11193k.dispose();
        if (!wcVar.f11190h.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            wcVar.f11194l = true;
            wcVar.b();
        }
    }

    @Override // ku.j, mt.i0
    public void onNext(Object obj) {
        if (this.f11137e) {
            return;
        }
        this.f11137e = true;
        dispose();
        wc wcVar = this.f11136c;
        AtomicReference atomicReference = wcVar.f11187e;
        while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
        }
        wcVar.f11189g.offer(wc.f11184o);
        wcVar.b();
    }
}
