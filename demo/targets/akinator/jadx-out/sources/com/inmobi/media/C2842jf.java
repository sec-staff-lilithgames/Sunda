package com.inmobi.media;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.jf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2842jf {

    /* renamed from: a, reason: collision with root package name */
    public final byte f32983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32984b;

    public C2842jf(byte b10, String str) {
        this.f32983a = b10;
        this.f32984b = str;
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            byte b10 = this.f32983a;
            String str = "unknown";
            if (b10 != 0) {
                if (b10 == 1) {
                    str = "static";
                } else if (b10 == 2) {
                    str = "html";
                } else if (b10 == 3) {
                    str = "iframe";
                }
            }
            jSONObject.put("type", str);
            jSONObject.put("content", this.f32984b);
            String string = jSONObject.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        } catch (JSONException e10) {
            List list = C2859kf.f33024h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("kf", "access$getTAG$cp(...)");
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
            return "";
        }
    }
}
