package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import com.bytedance.adsdk.jd.wqx.jd.zz;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class nq {
    public static com.bytedance.adsdk.jd.wqx.jd.zz jpo(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        zz.jpo jpoVarJpo = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    jpoVarJpo = zz.jpo.jpo(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.jd.wqx.jd.zz(strNextString, jpoVarJpo, zNextBoolean);
    }
}
