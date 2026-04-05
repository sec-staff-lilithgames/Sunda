package m0;

import p0.o4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l2 {
    public static final void TextFieldSelectionHandle(boolean z10, r2.k direction, h2 manager, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
        kotlin.jvm.internal.e0.checkNotNullParameter(manager, "manager");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-1344558920);
        Boolean boolValueOf = Boolean.valueOf(z10);
        wVarStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = wVarStartRestartGroup.changed(boolValueOf) | wVarStartRestartGroup.changed(manager);
        Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = manager.handleDragObserver$foundation_release(z10);
            wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        wVarStartRestartGroup.endReplaceableGroup();
        l0.z0 z0Var = (l0.z0) objRememberedValue;
        long jM5532getHandlePositiontuRUvjQ$foundation_release = manager.m5532getHandlePositiontuRUvjQ$foundation_release(z10);
        boolean zM3959getReversedimpl = g2.a2.m3959getReversedimpl(manager.getValue$foundation_release().m5591getSelectiond9O1mEE());
        e1.v vVarPointerInput = u1.i1.pointerInput(e1.t.f53496b, z0Var, new i2(z0Var, null));
        int i11 = i10 << 3;
        i.m5534SelectionHandle8fL75g(jM5532getHandlePositiontuRUvjQ$foundation_release, z10, direction, zM3959getReversedimpl, vVarPointerInput, null, wVarStartRestartGroup, (i11 & 112) | 196608 | (i11 & 896));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new j2(z10, direction, manager, i10));
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m5542calculateSelectionMagnifierCenterAndroidO0kMr_c(h2 manager, long j10) {
        int iM3960getStartimpl;
        l0.k1 layoutResult;
        g2.x1 value;
        x1.d0 layoutCoordinates;
        l0.k1 layoutResult2;
        x1.d0 innerTextFieldCoordinates;
        kotlin.jvm.internal.e0.checkNotNullParameter(manager, "manager");
        if (manager.getValue$foundation_release().getText().length() == 0) {
            return i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
        }
        l0.q draggingHandle = manager.getDraggingHandle();
        int i10 = draggingHandle == null ? -1 : k2.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i10 == -1) {
            return i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
        }
        if (i10 == 1 || i10 == 2) {
            iM3960getStartimpl = g2.a2.m3960getStartimpl(manager.getValue$foundation_release().m5591getSelectiond9O1mEE());
        } else {
            if (i10 != 3) {
                throw new tu.t();
            }
            iM3960getStartimpl = g2.a2.m3955getEndimpl(manager.getValue$foundation_release().m5591getSelectiond9O1mEE());
        }
        int iCoerceIn = qv.v.coerceIn(((m2.x) manager.getOffsetMapping$foundation_release()).originalToTransformed(iM3960getStartimpl), (qv.h) sv.n0.getIndices(manager.getValue$foundation_release().getText()));
        l0.i1 state$foundation_release = manager.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
        }
        long jM4209getCenterF1C5BW0 = value.getBoundingBox(iCoerceIn).m4209getCenterF1C5BW0();
        l0.i1 state$foundation_release2 = manager.getState$foundation_release();
        if (state$foundation_release2 == null || (layoutCoordinates = state$foundation_release2.getLayoutCoordinates()) == null) {
            return i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
        }
        l0.i1 state$foundation_release3 = manager.getState$foundation_release();
        if (state$foundation_release3 == null || (layoutResult2 = state$foundation_release3.getLayoutResult()) == null || (innerTextFieldCoordinates = layoutResult2.getInnerTextFieldCoordinates()) == null) {
            return i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
        }
        i1.h hVarM5530getCurrentDragPosition_m7T9E = manager.m5530getCurrentDragPosition_m7T9E();
        if (hVarM5530getCurrentDragPosition_m7T9E == null) {
            return i1.h.f59344b.m4172getUnspecifiedF1C5BW0();
        }
        float fM4185getXimpl = i1.h.m4185getXimpl(innerTextFieldCoordinates.mo7828localPositionOfR5De75A(layoutCoordinates, hVarM5530getCurrentDragPosition_m7T9E.m4195unboximpl()));
        int lineForOffset = value.getLineForOffset(iCoerceIn);
        int lineStart = value.getLineStart(lineForOffset);
        int lineEnd = value.getLineEnd(lineForOffset, true);
        boolean z10 = g2.a2.m3960getStartimpl(manager.getValue$foundation_release().m5591getSelectiond9O1mEE()) > g2.a2.m3955getEndimpl(manager.getValue$foundation_release().m5591getSelectiond9O1mEE());
        float horizontalPosition = v2.getHorizontalPosition(value, lineStart, true, z10);
        float horizontalPosition2 = v2.getHorizontalPosition(value, lineEnd, false, z10);
        float fCoerceIn = qv.v.coerceIn(fM4185getXimpl, Math.min(horizontalPosition, horizontalPosition2), Math.max(horizontalPosition, horizontalPosition2));
        return Math.abs(fM4185getXimpl - fCoerceIn) > ((float) (s2.v.m6972getWidthimpl(j10) / 2)) ? i1.h.f59344b.m4172getUnspecifiedF1C5BW0() : layoutCoordinates.mo7828localPositionOfR5De75A(innerTextFieldCoordinates, i1.i.Offset(fCoerceIn, i1.h.m4186getYimpl(jM4209getCenterF1C5BW0)));
    }

    public static final boolean isSelectionHandleInVisibleBound(h2 h2Var, boolean z10) {
        x1.d0 layoutCoordinates;
        i1.j jVarVisibleBounds;
        kotlin.jvm.internal.e0.checkNotNullParameter(h2Var, "<this>");
        l0.i1 state$foundation_release = h2Var.getState$foundation_release();
        if (state$foundation_release == null || (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) == null || (jVarVisibleBounds = j1.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return j1.m5538containsInclusiveUv8p0NA(jVarVisibleBounds, h2Var.m5532getHandlePositiontuRUvjQ$foundation_release(z10));
    }
}
