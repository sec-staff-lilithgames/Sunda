package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x0 extends AtomicReference implements mt.q0, mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f52874b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52875c;

    public x0(mt.f fVar, st.o oVar) {
        this.f52874b = fVar;
        this.f52875c = oVar;
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
        this.f52874b.onComplete();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52874b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        try {
            mt.i iVar = (mt.i) ut.o0.requireNonNull(this.f52875c.apply(obj), "The mapper returned a null CompletableSource");
            if (isDisposed()) {
                return;
            }
            iVar.subscribe(this);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            onError(th2);
        }
    }
}
