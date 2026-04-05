package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends g {

    /* renamed from: f, reason: collision with root package name */
    public final vt.a f50996f;

    public h(vt.a aVar, st.q qVar) {
        super(qVar);
        this.f50996f = aVar;
    }

    @Override // cu.g, vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f50992e) {
            return;
        }
        this.f50992e = true;
        this.f50996f.onComplete();
    }

    @Override // cu.g, vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f50992e) {
            mu.a.onError(th2);
        } else {
            this.f50992e = true;
            this.f50996f.onError(th2);
        }
    }

    @Override // cu.g, vt.a, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f50991c, dVar)) {
            this.f50991c = dVar;
            this.f50996f.onSubscribe(this);
        }
    }

    @Override // cu.g, vt.a
    public boolean tryOnNext(Object obj) {
        if (!this.f50992e) {
            try {
                if (this.f50990b.test(obj)) {
                    return this.f50996f.tryOnNext(obj);
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
