package ql;

import sl.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f83283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kl.d f83284c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f83285e;

    public d(f fVar, j jVar, kl.d dVar) {
        this.f83285e = fVar;
        this.f83283b = jVar;
        this.f83284c = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f83283b.loadAd(new c(this));
    }
}
