package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ab implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95153b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f95154c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f95155e;

    /* renamed from: f, reason: collision with root package name */
    public Object f95156f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95157g;

    public ab(tw.c cVar, st.c cVar2) {
        this.f95153b = cVar;
        this.f95154c = cVar2;
    }

    @Override // tw.d
    public void cancel() {
        this.f95155e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95157g) {
            return;
        }
        this.f95157g = true;
        this.f95153b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95157g) {
            mu.a.onError(th2);
        } else {
            this.f95157g = true;
            this.f95153b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95157g) {
            return;
        }
        Object obj2 = this.f95156f;
        tw.c cVar = this.f95153b;
        if (obj2 == null) {
            this.f95156f = obj;
            cVar.onNext(obj);
            return;
        }
        try {
            Object objRequireNonNull = ut.o0.requireNonNull(this.f95154c.apply(obj2, obj), "The value returned by the accumulator is null");
            this.f95156f = objRequireNonNull;
            cVar.onNext(objRequireNonNull);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95155e.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95155e, dVar)) {
            this.f95155e = dVar;
            this.f95153b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f95155e.request(j10);
    }
}
