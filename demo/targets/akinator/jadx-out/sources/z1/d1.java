package z1;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f97294a;

    /* renamed from: b, reason: collision with root package name */
    public final j f97295b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f97296c;

    /* renamed from: d, reason: collision with root package name */
    public final m1 f97297d;

    /* renamed from: e, reason: collision with root package name */
    public final r0.c f97298e;

    /* renamed from: f, reason: collision with root package name */
    public final long f97299f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f97300g;

    /* renamed from: h, reason: collision with root package name */
    public s2.c f97301h;

    /* renamed from: i, reason: collision with root package name */
    public final c1 f97302i;

    public d1(b0 root) {
        kotlin.jvm.internal.e0.checkNotNullParameter(root, "root");
        this.f97294a = root;
        q1 q1Var = q1.f97380a;
        j jVar = new j(q1Var.getEnableExtraAssertions());
        this.f97295b = jVar;
        this.f97297d = new m1();
        this.f97298e = new r0.c(new r1[16], 0);
        this.f97299f = 1L;
        ArrayList arrayList = new ArrayList();
        this.f97300g = arrayList;
        this.f97302i = q1Var.getEnableExtraAssertions() ? new c1(root, jVar, arrayList) : null;
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(d1 d1Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        d1Var.dispatchOnPositionedCallbacks(z10);
    }

    public static /* synthetic */ boolean measureAndLayout$default(d1 d1Var, kv.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        return d1Var.measureAndLayout(aVar);
    }

    public static /* synthetic */ boolean requestRelayout$default(d1 d1Var, b0 b0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return d1Var.requestRelayout(b0Var, z10);
    }

    public static /* synthetic */ boolean requestRemeasure$default(d1 d1Var, b0 b0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return d1Var.requestRemeasure(b0Var, z10);
    }

    public final void a() {
        r0.c cVar = this.f97298e;
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i10 = 0;
            do {
                ((r1) content[i10]).onLayoutComplete();
                i10++;
            } while (i10 < size);
        }
        cVar.clear();
    }

    public final boolean b(b0 b0Var, s2.c cVar) {
        boolean zM8024remeasure_Sx5XlM$ui_release = cVar != null ? b0Var.m8024remeasure_Sx5XlM$ui_release(cVar) : b0.m8020remeasure_Sx5XlM$ui_release$default(b0Var, null, 1, null);
        b0 parent$ui_release = b0Var.getParent$ui_release();
        if (zM8024remeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (b0Var.getMeasuredByParent$ui_release() == d0.f97290b) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
                return zM8024remeasure_Sx5XlM$ui_release;
            }
            if (b0Var.getMeasuredByParent$ui_release() == d0.f97291c) {
                requestRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return zM8024remeasure_Sx5XlM$ui_release;
    }

    public final boolean c(b0 b0Var) {
        boolean zB;
        s2.c cVar;
        if (!b0Var.isPlaced() && ((!b0Var.getMeasurePending$ui_release() || (b0Var.getMeasuredByParent$ui_release() != d0.f97290b && !b0Var.getAlignmentLines$ui_release().getRequired$ui_release())) && !b0Var.getAlignmentLines$ui_release().getRequired$ui_release())) {
            return false;
        }
        boolean measurePending$ui_release = b0Var.getMeasurePending$ui_release();
        b0 b0Var2 = this.f97294a;
        if (measurePending$ui_release) {
            if (b0Var == b0Var2) {
                cVar = this.f97301h;
                kotlin.jvm.internal.e0.checkNotNull(cVar);
            } else {
                cVar = null;
            }
            zB = b(b0Var, cVar);
        } else {
            zB = false;
        }
        if (b0Var.getLayoutPending$ui_release() && b0Var.isPlaced()) {
            if (b0Var == b0Var2) {
                b0Var.place$ui_release(0, 0);
            } else {
                b0Var.replace$ui_release();
            }
            this.f97297d.onNodePositioned(b0Var);
            c1 c1Var = this.f97302i;
            if (c1Var != null) {
                c1Var.assertConsistent();
            }
        }
        ArrayList arrayList = this.f97300g;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b0 b0Var3 = (b0) arrayList.get(i10);
                if (b0Var3.isAttached()) {
                    requestRemeasure$default(this, b0Var3, false, 2, null);
                }
            }
            arrayList.clear();
        }
        return zB;
    }

    public final void dispatchOnPositionedCallbacks(boolean z10) {
        m1 m1Var = this.f97297d;
        if (z10) {
            m1Var.onRootNodePositioned(this.f97294a);
        }
        m1Var.dispatch();
    }

    public final void forceMeasureTheSubtree(b0 layoutNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        j jVar = this.f97295b;
        if (jVar.isEmpty()) {
            return;
        }
        if (!this.f97296c) {
            throw new IllegalStateException("Check failed.");
        }
        if (layoutNode.getMeasurePending$ui_release()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        r0.c cVar = layoutNode.get_children$ui_release();
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i10 = 0;
            do {
                b0 b0Var = (b0) content[i10];
                if (b0Var.getMeasurePending$ui_release() && jVar.remove(b0Var)) {
                    c(b0Var);
                }
                if (!b0Var.getMeasurePending$ui_release()) {
                    forceMeasureTheSubtree(b0Var);
                }
                i10++;
            } while (i10 < size);
        }
        if (layoutNode.getMeasurePending$ui_release() && jVar.remove(layoutNode)) {
            c(layoutNode);
        }
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return !this.f97295b.isEmpty();
    }

    public final long getMeasureIteration() {
        if (this.f97296c) {
            return this.f97299f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
    }

    public final boolean measureAndLayout(kv.a aVar) {
        boolean z10;
        j jVar = this.f97295b;
        b0 b0Var = this.f97294a;
        if (!b0Var.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!b0Var.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f97296c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        boolean z11 = false;
        if (this.f97301h != null) {
            this.f97296c = true;
            try {
                if (jVar.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = false;
                    while (!jVar.isEmpty()) {
                        b0 b0VarPop = jVar.pop();
                        boolean zC = c(b0VarPop);
                        if (b0VarPop == this.f97294a && zC) {
                            z10 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
                this.f97296c = false;
                c1 c1Var = this.f97302i;
                if (c1Var != null) {
                    c1Var.assertConsistent();
                }
                z11 = z10;
            } catch (Throwable th2) {
                this.f97296c = false;
                throw th2;
            }
        }
        a();
        return z11;
    }

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m8030measureAndLayout0kLqBqw(b0 layoutNode, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        b0 b0Var = this.f97294a;
        if (kotlin.jvm.internal.e0.areEqual(layoutNode, b0Var)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!b0Var.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!b0Var.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f97296c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f97301h != null) {
            this.f97296c = true;
            try {
                this.f97295b.remove(layoutNode);
                b(layoutNode, s2.c.m6744boximpl(j10));
                if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
                    layoutNode.replace$ui_release();
                    this.f97297d.onNodePositioned(layoutNode);
                }
                this.f97296c = false;
                c1 c1Var = this.f97302i;
                if (c1Var != null) {
                    c1Var.assertConsistent();
                }
            } catch (Throwable th2) {
                this.f97296c = false;
                throw th2;
            }
        }
        a();
    }

    public final void onNodeDetached(b0 node) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        this.f97295b.remove(node);
    }

    public final void registerOnLayoutCompletedListener(r1 listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f97298e.add(listener);
    }

    public final boolean requestRelayout(b0 layoutNode, boolean z10) {
        b0 parent$ui_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        int iOrdinal = layoutNode.getLayoutState$ui_release().ordinal();
        c1 c1Var = this.f97302i;
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (c1Var != null) {
                c1Var.assertConsistent();
            }
        } else {
            if (iOrdinal != 2) {
                throw new tu.t();
            }
            if ((!layoutNode.getMeasurePending$ui_release() && !layoutNode.getLayoutPending$ui_release()) || z10) {
                layoutNode.markLayoutPending$ui_release();
                if (layoutNode.isPlaced() && (((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                    this.f97295b.add(layoutNode);
                }
                if (!this.f97296c) {
                    return true;
                }
            } else if (c1Var != null) {
                c1Var.assertConsistent();
                return false;
            }
        }
        return false;
    }

    public final boolean requestRemeasure(b0 layoutNode, boolean z10) {
        b0 parent$ui_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        int iOrdinal = layoutNode.getLayoutState$ui_release().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                this.f97300g.add(layoutNode);
                c1 c1Var = this.f97302i;
                if (c1Var != null) {
                    c1Var.assertConsistent();
                }
            } else {
                if (iOrdinal != 2) {
                    throw new tu.t();
                }
                if (!layoutNode.getMeasurePending$ui_release() || z10) {
                    layoutNode.markMeasurePending$ui_release();
                    if ((layoutNode.isPlaced() || (layoutNode.getMeasurePending$ui_release() && (layoutNode.getMeasuredByParent$ui_release() == d0.f97290b || layoutNode.getAlignmentLines$ui_release().getRequired$ui_release()))) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getMeasurePending$ui_release())) {
                        this.f97295b.add(layoutNode);
                    }
                    if (!this.f97296c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m8031updateRootConstraintsBRTryo0(long j10) {
        s2.c cVar = this.f97301h;
        if (cVar == null ? false : s2.c.m6749equalsimpl0(cVar.m6761unboximpl(), j10)) {
            return;
        }
        if (this.f97296c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f97301h = s2.c.m6744boximpl(j10);
        b0 b0Var = this.f97294a;
        b0Var.markMeasurePending$ui_release();
        this.f97295b.add(b0Var);
    }
}
