package yt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ae extends AtomicBoolean implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95170b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f95171c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f95172e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95173f;

    /* renamed from: g, reason: collision with root package name */
    public tw.d f95174g;

    public ae(tw.c cVar, Object obj, st.g gVar, boolean z10) {
        this.f95170b = cVar;
        this.f95171c = obj;
        this.f95172e = gVar;
        this.f95173f = z10;
    }

    public final void a() {
        if (compareAndSet(false, true)) {
            try {
                this.f95172e.accept(this.f95171c);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // tw.d
    public void cancel() {
        a();
        this.f95174g.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        boolean z10 = this.f95173f;
        tw.c cVar = this.f95170b;
        if (!z10) {
            cVar.onComplete();
            this.f95174g.cancel();
            a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.f95172e.accept(this.f95171c);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cVar.onError(th2);
                return;
            }
        }
        this.f95174g.cancel();
        cVar.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        boolean z10 = this.f95173f;
        tw.c cVar = this.f95170b;
        if (!z10) {
            cVar.onError(th2);
            this.f95174g.cancel();
            a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.f95172e.accept(this.f95171c);
                th = null;
            } catch (Throwable th3) {
                th = th3;
                qt.d.throwIfFatal(th);
            }
        } else {
            th = null;
        }
        this.f95174g.cancel();
        if (th != null) {
            cVar.onError(new qt.c(th2, th));
        } else {
            cVar.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95170b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95174g, dVar)) {
            this.f95174g = dVar;
            this.f95170b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f95174g.request(j10);
    }
}
