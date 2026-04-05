package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import a1.o;
import a2.a3;
import a2.g5;
import androidx.core.app.NotificationCompat;
import e1.t;
import e1.v;
import e2.r0;
import e2.u0;
import g0.h3;
import kotlin.jvm.internal.e0;
import kv.q;
import p0.a6;
import p0.d0;
import p0.o4;
import p0.p;
import p0.w;
import s2.x;
import tu.x0;
import tu.z0;
import x1.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {
    public static final x0 a(com.moloco.sdk.internal.ortb.model.i iVar, int i10, int i11, int i12, w wVar, int i13) {
        a(iVar, i10, i11, wVar, i12 | 1);
        return x0.f87415a;
    }

    public static final x0 b() {
        return x0.f87415a;
    }

    public static final void a(final com.moloco.sdk.internal.ortb.model.i countDownTimer, int i10, int i11, w wVar, final int i12) {
        int i13;
        final int i14 = i10;
        final int i15 = i11;
        e0.checkNotNullParameter(countDownTimer, "countDownTimer");
        w wVarStartRestartGroup = wVar.startRestartGroup(-1297279343);
        if ((i12 & 6) == 0) {
            i13 = (wVarStartRestartGroup.changed(countDownTimer) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= wVarStartRestartGroup.changed(i14) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= wVarStartRestartGroup.changed(i15) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i13 & 147) == 146 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-1297279343, i13, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.AggregateRewardedCountDownTimer (AggregateRewardedCountDownTimer.kt:17)");
            }
            float fM6817constructorimpl = s2.i.m6817constructorimpl(countDownTimer.c());
            long jM6833DpSizeYgX7TsA = s2.j.m6833DpSizeYgX7TsA(fM6817constructorimpl, fM6817constructorimpl);
            e1.d dVarA = com.moloco.sdk.internal.g.a(countDownTimer.i(), countDownTimer.m());
            long jA = countDownTimer.a();
            int i16 = i13;
            long jG = countDownTimer.g();
            t tVar = t.f53496b;
            v vVarFillMaxSize$default = h3.fillMaxSize$default(tVar, 0.0f, 1, null);
            wVarStartRestartGroup.startReplaceableGroup(733328855);
            x1.x0 x0VarRememberBoxMeasurePolicy = g0.d0.rememberBoxMeasurePolicy(dVarA, false, wVarStartRestartGroup, 0);
            s2.e eVar = (s2.e) a.b.d(wVarStartRestartGroup, -1323940314);
            x xVar = (x) wVarStartRestartGroup.consume(a3.getLocalLayoutDirection());
            g5 g5Var = (g5) wVarStartRestartGroup.consume(a3.getLocalViewConfiguration());
            z1.f fVar = z1.g.Z8;
            kv.a constructor = fVar.getConstructor();
            q qVarMaterializerOf = g0.materializerOf(vVarFillMaxSize$default);
            if (wVarStartRestartGroup.getApplier() == null) {
                p.invalidApplier();
            }
            wVarStartRestartGroup.startReusableNode();
            if (wVarStartRestartGroup.getInserting()) {
                wVarStartRestartGroup.createNode(constructor);
            } else {
                wVarStartRestartGroup.useNode();
            }
            wVarStartRestartGroup.disableReusing();
            w wVarM5780constructorimpl = a6.m5780constructorimpl(wVarStartRestartGroup);
            a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, x0VarRememberBoxMeasurePolicy, wVarM5780constructorimpl, eVar));
            a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVarStartRestartGroup, wVarStartRestartGroup), wVarStartRestartGroup, 2058660585);
            wVarStartRestartGroup.startReplaceableGroup(-2137368960);
            boolean zO = countDownTimer.o();
            p0.v vVar = p0.v.f80515a;
            if (zO) {
                wVarStartRestartGroup.startReplaceableGroup(2067595199);
                wVarStartRestartGroup.startReplaceableGroup(-210387540);
                boolean zChanged = wVarStartRestartGroup.changed("rewarded_countdown_timer");
                Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == vVar.getEmpty()) {
                    objRememberedValue = new o(18);
                    wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                wVarStartRestartGroup.endReplaceableGroup();
                v vVarSemantics$default = e2.v.semantics$default(tVar, false, (kv.l) objRememberedValue, 1, null);
                float fM6911getWidthD9Ej5fM = s2.o.m6911getWidthD9Ej5fM(jM6833DpSizeYgX7TsA);
                wVarStartRestartGroup.startReplaceableGroup(-210389350);
                Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == vVar.getEmpty()) {
                    objRememberedValue2 = new com.moloco.sdk.service_locator.b(10);
                    wVarStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                wVarStartRestartGroup.endReplaceableGroup();
                int i17 = i16 << 21;
                l.a(jA, jG, vVarSemantics$default, 0.0f, fM6911getWidthD9Ej5fM, (kv.a) objRememberedValue2, null, null, i14, i15, wVarStartRestartGroup, 196608 | (234881024 & i17) | (i17 & 1879048192), 200);
                wVarStartRestartGroup.endReplaceableGroup();
                i14 = i10;
                i15 = i11;
            } else {
                String strE = countDownTimer.e();
                if (strE == null || strE.length() <= 0) {
                    i14 = i10;
                    i15 = i11;
                    wVarStartRestartGroup.startReplaceableGroup(2069129451);
                    wVarStartRestartGroup.endReplaceableGroup();
                } else {
                    wVarStartRestartGroup.startReplaceableGroup(2068371222);
                    wVarStartRestartGroup.startReplaceableGroup(-210362420);
                    boolean zChanged2 = wVarStartRestartGroup.changed("rewarded_countdown_timer_custom");
                    Object objRememberedValue3 = wVarStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == vVar.getEmpty()) {
                        objRememberedValue3 = new o(19);
                        wVarStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    wVarStartRestartGroup.endReplaceableGroup();
                    v vVarSemantics$default2 = e2.v.semantics$default(tVar, false, (kv.l) objRememberedValue3, 1, null);
                    float fM6911getWidthD9Ej5fM2 = s2.o.m6911getWidthD9Ej5fM(jM6833DpSizeYgX7TsA);
                    String strE2 = countDownTimer.e();
                    wVarStartRestartGroup.startReplaceableGroup(-210364230);
                    Object objRememberedValue4 = wVarStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == vVar.getEmpty()) {
                        objRememberedValue4 = new com.moloco.sdk.service_locator.b(11);
                        wVarStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    wVarStartRestartGroup.endReplaceableGroup();
                    h.a(jA, jG, vVarSemantics$default2, 0.0f, fM6911getWidthD9Ej5fM2, (kv.a) objRememberedValue4, strE2, null, null, i10, i11, wVarStartRestartGroup, ((i16 << 24) & 1879048192) | 196608, (i16 >> 6) & 14, 392);
                    i14 = i10;
                    i15 = i11;
                    wVarStartRestartGroup = wVarStartRestartGroup;
                    wVarStartRestartGroup.endReplaceableGroup();
                }
            }
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endNode();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endReplaceableGroup();
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a
                @Override // kv.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return b.a(countDownTimer, i14, i15, i12, (w) obj, iIntValue);
                }
            });
        }
    }

    public static final x0 b(String str, u0 semantics) {
        e0.checkNotNullParameter(semantics, "$this$semantics");
        r0.setContentDescription(semantics, str);
        r0.setTestTag(semantics, str);
        return x0.f87415a;
    }

    public static final x0 a(String str, u0 semantics) {
        e0.checkNotNullParameter(semantics, "$this$semantics");
        r0.setContentDescription(semantics, str);
        r0.setTestTag(semantics, str);
        return x0.f87415a;
    }

    public static final x0 a() {
        return x0.f87415a;
    }

    public static final float a(int i10, int i11) {
        return ((float) z0.uintToDouble(i10)) / ((float) z0.uintToDouble(i11));
    }
}
