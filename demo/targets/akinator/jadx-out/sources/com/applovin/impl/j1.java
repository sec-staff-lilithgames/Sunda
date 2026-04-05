package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14162a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14163b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14164c;

    public j1(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f14162a = JsonUtils.getString(jSONObject, "name", "");
        this.f14163b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f14164c = k7.a(list);
        } else {
            this.f14164c = k7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f14163b;
    }

    public String b() {
        return this.f14162a;
    }

    public boolean c() {
        return this.f14164c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || k7.a(str2, str) != 1) {
            return str3 == null || k7.a(str3, str) != -1;
        }
        return false;
    }
}
