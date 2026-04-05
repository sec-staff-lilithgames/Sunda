package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ra, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2972ra extends C2752e9 {

    /* renamed from: g, reason: collision with root package name */
    public final String f33314g;

    /* renamed from: h, reason: collision with root package name */
    public final String f33315h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2972ra(String vendorKey, String str, String url, HashMap map) {
        super(url, 0, "OMID_VIEWABILITY", map);
        kotlin.jvm.internal.e0.checkNotNullParameter(vendorKey, "vendorKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter("OMID_VIEWABILITY", "eventType");
        this.f33315h = vendorKey;
        this.f33314g = str;
    }

    @Override // com.inmobi.media.C2752e9
    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "url_ping");
            jSONObject.put("url", this.f32817d);
            jSONObject.put("eventType", this.f32815b);
            jSONObject.put("eventId", this.f32814a);
            if (D2.a(this.f33315h)) {
                jSONObject.put("vendorKey", this.f33315h);
            }
            if (D2.a(this.f33314g)) {
                jSONObject.put("verificationParams", this.f33314g);
            }
            Map map = this.f32816c;
            boolean z10 = C2736da.f32781a;
            if (map == null) {
                map = new HashMap();
            }
            jSONObject.put("extras", C2736da.a(",", map));
            String string = jSONObject.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        } catch (JSONException e10) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("ra", "TAG");
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
            return "";
        }
    }
}
