package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import a2.a3;
import a2.g5;
import com.digidust.elokence.akinator.freemium.R;
import j1.f2;
import j1.l0;
import j1.m0;
import j1.y1;
import p0.a6;
import x1.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f48762a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final z0.b f48763b = z0.u.composableLambdaInstance(253636918, false, a.f48764b);

    public final kv.p a() {
        return f48763b;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final a f48764b = new a();

        public final void a(p0.w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(253636918, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.ComposableSingletons$GenericIconButtonKt.lambda-1.<anonymous> (GenericIconButton.kt:75)");
            }
            e1.d center = e1.d.f53469a.getCenter();
            wVar.startReplaceableGroup(733328855);
            x0 x0VarRememberBoxMeasurePolicy = g0.d0.rememberBoxMeasurePolicy(center, false, wVar, 6);
            s2.e eVar = (s2.e) a.b.d(wVar, -1323940314);
            s2.x xVar = (s2.x) wVar.consume(a3.getLocalLayoutDirection());
            g5 g5Var = (g5) wVar.consume(a3.getLocalViewConfiguration());
            z1.f fVar = z1.g.Z8;
            kv.a constructor = fVar.getConstructor();
            kv.q qVarMaterializerOf = x1.g0.materializerOf(e1.t.f53496b);
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
            m1.e eVarPainterResource = d2.c.painterResource(R.drawable.ic_round_skip_next_24, wVar, 0);
            l0 l0Var = m0.f68918b;
            long jM4836getWhite0d7_KjU = l0Var.m4836getWhite0d7_KjU();
            f2 rectangleShape = y1.getRectangleShape();
            long jM4826getBlue0d7_KjU = l0Var.m4826getBlue0d7_KjU();
            float f10 = 40;
            long jM6833DpSizeYgX7TsA = s2.j.m6833DpSizeYgX7TsA(s2.i.m6817constructorimpl(f10), s2.i.m6817constructorimpl(f10));
            wVar.startReplaceableGroup(-852323356);
            Object objRememberedValue = wVar.rememberedValue();
            if (objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new com.moloco.sdk.service_locator.b(9);
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            c0.a(eVarPainterResource, (kv.a) objRememberedValue, null, false, null, jM4826getBlue0d7_KjU, jM6833DpSizeYgX7TsA, 0L, rectangleShape, jM4836getWhite0d7_KjU, wVar, 907739184, 156);
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

        public static final tu.x0 a() {
            return tu.x0.f87415a;
        }
    }
}
