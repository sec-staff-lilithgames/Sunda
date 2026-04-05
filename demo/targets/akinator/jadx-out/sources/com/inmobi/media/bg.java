package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f32694a = new ConcurrentHashMap();

    public final JSONObject a() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.f32694a.entrySet()) {
                jSONObject.put(String.valueOf(Aa.a((EnumC3108za) entry.getKey())), ((ag) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return new JSONObject();
        }
    }
}
