package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z1 extends o0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(u0 layoutNodeWrapper, u1.j0 modifier) {
        super(layoutNodeWrapper, modifier);
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
    }

    @Override // z1.o0
    public void onAttach() {
        super.onAttach();
        ((u1.j0) getModifier()).getPointerInputFilter().setLayoutCoordinates$ui_release(getLayoutNodeWrapper());
        ((u1.j0) getModifier()).getPointerInputFilter().setAttached$ui_release(true);
    }

    @Override // z1.o0
    public void onDetach() {
        super.onDetach();
        ((u1.j0) getModifier()).getPointerInputFilter().setAttached$ui_release(false);
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        if (((u1.j0) getModifier()).getPointerInputFilter().getShareWithSiblings()) {
            return true;
        }
        z1 z1Var = (z1) getNext();
        return z1Var != null ? z1Var.shouldSharePointerInputWithSiblings() : false;
    }
}
