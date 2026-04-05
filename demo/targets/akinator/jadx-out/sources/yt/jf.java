package yt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class jf implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95764b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f95765c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f95766e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f95767f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95768g;

    public jf(tw.c cVar, Iterator it, st.c cVar2) {
        this.f95764b = cVar;
        this.f95765c = it;
        this.f95766e = cVar2;
    }

    public final void a(Throwable th2) {
        qt.d.throwIfFatal(th2);
        this.f95768g = true;
        this.f95767f.cancel();
        this.f95764b.onError(th2);
    }

    @Override // tw.d
    public void cancel() {
        this.f95767f.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95768g) {
            return;
        }
        this.f95768g = true;
        this.f95764b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95768g) {
            mu.a.onError(th2);
        } else {
            this.f95768g = true;
            this.f95764b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        Iterator it = this.f95765c;
        if (this.f95768g) {
            return;
        }
        try {
            try {
                Object objRequireNonNull = ut.o0.requireNonNull(this.f95766e.apply(obj, ut.o0.requireNonNull(it.next(), "The iterator returned a null value")), "The zipper function returned a null value");
                tw.c cVar = this.f95764b;
                cVar.onNext(objRequireNonNull);
                try {
                    if (it.hasNext()) {
                        return;
                    }
                    this.f95768g = true;
                    this.f95767f.cancel();
                    cVar.onComplete();
                } catch (Throwable th2) {
                    a(th2);
                }
            } catch (Throwable th3) {
                a(th3);
            }
        } catch (Throwable th4) {
            a(th4);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95767f, dVar)) {
            this.f95767f = dVar;
            this.f95764b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f95767f.request(j10);
    }
}
