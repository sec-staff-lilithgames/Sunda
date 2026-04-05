package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f14833a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14834b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f14835c;

    /* renamed from: d, reason: collision with root package name */
    private final o f14836d;

    /* renamed from: e, reason: collision with root package name */
    private final List f14837e;

    public n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.f14833a = JsonUtils.getString(jSONObject, "name", "");
        this.f14834b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f14835c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArrayT = b0.e2.t(jSONObject, "waterfalls");
        this.f14837e = new ArrayList(jSONArrayT.length());
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayT, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f14837e.add(new o(jSONObject2, map, this.f14835c, kVar));
            }
        }
        this.f14836d = this.f14837e.isEmpty() ? null : (o) this.f14837e.get(0);
    }

    public MaxAdFormat a() {
        return this.f14835c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f14835c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f14833a;
    }

    public String d() {
        return this.f14834b;
    }

    public String e() {
        return "\n---------- " + this.f14834b + " ----------\nIdentifier - " + this.f14833a + "\nFormat     - " + b();
    }

    public o f() {
        return this.f14836d;
    }

    public List g() {
        return this.f14837e;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.f14834b.compareToIgnoreCase(nVar.f14834b);
    }
}
