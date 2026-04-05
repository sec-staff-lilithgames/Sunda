package b7;

import a2.v3;
import androidx.core.app.NotificationCompat;
import j1.y0;
import l7.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f8882a = new q();

    public static void a(String str) {
        throw new IllegalArgumentException(a.b.m("Unsupported type: ", str, ". ", a.b.l("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    /* renamed from: access$toSizeOrNull-uvyYCjk, reason: not valid java name */
    public static final m7.j m141access$toSizeOrNulluvyYCjk(long j10) {
        if (j10 == i1.o.f59366b.m4238getUnspecifiedNHjbRc()) {
            return m7.j.f74065c;
        }
        if (i1.o.m4252getWidthimpl(j10) < 0.5d || i1.o.m4249getHeightimpl(j10) < 0.5d) {
            return null;
        }
        float fM4252getWidthimpl = i1.o.m4252getWidthimpl(j10);
        m7.c cVarDimension = (Float.isInfinite(fM4252getWidthimpl) || Float.isNaN(fM4252getWidthimpl)) ? m7.d.f74053a : m7.a.Dimension(mv.d.roundToInt(i1.o.m4252getWidthimpl(j10)));
        float fM4249getHeightimpl = i1.o.m4249getHeightimpl(j10);
        return new m7.j(cVarDimension, (Float.isInfinite(fM4249getHeightimpl) || Float.isNaN(fM4249getHeightimpl)) ? m7.d.f74053a : m7.a.Dimension(mv.d.roundToInt(i1.o.m4249getHeightimpl(j10))));
    }

    /* renamed from: rememberAsyncImagePainter-3HmZ8SU, reason: not valid java name */
    public static final i m142rememberAsyncImagePainter3HmZ8SU(Object obj, a7.m mVar, m1.e eVar, m1.e eVar2, m1.e eVar3, kv.l lVar, kv.l lVar2, kv.l lVar3, x1.r rVar, int i10, p0.w wVar, int i11, int i12) {
        wVar.startReplaceableGroup(2140758544);
        if ((i12 & 4) != 0) {
            eVar = null;
        }
        m1.e eVar4 = (i12 & 8) != 0 ? null : eVar2;
        m1.e eVar5 = (i12 & 16) != 0 ? eVar4 : eVar3;
        kv.l lVar4 = (i12 & 32) != 0 ? null : lVar;
        kv.l lVar5 = (i12 & 64) != 0 ? null : lVar2;
        kv.l lVar6 = (i12 & 128) == 0 ? lVar3 : null;
        x1.r fit = (i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? x1.r.f91409a.getFit() : rVar;
        int iM5345getDefaultFilterQualityfv9h1I = (i12 & 512) != 0 ? l1.i.O8.m5345getDefaultFilterQualityfv9h1I() : i10;
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(2140758544, i11, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:86)");
        }
        int i13 = i11 >> 12;
        i iVarM143rememberAsyncImagePainter5jETZwI = m143rememberAsyncImagePainter5jETZwI(obj, mVar, f0.transformOf(eVar, eVar4, eVar5), f0.onStateOf(lVar4, lVar5, lVar6), fit, iM5345getDefaultFilterQualityfv9h1I, wVar, (57344 & i13) | 72 | (i13 & 458752), 0);
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return iVarM143rememberAsyncImagePainter5jETZwI;
    }

    /* renamed from: rememberAsyncImagePainter-5jETZwI, reason: not valid java name */
    public static final i m143rememberAsyncImagePainter5jETZwI(Object obj, a7.m mVar, kv.l lVar, kv.l lVar2, x1.r rVar, int i10, p0.w wVar, int i11, int i12) {
        wVar.startReplaceableGroup(-2020614074);
        if ((i12 & 4) != 0) {
            lVar = i.f8845w.getDefaultTransform();
        }
        if ((i12 & 8) != 0) {
            lVar2 = null;
        }
        if ((i12 & 16) != 0) {
            rVar = x1.r.f91409a.getFit();
        }
        if ((i12 & 32) != 0) {
            i10 = l1.i.O8.m5345getDefaultFilterQualityfv9h1I();
        }
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-2020614074, i11, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:131)");
        }
        l7.i iVarRequestOf = f0.requestOf(obj, wVar, 8);
        Object data = iVarRequestOf.getData();
        if (data instanceof i.a) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (data instanceof y0) {
            a("ImageBitmap");
            throw null;
        }
        if (data instanceof n1.c) {
            a("ImageVector");
            throw null;
        }
        if (data instanceof m1.e) {
            a("Painter");
            throw null;
        }
        if (iVarRequestOf.getTarget() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new i(iVarRequestOf, mVar);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        i iVar = (i) objRememberedValue;
        iVar.setTransform$coil_compose_base_release(lVar);
        iVar.setOnState$coil_compose_base_release(lVar2);
        iVar.setContentScale$coil_compose_base_release(rVar);
        iVar.m139setFilterQualityvDHp3xo$coil_compose_base_release(i10);
        iVar.setPreview$coil_compose_base_release(((Boolean) wVar.consume(v3.getLocalInspectionMode())).booleanValue());
        iVar.setImageLoader$coil_compose_base_release(mVar);
        iVar.setRequest$coil_compose_base_release(iVarRequestOf);
        iVar.onRemembered();
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return iVar;
    }
}
