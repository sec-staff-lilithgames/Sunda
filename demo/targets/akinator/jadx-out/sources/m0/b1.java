package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h1 f73671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(h1 h1Var) {
        super(1);
        this.f73671e = h1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((h1.u0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(h1.u0 focusState) {
        kotlin.jvm.internal.e0.checkNotNullParameter(focusState, "focusState");
        h1.w0 w0Var = (h1.w0) focusState;
        boolean zIsFocused = w0Var.isFocused();
        h1 h1Var = this.f73671e;
        if (!zIsFocused && h1Var.getHasFocus()) {
            h1Var.onRelease();
        }
        h1Var.setHasFocus(w0Var.isFocused());
    }
}
