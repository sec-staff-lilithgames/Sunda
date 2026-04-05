package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i1 extends AtomicReference implements mt.i0, mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10404b;

    /* renamed from: c, reason: collision with root package name */
    public mt.i f10405c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10406e;

    public i1(mt.i0 i0Var, mt.i iVar) {
        this.f10404b = i0Var;
        this.f10405c = iVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10406e) {
            this.f10404b.onComplete();
            return;
        }
        this.f10406e = true;
        tt.d.replace(this, null);
        mt.i iVar = this.f10405c;
        this.f10405c = null;
        iVar.subscribe(this);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10404b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10404b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (!tt.d.setOnce(this, cVar) || this.f10406e) {
            return;
        }
        this.f10404b.onSubscribe(this);
    }
}
