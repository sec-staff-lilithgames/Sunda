package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h6 extends AtomicReference implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final i6 f10381b;

    public h6(i6 i6Var) {
        this.f10381b = i6Var;
    }

    @Override // mt.f
    public void onComplete() {
        i6 i6Var = this.f10381b;
        i6Var.f10419h = true;
        if (i6Var.f10418g) {
            iu.n.onComplete(i6Var.f10414b, i6Var, i6Var.f10417f);
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        i6 i6Var = this.f10381b;
        tt.d.dispose(i6Var.f10415c);
        iu.n.onError(i6Var.f10414b, th2, i6Var, i6Var.f10417f);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
