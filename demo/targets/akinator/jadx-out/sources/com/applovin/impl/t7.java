package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class t7 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    private a f15756a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f15757b;

    /* renamed from: c, reason: collision with root package name */
    private String f15758c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private t7() {
    }

    public static t7 a(m8 m8Var, t7 t7Var, com.applovin.impl.sdk.k kVar) {
        if (m8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (t7Var == null) {
            try {
                t7Var = new t7();
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastNonVideoResource", "Error occurred while initializing", th2);
                }
                kVar.E().a("VastNonVideoResource", th2);
                return null;
            }
        }
        if (t7Var.f15757b == null && !StringUtils.isValidString(t7Var.f15758c)) {
            String strA = a(m8Var, "StaticResource");
            if (URLUtil.isValidUrl(strA)) {
                t7Var.f15757b = Uri.parse(strA);
                t7Var.f15756a = a.STATIC;
                return t7Var;
            }
            String strA2 = a(m8Var, "IFrameResource");
            if (StringUtils.isValidString(strA2)) {
                t7Var.f15756a = a.IFRAME;
                if (URLUtil.isValidUrl(strA2)) {
                    t7Var.f15757b = Uri.parse(strA2);
                    return t7Var;
                }
                t7Var.f15758c = strA2;
                return t7Var;
            }
            String strA3 = a(m8Var, "HTMLResource");
            if (StringUtils.isValidString(strA3)) {
                t7Var.f15756a = a.HTML;
                if (URLUtil.isValidUrl(strA3)) {
                    t7Var.f15757b = Uri.parse(strA3);
                    return t7Var;
                }
                t7Var.f15758c = strA3;
            }
        }
        return t7Var;
    }

    public String b() {
        return this.f15758c;
    }

    public Uri c() {
        return this.f15757b;
    }

    public a d() {
        return this.f15756a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        if (this.f15756a != t7Var.f15756a) {
            return false;
        }
        Uri uri = this.f15757b;
        if (uri == null ? t7Var.f15757b != null : !uri.equals(t7Var.f15757b)) {
            return false;
        }
        String str = this.f15758c;
        String str2 = t7Var.f15758c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.f15756a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f15757b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f15758c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastNonVideoResource{type=");
        sb2.append(this.f15756a);
        sb2.append(", resourceUri=");
        sb2.append(this.f15757b);
        sb2.append(", resourceContents='");
        return j1.o2.o(sb2, this.f15758c, "'}");
    }

    private static String a(m8 m8Var, String str) {
        m8 m8VarC = m8Var.c(str);
        if (m8VarC != null) {
            return m8VarC.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.f15757b = uri;
    }

    public void a(String str) {
        this.f15758c = str;
    }

    public static t7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a aVarValueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri uri = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        t7 t7Var = new t7();
        t7Var.f15756a = aVarValueOf;
        t7Var.f15757b = uri;
        t7Var.f15758c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return t7Var;
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f15756a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.f15757b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.f15758c);
        return jSONObject;
    }
}
