package n0;

import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f75157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1.q1 f75158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f75159g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i10, int i11, x1.q1 q1Var) {
        super(1);
        this.f75157e = i10;
        this.f75158f = q1Var;
        this.f75159g = i11;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        x1.q1 q1Var = this.f75158f;
        q1.a.place$default(layout, this.f75158f, mv.d.roundToInt((this.f75157e - q1Var.getWidth()) / 2.0f), mv.d.roundToInt((this.f75159g - q1Var.getHeight()) / 2.0f), 0.0f, 4, null);
    }
}
