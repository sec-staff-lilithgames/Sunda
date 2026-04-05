package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f51101b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f51102c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f51103e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51104f;

    public z(tw.c cVar, st.o oVar) {
        this.f51101b = cVar;
        this.f51102c = oVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f51103e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f51104f) {
            return;
        }
        this.f51104f = true;
        this.f51101b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f51104f) {
            mu.a.onError(th2);
        } else {
            this.f51104f = true;
            this.f51101b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f51104f) {
            return;
        }
        try {
            this.f51101b.onNext(ut.o0.requireNonNull(this.f51102c.apply(obj), "The mapper returned a null value"));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f51103e, dVar)) {
            this.f51103e = dVar;
            this.f51101b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f51103e.request(j10);
    }
}
