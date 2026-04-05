package bu;

import bu.l4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m4 extends ju.b {

    /* renamed from: c, reason: collision with root package name */
    public final n4 f10640c;

    public m4(Object obj, n4 n4Var) {
        super(obj);
        this.f10640c = n4Var;
    }

    public static <T, K> m4 createWith(K k10, int i10, l4.a aVar, boolean z10) {
        return new m4(k10, new n4(k10, i10, aVar, z10));
    }

    public void onComplete() {
        this.f10640c.onComplete();
    }

    public void onError(Throwable th2) {
        this.f10640c.onError(th2);
    }

    public void onNext(Object obj) {
        this.f10640c.onNext(obj);
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10640c.subscribe(i0Var);
    }
}
