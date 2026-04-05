package fx;

import mt.b0;
import mt.i0;
import retrofit2.Call;
import retrofit2.Response;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56302b;

    /* renamed from: c, reason: collision with root package name */
    public final Call f56303c;

    public /* synthetic */ d(Call call, int i10) {
        this.f56302b = i10;
        this.f56303c = call;
    }

    @Override // mt.b0
    public final void subscribeActual(i0 i0Var) {
        switch (this.f56302b) {
            case 0:
                Call callClone = this.f56303c.clone();
                c cVar = new c(callClone, i0Var);
                i0Var.onSubscribe(cVar);
                if (!cVar.isDisposed()) {
                    callClone.enqueue(cVar);
                    break;
                }
                break;
            default:
                Call callClone2 = this.f56303c.clone();
                e eVar = new e(callClone2);
                i0Var.onSubscribe(eVar);
                if (!eVar.isDisposed()) {
                    boolean z10 = false;
                    try {
                        Response responseExecute = callClone2.execute();
                        if (!eVar.isDisposed()) {
                            i0Var.onNext(responseExecute);
                        }
                        if (!eVar.isDisposed()) {
                            try {
                                i0Var.onComplete();
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                z10 = true;
                                qt.d.throwIfFatal(th);
                                if (z10) {
                                    mu.a.onError(th);
                                    return;
                                }
                                if (eVar.isDisposed()) {
                                    return;
                                }
                                try {
                                    i0Var.onError(th);
                                    return;
                                } catch (Throwable th3) {
                                    qt.d.throwIfFatal(th3);
                                    mu.a.onError(new qt.c(th, th3));
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                break;
        }
    }
}
