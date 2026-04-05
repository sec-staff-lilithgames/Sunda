package zl;

import io.bidmachine.i4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends c implements x {

    /* renamed from: b, reason: collision with root package name */
    public final b f98222b;

    public a(b bVar, hr.f fVar) {
        super(fVar);
        this.f98222b = bVar;
    }

    @Override // zl.c, zl.u, zl.x
    public void onAdLoaded(w wVar) {
        this.f98222b.f98224b = wVar;
        ((i4) ((hr.f) this.f98225a)).onAdLoaded(wVar.c());
    }
}
