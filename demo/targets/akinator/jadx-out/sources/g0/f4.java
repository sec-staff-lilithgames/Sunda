package g0;

import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f4 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4 f56423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f56424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x1.q1 f56425g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f56426h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x1.a1 f56427i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(g4 g4Var, int i10, x1.q1 q1Var, int i11, x1.a1 a1Var) {
        super(1);
        this.f56423e = g4Var;
        this.f56424f = i10;
        this.f56425g = q1Var;
        this.f56426h = i11;
        this.f56427i = a1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        kv.p pVar = this.f56423e.f56437g;
        x1.q1 q1Var = this.f56425g;
        q1.a.m7839place70tqf50$default(layout, this.f56425g, ((s2.q) pVar.invoke(s2.v.m6964boximpl(s2.w.IntSize(this.f56424f - q1Var.getWidth(), this.f56426h - q1Var.getHeight())), this.f56427i.getLayoutDirection())).m6939unboximpl(), 0.0f, 2, null);
    }
}
