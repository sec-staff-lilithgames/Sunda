package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import com.bytedance.adsdk.jd.wqx.jd.Cif;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class sz {
    public static Cif jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo2 = null;
        com.bytedance.adsdk.jd.wqx.jpo.Cif cifJpo = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    jdVarJpo = cm.jpo(jsonReader, qkVar, false);
                    break;
                case "o":
                    jdVarJpo2 = cm.jpo(jsonReader, qkVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    cifJpo = wqx.jpo(jsonReader, qkVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new Cif(strNextString, jdVarJpo, jdVarJpo2, cifJpo, zNextBoolean);
    }
}
