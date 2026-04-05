package e2;

import java.util.ArrayList;
import java.util.List;
import uu.y0;
import z1.b2;
import z1.s1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f53508a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f53509b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f53510c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f53511d;

    /* renamed from: e, reason: collision with root package name */
    public final p f53512e;

    /* renamed from: f, reason: collision with root package name */
    public final int f53513f;

    /* renamed from: g, reason: collision with root package name */
    public final z1.b0 f53514g;

    public c0(s outerSemanticsEntity, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(outerSemanticsEntity, "outerSemanticsEntity");
        this.f53508a = outerSemanticsEntity;
        this.f53509b = z10;
        this.f53512e = outerSemanticsEntity.collapsedSemanticsConfiguration();
        this.f53513f = ((t) outerSemanticsEntity.getModifier()).getId();
        this.f53514g = outerSemanticsEntity.getLayoutNode();
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(c0 c0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return c0Var.unmergedChildren$ui_release(z10, z11);
    }

    public final c0 a(m mVar, kv.l lVar) {
        c0 c0Var = new c0(new s(new z1.b0(true).getInnerLayoutNodeWrapper$ui_release(), new u(mVar != null ? d0.access$roleFakeNodeId(this) : d0.access$contentDescriptionFakeNodeId(this), false, false, lVar)), false);
        c0Var.f53510c = true;
        c0Var.f53511d = this;
        return c0Var;
    }

    public final List b(List list, boolean z10) {
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, z10, false, 2, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) listUnmergedChildren$ui_release$default.get(i10);
            if (c0Var.d()) {
                list.add(c0Var);
            } else if (!c0Var.f53512e.isClearingSemantics()) {
                c0Var.b(list, false);
            }
        }
        return list;
    }

    public final List c(boolean z10, boolean z11, boolean z12) {
        if (!z11 && this.f53512e.isClearingSemantics()) {
            return uu.p0.emptyList();
        }
        if (!d()) {
            return unmergedChildren$ui_release(z10, z12);
        }
        ArrayList arrayList = new ArrayList();
        b(arrayList, z10);
        return arrayList;
    }

    public final boolean d() {
        return this.f53509b && this.f53512e.isMergingSemanticsOfDescendants();
    }

    public final void e(p pVar) {
        if (this.f53512e.isClearingSemantics()) {
            return;
        }
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, false, 3, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) listUnmergedChildren$ui_release$default.get(i10);
            if (!c0Var.d()) {
                pVar.mergeChild$ui_release(c0Var.f53512e);
                c0Var.e(pVar);
            }
        }
    }

    public final z1.u0 findWrapperToGetBounds$ui_release() {
        boolean zIsMergingSemanticsOfDescendants = this.f53512e.isMergingSemanticsOfDescendants();
        s sVar = this.f53508a;
        if (!zIsMergingSemanticsOfDescendants) {
            return sVar.getLayoutNodeWrapper();
        }
        s outerMergingSemantics = d0.getOuterMergingSemantics(this.f53514g);
        if (outerMergingSemantics != null) {
            sVar = outerMergingSemantics;
        }
        return sVar.getLayoutNodeWrapper();
    }

    public final int getAlignmentLinePosition(x1.a alignmentLine) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLine, "alignmentLine");
        return findWrapperToGetBounds$ui_release().get(alignmentLine);
    }

    public final i1.j getBoundsInRoot() {
        return !this.f53514g.isAttached() ? i1.j.f59349e.getZero() : x1.e0.boundsInRoot(findWrapperToGetBounds$ui_release());
    }

    public final i1.j getBoundsInWindow() {
        return !this.f53514g.isAttached() ? i1.j.f59349e.getZero() : x1.e0.boundsInWindow(findWrapperToGetBounds$ui_release());
    }

    public final List<c0> getChildren() {
        return c(false, !this.f53509b, false);
    }

    public final p getConfig() {
        boolean zD = d();
        p pVar = this.f53512e;
        if (!zD) {
            return pVar;
        }
        p pVarCopy = pVar.copy();
        e(pVarCopy);
        return pVarCopy;
    }

    public final int getId() {
        return this.f53513f;
    }

    public final x1.f0 getLayoutInfo() {
        return this.f53514g;
    }

    public final z1.b0 getLayoutNode$ui_release() {
        return this.f53514g;
    }

    public final boolean getMergingEnabled() {
        return this.f53509b;
    }

    public final s getOuterSemanticsEntity$ui_release() {
        return this.f53508a;
    }

    public final c0 getParent() {
        c0 c0Var = this.f53511d;
        if (c0Var != null) {
            return c0Var;
        }
        z1.b0 b0Var = this.f53514g;
        boolean z10 = this.f53509b;
        z1.b0 b0VarAccess$findClosestParentNode = z10 ? d0.access$findClosestParentNode(b0Var, a0.f53500e) : null;
        if (b0VarAccess$findClosestParentNode == null) {
            b0VarAccess$findClosestParentNode = d0.access$findClosestParentNode(b0Var, b0.f53503e);
        }
        s outerSemantics = b0VarAccess$findClosestParentNode != null ? d0.getOuterSemantics(b0VarAccess$findClosestParentNode) : null;
        if (outerSemantics == null) {
            return null;
        }
        return new c0(outerSemantics, z10);
    }

    /* renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m3804getPositionInRootF1C5BW0() {
        return !this.f53514g.isAttached() ? i1.h.f59344b.m4173getZeroF1C5BW0() : x1.e0.positionInRoot(findWrapperToGetBounds$ui_release());
    }

    /* renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m3805getPositionInWindowF1C5BW0() {
        return !this.f53514g.isAttached() ? i1.h.f59344b.m4173getZeroF1C5BW0() : x1.e0.positionInWindow(findWrapperToGetBounds$ui_release());
    }

    public final List<c0> getReplacedChildren$ui_release() {
        return c(false, false, true);
    }

    public final List<c0> getReplacedChildrenSortedByBounds$ui_release() {
        return c(true, false, true);
    }

    public final b2 getRoot() {
        s1 owner$ui_release = this.f53514g.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release.getRootForTest();
        }
        return null;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m3806getSizeYbymL2g() {
        return findWrapperToGetBounds$ui_release().mo7827getSizeYbymL2g();
    }

    public final i1.j getTouchBoundsInRoot() {
        s outerMergingSemantics;
        boolean zIsMergingSemanticsOfDescendants = this.f53512e.isMergingSemanticsOfDescendants();
        s sVar = this.f53508a;
        if (zIsMergingSemanticsOfDescendants && (outerMergingSemantics = d0.getOuterMergingSemantics(this.f53514g)) != null) {
            sVar = outerMergingSemantics;
        }
        return sVar.touchBoundsInRoot();
    }

    public final p getUnmergedConfig$ui_release() {
        return this.f53512e;
    }

    public final boolean isFake$ui_release() {
        return this.f53510c;
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    public final void setFake$ui_release(boolean z10) {
        this.f53510c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List] */
    public final List<c0> unmergedChildren$ui_release(boolean z10, boolean z11) {
        ArrayList arrayListFindOneLayerOfSemanticsWrappersSortedByBounds$default;
        if (this.f53510c) {
            return uu.p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        z1.b0 b0Var = this.f53514g;
        if (z10) {
            arrayListFindOneLayerOfSemanticsWrappersSortedByBounds$default = v0.findOneLayerOfSemanticsWrappersSortedByBounds$default(b0Var, null, 1, null);
        } else {
            ArrayList arrayList2 = new ArrayList();
            d0.a(b0Var, arrayList2);
            arrayListFindOneLayerOfSemanticsWrappersSortedByBounds$default = arrayList2;
        }
        int size = arrayListFindOneLayerOfSemanticsWrappersSortedByBounds$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new c0((s) arrayListFindOneLayerOfSemanticsWrappersSortedByBounds$default.get(i10), this.f53509b));
        }
        if (z11) {
            m mVarAccess$getRole = d0.access$getRole(this);
            p pVar = this.f53512e;
            if (mVarAccess$getRole != null && pVar.isMergingSemanticsOfDescendants() && !arrayList.isEmpty()) {
                arrayList.add(a(mVarAccess$getRole, new y(mVarAccess$getRole)));
            }
            n0 n0Var = n0.f53555a;
            if (pVar.contains(n0Var.getContentDescription()) && !arrayList.isEmpty() && pVar.isMergingSemanticsOfDescendants()) {
                List list = (List) r.getOrNull(pVar, n0Var.getContentDescription());
                String str = list != null ? (String) y0.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new z(str)));
                }
            }
        }
        return arrayList;
    }
}
