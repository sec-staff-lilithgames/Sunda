package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final tw.b f93440b;

    /* renamed from: c, reason: collision with root package name */
    public final int f93441c;

    public j(tw.b bVar, int i10) {
        this.f93440b = bVar;
        this.f93441c = i10;
    }

    @Override // mt.c
    public void subscribeActual(mt.f fVar) {
        this.f93440b.subscribe(new i(fVar, this.f93441c));
    }
}
