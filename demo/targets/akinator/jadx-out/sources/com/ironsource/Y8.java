package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Y8 {
    public static final String A = "adNetwork";
    public static final String B = "instanceName";
    public static final String C = "instanceId";
    public static final String D = "revenue";
    public static final String E = "precision";
    public static final String F = "encryptedCPM";
    public static final String G = "creativeId";

    /* renamed from: r, reason: collision with root package name */
    public static final String f35786r = "auctionId";

    /* renamed from: s, reason: collision with root package name */
    public static final String f35787s = "adUnit";

    /* renamed from: t, reason: collision with root package name */
    public static final String f35788t = "adFormat";

    /* renamed from: u, reason: collision with root package name */
    public static final String f35789u = "mediationAdUnitName";

    /* renamed from: v, reason: collision with root package name */
    public static final String f35790v = "mediationAdUnitId";

    /* renamed from: w, reason: collision with root package name */
    public static final String f35791w = "country";

    /* renamed from: x, reason: collision with root package name */
    public static final String f35792x = "ab";

    /* renamed from: y, reason: collision with root package name */
    public static final String f35793y = "segmentName";

    /* renamed from: z, reason: collision with root package name */
    public static final String f35794z = "placement";

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f35795a;

    /* renamed from: b, reason: collision with root package name */
    private String f35796b;

    /* renamed from: c, reason: collision with root package name */
    private String f35797c;

    /* renamed from: d, reason: collision with root package name */
    private String f35798d;

    /* renamed from: e, reason: collision with root package name */
    private String f35799e;

    /* renamed from: f, reason: collision with root package name */
    private String f35800f;

    /* renamed from: g, reason: collision with root package name */
    private String f35801g;

    /* renamed from: h, reason: collision with root package name */
    private String f35802h;

    /* renamed from: i, reason: collision with root package name */
    private String f35803i;

    /* renamed from: j, reason: collision with root package name */
    private String f35804j;

    /* renamed from: k, reason: collision with root package name */
    private String f35805k;

    /* renamed from: l, reason: collision with root package name */
    private String f35806l;

    /* renamed from: m, reason: collision with root package name */
    private Double f35807m;

    /* renamed from: n, reason: collision with root package name */
    private String f35808n;

    /* renamed from: o, reason: collision with root package name */
    private String f35809o;

    /* renamed from: p, reason: collision with root package name */
    private String f35810p;

    /* renamed from: q, reason: collision with root package name */
    private DecimalFormat f35811q = new DecimalFormat("#.#####");

    public Y8(JSONObject jSONObject) {
        Double dValueOf = null;
        this.f35796b = null;
        this.f35797c = null;
        this.f35798d = null;
        this.f35799e = null;
        this.f35800f = null;
        this.f35801g = null;
        this.f35802h = null;
        this.f35803i = null;
        this.f35804j = null;
        this.f35805k = null;
        this.f35806l = null;
        this.f35807m = null;
        this.f35808n = null;
        this.f35809o = null;
        this.f35810p = null;
        if (jSONObject != null) {
            try {
                this.f35795a = jSONObject;
                this.f35796b = jSONObject.optString("auctionId", null);
                this.f35797c = jSONObject.optString("mediationAdUnitName", null);
                this.f35798d = jSONObject.optString("mediationAdUnitId", null);
                this.f35799e = jSONObject.optString("adFormat", null);
                this.f35800f = jSONObject.optString("country", null);
                this.f35801g = jSONObject.optString("ab", null);
                this.f35802h = jSONObject.optString("segmentName", null);
                this.f35803i = jSONObject.optString("placement", null);
                this.f35804j = jSONObject.optString("adNetwork", null);
                this.f35805k = jSONObject.optString("instanceName", null);
                this.f35806l = jSONObject.optString("instanceId", null);
                this.f35808n = jSONObject.optString("precision", null);
                this.f35809o = jSONObject.optString("encryptedCPM", null);
                this.f35810p = jSONObject.optString("creativeId", null);
                double dOptDouble = jSONObject.optDouble("revenue");
                if (!Double.isNaN(dOptDouble)) {
                    dValueOf = Double.valueOf(dOptDouble);
                }
                this.f35807m = dValueOf;
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error("error parsing impression " + e10.getMessage());
            }
        }
    }

    public void a(String str, String str2) throws JSONException {
        String str3 = this.f35803i;
        if (str3 != null) {
            String strReplace = str3.replace(str, str2);
            this.f35803i = strReplace;
            JSONObject jSONObject = this.f35795a;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", strReplace);
                } catch (JSONException e10) {
                    C3422r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
    }

    public String b() {
        return this.f35799e;
    }

    public String c() {
        return this.f35804j;
    }

    public JSONObject d() {
        return this.f35795a;
    }

    public String e() {
        return this.f35796b;
    }

    public String f() {
        return this.f35800f;
    }

    public String g() {
        return this.f35810p;
    }

    public String h() {
        return this.f35809o;
    }

    public String i() {
        return this.f35806l;
    }

    public String j() {
        return this.f35805k;
    }

    public String k() {
        return this.f35798d;
    }

    public String l() {
        return this.f35797c;
    }

    public String m() {
        return this.f35803i;
    }

    public String n() {
        return this.f35808n;
    }

    public Double o() {
        return this.f35807m;
    }

    public String p() {
        return this.f35802h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("auctionId: '");
        sb2.append(this.f35796b);
        sb2.append("', mediationAdUnitName: '");
        sb2.append(this.f35797c);
        sb2.append("', mediationAdUnitId: '");
        sb2.append(this.f35798d);
        sb2.append("', adFormat: '");
        sb2.append(this.f35799e);
        sb2.append("', country: '");
        sb2.append(this.f35800f);
        sb2.append("', ab: '");
        sb2.append(this.f35801g);
        sb2.append("', segmentName: '");
        sb2.append(this.f35802h);
        sb2.append("', placement: '");
        sb2.append(this.f35803i);
        sb2.append("', adNetwork: '");
        sb2.append(this.f35804j);
        sb2.append("', instanceName: '");
        sb2.append(this.f35805k);
        sb2.append("', instanceId: '");
        sb2.append(this.f35806l);
        sb2.append("', revenue: ");
        Double d10 = this.f35807m;
        sb2.append(d10 == null ? null : this.f35811q.format(d10));
        sb2.append(", precision: '");
        sb2.append(this.f35808n);
        sb2.append("', encryptedCPM: '");
        sb2.append(this.f35809o);
        sb2.append("', creativeId: '");
        return p0.o2.q(sb2, this.f35810p, '\'');
    }

    public String a() {
        return this.f35801g;
    }

    public Y8(Y8 y82) {
        this.f35796b = null;
        this.f35797c = null;
        this.f35798d = null;
        this.f35799e = null;
        this.f35800f = null;
        this.f35801g = null;
        this.f35802h = null;
        this.f35803i = null;
        this.f35804j = null;
        this.f35805k = null;
        this.f35806l = null;
        this.f35807m = null;
        this.f35808n = null;
        this.f35809o = null;
        this.f35810p = null;
        this.f35795a = y82.f35795a;
        this.f35796b = y82.f35796b;
        this.f35797c = y82.f35797c;
        this.f35798d = y82.f35798d;
        this.f35799e = y82.f35799e;
        this.f35800f = y82.f35800f;
        this.f35801g = y82.f35801g;
        this.f35802h = y82.f35802h;
        this.f35803i = y82.f35803i;
        this.f35804j = y82.f35804j;
        this.f35805k = y82.f35805k;
        this.f35806l = y82.f35806l;
        this.f35808n = y82.f35808n;
        this.f35809o = y82.f35809o;
        this.f35807m = y82.f35807m;
        this.f35810p = y82.f35810p;
    }
}
