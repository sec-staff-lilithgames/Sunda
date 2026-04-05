package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f72282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var) {
        super(1);
        this.f72282e = g0Var;
    }

    @Override // kv.l
    public final z1 invoke(u1 typeRequest) {
        kotlin.jvm.internal.e0.checkNotNullParameter(typeRequest, "typeRequest");
        g0 g0Var = this.f72282e;
        z1 z1VarResolve = g0Var.f72291d.resolve(typeRequest, g0Var.getPlatformFontLoader$ui_text_release(), c0.f72257e, g0Var.f72293f);
        if (z1VarResolve != null) {
            return z1VarResolve;
        }
        z1 z1VarResolve2 = g0Var.f72292e.resolve(typeRequest, g0Var.getPlatformFontLoader$ui_text_release(), d0.f72281e, g0Var.f72293f);
        if (z1VarResolve2 != null) {
            return z1VarResolve2;
        }
        throw new IllegalStateException("Could not load font");
    }
}
