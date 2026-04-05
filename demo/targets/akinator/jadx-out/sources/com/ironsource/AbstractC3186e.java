package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC3186e {

    /* renamed from: a, reason: collision with root package name */
    private final String f36320a = "eventId";

    /* renamed from: b, reason: collision with root package name */
    private final String f36321b = "timestamp";

    /* renamed from: c, reason: collision with root package name */
    private final String f36322c = "InterstitialEvents";

    /* renamed from: d, reason: collision with root package name */
    private final String f36323d = "events";

    /* renamed from: e, reason: collision with root package name */
    private final String f36324e = "events";

    /* renamed from: f, reason: collision with root package name */
    JSONObject f36325f;

    /* renamed from: g, reason: collision with root package name */
    int f36326g;

    /* renamed from: h, reason: collision with root package name */
    private String f36327h;

    private String a(int i10) {
        return i10 != 2 ? "events" : "InterstitialEvents";
    }

    public abstract String a();

    public abstract String a(ArrayList<C5> arrayList, JSONObject jSONObject);

    public String b() {
        return TextUtils.isEmpty(this.f36327h) ? a() : this.f36327h;
    }

    public abstract String c();

    public JSONObject a(C5 c52) throws JSONException {
        JSONObject jSONObject;
        try {
            String strA = c52.a();
            if (!TextUtils.isEmpty(strA)) {
                jSONObject = new JSONObject(strA);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("eventId", c52.c());
            jSONObject.put("timestamp", c52.d());
            return jSONObject;
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public String a(JSONArray jSONArray) throws JSONException {
        try {
            if (this.f36325f == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f36325f.toString());
            jSONObject.put("timestamp", IronSourceUtils.e());
            jSONObject.put(a(this.f36326g), jSONArray);
            return jSONObject.toString();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    public void a(String str) {
        this.f36327h = str;
    }
}
