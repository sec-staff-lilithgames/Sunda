package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends k {

    /* renamed from: g, reason: collision with root package name */
    public final vt.a f51019g;

    public l(vt.a aVar, st.q qVar, st.c cVar) {
        super(qVar, cVar);
        this.f51019g = aVar;
    }

    @Override // cu.k, vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f51015f) {
            return;
        }
        this.f51015f = true;
        this.f51019g.onComplete();
    }

    @Override // cu.k, vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f51015f) {
            mu.a.onError(th2);
        } else {
            this.f51015f = true;
            this.f51019g.onError(th2);
        }
    }

    @Override // cu.k, vt.a, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f51014e, dVar)) {
            this.f51014e = dVar;
            this.f51019g.onSubscribe(this);
        }
    }

    @Override // cu.k, vt.a
    public boolean tryOnNext(Object obj) {
        int iOrdinal;
        if (!this.f51015f) {
            long j10 = 0;
            do {
                try {
                    return this.f51012b.test(obj) && this.f51019g.tryOnNext(obj);
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    try {
                        j10++;
                        iOrdinal = ((lu.a) ut.o0.requireNonNull(this.f51013c.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal();
                        if (iOrdinal == 0) {
                            cancel();
                            onComplete();
                            return false;
                        }
                        if (iOrdinal != 2) {
                        }
                    } catch (Throwable th3) {
                        qt.d.throwIfFatal(th3);
                        cancel();
                        onError(new qt.c(th2, th3));
                    }
                }
            } while (iOrdinal == 3);
            cancel();
            onError(th2);
            return false;
        }
        return false;
    }
}
