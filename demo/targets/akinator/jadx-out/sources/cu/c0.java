package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 implements vt.a, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f50956b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f50957c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f50958e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f50959f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f50960g;

    public c0(tw.c cVar, st.o oVar, st.c cVar2) {
        this.f50956b = cVar;
        this.f50957c = oVar;
        this.f50958e = cVar2;
    }

    @Override // tw.d
    public void cancel() {
        this.f50959f.cancel();
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f50960g) {
            return;
        }
        this.f50960g = true;
        this.f50956b.onComplete();
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f50960g) {
            mu.a.onError(th2);
        } else {
            this.f50960g = true;
            this.f50956b.onError(th2);
        }
    }

    @Override // vt.a, mt.q, tw.c
    public void onNext(Object obj) {
        if (tryOnNext(obj) || this.f50960g) {
            return;
        }
        this.f50959f.request(1L);
    }

    @Override // vt.a, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f50959f, dVar)) {
            this.f50959f = dVar;
            this.f50956b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f50959f.request(j10);
    }

    @Override // vt.a
    public boolean tryOnNext(Object obj) {
        if (!this.f50960g) {
            long j10 = 0;
            while (true) {
                try {
                    this.f50956b.onNext(ut.o0.requireNonNull(this.f50957c.apply(obj), "The mapper returned a null value"));
                    return true;
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    try {
                        j10++;
                        int iOrdinal = ((lu.a) ut.o0.requireNonNull(this.f50958e.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal();
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
