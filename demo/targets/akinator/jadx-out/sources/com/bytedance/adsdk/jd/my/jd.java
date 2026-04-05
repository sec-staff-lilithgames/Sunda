package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static com.bytedance.adsdk.jd.wqx.jpo.ju jd(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.jd.wqx.jpo.jpo jpoVarQk = null;
        com.bytedance.adsdk.jd.wqx.jpo.jpo jpoVarQk2 = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "t":
                    jdVarJpo2 = cm.jpo(jsonReader, qkVar);
                    break;
                case "fc":
                    jpoVarQk = cm.qk(jsonReader, qkVar);
                    break;
                case "sc":
                    jpoVarQk2 = cm.qk(jsonReader, qkVar);
                    break;
                case "sw":
                    jdVarJpo = cm.jpo(jsonReader, qkVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.jd.wqx.jpo.ju(jpoVarQk, jpoVarQk2, jdVarJpo, jdVarJpo2);
    }

    public static com.bytedance.adsdk.jd.wqx.jpo.ju jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.jd.wqx.jpo.ju juVarJd = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("a")) {
                juVarJd = jd(jsonReader, qkVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return juVarJd == null ? new com.bytedance.adsdk.jd.wqx.jpo.ju(null, null, null, null) : juVarJd;
    }
}
