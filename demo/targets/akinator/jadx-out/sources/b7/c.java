package b7;

import a2.a3;
import a2.g5;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j1.n0;
import p0.a6;
import p0.o4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.a f8825e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.a aVar) {
            super(0);
            this.f8825e = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, z1.g] */
        @Override // kv.a
        public final z1.g invoke() {
            return this.f8825e.invoke();
        }
    }

    /* renamed from: AsyncImage-MvsnxeU, reason: not valid java name */
    public static final void m129AsyncImageMvsnxeU(Object obj, String str, a7.m mVar, e1.v vVar, kv.l lVar, kv.l lVar2, e1.d dVar, x1.r rVar, float f10, n0 n0Var, int i10, p0.w wVar, int i11, int i12, int i13) {
        int iM5345getDefaultFilterQualityfv9h1I;
        int i14;
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-2030202961);
        e1.v vVar2 = (i13 & 8) != 0 ? e1.t.f53496b : vVar;
        kv.l defaultTransform = (i13 & 16) != 0 ? i.f8845w.getDefaultTransform() : lVar;
        kv.l lVar3 = (i13 & 32) != 0 ? null : lVar2;
        e1.d center = (i13 & 64) != 0 ? e1.d.f53469a.getCenter() : dVar;
        x1.r fit = (i13 & 128) != 0 ? x1.r.f91409a.getFit() : rVar;
        float f11 = (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 1.0f : f10;
        n0 n0Var2 = (i13 & 512) != 0 ? null : n0Var;
        if ((i13 & 1024) != 0) {
            i14 = i12 & (-15);
            iM5345getDefaultFilterQualityfv9h1I = l1.i.O8.m5345getDefaultFilterQualityfv9h1I();
        } else {
            iM5345getDefaultFilterQualityfv9h1I = i10;
            i14 = i12;
        }
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-2030202961, i11, i14, "coil.compose.AsyncImage (AsyncImage.kt:116)");
        }
        l7.i iVarUpdateRequest = updateRequest(f0.requestOf(obj, wVarStartRestartGroup, 8), fit, wVarStartRestartGroup, 8 | ((i11 >> 18) & 112));
        int i15 = i11 >> 6;
        int i16 = i11 >> 9;
        int i17 = i16 & 57344;
        kv.l lVar4 = defaultTransform;
        kv.l lVar5 = lVar3;
        x1.r rVar2 = fit;
        int i18 = iM5345getDefaultFilterQualityfv9h1I;
        i iVarM143rememberAsyncImagePainter5jETZwI = r.m143rememberAsyncImagePainter5jETZwI(iVarUpdateRequest, mVar, lVar4, lVar5, rVar2, i18, wVarStartRestartGroup, ((i14 << 15) & 458752) | (i15 & 7168) | (i15 & 896) | 72 | i17, 0);
        m7.k sizeResolver = iVarUpdateRequest.getSizeResolver();
        Content(sizeResolver instanceof t ? vVar2.then((e1.v) sizeResolver) : vVar2, iVarM143rememberAsyncImagePainter5jETZwI, str, center, fit, f11, n0Var2, wVarStartRestartGroup, (i16 & 7168) | ((i11 << 3) & 896) | i17 | (i16 & 458752) | (3670016 & i16));
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new b(obj, str, mVar, vVar2, defaultTransform, lVar3, center, fit, f11, n0Var2, iM5345getDefaultFilterQualityfv9h1I, i11, i12, i13));
    }

    /* renamed from: AsyncImage-Q4Kwu38, reason: not valid java name */
    public static final void m130AsyncImageQ4Kwu38(Object obj, String str, a7.m mVar, e1.v vVar, m1.e eVar, m1.e eVar2, m1.e eVar3, kv.l lVar, kv.l lVar2, kv.l lVar3, e1.d dVar, x1.r rVar, float f10, n0 n0Var, int i10, p0.w wVar, int i11, int i12, int i13) {
        m1.e eVar4;
        int i14;
        int iM5345getDefaultFilterQualityfv9h1I;
        int i15;
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-245964807);
        e1.v vVar2 = (i13 & 8) != 0 ? e1.t.f53496b : vVar;
        m1.e eVar5 = (i13 & 16) != 0 ? null : eVar;
        m1.e eVar6 = (i13 & 32) != 0 ? null : eVar2;
        if ((i13 & 64) != 0) {
            i14 = i11 & (-3670017);
            eVar4 = eVar6;
        } else {
            eVar4 = eVar3;
            i14 = i11;
        }
        kv.l lVar4 = (i13 & 128) != 0 ? null : lVar;
        kv.l lVar5 = (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : lVar2;
        kv.l lVar6 = (i13 & 512) != 0 ? null : lVar3;
        e1.d center = (i13 & 1024) != 0 ? e1.d.f53469a.getCenter() : dVar;
        x1.r fit = (i13 & 2048) != 0 ? x1.r.f91409a.getFit() : rVar;
        float f11 = (i13 & 4096) != 0 ? 1.0f : f10;
        n0 n0Var2 = (i13 & Segment.SIZE) == 0 ? n0Var : null;
        if ((i13 & 16384) != 0) {
            iM5345getDefaultFilterQualityfv9h1I = l1.i.O8.m5345getDefaultFilterQualityfv9h1I();
            i15 = i12 & (-57345);
        } else {
            iM5345getDefaultFilterQualityfv9h1I = i10;
            i15 = i12;
        }
        n0 n0Var3 = n0Var2;
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-245964807, i14, i15, "coil.compose.AsyncImage (AsyncImage.kt:62)");
        }
        m1.e eVar7 = eVar4;
        kv.l lVarTransformOf = f0.transformOf(eVar5, eVar6, eVar7);
        kv.l lVarOnStateOf = f0.onStateOf(lVar4, lVar5, lVar6);
        int i16 = i15;
        int i17 = (i14 & 112) | IronSourceError.ERROR_NO_INTERNET_CONNECTION | (i14 & 7168);
        int i18 = i16 << 18;
        m1.e eVar8 = eVar6;
        kv.l lVar7 = lVar4;
        kv.l lVar8 = lVar5;
        kv.l lVar9 = lVar6;
        e1.d dVar2 = center;
        x1.r rVar2 = fit;
        float f12 = f11;
        int i19 = iM5345getDefaultFilterQualityfv9h1I;
        m1.e eVar9 = eVar5;
        e1.v vVar3 = vVar2;
        m129AsyncImageMvsnxeU(obj, str, mVar, vVar3, lVarTransformOf, lVarOnStateOf, dVar2, rVar2, f12, n0Var3, i19, wVarStartRestartGroup, i17 | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192), (i16 >> 12) & 14, 0);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new b7.a(obj, str, mVar, vVar3, eVar9, eVar8, eVar7, lVar7, lVar8, lVar9, dVar2, rVar2, f12, n0Var3, i19, i11, i12, i13));
    }

    public static final void Content(e1.v vVar, m1.e eVar, String str, e1.d dVar, x1.r rVar, float f10, n0 n0Var, p0.w wVar, int i10) {
        int i11;
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(10290533);
        if (p0.d0.isTraceInProgress()) {
            i11 = i10;
            p0.d0.traceEventStart(10290533, i11, -1, "coil.compose.Content (AsyncImage.kt:154)");
        } else {
            i11 = i10;
        }
        e1.v vVarThen = g1.e.clipToBounds(str != null ? e2.v.semantics$default(vVar, false, new g(str), 1, null) : vVar).then(new v(eVar, dVar, rVar, f10, n0Var));
        s2.e eVar2 = (s2.e) a.b.d(wVarStartRestartGroup, 544976794);
        s2.x xVar = (s2.x) wVarStartRestartGroup.consume(a3.getLocalLayoutDirection());
        g5 g5Var = (g5) wVarStartRestartGroup.consume(a3.getLocalViewConfiguration());
        e1.v vVarMaterialize = e1.o.materialize(wVarStartRestartGroup, vVarThen);
        z1.f fVar = z1.g.Z8;
        kv.a constructor = fVar.getConstructor();
        wVarStartRestartGroup.startReplaceableGroup(1405779621);
        if (wVarStartRestartGroup.getApplier() == null) {
            p0.p.invalidApplier();
        }
        wVarStartRestartGroup.startReusableNode();
        if (wVarStartRestartGroup.getInserting()) {
            wVarStartRestartGroup.createNode(new a(constructor));
        } else {
            wVarStartRestartGroup.useNode();
        }
        wVarStartRestartGroup.disableReusing();
        p0.w wVarM5780constructorimpl = a6.m5780constructorimpl(wVarStartRestartGroup);
        a6.m5787setimpl(wVarM5780constructorimpl, e.f8830a, fVar.getSetMeasurePolicy());
        a6.m5787setimpl(wVarM5780constructorimpl, eVar2, fVar.getSetDensity());
        a6.m5787setimpl(wVarM5780constructorimpl, xVar, fVar.getSetLayoutDirection());
        a6.m5787setimpl(wVarM5780constructorimpl, g5Var, fVar.getSetViewConfiguration());
        a6.m5787setimpl(wVarM5780constructorimpl, vVarMaterialize, fVar.getSetModifier());
        wVarStartRestartGroup.enableReusing();
        wVarStartRestartGroup.endNode();
        wVarStartRestartGroup.endReplaceableGroup();
        wVarStartRestartGroup.endReplaceableGroup();
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new f(vVar, eVar, str, dVar, rVar, f10, n0Var, i11));
    }

    /* renamed from: access$toSizeOrNull-BRTryo0, reason: not valid java name */
    public static final m7.j m131access$toSizeOrNullBRTryo0(long j10) {
        if (s2.c.m6759isZeroimpl(j10)) {
            return null;
        }
        return new m7.j(s2.c.m6751getHasBoundedWidthimpl(j10) ? m7.a.Dimension(s2.c.m6755getMaxWidthimpl(j10)) : m7.d.f74053a, s2.c.m6750getHasBoundedHeightimpl(j10) ? m7.a.Dimension(s2.c.m6754getMaxHeightimpl(j10)) : m7.d.f74053a);
    }

    public static final l7.i updateRequest(l7.i iVar, x1.r rVar, p0.w wVar, int i10) {
        m7.k kVarCreate;
        wVar.startReplaceableGroup(402368983);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(402368983, i10, -1, "coil.compose.updateRequest (AsyncImage.kt:181)");
        }
        if (iVar.getDefined().getSizeResolver() == null) {
            if (kotlin.jvm.internal.e0.areEqual(rVar, x1.r.f91409a.getNone())) {
                kVarCreate = m7.l.create(m7.j.f74065c);
            } else {
                wVar.startReplaceableGroup(-492369756);
                Object objRememberedValue = wVar.rememberedValue();
                if (objRememberedValue == p0.v.f80515a.getEmpty()) {
                    objRememberedValue = new t();
                    wVar.updateRememberedValue(objRememberedValue);
                }
                wVar.endReplaceableGroup();
                kVarCreate = (m7.k) objRememberedValue;
            }
            iVar = l7.i.newBuilder$default(iVar, null, 1, null).size(kVarCreate).build();
        }
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return iVar;
    }
}
