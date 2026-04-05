package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi implements roc<Integer> {
    public static final opi jpo = new opi();

    private opi() {
    }

    @Override // com.bytedance.adsdk.jd.my.roc
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public Integer jd(JsonReader jsonReader, float f10) throws IOException {
        return Integer.valueOf(Math.round(jr.jd(jsonReader) * f10));
    }
}
