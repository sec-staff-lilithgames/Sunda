package com.bytedance.adsdk.jd.my;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.adsdk.jd.wqx.jpo.Cif;
import com.bytedance.adsdk.jd.wqx.wqx.my;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class tu {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.jd.my.tu$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[my.jd.values().length];
            jpo = iArr;
            try {
                iArr[my.jd.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[my.jd.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.jd.wqx.wqx.my jpo(com.bytedance.adsdk.jd.qk qkVar) {
        Rect rectCm = qkVar.cm();
        List list = Collections.EMPTY_LIST;
        return new com.bytedance.adsdk.jd.wqx.wqx.my(list, qkVar, "__container", -1L, my.jpo.PRE_COMP, -1L, null, list, new Cif(), 0, 0, 0, 0.0f, 0.0f, rectCm.width(), rectCm.height(), null, null, list, my.jd.NONE, null, false, null, null);
    }

    public static com.bytedance.adsdk.jd.wqx.wqx.my jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        Float f10;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        my.jd jdVar = my.jd.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        my.jd jdVar2 = jdVar;
        String strNextString = null;
        Cif cifJpo = null;
        com.bytedance.adsdk.jd.wqx.jpo.yd ydVarJj = null;
        com.bytedance.adsdk.jd.wqx.jpo.ju juVarJpo = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo = null;
        com.bytedance.adsdk.jd.wqx.jd.jpo jpoVarJpo = null;
        yd ydVarJpo = null;
        float fNextDouble = 0.0f;
        float fQk = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        long jNextInt = 0;
        long jNextInt2 = -1;
        int iJpo = 0;
        int iJpo2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        float fNextDouble5 = 1.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        my.jpo jpoVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parent":
                    jNextInt2 = jsonReader.nextInt();
                    break;
                case "shapes":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.jd.wqx.jd.wqx wqxVarJpo = xyk.jpo(jsonReader, qkVar);
                        if (wqxVarJpo != null) {
                            arrayList2.add(wqxVarJpo);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "h":
                    fNextDouble3 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.jd.jj.jj.jpo());
                    break;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                juVarJpo = jd.jpo(jsonReader, qkVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (!strNextName2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                            jsonReader.skipValue();
                        } else {
                            ydVarJj = cm.jj(jsonReader, qkVar);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "w":
                    fNextDouble2 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.jd.jj.jj.jpo());
                    break;
                case "cl":
                    strNextString3 = jsonReader.nextString();
                    break;
                case "ef":
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals("nm")) {
                                arrayList3.add(jsonReader.nextString());
                            } else if (!strNextName3.equals("ty")) {
                                jsonReader.skipValue();
                            } else {
                                int iNextInt = jsonReader.nextInt();
                                if (iNextInt == 29) {
                                    jpoVarJpo = my.jpo(jsonReader, qkVar);
                                } else if (iNextInt == 25) {
                                    ydVarJpo = new ju().jpo(jsonReader, qkVar);
                                }
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    qkVar.jpo("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ip":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    cifJpo = wqx.jpo(jsonReader, qkVar);
                    break;
                case "nm":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "op":
                    fQk = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    iJpo2 = (int) (com.bytedance.adsdk.jd.jj.jj.jpo() * jsonReader.nextInt());
                    break;
                case "sr":
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    iJpo = (int) (com.bytedance.adsdk.jd.jj.jj.jpo() * jsonReader.nextInt());
                    break;
                case "tm":
                    jdVarJpo = cm.jpo(jsonReader, qkVar, false);
                    break;
                case "tt":
                    int iNextInt2 = jsonReader.nextInt();
                    if (iNextInt2 >= my.jd.values().length) {
                        qkVar.jpo("Unsupported matte type: ".concat(String.valueOf(iNextInt2)));
                        break;
                    } else {
                        jdVar2 = my.jd.values()[iNextInt2];
                        int i10 = AnonymousClass1.jpo[jdVar2.ordinal()];
                        if (i10 == 1) {
                            qkVar.jpo("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            qkVar.jpo("Unsupported matte type: Luma Inverted");
                        }
                        qkVar.jpo(1);
                        break;
                    }
                case "ty":
                    int iNextInt3 = jsonReader.nextInt();
                    jpoVar = my.jpo.UNKNOWN;
                    if (iNextInt3 >= jpoVar.ordinal()) {
                        break;
                    } else {
                        jpoVar = my.jpo.values()[iNextInt3];
                        break;
                    }
                case "ind":
                    jNextInt = jsonReader.nextInt();
                    break;
                case "refId":
                    strNextString = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(hmu.jpo(jsonReader, qkVar));
                    }
                    qkVar.jpo(arrayList.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            f10 = fValueOf;
            arrayList4.add(new com.bytedance.adsdk.jd.qk.jpo(qkVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble)));
        } else {
            f10 = fValueOf;
        }
        if (fQk <= 0.0f) {
            fQk = qkVar.qk();
        }
        arrayList4.add(new com.bytedance.adsdk.jd.qk.jpo(qkVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(fQk)));
        arrayList4.add(new com.bytedance.adsdk.jd.qk.jpo(qkVar, f10, f10, null, fQk, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            qkVar.jpo("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.jd.wqx.wqx.my(arrayList2, qkVar, strNextString2, jNextInt, jpoVar, jNextInt2, strNextString, arrayList, cifJpo, iJpo, iJpo2, color, fNextDouble5, fNextDouble4, fNextDouble2, fNextDouble3, ydVarJj, juVarJpo, arrayList4, jdVar2, jdVarJpo, zNextBoolean, jpoVarJpo, ydVarJpo);
    }
}
