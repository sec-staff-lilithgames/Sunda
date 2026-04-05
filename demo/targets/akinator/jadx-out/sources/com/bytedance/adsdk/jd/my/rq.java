package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class rq {
    public static <T> List<com.bytedance.adsdk.jd.qk.jpo<T>> jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar, float f10, roc<T> rocVar, boolean z10) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.jd.qk qkVar2;
        float f11;
        roc<T> rocVar2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            qkVar.jpo("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.jd.qk qkVar3 = qkVar;
                    float f12 = f10;
                    roc<T> rocVar3 = rocVar;
                    boolean z12 = z10;
                    com.bytedance.adsdk.jd.qk.jpo jpoVarJpo = nmd.jpo(jsonReader3, qkVar3, f12, rocVar3, false, z12);
                    jsonReader2 = jsonReader3;
                    qkVar2 = qkVar3;
                    f11 = f12;
                    rocVar2 = rocVar3;
                    z11 = z12;
                    arrayList.add(jpoVarJpo);
                } else {
                    jsonReader2 = jsonReader;
                    qkVar2 = qkVar;
                    f11 = f10;
                    rocVar2 = rocVar;
                    z11 = z10;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(nmd.jpo(jsonReader2, qkVar2, f11, rocVar2, true, z11));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                qkVar = qkVar2;
                f10 = f11;
                rocVar = rocVar2;
                z10 = z11;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(nmd.jpo(jsonReader4, qkVar, f10, rocVar, false, z10));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        jpo(arrayList);
        return arrayList;
    }

    public static <T> void jpo(List<? extends com.bytedance.adsdk.jd.qk.jpo<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.bytedance.adsdk.jd.qk.jpo<T> jpoVar = list.get(i11);
            i11++;
            com.bytedance.adsdk.jd.qk.jpo<T> jpoVar2 = list.get(i11);
            jpoVar.f17436qk = Float.valueOf(jpoVar2.f17434jj);
            if (jpoVar.f17433jd == null && (t10 = jpoVar2.jpo) != null) {
                jpoVar.f17433jd = t10;
                if (jpoVar instanceof com.bytedance.adsdk.jd.jpo.jd.zz) {
                    ((com.bytedance.adsdk.jd.jpo.jd.zz) jpoVar).jpo();
                }
            }
        }
        com.bytedance.adsdk.jd.qk.jpo<T> jpoVar3 = list.get(i10);
        if ((jpoVar3.jpo == null || jpoVar3.f17433jd == null) && list.size() > 1) {
            list.remove(jpoVar3);
        }
    }
}
