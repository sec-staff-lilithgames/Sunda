package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h1.o0 f51600f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(h1.o0 o0Var, p0.j2 j2Var) {
        super(1);
        this.f51599e = j2Var;
        this.f51600f = o0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e2.u0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(e2.u0 semantics) {
        kotlin.jvm.internal.e0.checkNotNullParameter(semantics, "$this$semantics");
        p0.j2 j2Var = this.f51599e;
        e2.r0.setFocused(semantics, ((Boolean) j2Var.getValue()).booleanValue());
        e2.r0.requestFocus$default(semantics, null, new r1(this.f51600f, j2Var), 1, null);
    }
}
