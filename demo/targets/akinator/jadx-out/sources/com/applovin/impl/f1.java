package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f13958a;

    public f1(JSONObject jSONObject) {
        this.f13958a = jSONObject;
    }

    public Integer a() {
        return JsonUtils.getInteger(this.f13958a, "dark_mode_toolbar_color", null);
    }

    public String b() {
        return JsonUtils.getString(this.f13958a, "digital_asset_link_url", null);
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f13958a, "instant_apps_enabled", null);
    }

    public String d() {
        return JsonUtils.getString(this.f13958a, "referrer", null);
    }

    public Integer e() {
        return JsonUtils.getInteger(this.f13958a, "session_url_relation", null);
    }

    public Integer f() {
        return JsonUtils.getInteger(this.f13958a, "share_state", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f13958a, "should_show_title", null);
    }

    public Integer h() {
        return JsonUtils.getInteger(this.f13958a, "toolbar_color", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f13958a, "url_bar_hiding_enabled", null);
    }
}
