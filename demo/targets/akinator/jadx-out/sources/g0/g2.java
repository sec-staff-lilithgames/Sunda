package g0;

import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h2 f56430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1.q1 f56431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x1.a1 f56432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, x1.q1 q1Var, x1.a1 a1Var) {
        super(1);
        this.f56430e = h2Var;
        this.f56431f = q1Var;
        this.f56432g = a1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        h2 h2Var = this.f56430e;
        boolean rtlAware = h2Var.getRtlAware();
        x1.a1 a1Var = this.f56432g;
        if (rtlAware) {
            q1.a.placeRelative$default(layout, this.f56431f, a1Var.mo3419roundToPx0680j_4(h2Var.m3887getStartD9Ej5fM()), a1Var.mo3419roundToPx0680j_4(h2Var.m3888getTopD9Ej5fM()), 0.0f, 4, null);
        } else {
            q1.a.place$default(layout, this.f56431f, a1Var.mo3419roundToPx0680j_4(h2Var.m3887getStartD9Ej5fM()), a1Var.mo3419roundToPx0680j_4(h2Var.m3888getTopD9Ej5fM()), 0.0f, 4, null);
        }
    }
}
