package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f97446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(u0 u0Var) {
        super(0);
        this.f97446e = u0Var;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m8100invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m8100invoke() {
        u0 wrappedBy$ui_release = this.f97446e.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null) {
            wrappedBy$ui_release.invalidateLayer();
        }
    }
}
