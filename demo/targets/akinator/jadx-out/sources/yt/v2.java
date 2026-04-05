package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v2 implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96430b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f96431c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f96432e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f96433f;

    public v2(tw.c cVar, st.o oVar) {
        this.f96430b = cVar;
        this.f96431c = oVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f96433f.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96432e) {
            return;
        }
        this.f96432e = true;
        this.f96430b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96432e) {
            mu.a.onError(th2);
        } else {
            this.f96432e = true;
            this.f96430b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96432e) {
            if (obj instanceof mt.a0) {
                mt.a0 a0Var = (mt.a0) obj;
                if (a0Var.isOnError()) {
                    mu.a.onError(a0Var.getError());
                    return;
                }
                return;
            }
            return;
        }
        try {
            mt.a0 a0Var2 = (mt.a0) ut.o0.requireNonNull(this.f96431c.apply(obj), "The selector returned a null Notification");
            if (a0Var2.isOnError()) {
                this.f96433f.cancel();
                onError(a0Var2.getError());
            } else if (!a0Var2.isOnComplete()) {
                this.f96430b.onNext(a0Var2.getValue());
            } else {
                this.f96433f.cancel();
                onComplete();
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f96433f.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96433f, dVar)) {
            this.f96433f = dVar;
            this.f96430b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f96433f.request(j10);
    }
}
