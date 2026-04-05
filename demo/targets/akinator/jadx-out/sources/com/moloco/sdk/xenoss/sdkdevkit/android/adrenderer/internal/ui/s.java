package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import a2.a3;
import a2.g5;
import j1.m0;
import p0.a6;
import x1.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f48741a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final z0.b f48742b = z0.u.composableLambdaInstance(1940910509, false, a.f48743b);

    public final kv.p a() {
        return f48742b;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final a f48743b = new a();

        public final void a(p0.w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(1940910509, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.ComposableSingletons$AdBadgeKt.lambda-1.<anonymous> (AdBadge.kt:167)");
            }
            long jM4836getWhite0d7_KjU = m0.f68918b.m4836getWhite0d7_KjU();
            e1.t tVar = e1.t.f53496b;
            e1.v vVarM3704backgroundbw27NRU$default = d0.k.m3704backgroundbw27NRU$default(tVar, jM4836getWhite0d7_KjU, null, 2, null);
            wVar.startReplaceableGroup(733328855);
            x0 x0VarRememberBoxMeasurePolicy = g0.d0.rememberBoxMeasurePolicy(e1.d.f53469a.getTopStart(), false, wVar, 0);
            wVar.startReplaceableGroup(-1323940314);
            s2.e eVar = (s2.e) wVar.consume(a3.getLocalDensity());
            s2.x xVar = (s2.x) wVar.consume(a3.getLocalLayoutDirection());
            g5 g5Var = (g5) wVar.consume(a3.getLocalViewConfiguration());
            z1.f fVar = z1.g.Z8;
            kv.a constructor = fVar.getConstructor();
            kv.q qVarMaterializerOf = x1.g0.materializerOf(vVarM3704backgroundbw27NRU$default);
            if (wVar.getApplier() == null) {
                p0.p.invalidApplier();
            }
            wVar.startReusableNode();
            if (wVar.getInserting()) {
                wVar.createNode(constructor);
            } else {
                wVar.useNode();
            }
            wVar.disableReusing();
            p0.w wVarM5780constructorimpl = a6.m5780constructorimpl(wVar);
            a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, x0VarRememberBoxMeasurePolicy, wVarM5780constructorimpl, eVar));
            a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVar, wVar), wVar, 2058660585);
            wVar.startReplaceableGroup(-2137368960);
            wVar.startReplaceableGroup(1108309980);
            Object objRememberedValue = wVar.rememberedValue();
            if (objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new a1.o(17);
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            e.a(tVar, "", (kv.l) objRememberedValue, wVar, 438, 0);
            wVar.endReplaceableGroup();
            wVar.endReplaceableGroup();
            wVar.endNode();
            wVar.endReplaceableGroup();
            wVar.endReplaceableGroup();
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p0.w) obj, ((Number) obj2).intValue());
            return tu.x0.f87415a;
        }

        public static final tu.x0 a(String it) {
            kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
            return tu.x0.f87415a;
        }
    }
}
