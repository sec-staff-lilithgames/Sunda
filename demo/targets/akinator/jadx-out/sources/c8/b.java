package c8;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.IOException;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final d8.a f11867a = d8.a.of(ApsMetricsDataMap.APSMETRICS_FIELD_SDK, "a");

    /* renamed from: b, reason: collision with root package name */
    public static final d8.a f11868b = d8.a.of(ApsMetricsDataMap.APSMETRICS_FIELD_SDK, "e", "o", "r");

    /* renamed from: c, reason: collision with root package name */
    public static final d8.a f11869c = d8.a.of("fc", "sc", "sw", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "o");

    public static y7.k parse(d8.c cVar, r7.h hVar) throws IOException {
        cVar.beginObject();
        y7.m mVar = null;
        y7.l lVar = null;
        while (cVar.hasNext()) {
            int iSelectName = cVar.selectName(f11867a);
            if (iSelectName == 0) {
                cVar.beginObject();
                y7.d dVar = null;
                y7.d dVarB = null;
                y7.d dVarB2 = null;
                z7.a0 a0Var = null;
                while (cVar.hasNext()) {
                    int iSelectName2 = cVar.selectName(f11868b);
                    if (iSelectName2 == 0) {
                        dVar = d.b(cVar, hVar);
                    } else if (iSelectName2 == 1) {
                        dVarB = d.b(cVar, hVar);
                    } else if (iSelectName2 == 2) {
                        dVarB2 = d.b(cVar, hVar);
                    } else if (iSelectName2 != 3) {
                        cVar.skipName();
                        cVar.skipValue();
                    } else {
                        int iNextInt = cVar.nextInt();
                        z7.a0 a0Var2 = z7.a0.f97571c;
                        if (iNextInt != 1 && iNextInt != 2) {
                            hVar.addWarning("Unsupported text range units: " + iNextInt);
                        } else if (iNextInt == 1) {
                            a0Var = z7.a0.f97570b;
                        }
                        a0Var = a0Var2;
                    }
                }
                cVar.endObject();
                if (dVar == null && dVarB != null) {
                    dVar = new y7.d(Collections.singletonList(new f8.a(0)));
                }
                lVar = new y7.l(dVar, dVarB, dVarB2, a0Var);
            } else if (iSelectName != 1) {
                cVar.skipName();
                cVar.skipValue();
            } else {
                cVar.beginObject();
                y7.a aVarA = null;
                y7.a aVarA2 = null;
                y7.b bVar = null;
                y7.b bVar2 = null;
                y7.d dVarB3 = null;
                while (cVar.hasNext()) {
                    int iSelectName3 = cVar.selectName(f11869c);
                    if (iSelectName3 == 0) {
                        aVarA = d.a(cVar, hVar);
                    } else if (iSelectName3 == 1) {
                        aVarA2 = d.a(cVar, hVar);
                    } else if (iSelectName3 == 2) {
                        bVar = d.parseFloat(cVar, hVar);
                    } else if (iSelectName3 == 3) {
                        bVar2 = d.parseFloat(cVar, hVar);
                    } else if (iSelectName3 != 4) {
                        cVar.skipName();
                        cVar.skipValue();
                    } else {
                        dVarB3 = d.b(cVar, hVar);
                    }
                }
                cVar.endObject();
                mVar = new y7.m(aVarA, aVarA2, bVar, bVar2, dVarB3);
            }
        }
        cVar.endObject();
        return new y7.k(mVar, lVar);
    }
}
