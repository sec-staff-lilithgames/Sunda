package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f97326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(b0 b0Var) {
        super(2);
        this.f97326e = b0Var;
    }

    @Override // kv.p
    public final u0 invoke(e1.u mod, u0 toWrap) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mod, "mod");
        kotlin.jvm.internal.e0.checkNotNullParameter(toWrap, "toWrap");
        r.m8071addBeforeLayoutModifierimpl(toWrap.m8092getEntitiesCHwCgZE(), toWrap, mod);
        boolean z10 = mod instanceof x1.i1;
        b0 b0Var = this.f97326e;
        if (z10) {
            b0Var.getOrCreateOnPositionedCallbacks$ui_release().add(tu.e0.to(toWrap, mod));
        }
        if (mod instanceof x1.o0) {
            x1.o0 o0Var = (x1.o0) mod;
            f1 f1VarAccess$reuseLayoutNodeWrapper = b0.access$reuseLayoutNodeWrapper(b0Var, toWrap, o0Var);
            if (f1VarAccess$reuseLayoutNodeWrapper == null) {
                f1VarAccess$reuseLayoutNodeWrapper = new f1(toWrap, o0Var);
            }
            toWrap = f1VarAccess$reuseLayoutNodeWrapper;
            toWrap.onInitialize();
        }
        r.m8070addAfterLayoutModifierimpl(toWrap.m8092getEntitiesCHwCgZE(), toWrap, mod);
        return toWrap;
    }
}
