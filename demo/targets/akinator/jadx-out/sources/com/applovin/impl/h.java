package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f14020a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14021b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14022c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14023d;

    public h(int i10, int i11, int i12, int i13) {
        this.f14020a = i10;
        this.f14021b = i11;
        this.f14022c = i12;
        this.f14023d = i13;
    }

    public boolean a(Object obj) {
        return obj instanceof h;
    }

    public int b() {
        return this.f14022c;
    }

    public int c() {
        return this.f14021b;
    }

    public int d() {
        return this.f14020a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f14020a));
        map.put("air_num", Integer.valueOf(this.f14021b));
        map.put("fsr_num", Integer.valueOf(this.f14022c));
        map.put("fir_num", Integer.valueOf(this.f14023d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a(this) && d() == hVar.d() && c() == hVar.c() && b() == hVar.b() && a() == hVar.a();
    }

    public int hashCode() {
        return a() + ((b() + ((c() + ((d() + 59) * 59)) * 59)) * 59);
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + ")";
    }

    public int a() {
        return this.f14023d;
    }
}
