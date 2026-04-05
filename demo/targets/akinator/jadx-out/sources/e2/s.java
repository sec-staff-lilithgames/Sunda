package e2;

import z1.s1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends z1.o0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z1.u0 wrapped, t modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.e0.checkNotNullParameter(wrapped, "wrapped");
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
    }

    public final p collapsedSemanticsConfiguration() {
        s sVar = (s) getNext();
        s sVar2 = null;
        if (sVar == null) {
            z1.u0 wrapped$ui_release = getLayoutNodeWrapper().getWrapped$ui_release();
            if (wrapped$ui_release != null) {
                while (wrapped$ui_release != null && !z1.r.m8080has0OSVbXo(wrapped$ui_release.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w())) {
                    wrapped$ui_release = wrapped$ui_release.getWrapped$ui_release();
                }
                if (wrapped$ui_release != null && (sVar = (s) z1.r.m8082head0OSVbXo(wrapped$ui_release.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w())) != null) {
                    z1.u0 layoutNodeWrapper = sVar.getLayoutNodeWrapper();
                    while (layoutNodeWrapper != null) {
                        if (sVar != null) {
                            sVar2 = sVar;
                            break;
                        }
                        layoutNodeWrapper = layoutNodeWrapper.getWrapped$ui_release();
                        sVar = layoutNodeWrapper != null ? (s) z1.r.m8082head0OSVbXo(layoutNodeWrapper.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w()) : null;
                    }
                }
            }
        } else {
            z1.u0 layoutNodeWrapper2 = sVar.getLayoutNodeWrapper();
            while (layoutNodeWrapper2 != null) {
                if (sVar != null) {
                    sVar2 = sVar;
                    break;
                }
                layoutNodeWrapper2 = layoutNodeWrapper2.getWrapped$ui_release();
                sVar = layoutNodeWrapper2 != null ? (s) z1.r.m8082head0OSVbXo(layoutNodeWrapper2.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w()) : null;
            }
        }
        if (sVar2 == null || ((t) getModifier()).getSemanticsConfiguration().isClearingSemantics()) {
            return ((t) getModifier()).getSemanticsConfiguration();
        }
        p pVarCopy = ((t) getModifier()).getSemanticsConfiguration().copy();
        pVarCopy.collapsePeer$ui_release(sVar2.collapsedSemanticsConfiguration());
        return pVarCopy;
    }

    public final s nearestSemantics$ui_release(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        z1.u0 layoutNodeWrapper = getLayoutNodeWrapper();
        s sVar = this;
        while (layoutNodeWrapper != null) {
            while (sVar != null) {
                if (((Boolean) predicate.invoke(sVar)).booleanValue()) {
                    return sVar;
                }
                sVar = (s) sVar.getNext();
            }
            layoutNodeWrapper = layoutNodeWrapper.getWrapped$ui_release();
            sVar = layoutNodeWrapper != null ? (s) z1.r.m8082head0OSVbXo(layoutNodeWrapper.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w()) : null;
        }
        return null;
    }

    @Override // z1.o0
    public void onAttach() {
        super.onAttach();
        s1 owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onSemanticsChange();
        }
    }

    @Override // z1.o0
    public void onDetach() {
        super.onDetach();
        s1 owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onSemanticsChange();
        }
    }

    public String toString() {
        return super.toString() + " id: " + ((t) getModifier()).getId() + " config: " + ((t) getModifier()).getSemanticsConfiguration();
    }

    public final i1.j touchBoundsInRoot() {
        return !isAttached() ? i1.j.f59349e.getZero() : r.getOrNull(((t) getModifier()).getSemanticsConfiguration(), o.f53581a.getOnClick()) != null ? getLayoutNodeWrapper().touchBoundsInRoot() : x1.e0.boundsInRoot(getLayoutNodeWrapper());
    }
}
