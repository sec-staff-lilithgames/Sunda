package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import com.bytedance.adsdk.jd.wqx.jd.jr;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class vrc {
    public static com.bytedance.adsdk.jd.wqx.jd.jr jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        String strNextString = null;
        jr.jpo jpoVarJpo = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo2 = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    jdVarJpo2 = cm.jpo(jsonReader, qkVar, false);
                    break;
                case "m":
                    jpoVarJpo = jr.jpo.jpo(jsonReader.nextInt());
                    break;
                case "o":
                    jdVarJpo3 = cm.jpo(jsonReader, qkVar, false);
                    break;
                case "s":
                    jdVarJpo = cm.jpo(jsonReader, qkVar, false);
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
        return new com.bytedance.adsdk.jd.wqx.jd.jr(strNextString, jpoVarJpo, jdVarJpo, jdVarJpo2, jdVarJpo3, zNextBoolean);
    }
}
