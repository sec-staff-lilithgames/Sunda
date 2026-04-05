package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.y[] f98653c;

    public j(mt.y[] yVarArr) {
        this.f98653c = yVarArr;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        i iVar = new i(cVar, this.f98653c);
        cVar.onSubscribe(iVar);
        iVar.a();
    }
}
