package c8;

import android.graphics.PointF;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class i implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f11885a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final d8.a f11886b = d8.a.of(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, InneractiveMediationDefs.GENDER_FEMALE, ApsMetricsDataMap.APSMETRICS_FIELD_SDK, "j", "tr", "lh", SUvoXnn.AIsplhAiOnUrt, "fc", "sc", "sw", "of", "ps", "sz");

    @Override // c8.l0
    public x7.c parse(d8.c cVar, float f10) throws IOException {
        cVar.beginObject();
        x7.b bVar = x7.b.f91757b;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        x7.b bVar2 = bVar;
        int iNextInt = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zNextBoolean = true;
        while (cVar.hasNext()) {
            switch (cVar.selectName(f11886b)) {
                case 0:
                    strNextString = cVar.nextString();
                    break;
                case 1:
                    strNextString2 = cVar.nextString();
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = cVar.nextInt();
                    if (iNextInt2 <= 2 && iNextInt2 >= 0) {
                        bVar2 = x7.b.values()[iNextInt2];
                        break;
                    } else {
                        bVar2 = bVar;
                        break;
                    }
                    break;
                case 4:
                    iNextInt = cVar.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) cVar.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) cVar.nextDouble();
                    break;
                case 7:
                    iA = s.a(cVar);
                    break;
                case 8:
                    iA2 = s.a(cVar);
                    break;
                case 9:
                    fNextDouble4 = (float) cVar.nextDouble();
                    break;
                case 10:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case 11:
                    cVar.beginArray();
                    PointF pointF3 = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                    cVar.endArray();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.beginArray();
                    PointF pointF4 = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                    cVar.endArray();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.skipName();
                    cVar.skipValue();
                    break;
            }
        }
        cVar.endObject();
        return new x7.c(strNextString, strNextString2, fNextDouble, bVar2, iNextInt, fNextDouble2, fNextDouble3, iA, iA2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
