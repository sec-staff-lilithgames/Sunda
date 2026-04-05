package m0;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import g0.h3;
import g0.l3;
import l1.a;
import p0.o4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {
    public static final void DefaultSelectionHandle(e1.v modifier, boolean z10, r2.k direction, boolean z11, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(47957398);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= wVarStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= wVarStartRestartGroup.changed(direction) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= wVarStartRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            l3.Spacer(drawSelectionHandle(h3.m3907sizeVpY3zN4(modifier, e0.getHandleWidth(), e0.getHandleHeight()), z10, direction, z11), wVarStartRestartGroup, 0);
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new a(modifier, z10, direction, z11, i10));
    }

    /* renamed from: HandlePopup-ULxng0E, reason: not valid java name */
    public static final void m5533HandlePopupULxng0E(long j10, n handleReferencePoint, kv.p content, p0.w wVar, int i10) {
        long j11;
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(handleReferencePoint, "handleReferencePoint");
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-1409050158);
        if ((i10 & 14) == 0) {
            j11 = j10;
            i11 = (wVarStartRestartGroup.changed(j11) ? 4 : 2) | i10;
        } else {
            j11 = j10;
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= wVarStartRestartGroup.changed(handleReferencePoint) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= wVarStartRestartGroup.changed(content) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i11 & 731) == 146 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            long jIntOffset = s2.r.IntOffset(mv.d.roundToInt(i1.h.m4185getXimpl(j11)), mv.d.roundToInt(i1.h.m4186getYimpl(j11)));
            s2.q qVarM6921boximpl = s2.q.m6921boximpl(jIntOffset);
            wVarStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = wVarStartRestartGroup.changed(qVarM6921boximpl) | wVarStartRestartGroup.changed(handleReferencePoint);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new m(handleReferencePoint, jIntOffset, null);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            v2.t.Popup((m) objRememberedValue, null, new v2.f0(false, false, false, null, true, false, 15, null), content, wVarStartRestartGroup, (i11 << 3) & 7168, 2);
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new b(j11, handleReferencePoint, content, i10));
    }

    /* renamed from: SelectionHandle-8fL75-g, reason: not valid java name */
    public static final void m5534SelectionHandle8fL75g(long j10, boolean z10, r2.k direction, boolean z11, e1.v modifier, kv.p pVar, p0.w wVar, int i10) {
        int i11;
        p0.w wVar2;
        kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-616295642);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= wVarStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= wVarStartRestartGroup.changed(direction) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= wVarStartRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= wVarStartRestartGroup.changed(modifier) ? 16384 : Segment.SIZE;
        }
        if ((458752 & i10) == 0) {
            i11 |= wVarStartRestartGroup.changed(pVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i12 = i11;
        if ((374491 & i12) == 74898 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
            wVar2 = wVarStartRestartGroup;
        } else {
            wVar2 = wVarStartRestartGroup;
            m5533HandlePopupULxng0E(j10, z10 ? isHandleLtrDirection(direction, z11) : !isHandleLtrDirection(direction, z11) ? n.f73794c : n.f73793b, z0.u.composableLambda(wVarStartRestartGroup, 732099485, true, new d(i12, j10, modifier, pVar, direction, z10, z11)), wVar2, (i12 & 14) | 384);
        }
        o4 o4VarEndRestartGroup = wVar2.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new e(i10, j10, modifier, pVar, direction, z10, z11));
    }

    public static final boolean access$isLeft(boolean z10, r2.k kVar, boolean z11) {
        return z10 ? isHandleLtrDirection(kVar, z11) : !isHandleLtrDirection(kVar, z11);
    }

    public static final j1.y0 createHandleImage(g1.d dVar, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dVar, "<this>");
        int iCeil = ((int) Math.ceil(f10)) * 2;
        k kVar = k.f73771a;
        j1.y0 imageBitmap = kVar.getImageBitmap();
        j1.e0 canvas = kVar.getCanvas();
        l1.a canvasDrawScope = kVar.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || iCeil > imageBitmap.getWidth() || iCeil > imageBitmap.getHeight()) {
            imageBitmap = j1.b1.m4694ImageBitmapx__hDU$default(iCeil, iCeil, j1.a1.f68819b.m5082getAlpha8_sVssgQ(), false, null, 24, null);
            kVar.setImageBitmap(imageBitmap);
            canvas = j1.g0.Canvas(imageBitmap);
            kVar.setCanvas(canvas);
        }
        j1.y0 y0Var = imageBitmap;
        j1.e0 e0Var = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new l1.a();
            kVar.setCanvasDrawScope(canvasDrawScope);
        }
        l1.a aVar = canvasDrawScope;
        s2.x layoutDirection = dVar.getLayoutDirection();
        long jSize = i1.p.Size(y0Var.getWidth(), y0Var.getHeight());
        a.C0738a drawParams = aVar.getDrawParams();
        s2.e eVarComponent1 = drawParams.component1();
        s2.x xVarComponent2 = drawParams.component2();
        j1.e0 e0VarComponent3 = drawParams.component3();
        long jM5316component4NHjbRc = drawParams.m5316component4NHjbRc();
        a.C0738a drawParams2 = aVar.getDrawParams();
        drawParams2.setDensity(dVar);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(e0Var);
        drawParams2.m5319setSizeuvyYCjk(jSize);
        e0Var.save();
        l1.i.m5411drawRectnJ9OG0$default(aVar, j1.m0.f68918b.m4825getBlack0d7_KjU(), 0L, aVar.mo5314getSizeNHjbRc(), 0.0f, null, null, j1.x.f69020b.m5035getClear0nO6VwU(), 58, null);
        l1.i.m5411drawRectnJ9OG0$default(aVar, j1.o0.Color(4278190080L), i1.h.f59344b.m4173getZeroF1C5BW0(), i1.p.Size(f10, f10), 0.0f, null, null, 0, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, null);
        l1.i.m5398drawCircleVaOC9Bg$default(aVar, j1.o0.Color(4278190080L), f10, i1.i.Offset(f10, f10), 0.0f, null, null, 0, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, null);
        e0Var.restore();
        a.C0738a drawParams3 = aVar.getDrawParams();
        drawParams3.setDensity(eVarComponent1);
        drawParams3.setLayoutDirection(xVarComponent2);
        drawParams3.setCanvas(e0VarComponent3);
        drawParams3.m5319setSizeuvyYCjk(jM5316component4NHjbRc);
        return y0Var;
    }

    public static final e1.v drawSelectionHandle(e1.v vVar, boolean z10, r2.k direction, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
        return e1.o.composed$default(vVar, null, new h(z10, direction, z11), 1, null);
    }

    public static final boolean isHandleLtrDirection(r2.k direction, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
        if (direction != r2.k.f83698b || z10) {
            return direction == r2.k.f83699c && z10;
        }
        return true;
    }
}
