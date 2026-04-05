package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.y[] f98626c;

    public h(mt.y[] yVarArr) {
        this.f98626c = yVarArr;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        g gVar = new g(cVar, this.f98626c);
        cVar.onSubscribe(gVar);
        gVar.a();
    }
}
