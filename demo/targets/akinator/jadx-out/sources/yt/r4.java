package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r4 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f96237e;

    /* renamed from: f, reason: collision with root package name */
    public final int f96238f;

    public r4(mt.l lVar, st.o oVar, int i10) {
        super(lVar);
        this.f96237e = oVar;
        this.f96238f = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        mt.l lVar = this.f95121c;
        boolean z10 = lVar instanceof Callable;
        st.o oVar = this.f96237e;
        if (!z10) {
            lVar.subscribe((mt.q) new q4(cVar, oVar, this.f96238f));
            return;
        }
        try {
            Object objCall = ((Callable) lVar).call();
            if (objCall == null) {
                hu.d.complete(cVar);
                return;
            }
            try {
                z4.subscribe(cVar, ((Iterable) oVar.apply(objCall)).iterator());
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                hu.d.error(th2, cVar);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            hu.d.error(th3, cVar);
        }
    }
}
