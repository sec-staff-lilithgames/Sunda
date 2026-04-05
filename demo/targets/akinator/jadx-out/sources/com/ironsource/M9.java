package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class M9 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34844a;

    /* renamed from: b, reason: collision with root package name */
    private String f34845b;

    /* renamed from: c, reason: collision with root package name */
    private String f34846c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34847d;

    /* renamed from: e, reason: collision with root package name */
    private C3267i8 f34848e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, String> f34849f;

    /* renamed from: g, reason: collision with root package name */
    private Ic f34850g;

    /* renamed from: h, reason: collision with root package name */
    private String f34851h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f34852i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f34853j;

    public M9(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, String str3, Map<String, String> map, Ic ic2, C3267i8 c3267i8) {
        this.f34845b = str;
        this.f34846c = str2;
        this.f34844a = z10;
        this.f34847d = z11;
        this.f34849f = map;
        this.f34850g = ic2;
        this.f34848e = c3267i8;
        this.f34852i = z12;
        this.f34853j = z13;
        this.f34851h = str3;
    }

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.f34845b);
        map.put("instanceName", this.f34846c);
        map.put("rewarded", Boolean.toString(this.f34844a));
        map.put("inAppBidding", Boolean.toString(this.f34847d));
        map.put("isOneFlow", Boolean.toString(this.f34852i));
        map.put(C3191e4.f36356r, String.valueOf(2));
        C3267i8 c3267i8 = this.f34848e;
        map.put("width", c3267i8 != null ? Integer.toString(c3267i8.c()) : "0");
        C3267i8 c3267i82 = this.f34848e;
        map.put("height", c3267i82 != null ? Integer.toString(c3267i82.a()) : "0");
        C3267i8 c3267i83 = this.f34848e;
        map.put("label", c3267i83 != null ? c3267i83.b() : "");
        map.put(C3191e4.f36360v, Boolean.toString(i()));
        if (this.f34853j) {
            map.put("isMultipleAdObjects", "true");
        }
        String str = this.f34851h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        Map<String, String> map2 = this.f34849f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public final Ic b() {
        return this.f34850g;
    }

    public String c() {
        return this.f34851h;
    }

    public Map<String, String> d() {
        return this.f34849f;
    }

    public String e() {
        return this.f34845b;
    }

    public String f() {
        return this.f34846c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.f34846c;
    }

    public C3267i8 h() {
        return this.f34848e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.f34847d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.f34853j;
    }

    public boolean m() {
        return this.f34852i;
    }

    public boolean n() {
        return this.f34844a;
    }

    public void a(Ic ic2) {
        this.f34850g = ic2;
    }

    public void a(String str) {
        this.f34851h = str;
    }
}
