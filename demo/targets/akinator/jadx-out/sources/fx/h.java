package fx;

import mt.i0;
import retrofit2.Response;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f56308b;

    public h(i0 i0Var) {
        this.f56308b = i0Var;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f56308b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        i0 i0Var = this.f56308b;
        try {
            i0Var.onNext(g.error(th2));
            i0Var.onComplete();
        } catch (Throwable th3) {
            try {
                i0Var.onError(th3);
            } catch (Throwable th4) {
                qt.d.throwIfFatal(th4);
                mu.a.onError(new qt.c(th3, th4));
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f56308b.onSubscribe(cVar);
    }

    @Override // mt.i0
    public void onNext(Response<Object> response) {
        this.f56308b.onNext(g.response(response));
    }
}
