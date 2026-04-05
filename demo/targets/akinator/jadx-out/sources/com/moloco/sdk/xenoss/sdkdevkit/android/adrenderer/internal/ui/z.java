package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import a2.a3;
import a2.g5;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.ironsource.C3227g4;
import com.vungle.ads.internal.protos.Sdk;
import d0.k0;
import g0.h3;
import g0.l3;
import g0.v2;
import j1.l0;
import j1.m0;
import j1.o0;
import l2.c1;
import n0.n1;
import p0.a6;
import p0.o4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final long f48806a = o0.Color$default(71, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 238, 0, 8, null);

    /* renamed from: b, reason: collision with root package name */
    public static final long f48807b = m0.f68918b.m4836getWhite0d7_KjU();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.q {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f48808b;

        public a(String str) {
            this.f48808b = str;
        }

        public final void a(v2 Button, p0.w wVar, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(Button, "$this$Button");
            if ((i10 & 17) == 16 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(1091822665, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.DEC.<anonymous>.<anonymous> (DEC.kt:73)");
            }
            String str = this.f48808b;
            if (str == null) {
                str = "";
            }
            n1.m5701TextfLXpl1I(str, null, z.f48807b, 0L, null, c1.f72258c.getBold(), null, 0L, null, null, 0L, r2.a0.f83672b.m6100getEllipsisgIe3tQ8(), false, 1, null, null, wVar, 196992, 3120, 55258);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v2) obj, (p0.w) obj2, ((Number) obj3).intValue());
            return x0.f87415a;
        }
    }

    public static final x0 a(e1.v vVar, String str, String str2, String str3, kv.a aVar, int i10, int i11, p0.w wVar, int i12) {
        a(vVar, str, str2, str3, aVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    public static final x0 a(int i10, p0.w wVar, int i11) {
        a(wVar, i10 | 1);
        return x0.f87415a;
    }

    public static final void a(e1.v vVar, final String str, final String str2, String str3, final kv.a onClick, p0.w wVar, final int i10, final int i11) {
        e1.v vVar2;
        int i12;
        e1.t tVar;
        String str4;
        final e1.v vVar3;
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(267258467);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            vVar2 = vVar;
        } else if ((i10 & 6) == 0) {
            vVar2 = vVar;
            i12 = (wVarStartRestartGroup.changed(vVar2) ? 4 : 2) | i10;
        } else {
            vVar2 = vVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= wVarStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= wVarStartRestartGroup.changed(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= wVarStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= wVarStartRestartGroup.changed(onClick) ? 16384 : Segment.SIZE;
        }
        int i14 = i12;
        if ((i14 & 9363) == 9362 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
            str4 = str3;
            vVar3 = vVar2;
        } else {
            e1.t tVar2 = e1.t.f53496b;
            e1.v vVar4 = i13 != 0 ? tVar2 : vVar2;
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(267258467, i14, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.DEC (DEC.kt:36)");
            }
            e1.v vVarFillMaxSize$default = h3.fillMaxSize$default(vVar4, 0.0f, 1, null);
            l0 l0Var = m0.f68918b;
            e1.v vVarM3708clickableXHw0xAI$default = k0.m3708clickableXHw0xAI$default(d0.k.m3704backgroundbw27NRU$default(vVarFillMaxSize$default, l0Var.m4825getBlack0d7_KjU(), null, 2, null), false, null, null, onClick, 7, null);
            g0.h center = g0.u.f56588a.getCenter();
            e1.b centerHorizontally = e1.d.f53469a.getCenterHorizontally();
            wVarStartRestartGroup.startReplaceableGroup(-483455358);
            x1.x0 x0VarColumnMeasurePolicy = g0.i0.columnMeasurePolicy(center, centerHorizontally, wVarStartRestartGroup, 54);
            s2.e eVar = (s2.e) a.b.d(wVarStartRestartGroup, -1323940314);
            s2.x xVar = (s2.x) wVarStartRestartGroup.consume(a3.getLocalLayoutDirection());
            g5 g5Var = (g5) wVarStartRestartGroup.consume(a3.getLocalViewConfiguration());
            z1.f fVar = z1.g.Z8;
            kv.a constructor = fVar.getConstructor();
            kv.q qVarMaterializerOf = x1.g0.materializerOf(vVarM3708clickableXHw0xAI$default);
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
            a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, x0VarColumnMeasurePolicy, wVarM5780constructorimpl, eVar));
            a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVarStartRestartGroup, wVarStartRestartGroup), wVarStartRestartGroup, 2058660585);
            wVarStartRestartGroup.startReplaceableGroup(-1163856341);
            e1.v vVar5 = vVar4;
            b7.c0.m132AsyncImage3HmZ8SU(str, null, h3.m3905size3ABfNKs(tVar2, s2.i.m6817constructorimpl(128)), null, null, null, null, 0.0f, null, 0, wVarStartRestartGroup, ((i14 >> 3) & 14) | 432, C3227g4.f36758l);
            p0.w wVar2 = wVarStartRestartGroup;
            wVar2.startReplaceableGroup(-707855849);
            if (str2 != null) {
                l3.Spacer(h3.m3891height3ABfNKs(tVar2, s2.i.m6817constructorimpl(12)), wVar2, 6);
                tVar = tVar2;
                n1.m5701TextfLXpl1I(str2, null, l0Var.m4836getWhite0d7_KjU(), 0L, null, c1.f72258c.getBold(), null, 0L, null, null, 0L, r2.a0.f83672b.m6100getEllipsisgIe3tQ8(), false, 2, null, null, wVar2, ((i14 >> 6) & 14) | 196992, 3120, 55258);
                wVar2 = wVar2;
            } else {
                tVar = tVar2;
            }
            wVar2.endReplaceableGroup();
            l3.Spacer(h3.m3891height3ABfNKs(tVar, s2.i.m6817constructorimpl(8)), wVar2, 6);
            p0.w wVar3 = wVar2;
            wVarStartRestartGroup = wVar3;
            str4 = str3;
            n0.h.Button(onClick, null, false, null, null, k0.i.getCircleShape(), null, n0.b.f74975a.m5643buttonColorsro_MJ88(f48806a, f48807b, 0L, 0L, wVar3, 54, 12), null, z0.u.composableLambda(wVarStartRestartGroup, 1091822665, true, new a(str4)), wVarStartRestartGroup, ((i14 >> 12) & 14) | 805306368, 350);
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endNode();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endReplaceableGroup();
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
            vVar3 = vVar5;
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            final String str5 = str4;
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.y
                @Override // kv.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return z.a(vVar3, str, str2, str5, onClick, i10, i11, (p0.w) obj, iIntValue);
                }
            });
        }
    }

    public static final void a(p0.w wVar, int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-227963495);
        if (i10 == 0 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-227963495, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.DECPreview (DEC.kt:89)");
            }
            n0.m0.MaterialTheme(null, null, null, t.f48744a.a(), wVarStartRestartGroup, 3072, 7);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a(i10, 1));
        }
    }
}
