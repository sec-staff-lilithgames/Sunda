package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import bp.oM.DwaEpyvxz;
import com.digidust.elokence.akinator.freemium.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import g0.f2;
import g0.i2;
import n0.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class i {
    public static final kv.b a(e1.d dVar, i2 i2Var, long j10, long j11, long j12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x xVar, kv.a aVar, com.moloco.sdk.internal.ortb.model.i iVar, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(-78614409);
        e1.d topEnd = (i11 & 1) != 0 ? e1.d.f53469a.getTopEnd() : dVar;
        i2 i2VarM3870PaddingValues0680j_4 = (i11 & 2) != 0 ? f2.m3870PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : i2Var;
        long jM5677getPrimary0d7_KjU = (i11 & 4) != 0 ? i0.f75090a.getColors(wVar, 0).m5677getPrimary0d7_KjU() : j10;
        long jB = (i11 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j11;
        long jD = (i11 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d() : j12;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x xVarA = (i11 & 32) != 0 ? a(null, 0L, null, 0L, wVar, 0, 15) : xVar;
        kv.a aVar2 = (i11 & 64) != 0 ? null : aVar;
        com.moloco.sdk.internal.ortb.model.i iVar2 = (i11 & 128) == 0 ? iVar : null;
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-78614409, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultAdSkipCountdownButton (DefaultAdSkipCountdownButton.kt:35)");
        }
        int i12 = i10 << 3;
        kv.b bVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a(topEnd, i2VarM3870PaddingValues0680j_4, jM5677getPrimary0d7_KjU, jB, jD, xVarA, a.c.EnumC0490a.f50248e, aVar2, iVar2, wVar, (i12 & 234881024) | (i10 & 14) | 1572864 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (29360128 & i12));
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return bVarA;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x a(m1.e eVar, long j10, j1.f2 f2Var, long j11, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(-571269297);
        if ((i11 & 1) != 0) {
            eVar = d2.c.painterResource(R.drawable.ic_round_skip_next_24, wVar, 0);
        }
        m1.e eVar2 = eVar;
        if ((i11 & 2) != 0) {
            j10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            f2Var = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f();
        }
        j1.f2 f2Var2 = f2Var;
        long jE = (i11 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j11;
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-571269297, i10, -1, DwaEpyvxz.CiS);
        }
        x.b bVar = new x.b(eVar2, "Skip", j12, f2Var2, jE, null);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return bVar;
    }
}
