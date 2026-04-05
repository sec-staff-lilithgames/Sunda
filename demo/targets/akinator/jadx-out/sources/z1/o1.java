package z1;

import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o1 extends x1.q1 implements x1.w0 {

    /* renamed from: g, reason: collision with root package name */
    public final b0 f97370g;

    /* renamed from: h, reason: collision with root package name */
    public u0 f97371h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f97372i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f97373j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f97374k;

    /* renamed from: l, reason: collision with root package name */
    public long f97375l;

    /* renamed from: m, reason: collision with root package name */
    public kv.l f97376m;

    /* renamed from: n, reason: collision with root package name */
    public float f97377n;

    /* renamed from: o, reason: collision with root package name */
    public Object f97378o;

    public o1(b0 layoutNode, u0 outerWrapper) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        kotlin.jvm.internal.e0.checkNotNullParameter(outerWrapper, "outerWrapper");
        this.f97370g = layoutNode;
        this.f97371h = outerWrapper;
        this.f97375l = s2.q.f85352b.m6920getZeronOccac();
    }

    /* renamed from: access$placeOuterWrapper-f8xVGno, reason: not valid java name */
    public static final void m8051access$placeOuterWrapperf8xVGno(o1 o1Var, long j10, float f10, kv.l lVar) {
        o1Var.getClass();
        q1.a.C0808a c0808a = q1.a.f91406a;
        if (lVar == null) {
            c0808a.m7843place70tqf50(o1Var.f97371h, j10, f10);
        } else {
            c0808a.m7848placeWithLayeraW9wM(o1Var.f97371h, j10, f10, lVar);
        }
    }

    @Override // x1.q1
    public final void c(float f10, long j10, kv.l lVar) {
        this.f97375l = j10;
        this.f97377n = f10;
        this.f97376m = lVar;
        u0 wrappedBy$ui_release = this.f97371h.getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || !wrappedBy$ui_release.isShallowPlacing()) {
            this.f97373j = true;
            b0 b0Var = this.f97370g;
            b0Var.getAlignmentLines$ui_release().setUsedByModifierLayout$ui_release(false);
            p0.requireOwner(b0Var).getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(b0Var, new n1(this, j10, f10, lVar));
            return;
        }
        q1.a.C0808a c0808a = q1.a.f91406a;
        if (lVar == null) {
            c0808a.m7843place70tqf50(this.f97371h, j10, f10);
        } else {
            c0808a.m7848placeWithLayeraW9wM(this.f97371h, j10, f10, lVar);
        }
    }

    public final void f() {
        b0 b0Var = this.f97370g;
        b0.requestRemeasure$ui_release$default(b0Var, false, 1, null);
        b0 parent$ui_release = b0Var.getParent$ui_release();
        if (parent$ui_release == null || b0Var.getIntrinsicsUsageByParent$ui_release() != d0.f97292e) {
            return;
        }
        int iOrdinal = parent$ui_release.getLayoutState$ui_release().ordinal();
        b0Var.setIntrinsicsUsageByParent$ui_release(iOrdinal != 0 ? iOrdinal != 1 ? parent$ui_release.getIntrinsicsUsageByParent$ui_release() : d0.f97291c : d0.f97290b);
    }

    @Override // x1.q1, x1.b1
    public int get(x1.a alignmentLine) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLine, "alignmentLine");
        b0 b0Var = this.f97370g;
        b0 parent$ui_release = b0Var.getParent$ui_release();
        if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) == c0.f97282b) {
            b0Var.getAlignmentLines$ui_release().setUsedDuringParentMeasurement$ui_release(true);
        } else {
            b0 parent$ui_release2 = b0Var.getParent$ui_release();
            if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == c0.f97283c) {
                b0Var.getAlignmentLines$ui_release().setUsedDuringParentLayout$ui_release(true);
            }
        }
        this.f97374k = true;
        int i10 = this.f97371h.get(alignmentLine);
        this.f97374k = false;
        return i10;
    }

    public final boolean getDuringAlignmentLinesQuery$ui_release() {
        return this.f97374k;
    }

    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final s2.c m8052getLastConstraintsDWUhwKw() {
        if (this.f97372i) {
            return s2.c.m6744boximpl(this.f91405f);
        }
        return null;
    }

    @Override // x1.q1, x1.b1
    public int getMeasuredHeight() {
        return this.f97371h.getMeasuredHeight();
    }

    @Override // x1.q1, x1.b1
    public int getMeasuredWidth() {
        return this.f97371h.getMeasuredWidth();
    }

    public final u0 getOuterWrapper() {
        return this.f97371h;
    }

    @Override // x1.q1, x1.b1
    public Object getParentData() {
        return this.f97378o;
    }

    public final void invalidateIntrinsicsParent(boolean z10) {
        b0 parent$ui_release;
        b0 b0Var = this.f97370g;
        b0 parent$ui_release2 = b0Var.getParent$ui_release();
        d0 intrinsicsUsageByParent$ui_release = b0Var.getIntrinsicsUsageByParent$ui_release();
        if (parent$ui_release2 == null || intrinsicsUsageByParent$ui_release == d0.f97292e) {
            return;
        }
        while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
            parent$ui_release2 = parent$ui_release;
        }
        int iOrdinal = intrinsicsUsageByParent$ui_release.ordinal();
        if (iOrdinal == 0) {
            parent$ui_release2.requestRemeasure$ui_release(z10);
        } else {
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            parent$ui_release2.requestRelayout$ui_release(z10);
        }
    }

    @Override // x1.w0, x1.y
    public int maxIntrinsicHeight(int i10) {
        f();
        return this.f97371h.maxIntrinsicHeight(i10);
    }

    @Override // x1.w0, x1.y
    public int maxIntrinsicWidth(int i10) {
        f();
        return this.f97371h.maxIntrinsicWidth(i10);
    }

    @Override // x1.w0
    /* renamed from: measure-BRTryo0 */
    public x1.q1 mo7826measureBRTryo0(long j10) {
        d0 d0Var;
        b0 b0Var = this.f97370g;
        b0 parent$ui_release = b0Var.getParent$ui_release();
        d0 d0Var2 = d0.f97292e;
        if (parent$ui_release == null) {
            b0Var.setMeasuredByParent$ui_release(d0Var2);
        } else {
            if (b0Var.getMeasuredByParent$ui_release() != d0Var2 && !b0Var.getCanMultiMeasure$ui_release()) {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + b0Var.getMeasuredByParent$ui_release() + ". Parent state " + parent$ui_release.getLayoutState$ui_release() + '.').toString());
            }
            int iOrdinal = parent$ui_release.getLayoutState$ui_release().ordinal();
            if (iOrdinal == 0) {
                d0Var = d0.f97290b;
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block.Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                d0Var = d0.f97291c;
            }
            b0Var.setMeasuredByParent$ui_release(d0Var);
        }
        m8053remeasureBRTryo0(j10);
        return this;
    }

    @Override // x1.w0, x1.y
    public int minIntrinsicHeight(int i10) {
        f();
        return this.f97371h.minIntrinsicHeight(i10);
    }

    @Override // x1.w0, x1.y
    public int minIntrinsicWidth(int i10) {
        f();
        return this.f97371h.minIntrinsicWidth(i10);
    }

    public final void recalculateParentData() {
        this.f97378o = this.f97371h.getParentData();
    }

    /* renamed from: remeasure-BRTryo0, reason: not valid java name */
    public final boolean m8053remeasureBRTryo0(long j10) {
        b0 b0Var = this.f97370g;
        s1 s1VarRequireOwner = p0.requireOwner(b0Var);
        b0 parent$ui_release = b0Var.getParent$ui_release();
        boolean z10 = true;
        b0Var.setCanMultiMeasure$ui_release(b0Var.getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
        if (!b0Var.getMeasurePending$ui_release() && s2.c.m6749equalsimpl0(this.f91405f, j10)) {
            s1VarRequireOwner.forceMeasureTheSubtree(b0Var);
            b0Var.resetSubtreeIntrinsicsUsage$ui_release();
            return false;
        }
        b0Var.getAlignmentLines$ui_release().setUsedByModifierMeasurement$ui_release(false);
        r0.c cVar = b0Var.get_children$ui_release();
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i10 = 0;
            do {
                ((b0) content[i10]).getAlignmentLines$ui_release().setUsedDuringParentMeasurement$ui_release(false);
                i10++;
            } while (i10 < size);
        }
        this.f97372i = true;
        long jMo7827getSizeYbymL2g = this.f97371h.mo7827getSizeYbymL2g();
        if (!s2.c.m6749equalsimpl0(this.f91405f, j10)) {
            this.f91405f = j10;
            d();
        }
        b0Var.m8023performMeasureBRTryo0$ui_release(j10);
        if (s2.v.m6970equalsimpl0(this.f97371h.mo7827getSizeYbymL2g(), jMo7827getSizeYbymL2g) && this.f97371h.getWidth() == getWidth() && this.f97371h.getHeight() == getHeight()) {
            z10 = false;
        }
        e(s2.w.IntSize(this.f97371h.getWidth(), this.f97371h.getHeight()));
        return z10;
    }

    public final void replace() {
        if (!this.f97373j) {
            throw new IllegalStateException("Check failed.");
        }
        c(this.f97377n, this.f97375l, this.f97376m);
    }

    public final void setDuringAlignmentLinesQuery$ui_release(boolean z10) {
        this.f97374k = z10;
    }

    public final void setOuterWrapper(u0 u0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u0Var, "<set-?>");
        this.f97371h = u0Var;
    }
}
