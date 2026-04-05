package fx;

import mt.i0;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements pt.c, Callback {

    /* renamed from: b, reason: collision with root package name */
    public final Call f56298b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f56299c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f56300e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f56301f = false;

    public c(Call call, i0 i0Var) {
        this.f56298b = call;
        this.f56299c = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f56300e = true;
        this.f56298b.cancel();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f56300e;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call<Object> call, Throwable th2) {
        if (call.isCanceled()) {
            return;
        }
        try {
            this.f56299c.onError(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            mu.a.onError(new qt.c(th2, th3));
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call<Object> call, Response<Object> response) {
        if (this.f56300e) {
            return;
        }
        try {
            this.f56299c.onNext(response);
            if (this.f56300e) {
                return;
            }
            this.f56301f = true;
            this.f56299c.onComplete();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            if (this.f56301f) {
                mu.a.onError(th2);
                return;
            }
            if (this.f56300e) {
                return;
            }
            try {
                this.f56299c.onError(th2);
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                mu.a.onError(new qt.c(th2, th3));
            }
        }
    }
}
