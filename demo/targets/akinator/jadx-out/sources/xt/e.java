package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93396b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.i f93397c;

    public e(mt.i iVar, mt.i iVar2) {
        this.f93396b = iVar;
        this.f93397c = iVar2;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f93396b.subscribe(new d(fVar, this.f93397c));
    }
}
