package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e1 extends AtomicReference implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f52716b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52717c;

    public e1(mt.v vVar, st.o oVar) {
        this.f52716b = vVar;
        this.f52717c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52716b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f52716b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        try {
            mt.y yVar = (mt.y) ut.o0.requireNonNull(this.f52717c.apply(obj), "The mapper returned a null MaybeSource");
            if (isDisposed()) {
                return;
            }
            yVar.subscribe(new d1(this, this.f52716b));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            onError(th2);
        }
    }
}
