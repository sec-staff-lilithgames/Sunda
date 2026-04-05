package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class my {
    private static com.bytedance.adsdk.jd.wqx.jd.jpo jd(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.jd.wqx.jd.jpo jpoVar = null;
        while (true) {
            boolean z10 = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION)) {
                    if (z10) {
                        jpoVar = new com.bytedance.adsdk.jd.wqx.jd.jpo(cm.jpo(jsonReader, qkVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (!strNextName.equals("ty")) {
                    jsonReader.skipValue();
                } else if (jsonReader.nextInt() == 0) {
                    z10 = true;
                }
            }
            jsonReader.endObject();
            return jpoVar;
        }
    }

    public static com.bytedance.adsdk.jd.wqx.jd.jpo jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        com.bytedance.adsdk.jd.wqx.jd.jpo jpoVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.jd.wqx.jd.jpo jpoVarJd = jd(jsonReader, qkVar);
                    if (jpoVarJd != null) {
                        jpoVar = jpoVarJd;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return jpoVar;
    }
}
