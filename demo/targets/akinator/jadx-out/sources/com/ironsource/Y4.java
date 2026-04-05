package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Y4 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f35747h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f35748i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f35749j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f35750k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f35751l = -1;

    /* renamed from: a, reason: collision with root package name */
    private String f35752a;

    /* renamed from: b, reason: collision with root package name */
    private String f35753b;

    /* renamed from: c, reason: collision with root package name */
    private int f35754c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f35755d;

    /* renamed from: e, reason: collision with root package name */
    private int f35756e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35757f;

    /* renamed from: g, reason: collision with root package name */
    private M9 f35758g;

    public Y4(String str, String str2, Map<String, String> map, Ic ic2) {
        this.f35754c = -1;
        this.f35753b = str;
        this.f35752a = str2;
        this.f35755d = map;
        this.f35756e = 0;
        this.f35757f = false;
        this.f35758g = null;
    }

    public void a(boolean z10) {
        this.f35757f = z10;
    }

    public synchronized void b(int i10) {
        this.f35756e = i10;
    }

    public M9 c() {
        return this.f35758g;
    }

    public boolean d() {
        return this.f35757f;
    }

    public int e() {
        return this.f35756e;
    }

    public String f() {
        return this.f35752a;
    }

    public Map<String, String> g() {
        return this.f35755d;
    }

    public String h() {
        return this.f35753b;
    }

    public Ic i() {
        if (this.f35758g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.f35754c;
    }

    public boolean k() {
        Map<String, String> map = this.f35755d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.f35755d.get("rewarded"));
    }

    public boolean a(int i10) {
        return this.f35754c == i10;
    }

    public Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("demandSourceId", this.f35753b);
        map.put("demandSourceName", this.f35752a);
        Map<String, String> map2 = this.f35755d;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public void c(int i10) {
        this.f35754c = i10;
    }

    public void a() {
        Map<String, String> map = this.f35755d;
        if (map != null) {
            map.clear();
        }
        this.f35755d = null;
    }

    public Y4(M9 m9) {
        this(m9.e(), m9.g(), m9.a(), m9.b());
        this.f35758g = m9;
    }
}
