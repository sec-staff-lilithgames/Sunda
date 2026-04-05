package com.applovin.impl.sdk.network;

import com.applovin.impl.s4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f15633a;

    /* renamed from: b, reason: collision with root package name */
    private String f15634b;

    /* renamed from: c, reason: collision with root package name */
    private String f15635c;

    /* renamed from: d, reason: collision with root package name */
    private String f15636d;

    /* renamed from: e, reason: collision with root package name */
    private Map f15637e;

    /* renamed from: f, reason: collision with root package name */
    private Map f15638f;

    /* renamed from: g, reason: collision with root package name */
    private Map f15639g;

    /* renamed from: h, reason: collision with root package name */
    private s4.a f15640h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15641i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15642j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15643k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15644l;

    /* renamed from: m, reason: collision with root package name */
    private String f15645m;

    /* renamed from: n, reason: collision with root package name */
    private int f15646n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f15647a;

        /* renamed from: b, reason: collision with root package name */
        private String f15648b;

        /* renamed from: c, reason: collision with root package name */
        private String f15649c;

        /* renamed from: d, reason: collision with root package name */
        private String f15650d;

        /* renamed from: e, reason: collision with root package name */
        private Map f15651e;

        /* renamed from: f, reason: collision with root package name */
        private Map f15652f;

        /* renamed from: g, reason: collision with root package name */
        private Map f15653g;

        /* renamed from: h, reason: collision with root package name */
        private s4.a f15654h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f15655i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f15656j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f15657k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f15658l;

        public b a(String str) {
            this.f15650d = str;
            return this;
        }

        public b b(String str) {
            this.f15647a = str;
            return this;
        }

        public b c(String str) {
            this.f15648b = str;
            return this;
        }

        public b d(String str) {
            this.f15649c = str;
            return this;
        }

        public b a(Map map) {
            this.f15652f = map;
            return this;
        }

        public b b(Map map) {
            this.f15651e = map;
            return this;
        }

        public b c(Map map) {
            this.f15653g = map;
            return this;
        }

        public b d(boolean z10) {
            this.f15657k = z10;
            return this;
        }

        public b a(s4.a aVar) {
            this.f15654h = aVar;
            return this;
        }

        public b b(boolean z10) {
            this.f15658l = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f15656j = z10;
            return this;
        }

        public b a(boolean z10) {
            this.f15655i = z10;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public static b b() {
        return new b();
    }

    public void a() {
        Map map = CollectionUtils.map(this.f15637e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f15637e = map;
    }

    public int c() {
        return this.f15646n;
    }

    public String d() {
        return this.f15636d;
    }

    public String e() {
        return this.f15645m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f15633a.equals(((d) obj).f15633a);
    }

    public s4.a f() {
        return this.f15640h;
    }

    public Map g() {
        return this.f15638f;
    }

    public String h() {
        return this.f15634b;
    }

    public int hashCode() {
        return this.f15633a.hashCode();
    }

    public Map i() {
        return this.f15637e;
    }

    public Map j() {
        return this.f15639g;
    }

    public String k() {
        return this.f15635c;
    }

    public void l() {
        this.f15646n++;
    }

    public boolean m() {
        return this.f15643k;
    }

    public boolean n() {
        return this.f15641i;
    }

    public boolean o() {
        return this.f15642j;
    }

    public boolean p() {
        return this.f15644l;
    }

    public JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f15633a);
        jSONObject.put("communicatorRequestId", this.f15645m);
        jSONObject.put("httpMethod", this.f15634b);
        jSONObject.put("targetUrl", this.f15635c);
        jSONObject.put("backupUrl", this.f15636d);
        jSONObject.put("encodingType", this.f15640h);
        jSONObject.put("isEncodingEnabled", this.f15641i);
        jSONObject.put("gzipBodyEncoding", this.f15642j);
        jSONObject.put("isAllowedPreInitEvent", this.f15643k);
        jSONObject.put("attemptNumber", this.f15646n);
        if (this.f15637e != null) {
            jSONObject.put("parameters", new JSONObject(this.f15637e));
        }
        if (this.f15638f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f15638f));
        }
        if (this.f15639g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f15639g));
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PostbackRequest{uniqueId='");
        sb2.append(this.f15633a);
        sb2.append("', communicatorRequestId='");
        sb2.append(this.f15645m);
        sb2.append("', httpMethod='");
        sb2.append(this.f15634b);
        sb2.append("', targetUrl='");
        sb2.append(this.f15635c);
        sb2.append("', backupUrl='");
        sb2.append(this.f15636d);
        sb2.append("', attemptNumber=");
        sb2.append(this.f15646n);
        sb2.append(", isEncodingEnabled=");
        sb2.append(this.f15641i);
        sb2.append(", isGzipBodyEncoding=");
        sb2.append(this.f15642j);
        sb2.append(", isAllowedPreInitEvent=");
        sb2.append(this.f15643k);
        sb2.append(", shouldFireInWebView=");
        return a.b.p(sb2, this.f15644l, AbstractJsonLexerKt.END_OBJ);
    }

    public d(JSONObject jSONObject, k kVar) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f15633a = string;
        this.f15634b = string3;
        this.f15645m = string2;
        this.f15635c = string4;
        this.f15636d = string5;
        this.f15637e = mapSynchronizedMap;
        this.f15638f = mapSynchronizedMap2;
        this.f15639g = mapSynchronizedMap3;
        this.f15640h = s4.a.a(jSONObject.optInt("encodingType", s4.a.DEFAULT.b()));
        this.f15641i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f15642j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f15643k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f15644l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f15646n = i10;
    }

    private d(b bVar) {
        this.f15633a = UUID.randomUUID().toString();
        this.f15634b = bVar.f15648b;
        this.f15635c = bVar.f15649c;
        this.f15636d = bVar.f15650d;
        this.f15637e = bVar.f15651e;
        this.f15638f = bVar.f15652f;
        this.f15639g = bVar.f15653g;
        this.f15640h = bVar.f15654h;
        this.f15641i = bVar.f15655i;
        this.f15642j = bVar.f15656j;
        this.f15643k = bVar.f15657k;
        this.f15644l = bVar.f15658l;
        this.f15645m = bVar.f15647a;
        this.f15646n = 0;
    }
}
