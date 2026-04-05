package m0;

import a2.u4;
import a2.w4;
import java.util.LinkedHashMap;
import java.util.List;
import m0.s;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f73722a;

    /* renamed from: b, reason: collision with root package name */
    public final p0.j2 f73723b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f73724c;

    /* renamed from: d, reason: collision with root package name */
    public kv.l f73725d;

    /* renamed from: e, reason: collision with root package name */
    public p1.a f73726e;

    /* renamed from: f, reason: collision with root package name */
    public a2.d2 f73727f;

    /* renamed from: g, reason: collision with root package name */
    public u4 f73728g;

    /* renamed from: h, reason: collision with root package name */
    public h1.o0 f73729h;

    /* renamed from: i, reason: collision with root package name */
    public final p0.j2 f73730i;

    /* renamed from: j, reason: collision with root package name */
    public i1.h f73731j;

    /* renamed from: k, reason: collision with root package name */
    public x1.d0 f73732k;

    /* renamed from: l, reason: collision with root package name */
    public final p0.j2 f73733l;

    /* renamed from: m, reason: collision with root package name */
    public final p0.j2 f73734m;

    /* renamed from: n, reason: collision with root package name */
    public final p0.j2 f73735n;

    /* renamed from: o, reason: collision with root package name */
    public final p0.j2 f73736o;

    /* renamed from: p, reason: collision with root package name */
    public final p0.j2 f73737p;

    /* renamed from: q, reason: collision with root package name */
    public final p0.j2 f73738q;

    public h1(u1 selectionRegistrar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(selectionRegistrar, "selectionRegistrar");
        this.f73722a = selectionRegistrar;
        this.f73723b = o5.mutableStateOf$default(null, null, 2, null);
        this.f73724c = true;
        this.f73725d = f1.f73709e;
        this.f73729h = new h1.o0();
        this.f73730i = o5.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        i1.g gVar = i1.h.f59344b;
        this.f73733l = o5.mutableStateOf$default(i1.h.m4174boximpl(gVar.m4173getZeroF1C5BW0()), null, 2, null);
        this.f73734m = o5.mutableStateOf$default(i1.h.m4174boximpl(gVar.m4173getZeroF1C5BW0()), null, 2, null);
        this.f73735n = o5.mutableStateOf$default(null, null, 2, null);
        this.f73736o = o5.mutableStateOf$default(null, null, 2, null);
        this.f73737p = o5.mutableStateOf$default(null, null, 2, null);
        this.f73738q = o5.mutableStateOf$default(null, null, 2, null);
        selectionRegistrar.setOnPositionChangeCallback$foundation_release(new o0(this));
        selectionRegistrar.setOnSelectionUpdateStartCallback$foundation_release(new p0(this));
        selectionRegistrar.setOnSelectionUpdateSelectAll$foundation_release(new q0(this));
        selectionRegistrar.setOnSelectionUpdateCallback$foundation_release(new r0(this));
        selectionRegistrar.setOnSelectionUpdateEndCallback$foundation_release(new s0(this));
        selectionRegistrar.setOnSelectableChangeCallback$foundation_release(new t0(this));
        selectionRegistrar.setAfterSelectableUnsubscribe$foundation_release(new u0(this));
    }

    /* renamed from: access$convertToContainerCoordinates-Q7Q5hAU, reason: not valid java name */
    public static final i1.h m5510access$convertToContainerCoordinatesQ7Q5hAU(h1 h1Var, x1.d0 d0Var, long j10) {
        x1.d0 d0Var2 = h1Var.f73732k;
        if (d0Var2 == null || !d0Var2.isAttached()) {
            return null;
        }
        return i1.h.m4174boximpl(h1Var.requireContainerCoordinates$foundation_release().mo7828localPositionOfR5De75A(d0Var, j10));
    }

    public static final Object access$detectNonConsumingTap(h1 h1Var, u1.k0 k0Var, kv.l lVar, zu.d dVar) {
        h1Var.getClass();
        Object objForEachGesture = e0.h2.forEachGesture(k0Var, new x0(lVar, null), dVar);
        return objForEachGesture == av.e.getCOROUTINE_SUSPENDED() ? objForEachGesture : tu.x0.f87415a;
    }

    public static final void access$updateSelectionToolbarPosition(h1 h1Var) {
        if (h1Var.getHasFocus()) {
            u4 u4Var = h1Var.f73728g;
            if ((u4Var != null ? u4Var.getStatus() : null) == w4.f3875b) {
                h1Var.showSelectionToolbar$foundation_release();
            }
        }
    }

    public final void a() {
        s.a end;
        s.a start;
        s selection = getSelection();
        x1.d0 d0Var = this.f73732k;
        r anchorSelectable$foundation_release = (selection == null || (start = selection.getStart()) == null) ? null : getAnchorSelectable$foundation_release(start);
        r anchorSelectable$foundation_release2 = (selection == null || (end = selection.getEnd()) == null) ? null : getAnchorSelectable$foundation_release(end);
        x1.d0 layoutCoordinates = anchorSelectable$foundation_release != null ? anchorSelectable$foundation_release.getLayoutCoordinates() : null;
        x1.d0 layoutCoordinates2 = anchorSelectable$foundation_release2 != null ? anchorSelectable$foundation_release2.getLayoutCoordinates() : null;
        p0.j2 j2Var = this.f73736o;
        p0.j2 j2Var2 = this.f73735n;
        if (selection == null || d0Var == null || !d0Var.isAttached() || layoutCoordinates == null || layoutCoordinates2 == null) {
            j2Var2.setValue(null);
            j2Var.setValue(null);
            return;
        }
        long jMo7828localPositionOfR5De75A = d0Var.mo7828localPositionOfR5De75A(layoutCoordinates, anchorSelectable$foundation_release.mo5551getHandlePositiondBAh8RU(selection, true));
        long jMo7828localPositionOfR5De75A2 = d0Var.mo7828localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release2.mo5551getHandlePositiondBAh8RU(selection, false));
        i1.j jVarVisibleBounds = j1.visibleBounds(d0Var);
        j2Var2.setValue(j1.m5538containsInclusiveUv8p0NA(jVarVisibleBounds, jMo7828localPositionOfR5De75A) ? i1.h.m4174boximpl(jMo7828localPositionOfR5De75A) : null);
        j2Var.setValue(j1.m5538containsInclusiveUv8p0NA(jVarVisibleBounds, jMo7828localPositionOfR5De75A2) ? i1.h.m4174boximpl(jMo7828localPositionOfR5De75A2) : null);
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m5517contextMenuOpenAdjustmentk4lQ0M(long j10) {
        s selection = getSelection();
        if (selection != null ? g2.a2.m3954getCollapsedimpl(selection.m5565toTextRanged9O1mEE()) : true) {
            m5523updateSelection3R_tFg$foundation_release(j10, j10, null, true, a0.f73656a.getWord());
        }
    }

    public final void copy$foundation_release() {
        a2.d2 d2Var;
        g2.b selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release == null || (d2Var = this.f73727f) == null) {
            return;
        }
        d2Var.setText(selectedText$foundation_release);
    }

    public final r getAnchorSelectable$foundation_release(s.a anchor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(anchor, "anchor");
        return this.f73722a.getSelectableMap$foundation_release().get(Long.valueOf(anchor.getSelectableId()));
    }

    public final a2.d2 getClipboardManager() {
        return this.f73727f;
    }

    public final x1.d0 getContainerLayoutCoordinates() {
        return this.f73732k;
    }

    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final i1.h m5518getCurrentDragPosition_m7T9E() {
        return (i1.h) this.f73738q.getValue();
    }

    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m5519getDragBeginPositionF1C5BW0$foundation_release() {
        return ((i1.h) this.f73733l.getValue()).m4195unboximpl();
    }

    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m5520getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((i1.h) this.f73734m.getValue()).m4195unboximpl();
    }

    public final l0.q getDraggingHandle() {
        return (l0.q) this.f73737p.getValue();
    }

    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final i1.h m5521getEndHandlePosition_m7T9E() {
        return (i1.h) this.f73736o.getValue();
    }

    public final h1.o0 getFocusRequester() {
        return this.f73729h;
    }

    public final p1.a getHapticFeedBack() {
        return this.f73726e;
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.f73730i.getValue()).booleanValue();
    }

    public final e1.v getModifier() {
        e1.v vVarPointerInput;
        z0 z0Var = new z0(this);
        boolean hasFocus = getHasFocus();
        e1.v vVarSelectionMagnifier = e1.t.f53496b;
        if (hasFocus) {
            vVarPointerInput = u1.i1.pointerInput(vVarSelectionMagnifier, tu.x0.f87415a, new e1(this, z0Var, null));
        } else {
            vVarPointerInput = vVarSelectionMagnifier;
        }
        e1.v vVarOnKeyEvent = s1.i.onKeyEvent(d0.n1.focusable$default(h1.b.onFocusChanged(h1.r0.focusRequester(x1.k1.onGloballyPositioned(vVarPointerInput, new a1(this)), this.f73729h), new b1(this)), false, null, 3, null), new c1(this));
        if (getDraggingHandle() != null) {
            vVarSelectionMagnifier = p1.selectionMagnifier(vVarSelectionMagnifier, this);
        }
        return vVarOnKeyEvent.then(vVarSelectionMagnifier);
    }

    public final kv.l getOnSelectionChange() {
        return this.f73725d;
    }

    public final g2.b getSelectedText$foundation_release() {
        g2.b bVarPlus;
        List<r> listSort = this.f73722a.sort(requireContainerCoordinates$foundation_release());
        s selection = getSelection();
        g2.b bVar = null;
        if (selection != null) {
            int size = listSort.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = listSort.get(i10);
                if (rVar.getSelectableId() == selection.getStart().getSelectableId() || rVar.getSelectableId() == selection.getEnd().getSelectableId() || bVar != null) {
                    g2.b currentSelectedText = j1.getCurrentSelectedText(rVar, selection);
                    if (bVar != null && (bVarPlus = bVar.plus(currentSelectedText)) != null) {
                        currentSelectedText = bVarPlus;
                    }
                    if ((rVar.getSelectableId() == selection.getEnd().getSelectableId() && !selection.getHandlesCrossed()) || (rVar.getSelectableId() == selection.getStart().getSelectableId() && selection.getHandlesCrossed())) {
                        return currentSelectedText;
                    }
                    bVar = currentSelectedText;
                }
            }
        }
        return bVar;
    }

    public final s getSelection() {
        return (s) this.f73723b.getValue();
    }

    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final i1.h m5522getStartHandlePosition_m7T9E() {
        return (i1.h) this.f73735n.getValue();
    }

    public final u4 getTextToolbar() {
        return this.f73728g;
    }

    public final boolean getTouchMode() {
        return this.f73724c;
    }

    public final l0.z0 handleDragObserver(boolean z10) {
        return new y0(this, z10);
    }

    public final void hideSelectionToolbar$foundation_release() {
        u4 u4Var;
        if (getHasFocus()) {
            u4 u4Var2 = this.f73728g;
            if ((u4Var2 != null ? u4Var2.getStatus() : null) != w4.f3875b || (u4Var = this.f73728g) == null) {
                return;
            }
            u4Var.hide();
        }
    }

    public final void onRelease() {
        this.f73722a.setSubselections(uu.p1.emptyMap());
        hideSelectionToolbar$foundation_release();
        if (getSelection() != null) {
            this.f73725d.invoke(null);
            p1.a aVar = this.f73726e;
            if (aVar != null) {
                aVar.mo5860performHapticFeedbackCdsT49E(p1.c.f80664b.m5862getTextHandleMove5zf0vsI());
            }
        }
    }

    public final x1.d0 requireContainerCoordinates$foundation_release() {
        x1.d0 d0Var = this.f73732k;
        if (d0Var == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (d0Var.isAttached()) {
            return d0Var;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final tu.v selectAll$foundation_release(long j10, s sVar) {
        p1.a aVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<r> listSort = this.f73722a.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        s sVarMerge = null;
        for (int i10 = 0; i10 < size; i10++) {
            r rVar = listSort.get(i10);
            s selectAllSelection = rVar.getSelectableId() == j10 ? rVar.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                linkedHashMap.put(Long.valueOf(rVar.getSelectableId()), selectAllSelection);
            }
            sVarMerge = j1.merge(sVarMerge, selectAllSelection);
        }
        if (!kotlin.jvm.internal.e0.areEqual(sVarMerge, sVar) && (aVar = this.f73726e) != null) {
            aVar.mo5860performHapticFeedbackCdsT49E(p1.c.f80664b.m5862getTextHandleMove5zf0vsI());
        }
        return new tu.v(sVarMerge, linkedHashMap);
    }

    public final void setClipboardManager(a2.d2 d2Var) {
        this.f73727f = d2Var;
    }

    public final void setContainerLayoutCoordinates(x1.d0 d0Var) {
        this.f73732k = d0Var;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        i1.h hVarM4174boximpl = d0Var != null ? i1.h.m4174boximpl(x1.e0.positionInWindow(d0Var)) : null;
        if (kotlin.jvm.internal.e0.areEqual(this.f73731j, hVarM4174boximpl)) {
            return;
        }
        this.f73731j = hVarM4174boximpl;
        a();
        if (getHasFocus()) {
            u4 u4Var = this.f73728g;
            if ((u4Var != null ? u4Var.getStatus() : null) == w4.f3875b) {
                showSelectionToolbar$foundation_release();
            }
        }
    }

    public final void setFocusRequester(h1.o0 o0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(o0Var, "<set-?>");
        this.f73729h = o0Var;
    }

    public final void setHapticFeedBack(p1.a aVar) {
        this.f73726e = aVar;
    }

    public final void setHasFocus(boolean z10) {
        this.f73730i.setValue(Boolean.valueOf(z10));
    }

    public final void setOnSelectionChange(kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<set-?>");
        this.f73725d = lVar;
    }

    public final void setSelection(s sVar) {
        this.f73723b.setValue(sVar);
        if (sVar != null) {
            a();
        }
    }

    public final void setTextToolbar(u4 u4Var) {
        this.f73728g = u4Var;
    }

    public final void setTouchMode(boolean z10) {
        this.f73724c = z10;
    }

    public final void showSelectionToolbar$foundation_release() {
        u4 u4Var;
        u4 u4Var2;
        i1.j zero;
        i1.j jVar;
        x1.d0 layoutCoordinates;
        x1.d0 layoutCoordinates2;
        if (!getHasFocus() || getSelection() == null || (u4Var = this.f73728g) == null) {
            return;
        }
        s selection = getSelection();
        if (selection == null) {
            jVar = i1.j.f59349e.getZero();
            u4Var2 = u4Var;
        } else {
            r anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart());
            r anchorSelectable$foundation_release2 = getAnchorSelectable$foundation_release(selection.getEnd());
            if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                u4Var2 = u4Var;
                zero = i1.j.f59349e.getZero();
            } else if (anchorSelectable$foundation_release2 == null || (layoutCoordinates2 = anchorSelectable$foundation_release2.getLayoutCoordinates()) == null) {
                u4Var2 = u4Var;
                zero = i1.j.f59349e.getZero();
            } else {
                x1.d0 d0Var = this.f73732k;
                if (d0Var == null || !d0Var.isAttached()) {
                    u4Var2 = u4Var;
                    zero = i1.j.f59349e.getZero();
                } else {
                    long jMo7828localPositionOfR5De75A = d0Var.mo7828localPositionOfR5De75A(layoutCoordinates, anchorSelectable$foundation_release.mo5551getHandlePositiondBAh8RU(selection, true));
                    long jMo7828localPositionOfR5De75A2 = d0Var.mo7828localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release2.mo5551getHandlePositiondBAh8RU(selection, false));
                    long jMo7829localToRootMKHz9U = d0Var.mo7829localToRootMKHz9U(jMo7828localPositionOfR5De75A);
                    long jMo7829localToRootMKHz9U2 = d0Var.mo7829localToRootMKHz9U(jMo7828localPositionOfR5De75A2);
                    u4Var2 = u4Var;
                    jVar = new i1.j(Math.min(i1.h.m4185getXimpl(jMo7829localToRootMKHz9U), i1.h.m4185getXimpl(jMo7829localToRootMKHz9U2)), Math.min(i1.h.m4186getYimpl(d0Var.mo7829localToRootMKHz9U(d0Var.mo7828localPositionOfR5De75A(layoutCoordinates, i1.i.Offset(0.0f, anchorSelectable$foundation_release.getBoundingBox(selection.getStart().getOffset()).getTop())))), i1.h.m4186getYimpl(d0Var.mo7829localToRootMKHz9U(d0Var.mo7828localPositionOfR5De75A(layoutCoordinates2, i1.i.Offset(0.0f, anchorSelectable$foundation_release2.getBoundingBox(selection.getEnd().getOffset()).getTop()))))), Math.max(i1.h.m4185getXimpl(jMo7829localToRootMKHz9U), i1.h.m4185getXimpl(jMo7829localToRootMKHz9U2)), Math.max(i1.h.m4186getYimpl(jMo7829localToRootMKHz9U), i1.h.m4186getYimpl(jMo7829localToRootMKHz9U2)) + ((float) (e0.getHandleHeight() * 4.0d)));
                }
            }
            jVar = zero;
        }
        u4.showMenu$default(u4Var2, jVar, new g1(this), null, null, null, 28, null);
    }

    /* renamed from: updateSelection-3R_-tFg$foundation_release, reason: not valid java name */
    public final boolean m5523updateSelection3R_tFg$foundation_release(long j10, long j11, i1.h hVar, boolean z10, b0 b0Var) {
        b0 adjustment = b0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(adjustment, "adjustment");
        this.f73737p.setValue(z10 ? l0.q.f72149c : l0.q.f72150e);
        this.f73738q.setValue(z10 ? i1.h.m4174boximpl(j10) : i1.h.m4174boximpl(j11));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        x1.d0 d0VarRequireContainerCoordinates$foundation_release = requireContainerCoordinates$foundation_release();
        u1 u1Var = this.f73722a;
        List<r> listSort = u1Var.sort(d0VarRequireContainerCoordinates$foundation_release);
        int size = listSort.size();
        s sVarMerge = null;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < size) {
            r rVar = listSort.get(i10);
            s sVar = sVarMerge;
            int i11 = i10;
            tu.v vVarMo5553updateSelectionqCDeeow = rVar.mo5553updateSelectionqCDeeow(j10, j11, hVar, z10, requireContainerCoordinates$foundation_release(), adjustment, u1Var.getSubselections().get(Long.valueOf(rVar.getSelectableId())));
            s sVar2 = (s) vVarMo5553updateSelectionqCDeeow.component1();
            z11 = z11 || ((Boolean) vVarMo5553updateSelectionqCDeeow.component2()).booleanValue();
            if (sVar2 != null) {
                linkedHashMap.put(Long.valueOf(rVar.getSelectableId()), sVar2);
            }
            sVarMerge = j1.merge(sVar, sVar2);
            i10 = i11 + 1;
            adjustment = b0Var;
        }
        s sVar3 = sVarMerge;
        if (!kotlin.jvm.internal.e0.areEqual(sVar3, getSelection())) {
            p1.a aVar = this.f73726e;
            if (aVar != null) {
                aVar.mo5860performHapticFeedbackCdsT49E(p1.c.f80664b.m5862getTextHandleMove5zf0vsI());
            }
            u1Var.setSubselections(linkedHashMap);
            this.f73725d.invoke(sVar3);
        }
        return z11;
    }

    /* renamed from: updateSelection-RHHTvR4$foundation_release, reason: not valid java name */
    public final boolean m5524updateSelectionRHHTvR4$foundation_release(i1.h hVar, i1.h hVar2, boolean z10, b0 adjustment) {
        s selection;
        kotlin.jvm.internal.e0.checkNotNullParameter(adjustment, "adjustment");
        if (hVar == null || (selection = getSelection()) == null) {
            return false;
        }
        r rVar = this.f73722a.getSelectableMap$foundation_release().get(Long.valueOf(z10 ? selection.getEnd().getSelectableId() : selection.getStart().getSelectableId()));
        i1.h hVarM4174boximpl = null;
        if (rVar != null) {
            x1.d0 layoutCoordinates = rVar.getLayoutCoordinates();
            kotlin.jvm.internal.e0.checkNotNull(layoutCoordinates);
            long jM5503getAdjustedCoordinatesk4lQ0M = e0.m5503getAdjustedCoordinatesk4lQ0M(rVar.mo5551getHandlePositiondBAh8RU(selection, !z10));
            x1.d0 d0Var = this.f73732k;
            if (d0Var != null && d0Var.isAttached()) {
                hVarM4174boximpl = i1.h.m4174boximpl(requireContainerCoordinates$foundation_release().mo7828localPositionOfR5De75A(layoutCoordinates, jM5503getAdjustedCoordinatesk4lQ0M));
            }
        }
        if (hVarM4174boximpl == null) {
            return false;
        }
        long jM4195unboximpl = hVarM4174boximpl.m4195unboximpl();
        long jM4195unboximpl2 = z10 ? hVar.m4195unboximpl() : jM4195unboximpl;
        if (!z10) {
            jM4195unboximpl = hVar.m4195unboximpl();
        }
        return m5523updateSelection3R_tFg$foundation_release(jM4195unboximpl2, jM4195unboximpl, hVar2, z10, adjustment);
    }
}
