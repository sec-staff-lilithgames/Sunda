package com.bytedance.adsdk.jd.my;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class jj {
    public static com.bytedance.adsdk.jd.wqx.jd.jd jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar, int i10) throws IOException {
        boolean z10 = i10 == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> auVarJd = null;
        com.bytedance.adsdk.jd.wqx.jpo.jj jjVarWqx = null;
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
        return new com.bytedance.adsdk.jd.wqx.jd.jd(strNextString, auVarJd, jjVarWqx, z10, zNextBoolean);
    }
}
