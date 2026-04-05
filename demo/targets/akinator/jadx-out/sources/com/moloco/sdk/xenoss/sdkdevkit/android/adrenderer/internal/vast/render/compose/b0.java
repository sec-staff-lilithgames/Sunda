package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;
import p0.o4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b0 {
    public static final x0 a(k.a aVar, e1.v vVar, int i10, int i11, p0.w wVar, int i12) {
        a(aVar, vVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    public static final x0 b(k.a aVar, e1.v vVar, int i10, int i11, p0.w wVar, int i12) {
        a(aVar, vVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    public static final void a(final k.a htmlResource, e1.v vVar, p0.w wVar, final int i10, final int i11) {
        int i12;
        final e1.v vVar2;
        kotlin.jvm.internal.e0.checkNotNullParameter(htmlResource, "htmlResource");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-1230364815);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (wVarStartRestartGroup.changed(htmlResource) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= wVarStartRestartGroup.changed(vVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
            vVar2 = vVar;
        } else {
            e1.v vVar3 = i13 != 0 ? e1.t.f53496b : vVar;
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-1230364815, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastResourceHtml (VastResourceHtml.kt:11)");
            }
            wVarStartRestartGroup.startReplaceableGroup(-1944712831);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            if (objRememberedValue == p0.v.f80515a.getEmpty()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n nVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n.f48177a;
                Object obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n.f48178b.get(Integer.valueOf(htmlResource.b()));
                if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v)) {
                    obj = null;
                }
                objRememberedValue = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v) obj;
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v vVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v) objRememberedValue;
            wVarStartRestartGroup.endReplaceableGroup();
            if (vVar4 == null) {
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventEnd();
                }
                o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
                if (o4VarEndRestartGroup != null) {
                    final int i14 = 0;
                    final e1.v vVar5 = vVar3;
                    o4VarEndRestartGroup.updateScope(new kv.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a0
                        @Override // kv.p
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (i14) {
                                case 0:
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return b0.a(htmlResource, vVar5, i10, i11, (p0.w) obj2, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    return b0.b(htmlResource, vVar5, i10, i11, (p0.w) obj2, iIntValue2);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            int i15 = i12;
            vVar2 = vVar3;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.a(vVar4, vVar2, null, wVarStartRestartGroup, (i15 & 112) | 384, 0);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup2 = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup2 != null) {
            final int i16 = 1;
            o4VarEndRestartGroup2.updateScope(new kv.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a0
                @Override // kv.p
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i16) {
                        case 0:
                            int iIntValue = ((Integer) obj3).intValue();
                            return b0.a(htmlResource, vVar2, i10, i11, (p0.w) obj2, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj3).intValue();
                            return b0.b(htmlResource, vVar2, i10, i11, (p0.w) obj2, iIntValue2);
                    }
                }
            });
        }
    }
}
