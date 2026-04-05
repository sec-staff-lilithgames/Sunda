package bu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y3 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11241b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f11242c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f11243e;

    public y3(mt.i0 i0Var, st.o oVar) {
        this.f11241b = i0Var;
        this.f11242c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f11243e.dispose();
        this.f11243e = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11243e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        pt.c cVar = this.f11243e;
        tt.d dVar = tt.d.f87352b;
        if (cVar == dVar) {
            return;
        }
        this.f11243e = dVar;
        this.f11241b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        pt.c cVar = this.f11243e;
        tt.d dVar = tt.d.f87352b;
        if (cVar == dVar) {
            mu.a.onError(th2);
        } else {
            this.f11243e = dVar;
            this.f11241b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11243e == tt.d.f87352b) {
            return;
        }
        try {
            Iterator it = ((Iterable) this.f11242c.apply(obj)).iterator();
            while (it.hasNext()) {
                try {
                    try {
                        this.f11241b.onNext(ut.o0.requireNonNull(it.next(), "The iterator returned a null value"));
                    } catch (Throwable th2) {
                        qt.d.throwIfFatal(th2);
                        this.f11243e.dispose();
                        onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    this.f11243e.dispose();
                    onError(th3);
                    return;
                }
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            this.f11243e.dispose();
            onError(th4);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11243e, cVar)) {
            this.f11243e = cVar;
            this.f11241b.onSubscribe(this);
        }
    }
}
