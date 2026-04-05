package c8;

import android.graphics.PointF;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final d8.a f11871a = d8.a.of("a", "p", ApsMetricsDataMap.APSMETRICS_FIELD_SDK, "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");

    /* renamed from: b, reason: collision with root package name */
    public static final d8.a f11872b = d8.a.of(CampaignEx.JSON_KEY_AD_K);

    public static void a(y7.b bVar, r7.h hVar) {
        Float fValueOf = Float.valueOf(0.0f);
        if (bVar.getKeyframes().isEmpty()) {
            bVar.getKeyframes().add(new f8.a(hVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(hVar.getEndFrame())));
        } else if (((f8.a) bVar.getKeyframes().get(0)).f55489b == null) {
            bVar.getKeyframes().set(0, new f8.a(hVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(hVar.getEndFrame())));
        }
    }

    public static boolean b(y7.b bVar) {
        if (bVar != null) {
            return bVar.isStatic() && ((Float) ((f8.a) bVar.getKeyframes().get(0)).f55489b).floatValue() == 0.0f;
        }
        return true;
    }

    public static y7.n parse(d8.c cVar, r7.h hVar) throws IOException {
        boolean z10 = cVar.peek() == d8.b.f51926e;
        if (z10) {
            cVar.beginObject();
        }
        y7.e eVar = null;
        y7.o oVarA = null;
        y7.b bVar = null;
        y7.g gVar = null;
        y7.b bVar2 = null;
        y7.b bVar3 = null;
        y7.b bVar4 = null;
        y7.b bVar5 = null;
        y7.b bVar6 = null;
        y7.d dVarB = null;
        y7.b bVar7 = null;
        y7.b bVar8 = null;
        while (cVar.hasNext()) {
            switch (cVar.selectName(f11871a)) {
                case 0:
                    cVar.beginObject();
                    while (cVar.hasNext()) {
                        if (cVar.selectName(f11872b) != 0) {
                            cVar.skipName();
                            cVar.skipValue();
                        } else {
                            eVar = a.parse(cVar, hVar);
                        }
                    }
                    cVar.endObject();
                    break;
                case 1:
                    oVarA = a.a(cVar, hVar);
                    break;
                case 2:
                    gVar = new y7.g(u.a(cVar, hVar, 1.0f, e0.f11877a, false));
                    break;
                case 3:
                    bVar6 = d.parseFloat(cVar, hVar, false);
                    a(bVar6, hVar);
                    break;
                case 4:
                    bVar = d.parseFloat(cVar, hVar, false);
                    a(bVar, hVar);
                    break;
                case 5:
                    dVarB = d.b(cVar, hVar);
                    break;
                case 6:
                    bVar7 = d.parseFloat(cVar, hVar, false);
                    break;
                case 7:
                    bVar8 = d.parseFloat(cVar, hVar, false);
                    break;
                case 8:
                    bVar2 = d.parseFloat(cVar, hVar, false);
                    break;
                case 9:
                    bVar3 = d.parseFloat(cVar, hVar, false);
                    break;
                case 10:
                    bVar4 = d.parseFloat(cVar, hVar, false);
                    a(bVar4, hVar);
                    break;
                case 11:
                    bVar5 = d.parseFloat(cVar, hVar, false);
                    a(bVar5, hVar);
                    break;
                default:
                    cVar.skipName();
                    cVar.skipValue();
                    break;
            }
        }
        if (z10) {
            cVar.endObject();
        }
        if (eVar == null || (eVar.isStatic() && ((PointF) eVar.getKeyframes().get(0).f55489b).equals(0.0f, 0.0f))) {
            eVar = null;
        }
        return new y7.n(eVar, (oVarA == null || (!(oVarA instanceof y7.i) && oVarA.isStatic() && ((PointF) oVarA.getKeyframes().get(0).f55489b).equals(0.0f, 0.0f))) ? null : oVarA, (gVar == null || (gVar.isStatic() && ((f8.d) ((f8.a) gVar.getKeyframes().get(0)).f55489b).equals(1.0f, 1.0f))) ? null : gVar, b(bVar) ? null : bVar, dVarB, bVar7, bVar8, (bVar2 == null || (bVar2.isStatic() && ((Float) ((f8.a) bVar2.getKeyframes().get(0)).f55489b).floatValue() == 0.0f)) ? null : bVar2, (bVar3 == null || (bVar3.isStatic() && ((Float) ((f8.a) bVar3.getKeyframes().get(0)).f55489b).floatValue() == 0.0f)) ? null : bVar3, b(bVar4) ? null : bVar4, b(bVar5) ? null : bVar5, b(bVar6) ? null : bVar6);
    }
}
