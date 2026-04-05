package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f8477e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(q2 q2Var) {
        super(1);
        this.f8477e = q2Var;
    }

    @Override // kv.l
    public final c0.j0 invoke(c0.a2 a2Var) {
        c0.j0 animationSpec;
        c0.j0 animationSpec2;
        kotlin.jvm.internal.e0.checkNotNullParameter(a2Var, "$this$null");
        r0 r0Var = r0.f8493b;
        r0 r0Var2 = r0.f8494c;
        boolean zIsTransitioningTo = a2Var.isTransitioningTo(r0Var, r0Var2);
        q2 q2Var = this.f8477e;
        if (zIsTransitioningTo) {
            m2 m2Var = (m2) q2Var.getSlideIn().getValue();
            return (m2Var == null || (animationSpec2 = m2Var.getAnimationSpec()) == null) ? u0.f8517d : animationSpec2;
        }
        if (!a2Var.isTransitioningTo(r0Var2, r0.f8495e)) {
            return u0.f8517d;
        }
        m2 m2Var2 = (m2) q2Var.getSlideOut().getValue();
        return (m2Var2 == null || (animationSpec = m2Var2.getAnimationSpec()) == null) ? u0.f8517d : animationSpec;
    }
}
