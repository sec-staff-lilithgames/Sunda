package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends gu.h {

    /* renamed from: f, reason: collision with root package name */
    public final st.b f50939f;

    /* renamed from: g, reason: collision with root package name */
    public Object f50940g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f50941h;

    public a(tw.c cVar, Object obj, st.b bVar) {
        super(cVar);
        this.f50940g = obj;
        this.f50939f = bVar;
    }

    @Override // gu.h, hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f58433e.cancel();
    }

    @Override // gu.h, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f50941h) {
            return;
        }
        this.f50941h = true;
        Object obj = this.f50940g;
        this.f50940g = null;
        complete(obj);
    }

    @Override // gu.h, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f50941h) {
            mu.a.onError(th2);
            return;
        }
        this.f50941h = true;
        this.f50940g = null;
        this.f59162b.onError(th2);
    }

    @Override // gu.h, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f50941h) {
            return;
        }
        try {
            this.f50939f.accept(this.f50940g, obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cancel();
            onError(th2);
        }
    }

    @Override // gu.h, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f58433e, dVar)) {
            this.f58433e = dVar;
            this.f59162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
