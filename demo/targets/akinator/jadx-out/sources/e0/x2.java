package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x2 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y0 f53392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d3 f53393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(kotlin.jvm.internal.y0 y0Var, d3 d3Var) {
        super(2);
        this.f53392e = y0Var;
        this.f53393f = d3Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        return tu.x0.f87415a;
    }

    public final void invoke(float f10, float f11) {
        kotlin.jvm.internal.y0 y0Var = this.f53392e;
        float f12 = y0Var.f71865b;
        y0Var.f71865b = this.f53393f.scrollBy(f10 - f12) + f12;
    }
}
