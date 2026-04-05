package m0;

import a2.u4;
import a2.w4;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final l0.q1 f73739a;

    /* renamed from: b, reason: collision with root package name */
    public m2.z f73740b;

    /* renamed from: c, reason: collision with root package name */
    public kv.l f73741c;

    /* renamed from: d, reason: collision with root package name */
    public l0.i1 f73742d;

    /* renamed from: e, reason: collision with root package name */
    public final p0.j2 f73743e;

    /* renamed from: f, reason: collision with root package name */
    public m2.z0 f73744f;

    /* renamed from: g, reason: collision with root package name */
    public a2.d2 f73745g;

    /* renamed from: h, reason: collision with root package name */
    public u4 f73746h;

    /* renamed from: i, reason: collision with root package name */
    public p1.a f73747i;

    /* renamed from: j, reason: collision with root package name */
    public h1.o0 f73748j;

    /* renamed from: k, reason: collision with root package name */
    public final p0.j2 f73749k;

    /* renamed from: l, reason: collision with root package name */
    public long f73750l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f73751m;

    /* renamed from: n, reason: collision with root package name */
    public long f73752n;

    /* renamed from: o, reason: collision with root package name */
    public final p0.j2 f73753o;

    /* renamed from: p, reason: collision with root package name */
    public final p0.j2 f73754p;

    /* renamed from: q, reason: collision with root package name */
    public m2.j0 f73755q;

    /* renamed from: r, reason: collision with root package name */
    public final g2 f73756r;

    /* renamed from: s, reason: collision with root package name */
    public final a2 f73757s;

    /* JADX WARN: Multi-variable type inference failed */
    public h2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static m2.j0 a(g2.b bVar, long j10) {
        return new m2.j0(bVar, j10, (g2.a2) null, 4, (kotlin.jvm.internal.u) null);
    }

    /* renamed from: access$createTextFieldValue-FDrldGo, reason: not valid java name */
    public static final /* synthetic */ m2.j0 m5525access$createTextFieldValueFDrldGo(h2 h2Var, g2.b bVar, long j10) {
        h2Var.getClass();
        return a(bVar, j10);
    }

    public static /* synthetic */ void copy$foundation_release$default(h2 h2Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        h2Var.copy$foundation_release(z10);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m5527deselect_kEHs6E$foundation_release$default(h2 h2Var, i1.h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = null;
        }
        h2Var.m5529deselect_kEHs6E$foundation_release(hVar);
    }

    public final void b(l0.r rVar) {
        l0.i1 i1Var = this.f73742d;
        if (i1Var != null) {
            i1Var.setHandleState(rVar);
        }
    }

    public final void c(m2.j0 j0Var, int i10, int i11, boolean z10, b0 b0Var) {
        l0.k1 layoutResult;
        long jTextRange = g2.b2.TextRange(((m2.x) this.f73740b).originalToTransformed(g2.a2.m3960getStartimpl(j0Var.m5591getSelectiond9O1mEE())), ((m2.x) this.f73740b).originalToTransformed(g2.a2.m3955getEndimpl(j0Var.m5591getSelectiond9O1mEE())));
        l0.i1 i1Var = this.f73742d;
        long jM5573getTextFieldSelectionbb3KNj8 = x1.m5573getTextFieldSelectionbb3KNj8((i1Var == null || (layoutResult = i1Var.getLayoutResult()) == null) ? null : layoutResult.getValue(), i10, i11, g2.a2.m3954getCollapsedimpl(jTextRange) ? null : g2.a2.m3948boximpl(jTextRange), z10, b0Var);
        long jTextRange2 = g2.b2.TextRange(((m2.x) this.f73740b).transformedToOriginal(g2.a2.m3960getStartimpl(jM5573getTextFieldSelectionbb3KNj8)), ((m2.x) this.f73740b).transformedToOriginal(g2.a2.m3955getEndimpl(jM5573getTextFieldSelectionbb3KNj8)));
        if (g2.a2.m3953equalsimpl0(jTextRange2, j0Var.m5591getSelectiond9O1mEE())) {
            return;
        }
        p1.a aVar = this.f73747i;
        if (aVar != null) {
            aVar.mo5860performHapticFeedbackCdsT49E(p1.c.f80664b.m5862getTextHandleMove5zf0vsI());
        }
        this.f73741c.invoke(a(j0Var.getAnnotatedString(), jTextRange2));
        l0.i1 i1Var2 = this.f73742d;
        if (i1Var2 != null) {
            i1Var2.setShowSelectionHandleStart(l2.isSelectionHandleInVisibleBound(this, true));
        }
        l0.i1 i1Var3 = this.f73742d;
        if (i1Var3 == null) {
            return;
        }
        i1Var3.setShowSelectionHandleEnd(l2.isSelectionHandleInVisibleBound(this, false));
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m5528contextMenuOpenAdjustmentk4lQ0M(long j10) {
        l0.k1 layoutResult;
        l0.i1 i1Var = this.f73742d;
        if (i1Var == null || (layoutResult = i1Var.getLayoutResult()) == null) {
            return;
        }
        int iM5266getOffsetForPosition3MmeM6k$default = l0.k1.m5266getOffsetForPosition3MmeM6k$default(layoutResult, j10, false, 2, null);
        if (g2.a2.m3951containsimpl(getValue$foundation_release().m5591getSelectiond9O1mEE(), iM5266getOffsetForPosition3MmeM6k$default)) {
            return;
        }
        c(getValue$foundation_release(), iM5266getOffsetForPosition3MmeM6k$default, iM5266getOffsetForPosition3MmeM6k$default, false, a0.f73656a.getWord());
    }

    public final void copy$foundation_release(boolean z10) {
        if (g2.a2.m3954getCollapsedimpl(getValue$foundation_release().m5591getSelectiond9O1mEE())) {
            return;
        }
        a2.d2 d2Var = this.f73745g;
        if (d2Var != null) {
            d2Var.setText(m2.k0.getSelectedText(getValue$foundation_release()));
        }
        if (z10) {
            int iM3957getMaximpl = g2.a2.m3957getMaximpl(getValue$foundation_release().m5591getSelectiond9O1mEE());
            this.f73741c.invoke(a(getValue$foundation_release().getAnnotatedString(), g2.b2.TextRange(iM3957getMaximpl, iM3957getMaximpl)));
            b(l0.r.f72161b);
        }
    }

    public final l0.z0 cursorDragObserver$foundation_release() {
        return new y1(this);
    }

    public final void cut$foundation_release() {
        if (g2.a2.m3954getCollapsedimpl(getValue$foundation_release().m5591getSelectiond9O1mEE())) {
            return;
        }
        a2.d2 d2Var = this.f73745g;
        if (d2Var != null) {
            d2Var.setText(m2.k0.getSelectedText(getValue$foundation_release()));
        }
        g2.b bVarPlus = m2.k0.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(m2.k0.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int iM3958getMinimpl = g2.a2.m3958getMinimpl(getValue$foundation_release().m5591getSelectiond9O1mEE());
        this.f73741c.invoke(a(bVarPlus, g2.b2.TextRange(iM3958getMinimpl, iM3958getMinimpl)));
        b(l0.r.f72161b);
        l0.q1 q1Var = this.f73739a;
        if (q1Var != null) {
            q1Var.forceNextSnapshot();
        }
    }

    /* renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m5529deselect_kEHs6E$foundation_release(i1.h hVar) {
        if (!g2.a2.m3954getCollapsedimpl(getValue$foundation_release().m5591getSelectiond9O1mEE())) {
            l0.i1 i1Var = this.f73742d;
            l0.k1 layoutResult = i1Var != null ? i1Var.getLayoutResult() : null;
            this.f73741c.invoke(m2.j0.m5586copy3r_uNRQ$default(getValue$foundation_release(), (g2.b) null, g2.b2.TextRange((hVar == null || layoutResult == null) ? g2.a2.m3957getMaximpl(getValue$foundation_release().m5591getSelectiond9O1mEE()) : ((m2.x) this.f73740b).transformedToOriginal(l0.k1.m5266getOffsetForPosition3MmeM6k$default(layoutResult, hVar.m4195unboximpl(), false, 2, null))), (g2.a2) null, 5, (Object) null));
        }
        b((hVar == null || getValue$foundation_release().getText().length() <= 0) ? l0.r.f72161b : l0.r.f72163e);
        hideSelectionToolbar$foundation_release();
    }

    public final void enterSelectionMode$foundation_release() {
        h1.o0 o0Var;
        l0.i1 i1Var = this.f73742d;
        if (i1Var != null && !i1Var.getHasFocus() && (o0Var = this.f73748j) != null) {
            o0Var.requestFocus();
        }
        this.f73755q = getValue$foundation_release();
        l0.i1 i1Var2 = this.f73742d;
        if (i1Var2 != null) {
            i1Var2.setShowFloatingToolbar(true);
        }
        b(l0.r.f72162c);
    }

    public final void exitSelectionMode$foundation_release() {
        l0.i1 i1Var = this.f73742d;
        if (i1Var != null) {
            i1Var.setShowFloatingToolbar(false);
        }
        b(l0.r.f72161b);
    }

    public final a2.d2 getClipboardManager$foundation_release() {
        return this.f73745g;
    }

    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final i1.h m5530getCurrentDragPosition_m7T9E() {
        return (i1.h) this.f73754p.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m5531getCursorPositiontuRUvjQ$foundation_release(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        int iOriginalToTransformed = ((m2.x) this.f73740b).originalToTransformed(g2.a2.m3960getStartimpl(getValue$foundation_release().m5591getSelectiond9O1mEE()));
        l0.i1 i1Var = this.f73742d;
        l0.k1 layoutResult = i1Var != null ? i1Var.getLayoutResult() : null;
        kotlin.jvm.internal.e0.checkNotNull(layoutResult);
        g2.x1 value = layoutResult.getValue();
        i1.j cursorRect = value.getCursorRect(qv.v.coerceIn(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return i1.i.Offset((density.mo3425toPx0680j_4(l0.e1.getDefaultCursorThickness()) / 2) + cursorRect.getLeft(), cursorRect.getBottom());
    }

    public final l0.q getDraggingHandle() {
        return (l0.q) this.f73753o.getValue();
    }

    public final boolean getEditable() {
        return ((Boolean) this.f73749k.getValue()).booleanValue();
    }

    public final h1.o0 getFocusRequester() {
        return this.f73748j;
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m5532getHandlePositiontuRUvjQ$foundation_release(boolean z10) {
        long jM5591getSelectiond9O1mEE = getValue$foundation_release().m5591getSelectiond9O1mEE();
        int iM3960getStartimpl = z10 ? g2.a2.m3960getStartimpl(jM5591getSelectiond9O1mEE) : g2.a2.m3955getEndimpl(jM5591getSelectiond9O1mEE);
        l0.i1 i1Var = this.f73742d;
        l0.k1 layoutResult = i1Var != null ? i1Var.getLayoutResult() : null;
        kotlin.jvm.internal.e0.checkNotNull(layoutResult);
        return v2.getSelectionHandleCoordinates(layoutResult.getValue(), ((m2.x) this.f73740b).originalToTransformed(iM3960getStartimpl), z10, g2.a2.m3959getReversedimpl(getValue$foundation_release().m5591getSelectiond9O1mEE()));
    }

    public final p1.a getHapticFeedBack() {
        return this.f73747i;
    }

    public final o getMouseSelectionObserver$foundation_release() {
        return this.f73757s;
    }

    public final m2.z getOffsetMapping$foundation_release() {
        return this.f73740b;
    }

    public final kv.l getOnValueChange$foundation_release() {
        return this.f73741c;
    }

    public final l0.i1 getState$foundation_release() {
        return this.f73742d;
    }

    public final u4 getTextToolbar() {
        return this.f73746h;
    }

    public final l0.z0 getTouchSelectionObserver$foundation_release() {
        return this.f73756r;
    }

    public final l0.q1 getUndoManager() {
        return this.f73739a;
    }

    public final m2.j0 getValue$foundation_release() {
        return (m2.j0) this.f73743e.getValue();
    }

    public final m2.z0 getVisualTransformation$foundation_release() {
        return this.f73744f;
    }

    public final l0.z0 handleDragObserver$foundation_release(boolean z10) {
        return new z1(this, z10);
    }

    public final void hideSelectionToolbar$foundation_release() {
        u4 u4Var;
        u4 u4Var2 = this.f73746h;
        if ((u4Var2 != null ? u4Var2.getStatus() : null) != w4.f3875b || (u4Var = this.f73746h) == null) {
            return;
        }
        u4Var.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !kotlin.jvm.internal.e0.areEqual(this.f73755q.getText(), getValue$foundation_release().getText());
    }

    public final void paste$foundation_release() {
        g2.b text;
        a2.d2 d2Var = this.f73745g;
        if (d2Var == null || (text = d2Var.getText()) == null) {
            return;
        }
        g2.b bVarPlus = m2.k0.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(m2.k0.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int length = text.length() + g2.a2.m3958getMinimpl(getValue$foundation_release().m5591getSelectiond9O1mEE());
        this.f73741c.invoke(a(bVarPlus, g2.b2.TextRange(length, length)));
        b(l0.r.f72161b);
        l0.q1 q1Var = this.f73739a;
        if (q1Var != null) {
            q1Var.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        m2.j0 j0VarA = a(getValue$foundation_release().getAnnotatedString(), g2.b2.TextRange(0, getValue$foundation_release().getText().length()));
        this.f73741c.invoke(j0VarA);
        this.f73755q = m2.j0.m5586copy3r_uNRQ$default(this.f73755q, (g2.b) null, j0VarA.m5591getSelectiond9O1mEE(), (g2.a2) null, 5, (Object) null);
        l0.i1 i1Var = this.f73742d;
        if (i1Var == null) {
            return;
        }
        i1Var.setShowFloatingToolbar(true);
    }

    public final void setClipboardManager$foundation_release(a2.d2 d2Var) {
        this.f73745g = d2Var;
    }

    public final void setEditable(boolean z10) {
        this.f73749k.setValue(Boolean.valueOf(z10));
    }

    public final void setFocusRequester(h1.o0 o0Var) {
        this.f73748j = o0Var;
    }

    public final void setHapticFeedBack(p1.a aVar) {
        this.f73747i = aVar;
    }

    public final void setOffsetMapping$foundation_release(m2.z zVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<set-?>");
        this.f73740b = zVar;
    }

    public final void setOnValueChange$foundation_release(kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<set-?>");
        this.f73741c = lVar;
    }

    public final void setState$foundation_release(l0.i1 i1Var) {
        this.f73742d = i1Var;
    }

    public final void setTextToolbar(u4 u4Var) {
        this.f73746h = u4Var;
    }

    public final void setValue$foundation_release(m2.j0 j0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(j0Var, "<set-?>");
        this.f73743e.setValue(j0Var);
    }

    public final void setVisualTransformation$foundation_release(m2.z0 z0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(z0Var, "<set-?>");
        this.f73744f = z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showSelectionToolbar$foundation_release() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.h2.showSelectionToolbar$foundation_release():void");
    }

    public h2(l0.q1 q1Var) {
        this.f73739a = q1Var;
        this.f73740b = m2.y.f73998a.getIdentity();
        this.f73741c = b2.f73672e;
        this.f73743e = o5.mutableStateOf$default(new m2.j0((String) null, 0L, (g2.a2) null, 7, (kotlin.jvm.internal.u) null), null, 2, null);
        this.f73744f = m2.y0.f74000a.getNone();
        this.f73749k = o5.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        i1.g gVar = i1.h.f59344b;
        this.f73750l = gVar.m4173getZeroF1C5BW0();
        this.f73752n = gVar.m4173getZeroF1C5BW0();
        this.f73753o = o5.mutableStateOf$default(null, null, 2, null);
        this.f73754p = o5.mutableStateOf$default(null, null, 2, null);
        this.f73755q = new m2.j0((String) null, 0L, (g2.a2) null, 7, (kotlin.jvm.internal.u) null);
        this.f73756r = new g2(this);
        this.f73757s = new a2(this);
    }

    public /* synthetic */ h2(l0.q1 q1Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : q1Var);
    }
}
