package com.bytedance.adsdk.jd.my;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class duq {
    public static com.bytedance.adsdk.jd.wqx.jd.prr jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        com.bytedance.adsdk.jd.wqx.jpo.cm cmVar = null;
        String strNextString = null;
        com.bytedance.adsdk.jd.wqx.jpo.jpo jpoVarQk = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    jpoVarQk = cm.qk(jsonReader, qkVar);
                    break;
                case "o":
                    cmVar = cm.jd(jsonReader, qkVar);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (cmVar == null) {
            cmVar = new com.bytedance.adsdk.jd.wqx.jpo.cm(Collections.singletonList(new com.bytedance.adsdk.jd.qk.jpo(100)));
        }
        return new com.bytedance.adsdk.jd.wqx.jd.prr(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, jpoVarQk, cmVar, zNextBoolean2);
    }
}
