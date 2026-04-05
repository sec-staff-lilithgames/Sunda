package g0;

import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.q1 f56330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1.w0 f56331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x1.a1 f56332g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f56333h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56334i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e1.d f56335j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(x1.q1 q1Var, x1.w0 w0Var, x1.a1 a1Var, int i10, int i11, e1.d dVar) {
        super(1);
        this.f56330e = q1Var;
        this.f56331f = w0Var;
        this.f56332g = a1Var;
        this.f56333h = i10;
        this.f56334i = i11;
        this.f56335j = dVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        d0.access$placeInBox(layout, this.f56330e, this.f56331f, this.f56332g.getLayoutDirection(), this.f56333h, this.f56334i, this.f56335j);
    }
}
