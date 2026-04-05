package m0;

import m0.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j1 {
    public static final long a(h1 h1Var, long j10, s.a aVar, boolean z10) {
        r anchorSelectable$foundation_release = h1Var.getAnchorSelectable$foundation_release(aVar);
        if (anchorSelectable$foundation_release == null) {
            return i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
        }
        x1.d0 containerLayoutCoordinates = h1Var.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
        }
        x1.d0 layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
        }
        int offset = aVar.getOffset();
        if (!z10) {
            offset--;
        }
        i1.h hVarM5518getCurrentDragPosition_m7T9E = h1Var.m5518getCurrentDragPosition_m7T9E();
        kotlin.jvm.internal.e0.checkNotNull(hVarM5518getCurrentDragPosition_m7T9E);
        float fM4185getXimpl = i1.h.m4185getXimpl(layoutCoordinates.mo7828localPositionOfR5De75A(containerLayoutCoordinates, hVarM5518getCurrentDragPosition_m7T9E.m4195unboximpl()));
        long jMo5552getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo5552getRangeOfLineContainingjx7JFs(offset);
        i1.j boundingBox = anchorSelectable$foundation_release.getBoundingBox(g2.a2.m3958getMinimpl(jMo5552getRangeOfLineContainingjx7JFs));
        i1.j boundingBox2 = anchorSelectable$foundation_release.getBoundingBox(qv.v.coerceAtLeast(g2.a2.m3957getMaximpl(jMo5552getRangeOfLineContainingjx7JFs) - 1, g2.a2.m3958getMinimpl(jMo5552getRangeOfLineContainingjx7JFs)));
        float fCoerceIn = qv.v.coerceIn(fM4185getXimpl, Math.min(boundingBox.getLeft(), boundingBox2.getLeft()), Math.max(boundingBox.getRight(), boundingBox2.getRight()));
        return Math.abs(fM4185getXimpl - fCoerceIn) > ((float) (s2.v.m6972getWidthimpl(j10) / 2)) ? i1.h.f59344b.m4172getUnspecifiedF1C5BW0() : containerLayoutCoordinates.mo7828localPositionOfR5De75A(layoutCoordinates, i1.i.Offset(fCoerceIn, i1.h.m4186getYimpl(anchorSelectable$foundation_release.getBoundingBox(offset).m4209getCenterF1C5BW0())));
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m5537calculateSelectionMagnifierCenterAndroidO0kMr_c(h1 manager, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(manager, "manager");
        s selection = manager.getSelection();
        if (selection == null) {
            return i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
        }
        l0.q draggingHandle = manager.getDraggingHandle();
        int i10 = draggingHandle == null ? -1 : i1.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i10 == -1) {
            return i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
        }
        if (i10 == 1) {
            return a(manager, j10, selection.getStart(), true);
        }
        if (i10 == 2) {
            return a(manager, j10, selection.getEnd(), false);
        }
        if (i10 != 3) {
            throw new tu.t();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor");
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m5538containsInclusiveUv8p0NA(i1.j containsInclusive, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(containsInclusive, "$this$containsInclusive");
        float left = containsInclusive.getLeft();
        float right = containsInclusive.getRight();
        float fM4185getXimpl = i1.h.m4185getXimpl(j10);
        if (left > fM4185getXimpl || fM4185getXimpl > right) {
            return false;
        }
        float top = containsInclusive.getTop();
        float bottom = containsInclusive.getBottom();
        float fM4186getYimpl = i1.h.m4186getYimpl(j10);
        return top <= fM4186getYimpl && fM4186getYimpl <= bottom;
    }

    public static final g2.b getCurrentSelectedText(r selectable, s selection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(selectable, "selectable");
        kotlin.jvm.internal.e0.checkNotNullParameter(selection, "selection");
        g2.b text = selectable.getText();
        return (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId()) ? (selectable.getSelectableId() == selection.getStart().getSelectableId() && selectable.getSelectableId() == selection.getEnd().getSelectableId()) ? selection.getHandlesCrossed() ? text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset()) : text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset()) : selectable.getSelectableId() == selection.getStart().getSelectableId() ? selection.getHandlesCrossed() ? text.subSequence(0, selection.getStart().getOffset()) : text.subSequence(selection.getStart().getOffset(), text.length()) : selection.getHandlesCrossed() ? text.subSequence(selection.getEnd().getOffset(), text.length()) : text.subSequence(0, selection.getEnd().getOffset()) : text;
    }

    public static final s merge(s sVar, s sVar2) {
        s sVarMerge;
        return (sVar == null || (sVarMerge = sVar.merge(sVar2)) == null) ? sVar2 : sVarMerge;
    }

    public static final i1.j visibleBounds(x1.d0 d0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(d0Var, "<this>");
        i1.j jVarBoundsInWindow = x1.e0.boundsInWindow(d0Var);
        return i1.k.m4217Rect0a9Yr6o(d0Var.mo7831windowToLocalMKHz9U(jVarBoundsInWindow.m4214getTopLeftF1C5BW0()), d0Var.mo7831windowToLocalMKHz9U(jVarBoundsInWindow.m4208getBottomRightF1C5BW0()));
    }
}
