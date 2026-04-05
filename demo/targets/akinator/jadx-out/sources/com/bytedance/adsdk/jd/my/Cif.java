package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.adsdk.jd.my.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif implements roc<Float> {
    public static final Cif jpo = new Cif();

    private Cif() {
    }

    @Override // com.bytedance.adsdk.jd.my.roc
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public Float jd(JsonReader jsonReader, float f10) throws IOException {
        return Float.valueOf(jr.jd(jsonReader) * f10);
    }
}
