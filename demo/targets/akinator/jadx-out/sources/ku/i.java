package ku;

import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class i implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public pt.c f72027b;

    @Override // mt.i0, mt.f
    public abstract /* synthetic */ void onComplete();

    @Override // mt.i0, mt.f
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // mt.i0
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // mt.i0, mt.f
    public final void onSubscribe(pt.c cVar) {
        if (iu.j.validate(this.f72027b, cVar, getClass())) {
            this.f72027b = cVar;
        }
    }
}
