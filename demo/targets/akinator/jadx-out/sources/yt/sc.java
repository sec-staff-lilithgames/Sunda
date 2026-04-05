package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class sc extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f96322c;

    /* renamed from: e, reason: collision with root package name */
    public final long f96323e;

    public sc(tw.b bVar, long j10) {
        this.f96322c = bVar;
        this.f96323e = j10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f96322c.subscribe(new kc(cVar, this.f96323e));
    }
}
