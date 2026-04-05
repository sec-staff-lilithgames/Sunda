package em;

import io.bidmachine.i4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends g implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final f f54702b;

    public e(hr.f fVar, f fVar2) {
        super(fVar);
        this.f54702b = fVar2;
    }

    @Override // em.g, em.y
    public void onAdLoaded(a0 a0Var) {
        this.f54702b.f54704b = a0Var;
        boolean overrideCallbacks = a0Var.getAdUnit().getOverrideCallbacks();
        hr.c cVar = this.f54705a;
        if (overrideCallbacks) {
            ((hr.f) cVar).setVisibilitySource(nm.m.f77061b);
        }
        ((i4) ((hr.f) cVar)).onAdLoaded(a0Var.d());
    }
}
