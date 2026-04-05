package fu;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f56037b;

    public j0(Runnable runnable) {
        this.f56037b = runnable;
    }

    @Override // fu.m0
    public final pt.c a(m0.a aVar, mt.f fVar) {
        return aVar.schedule(new k0(this.f56037b, fVar));
    }
}
