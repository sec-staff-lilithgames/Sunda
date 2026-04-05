package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1 f8550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v1 f8551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(t1 t1Var, v1 v1Var) {
        super(3);
        this.f8550e = t1Var;
        this.f8551f = v1Var;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c0.a2) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final c0.j0 invoke(c0.a2 animateFloat, p0.w wVar, int i10) {
        c0.j0 animationSpec;
        d2 fade;
        kotlin.jvm.internal.e0.checkNotNullParameter(animateFloat, "$this$animateFloat");
        wVar.startReplaceableGroup(-57153604);
        r0 r0Var = r0.f8493b;
        r0 r0Var2 = r0.f8494c;
        if (animateFloat.isTransitioningTo(r0Var, r0Var2)) {
            d2 fade2 = this.f8550e.getData$animation_release().getFade();
            if (fade2 == null || (animationSpec = fade2.getAnimationSpec()) == null) {
                animationSpec = u0.f8516c;
            }
        } else if (!animateFloat.isTransitioningTo(r0Var2, r0.f8495e) || (fade = this.f8551f.getData$animation_release().getFade()) == null || (animationSpec = fade.getAnimationSpec()) == null) {
            animationSpec = u0.f8516c;
        }
        wVar.endReplaceableGroup();
        return animationSpec;
    }
}
