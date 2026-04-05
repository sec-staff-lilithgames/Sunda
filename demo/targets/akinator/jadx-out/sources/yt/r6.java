package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r6 extends mt.l implements vt.m {

    /* renamed from: c, reason: collision with root package name */
    public final Object f96239c;

    public r6(Object obj) {
        this.f96239c = obj;
    }

    @Override // vt.m, java.util.concurrent.Callable
    public Object call() {
        return this.f96239c;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        cVar.onSubscribe(new hu.e(cVar, this.f96239c));
    }
}
