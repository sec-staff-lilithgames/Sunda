package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y implements vt.a, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final vt.a f51097b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f51098c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f51099e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51100f;

    public y(vt.a aVar, st.o oVar) {
        this.f51097b = aVar;
        this.f51098c = oVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f51099e.cancel();
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f51100f) {
            return;
        }
        this.f51100f = true;
        this.f51097b.onComplete();
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f51100f) {
            mu.a.onError(th2);
        } else {
            this.f51100f = true;
            this.f51097b.onError(th2);
        }
    }

    @Override // vt.a, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f51100f) {
            return;
        }
        try {
            this.f51097b.onNext(ut.o0.requireNonNull(this.f51098c.apply(obj), "The mapper returned a null value"));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cancel();
            onError(th2);
        }
    }

    @Override // vt.a, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f51099e, dVar)) {
            this.f51099e = dVar;
            this.f51097b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f51099e.request(j10);
    }

    @Override // vt.a
    public boolean tryOnNext(Object obj) {
        if (this.f51100f) {
            return false;
        }
        try {
            return this.f51097b.tryOnNext(ut.o0.requireNonNull(this.f51098c.apply(obj), "The mapper returned a null value"));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cancel();
            onError(th2);
            return false;
        }
    }
}
