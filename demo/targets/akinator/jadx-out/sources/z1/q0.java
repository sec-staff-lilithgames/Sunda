package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 implements v0 {
    @Override // z1.v0
    /* renamed from: childHitTest-YqVAtuI, reason: not valid java name */
    public void mo8068childHitTestYqVAtuI(b0 layoutNode, long j10, s hitTestResult, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        kotlin.jvm.internal.e0.checkNotNullParameter(hitTestResult, "hitTestResult");
        layoutNode.m8021hitTestM_7yMNQ$ui_release(j10, hitTestResult, z10, z11);
    }

    @Override // z1.v0
    /* renamed from: entityType-EEbPh1w, reason: not valid java name */
    public int mo8069entityTypeEEbPh1w() {
        return r.f97382b.m8058getPointerInputEntityTypeEEbPh1w();
    }

    @Override // z1.v0
    public boolean shouldHitTestChildren(b0 parentLayoutNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
        return true;
    }

    @Override // z1.v0
    public u1.i0 contentFrom(z1 entity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entity, "entity");
        return ((u1.j0) entity.getModifier()).getPointerInputFilter();
    }

    @Override // z1.v0
    public boolean interceptOutOfBoundsChildEvents(z1 entity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entity, "entity");
        return ((u1.j0) entity.getModifier()).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }
}
