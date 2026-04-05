package b7;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j1.n0;
import p0.o4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c0 {
    /* renamed from: AsyncImage-3HmZ8SU, reason: not valid java name */
    public static final void m132AsyncImage3HmZ8SU(Object obj, String str, e1.v vVar, kv.l lVar, kv.l lVar2, e1.d dVar, x1.r rVar, float f10, n0 n0Var, int i10, p0.w wVar, int i11, int i12) {
        int i13;
        kv.l defaultTransform;
        int i14;
        int iM5345getDefaultFilterQualityfv9h1I;
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-941517612);
        e1.v vVar2 = (i12 & 4) != 0 ? e1.t.f53496b : vVar;
        if ((i12 & 8) != 0) {
            i13 = i11;
            defaultTransform = i.f8845w.getDefaultTransform();
            i14 = i13 & (-7169);
        } else {
            i13 = i11;
            defaultTransform = lVar;
            i14 = i13;
        }
        kv.l lVar3 = (i12 & 16) != 0 ? null : lVar2;
        e1.d center = (i12 & 32) != 0 ? e1.d.f53469a.getCenter() : dVar;
        x1.r fit = (i12 & 64) != 0 ? x1.r.f91409a.getFit() : rVar;
        float f11 = (i12 & 128) != 0 ? 1.0f : f10;
        n0 n0Var2 = (i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : n0Var;
        if ((i12 & 512) != 0) {
            i14 &= -1879048193;
            iM5345getDefaultFilterQualityfv9h1I = l1.i.O8.m5345getDefaultFilterQualityfv9h1I();
        } else {
            iM5345getDefaultFilterQualityfv9h1I = i10;
        }
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-941517612, i14, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:99)");
        }
        int i15 = i14 << 3;
        c.m129AsyncImageMvsnxeU(obj, str, y.getCurrent(z.getLocalImageLoader(), wVarStartRestartGroup, 6), vVar2, defaultTransform, lVar3, center, fit, f11, n0Var2, iM5345getDefaultFilterQualityfv9h1I, wVarStartRestartGroup, (i14 & 112) | IronSourceError.ERROR_NO_INTERNET_CONNECTION | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192), (i14 >> 27) & 14, 0);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new b0(obj, str, vVar2, defaultTransform, lVar3, center, fit, f11, n0Var2, iM5345getDefaultFilterQualityfv9h1I, i13, i12));
    }

    /* renamed from: AsyncImage-ylYTKUw, reason: not valid java name */
    public static final void m133AsyncImageylYTKUw(Object obj, String str, e1.v vVar, m1.e eVar, m1.e eVar2, m1.e eVar3, kv.l lVar, kv.l lVar2, kv.l lVar3, e1.d dVar, x1.r rVar, float f10, n0 n0Var, int i10, p0.w wVar, int i11, int i12, int i13) {
        m1.e eVar4;
        int i14;
        int iM5345getDefaultFilterQualityfv9h1I;
        int i15;
        e1.v vVar2;
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(2027616330);
        e1.v vVar3 = (i13 & 4) != 0 ? e1.t.f53496b : vVar;
        m1.e eVar5 = (i13 & 8) != 0 ? null : eVar;
        m1.e eVar6 = (i13 & 16) != 0 ? null : eVar2;
        if ((i13 & 32) != 0) {
            i14 = i11 & (-458753);
            eVar4 = eVar6;
        } else {
            eVar4 = eVar3;
            i14 = i11;
        }
        kv.l lVar4 = (i13 & 64) != 0 ? null : lVar;
        kv.l lVar5 = (i13 & 128) != 0 ? null : lVar2;
        kv.l lVar6 = (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : lVar3;
        e1.d center = (i13 & 512) != 0 ? e1.d.f53469a.getCenter() : dVar;
        x1.r fit = (i13 & 1024) != 0 ? x1.r.f91409a.getFit() : rVar;
        float f11 = (i13 & 2048) != 0 ? 1.0f : f10;
        n0 n0Var2 = (i13 & 4096) != 0 ? null : n0Var;
        if ((i13 & Segment.SIZE) != 0) {
            iM5345getDefaultFilterQualityfv9h1I = l1.i.O8.m5345getDefaultFilterQualityfv9h1I();
            i15 = i12 & (-7169);
        } else {
            iM5345getDefaultFilterQualityfv9h1I = i10;
            i15 = i12;
        }
        if (p0.d0.isTraceInProgress()) {
            vVar2 = vVar3;
            p0.d0.traceEventStart(2027616330, i14, i15, "coil.compose.AsyncImage (SingletonAsyncImage.kt:43)");
        } else {
            vVar2 = vVar3;
        }
        int i16 = i15;
        int i17 = i14 << 3;
        int i18 = (i17 & 7168) | (i14 & 112) | 2392584 | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192);
        int i19 = i16 << 3;
        int i20 = ((i14 >> 27) & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (i19 & 57344);
        int i21 = iM5345getDefaultFilterQualityfv9h1I;
        m1.e eVar7 = eVar4;
        e1.v vVar4 = vVar2;
        m1.e eVar8 = eVar5;
        c.m130AsyncImageQ4Kwu38(obj, str, y.getCurrent(z.getLocalImageLoader(), wVarStartRestartGroup, 6), vVar4, eVar8, eVar6, eVar7, lVar4, lVar5, lVar6, center, fit, f11, n0Var2, i21, wVarStartRestartGroup, i18, i20, 0);
        m1.e eVar9 = eVar6;
        kv.l lVar7 = lVar4;
        kv.l lVar8 = lVar5;
        kv.l lVar9 = lVar6;
        e1.d dVar2 = center;
        x1.r rVar2 = fit;
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new a0(obj, str, vVar4, eVar8, eVar9, eVar7, lVar7, lVar8, lVar9, dVar2, rVar2, f11, n0Var2, i21, i11, i12, i13));
    }
}
