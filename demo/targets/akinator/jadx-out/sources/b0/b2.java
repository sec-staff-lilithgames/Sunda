package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2 f8334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var) {
        super(1);
        this.f8334e = c2Var;
    }

    @Override // kv.l
    public final c0.j0 invoke(c0.a2 a2Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(a2Var, "$this$null");
        r0 r0Var = r0.f8493b;
        r0 r0Var2 = r0.f8494c;
        boolean zIsTransitioningTo = a2Var.isTransitioningTo(r0Var, r0Var2);
        c0.j0 animationSpec = null;
        c2 c2Var = this.f8334e;
        if (zIsTransitioningTo) {
            i0 i0Var = (i0) c2Var.getExpand().getValue();
            if (i0Var != null) {
                animationSpec = i0Var.getAnimationSpec();
            }
        } else if (a2Var.isTransitioningTo(r0Var2, r0.f8495e)) {
            i0 i0Var2 = (i0) c2Var.getShrink().getValue();
            if (i0Var2 != null) {
                animationSpec = i0Var2.getAnimationSpec();
            }
        } else {
            animationSpec = u0.f8518e;
        }
        return animationSpec == null ? u0.f8518e : animationSpec;
    }
}
