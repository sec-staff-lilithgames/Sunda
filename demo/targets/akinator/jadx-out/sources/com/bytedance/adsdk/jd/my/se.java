package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class se {
    public static com.bytedance.adsdk.jd.jpo.jd.zz jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        return new com.bytedance.adsdk.jd.jpo.jd.zz(qkVar, nmd.jpo(jsonReader, qkVar, com.bytedance.adsdk.jd.jj.jj.jpo(), hx.jpo, jsonReader.peek() == JsonToken.BEGIN_OBJECT, false));
    }
}
