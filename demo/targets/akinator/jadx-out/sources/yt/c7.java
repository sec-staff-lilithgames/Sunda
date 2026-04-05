package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c7 extends gu.o {

    /* renamed from: g, reason: collision with root package name */
    public final st.o f95258g;

    /* renamed from: h, reason: collision with root package name */
    public final st.o f95259h;

    /* renamed from: i, reason: collision with root package name */
    public final Callable f95260i;

    public c7(tw.c cVar, st.o oVar, st.o oVar2, Callable callable) {
        super(cVar);
        this.f95258g = oVar;
        this.f95259h = oVar2;
        this.f95260i = callable;
    }

    @Override // gu.o, mt.q, tw.c, mt.f
    public void onComplete() {
        try {
            a(ut.o0.requireNonNull(this.f95260i.call(), "The onComplete publisher returned is null"));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f58459b.onError(th2);
        }
    }

    @Override // gu.o, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        try {
            a(ut.o0.requireNonNull(this.f95259h.apply(th2), "The onError publisher returned is null"));
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            this.f58459b.onError(new qt.c(th2, th3));
        }
    }

    @Override // gu.o, mt.q, tw.c
    public void onNext(Object obj) {
        tw.c cVar = this.f58459b;
        try {
            Object objRequireNonNull = ut.o0.requireNonNull(this.f95258g.apply(obj), "The onNext publisher returned is null");
            this.f58462f++;
            cVar.onNext(objRequireNonNull);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cVar.onError(th2);
        }
    }
}
