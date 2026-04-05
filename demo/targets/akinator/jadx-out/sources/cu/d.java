package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements vt.a, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final vt.a f50961b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f50962c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f50963e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f50964f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f50965g;

    public d(vt.a aVar, st.g gVar, st.c cVar) {
        this.f50961b = aVar;
        this.f50962c = gVar;
        this.f50963e = cVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f50964f.cancel();
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f50965g) {
            return;
        }
        this.f50965g = true;
        this.f50961b.onComplete();
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f50965g) {
            mu.a.onError(th2);
        } else {
            this.f50965g = true;
            this.f50961b.onError(th2);
        }
    }

    @Override // vt.a, mt.q, tw.c
    public void onNext(Object obj) {
        if (tryOnNext(obj) || this.f50965g) {
            return;
        }
        this.f50964f.request(1L);
    }

    @Override // vt.a, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f50964f, dVar)) {
            this.f50964f = dVar;
            this.f50961b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f50964f.request(j10);
    }

    @Override // vt.a
    public boolean tryOnNext(Object obj) {
        if (!this.f50965g) {
            long j10 = 0;
            while (true) {
                try {
                    this.f50962c.accept(obj);
                    return this.f50961b.tryOnNext(obj);
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    try {
                        j10++;
                        int iOrdinal = ((lu.a) ut.o0.requireNonNull(this.f50963e.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal();
                        if (iOrdinal == 0) {
                            cancel();
                            onComplete();
                            return false;
                        }
                        if (iOrdinal == 2) {
                            break;
                        }
                        if (iOrdinal != 3) {
                            cancel();
                            onError(th2);
                            break;
                        }
                    } catch (Throwable th3) {
                        qt.d.throwIfFatal(th3);
                        cancel();
                        onError(new qt.c(th2, th3));
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
