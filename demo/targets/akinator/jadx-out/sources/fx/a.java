package fx;

import mt.i0;
import retrofit2.Response;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f56294b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f56295c;

    public a(i0 i0Var) {
        this.f56294b = i0Var;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f56295c) {
            return;
        }
        this.f56294b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!this.f56295c) {
            this.f56294b.onError(th2);
            return;
        }
        AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError.initCause(th2);
        mu.a.onError(assertionError);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f56294b.onSubscribe(cVar);
    }

    @Override // mt.i0
    public void onNext(Response<Object> response) {
        boolean zIsSuccessful = response.isSuccessful();
        i0 i0Var = this.f56294b;
        if (zIsSuccessful) {
            i0Var.onNext(response.body());
            return;
        }
        this.f56295c = true;
        f fVar = new f(response);
        try {
            i0Var.onError(fVar);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(new qt.c(fVar, th2));
        }
    }
}
