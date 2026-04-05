package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public q0 f87533b;

    public final q0 getPointerInteropFilter$ui_release() {
        return this.f87533b;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return tu.x0.f87415a;
    }

    public final void setPointerInteropFilter$ui_release(q0 q0Var) {
        this.f87533b = q0Var;
    }

    public void invoke(boolean z10) {
        q0 q0Var = this.f87533b;
        if (q0Var == null) {
            return;
        }
        q0Var.setDisallowIntercept$ui_release(z10);
    }
}
