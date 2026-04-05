package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class yc implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96615b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f96616c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96617e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96618f;

    public yc(tw.c cVar, st.q qVar) {
        this.f96615b = cVar;
        this.f96616c = qVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f96617e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96618f) {
            return;
        }
        this.f96618f = true;
        this.f96615b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96618f) {
            mu.a.onError(th2);
        } else {
            this.f96618f = true;
            this.f96615b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96618f) {
            return;
        }
        try {
            boolean zTest = this.f96616c.test(obj);
            tw.c cVar = this.f96615b;
            if (zTest) {
                cVar.onNext(obj);
                return;
            }
            this.f96618f = true;
            this.f96617e.cancel();
            cVar.onComplete();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f96617e.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96617e, dVar)) {
            this.f96617e = dVar;
            this.f96615b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f96617e.request(j10);
    }
}
