package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.e9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C2752e9 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f32813f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f32814a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32815b;

    /* renamed from: c, reason: collision with root package name */
    public Map f32816c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32817d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f32818e;

    public C2752e9(String url, int i10, String eventType, HashMap map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter("url_ping", "trackerType");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        this.f32814a = i10;
        this.f32815b = eventType;
        this.f32816c = map;
        int length = url.length() - 1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) url.charAt(!z10 ? i11 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i11++;
            } else {
                z10 = true;
            }
        }
        this.f32817d = S7.a(length, 1, url, i11);
    }

    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "url_ping");
            jSONObject.put("url", this.f32817d);
            jSONObject.put("eventType", this.f32815b);
            jSONObject.put("eventId", this.f32814a);
            boolean z10 = C2736da.f32781a;
            Map map = this.f32816c;
            if (map == null) {
                map = new HashMap();
            }
            jSONObject.put("extras", C2736da.a(",", map));
            String string = jSONObject.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        } catch (JSONException e10) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("e9", "TAG");
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
            return "";
        }
    }
}
