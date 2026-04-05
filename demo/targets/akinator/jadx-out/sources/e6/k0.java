package e6;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f f53830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f53831b;

    public k0(l0 l0Var, z.f fVar) {
        this.f53831b = l0Var;
        this.f53830a = fVar;
    }

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionStart(c0 c0Var, boolean z10) {
        super.onTransitionStart(c0Var, z10);
    }

    @Override // e6.j0, e6.g0
    public void onTransitionEnd(c0 c0Var) {
        ((ArrayList) this.f53830a.get(this.f53831b.f53835c)).remove(c0Var);
        c0Var.removeListener(this);
    }
}
