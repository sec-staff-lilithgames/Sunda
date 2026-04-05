package com.applovin.impl;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f13916a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13917b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f13918c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13919d;

    public e(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f13917b;
    }

    public Map b() {
        return this.f13918c;
    }

    public String c() {
        return this.f13916a;
    }

    public boolean d() {
        return this.f13919d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdEventPostback{url='");
        sb2.append(this.f13916a);
        sb2.append("', backupUrl='");
        sb2.append(this.f13917b);
        sb2.append("', headers='");
        sb2.append(this.f13918c);
        sb2.append("', shouldFireInWebView='");
        return a.b.q(sb2, this.f13919d, "'}");
    }

    public e(String str, String str2, Map map, boolean z10) {
        this.f13916a = str;
        this.f13917b = str2;
        this.f13918c = map;
        this.f13919d = z10;
    }
}
