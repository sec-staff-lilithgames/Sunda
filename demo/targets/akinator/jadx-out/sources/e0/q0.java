package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y0 f53259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(kotlin.jvm.internal.y0 y0Var) {
        super(2);
        this.f53259e = y0Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((u1.c0) obj, ((Number) obj2).floatValue());
        return tu.x0.f87415a;
    }

    public final void invoke(u1.c0 change, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(change, "change");
        change.consume();
        this.f53259e.f71865b = f10;
    }
}
