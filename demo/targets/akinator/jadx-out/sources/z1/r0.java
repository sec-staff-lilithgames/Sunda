package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 implements v0 {
    @Override // z1.v0
    /* renamed from: childHitTest-YqVAtuI */
    public void mo8068childHitTestYqVAtuI(b0 layoutNode, long j10, s hitTestResult, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        kotlin.jvm.internal.e0.checkNotNullParameter(hitTestResult, "hitTestResult");
        layoutNode.m8022hitTestSemanticsM_7yMNQ$ui_release(j10, hitTestResult, z10, z11);
    }

    @Override // z1.v0
    public e2.s contentFrom(e2.s entity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entity, "entity");
        return entity;
    }

    @Override // z1.v0
    /* renamed from: entityType-EEbPh1w */
    public int mo8069entityTypeEEbPh1w() {
        return r.f97382b.m8060getSemanticsEntityTypeEEbPh1w();
    }

    @Override // z1.v0
    public boolean interceptOutOfBoundsChildEvents(e2.s entity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(entity, "entity");
        return false;
    }

    @Override // z1.v0
    public boolean shouldHitTestChildren(b0 parentLayoutNode) {
        e2.p pVarCollapsedSemanticsConfiguration;
        kotlin.jvm.internal.e0.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
        e2.s outerSemantics = e2.d0.getOuterSemantics(parentLayoutNode);
        boolean z10 = false;
        if (outerSemantics != null && (pVarCollapsedSemanticsConfiguration = outerSemantics.collapsedSemanticsConfiguration()) != null && pVarCollapsedSemanticsConfiguration.isClearingSemantics()) {
            z10 = true;
        }
        return !z10;
    }
}
