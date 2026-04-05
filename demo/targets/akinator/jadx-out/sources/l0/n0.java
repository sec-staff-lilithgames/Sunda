package l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.b f72130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0 f72131f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(g2.b bVar, x0 x0Var) {
        super(1);
        this.f72130e = bVar;
        this.f72131f = x0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e2.u0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(e2.u0 semantics) {
        kotlin.jvm.internal.e0.checkNotNullParameter(semantics, "$this$semantics");
        e2.r0.setText(semantics, this.f72130e);
        e2.r0.getTextLayoutResult$default(semantics, null, new m0(this.f72131f), 1, null);
    }
}
