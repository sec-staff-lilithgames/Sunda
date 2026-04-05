package z1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import x1.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u0 extends x1.q1 implements x1.w0, x1.d0, t1, kv.l {

    /* renamed from: g, reason: collision with root package name */
    public final b0 f97405g;

    /* renamed from: h, reason: collision with root package name */
    public u0 f97406h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f97407i;

    /* renamed from: j, reason: collision with root package name */
    public kv.l f97408j;

    /* renamed from: k, reason: collision with root package name */
    public s2.e f97409k;

    /* renamed from: l, reason: collision with root package name */
    public s2.x f97410l;

    /* renamed from: m, reason: collision with root package name */
    public float f97411m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f97412n;

    /* renamed from: o, reason: collision with root package name */
    public x1.y0 f97413o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashMap f97414p;

    /* renamed from: q, reason: collision with root package name */
    public long f97415q;

    /* renamed from: r, reason: collision with root package name */
    public float f97416r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f97417s;

    /* renamed from: t, reason: collision with root package name */
    public i1.e f97418t;

    /* renamed from: u, reason: collision with root package name */
    public final o0[] f97419u;

    /* renamed from: v, reason: collision with root package name */
    public final y0 f97420v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f97421w;

    /* renamed from: x, reason: collision with root package name */
    public p1 f97422x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f97403y = new a(null);

    /* renamed from: z, reason: collision with root package name */
    public static final t0 f97404z = t0.f97402e;
    public static final s0 A = s0.f97401e;
    public static final j1.a2 B = new j1.a2();
    public static final q0 C = new q0();
    public static final r0 D = new r0();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final v0 getPointerInputSource() {
            return u0.C;
        }

        public final v0 getSemanticsSource() {
            return u0.D;
        }
    }

    public u0(b0 layoutNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        this.f97405g = layoutNode;
        this.f97409k = layoutNode.getDensity();
        this.f97410l = layoutNode.getLayoutDirection();
        this.f97411m = 0.8f;
        this.f97415q = s2.q.f85352b.m6920getZeronOccac();
        this.f97419u = r.m8075constructorimpl$default(null, 1, null);
        this.f97420v = new y0(this);
    }

    public static final void access$drawContainedDrawModifiers(u0 u0Var, j1.e0 e0Var) {
        m mVar = (m) r.m8082head0OSVbXo(u0Var.f97419u, r.f97382b.m8055getDrawEntityTypeEEbPh1w());
        if (mVar == null) {
            u0Var.performDraw(e0Var);
        } else {
            mVar.draw(e0Var);
        }
    }

    /* renamed from: access$hit-1hIXUjU, reason: not valid java name */
    public static final void m8087access$hit1hIXUjU(u0 u0Var, o0 o0Var, v0 v0Var, long j10, s sVar, boolean z10, boolean z11) {
        if (o0Var == null) {
            u0Var.mo8085hitTestChildYqVAtuI(v0Var, j10, sVar, z10, z11);
        } else {
            u0Var.getClass();
            sVar.hit(v0Var.contentFrom(o0Var), z11, new w0(u0Var, o0Var, v0Var, j10, sVar, z10, z11));
        }
    }

    /* renamed from: access$setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public static final void m8089access$setMeasurementConstraintsBRTryo0(u0 u0Var, long j10) {
        if (s2.c.m6749equalsimpl0(u0Var.f91405f, j10)) {
            return;
        }
        u0Var.f91405f = j10;
        u0Var.d();
    }

    public static /* synthetic */ void rectInParent$ui_release$default(u0 u0Var, i1.e eVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        u0Var.rectInParent$ui_release(eVar, z10, z11);
    }

    public void attach() {
        this.f97412n = true;
        onLayerBlockUpdated(this.f97408j);
        for (o0 next : this.f97419u) {
            for (; next != null; next = next.getNext()) {
                next.onAttach();
            }
        }
    }

    @Override // x1.q1
    public void c(float f10, long j10, kv.l lVar) {
        onLayerBlockUpdated(lVar);
        if (!s2.q.m6929equalsimpl0(this.f97415q, j10)) {
            this.f97415q = j10;
            p1 p1Var = this.f97422x;
            if (p1Var != null) {
                p1Var.mo41movegyyYBs(j10);
            } else {
                u0 u0Var = this.f97406h;
                if (u0Var != null) {
                    u0Var.invalidateLayer();
                }
            }
            u0 wrapped$ui_release = getWrapped$ui_release();
            b0 b0Var = wrapped$ui_release != null ? wrapped$ui_release.f97405g : null;
            b0 b0Var2 = this.f97405g;
            if (kotlin.jvm.internal.e0.areEqual(b0Var, b0Var2)) {
                b0 parent$ui_release = b0Var2.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.onAlignmentsChanged$ui_release();
                }
            } else {
                b0Var2.onAlignmentsChanged$ui_release();
            }
            s1 owner$ui_release = b0Var2.getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(b0Var2);
            }
        }
        this.f97416r = f10;
    }

    public abstract int calculateAlignmentLine(x1.a aVar);

    public void detach() {
        for (o0 next : this.f97419u) {
            for (; next != null; next = next.getNext()) {
                next.onDetach();
            }
        }
        this.f97412n = false;
        onLayerBlockUpdated(this.f97408j);
        b0 parent$ui_release = this.f97405g.getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void draw(j1.e0 canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        p1 p1Var = this.f97422x;
        if (p1Var != null) {
            p1Var.drawLayer(canvas);
            return;
        }
        float fM6930getXimpl = s2.q.m6930getXimpl(this.f97415q);
        float fM6931getYimpl = s2.q.m6931getYimpl(this.f97415q);
        canvas.translate(fM6930getXimpl, fM6931getYimpl);
        m mVar = (m) r.m8082head0OSVbXo(this.f97419u, r.f97382b.m8055getDrawEntityTypeEEbPh1w());
        if (mVar == null) {
            performDraw(canvas);
        } else {
            mVar.draw(canvas);
        }
        canvas.translate(-fM6930getXimpl, -fM6931getYimpl);
    }

    public final void f(u0 u0Var, i1.e eVar, boolean z10) {
        if (u0Var == this) {
            return;
        }
        u0 u0Var2 = this.f97406h;
        if (u0Var2 != null) {
            u0Var2.f(u0Var, eVar, z10);
        }
        float fM6930getXimpl = s2.q.m6930getXimpl(this.f97415q);
        eVar.setLeft(eVar.getLeft() - fM6930getXimpl);
        eVar.setRight(eVar.getRight() - fM6930getXimpl);
        float fM6931getYimpl = s2.q.m6931getYimpl(this.f97415q);
        eVar.setTop(eVar.getTop() - fM6931getYimpl);
        eVar.setBottom(eVar.getBottom() - fM6931getYimpl);
        p1 p1Var = this.f97422x;
        if (p1Var != null) {
            p1Var.mapBounds(eVar, true);
            if (this.f97407i && z10) {
                eVar.intersect(0.0f, 0.0f, s2.v.m6972getWidthimpl(mo7827getSizeYbymL2g()), s2.v.m6971getHeightimpl(mo7827getSizeYbymL2g()));
                eVar.isEmpty();
            }
        }
    }

    public final u0 findCommonAncestor$ui_release(u0 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        b0 parent$ui_release = other.f97405g;
        b0 b0Var = this.f97405g;
        if (parent$ui_release == b0Var) {
            u0 outerLayoutNodeWrapper$ui_release = b0Var.getOuterLayoutNodeWrapper$ui_release();
            u0 u0Var = this;
            while (u0Var != outerLayoutNodeWrapper$ui_release && u0Var != other) {
                u0Var = u0Var.f97406h;
                kotlin.jvm.internal.e0.checkNotNull(u0Var);
            }
            return u0Var == other ? other : this;
        }
        while (parent$ui_release.getDepth$ui_release() > b0Var.getDepth$ui_release()) {
            parent$ui_release = parent$ui_release.getParent$ui_release();
            kotlin.jvm.internal.e0.checkNotNull(parent$ui_release);
        }
        b0 parent$ui_release2 = b0Var;
        while (parent$ui_release2.getDepth$ui_release() > parent$ui_release.getDepth$ui_release()) {
            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
            kotlin.jvm.internal.e0.checkNotNull(parent$ui_release2);
        }
        while (parent$ui_release != parent$ui_release2) {
            parent$ui_release = parent$ui_release.getParent$ui_release();
            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
            if (parent$ui_release == null || parent$ui_release2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (parent$ui_release2 != b0Var) {
            if (parent$ui_release != other.f97405g) {
                return parent$ui_release.getInnerLayoutNodeWrapper$ui_release();
            }
        }
    }

    /* renamed from: fromParentPosition-MK-Hz9U, reason: not valid java name */
    public long m8091fromParentPositionMKHz9U(long j10) {
        long jM6941minusNvtHpc = s2.r.m6941minusNvtHpc(j10, this.f97415q);
        p1 p1Var = this.f97422x;
        return p1Var != null ? p1Var.mo40mapOffset8S9VItk(jM6941minusNvtHpc, true) : jM6941minusNvtHpc;
    }

    public final long g(u0 u0Var, long j10) {
        if (u0Var == this) {
            return j10;
        }
        u0 u0Var2 = this.f97406h;
        return (u0Var2 == null || kotlin.jvm.internal.e0.areEqual(u0Var, u0Var2)) ? m8091fromParentPositionMKHz9U(j10) : m8091fromParentPositionMKHz9U(u0Var2.g(u0Var, j10));
    }

    @Override // x1.q1, x1.b1
    public final int get(x1.a alignmentLine) {
        int iCalculateAlignmentLine;
        kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (this.f97413o == null || (iCalculateAlignmentLine = calculateAlignmentLine(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return iCalculateAlignmentLine + (alignmentLine instanceof f2 ? s2.q.m6930getXimpl(b()) : s2.q.m6931getYimpl(b()));
    }

    /* renamed from: getEntities-CHwCgZE, reason: not valid java name */
    public final o0[] m8092getEntitiesCHwCgZE() {
        return this.f97419u;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.f97421w;
    }

    public final p1 getLayer() {
        return this.f97422x;
    }

    public final b0 getLayoutNode$ui_release() {
        return this.f97405g;
    }

    public final x1.y0 getMeasureResult() {
        x1.y0 y0Var = this.f97413o;
        if (y0Var != null) {
            return y0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public abstract x1.a1 getMeasureScope();

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m8093getMinimumTouchTargetSizeNHjbRc() {
        return this.f97409k.mo3426toSizeXkaWNTQ(this.f97405g.getViewConfiguration().mo36getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // x1.d0
    public final x1.d0 getParentCoordinates() {
        if (isAttached()) {
            return this.f97406h;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
    }

    @Override // x1.q1, x1.b1
    public Object getParentData() {
        return k((c2) r.m8082head0OSVbXo(this.f97419u, r.f97382b.m8057getParentDataEntityTypeEEbPh1w()));
    }

    @Override // x1.d0
    public final x1.d0 getParentLayoutCoordinates() {
        if (isAttached()) {
            return this.f97405g.getOuterLayoutNodeWrapper$ui_release().f97406h;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
    }

    /* renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public final long m8094getPositionnOccac() {
        return this.f97415q;
    }

    @Override // x1.d0
    public Set<x1.a> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (u0 wrapped$ui_release = this; wrapped$ui_release != null; wrapped$ui_release = wrapped$ui_release.getWrapped$ui_release()) {
            x1.y0 y0Var = wrapped$ui_release.f97413o;
            Map<x1.a, Integer> alignmentLines = y0Var != null ? y0Var.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? uu.c2.emptySet() : linkedHashSet;
    }

    @Override // x1.d0
    /* renamed from: getSize-YbymL2g */
    public final long mo7827getSizeYbymL2g() {
        return this.f91404e;
    }

    public u0 getWrapped$ui_release() {
        return null;
    }

    public final u0 getWrappedBy$ui_release() {
        return this.f97406h;
    }

    public final float getZIndex() {
        return this.f97416r;
    }

    public final long h(long j10) {
        return i1.p.Size(Math.max(0.0f, (i1.o.m4252getWidthimpl(j10) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (i1.o.m4249getHeightimpl(j10) - getMeasuredHeight()) / 2.0f));
    }

    /* renamed from: hitTest-YqVAtuI, reason: not valid java name */
    public final <T extends o0, C, M extends e1.v> void m8095hitTestYqVAtuI(v0 hitTestSource, long j10, s hitTestResult, boolean z10, boolean z11) {
        p1 p1Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(hitTestSource, "hitTestSource");
        kotlin.jvm.internal.e0.checkNotNullParameter(hitTestResult, "hitTestResult");
        o0 o0VarM8082head0OSVbXo = r.m8082head0OSVbXo(this.f97419u, hitTestSource.mo8069entityTypeEEbPh1w());
        if (!i1.i.m4196isFinitek4lQ0M(j10) || ((p1Var = this.f97422x) != null && this.f97407i && !p1Var.mo39isInLayerk4lQ0M(j10))) {
            if (z10) {
                float fI = i(j10, m8093getMinimumTouchTargetSizeNHjbRc());
                if (Float.isInfinite(fI) || Float.isNaN(fI) || !hitTestResult.isHitInMinimumTouchTargetBetter(fI, false)) {
                    return;
                }
                l(o0VarM8082head0OSVbXo, hitTestSource, j10, hitTestResult, z10, false, fI);
                return;
            }
            return;
        }
        if (o0VarM8082head0OSVbXo == null) {
            mo8085hitTestChildYqVAtuI(hitTestSource, j10, hitTestResult, z10, z11);
            return;
        }
        float fM4185getXimpl = i1.h.m4185getXimpl(j10);
        float fM4186getYimpl = i1.h.m4186getYimpl(j10);
        if (fM4185getXimpl >= 0.0f && fM4186getYimpl >= 0.0f && fM4185getXimpl < getMeasuredWidth() && fM4186getYimpl < getMeasuredHeight()) {
            hitTestResult.hit(hitTestSource.contentFrom(o0VarM8082head0OSVbXo), z11, new w0(this, o0VarM8082head0OSVbXo, hitTestSource, j10, hitTestResult, z10, z11));
            return;
        }
        float fI2 = !z10 ? Float.POSITIVE_INFINITY : i(j10, m8093getMinimumTouchTargetSizeNHjbRc());
        if (Float.isInfinite(fI2) || Float.isNaN(fI2) || !hitTestResult.isHitInMinimumTouchTargetBetter(fI2, z11)) {
            m(o0VarM8082head0OSVbXo, hitTestSource, j10, hitTestResult, z10, z11, fI2);
        } else {
            l(o0VarM8082head0OSVbXo, hitTestSource, j10, hitTestResult, z10, z11, fI2);
        }
    }

    /* renamed from: hitTestChild-YqVAtuI */
    public <T extends o0, C, M extends e1.v> void mo8085hitTestChildYqVAtuI(v0 hitTestSource, long j10, s hitTestResult, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(hitTestSource, "hitTestSource");
        kotlin.jvm.internal.e0.checkNotNullParameter(hitTestResult, "hitTestResult");
        u0 wrapped$ui_release = getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.m8095hitTestYqVAtuI(hitTestSource, wrapped$ui_release.m8091fromParentPositionMKHz9U(j10), hitTestResult, z10, z11);
        }
    }

    public final float i(long j10, long j11) {
        if (getMeasuredWidth() >= i1.o.m4252getWidthimpl(j11) && getMeasuredHeight() >= i1.o.m4249getHeightimpl(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        long jH = h(j11);
        float fM4252getWidthimpl = i1.o.m4252getWidthimpl(jH);
        float fM4249getHeightimpl = i1.o.m4249getHeightimpl(jH);
        float fM4185getXimpl = i1.h.m4185getXimpl(j10);
        float fMax = Math.max(0.0f, fM4185getXimpl < 0.0f ? -fM4185getXimpl : fM4185getXimpl - getMeasuredWidth());
        float fM4186getYimpl = i1.h.m4186getYimpl(j10);
        long jOffset = i1.i.Offset(fMax, Math.max(0.0f, fM4186getYimpl < 0.0f ? -fM4186getYimpl : fM4186getYimpl - getMeasuredHeight()));
        if ((fM4252getWidthimpl > 0.0f || fM4249getHeightimpl > 0.0f) && i1.h.m4185getXimpl(jOffset) <= fM4252getWidthimpl && i1.h.m4186getYimpl(jOffset) <= fM4249getHeightimpl) {
            return i1.h.m4184getDistanceSquaredimpl(jOffset);
        }
        return Float.POSITIVE_INFINITY;
    }

    public void invalidateLayer() {
        p1 p1Var = this.f97422x;
        if (p1Var != null) {
            p1Var.invalidate();
            return;
        }
        u0 u0Var = this.f97406h;
        if (u0Var != null) {
            u0Var.invalidateLayer();
        }
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((j1.e0) obj);
        return tu.x0.f87415a;
    }

    @Override // x1.d0
    public final boolean isAttached() {
        if (!this.f97412n || this.f97405g.isAttached()) {
            return this.f97412n;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final boolean isShallowPlacing() {
        return this.f97417s;
    }

    public final boolean isTransparent() {
        if (this.f97422x != null && this.f97411m <= 0.0f) {
            return true;
        }
        u0 u0Var = this.f97406h;
        if (u0Var != null) {
            return u0Var.isTransparent();
        }
        return false;
    }

    @Override // z1.t1
    public boolean isValid() {
        return this.f97422x != null;
    }

    public final void j(j1.e0 canvas, j1.i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        canvas.drawRect(new i1.j(0.5f, 0.5f, s2.v.m6972getWidthimpl(this.f91404e) - 0.5f, s2.v.m6971getHeightimpl(this.f91404e) - 0.5f), paint);
    }

    public final Object k(c2 c2Var) {
        if (c2Var != null) {
            return ((x1.p1) c2Var.getModifier()).modifyParentData(getMeasureScope(), k((c2) c2Var.getNext()));
        }
        u0 wrapped$ui_release = getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            return wrapped$ui_release.getParentData();
        }
        return null;
    }

    public final void l(o0 o0Var, v0 v0Var, long j10, s sVar, boolean z10, boolean z11, float f10) {
        if (o0Var == null) {
            mo8085hitTestChildYqVAtuI(v0Var, j10, sVar, z10, z11);
        } else {
            sVar.hitInMinimumTouchTarget(v0Var.contentFrom(o0Var), f10, z11, new x0(this, o0Var, v0Var, j10, sVar, z10, z11, f10));
        }
    }

    @Override // x1.d0
    public i1.j localBoundingBoxOf(x1.d0 sourceCoordinates, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        u0 u0Var = (u0) sourceCoordinates;
        u0 u0VarFindCommonAncestor$ui_release = findCommonAncestor$ui_release(u0Var);
        i1.e eVar = this.f97418t;
        if (eVar == null) {
            eVar = new i1.e(0.0f, 0.0f, 0.0f, 0.0f);
            this.f97418t = eVar;
        }
        i1.e eVar2 = eVar;
        eVar2.setLeft(0.0f);
        eVar2.setTop(0.0f);
        eVar2.setRight(s2.v.m6972getWidthimpl(sourceCoordinates.mo7827getSizeYbymL2g()));
        eVar2.setBottom(s2.v.m6971getHeightimpl(sourceCoordinates.mo7827getSizeYbymL2g()));
        u0 u0Var2 = u0Var;
        while (u0Var2 != u0VarFindCommonAncestor$ui_release) {
            boolean z11 = z10;
            rectInParent$ui_release$default(u0Var2, eVar2, z11, false, 4, null);
            if (eVar2.isEmpty()) {
                return i1.j.f59349e.getZero();
            }
            u0Var2 = u0Var2.f97406h;
            kotlin.jvm.internal.e0.checkNotNull(u0Var2);
            z10 = z11;
        }
        f(u0VarFindCommonAncestor$ui_release, eVar2, z10);
        return i1.f.toRect(eVar2);
    }

    @Override // x1.d0
    /* renamed from: localPositionOf-R5De75A */
    public long mo7828localPositionOfR5De75A(x1.d0 sourceCoordinates, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        u0 u0Var = (u0) sourceCoordinates;
        u0 u0VarFindCommonAncestor$ui_release = findCommonAncestor$ui_release(u0Var);
        while (u0Var != u0VarFindCommonAncestor$ui_release) {
            j10 = u0Var.m8096toParentPositionMKHz9U(j10);
            u0Var = u0Var.f97406h;
            kotlin.jvm.internal.e0.checkNotNull(u0Var);
        }
        return g(u0VarFindCommonAncestor$ui_release, j10);
    }

    @Override // x1.d0
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo7829localToRootMKHz9U(long j10) {
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        for (u0 u0Var = this; u0Var != null; u0Var = u0Var.f97406h) {
            j10 = u0Var.m8096toParentPositionMKHz9U(j10);
        }
        return j10;
    }

    @Override // x1.d0
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo7830localToWindowMKHz9U(long j10) {
        return p0.requireOwner(this.f97405g).mo55calculatePositionInWindowMKHz9U(mo7829localToRootMKHz9U(j10));
    }

    public final void m(o0 o0Var, v0 v0Var, long j10, s sVar, boolean z10, boolean z11, float f10) {
        if (o0Var == null) {
            mo8085hitTestChildYqVAtuI(v0Var, j10, sVar, z10, z11);
        } else if (v0Var.interceptOutOfBoundsChildEvents(o0Var)) {
            sVar.speculativeHit(v0Var.contentFrom(o0Var), f10, z11, new a1(this, o0Var, v0Var, j10, sVar, z10, z11, f10));
        } else {
            m(o0Var.getNext(), v0Var, j10, sVar, z10, z11, f10);
        }
    }

    public abstract /* synthetic */ int maxIntrinsicHeight(int i10);

    public abstract /* synthetic */ int maxIntrinsicWidth(int i10);

    /* renamed from: measure-BRTryo0 */
    public abstract /* synthetic */ x1.q1 mo7826measureBRTryo0(long j10);

    public abstract /* synthetic */ int minIntrinsicHeight(int i10);

    public abstract /* synthetic */ int minIntrinsicWidth(int i10);

    public final void n() {
        j1.a2 a2Var;
        b0 b0Var;
        p1 p1Var = this.f97422x;
        j1.a2 a2Var2 = B;
        b0 b0Var2 = this.f97405g;
        if (p1Var != null) {
            kv.l lVar = this.f97408j;
            if (lVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            a2Var2.reset();
            a2Var2.setGraphicsDensity$ui_release(b0Var2.getDensity());
            p0.requireOwner(b0Var2).getSnapshotObserver().observeReads$ui_release(this, f97404z, new b1(lVar));
            b0Var = b0Var2;
            a2Var = a2Var2;
            p1Var.mo43updateLayerPropertiesNHXXZp8(a2Var2.getScaleX(), a2Var2.getScaleY(), a2Var2.getAlpha(), a2Var2.getTranslationX(), a2Var2.getTranslationY(), a2Var2.getShadowElevation(), a2Var2.getRotationX(), a2Var2.getRotationY(), a2Var2.getRotationZ(), a2Var2.getCameraDistance(), a2Var2.mo4663getTransformOriginSzJe1aQ(), a2Var2.getShape(), a2Var2.getClip(), a2Var2.getRenderEffect(), a2Var2.mo4661getAmbientShadowColor0d7_KjU(), a2Var2.mo4662getSpotShadowColor0d7_KjU(), b0Var.getLayoutDirection(), b0Var.getDensity());
            this.f97407i = a2Var.getClip();
        } else {
            a2Var = a2Var2;
            b0Var = b0Var2;
            if (this.f97408j != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        this.f97411m = a2Var.getAlpha();
        s1 owner$ui_release = b0Var.getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(b0Var);
        }
    }

    public void onInitialize() {
        p1 p1Var = this.f97422x;
        if (p1Var != null) {
            p1Var.invalidate();
        }
    }

    public final void onLayerBlockUpdated(kv.l lVar) {
        s1 owner$ui_release;
        kv.l lVar2 = this.f97408j;
        b0 b0Var = this.f97405g;
        boolean z10 = (lVar2 == lVar && kotlin.jvm.internal.e0.areEqual(this.f97409k, b0Var.getDensity()) && this.f97410l == b0Var.getLayoutDirection()) ? false : true;
        this.f97408j = lVar;
        this.f97409k = b0Var.getDensity();
        this.f97410l = b0Var.getLayoutDirection();
        boolean zIsAttached = isAttached();
        y0 y0Var = this.f97420v;
        if (!zIsAttached || lVar == null) {
            p1 p1Var = this.f97422x;
            if (p1Var != null) {
                p1Var.destroy();
                b0Var.setInnerLayerWrapperIsDirty$ui_release(true);
                y0Var.invoke();
                if (isAttached() && (owner$ui_release = b0Var.getOwner$ui_release()) != null) {
                    owner$ui_release.onLayoutChange(b0Var);
                }
            }
            this.f97422x = null;
            this.f97421w = false;
            return;
        }
        if (this.f97422x != null) {
            if (z10) {
                n();
                return;
            }
            return;
        }
        p1 p1VarCreateLayer = p0.requireOwner(b0Var).createLayer(this, y0Var);
        p1VarCreateLayer.mo42resizeozmzZPI(this.f91404e);
        p1VarCreateLayer.mo41movegyyYBs(this.f97415q);
        this.f97422x = p1VarCreateLayer;
        n();
        b0Var.setInnerLayerWrapperIsDirty$ui_release(true);
        y0Var.invoke();
    }

    public final void onMeasured() {
        p pVar = r.f97382b;
        int iM8059getRemeasureEntityTypeEEbPh1w = pVar.m8059getRemeasureEntityTypeEEbPh1w();
        o0[] o0VarArr = this.f97419u;
        if (r.m8080has0OSVbXo(o0VarArr, iM8059getRemeasureEntityTypeEEbPh1w)) {
            b1.m mVarCreateNonObservableSnapshot = b1.m.f8651e.createNonObservableSnapshot();
            try {
                b1.m mVarMakeCurrent = mVarCreateNonObservableSnapshot.makeCurrent();
                try {
                    for (o0 next = o0VarArr[pVar.m8059getRemeasureEntityTypeEEbPh1w()]; next != null; next = next.getNext()) {
                        ((x1.m1) ((c2) next).getModifier()).mo3761onRemeasuredozmzZPI(this.f91404e);
                    }
                } finally {
                    mVarCreateNonObservableSnapshot.restoreCurrent(mVarMakeCurrent);
                }
            } finally {
                mVarCreateNonObservableSnapshot.dispose();
            }
        }
    }

    public void onModifierChanged() {
        p1 p1Var = this.f97422x;
        if (p1Var != null) {
            p1Var.invalidate();
        }
    }

    public final void onPlaced() {
        for (o0 next = this.f97419u[r.f97382b.m8056getOnPlacedEntityTypeEEbPh1w()]; next != null; next = next.getNext()) {
            ((x1.l1) ((c2) next).getModifier()).onPlaced(this);
        }
    }

    public void performDraw(j1.e0 canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        u0 wrapped$ui_release = getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.draw(canvas);
        }
    }

    public Object propagateRelocationRequest(i1.j jVar, zu.d<? super tu.x0> dVar) {
        Object objPropagateRelocationRequest;
        u0 u0Var = this.f97406h;
        return (u0Var != null && (objPropagateRelocationRequest = u0Var.propagateRelocationRequest(jVar.m4216translatek4lQ0M(u0Var.localBoundingBoxOf(this, false).m4214getTopLeftF1C5BW0()), dVar)) == av.e.getCOROUTINE_SUSPENDED()) ? objPropagateRelocationRequest : tu.x0.f87415a;
    }

    public final void rectInParent$ui_release(i1.e bounds, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bounds, "bounds");
        p1 p1Var = this.f97422x;
        if (p1Var != null) {
            if (this.f97407i) {
                if (z11) {
                    long jM8093getMinimumTouchTargetSizeNHjbRc = m8093getMinimumTouchTargetSizeNHjbRc();
                    float fM4252getWidthimpl = i1.o.m4252getWidthimpl(jM8093getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float fM4249getHeightimpl = i1.o.m4249getHeightimpl(jM8093getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-fM4252getWidthimpl, -fM4249getHeightimpl, s2.v.m6972getWidthimpl(mo7827getSizeYbymL2g()) + fM4252getWidthimpl, s2.v.m6971getHeightimpl(mo7827getSizeYbymL2g()) + fM4249getHeightimpl);
                } else if (z10) {
                    bounds.intersect(0.0f, 0.0f, s2.v.m6972getWidthimpl(mo7827getSizeYbymL2g()), s2.v.m6971getHeightimpl(mo7827getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            p1Var.mapBounds(bounds, false);
        }
        float fM6930getXimpl = s2.q.m6930getXimpl(this.f97415q);
        bounds.setLeft(bounds.getLeft() + fM6930getXimpl);
        bounds.setRight(bounds.getRight() + fM6930getXimpl);
        float fM6931getYimpl = s2.q.m6931getYimpl(this.f97415q);
        bounds.setTop(bounds.getTop() + fM6931getYimpl);
        bounds.setBottom(bounds.getBottom() + fM6931getYimpl);
    }

    public final void setMeasureResult$ui_release(x1.y0 value) {
        b0 parent$ui_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        x1.y0 y0Var = this.f97413o;
        if (value != y0Var) {
            this.f97413o = value;
            b0 b0Var = this.f97405g;
            if (y0Var == null || value.getWidth() != y0Var.getWidth() || value.getHeight() != y0Var.getHeight()) {
                int width = value.getWidth();
                int height = value.getHeight();
                p1 p1Var = this.f97422x;
                if (p1Var != null) {
                    p1Var.mo42resizeozmzZPI(s2.w.IntSize(width, height));
                } else {
                    u0 u0Var = this.f97406h;
                    if (u0Var != null) {
                        u0Var.invalidateLayer();
                    }
                }
                s1 owner$ui_release = b0Var.getOwner$ui_release();
                if (owner$ui_release != null) {
                    owner$ui_release.onLayoutChange(b0Var);
                }
                e(s2.w.IntSize(width, height));
                for (o0 next = this.f97419u[r.f97382b.m8055getDrawEntityTypeEEbPh1w()]; next != null; next = next.getNext()) {
                    ((m) next).onMeasureResultChanged();
                }
            }
            LinkedHashMap linkedHashMap = this.f97414p;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && value.getAlignmentLines().isEmpty()) || kotlin.jvm.internal.e0.areEqual(value.getAlignmentLines(), this.f97414p)) {
                return;
            }
            u0 wrapped$ui_release = getWrapped$ui_release();
            if (kotlin.jvm.internal.e0.areEqual(wrapped$ui_release != null ? wrapped$ui_release.f97405g : null, b0Var)) {
                b0 parent$ui_release2 = b0Var.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    parent$ui_release2.onAlignmentsChanged$ui_release();
                }
                if (b0Var.getAlignmentLines$ui_release().getUsedDuringParentMeasurement$ui_release()) {
                    b0 parent$ui_release3 = b0Var.getParent$ui_release();
                    if (parent$ui_release3 != null) {
                        b0.requestRemeasure$ui_release$default(parent$ui_release3, false, 1, null);
                    }
                } else if (b0Var.getAlignmentLines$ui_release().getUsedDuringParentLayout$ui_release() && (parent$ui_release = b0Var.getParent$ui_release()) != null) {
                    b0.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            } else {
                b0Var.onAlignmentsChanged$ui_release();
            }
            b0Var.getAlignmentLines$ui_release().setDirty$ui_release(true);
            LinkedHashMap linkedHashMap2 = this.f97414p;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f97414p = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(value.getAlignmentLines());
        }
    }

    public final void setShallowPlacing(boolean z10) {
        this.f97417s = z10;
    }

    public final void setWrappedBy$ui_release(u0 u0Var) {
        this.f97406h = u0Var;
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        u0 wrapped$ui_release;
        z1 z1Var = (z1) r.m8082head0OSVbXo(this.f97419u, r.f97382b.m8058getPointerInputEntityTypeEEbPh1w());
        return (z1Var != null && z1Var.shouldSharePointerInputWithSiblings()) || ((wrapped$ui_release = getWrapped$ui_release()) != null && wrapped$ui_release.shouldSharePointerInputWithSiblings());
    }

    /* renamed from: toParentPosition-MK-Hz9U, reason: not valid java name */
    public long m8096toParentPositionMKHz9U(long j10) {
        p1 p1Var = this.f97422x;
        if (p1Var != null) {
            j10 = p1Var.mo40mapOffset8S9VItk(j10, false);
        }
        return s2.r.m6943plusNvtHpc(j10, this.f97415q);
    }

    public final i1.j touchBoundsInRoot() {
        if (!isAttached()) {
            return i1.j.f59349e.getZero();
        }
        x1.d0 d0VarFindRoot = x1.e0.findRoot(this);
        i1.e eVar = this.f97418t;
        if (eVar == null) {
            eVar = new i1.e(0.0f, 0.0f, 0.0f, 0.0f);
            this.f97418t = eVar;
        }
        long jH = h(m8093getMinimumTouchTargetSizeNHjbRc());
        eVar.setLeft(-i1.o.m4252getWidthimpl(jH));
        eVar.setTop(-i1.o.m4249getHeightimpl(jH));
        eVar.setRight(i1.o.m4252getWidthimpl(jH) + getMeasuredWidth());
        eVar.setBottom(i1.o.m4249getHeightimpl(jH) + getMeasuredHeight());
        u0 u0Var = this;
        while (u0Var != d0VarFindRoot) {
            u0Var.rectInParent$ui_release(eVar, false, true);
            if (eVar.isEmpty()) {
                return i1.j.f59349e.getZero();
            }
            u0Var = u0Var.f97406h;
            kotlin.jvm.internal.e0.checkNotNull(u0Var);
        }
        return i1.f.toRect(eVar);
    }

    @Override // x1.d0
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo7831windowToLocalMKHz9U(long j10) {
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        x1.d0 d0VarFindRoot = x1.e0.findRoot(this);
        return mo7828localPositionOfR5De75A(d0VarFindRoot, i1.h.m4189minusMKHz9U(p0.requireOwner(this.f97405g).mo54calculateLocalPositionMKHz9U(j10), x1.e0.positionInRoot(d0VarFindRoot)));
    }

    public void invoke(j1.e0 canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        b0 b0Var = this.f97405g;
        if (!b0Var.isPlaced()) {
            this.f97421w = true;
            return;
        }
        p0.requireOwner(b0Var).getSnapshotObserver().observeReads$ui_release(this, A, new z0(this, canvas));
        this.f97421w = false;
    }
}
