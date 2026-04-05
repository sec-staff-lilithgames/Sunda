package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f97312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b0 b0Var) {
        super(0);
        this.f97312e = b0Var;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m8032invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m8032invoke() {
        b0 b0Var = this.f97312e;
        int i10 = 0;
        b0Var.f97278z = 0;
        r0.c cVar = b0Var.get_children$ui_release();
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i11 = 0;
            do {
                b0 b0Var2 = (b0) content[i11];
                b0Var2.f97277y = b0Var2.getPlaceOrder$ui_release();
                b0Var2.f97276x = Integer.MAX_VALUE;
                b0Var2.getAlignmentLines$ui_release().setUsedDuringParentLayout$ui_release(false);
                if (b0Var2.getMeasuredByParent$ui_release() == d0.f97291c) {
                    b0Var2.setMeasuredByParent$ui_release(d0.f97292e);
                }
                i11++;
            } while (i11 < size);
        }
        b0Var.getInnerLayoutNodeWrapper$ui_release().getMeasureResult().placeChildren();
        r0.c cVar2 = b0Var.get_children$ui_release();
        int size2 = cVar2.getSize();
        if (size2 > 0) {
            Object[] content2 = cVar2.getContent();
            do {
                b0 b0Var3 = (b0) content2[i10];
                if (b0Var3.f97277y != b0Var3.getPlaceOrder$ui_release()) {
                    b0Var.h();
                    b0Var.invalidateLayer$ui_release();
                    if (b0Var3.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                        b0Var3.f();
                    }
                }
                b0Var3.getAlignmentLines$ui_release().setPreviousUsedDuringParentLayout$ui_release(b0Var3.getAlignmentLines$ui_release().getUsedDuringParentLayout$ui_release());
                i10++;
            } while (i10 < size2);
        }
    }
}
