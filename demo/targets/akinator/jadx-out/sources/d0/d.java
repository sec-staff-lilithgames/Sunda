package d0;

import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.q1 f51349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f51350f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(x1.q1 q1Var, int i10) {
        super(1);
        this.f51349e = q1Var;
        this.f51350f = i10;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        int i10 = this.f51350f;
        x1.q1 q1Var = this.f51349e;
        int width = q1Var.getWidth();
        x1.q1 q1Var2 = this.f51349e;
        q1.a.placeWithLayer$default(layout, q1Var, ((-i10) / 2) - ((width - q1Var2.getMeasuredWidth()) / 2), ((-i10) / 2) - ((q1Var2.getHeight() - q1Var2.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
    }
}
