package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ef implements roc<com.bytedance.adsdk.jd.qk.wqx> {
    public static final ef jpo = new ef();

    private ef() {
    }

    @Override // com.bytedance.adsdk.jd.my.roc
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.jd.qk.wqx jd(JsonReader jsonReader, float f10) throws IOException {
        boolean z10 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z10) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z10) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.jd.qk.wqx((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}
