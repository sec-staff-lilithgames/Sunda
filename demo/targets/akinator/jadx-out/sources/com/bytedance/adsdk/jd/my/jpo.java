package com.bytedance.adsdk.jd.my;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> jd(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.jd.wqx.jpo.my myVarJpo = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo = null;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVarJpo2 = null;
        boolean z10 = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "k":
                    myVarJpo = jpo(jsonReader, qkVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        jdVarJpo = cm.jpo(jsonReader, qkVar);
                        break;
                    } else {
                        z10 = true;
                        jsonReader.skipValue();
                        break;
                    }
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        jdVarJpo2 = cm.jpo(jsonReader, qkVar);
                        break;
                    } else {
                        z10 = true;
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z10) {
            qkVar.jpo("Lottie doesn't support expressions.");
        }
        return myVarJpo != null ? myVarJpo : new com.bytedance.adsdk.jd.wqx.jpo.zz(jdVarJpo, jdVarJpo2);
    }

    public static com.bytedance.adsdk.jd.wqx.jpo.my jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(se.jpo(jsonReader, qkVar));
            }
            jsonReader.endArray();
            rq.jpo(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.jd.qk.jpo(jr.jd(jsonReader, com.bytedance.adsdk.jd.jj.jj.jpo())));
        }
        return new com.bytedance.adsdk.jd.wqx.jpo.my(arrayList);
    }
}
