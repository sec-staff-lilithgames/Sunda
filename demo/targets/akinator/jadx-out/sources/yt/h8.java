package yt;

import com.moloco.sdk.BKC.JzVV;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h8 extends gu.o {

    /* renamed from: g, reason: collision with root package name */
    public final st.o f95593g;

    public h8(tw.c cVar, st.o oVar) {
        super(cVar);
        this.f95593g = oVar;
    }

    @Override // gu.o, mt.q, tw.c, mt.f
    public void onComplete() {
        this.f58459b.onComplete();
    }

    @Override // gu.o, mt.q, tw.c
    public void onNext(Object obj) {
        this.f58462f++;
        this.f58459b.onNext(obj);
    }

    @Override // gu.o, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        try {
            a(ut.o0.requireNonNull(this.f95593g.apply(th2), JzVV.JeWrYDD));
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            this.f58459b.onError(new qt.c(th2, th3));
        }
    }
}
