package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final long f73807a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f73808b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.a f73809c;

    public p(long j10, kv.a coordinatesCallback, kv.a layoutResultCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(coordinatesCallback, "coordinatesCallback");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutResultCallback, "layoutResultCallback");
        this.f73807a = j10;
        this.f73808b = coordinatesCallback;
        this.f73809c = layoutResultCallback;
    }

    @Override // m0.r
    public i1.j getBoundingBox(int i10) {
        g2.x1 x1Var = (g2.x1) this.f73809c.invoke();
        if (x1Var == null) {
            return i1.j.f59349e.getZero();
        }
        int length = x1Var.getLayoutInput().getText().length();
        return length < 1 ? i1.j.f59349e.getZero() : x1Var.getBoundingBox(qv.v.coerceIn(i10, 0, length - 1));
    }

    @Override // m0.r
    /* renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo5551getHandlePositiondBAh8RU(s selection, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(selection, "selection");
        if ((z10 && selection.getStart().getSelectableId() != getSelectableId()) || (!z10 && selection.getEnd().getSelectableId() != getSelectableId())) {
            return i1.h.f59344b.m4173getZeroF1C5BW0();
        }
        if (getLayoutCoordinates() == null) {
            return i1.h.f59344b.m4173getZeroF1C5BW0();
        }
        g2.x1 x1Var = (g2.x1) this.f73809c.invoke();
        if (x1Var == null) {
            return i1.h.f59344b.m4173getZeroF1C5BW0();
        }
        return v2.getSelectionHandleCoordinates(x1Var, (z10 ? selection.getStart() : selection.getEnd()).getOffset(), z10, selection.getHandlesCrossed());
    }

    @Override // m0.r
    public x1.d0 getLayoutCoordinates() {
        x1.d0 d0Var = (x1.d0) this.f73808b.invoke();
        if (d0Var == null || !d0Var.isAttached()) {
            return null;
        }
        return d0Var;
    }

    @Override // m0.r
    /* renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo5552getRangeOfLineContainingjx7JFs(int i10) {
        g2.x1 x1Var = (g2.x1) this.f73809c.invoke();
        if (x1Var == null) {
            return g2.a2.f56706b.m4051getZerod9O1mEE();
        }
        int length = x1Var.getLayoutInput().getText().length();
        if (length < 1) {
            return g2.a2.f56706b.m4051getZerod9O1mEE();
        }
        int lineForOffset = x1Var.getLineForOffset(qv.v.coerceIn(i10, 0, length - 1));
        return g2.b2.TextRange(x1Var.getLineStart(lineForOffset), x1Var.getLineEnd(lineForOffset, true));
    }

    @Override // m0.r
    public s getSelectAllSelection() {
        g2.x1 x1Var = (g2.x1) this.f73809c.invoke();
        if (x1Var == null) {
            return null;
        }
        return q.a(g2.b2.TextRange(0, x1Var.getLayoutInput().getText().length()), false, getSelectableId(), x1Var);
    }

    @Override // m0.r
    public long getSelectableId() {
        return this.f73807a;
    }

    @Override // m0.r
    public g2.b getText() {
        g2.x1 x1Var = (g2.x1) this.f73809c.invoke();
        return x1Var == null ? new g2.b("", null, null, 6, null) : x1Var.getLayoutInput().getText();
    }

    @Override // m0.r
    /* renamed from: updateSelection-qCDeeow, reason: not valid java name */
    public tu.v mo5553updateSelectionqCDeeow(long j10, long j11, i1.h hVar, boolean z10, x1.d0 containerLayoutCoordinates, b0 adjustment, s sVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(containerLayoutCoordinates, "containerLayoutCoordinates");
        kotlin.jvm.internal.e0.checkNotNullParameter(adjustment, "adjustment");
        if (sVar != null && (getSelectableId() != sVar.getStart().getSelectableId() || getSelectableId() != sVar.getEnd().getSelectableId())) {
            throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.");
        }
        x1.d0 layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return new tu.v(null, Boolean.FALSE);
        }
        g2.x1 x1Var = (g2.x1) this.f73809c.invoke();
        if (x1Var == null) {
            return new tu.v(null, Boolean.FALSE);
        }
        long jMo7828localPositionOfR5De75A = containerLayoutCoordinates.mo7828localPositionOfR5De75A(layoutCoordinates, i1.h.f59344b.m4173getZeroF1C5BW0());
        return q.m5558getTextSelectionInfoyM0VcXU(x1Var, i1.h.m4189minusMKHz9U(j10, jMo7828localPositionOfR5De75A), i1.h.m4189minusMKHz9U(j11, jMo7828localPositionOfR5De75A), hVar != null ? i1.h.m4174boximpl(i1.h.m4189minusMKHz9U(hVar.m4195unboximpl(), jMo7828localPositionOfR5De75A)) : null, getSelectableId(), adjustment, sVar, z10);
    }
}
