package com.bytedance.adsdk.jd.my;

import android.graphics.PointF;
import android.util.JsonReader;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.adsdk.jd.wqx.jd;
import cv.BLca.YsiBvdpw;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class zz implements roc<com.bytedance.adsdk.jd.wqx.jd> {
    public static final zz jpo = new zz();

    private zz() {
    }

    @Override // com.bytedance.adsdk.jd.my.roc
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.jd.wqx.jd jd(JsonReader jsonReader, float f10) throws IOException {
        jd.jpo jpoVar = jd.jpo.CENTER;
        jsonReader.beginObject();
        jd.jpo jpoVar2 = jpoVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iJpo = 0;
        int iJpo2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            char c10 = 65535;
            switch (strNextName.hashCode()) {
                case 102:
                    if (strNextName.equals(YsiBvdpw.asyZrTrDQwG)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 106:
                    if (strNextName.equals("j")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 115:
                    if (strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_SDK)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3261:
                    if (strNextName.equals("fc")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3452:
                    if (strNextName.equals("lh")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3463:
                    if (strNextName.equals("ls")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3543:
                    if (strNextName.equals("of")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3587:
                    if (strNextName.equals("ps")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 3664:
                    if (strNextName.equals("sc")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 3684:
                    if (strNextName.equals("sw")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 3687:
                    if (strNextName.equals("sz")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 3710:
                    if (strNextName.equals("tr")) {
                        c10 = '\f';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 1:
                    int iNextInt2 = jsonReader.nextInt();
                    jpoVar2 = jd.jpo.CENTER;
                    if (iNextInt2 <= jpoVar2.ordinal() && iNextInt2 >= 0) {
                        jpoVar2 = jd.jpo.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case 2:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    strNextString = jsonReader.nextString();
                    break;
                case 4:
                    iJpo = jr.jpo(jsonReader);
                    break;
                case 5:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case '\b':
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case '\t':
                    iJpo2 = jr.jpo(jsonReader);
                    break;
                case '\n':
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case 11:
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case '\f':
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.jd.wqx.jd(strNextString, strNextString2, fNextDouble, jpoVar2, iNextInt, fNextDouble2, fNextDouble3, iJpo, iJpo2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
