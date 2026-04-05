package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ta extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f96368c;

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f96369e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f96370f;

    public ta(tw.b bVar, tw.b bVar2, boolean z10) {
        this.f96368c = bVar;
        this.f96369e = bVar2;
        this.f96370f = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        qu.d dVar = new qu.d(cVar);
        boolean z10 = this.f96370f;
        tw.b bVar = this.f96369e;
        tw.b bVar2 = this.f96368c;
        if (z10) {
            bVar2.subscribe(new pa(dVar, bVar));
        } else {
            bVar2.subscribe(new qa(dVar, bVar));
        }
    }
}
