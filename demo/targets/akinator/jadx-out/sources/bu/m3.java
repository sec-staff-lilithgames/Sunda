package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m3 extends AtomicReference implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n3 f10639b;

    public m3(n3 n3Var) {
        this.f10639b = n3Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.f
    public void onComplete() {
        n3 n3Var = this.f10639b;
        n3Var.f10683g.delete(this);
        n3Var.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        n3 n3Var = this.f10639b;
        n3Var.f10683g.delete(this);
        n3Var.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
