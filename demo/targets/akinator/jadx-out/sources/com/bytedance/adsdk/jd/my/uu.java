package com.bytedance.adsdk.jd.my;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class uu {
    public static com.bytedance.adsdk.jd.wqx.jd.ju jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> auVarJd = null;
        com.bytedance.adsdk.jd.wqx.jpo.jj jjVarWqx = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "p":
                    auVarJd = jpo.jd(jsonReader, qkVar);
                    break;
                case "r":
                    jdVarJpo = cm.jpo(jsonReader, qkVar);
                    break;
                case "s":
                    jjVarWqx = cm.wqx(jsonReader, qkVar);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.jd.wqx.jd.ju(strNextString, auVarJd, jjVarWqx, jdVarJpo, zNextBoolean);
    }
}
