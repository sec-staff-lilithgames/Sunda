package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y0 f53110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d3 f53111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y0 f53112g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlin.jvm.internal.y0 y0Var, d3 d3Var, kotlin.jvm.internal.y0 y0Var2) {
        super(1);
        this.f53110e = y0Var;
        this.f53111f = d3Var;
        this.f53112g = y0Var2;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((c0.m) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(c0.m animateDecay) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animateDecay, "$this$animateDecay");
        float fFloatValue = ((Number) animateDecay.getValue()).floatValue();
        kotlin.jvm.internal.y0 y0Var = this.f53110e;
        float f10 = fFloatValue - y0Var.f71865b;
        float fScrollBy = this.f53111f.scrollBy(f10);
        y0Var.f71865b = ((Number) animateDecay.getValue()).floatValue();
        this.f53112g.f71865b = ((Number) animateDecay.getVelocity()).floatValue();
        if (Math.abs(f10 - fScrollBy) > 0.5f) {
            animateDecay.cancelAnimation();
        }
    }
}
