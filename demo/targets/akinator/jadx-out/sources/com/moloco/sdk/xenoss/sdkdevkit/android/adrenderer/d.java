package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import a2.a3;
import a2.g5;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.moloco.sdk.internal.MolocoLogger;
import e2.r0;
import e2.u0;
import g0.h3;
import j1.y0;
import p0.a6;
import p0.o4;
import tu.x0;
import x1.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d {
    public static final x0 a(String str, kv.p pVar, int i10, p0.w wVar, int i11) {
        a(str, pVar, wVar, i10 | 1);
        return x0.f87415a;
    }

    public static final x0 b(String str, kv.p pVar, int i10, p0.w wVar, int i11) {
        a(str, pVar, wVar, i10 | 1);
        return x0.f87415a;
    }

    public static final void a(final String str, final kv.p content, p0.w wVar, final int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(701452993);
        if ((i10 & 6) == 0) {
            i11 = (wVarStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= wVarStartRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(701452993, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.WatermarkComposable (Watermark.kt:79)");
            }
            wVarStartRestartGroup.startReplaceableGroup(1831107047);
            boolean zChanged = wVarStartRestartGroup.changed(str);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            p0.v vVar = p0.v.f80515a;
            if (zChanged || objRememberedValue == vVar.getEmpty()) {
                objRememberedValue = b(str);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            y0 y0Var = (y0) objRememberedValue;
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.startReplaceableGroup(1831111327);
            if (y0Var == null) {
                content.invoke(wVarStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
                wVarStartRestartGroup.endReplaceableGroup();
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventEnd();
                }
                o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
                if (o4VarEndRestartGroup != null) {
                    final int i12 = 0;
                    o4VarEndRestartGroup.updateScope(new kv.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c
                        @Override // kv.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i13 = i12;
                            p0.w wVar2 = (p0.w) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            switch (i13) {
                                case 0:
                                    return d.a(str, content, i10, wVar2, iIntValue);
                                default:
                                    return d.b(str, content, i10, wVar2, iIntValue);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            wVarStartRestartGroup.endReplaceableGroup();
            e1.t tVar = e1.t.f53496b;
            e1.v vVarFillMaxSize$default = h3.fillMaxSize$default(tVar, 0.0f, 1, null);
            wVarStartRestartGroup.startReplaceableGroup(1831116600);
            boolean zChanged2 = wVarStartRestartGroup.changed("Watermark Overlay");
            Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == vVar.getEmpty()) {
                objRememberedValue2 = new a1.o(11);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            e1.v vVarSemantics$default = e2.v.semantics$default(vVarFillMaxSize$default, false, (kv.l) objRememberedValue2, 1, null);
            wVarStartRestartGroup.startReplaceableGroup(733328855);
            x1.x0 x0VarRememberBoxMeasurePolicy = g0.d0.rememberBoxMeasurePolicy(e1.d.f53469a.getTopStart(), false, wVarStartRestartGroup, 0);
            wVarStartRestartGroup.startReplaceableGroup(-1323940314);
            s2.e eVar = (s2.e) wVarStartRestartGroup.consume(a3.getLocalDensity());
            s2.x xVar = (s2.x) wVarStartRestartGroup.consume(a3.getLocalLayoutDirection());
            g5 g5Var = (g5) wVarStartRestartGroup.consume(a3.getLocalViewConfiguration());
            z1.f fVar = z1.g.Z8;
            kv.a constructor = fVar.getConstructor();
            kv.q qVarMaterializerOf = g0.materializerOf(vVarSemantics$default);
            if (wVarStartRestartGroup.getApplier() == null) {
                p0.p.invalidApplier();
            }
            wVarStartRestartGroup.startReusableNode();
            if (wVarStartRestartGroup.getInserting()) {
                wVarStartRestartGroup.createNode(constructor);
            } else {
                wVarStartRestartGroup.useNode();
            }
            wVarStartRestartGroup.disableReusing();
            p0.w wVarM5780constructorimpl = a6.m5780constructorimpl(wVarStartRestartGroup);
            a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, x0VarRememberBoxMeasurePolicy, wVarM5780constructorimpl, eVar));
            a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVarStartRestartGroup, wVarStartRestartGroup), wVarStartRestartGroup, 2058660585);
            wVarStartRestartGroup.startReplaceableGroup(-2137368960);
            content.invoke(wVarStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            e1.v vVarFillMaxSize$default2 = h3.fillMaxSize$default(tVar, 0.0f, 1, null);
            wVarStartRestartGroup.startReplaceableGroup(602568249);
            boolean zChanged3 = wVarStartRestartGroup.changed(y0Var);
            Object objRememberedValue3 = wVarStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == vVar.getEmpty()) {
                objRememberedValue3 = new aw.f(y0Var, 6);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            d0.a0.Canvas(vVarFillMaxSize$default2, (kv.l) objRememberedValue3, wVarStartRestartGroup, 6);
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endNode();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endReplaceableGroup();
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup2 = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup2 != null) {
            final int i13 = 1;
            o4VarEndRestartGroup2.updateScope(new kv.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c
                @Override // kv.p
                public final Object invoke(Object obj, Object obj2) {
                    int i132 = i13;
                    p0.w wVar2 = (p0.w) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i132) {
                        case 0:
                            return d.a(str, content, i10, wVar2, iIntValue);
                        default:
                            return d.b(str, content, i10, wVar2, iIntValue);
                    }
                }
            });
        }
    }

    public static final y0 b(String str) {
        Bitmap bitmapA = a(str);
        if (bitmapA != null) {
            return j1.g.asImageBitmap(bitmapA);
        }
        return null;
    }

    public static final x0 a(String str, u0 semantics) {
        kotlin.jvm.internal.e0.checkNotNullParameter(semantics, "$this$semantics");
        r0.setContentDescription(semantics, str);
        r0.setTestTag(semantics, str);
        return x0.f87415a;
    }

    public static final x0 a(y0 y0Var, l1.i iVar) {
        l1.i Canvas = iVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(Canvas, "$this$Canvas");
        float width = y0Var.getWidth();
        float height = y0Var.getHeight();
        float fM4252getWidthimpl = i1.o.m4252getWidthimpl(Canvas.mo5314getSizeNHjbRc());
        float fM4249getHeightimpl = i1.o.m4249getHeightimpl(Canvas.mo5314getSizeNHjbRc());
        float f10 = 0.0f;
        while (f10 < fM4252getWidthimpl) {
            float f11 = 0.0f;
            while (f11 < fM4249getHeightimpl) {
                l1.i.m5401drawImagegbVJVH8$default(Canvas, y0Var, i1.i.Offset(f10, f11), 0.0f, null, null, 0, 60, null);
                f11 += height;
                Canvas = iVar;
            }
            f10 += width;
            Canvas = iVar;
        }
        return x0.f87415a;
    }

    public static final Bitmap a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    byte[] bArrDecode = Base64.decode(str, 0);
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    if (bitmapDecodeByteArray != null) {
                        return bitmapDecodeByteArray;
                    }
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "BitmapCreationError", "BitmapFactory failed to decode the byte array", null, false, 12, null);
                    return bitmapDecodeByteArray;
                }
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "BitmapCreationError", "Error creating bitmap from base64", e10, false, 8, null);
                return null;
            }
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BitmapCreationError", "Base64 string is null or empty", false, 4, null);
        return null;
    }
}
