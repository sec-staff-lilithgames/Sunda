package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f72286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1 f72287f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, u1 u1Var) {
        super(1);
        this.f72286e = g0Var;
        this.f72287f = u1Var;
    }

    @Override // kv.l
    public final z1 invoke(kv.l onAsyncCompletion) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
        g0 g0Var = this.f72286e;
        m0 m0Var = g0Var.f72291d;
        h1 platformFontLoader$ui_text_release = g0Var.getPlatformFontLoader$ui_text_release();
        kv.l lVar = g0Var.f72293f;
        u1 u1Var = this.f72287f;
        z1 z1VarResolve = m0Var.resolve(u1Var, platformFontLoader$ui_text_release, onAsyncCompletion, lVar);
        if (z1VarResolve != null) {
            return z1VarResolve;
        }
        z1 z1VarResolve2 = g0Var.f72292e.resolve(u1Var, g0Var.getPlatformFontLoader$ui_text_release(), onAsyncCompletion, g0Var.f72293f);
        if (z1VarResolve2 != null) {
            return z1VarResolve2;
        }
        throw new IllegalStateException("Could not load font");
    }
}
