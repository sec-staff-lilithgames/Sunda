package z1;

import com.moloco.sdk.BKC.KerkSviMAy;
import p0.j2;
import p0.o5;
import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class f1 extends u0 {
    public static final j1.i1 I;
    public u0 E;
    public x1.o0 F;
    public boolean G;
    public j2 H;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final j1.i1 getModifierBoundsPaint() {
            return f1.I;
        }
    }

    static {
        new a(null);
        j1.i1 i1VarPaint = j1.k.Paint();
        i1VarPaint.mo4772setColor8_81llA(j1.m0.f68918b.m4826getBlue0d7_KjU());
        i1VarPaint.setStrokeWidth(1.0f);
        i1VarPaint.mo4776setStylek9PVt8s(j1.k1.f68904b.m4780getStrokeTiuSbCo());
        I = i1VarPaint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(u0 wrapped, x1.o0 modifier) {
        super(wrapped.getLayoutNode$ui_release());
        kotlin.jvm.internal.e0.checkNotNullParameter(wrapped, "wrapped");
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        this.E = wrapped;
        this.F = modifier;
    }

    @Override // z1.u0, x1.q1
    public final void c(float f10, long j10, kv.l lVar) {
        super.c(f10, j10, lVar);
        u0 wrappedBy$ui_release = getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || !wrappedBy$ui_release.isShallowPlacing()) {
            onPlaced();
            q1.a.C0808a c0808a = q1.a.f91406a;
            int iM6972getWidthimpl = s2.v.m6972getWidthimpl(this.f91404e);
            s2.x layoutDirection = getMeasureScope().getLayoutDirection();
            int iAccess$getParentWidth = q1.a.C0808a.access$getParentWidth(c0808a);
            s2.x xVarAccess$getParentLayoutDirection = q1.a.C0808a.access$getParentLayoutDirection(c0808a);
            q1.a.f91408c = iM6972getWidthimpl;
            q1.a.f91407b = layoutDirection;
            getMeasureResult().placeChildren();
            q1.a.f91408c = iAccess$getParentWidth;
            q1.a.f91407b = xVarAccess$getParentLayoutDirection;
        }
    }

    @Override // z1.u0
    public int calculateAlignmentLine(x1.a alignmentLine) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (getMeasureResult().getAlignmentLines().containsKey(alignmentLine)) {
            Integer num = getMeasureResult().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int i10 = getWrapped$ui_release().get(alignmentLine);
        if (i10 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        setShallowPlacing(true);
        c(getZIndex(), m8094getPositionnOccac(), this.f97408j);
        setShallowPlacing(false);
        return (alignmentLine instanceof x1.x ? s2.q.m6931getYimpl(getWrapped$ui_release().m8094getPositionnOccac()) : s2.q.m6930getXimpl(getWrapped$ui_release().m8094getPositionnOccac())) + i10;
    }

    @Override // z1.u0
    public x1.a1 getMeasureScope() {
        return getWrapped$ui_release().getMeasureScope();
    }

    public final x1.o0 getModifier() {
        return this.F;
    }

    public final boolean getToBeReusedForSameModifier() {
        return this.G;
    }

    @Override // z1.u0
    public u0 getWrapped$ui_release() {
        return this.E;
    }

    @Override // z1.u0, x1.w0, x1.y
    public int maxIntrinsicHeight(int i10) {
        return o().maxIntrinsicHeight(getMeasureScope(), getWrapped$ui_release(), i10);
    }

    @Override // z1.u0, x1.w0, x1.y
    public int maxIntrinsicWidth(int i10) {
        return o().maxIntrinsicWidth(getMeasureScope(), getWrapped$ui_release(), i10);
    }

    @Override // z1.u0, x1.w0
    /* renamed from: measure-BRTryo0 */
    public x1.q1 mo7826measureBRTryo0(long j10) {
        u0.m8089access$setMeasurementConstraintsBRTryo0(this, j10);
        setMeasureResult$ui_release(this.F.mo74measure3p2s80s(getMeasureScope(), getWrapped$ui_release(), j10));
        p1 layer = getLayer();
        if (layer != null) {
            layer.mo42resizeozmzZPI(this.f91404e);
        }
        onMeasured();
        return this;
    }

    @Override // z1.u0, x1.w0, x1.y
    public int minIntrinsicHeight(int i10) {
        return o().minIntrinsicHeight(getMeasureScope(), getWrapped$ui_release(), i10);
    }

    @Override // z1.u0, x1.w0, x1.y
    public int minIntrinsicWidth(int i10) {
        return o().minIntrinsicWidth(getMeasureScope(), getWrapped$ui_release(), i10);
    }

    public final x1.o0 o() {
        j2 j2VarMutableStateOf$default = this.H;
        if (j2VarMutableStateOf$default == null) {
            j2VarMutableStateOf$default = o5.mutableStateOf$default(this.F, null, 2, null);
        }
        this.H = j2VarMutableStateOf$default;
        return (x1.o0) j2VarMutableStateOf$default.getValue();
    }

    @Override // z1.u0
    public void onInitialize() {
        super.onInitialize();
        getWrapped$ui_release().setWrappedBy$ui_release(this);
    }

    @Override // z1.u0
    public void onModifierChanged() {
        super.onModifierChanged();
        j2 j2Var = this.H;
        if (j2Var == null) {
            return;
        }
        j2Var.setValue(this.F);
    }

    @Override // z1.u0
    public void performDraw(j1.e0 canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        getWrapped$ui_release().draw(canvas);
        if (p0.requireOwner(getLayoutNode$ui_release()).getShowLayoutBounds()) {
            j(canvas, I);
        }
    }

    public final void setModifier(x1.o0 o0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(o0Var, "<set-?>");
        this.F = o0Var;
    }

    public final void setToBeReusedForSameModifier(boolean z10) {
        this.G = z10;
    }

    public void setWrapped(u0 u0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u0Var, KerkSviMAy.zzUbuCP);
        this.E = u0Var;
    }
}
