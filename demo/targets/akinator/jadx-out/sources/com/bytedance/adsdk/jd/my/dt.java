package com.bytedance.adsdk.jd.my;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.adsdk.jd.qk;
import com.bytedance.adsdk.jd.wqx.wqx.my;
import com.bytedance.adsdk.jd.yd;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class dt {
    private static List<yd.jpo> cm(JsonReader jsonReader) throws IOException {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                yd.jpo jpoVar = new yd.jpo();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 99) {
                        if (iHashCode != 102) {
                            if (iHashCode != 108) {
                                if (iHashCode != 115) {
                                    if (iHashCode != 3153) {
                                        if (iHashCode != 3449) {
                                            if (iHashCode == 96670 && strNextName.equals("ali")) {
                                                jpoVar.f17607qk = jsonReader.nextString();
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        } else if (strNextName.equals("le")) {
                                            jpoVar.f17605jd = jsonReader.nextInt();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals("bs")) {
                                        jpoVar.f17606jj = jsonReader.nextInt();
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_SDK)) {
                                    jpoVar.my = jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("l")) {
                                jpoVar.jpo = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                            jpoVar.f17604cm = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)) {
                        jpoVar.wqx = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                arrayList.add(jpoVar);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void jd(JsonReader jsonReader, qk.jpo jpoVar) throws IOException {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 3276) {
                        if (iHashCode == 107027 && strNextName.equals("lel")) {
                            jpoVar.f17430qk = wqx(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("fr")) {
                        jpoVar.my = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("el")) {
                    jpoVar.f17429jj = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    public static com.bytedance.adsdk.jd.qk jpo(JsonReader jsonReader) throws JSONException, IOException {
        float f10;
        float fJpo = com.bytedance.adsdk.jd.jj.jj.jpo();
        LongSparseArray<com.bytedance.adsdk.jd.wqx.wqx.my> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.jd.wqx.cm> sparseArray = new SparseArray<>();
        qk.wqx wqxVar = new qk.wqx();
        qk.jpo jpoVar = new qk.jpo();
        qk.jd jdVar = new qk.jd();
        com.bytedance.adsdk.jd.qk qkVar = new com.bytedance.adsdk.jd.qk();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        String strNextString = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        float fNextDouble3 = 0.0f;
        while (jsonReader.hasNext()) {
            float f11 = fNextDouble;
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            char c10 = 65535;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    f10 = fNextDouble3;
                    if (strNextName.equals("assets")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1109732030:
                    f10 = fNextDouble3;
                    if (strNextName.equals("layers")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -865448777:
                    f10 = fNextDouble3;
                    if (strNextName.equals("globalEvent")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 104:
                    f10 = fNextDouble3;
                    if (strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    f10 = fNextDouble3;
                    if (strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    f10 = fNextDouble3;
                    if (strNextName.equals("w")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3208:
                    f10 = fNextDouble3;
                    if (strNextName.equals("dl")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3276:
                    f10 = fNextDouble3;
                    if (strNextName.equals("fr")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3292:
                    f10 = fNextDouble3;
                    if (strNextName.equals("gc")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 3367:
                    f10 = fNextDouble3;
                    if (strNextName.equals("ip")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 3553:
                    f10 = fNextDouble3;
                    if (strNextName.equals("op")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 94623709:
                    f10 = fNextDouble3;
                    if (strNextName.equals("chars")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 97615364:
                    f10 = fNextDouble3;
                    if (strNextName.equals("fonts")) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case 110364485:
                    f10 = fNextDouble3;
                    if (strNextName.equals("timer")) {
                        c10 = '\r';
                        break;
                    }
                    break;
                case 839250809:
                    f10 = fNextDouble3;
                    if (strNextName.equals("markers")) {
                        c10 = 14;
                        break;
                    }
                    break;
                default:
                    f10 = fNextDouble3;
                    break;
            }
            switch (c10) {
                case 0:
                    jpo(jsonReader, qkVar, map, map2);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 1:
                    jpo(jsonReader, qkVar, arrayList, longSparseArray);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 2:
                    jpo(jsonReader, jdVar);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 3:
                    iNextInt = jsonReader.nextInt();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 4:
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.jd.jj.jj.jpo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        qkVar.jpo("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 5:
                    iNextInt2 = jsonReader.nextInt();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 7:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case '\b':
                    jpo(jsonReader, jpoVar);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case '\t':
                    fNextDouble = (float) jsonReader.nextDouble();
                    fNextDouble3 = f10;
                    break;
                case '\n':
                    fNextDouble3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    fNextDouble = f11;
                    break;
                case 11:
                    jpo(jsonReader, qkVar, sparseArray);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case '\f':
                    jpo(jsonReader, map3);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case '\r':
                    jpo(jsonReader, wqxVar);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 14:
                    jpo(jsonReader, arrayList2);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                default:
                    jsonReader.skipValue();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
            }
        }
        jsonReader.endObject();
        qkVar.jpo(new Rect(0, 0, (int) (iNextInt2 * fJpo), (int) (iNextInt * fJpo)), fNextDouble, fNextDouble3, fNextDouble2, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, wqxVar, strNextString, jpoVar, jdVar);
        return qkVar;
    }

    private static JSONArray wqx(JsonReader jsonReader) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3324) {
                        if (iHashCode == 116753 && strNextName.equals("vid")) {
                            try {
                                jSONObject.put("vid", jsonReader.nextString());
                            } catch (JSONException unused) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("hd")) {
                        jSONObject.put("hd", jsonReader.nextInt());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    private static Map<String, Object> jd(JsonReader jsonReader) throws JSONException, IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("lel")) {
                map.put("lel", wqx(jsonReader));
            } else if (!strNextName.equals("lottie_back")) {
                jsonReader.skipValue();
            } else {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (!strNextName2.equals("hd")) {
                        jsonReader.skipValue();
                    } else {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    private static void jpo(JsonReader jsonReader, qk.jd jdVar) throws IOException {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 107027) {
                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                            jdVar.f17426jd = new int[][]{new int[]{-1, -1}};
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                jsonReader.beginArray();
                                for (int i10 = 0; i10 < 2; i10++) {
                                    if (jsonReader.hasNext()) {
                                        jdVar.f17426jd[0][i10] = jsonReader.nextInt();
                                    }
                                }
                                jsonReader.endArray();
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("lel")) {
                        jdVar.wqx = wqx(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("el")) {
                    jdVar.jpo = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void jpo(JsonReader jsonReader, qk.jpo jpoVar) throws IOException {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3139) {
                    if (iHashCode != 3232) {
                        if (iHashCode != 3571) {
                            if (iHashCode != 3666) {
                                if (iHashCode == 98713 && strNextName.equals("cpf")) {
                                    jd(jsonReader, jpoVar);
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("se")) {
                                jpoVar.jpo = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY)) {
                            jpoVar.f17427cm = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("ee")) {
                        jpoVar.wqx = jd(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_BIDEVENT)) {
                    jpoVar.f17428jd = jd(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void jpo(JsonReader jsonReader, qk.wqx wqxVar) throws IOException {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3123) {
                    if (iHashCode != 3239) {
                        if (iHashCode != 3355) {
                            if (iHashCode != 3418) {
                                if (iHashCode != 3704) {
                                    if (iHashCode != 107027) {
                                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                                            wqxVar.my = new int[]{-1, -1};
                                            jsonReader.beginArray();
                                            for (int i10 = 0; i10 < 2; i10++) {
                                                if (jsonReader.hasNext()) {
                                                    wqxVar.my[i10] = jsonReader.nextInt();
                                                }
                                            }
                                            jsonReader.endArray();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals("lel")) {
                                        wqxVar.f17442qk = wqx(jsonReader);
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals("tl")) {
                                    wqxVar.wqx = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals(GalEuEfxjome.CBnIETvRQtatWBT)) {
                                wqxVar.jpo = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("id")) {
                            wqxVar.f17440jd = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("el")) {
                        wqxVar.f17441jj = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("at")) {
                    wqxVar.f17439cm = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar, List<com.bytedance.adsdk.jd.wqx.wqx.my> list, LongSparseArray<com.bytedance.adsdk.jd.wqx.wqx.my> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.jd.wqx.wqx.my myVarJpo = tu.jpo(jsonReader, qkVar);
            myVarJpo.ju();
            my.jpo jpoVar = my.jpo.PRE_COMP;
            list.add(myVarJpo);
            longSparseArray.put(myVarJpo.my(), myVarJpo);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void jpo(android.util.JsonReader r17, com.bytedance.adsdk.jd.qk r18, java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.jd.wqx.wqx.my>> r19, java.util.Map<java.lang.String, com.bytedance.adsdk.jd.yd> r20) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.jd.my.dt.jpo(android.util.JsonReader, com.bytedance.adsdk.jd.qk, java.util.Map, java.util.Map):void");
    }

    private static void jpo(JsonReader jsonReader, Map<String, com.bytedance.adsdk.jd.wqx.wqx> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.jd.wqx.wqx wqxVarJpo = oya.jpo(jsonReader);
                    map.put(wqxVarJpo.jd(), wqxVarJpo);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar, SparseArray<com.bytedance.adsdk.jd.wqx.cm> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.jd.wqx.cm cmVarJpo = au.jpo(jsonReader, qkVar);
            sparseArray.put(cmVarJpo.hashCode(), cmVarJpo);
        }
        jsonReader.endArray();
    }

    private static void jpo(JsonReader jsonReader, List<com.bytedance.adsdk.jd.wqx.jj> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.jd.wqx.jj(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
