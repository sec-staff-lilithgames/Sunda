package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends g {

    /* renamed from: f, reason: collision with root package name */
    public final tw.c f51000f;

    public i(tw.c cVar, st.q qVar) {
        super(qVar);
        this.f51000f = cVar;
    }

    @Override // cu.g, vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f50992e) {
            return;
        }
        this.f50992e = true;
        this.f51000f.onComplete();
    }

    @Override // cu.g, vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f50992e) {
            mu.a.onError(th2);
        } else {
            this.f50992e = true;
            this.f51000f.onError(th2);
        }
    }

    @Override // cu.g, vt.a, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f50991c, dVar)) {
            this.f50991c = dVar;
            this.f51000f.onSubscribe(this);
        }
    }

    @Override // cu.g, vt.a
    public boolean tryOnNext(Object obj) {
        if (!this.f50992e) {
            try {
                if (this.f50990b.test(obj)) {
                    this.f51000f.onNext(obj);
                    return true;
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }
        return false;
    }
}
