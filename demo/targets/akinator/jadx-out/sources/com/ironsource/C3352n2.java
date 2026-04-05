package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3352n2 {
    public static final String A = "nurl";

    /* renamed from: o, reason: collision with root package name */
    public static final String f37921o = "adMarkup";

    /* renamed from: p, reason: collision with root package name */
    public static final String f37922p = "instance";

    /* renamed from: q, reason: collision with root package name */
    public static final String f37923q = "adData";

    /* renamed from: r, reason: collision with root package name */
    public static final String f37924r = "price";

    /* renamed from: s, reason: collision with root package name */
    public static final String f37925s = "serverData";

    /* renamed from: t, reason: collision with root package name */
    public static final String f37926t = "loadTimeout";

    /* renamed from: u, reason: collision with root package name */
    public static final String f37927u = "order";

    /* renamed from: v, reason: collision with root package name */
    public static final String f37928v = "show";

    /* renamed from: w, reason: collision with root package name */
    public static final String f37929w = "price";

    /* renamed from: x, reason: collision with root package name */
    public static final String f37930x = "notifications";

    /* renamed from: y, reason: collision with root package name */
    public static final String f37931y = "burl";

    /* renamed from: z, reason: collision with root package name */
    public static final String f37932z = "lurl";

    /* renamed from: a, reason: collision with root package name */
    private String f37933a;

    /* renamed from: b, reason: collision with root package name */
    private String f37934b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f37935c;

    /* renamed from: d, reason: collision with root package name */
    private String f37936d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f37937e;

    /* renamed from: f, reason: collision with root package name */
    private int f37938f;

    /* renamed from: g, reason: collision with root package name */
    private int f37939g;

    /* renamed from: h, reason: collision with root package name */
    private int f37940h;

    /* renamed from: i, reason: collision with root package name */
    private final List<String> f37941i;

    /* renamed from: j, reason: collision with root package name */
    private final List<String> f37942j;

    /* renamed from: k, reason: collision with root package name */
    private final List<String> f37943k;

    /* renamed from: l, reason: collision with root package name */
    private Y8 f37944l;

    /* renamed from: m, reason: collision with root package name */
    private Bb f37945m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f37946n;

    public C3352n2(String str) {
        this.f37933a = null;
        this.f37934b = "";
        this.f37935c = null;
        this.f37936d = "";
        this.f37937e = null;
        this.f37938f = -1;
        this.f37939g = -1;
        this.f37940h = -1;
        this.f37941i = new ArrayList();
        this.f37942j = new ArrayList();
        this.f37943k = new ArrayList();
        this.f37944l = null;
        this.f37945m = null;
        this.f37946n = true;
        this.f37933a = str;
    }

    private void a(JSONObject jSONObject, int i10) {
        this.f37938f = i10;
        this.f37939g = i10;
        this.f37940h = i10;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(f37928v, i10);
            this.f37939g = iOptInt;
            this.f37940h = jSONObject.optInt("price", iOptInt);
        }
    }

    public List<String> b() {
        return this.f37941i;
    }

    public String c() {
        return this.f37933a;
    }

    public Bb d() {
        return this.f37945m;
    }

    public int e() {
        return this.f37938f;
    }

    public Integer f() {
        return this.f37937e;
    }

    public List<String> g() {
        return this.f37942j;
    }

    public List<String> h() {
        return this.f37943k;
    }

    public String i() {
        return this.f37936d;
    }

    public int j() {
        return this.f37940h;
    }

    public String k() {
        return this.f37934b;
    }

    public int l() {
        return this.f37939g;
    }

    public boolean m() {
        return this.f37946n;
    }

    public JSONObject a() {
        return this.f37935c;
    }

    public Y8 a(String str) {
        Y8 y82 = this.f37944l;
        if (y82 == null) {
            return null;
        }
        Y8 y83 = new Y8(y82);
        y83.a(com.ironsource.mediationsdk.d.f37331r, str);
        return y83;
    }

    private void a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(C3286ja.b(jSONObject.getJSONArray(str)));
        }
    }

    public C3352n2(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    public C3352n2(JSONObject jSONObject, int i10, JSONObject jSONObject2) throws JSONException {
        this.f37933a = null;
        this.f37934b = "";
        this.f37935c = null;
        this.f37936d = "";
        this.f37937e = null;
        this.f37938f = -1;
        this.f37939g = -1;
        this.f37940h = -1;
        ArrayList arrayList = new ArrayList();
        this.f37941i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f37942j = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f37943k = arrayList3;
        this.f37944l = null;
        this.f37945m = null;
        this.f37946n = true;
        try {
            if (jSONObject.has(f37922p)) {
                this.f37933a = jSONObject.getString(f37922p);
            }
            if (jSONObject.has("adMarkup")) {
                this.f37934b = jSONObject.getString("adMarkup");
            } else if (jSONObject.has(f37925s)) {
                this.f37934b = jSONObject.getJSONObject(f37925s).toString();
            }
            this.f37935c = jSONObject.optJSONObject("adData");
            this.f37936d = jSONObject.optString("price", "0");
            if (jSONObject.has(f37930x)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(f37930x);
                a(jSONObject3, f37931y, arrayList);
                a(jSONObject3, f37932z, arrayList2);
                a(jSONObject3, A, arrayList3);
            }
            this.f37944l = new Y8(C3286ja.a(jSONObject2, jSONObject.optJSONObject(com.ironsource.mediationsdk.d.f37317d)));
            this.f37945m = jSONObject.has(com.ironsource.mediationsdk.d.f37318e) ? Bb.a(jSONObject.getJSONObject(com.ironsource.mediationsdk.d.f37318e)) : null;
            this.f37937e = jSONObject.has(f37926t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(f37926t))) : null;
            a(jSONObject.optJSONObject(f37927u), i10);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            this.f37946n = false;
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
    }
}
