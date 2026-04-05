package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends u0 implements s2.e {
    public static final j1.i1 F;
    public final /* synthetic */ x1.a1 E;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final j1.i1 getInnerBoundsPaint() {
            return u.F;
        }
    }

    static {
        new a(null);
        j1.i1 i1VarPaint = j1.k.Paint();
        i1VarPaint.mo4772setColor8_81llA(j1.m0.f68918b.m4833getRed0d7_KjU());
        i1VarPaint.setStrokeWidth(1.0f);
        i1VarPaint.mo4776setStylek9PVt8s(j1.k1.f68904b.m4780getStrokeTiuSbCo());
        F = i1VarPaint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b0 layoutNode) {
        super(layoutNode);
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        this.E = layoutNode.getMeasureScope$ui_release();
    }

    @Override // z1.u0, x1.q1
    public final void c(float f10, long j10, kv.l lVar) {
        super.c(f10, j10, lVar);
        u0 wrappedBy$ui_release = getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || !wrappedBy$ui_release.isShallowPlacing()) {
            onPlaced();
            getLayoutNode$ui_release().onNodePlaced$ui_release();
        }
    }

    @Override // z1.u0
    public int calculateAlignmentLine(x1.a alignmentLine) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLine, "alignmentLine");
        Integer num = getLayoutNode$ui_release().calculateAlignmentLines$ui_release().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // s2.e
    public float getDensity() {
        return this.E.getDensity();
    }

    @Override // s2.e
    public float getFontScale() {
        return this.E.getFontScale();
    }

    @Override // z1.u0
    public x1.a1 getMeasureScope() {
        return getLayoutNode$ui_release().getMeasureScope$ui_release();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    @Override // z1.u0
    /* renamed from: hitTestChild-YqVAtuI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T extends z1.o0, C, M extends e1.v> void mo8085hitTestChildYqVAtuI(z1.v0 r11, long r12, z1.s r14, boolean r15, boolean r16) {
        /*
            r10 = this;
            java.lang.String r0 = "hitTestSource"
            kotlin.jvm.internal.e0.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "hitTestResult"
            kotlin.jvm.internal.e0.checkNotNullParameter(r14, r0)
            z1.b0 r0 = r10.getLayoutNode$ui_release()
            boolean r0 = r11.shouldHitTestChildren(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L48
            boolean r0 = i1.i.m4196isFinitek4lQ0M(r12)
            if (r0 != 0) goto L1d
            goto L2c
        L1d:
            z1.p1 r0 = r10.f97422x
            if (r0 == 0) goto L45
            boolean r3 = r10.f97407i
            if (r3 == 0) goto L45
            boolean r0 = r0.mo39isInLayerk4lQ0M(r12)
            if (r0 == 0) goto L2c
            goto L45
        L2c:
            if (r15 == 0) goto L48
            long r3 = r10.m8093getMinimumTouchTargetSizeNHjbRc()
            float r0 = r10.i(r12, r3)
            boolean r3 = java.lang.Float.isInfinite(r0)
            if (r3 != 0) goto L48
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L48
            r9 = r2
        L43:
            r2 = r1
            goto L4a
        L45:
            r9 = r16
            goto L43
        L48:
            r9 = r16
        L4a:
            if (r2 == 0) goto L91
            int r0 = z1.s.access$getHitDepth$p(r14)
            z1.b0 r2 = r10.getLayoutNode$ui_release()
            r0.c r2 = r2.getZSortedChildren()
            int r3 = r2.getSize()
            if (r3 <= 0) goto L8e
            int r3 = r3 - r1
            java.lang.Object[] r1 = r2.getContent()
            r2 = r3
        L64:
            r3 = r1[r2]
            r4 = r3
            z1.b0 r4 = (z1.b0) r4
            boolean r3 = r4.isPlaced()
            if (r3 == 0) goto L8a
            r3 = r11
            r5 = r12
            r7 = r14
            r8 = r15
            r3.mo8068childHitTestYqVAtuI(r4, r5, r7, r8, r9)
            boolean r3 = r14.hasHit()
            if (r3 != 0) goto L7d
            goto L8a
        L7d:
            z1.u0 r3 = r4.getOuterLayoutNodeWrapper$ui_release()
            boolean r3 = r3.shouldSharePointerInputWithSiblings()
            if (r3 == 0) goto L8e
            r14.acceptHits()
        L8a:
            int r2 = r2 + (-1)
            if (r2 >= 0) goto L64
        L8e:
            z1.s.access$setHitDepth$p(r14, r0)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.u.mo8085hitTestChildYqVAtuI(z1.v0, long, z1.s, boolean, boolean):void");
    }

    @Override // z1.u0, x1.w0, x1.y
    public int maxIntrinsicHeight(int i10) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().maxIntrinsicHeight(i10);
    }

    @Override // z1.u0, x1.w0, x1.y
    public int maxIntrinsicWidth(int i10) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().maxIntrinsicWidth(i10);
    }

    @Override // z1.u0, x1.w0
    /* renamed from: measure-BRTryo0 */
    public x1.q1 mo7826measureBRTryo0(long j10) {
        u0.m8089access$setMeasurementConstraintsBRTryo0(this, j10);
        r0.c cVar = getLayoutNode$ui_release().get_children$ui_release();
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i10 = 0;
            do {
                ((b0) content[i10]).setMeasuredByParent$ui_release(d0.f97292e);
                i10++;
            } while (i10 < size);
        }
        getLayoutNode$ui_release().handleMeasureResult$ui_release(getLayoutNode$ui_release().getMeasurePolicy().mo79measure3p2s80s(getLayoutNode$ui_release().getMeasureScope$ui_release(), getLayoutNode$ui_release().getChildren$ui_release(), j10));
        onMeasured();
        return this;
    }

    @Override // z1.u0, x1.w0, x1.y
    public int minIntrinsicHeight(int i10) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().minIntrinsicHeight(i10);
    }

    @Override // z1.u0, x1.w0, x1.y
    public int minIntrinsicWidth(int i10) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().minIntrinsicWidth(i10);
    }

    @Override // z1.u0
    public void performDraw(j1.e0 canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        s1 s1VarRequireOwner = p0.requireOwner(getLayoutNode$ui_release());
        r0.c zSortedChildren = getLayoutNode$ui_release().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            Object[] content = zSortedChildren.getContent();
            int i10 = 0;
            do {
                b0 b0Var = (b0) content[i10];
                if (b0Var.isPlaced()) {
                    b0Var.draw$ui_release(canvas);
                }
                i10++;
            } while (i10 < size);
        }
        if (s1VarRequireOwner.getShowLayoutBounds()) {
            j(canvas, F);
        }
    }

    @Override // s2.e
    /* renamed from: roundToPx--R2X_6o */
    public int mo3418roundToPxR2X_6o(long j10) {
        return this.E.mo3418roundToPxR2X_6o(j10);
    }

    @Override // s2.e
    /* renamed from: roundToPx-0680j_4 */
    public int mo3419roundToPx0680j_4(float f10) {
        return this.E.mo3419roundToPx0680j_4(f10);
    }

    @Override // s2.e
    /* renamed from: toDp-GaN1DYA */
    public float mo3420toDpGaN1DYA(long j10) {
        return this.E.mo3420toDpGaN1DYA(j10);
    }

    @Override // s2.e
    /* renamed from: toDp-u2uoSUM */
    public float mo3421toDpu2uoSUM(float f10) {
        return this.E.mo3421toDpu2uoSUM(f10);
    }

    @Override // s2.e
    /* renamed from: toDpSize-k-rfVVM */
    public long mo3423toDpSizekrfVVM(long j10) {
        return this.E.mo3423toDpSizekrfVVM(j10);
    }

    @Override // s2.e
    /* renamed from: toPx--R2X_6o */
    public float mo3424toPxR2X_6o(long j10) {
        return this.E.mo3424toPxR2X_6o(j10);
    }

    @Override // s2.e
    /* renamed from: toPx-0680j_4 */
    public float mo3425toPx0680j_4(float f10) {
        return this.E.mo3425toPx0680j_4(f10);
    }

    @Override // s2.e
    public i1.j toRect(s2.m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        return this.E.toRect(mVar);
    }

    @Override // s2.e
    /* renamed from: toSize-XkaWNTQ */
    public long mo3426toSizeXkaWNTQ(long j10) {
        return this.E.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // s2.e
    /* renamed from: toSp-0xMU5do */
    public long mo3427toSp0xMU5do(float f10) {
        return this.E.mo3427toSp0xMU5do(f10);
    }

    @Override // s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public long mo3428toSpkPz2Gy4(float f10) {
        return this.E.mo3428toSpkPz2Gy4(f10);
    }

    @Override // s2.e
    /* renamed from: toDp-u2uoSUM */
    public float mo3422toDpu2uoSUM(int i10) {
        return this.E.mo3422toDpu2uoSUM(i10);
    }

    @Override // s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public long mo3429toSpkPz2Gy4(int i10) {
        return this.E.mo3429toSpkPz2Gy4(i10);
    }
}
