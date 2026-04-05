package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.adsdk.jd.wqx.jpo.jd f17402cm;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.adsdk.jd.wqx.jpo.jd f17403jd;
    private com.bytedance.adsdk.jd.wqx.jpo.jpo jpo;
    private com.bytedance.adsdk.jd.wqx.jpo.jd my;
    private com.bytedance.adsdk.jd.wqx.jpo.jd wqx;

    private void jd(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION)) {
                strNextString.getClass();
                switch (strNextString) {
                    case "Distance":
                        this.f17402cm = cm.jpo(jsonReader, qkVar);
                        break;
                    case "Opacity":
                        this.f17403jd = cm.jpo(jsonReader, qkVar, false);
                        break;
                    case "Direction":
                        this.wqx = cm.jpo(jsonReader, qkVar, false);
                        break;
                    case "Shadow Color":
                        this.jpo = cm.qk(jsonReader, qkVar);
                        break;
                    case "Softness":
                        this.my = cm.jpo(jsonReader, qkVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    public yd jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVar;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVar2;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVar3;
        com.bytedance.adsdk.jd.wqx.jpo.jd jdVar4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jd(jsonReader, qkVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.jd.wqx.jpo.jpo jpoVar = this.jpo;
        if (jpoVar == null || (jdVar = this.f17403jd) == null || (jdVar2 = this.wqx) == null || (jdVar3 = this.f17402cm) == null || (jdVar4 = this.my) == null) {
            return null;
        }
        return new yd(jpoVar, jdVar, jdVar2, jdVar3, jdVar4);
    }
}
