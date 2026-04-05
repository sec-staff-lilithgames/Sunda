package com.bytedance.adsdk.jd.my;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class pdm implements roc<PointF> {
    public static final pdm jpo = new pdm();

    private pdm() {
    }

    @Override // com.bytedance.adsdk.jd.my.roc
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public PointF jd(JsonReader jsonReader, float f10) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
            return jr.jd(jsonReader, f10);
        }
        if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
            return jr.jd(jsonReader, f10);
        }
        if (jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(jsonTokenPeek)));
        }
        PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return pointF;
    }
}
