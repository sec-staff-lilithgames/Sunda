package g0;

import a2.g5;
import p0.a6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x1.x0 f56484a;

    static {
        float fMo3858getSpacingD9Ej5fM = u.f56588a.getTop().mo3858getSpacingD9Ej5fM();
        l0 l0VarHorizontal$foundation_layout_release = l0.f56514a.horizontal$foundation_layout_release(e1.d.f53469a.getStart());
        i3 i3Var = i3.f56486b;
        f56484a = q2.m3926rowColumnMeasurePolicyTDGSqEk(b2.f56365c, g0.f56428e, fMo3858getSpacingD9Ej5fM, i3Var, l0VarHorizontal$foundation_layout_release);
    }

    public static final void Column(e1.v vVar, o oVar, e1.b bVar, kv.q content, p0.w wVar, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        wVar.startReplaceableGroup(-483455358);
        if ((i11 & 1) != 0) {
            vVar = e1.t.f53496b;
        }
        if ((i11 & 2) != 0) {
            oVar = u.f56588a.getTop();
        }
        if ((i11 & 4) != 0) {
            bVar = e1.d.f53469a.getStart();
        }
        x1.x0 x0VarColumnMeasurePolicy = columnMeasurePolicy(oVar, bVar, wVar, (i10 >> 3) & 126);
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
        a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, x0VarColumnMeasurePolicy, wVarM5780constructorimpl, eVar));
        a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVar, wVar), wVar, 2058660585);
        wVar.startReplaceableGroup(-1163856341);
        content.invoke(k0.f56494a, wVar, Integer.valueOf(((i10 >> 6) & 112) | 6));
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
        wVar.endNode();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
    }

    public static final x1.x0 columnMeasurePolicy(o verticalArrangement, e1.b horizontalAlignment, p0.w wVar, int i10) {
        x1.x0 x0VarM3926rowColumnMeasurePolicyTDGSqEk;
        kotlin.jvm.internal.e0.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        kotlin.jvm.internal.e0.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        wVar.startReplaceableGroup(1089876336);
        wVar.startReplaceableGroup(511388516);
        boolean zChanged = wVar.changed(verticalArrangement) | wVar.changed(horizontalAlignment);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            if (kotlin.jvm.internal.e0.areEqual(verticalArrangement, u.f56588a.getTop()) && kotlin.jvm.internal.e0.areEqual(horizontalAlignment, e1.d.f53469a.getStart())) {
                x0VarM3926rowColumnMeasurePolicyTDGSqEk = f56484a;
            } else {
                float fMo3858getSpacingD9Ej5fM = verticalArrangement.mo3858getSpacingD9Ej5fM();
                l0 l0VarHorizontal$foundation_layout_release = l0.f56514a.horizontal$foundation_layout_release(horizontalAlignment);
                x0VarM3926rowColumnMeasurePolicyTDGSqEk = q2.m3926rowColumnMeasurePolicyTDGSqEk(b2.f56365c, new h0(verticalArrangement), fMo3858getSpacingD9Ej5fM, i3.f56486b, l0VarHorizontal$foundation_layout_release);
            }
            objRememberedValue = x0VarM3926rowColumnMeasurePolicyTDGSqEk;
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        x1.x0 x0Var = (x1.x0) objRememberedValue;
        wVar.endReplaceableGroup();
        return x0Var;
    }

    public static final x1.x0 getDefaultColumnMeasurePolicy() {
        return f56484a;
    }

    public static /* synthetic */ void getDefaultColumnMeasurePolicy$annotations() {
    }
}
