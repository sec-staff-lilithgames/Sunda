package qu;

import iu.j;
import mt.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a implements q {

    /* renamed from: b, reason: collision with root package name */
    public tw.d f83494b;

    @Override // mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onComplete();

    @Override // mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // mt.q, tw.c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // mt.q, tw.c
    public final void onSubscribe(tw.d dVar) {
        if (j.validate(this.f83494b, dVar, getClass())) {
            this.f83494b = dVar;
            if (dVar != null) {
                dVar.request(Long.MAX_VALUE);
            }
        }
    }
}
