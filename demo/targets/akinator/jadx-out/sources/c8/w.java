package c8;

import android.graphics.Rect;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import z.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static final d8.a f11923a = d8.a.of("w", ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, "ip", "op", "fr", ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final d8.a f11924b = d8.a.of("id", "layers", "w", ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, "p", ApsMetricsDataMap.APSMETRICS_FIELD_URL);

    /* renamed from: c, reason: collision with root package name */
    public static final d8.a f11925c = d8.a.of("list");

    /* renamed from: d, reason: collision with root package name */
    public static final d8.a f11926d = d8.a.of("cm", "tm", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE);

    public static r7.h parse(d8.c cVar) throws IOException {
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        float f14;
        float fDpScale = e8.n.dpScale();
        z.x xVar = new z.x();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        u1 u1Var = new u1();
        r7.h hVar = new r7.h();
        cVar.beginObject();
        int iNextDouble = 0;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        int iNextDouble2 = 0;
        float fNextDouble3 = 0.0f;
        while (cVar.hasNext()) {
            switch (cVar.selectName(f11923a)) {
                case 0:
                    iNextDouble2 = (int) cVar.nextDouble();
                    break;
                case 1:
                    iNextDouble = (int) cVar.nextDouble();
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 3:
                    f14 = fDpScale;
                    fNextDouble2 = ((float) cVar.nextDouble()) - 0.01f;
                    fDpScale = f14;
                    break;
                case 4:
                    f14 = fDpScale;
                    fNextDouble3 = (float) cVar.nextDouble();
                    fDpScale = f14;
                    break;
                case 5:
                    f10 = fDpScale;
                    i10 = iNextDouble;
                    f11 = fNextDouble;
                    f12 = fNextDouble2;
                    String[] strArrSplit = cVar.nextString().split("\\.");
                    if (!e8.n.isAtLeastVersion(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        hVar.addWarning("Lottie only supports bodymovin >= 4.4.0");
                    }
                    iNextDouble = i10;
                    fNextDouble = f11;
                    fDpScale = f10;
                    fNextDouble2 = f12;
                    break;
                case 6:
                    f10 = fDpScale;
                    i10 = iNextDouble;
                    f11 = fNextDouble;
                    f12 = fNextDouble2;
                    cVar.beginArray();
                    int i11 = 0;
                    while (cVar.hasNext()) {
                        a8.f fVar = v.parse(cVar, hVar);
                        if (fVar.getLayerType() == a8.d.f4184c) {
                            i11++;
                        }
                        arrayList.add(fVar);
                        xVar.put(fVar.getId(), fVar);
                        if (i11 > 4) {
                            e8.e.warning("You have " + i11 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    cVar.endArray();
                    iNextDouble = i10;
                    fNextDouble = f11;
                    fDpScale = f10;
                    fNextDouble2 = f12;
                    break;
                case 7:
                    f10 = fDpScale;
                    i10 = iNextDouble;
                    f11 = fNextDouble;
                    f12 = fNextDouble2;
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        ArrayList arrayList3 = new ArrayList();
                        z.x xVar2 = new z.x();
                        cVar.beginObject();
                        String strNextString = null;
                        String strNextString2 = null;
                        String strNextString3 = null;
                        int iNextInt = 0;
                        int iNextInt2 = 0;
                        while (cVar.hasNext()) {
                            int iSelectName = cVar.selectName(f11924b);
                            if (iSelectName == 0) {
                                strNextString = cVar.nextString();
                            } else if (iSelectName == 1) {
                                cVar.beginArray();
                                while (cVar.hasNext()) {
                                    a8.f fVar2 = v.parse(cVar, hVar);
                                    xVar2.put(fVar2.getId(), fVar2);
                                    arrayList3.add(fVar2);
                                }
                                cVar.endArray();
                            } else if (iSelectName == 2) {
                                iNextInt = cVar.nextInt();
                            } else if (iSelectName == 3) {
                                iNextInt2 = cVar.nextInt();
                            } else if (iSelectName == 4) {
                                strNextString2 = cVar.nextString();
                            } else if (iSelectName != 5) {
                                cVar.skipName();
                                cVar.skipValue();
                            } else {
                                strNextString3 = cVar.nextString();
                            }
                        }
                        cVar.endObject();
                        if (strNextString2 != null) {
                            r7.d0 d0Var = new r7.d0(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3);
                            map2.put(d0Var.getId(), d0Var);
                        } else {
                            map.put(strNextString, arrayList3);
                        }
                    }
                    cVar.endArray();
                    iNextDouble = i10;
                    fNextDouble = f11;
                    fDpScale = f10;
                    fNextDouble2 = f12;
                    break;
                case 8:
                    f10 = fDpScale;
                    i10 = iNextDouble;
                    cVar.beginObject();
                    while (cVar.hasNext()) {
                        if (cVar.selectName(f11925c) != 0) {
                            cVar.skipName();
                            cVar.skipValue();
                        } else {
                            cVar.beginArray();
                            while (cVar.hasNext()) {
                                d8.a aVar = n.f11906a;
                                cVar.beginObject();
                                String strNextString4 = null;
                                String strNextString5 = null;
                                String strNextString6 = null;
                                float fNextDouble4 = 0.0f;
                                while (cVar.hasNext()) {
                                    float f15 = fNextDouble;
                                    int iSelectName2 = cVar.selectName(n.f11906a);
                                    if (iSelectName2 != 0) {
                                        float f16 = fNextDouble2;
                                        if (iSelectName2 == 1) {
                                            strNextString5 = cVar.nextString();
                                        } else if (iSelectName2 == 2) {
                                            strNextString6 = cVar.nextString();
                                        } else if (iSelectName2 != 3) {
                                            cVar.skipName();
                                            cVar.skipValue();
                                        } else {
                                            fNextDouble4 = (float) cVar.nextDouble();
                                        }
                                        fNextDouble = f15;
                                        fNextDouble2 = f16;
                                    } else {
                                        strNextString4 = cVar.nextString();
                                        fNextDouble = f15;
                                    }
                                }
                                float f17 = fNextDouble;
                                cVar.endObject();
                                x7.d dVar = new x7.d(strNextString4, strNextString5, strNextString6, fNextDouble4);
                                map3.put(dVar.getName(), dVar);
                                fNextDouble = f17;
                            }
                            cVar.endArray();
                        }
                    }
                    f11 = fNextDouble;
                    f12 = fNextDouble2;
                    cVar.endObject();
                    iNextDouble = i10;
                    fNextDouble = f11;
                    fDpScale = f10;
                    fNextDouble2 = f12;
                    break;
                case 9:
                    f10 = fDpScale;
                    i10 = iNextDouble;
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        d8.a aVar2 = m.f11904a;
                        ArrayList arrayList4 = new ArrayList();
                        cVar.beginObject();
                        double dNextDouble = 0.0d;
                        double dNextDouble2 = 0.0d;
                        String strNextString7 = null;
                        String strNextString8 = null;
                        char cCharAt = 0;
                        while (cVar.hasNext()) {
                            int iSelectName3 = cVar.selectName(m.f11904a);
                            if (iSelectName3 == 0) {
                                cCharAt = cVar.nextString().charAt(0);
                            } else if (iSelectName3 == 1) {
                                dNextDouble = cVar.nextDouble();
                            } else if (iSelectName3 == 2) {
                                dNextDouble2 = cVar.nextDouble();
                            } else if (iSelectName3 == 3) {
                                strNextString7 = cVar.nextString();
                            } else if (iSelectName3 == 4) {
                                strNextString8 = cVar.nextString();
                            } else if (iSelectName3 != 5) {
                                cVar.skipName();
                                cVar.skipValue();
                            } else {
                                cVar.beginObject();
                                while (cVar.hasNext()) {
                                    if (cVar.selectName(m.f11905b) != 0) {
                                        cVar.skipName();
                                        cVar.skipValue();
                                    } else {
                                        cVar.beginArray();
                                        while (cVar.hasNext()) {
                                            arrayList4.add((z7.t) h.a(cVar, hVar));
                                        }
                                        cVar.endArray();
                                    }
                                }
                                cVar.endObject();
                            }
                        }
                        cVar.endObject();
                        x7.e eVar = new x7.e(arrayList4, cCharAt, dNextDouble, dNextDouble2, strNextString7, strNextString8);
                        u1Var.put(eVar.hashCode(), eVar);
                    }
                    cVar.endArray();
                    f11 = fNextDouble;
                    f12 = fNextDouble2;
                    iNextDouble = i10;
                    fNextDouble = f11;
                    fDpScale = f10;
                    fNextDouble2 = f12;
                    break;
                case 10:
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        cVar.beginObject();
                        String strNextString9 = null;
                        float fNextDouble5 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        while (cVar.hasNext()) {
                            int iSelectName4 = cVar.selectName(f11926d);
                            if (iSelectName4 != 0) {
                                f13 = fDpScale;
                                if (iSelectName4 == 1) {
                                    iNextDouble = iNextDouble;
                                    fNextDouble5 = (float) cVar.nextDouble();
                                } else if (iSelectName4 != 2) {
                                    cVar.skipName();
                                    cVar.skipValue();
                                } else {
                                    iNextDouble = iNextDouble;
                                    fNextDouble6 = (float) cVar.nextDouble();
                                }
                            } else {
                                f13 = fDpScale;
                                strNextString9 = cVar.nextString();
                            }
                            fDpScale = f13;
                        }
                        cVar.endObject();
                        arrayList2.add(new x7.i(strNextString9, fNextDouble5, fNextDouble6));
                        iNextDouble = iNextDouble;
                        fDpScale = fDpScale;
                    }
                    f10 = fDpScale;
                    i10 = iNextDouble;
                    cVar.endArray();
                    f11 = fNextDouble;
                    f12 = fNextDouble2;
                    iNextDouble = i10;
                    fNextDouble = f11;
                    fDpScale = f10;
                    fNextDouble2 = f12;
                    break;
                default:
                    cVar.skipName();
                    cVar.skipValue();
                    f10 = fDpScale;
                    i10 = iNextDouble;
                    f11 = fNextDouble;
                    f12 = fNextDouble2;
                    iNextDouble = i10;
                    fNextDouble = f11;
                    fDpScale = f10;
                    fNextDouble2 = f12;
                    break;
            }
        }
        float f18 = fDpScale;
        int i12 = iNextDouble;
        hVar.init(new Rect(0, 0, (int) (iNextDouble2 * f18), (int) (i12 * f18)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, xVar, map, map2, e8.n.dpScale(), u1Var, map3, arrayList2, iNextDouble2, i12);
        return hVar;
    }
}
