package com.bytedance.adsdk.jd.my;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.jd.wqx.jd.yd;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class rv {
    public static com.bytedance.adsdk.jd.wqx.jd.yd jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar, int i10) throws IOException {
        boolean zNextBoolean = false;
        boolean z10 = i10 == 3;
        String strNextString = null;
        yd.jpo jpoVarJpo = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo = null;
        com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> auVarJd = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo2 = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo3 = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo4 = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo5 = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo6 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case "p":
                    auVarJd = jpo.jd(jsonReader, qkVar);
                    break;
                case "r":
                    jdVarJpo2 = cm.jpo(jsonReader, qkVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    jdVarJpo3 = cm.jpo(jsonReader, qkVar);
                    break;
                case "is":
                    jdVarJpo5 = cm.jpo(jsonReader, qkVar, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    jdVarJpo4 = cm.jpo(jsonReader, qkVar);
                    break;
                case "os":
                    jdVarJpo6 = cm.jpo(jsonReader, qkVar, false);
                    break;
                case "pt":
                    jdVarJpo = cm.jpo(jsonReader, qkVar, false);
                    break;
                case "sy":
                    jpoVarJpo = yd.jpo.jpo(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.jd.wqx.jd.yd(strNextString, jpoVarJpo, jdVarJpo, auVarJd, jdVarJpo2, jdVarJpo3, jdVarJpo4, jdVarJpo5, jdVarJpo6, zNextBoolean, z10);
    }
}
