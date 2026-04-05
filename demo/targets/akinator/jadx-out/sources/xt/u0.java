package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u0 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final tw.b f93512b;

    /* renamed from: c, reason: collision with root package name */
    public final int f93513c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93514e;

    public u0(tw.b bVar, int i10, boolean z10) {
        this.f93512b = bVar;
        this.f93513c = i10;
        this.f93514e = z10;
    }

    @Override // mt.c
    public void subscribeActual(mt.f fVar) {
        this.f93512b.subscribe(new t0(fVar, this.f93513c, this.f93514e));
    }
}
