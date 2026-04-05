package l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1 f72090e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var) {
        super(1);
        this.f72090e = i1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((m2.j0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(m2.j0 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        String text = it.getText();
        i1 i1Var = this.f72090e;
        if (!kotlin.jvm.internal.e0.areEqual(text, i1Var.getTextDelegate().getText().getText())) {
            i1Var.setHandleState(r.f72161b);
        }
        i1Var.f72114n.invoke(it);
        i1Var.getRecomposeScope().invalidate();
    }
}
