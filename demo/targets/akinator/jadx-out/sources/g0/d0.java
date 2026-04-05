package g0;

import a2.g5;
import p0.a6;
import p0.o4;
import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x1.x0 f56379a = boxMeasurePolicy(e1.d.f53469a.getTopStart(), false);

    /* renamed from: b, reason: collision with root package name */
    public static final y f56380b = y.f56652a;

    public static final void Box(e1.v vVar, e1.d dVar, boolean z10, kv.q content, p0.w wVar, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        wVar.startReplaceableGroup(733328855);
        if ((i11 & 1) != 0) {
            vVar = e1.t.f53496b;
        }
        if ((i11 & 2) != 0) {
            dVar = e1.d.f53469a.getTopStart();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        x1.x0 x0VarRememberBoxMeasurePolicy = rememberBoxMeasurePolicy(dVar, z10, wVar, (i10 >> 3) & 126);
        s2.e eVar = (s2.e) a.b.d(wVar, -1323940314);
        s2.x xVar = (s2.x) wVar.consume(a2.a3.getLocalLayoutDirection());
        g5 g5Var = (g5) wVar.consume(a2.a3.getLocalViewConfiguration());
        z1.f fVar = z1.g.Z8;
        kv.a constructor = fVar.getConstructor();
        kv.q qVarMaterializerOf = x1.g0.materializerOf(vVar);
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
        content.invoke(f0.f56407a, wVar, Integer.valueOf(((i10 >> 6) & 112) | 6));
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endNode();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
    }

    public static final boolean access$getMatchesParentSize(x1.w0 w0Var) {
        Object parentData = w0Var.getParentData();
        v vVar = parentData instanceof v ? (v) parentData : null;
        if (vVar != null) {
            return vVar.getMatchParentSize();
        }
        return false;
    }

    public static final void access$placeInBox(q1.a aVar, x1.q1 q1Var, x1.w0 w0Var, s2.x xVar, int i10, int i11, e1.d dVar) {
        e1.d alignment;
        Object parentData = w0Var.getParentData();
        v vVar = parentData instanceof v ? (v) parentData : null;
        q1.a.m7839place70tqf50$default(aVar, q1Var, ((vVar == null || (alignment = vVar.getAlignment()) == null) ? dVar : alignment).mo3802alignKFBX0sM(s2.w.IntSize(q1Var.getWidth(), q1Var.getHeight()), s2.w.IntSize(i10, i11), xVar), 0.0f, 2, null);
    }

    public static final x1.x0 boxMeasurePolicy(e1.d alignment, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        return new c0(alignment, z10);
    }

    public static final x1.x0 getDefaultBoxMeasurePolicy() {
        return f56379a;
    }

    public static final x1.x0 getEmptyBoxMeasurePolicy() {
        return f56380b;
    }

    public static final x1.x0 rememberBoxMeasurePolicy(e1.d alignment, boolean z10, p0.w wVar, int i10) {
        x1.x0 x0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        wVar.startReplaceableGroup(56522820);
        if (!kotlin.jvm.internal.e0.areEqual(alignment, e1.d.f53469a.getTopStart()) || z10) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            wVar.startReplaceableGroup(511388516);
            boolean zChanged = wVar.changed(boolValueOf) | wVar.changed(alignment);
            Object objRememberedValue = wVar.rememberedValue();
            if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = boxMeasurePolicy(alignment, z10);
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            x0Var = (x1.x0) objRememberedValue;
        } else {
            x0Var = f56379a;
        }
        wVar.endReplaceableGroup();
        return x0Var;
    }

    public static final void Box(e1.v modifier, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-211209833);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            s2.e eVar = (s2.e) a.b.d(wVarStartRestartGroup, -1323940314);
            s2.x xVar = (s2.x) wVarStartRestartGroup.consume(a2.a3.getLocalLayoutDirection());
            g5 g5Var = (g5) wVarStartRestartGroup.consume(a2.a3.getLocalViewConfiguration());
            z1.f fVar = z1.g.Z8;
            kv.a constructor = fVar.getConstructor();
            kv.q qVarMaterializerOf = x1.g0.materializerOf(modifier);
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
            a6.m5787setimpl(wVarM5780constructorimpl, f56380b, fVar.getSetMeasurePolicy());
            a6.m5787setimpl(wVarM5780constructorimpl, eVar, fVar.getSetDensity());
            a6.m5787setimpl(wVarM5780constructorimpl, xVar, fVar.getSetLayoutDirection());
            a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVarStartRestartGroup, wVarStartRestartGroup), wVarStartRestartGroup, 2058660585);
            wVarStartRestartGroup.startReplaceableGroup(1021196736);
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endNode();
            wVarStartRestartGroup.endReplaceableGroup();
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new w(modifier, i10));
    }
}
